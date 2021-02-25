@US013
Feature:
  Background:
    Given go to "gmi_url"
    Then Click the login button from the loginpage
    And Click the Sign In button from the popup window
    And enter a valid username and password
    And Click the Sign in button
    And Click on the My Operation tab
    And click on Manage Account from the drop down tab
    And Click on Create A New Account from the page that opens

    @Description
    Scenario: US013_TC01 User should create a description for the new account and it cannot be blank
      Given a data must be entered in the description field
      Then Should get a warning if the Description field is blank
      And user close the page

    @Balance
    Scenario: US013_TC02 User should provide a balance for the first time account creation as Dollar
      Given Money in dollars must be entered in the balance field
      Then If left blank, an error message should be received
      And user close the page

    @AccountType
    Scenario: US013_TC03 User can select an account type as CHECKING, SAVING, CREDIT_CARD or INVESTING
      Given customer should be able to select their account type from the drop down menu
      And user close the page

    @AccountStatus
    Scenario: US13_TC04 Account status should be defined as ACTIVE, SUSPENDED or CLOSED
      Given customer should be able to choose account status
      And user close the page

    @Save
    Scenario: US13_TC05 User can select an employee from the drop-down / Optional
      Given should scroll down the page
      Then The user can choose an employee from the employee domain if they want
      And Customer should be able to save when customer presses save button
      And user close the page

























