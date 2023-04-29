//package StepDefinitions;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//public class S1_RegisterStep extends Base {
//
//    S1_RegisterStep(WebDriver driver) {
//        super(driver);
//    }
//
//    @Before
//    public static void driverSetup() {
//        WebDriverManager.firefoxdriver().setup();
//        driver = new FirefoxDriver();
//        driver.manage().window().maximize();
//        driver.get("https://demo.nopcommerce.com/");
//    }
//
//    @When("user enters {string} in the first name and {string} in the last name")
//    public void user_enters_in_the_first_name_and_in_the_last_name(String string, String string2) {
//
//        driver.findElement(By.linkText("Register")).click();
//
//    }
//    @When("user enters {string} in the email address")
//    public void user_enters_in_the_email_address(String string) {
//
//    }
//
//
//
//}
