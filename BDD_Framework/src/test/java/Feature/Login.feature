Feature: Checking Login Functionality of the Application

  Scenario: Checking Login functionality with valid Login Credentials
  Given User is on Login Page
    Then User enters username in username textfield
    Then User enters password in password textfield
    Then User clicks on login button
    Then User is on Home Page