Feature: Checking Functionality of the Login Page of OrangeHRM Website
  Scenario: Checking Login functionality with valid Login Credentials
    Given User is on Login Page
    When User enters username and password in user and pass field
    Then User clicks on login button
    And User is on Home Page

