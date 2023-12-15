Feature: Verify working of the Basic Auth link

@smokeTest
  Scenario: 1 Verify the user is able to click on Basic auth link

    Given the user navigate to the home page
    And the user follows the  "Basic Auth" link
    When the user enters "admin" in username field and "admin" in password field
    Then the user should be able to see "Congratulations" text on the page
