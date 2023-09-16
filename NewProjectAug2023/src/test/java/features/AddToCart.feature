Feature: Verify Add to Cart

  Background:
Given the user navigate to the home page
And the user login with "standard_user" username and "secret_sauce" password
And the user should see "Products" text on the page


  Scenario: 1 Verify if the user is able to add Sauce Labs Backpack to cart

  When the user add Sauce Labs Backpack to the cart
  And the user clicks on the cart button
  Then the user should see the "Sauce Labs Backpack" in the cart


Scenario: 2 Verify if the user add Sauce Labs backpack to cart using the image

  When the user clicks on the Sauce Labs Backpack image
  And the user clicks on the Add to Cart Button
  And the user clicks on the cart button
  Then the user should see the "Sauce Labs Backpack" in the cart