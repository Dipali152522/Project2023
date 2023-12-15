package pageObjects;

import browserControl.WebConnector;

public class AddRemovePageObj extends WebConnector {


    /************** Locators ****************/

    private String clickOnAddRemoveElements = "//a[@href='/add_remove_elements/']";

    private String clickOnAddElement = "//button[@onclick='addElement()']";

    private String clickOnDelete = "//button[@onclick='deleteElement()']";




    /************* Getters and Setters *********************/

/**
 * Click on Add/Remove link
 */

public void setClickOnAddRemoveElements() {
    BasePage.findElementByXpath(10,clickOnAddRemoveElements).click();
}

/**
 * Click on Add Element link
 */

public void setClickOnAddElement() {
    BasePage.findElementByXpath(10,clickOnAddElement).click();
}

/**
 * Click on Delete element
 */

public void setClickOnDelete() { BasePage.findElementByXpath(10,clickOnDelete).click(); }
}
