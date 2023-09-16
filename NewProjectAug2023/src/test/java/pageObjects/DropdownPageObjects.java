package pageObjects;

import browserControl.WebConnector;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownPageObjects extends WebConnector {

    /************** Locators ****************/

private String dropdownXpath = "//select[@class='product_sort_container']";




    /************* Getters and Setters *********************/

    public void setDropdownXpath(String option){
        WebElement dropdown= BasePage.findElementByXpath(10,dropdownXpath);
        Select select = new Select(dropdown);
        select.selectByVisibleText(option);
    }

    public String getDropdownXpath() {
        return BasePage.findElementByXpath(10,dropdownXpath).getText();
    }

}