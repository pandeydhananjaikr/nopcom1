package StepDefinitions;
import DriverUtil.Driver;
import DriverUtil.DriverManager;
import Pages.Login;
import io.cucumber.java.en.*;

public class S2_LoginStep {

    @Given("we are on the homepage")
    public void we_are_on_the_homepage() {
        Driver.initDriver();
    }
    @When("we click on the login button")
    public void we_click_on_the_login_button() throws InterruptedException {
        Login loginpage = new Login();
        loginpage.clkLogin();

    }
    @Then("we navigate to the loginpage")
    public void we_navigate_to_the_loginpage() {
        System.out.println("Navigated");
    }

}
