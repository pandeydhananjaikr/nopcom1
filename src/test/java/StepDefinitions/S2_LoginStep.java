package StepDefinitions;

import DriverUtil.Driver;
import DriverUtil.DriverManager;
import Pages.HomePage;
import Pages.Login;
import Pages.Registation;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class S2_LoginStep {
    Login loginPage;
    HomePage homePage;
    WebDriver driver;

    @Given("we are on loginPage")
    public void we_are_on_loginPage() throws InterruptedException {
        driver = DriverManager.getDriver();
        driver.get("https://demo.nopcommerce.com/");
        homePage = new HomePage();
        homePage.clkLogin();
        loginPage = new Login();
    }

    @When("we enter the right {string} and {string}")
    public void we_enter_the_right_and(String email, String password) throws InterruptedException {
        Thread.sleep(2000);
        loginPage.insertEmail(email);
        loginPage.insertPass(password);
    }

    @When("we click on the login button")
    public void we_click_on_the_login_button() throws InterruptedException {
        Thread.sleep(2000);
        loginPage.clickLogin();
    }

    @Then("We see the log out button on the page")
    public void we_see_the_log_out_button_on_the_page() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue("Login is not successful",loginPage.logoutExists());
    }
}
