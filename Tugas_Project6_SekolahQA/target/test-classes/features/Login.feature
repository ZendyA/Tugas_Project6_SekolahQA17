@Login
Feature: Login in OrangeHRM website


  @PositiveCase @Test1
  Scenario: Login with Admin account
    Given I already at OrangeHRM Landing page
    When I input valid Username And Password
    And I click login button
    Then I will directed to dashboard page

  @NegativeCase
  Scenario Outline: Login with random account
    Given I already at OrangeHRM Landing page
    When I input <username> and <password>
    And I click login button
    Then Error message will show up
    Examples:
    |username|  |password|
    |ajkjdfdj|  |dfggnkfg|

  @NegativeCase1
  Scenario Outline: Login with blank username
    Given I already at OrangeHRM Landing page
    When I input <username> and <password>
    And I click login button
    Then Show error required username
    Examples:
      |username|  |password|
      |        |  |fghfghgf|

  @NegativeCase2
  Scenario Outline: Login with blank password
    Given I already at OrangeHRM Landing page
    When I input <username> and <password>
    And I click login button
    Then Show error message required password
    Examples:
      |username|  |password|
      |ajkjdfdj|  |        |