Feature: Date_should_be_created_on_the_time_of_account_creation

  @second
  Scenario: TC_001_The_date_cannot_be_typed_earlier,_in_the_past,_at_the_time_of_creation_an_account

    Given User goes to "gmi_bank_url"
    And User clicks on the picture button
    And User Clicks on sign in button
    And User enters their username in the username textbox
    And User enters their password in the password textbox
    And User clicks the sign in button on the login page.
    And User clicks My Operations button
    And User clicks Manage Accounts button
    And User clicks Create a new account button
    And User enters their all informations in the textboxes
    And User clicks Create date button
    And User enters the date and the time
    Then User clicks save button and should see that the account can not be created.

  Scenario: TC_002_The-date_should-be_created_as_month,_day,_year,_hour_and_minute

    Given User goes to "gmi_bank_url"
    And User clicks on the picture button
    And User Clicks on sign in button
    And User enters their username in the username textbox
    And User enters their password in the password textbox
    And User clicks the sign in button on the login page.
    And User clicks My Operations button
    And User clicks Manage Accounts button
    And User clicks Create a new account button
    And User clicks Create date button
    And User enters the date and the time
    Then You should see the date as month,day, year,hour and minute.
