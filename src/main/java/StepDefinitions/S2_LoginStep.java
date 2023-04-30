package StepDefinitions;
import DriverUtil.Driver;
import DriverUtil.DriverManager;
import Pages.HomePage;
import Pages.Login;
import Pages.Registation;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class S2_LoginStep {
    Login loginPage;
    @Before
    public void init(){
        Driver.initDriver();
    }
    @After
    public void tear(){
        Driver.tearDown();
    }

    @Given("we are on the homepage")
    public void we_are_on_the_homepage() {

        DriverManager.getDriver().get("https://demo.nopcommerce.com/");

    }
    @When("we click on the login button")
    public void we_click_on_the_login_button() throws InterruptedException {
        loginPage = new Login();
        loginPage.clkLogin();
    }
    @Then("we navigate to the loginpage")
    public void we_navigate_to_the_loginpage() {
        System.out.println("Navigated");
    }

}
