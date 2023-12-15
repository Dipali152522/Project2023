package pageObjects;

import browserControl.WebConnector;

public class BasicAuthPageObj extends WebConnector {

    /*************** Locators *****************/

    private String clickOnBasicAuth = "//a[@href='/basic_auth']";



    /*************** Getters & Setters ******************/

    /**
     * Click on Basic Auth link
     */

    public void setClickOnBasicAuth () {
        BasePage.findElementByXpath(10,clickOnBasicAuth).click();
    }

}
