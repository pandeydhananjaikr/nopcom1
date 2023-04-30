package StepDefinitions;
import DriverUtil.Driver;
import DriverUtil.DriverManager;
import Pages.HomePage;
import Pages.Registation;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.junit.Assert;


public class S1_RegisterStep  {
    HomePage homePage;
    Registation regPage;

    @Before
    public void init(){
        Driver.initDriver();
    }
    @After
    public void tear(){
        Driver.tearDown();
    }

    @Given("We are on registerpage")
    public void we_are_on_registerpage() {
        DriverManager.getDriver().get("https://demo.nopcommerce.com/");
        homePage = new HomePage();
        homePage.clkRegister();
    }
    @When("user enters {string} in the first name and {string} in the last name")
    public void user_enters_in_the_first_name_and_in_the_last_name(String string, String string2) throws InterruptedException {
        regPage = new Registation();
        Thread.sleep(2000);
        regPage.InsertName(string,string2);
    }
//    @When("user enters {string}, {string} and {string}")
//    public void user_enters_and(String string, String string2, String string3) throws InterruptedException {
//        Thread.sleep(2000);
//        regPage.dob(string,string2,string3);

//    }
    @When("user enters {string} in the email address")
    public void user_enters_in_the_email_address(String string) throws InterruptedException {
        Thread.sleep(2000);
        regPage.insertEmail(string);
    }
    @When("user enters {string} in password and confirmpassword")
    public void user_enters_in_password_and_confirmpassword(String string) throws InterruptedException {
        Thread.sleep(2000);
        regPage.InsertPass(string);
    }
    @Then("the user is registered and successfully and the message {string} appears")
    public void the_user_is_registered_and_successfully_and_the_message_appears(String string) throws InterruptedException {
        Thread.sleep(2000);
        regPage.clkRegister();
        Thread.sleep(3000);
        String expected = string;
        String actual = DriverManager.getDriver().findElement(By.className("result")).getText();
        Assert.assertTrue("Registration is Successful",expected.contains(actual));
    }

    @Then("error message for invalid data appears")
    public void error_message_for_invalid_data_appears() {


    }

    @Then("error message for empty field appears")
    public void error_message_for_empty_field_appears() {

    }

    @Then("error message for existing email appears")
    public void error_message_for_existing_email_appears() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
