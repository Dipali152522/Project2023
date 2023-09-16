package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.AddToCartObjects;

public class AddToCartStepDefinition extends WebConnector {

AddToCartObjects AddToCartPage = new AddToCartObjects();

    @When("the user add Sauce Labs Backpack to the cart")
    public void the_user_add_sauce_labs_backpack_to_the_cart() {
        AddToCartPage.clickBackPackCart();
    }

    @When("the user clicks on the cart button")
    public void the_user_clicks_on_the_cart_button() {
        AddToCartPage.clickAddToCartButton();
    }

    @Then("the user should see the {string} in the cart")
    public void the_user_should_see_the_in_the_cart(String expectedText) {
        Assert.assertTrue(driver.getPageSource().contains(expectedText));

    }

    @When("the user clicks on the Sauce Labs Backpack image")
    public void the_user_clicks_on_the_sauce_labs_backpack_image() {
        AddToCartPage.clickBackpackImage();
    }
    @When("the user clicks on the Add to Cart Button")
    public void the_user_clicks_on_the_add_to_cart_button() {
        AddToCartPage.clickAddToCartImage();
    }

}
