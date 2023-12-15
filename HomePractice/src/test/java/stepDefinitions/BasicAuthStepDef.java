package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.BasicAuthPageObj;

import java.time.Duration;

public class BasicAuthStepDef extends WebConnector {

    BasicAuthPageObj basicAuthPage = new BasicAuthPageObj();

    @When("the user enters {string} in username field and {string} in password field")
    public void the_user_enters_in_username_field_and_in_password_field(String username, String password) {
       driver.get("https://"+username+":"+password+" @the-internet.herokuapp.com/basic_auth");
    }
    @Then("the user should be able to see {string} text on the page")
    public void the_user_should_be_able_to_see_text_on_the_page(String expectedText) {
        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
        String actualText = alert.getText();
        Assert.assertEquals(expectedText, actualText);
    }

}
