package StepDefinitions;

import java.sql.Driver;

public class Register extends Base {

    public static void main(String[] args) {
        DriverSetUp();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
    }

}
