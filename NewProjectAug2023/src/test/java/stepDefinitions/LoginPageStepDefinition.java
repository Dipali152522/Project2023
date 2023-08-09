package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.LoginPageObjects;
import utilities.ConstantUtils;

public class LoginPageStepDefinition extends WebConnector {

    LoginPageObjects LoginPage = new LoginPageObjects();

    @Given("the user navigate to the home page")
    public void the_user_navigate_to_the_home_page() {
        driver.get(ConstantUtils.BASE_URL);
    }

    @When("the user enters {string} in username field")
    public void the_user_enters_in_username_field(String username) {
        LoginPage.setUsername(username);
    }

    @When("the user enters {string} in password field")
    public void the_user_enters_in_password_field(String password) {
        LoginPage.setPassword(password);
    }

    @When("the user clicks on the login button")
    public void the_user_clicks_on_the_login_button() {
        LoginPage.clickLogin();
    }

    @Then("the user should see {string} text on the page")
    public void the_user_should_see_text_on_the_page(String expectedText) {
        Assert.assertTrue(driver.getPageSource().contains(expectedText));

    }

    @When("the user login with {string} username and {string} password")
    public void the_user_login_with_username_and_password(String username, String password) {
        LoginPage.setUsername(username);
        LoginPage.setPassword(password);
        LoginPage.clickLogin();


    }
}
