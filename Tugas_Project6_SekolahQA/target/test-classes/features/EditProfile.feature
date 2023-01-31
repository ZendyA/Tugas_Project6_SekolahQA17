@EditProfile
Feature: Edit Profile at OrangeHRM website

@PositiveCase @Test3
Scenario: I want to edit nationality, marital status and gender on "my info" menu
  Given I am already login with valid account
  When I click my info menu
  And I select Nationality, marital status and gender option
  And I click save button on my info page
  Then profile is successfully updated and show pop up messsages