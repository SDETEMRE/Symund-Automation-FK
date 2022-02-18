Feature: Login Functionality
    As a user, I should be able to login

  Scenario: Login with valid credentials with Login button
    Given User navigates to login page
    When User enters username "Employee131" and password "Employee123"
    And User clicks the login button
    Then User should be able to launch Dashboard and see his/her name under profile icon

  Scenario: Login with valid credentials by pressing Enter
    Given User navigates to login page
    When User enters username "Employee131" and password "Employee123"
    And User clicks the login button
    Then User should be able to launch Dashboard and see his/her name under profile icon

  Scenario: Login with