Feature: Verify working of the Add Remove link


    Scenario: 1 Verify the user is able to Add

      Given the user navigate to the home page
      And the user follows the  "Add/Remove Elements" link
      When the user clicks on Add Element

  Scenario: 2 Verify the user is able to Delete

    Given the user navigate to the home page
    And the user follows the  "Add/Remove Elements" link
    When the user clicks on Add Element
    When the user clicks on Add Element
    When the user clicks on Add Element
    Then the user clicks on Delete Element

