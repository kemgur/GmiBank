Feature:US_007 System should not allow to make updates with invalid credentials
  Scenario: TC001 The e-mail ID cannot contain only  characters without the "@" sign or "."
    Given  Go to "http://www.gmibank.com/"
    And Navigate to sign in page
    And Enter "user_username" in username textbox
    And Enter "user_pw" in the password text box
    And Click the sign in button
    And Navigate to user info page
    And Delete the mail in the email text box
    And Enter a letter-only "a_mail1" into the email text box
    Then Then I should see the error message "This field is invalid"



  Scenario: TC002 The e-mail ID cannot contain only digits without the "@" sign or "."
    Given  Go to "http://www.gmibank.com/"
    And Navigate to sign in page
    And Enter "user_username" in username textbox
    And Enter "user_pw" in the password text box
    And Click the sign in button
    And Navigate to user info page
    And Delete the mail in the email text box
    And Enter a letter-only "a_mail2" into the email text box
    Then Then I should see the error message "This field is invalid"


  Scenario: TC003 There should not be an option of any other language other than Englisg or Turkish
    Given  Go to "http://www.gmibank.com/"
    And Navigate to sign in page
    And Enter "user_username" in username textbox
    And Enter "user_pw" in the password text box
    And Click the sign in button
    And Navigate to user info page
    And Select the "a_language1" option from the language dropdown
    And Click the save button
    Then Then I should see the saved message "Settings saved!"





  Scenario: TC004 There should not be an option of any other language other than Englisg or Turkish
    Given  Go to "http://www.gmibank.com/"
    And Navigate to sign in page
    And Enter "user_username" in username textbox
    And Enter "user_pw" in the password text box
    And Click the sign in button
    And Navigate to user info page
    And Select the "a_language2" option from the language dropdown
    And Click the save button
    Then Then I should see the saved message "Settings saved!"

