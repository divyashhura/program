Feature: Checking Functionality of the Home Page of OrangeHRM Website
   Scenario: User is on Home Page
     When User clicks on PIM tag
     When User clicks on Add Employee tag
     Then User enters firstname and lastname in the fields
     Then User enters username and password
     And User clicks on save button
