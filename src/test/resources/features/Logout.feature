Feature: Logout functionality

  Background:
    Given User navigates to login page
    When User enters username "Employee131" and password "Employee123"
    And User clicks the login button
  @SYMU-986 @wip
  Scenario:  User can logout and end up login page
    When User clicks on profile icon
    And User clicks the logout button
    Then User should end up in the login page
  @SYMU-988 @wip
  Scenario: User cannot go back to Dashboard after logged out
    When User clicks on profile icon
    And User clicks the logout button
    Then User should end up in the login page
    And User navigates back to Dashboard
    Then User should not be able to go back Dashboard again