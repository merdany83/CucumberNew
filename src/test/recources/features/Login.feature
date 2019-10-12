@VYT-4121
Feature: Login
  As user I want to login under different roles

  @storemanagerLogin
  Scenario: Login as a store manager
    Given user is on the landing page
     Then user logs in as a store manager
      And user verifies that "Dashboard" page name should be displayed
     Then user quits

  @negative
  Scenario: Verify warning message for invalid credentials
    Given user is on the landing page
    Then user logs in with "wrong" username and "wrong" password
    And user verifies that "Invalid user name or password." warning message is dislpayed
    Then user quits
  #  Then user navigates to the "Activities" tab and "Calendar Events"

