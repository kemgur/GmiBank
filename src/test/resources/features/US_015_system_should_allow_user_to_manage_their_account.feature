Feature: US_015 System should allow user to manage their account

  Background: Login and going through customer's accounts
    Given User on the home page
    And User navigates to login page
    Then User provides "<usernames>"
    Then User provides "<passwords>"
    Then User clicks Sign in button


  Scenario Outline:TC_001, TC_002 User should see all account types and balance populated
    And User navigates to My accounts page
    And User should see his-her Account types

    Examples: Valid Username and Passwords
      | usernames   | passwords   |
      | e_username1 | e_password1 |
      | e_username2 | e_password2 |

  Scenario: