Feature: Verify if the user is able to Purchase a product


Scenario: 1 Verify if the user is able to Purchase a product using "standard_user" id
    Given the user navigate to the home page
    And the user login with "standard_user" username and "secret_sauce" password
    And the user should see "Products" text on the page
    When the user add Sauce Labs Backpack to the cart
    And the user clicks on the cart button
    And the user should see the "Sauce Labs Backpack" in the cart
    And the user clicks on checkout
    And the user Enters "Dipali" in FirstName, "Gupta" in LastName and "AB3 CD4" in PostCode
    And the user clicks on Continue
    And the user should see "Shipping Information" text on the page
    Then the user click on Finish button
    And the user should see "Thank you for your order!" text on the page


    Scenario: 2 Verify if the user is able to Purchase a product with no Last name
        Given the user navigate to the home page
        And the user login with "standard_user" username and "secret_sauce" password
        And the user should see "Products" text on the page
        When the user add Sauce Labs Backpack to the cart
        And the user clicks on the cart button
        And the user should see the "Sauce Labs Backpack" in the cart
        And the user clicks on checkout
        And the user Enters "Dipali" in FirstName, "" in LastName and "AB3 CD4" in PostCode
        And the user clicks on Continue
        And the user should see "Error: Last Name is required" text on the page

    @smokeTest
    Scenario: 3 Verify if the user is able to purchase after adding to cart using the image

        Given the user navigate to the home page
        And the user login with "standard_user" username and "secret_sauce" password
        And the user should see "Products" text on the page
        When the user clicks on the Sauce Labs Backpack image
        And the user clicks on the Add to Cart Button
        And the user clicks on the cart button
        Then the user should see the "Sauce Labs Backpack" in the cart
        And the user clicks on checkout
        And the user Enters "Dipali" in FirstName, "Gupta" in LastName and "AB3 CD4" in PostCode
        And the user clicks on Continue
        And the user should see "Shipping Information" text on the page
        Then the user click on Finish button
        And the user should see "Thank you for your order!" text on the page