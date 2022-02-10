Feature: Checking Functionality of the Login Page of OrangeHRM Website
  Scenario Outline: Checking Login functionality with valid Login Credentials
    Given User is on Login Page
    When User enters "<username>" and "<password>"
    Then User clicks on login button
    And User is on Home Page
    Examples:
      | username | password |
      | ad       | ad123    |
      | admin    | admin123 |

