package StepDefinitions;
import Utils.ExcelUtil;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class DataTableStep {

    @Given("Read excel value")
    public void read_excel_value(DataTable dataTable) throws IOException {
        List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
        String sheetName = list.get(0).get("SheetName");
        int rowNumber = Integer.parseInt(list.get(0).get("RowNumber"));
        int columnNumber = Integer.parseInt(list.get(0).get("ColumnNumber"));

        String path = "C:\\Users\\dhana\\Downloads\\Book1.xlsx";
        String cellData = ExcelUtil.getCellData(path,sheetName, rowNumber, columnNumber );
//        System.out.println(cellData);

        for (int i = 1; i <= 4; i++) {
            String s = String.valueOf(i);

            List<String> firstName = ExcelUtil.getDataBasedOnValue(path, sheetName, "s", 0, 1, 1 );
            System.out.println(firstName);

            List<String> lastName = ExcelUtil.getDataBasedOnValue(path, sheetName, "s", 0, 2, 1 );
            System.out.println(lastName);

            List<String> email = ExcelUtil.getDataBasedOnValue(path, sheetName, "s", 0, 3, 1 );
            System.out.println(email);

            List<String> password = ExcelUtil.getDataBasedOnValue(path, sheetName, "s", 0, 4, 1 );
            System.out.println(password);

            List<String> confPassword = ExcelUtil.getDataBasedOnValue(path, sheetName, "s", 0, 5, 1 );
            System.out.println(confPassword);

        }

    }

    @Given("read excel value based on value {string} , {string}")
    public void read_excel_value_based_on_value(String sheetName, String testCaseNumber) throws IOException {
        String path = "C:\\Users\\dhana\\Downloads\\Book2.xlsx";

        List<String> firstName = ExcelUtil.getDataBasedOnValue(path, sheetName, testCaseNumber, 0, 1, 1 );
        System.out.println(firstName);

        System.out.println(firstName.get(0));

        List<String> lastName = ExcelUtil.getDataBasedOnValue(path, sheetName, testCaseNumber, 0, 2, 1 );
        System.out.println(lastName);

        List<String> email = ExcelUtil.getDataBasedOnValue(path, sheetName, testCaseNumber, 0, 3, 1 );
        System.out.println(email);

        List<String> password = ExcelUtil.getDataBasedOnValue(path, sheetName, testCaseNumber, 0, 4, 1 );
        System.out.println(password);

        List<String> confPassword = ExcelUtil.getDataBasedOnValue(path, sheetName, testCaseNumber, 0, 5, 1 );
        System.out.println(confPassword);



    }









    @Given("I am on homepage")
    public void i_am_on_homepage(DataTable dataTable) {
        List<String> name = dataTable.asList(String.class);
        String str1 = name.get(0);
        System.out.println(str1);

    }
    @When("I give the data")
    public void i_give_the_data(DataTable dataTable) {
        List<Map<String, String>> name1 = dataTable.asMaps(String.class, String.class);
        String firstName = name1.get(0).get("firstname");
        System.out.println(firstName);

        String lastName = name1.get(0).get("lastname");
        System.out.println(lastName);

        String eMail = name1.get(0).get("email");
        System.out.println(eMail);
    }
    @Then("the test passes")
    public void the_test_passes() {
    }


}
