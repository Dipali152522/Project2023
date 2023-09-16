Feature: Verify dropdown feature operations


Background:
Given the user navigate to the home page
When the user login with "standard_user" username and "secret_sauce" password



Scenario Outline: Verify that the user can select an option from the dropdown list

When the user selects "<option>" option from the dropdown list
Then the user should see "<option>" option is selected in the dropdown list

Examples:
| option   |
| Name (A to Z)|
| Name (Z to A)|
| Price (low to high) |
| Price (high to low) |