package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.BuyAProductObjects;

public class BuyAProductStep extends WebConnector {
    BuyAProductObjects buyPage = new BuyAProductObjects();

    @When("the user clicks on checkout")
    public void the_user_clicks_on_checkout() {
        buyPage.clickCheckout();
    }

    @When("the user Enters {string} in FirstName, {string} in LastName and {string} in PostCode")
    public void the_user_enters_in_firstname_in_lastname_and_in_postcode(String FirstName, String LastName, String PostCode) {
        buyPage.setFirstName(FirstName);
        buyPage.setLastName(LastName);
        buyPage.setPostCode(PostCode);
    }



    @When("the user clicks on Continue")
    public void the_user_clicks_on_continue() {
        buyPage.clickContinue();
    }

    @Then("the user click on Finish button")
    public void the_user_click_on_finish_button() {
        buyPage.clickFinish();
    }
}

