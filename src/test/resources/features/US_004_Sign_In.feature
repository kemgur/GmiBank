@SignIn
Feature: Feature: US_004_Login_page_should_accessible_with_valid_credentials

  Background:Abc
    Given User on the home page "GMIBANK_Url"
    Then User clicks on login dropdown button
    Then  User clicks on HomeSign In button
#@rwip
  Scenario: TC_002 When valid data is entered in the username textbox, and password textbox it should be able to login successfully..
    Then User clicks on username textbox
    Then User enter valid "r_username"
    Then User clicks on password textbox
    And User enter valid "r_password"
    Then User clicks on Sign in button

  Scenario: TC_003 There should be an option to cancel login
    Then User clicks on username textbox
    Then User enter valid "r_username"
    Then User clicks on password textbox
    And User enter valid "r_password"
    Then User clicks on Cancel button

  @rwip
  Scenario: TC_004 The user should be able to see the "Admin Admin" text after logging in with valid data.
    Then User clicks on username textbox
    Then User enter valid "r_username"
    Then User clicks on password textbox
    And  User enter valid "r_password"
    Then User clicks on Sign in button
    And User should be able to see the Admin Admin text