package Utils;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ExcelUtil {
    static WebDriver driver;
    public ExcelUtil(WebDriver driver){
        ExcelUtil.driver = driver;
        PageFactory.initElements(driver, null);
    }
    public static FileInputStream fis ;
    public static FileOutputStream fos;
    public static XSSFWorkbook workbook;
    public static XSSFSheet sheet;
    public static XSSFRow row;
    public static XSSFCell cell;
    public static int getRowCount(String excelFIle, String excelSheet) throws IOException {
        fis = new FileInputStream(excelFIle);
        workbook = new XSSFWorkbook(fis);
        sheet = workbook.getSheet(excelSheet);
        int rowCount = sheet.getPhysicalNumberOfRows();
        workbook.close();
        fis.close();
        return rowCount;
    }
    public static int getCellCount(String excelFIle, String excelSheet, int rowNumber) throws IOException {
        fis = new FileInputStream(excelFIle);
        workbook = new XSSFWorkbook(fis);
        sheet = workbook.getSheet(excelSheet);
        row = sheet.getRow(rowNumber);
        int cellCount = row.getLastCellNum();
        workbook.close();
        fis.close();
        return cellCount;
    }
    public static String getCellData(String excelFIle, String excelSheet, int rowNumber, int colNumber) throws IOException {
        fis = new FileInputStream(excelFIle);
        workbook = new XSSFWorkbook(fis);
        sheet = workbook.getSheet(excelSheet);
        row = sheet.getRow(rowNumber);
        if (row!=null){
            cell = row.getCell(colNumber);
        }
        String data = "";
        try{
            DataFormatter formatter = new DataFormatter();
            String cellData = formatter.formatCellValue(cell);
            return cellData;
        } catch (Exception e){
            data = "";
        }
        workbook.close();
        fis.close();
        return data;
    }
    public static List<String> getDataBasedOnValue(String excelPath, String sheetName, String refValue,
                                                      int valueCol, int expectedCol, int startRowNumber )
                                                        throws IOException {
        Map<String, List<String>> map = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        int rowCount = ExcelUtil.getRowCount(excelPath, sheetName);
        List<String> list = new ArrayList<>();
        for (int i = startRowNumber; i <rowCount ; i++) {
            String key = ExcelUtil.getCellData(excelPath, sheetName, i, valueCol);
            String value = ExcelUtil.getCellData(excelPath, sheetName, i, expectedCol);

            if (map.containsKey(key)){
                list = map.get(key);
                list.add(value);
                map.put(key,list);
            }
            else {
                list = new ArrayList<>();
                list.add(value);
                map.put(key, list);
            }
        }
        if (map.containsKey(refValue)){
            list = map.get(refValue);
        }
        else {
            System.out.println("data not found");
        }
        return list;
    }
}