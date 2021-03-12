@first
Feature: System_should_allow_any_user_to_register_with_valid_credentials_validating_the_success_message


  Scenario: TC_001_There_should_be_a_valid_SSN_respecting_the_"-"_where_necessary,_it_should_be_9_digits_long

    Given User goes to "gmi_bank_url"
    Then User should navigate to registration page
    And User clicks on ssn textbox
    And User provides the "ssn" of the applicant
    And user doesn't see the ssn error message

  Scenario: TC_002_There_should_be_a_valid_name_that_contains_chars_and_cannot_be_blank

    Given User goes to "gmi_bank_url"
    Then User should navigate to registration page
    And User clicks on first name textbox
    And User provides the first_name of the applicant
    And user doesn't see the first name error message

  Scenario: TC_003_There_should_be_a_valid_lastname_that_contains_chars_and_it_is_a_required_field
    Given User goes to "gmi_bank_url"
    Then User should navigate to registration page
    And User clicks on last name textbox
    And User provides the last_name of the applicant
    And user doesn't see the last name error message

  Scenario: TC_004_You_can_provide_chars_and_digits_to_describe_a_valid_address_along_with_zip_code
    Given User goes to "gmi_bank_url"
    Then User should navigate to registration page
    And User clicks on address textbox
    And User provides the address of the applicant
    And user doesn't see the address error message

  Scenario: TC_005_User_should_provide-10_digit_long_mobil_phone_number_as_a_required_field_respecting_the_"-"
    Given User goes to "gmi_bank_url"
    Then User should navigate to registration page
    And User clicks on mobile phone number textbox
    And User provides the mobile_phone_number of the applicant
    And user doesn't see the phone number error message

  Scenario: TC_006_User-cannot_use_just_digits,_but_can_use_any_chars_and_digits_along_with_them_and_of_any_length
    Given User goes to "gmi_bank_url"
    Then User should navigate to registration page
    And User clicks on username textbox
    And User provides the username of the applicant
    And user doesn't see the username error message

  Scenario: TC_007_You_should_provide_a_valid_email_format_that_contains_"@"sign_and_"."_extensions
    Given User goes to "gmi_bank_url"
    Then User should navigate to registration page
    And User clicks on email textbox
    And User provides the email of the applicant
    And user doesn't see the email error message