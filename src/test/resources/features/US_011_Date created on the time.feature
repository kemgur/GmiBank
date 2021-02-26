
  Feature: US_011_User can select Zelle Enrolled optionally and save it

    Scenario: TC_0001
      Given login to GMI bank
      And navigate to user info
      And Sent "user_username" to username blank
      And Sent "user_pw" to password blank
      And click to sign in button
      And click to My Operations and click the Manage Accounts
      And click on the create a new customer button
      Then the date should the time of creating a customer

    Scenario: TC_0002
      Given login to GMI bank
      And navigate to user info
      And Sent "user_username" to username blank
      And Sent "user_pw" to password blank
      And click to sign in button
      And click to My Operations and click the Manage Accounts
      And click on the create a new customer button
      Then The date should be created as month, day, year, hour and minute

    Scenario: TC_0003
      Given login to GMI bank
      And navigate to user info
      And Sent "user_username" to username blank
      And Sent "user_pw" to password blank
      And click to sign in button
      And click to My Operations and click the Manage Accounts
      And select specific customer from the registration list and get ID
      Then verify the ID that you selected from the registration page

    Scenario: TC_0004
      Given login to GMI bank
      And navigate to user info
      And Sent "user_username" to username blank
      And Sent "user_pw" to password blank
      And click to sign in button
      And click to My Operations and click the Manage Accounts
      And select specific customer from the registration list and get ID
      And click on the edit button
      Then update "phone_number" from phone number blank

    Scenario: TC_0005
      Given login to GMI bank
      And navigate to user info
      And Sent "user_username" to username blank
      And Sent "user_pw" to password blank
      And click to sign in button
      And click to My Operations and click the Manage Accounts
      And select specific customer from the registration list and get ID
      And click on the edit button
      Then User can select Zelle Enrolled optionally and save it