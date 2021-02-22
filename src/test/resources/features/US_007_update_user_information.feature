
@ayse
Feature:US_007 System should not allow to make updates with invalid credentials
  @test1
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
      |invalidmails  |
      |     a_mail1    |
      |     a_mail2    |





  @test2
  Scenario: TC002 The e-mail ID cannot contain only digits without the "@" sign or "."
    Given User on the home page
    And Navigate to sign in page
    And Enter "user_username" in username textbox
    And Enter "user_pw" in the password text box
    And Click the sign in button
    And Navigate to user info page
    And Delete the mail in the email text box
    And Enter a letter-only "a_mail2" into the email text box
    Then Then I should see the error message "a_message_error"

@test3
  Scenario: TC003 There should not be an option of any other language other than Englisg or Turkish
    Given User on the home page
    And Navigate to sign in page
    And Enter "user_username" in username textbox
    And Enter "user_pw" in the password text box
    And Click the sign in button
    And Navigate to user info page
    And Select the "a_language1" option from the language dropdown
    And Click the save button
    Then Then user should see the text "User settings for [" on the web page




@test4
  Scenario: TC004 There should not be an option of any other language other than Englisg or Turkish
    Given User on the home page
    And Navigate to sign in page
    And Enter "user_username" in username textbox
    And Enter "user_pw" in the password text box
    And Click the sign in button
    And Navigate to user info page
    And Select the "a_language2" option from the language dropdown
    And Click the save button
    Then Then user should see the text "Kullanıcı ayarları [" on the web page

