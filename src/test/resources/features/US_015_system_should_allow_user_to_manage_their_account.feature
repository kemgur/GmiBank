Feature: US_015 System should allow user to manage their account

  Background: Login and going through customer's accounts
    Given User on the home page
    And User navigates to login page
    Then User provides "e_username1" username
    Then User provides "e_password1" password
    Then User clicks Sign in button


  Scenario:TC_001 User should see all account types and balance populated
    And User navigates to My accounts page
    And User should see his-her Account types


  Scenario:TC_002 User can view transaction
    And User navigates to My accounts page
    And User click view Transaction button
    Then User should see his-her Accounts transactions