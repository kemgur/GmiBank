Feature: US_002_system_shouldnt_allow_anyone_to_register_with_invalid_credentials


  Scenario: TC_001 Any field on the registration page should not be left blank
    Given User on the login page
    And User navigates to register page
    Then User clicks on SSN textbox
    Then User doesnt provide "ssn" and click tab
    And User should see the "ssn_error_message"

  Scenario: TC_002 Any field on the registration page should not be left blank
    Given User on the login page
    And User navigates to register page
    Then User clicks on First Name textbox
    Then User doesnt provide "firstname" and click tab
    And User should see the "firstname_error_message"

  Scenario: TC_003 Any field on the registration page should not be left blank
    Given User on the login page
    And User navigates to register page
    Then User clicks on Last Name textbox
    Then User doesnt provide "lastname" and click tab
    And User should see the "lastname_error_message"

  Scenario: TC_004 Any field on the registration page should not be left blank
    Given User on the login page
    And User navigates to register page
    Then User clicks on Address textbox
    Then User doesnt provide "address" and click tab
    And User should see the "address_error_message"

  Scenario: TC_005 Any field on the registration page should not be left blank
    Given User on the login page
    And User navigates to register page
    Then User clicks on Mobile Phone Number textbox
    Then User doesnt provide "mobile_phone_number" and click tab
    And User should see the "mobile_phone_number_error_message"

  Scenario: TC_006 Any field on the registration page should not be left blank
    Given User on the login page
    And User navigates to register page
    Then User clicks on Username textbox
    Then User doesnt provide "username" and click tab
    And User should see the "username_error_message"

  Scenario: TC_007 Any field on the registration page should not be left blank
    Given User on the login page
    And User navigates to register page
    Then User clicks on Email textbox
    Then User doesnt provide "email" and click tab
    And User should see the "email_error_message"

  Scenario: TC_008 Any field on the registration page should not be left blank
    Given User on the login page
    And User navigates to register page
    Then User clicks on New password textbox
    Then User doesnt provide "new_password" and click tab
    And User should see the "new_password_error_message"

  Scenario: TC_009 Any field on the registration page should not be left blank
    Given User on the login page
    And User navigates to register page
    Then User clicks on New password confirmation textbox
    Then User doesnt provide "new_password_confirmation" and click tab
    And User should see the "new_password_confirmation_error_message"

  Scenario: TC_010 SSN number cannot be of any chars nor spec chars except "-"

  Scenario: TC_011 SSN number cannot be of any chars nor spec chars except "-"

  Scenario: TC_012 SSN number cannot be of any chars nor spec chars except "-"

  Scenario: TC_013 Mobile phone number cannot be of any chars nor spec chars except "-"

  Scenario: TC_014 Mobile phone number cannot be of any chars nor spec chars except "-"

  Scenario: TC_015 Mobile phone number cannot be of any chars nor spec chars except "-"

  Scenario: TC_016 email id cannot be created without "@" sign and "." extensions

  Scenario: TC_017 email id cannot be created without "@" sign and "." extensions
