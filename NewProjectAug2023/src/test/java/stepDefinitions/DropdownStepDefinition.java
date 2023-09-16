package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DropdownPageObjects;

public class DropdownStepDefinition extends WebConnector {

    private DropdownPageObjects dropdownPage = new DropdownPageObjects();



    @When("the user selects {string} option from the dropdown list")
    public void the_user_selects_option_from_the_dropdown_list(String option) {
        dropdownPage.setDropdownXpath(option);
    }
    @Then("the user should see {string} option is selected in the dropdown list")
    public void the_user_should_see_option_is_selected_in_the_dropdown_list(String option) {
        String actualText = dropdownPage.getDropdownXpath();
    }




    }

