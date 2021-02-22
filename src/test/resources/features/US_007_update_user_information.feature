Feature:US_007 System should not allow to make updates with invalid credentials

  @test1 @test2
  Scenario Outline: TC001, TC002 The e-mail ID cannot contain only  characters without the "@" sign or "."
    Given User on the home page
    And Navigate to sign in page
    And Enter "user_username" in username textbox
    And Enter "user_pw" in the password text box
    And Click the sign in button
    And Navigate to user info page
    And Delete the mail in the email text box
    And Enter a letter-only "<invalidmails>" into the email text box
    Then Then I should see the error message "a_message_error"
    Examples:
      | invalidmails |
      | a_mail1      |
      | a_mail2      |

  @test3
  Scenario: TC003 There should not be an option of any other language other than English or Turkish
    Given  Go to "http://www.gmibank.com/"
    And Navigate to sign in page
    And Enter "a_username" in username textbox
    And Enter "a_password" in the password text box
    And Click the sign in button
    And Navigate to user info page
    And Select the "a_language2" option from the language dropdown
    And Click the save button
    Then Then user should see the text "a_english" on the web page

  @test4
  Scenario: TC004 There should not be an option of any other language other than English or Turkish
    Given  User on the home page
    And Navigate to sign in page
    And Enter "a_username" in username textbox
    And Enter "a_password" in the password text box
    And Click the sign in button
    And Navigate to user info page
    And Select the "a_language1" option from the language dropdown
    And Click the save button
    Then Then user should see the text "a_turkish" on the web page






