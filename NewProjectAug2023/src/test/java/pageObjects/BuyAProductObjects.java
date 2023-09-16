package pageObjects;

import browserControl.WebConnector;

public class BuyAProductObjects extends WebConnector {
    /************** Locators ****************/

    private String CheckoutButtonXpath = "//button[@id='checkout']";
    private String FirstNameXpath = "//input[@placeholder='First Name']";
    private String LastNameXPath = "//input[@placeholder='Last Name']";
    private String PostCodeXpath = "//input[@placeholder='Zip/Postal Code']";
    private String ContinueButtonXpath = "//input[@type='submit']";
    private String FinishButtonXpath = "//button[@id='finish']";



    /************* Getters and Setters *********************/

    /**
     * Click Checkout Button
     */
public void clickCheckout() {BasePage.findElementByXpath(100,CheckoutButtonXpath).click();}

    /**
     * Set First Name
     */
public void setFirstName(String FirstName){BasePage.findElementByXpath(100,FirstNameXpath).sendKeys(FirstName);}

    /**
     * Set Last Name
     */

    public void setLastName(String LastName){BasePage.findElementByXpath(100,LastNameXPath).sendKeys(LastName);}

    /**
     * Set PostCode
     */
    public void setPostCode(String PostCode){BasePage.findElementByXpath(100,PostCodeXpath).sendKeys(PostCode);}

    /**
     * Click Continue Button
     */
    public void clickContinue(){BasePage.findElementByXpath(100,ContinueButtonXpath).click();}

    /**
     * Clicks on Finish Button
     */
    public void clickFinish(){BasePage.findElementByXpath(100,FinishButtonXpath).click();}

}
