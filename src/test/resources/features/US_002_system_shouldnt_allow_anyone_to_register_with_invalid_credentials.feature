Feature: US_002_system_shouldnt_allow_anyone_to_register_with_invalid_credentials


  Scenario: TC_001 Any field on the registration page should not be left blank
    Given User on the home page
    And User navigates to register page
    Then User clicks on SSN textbox
    Then User doesnt provide "ssn" and click tab
    And User should see the SSN error message "ssn_require_error_message"

  @ewip
  Scenario: TC_002 Any field on the registration page should not be left blank
    Given User on the home page
    And User navigates to register page
    Then User clicks on First Name textbox
    Then User doesnt provide "firstname" and click tab
    And User should see the First Name error message "firstname_error_message"

  @ewip
  Scenario: TC_003 Any field on the registration page should not be left blank
    Given User on the home page
    And User navigates to register page
    Then User clicks on Last Name textbox
    Then User doesnt provide "lastname" and click tab
    And User should see the Last Name error message "lastname_error_message"

  Scenario: TC_004 Any field on the registration page should not be left blank
    Given User on the home page
    And User navigates to register page
    Then User clicks on Address textbox
    Then User doesnt provide "address" and click tab
    And User should see the Address error message "address_error_message"

  Scenario: TC_005 Any field on the registration page should not be left blank
    Given User on the home page
    And User navigates to register page
    Then User clicks on Mobile Phone Number textbox
    Then User doesnt provide "mobile_phone_number" and click tab
    And User should see the Mobile Phone Number error message "mobile_phone_number_error_message"

  @ewip
  Scenario: TC_006 Any field on the registration page should not be left blank
    Given User on the home page
    And User navigates to register page
    Then User clicks on Username textbox
    Then User doesnt provide "username" and click tab
    And User should see the Username error message "username_error_message"

  @ewip
  Scenario: TC_007 Any field on the registration page should not be left blank
    Given User on the home page
    And User navigates to register page
    Then User clicks on Email textbox
    Then User doesnt provide "email" and click tab
    And User should see the Email error message "email_error_message"

  @ewip
  Scenario: TC_008 Any field on the registration page should not be left blank
    Given User on the home page
    And User navigates to register page
    Then User clicks on New password textbox
    Then User doesnt provide "new_password" and click tab
    And User should see the New password error message "new_password_error_message"

  @ewip
  Scenario: TC_009 Any field on the registration page should not be left blank
    Given User on the home page
    And User navigates to register page
    Then User clicks on New password confirmation textbox
    Then User doesnt provide "new_password_confirmation" and click tab
    And User should see the New password confirmation error message"new_password_confirmation_error_message"

  Scenario Outline: TC_010, TC_011, TC_012 SSN number cannot be of any chars nor spec chars except "-"
    Given User on the home page
    And User navigates to register page
    Then User clicks on SSN textbox
    Then User provide invalid SSN "<invalid_ssns>" and click tab
    And User should see the SSN error message "ssn_invalid_error_message"
    Examples:
      | invalid_ssns |
      | invalid_ssn1 |
      | invalid_ssn2 |
      | invalid_ssn3 |

  Scenario Outline: TC_013, TC_014, TC_015 Mobile phone number cannot be of any chars nor spec chars except "-"
    Examples:
      |  |

 Scenario Outline: TC_016, TC_017 email id cannot be created without "@" sign and "." extensions
   Examples:
     |  |

