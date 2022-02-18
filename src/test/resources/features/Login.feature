Feature: Login Functionality

  Scenario: Login with valid credentials with Login button
    Given User navigates to login page
    When User enters username "Employee131" and password "Employee123"
    And User clicks the login button
    Then User should be able to launch "Dashboard"
    And User should be able to see his or her name "Employee131" under profile icon

  Scenario: Login with valid credentials by pressing Enter
    Given User navigates to login page
    When User enters username "Employee131" and password "Employee123"
    And User press enter button
    Then User should be able to launch "Dashboard"
    And User should be able to see his or her name "Employee131" under profile icon
