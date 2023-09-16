package pageObjects;

import browserControl.WebConnector;

public class AddToCartObjects extends WebConnector {

/************** Locators ****************/

private String BackpackCartButtonXpath = "//button[@id='add-to-cart-sauce-labs-backpack']";

private String AddToCartButtonXpath = "//a[@class='shopping_cart_link']";

private String BackpackImageButtonXpath = "//img[@alt='Sauce Labs Backpack']";
private String AddToCartImageButtonXpath = "//button[@class='btn btn_primary btn_small btn_inventory']";


/************* Getters and Setters *********************/

    /**
     * Click on Add to Cart for the Sauce Labs Backpack
     */
    public void clickBackPackCart() {BasePage.findElementByXpath(10,BackpackCartButtonXpath).click();}

    /**
     * Click on Cart Button on the page
     */

    public void clickAddToCartButton() {BasePage.findElementByXpath(10,AddToCartButtonXpath).click();}

    /**
     * Click on the Backpack image
     */

    public void clickBackpackImage() {BasePage.findElementByXpath(10,BackpackImageButtonXpath).click();}

    /**
     * Click on the Add to Cart on the Product image page
     */
    public void clickAddToCartImage() {BasePage.findElementByXpath(10,AddToCartImageButtonXpath).click();}
}
