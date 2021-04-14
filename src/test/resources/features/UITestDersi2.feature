@secondUI
Feature: US016 Money Transfer

  Scenario: User does every step to transfer money between user's accounts
    Given User on the "gmibank_url"
    And DUser navigates to sign in page
    Then DUser provide a valid username
    Then DUser provide a valid password
    And DUser click on the sign in button
    And DUser navigates My Accounts Page
    And DUser gets the info about Users accounts balance
    And DUser navigates to Transfer Money Page
    Then DUser does the money transfer
    Then DUser navigates My Accounts Page
    * DUser validates that User s money transferred successfully


