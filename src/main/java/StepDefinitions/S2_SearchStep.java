package StepDefinitions;

import DriverUtil.DriverManager;
import Pages.HomePage;
import Pages.SearchPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class S2_SearchStep {

    WebDriver driver;
    HomePage homePage = new HomePage();
    @When("we are on the homePage")
    public void we_are_on_the_home_page() {
        driver = DriverManager.getDriver();
        driver.get("https://demo.nopcommerce.com/");
    }
    @When("we insert an {string} name in the search field and click the search button")
    public void we_insert_an_name_in_the_search_field_and_click_the_search_button(String item) {
        homePage.SearchItem(item);
    }
    @Then("we are taken to the results page")
    public void we_are_taken_to_the_results_page() {
    SearchPage searchPage = new SearchPage();

    }
    @Then("we validate the results")
    public void we_validate_the_results() {



    }

}
