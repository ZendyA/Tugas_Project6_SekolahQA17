@AddNewEmployee
Feature: Add new employee in OrangeHRM website

  @PositiveCase @Test4
  Scenario: Add New Employee in OrangeHRM website
    Given I already logged in OrangeHRM website
    When I click PIM button
    And I clicked add button
    And I fill firstname, middlename, and lastname
    And I click switch button
    And I fill new account
    Then I click save button on Page