package pageObjects;

import browserControl.WebConnector;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPageObjects extends WebConnector {

    /************** Locators ****************/

    private String usernameFieldXpath = "//input[@id='user-name']";
    private String passwordFieldXpath = "//input[@id='password']";
    private String loginButtonXpath = "//input[@id='login-button']";


    /************* Getters and Setters *********************/

    /**Set Username field
     * @param username
     */

    public void setUsername(String username) {
        BasePage.findElementByXpath(10,usernameFieldXpath). sendKeys(username);
        }

    /**
     * Set Password field
     * @param password
     */
    public void setPassword(String password) {

        BasePage.findElementByXpath(10,passwordFieldXpath).sendKeys(password);
    }

    public void clickLogin() {
        BasePage.findElementByXpath(10,loginButtonXpath).click();
    }
}
