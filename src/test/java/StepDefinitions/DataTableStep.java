package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class DataTableStep {

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
