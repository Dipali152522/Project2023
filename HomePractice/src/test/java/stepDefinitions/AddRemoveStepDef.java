package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.AddRemovePageObj;
import utilities.ConstantUtils;

import java.time.Duration;

public class AddRemoveStepDef extends WebConnector {

    AddRemovePageObj addRemovePage = new AddRemovePageObj();

    @Given("the user navigate to the home page")
    public void the_user_navigate_to_the_home_page() {

            driver.get(ConstantUtils.BASE_URL);

    }
    @Given("the user follows the  {string} link")
    public void the_user_follows_the_link(String linkText) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.linkText(linkText))).click();
    }
    @When("the user clicks on Add Element")
    public void the_user_clicks_on_add_element() {
        addRemovePage.setClickOnAddElement();
    }

    @Then("the user clicks on Delete Element")
    public void the_user_clicks_on_delete_element() {
        addRemovePage.setClickOnDelete();
    }
}
