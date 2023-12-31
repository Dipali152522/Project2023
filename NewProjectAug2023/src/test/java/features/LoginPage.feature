Feature: Verify Login for "Username"

  Scenario : 1. Verify Login page for username
    Given the user navigate to the home page
    When the user enters "standard_user" in username field
    And the user enters "secret_sauce" in password field
    And the user clicks on the login button
    Then the user should see "Products" text on the page

  Scenario: 2. Verify Login page for username Standard_User

    Given the user navigate to the home page
    When the user login with "standard_user" username and "secret_sauce" password
    Then the user should see "Products" text on the page


Scenario Outline: 3. Verify Login Page with data driven

    Given the user navigate to the home page
    When the user login with "<username>" username and "<password>" password
    Then the user should see "<expectedData>" text on the page

    Examples:
      | username | password             | expectedData              |
      | standard_user | secret_sauce | Products                 |
      | standard_user | Secret-sauce | Epic sadface: Username and password do not match any user in this service |
      | locked_out_user | secret_sauce | Epic sadface: Sorry, this user has been locked out |
      | locked_out_user | secret-sauce | Epic sadface: Username and password do not match any user in this service |
      | locked-out-user | secret_sauce | Epic sadface: Username and password do not match any user in this service |
