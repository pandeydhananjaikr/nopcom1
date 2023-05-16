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







}
