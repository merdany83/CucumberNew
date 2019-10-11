Feature: As user I want to login under different roles

  Scenario: Login test(negative)
    Given Open Vytrack login page
    When Enter valid username and invalid password
    And Click login
    Then Message Invalid user name or password.should be displayed
    And Page title and url shuold be same
