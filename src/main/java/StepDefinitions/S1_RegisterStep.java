//package StepDefinitions;
//import DriverUtil.DriverManager;
//import Pages.HomePage;
//import Pages.Registation;
//import io.cucumber.java.en.*;
//import org.openqa.selenium.By;
//import org.junit.Assert;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//public class S1_RegisterStep  {
//    WebDriver driver  ;
//    HomePage homePage;
//    Registation regPage;
//
//    @Given("We are on registerpage")
//    public void we_are_on_registerpage() {
//        driver = DriverManager.getDriver();
//        driver.get("https://demo.nopcommerce.com/");
//        homePage = new HomePage();
//        homePage.clkRegister();
//    }
//    @When("user enters {string} in the first name and {string} in the last name")
//    public void user_enters_in_the_first_name_and_in_the_last_name(String string, String string2) throws InterruptedException {
//        regPage = new Registation();
//        Thread.sleep(2000);
//        regPage.InsertName(string,string2);
//    }
//    @When("user enters {string}, {string} and {string}")
//    public void user_enters_and(String string, String string2, String string3) throws InterruptedException {
//        Thread.sleep(2000);
//        regPage.dob(string,string2,string3);
//
//    }
//    @When("user enters {string} in the email address")
//    public void user_enters_in_the_email_address(String string) throws InterruptedException {
//        Thread.sleep(2000);
//        regPage.insertEmail(string);
//    }
//    @When("user enters {string} in password")
//    public void user_enters_in_password(String string) throws InterruptedException {
//        Thread.sleep(2000);
//        regPage.InsertPass(string);
//    }
//    @When("user enters {string} in confirm password")
//    public void user_enters_in_confirm_password(String string) {
//        regPage.insertConfPass(string);
//    }
//
//    @Then("the user is registered and successfully and the message {string} appears")
//    public void the_user_is_registered_and_successfully_and_the_message_appears(String string) throws InterruptedException {
//        Thread.sleep(2000);
//        regPage.clkRegister();
//        Thread.sleep(3000);
//        String expected = string;
//        String actual = driver.findElement(By.className("result")).getText();
//        Assert.assertTrue("Registration is Successful",expected.contains(actual));
//    }
//
//
//        String expectedEmail = "Wrong email";
//        String expectedPassword = "Password must meet the following rules:";
//        String expectedConfirmPassword = "The password and confirmation password do not match.";
//
//    @Then("error message for invalid email appears")
//    public void error_message_for_invalid_email_appears() {
//
//        try {
//            String actualEmail = driver.findElement(By.id("Email-error")).getText();
//            Assert.assertTrue("Error in Email", expectedEmail.equalsIgnoreCase(actualEmail));
//        } catch (NoSuchElementException e) {
//            System.out.println("Exception in Email");
//        }
//    }
//
//    @Then("error message for invalid password appears")
//    public void error_message_for_invalid_password_appears() {
//        try {
//            String actualPassword = driver.findElement(By.xpath("//span/p")).getText();
//            Assert.assertTrue("Error in Password", expectedPassword.equalsIgnoreCase(actualPassword));
//        } catch (NoSuchElementException e1) {
//            System.out.println("Exception in Password");
//
//        }
//    }
//
//    @Then("error message for password mismatch appears")
//    public void error_message_for_password_mismatch_appears() {
//
//            try {
//                String actualConfirmPassword = driver.findElement(By.xpath("//*[@id=\"ConfirmPassword-error\"]")).getText();
//                Assert.assertTrue("Error in Password Confirmation", expectedConfirmPassword.equalsIgnoreCase(actualConfirmPassword));
//            } catch (NoSuchElementException e2) {
//                System.out.println("Exception in Confirm Password");
//            }
//        }
//
//    @Then("error message for empty field appears")
//    public void error_message_for_empty_field_appears() {
//
//    }
//
//    @Then("error message for existing email appears")
//    public void error_message_for_existing_email_appears() {
//
//    }
//}
