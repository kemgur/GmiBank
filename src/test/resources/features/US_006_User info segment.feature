@smoke1
Feature: US_006 User info segment (User Settings) should be editable on Homepage


#  @Test12
  Scenario:TC_001
    Given login to GMI bank
    And navigate to user info
    And Sent "user_username" to username blank
    And Sent "user_pw" to password blank
    And click to sign in button
    And click on aktas User drop-down
    And click on User Info
    Then verify firstname, lastname email and language

#  @Test13
  Scenario: TC_002
    Given login to GMI bank
    And navigate to user info
    And Sent "user_username" to username blank
    And Sent "user_pw" to password blank
    And click to sign in button
    And click on aktas User drop-down
    And click on User Info
    Then verify 2 languages "English and Turkish"

#    @Test14
  Scenario: TC_003
    Given login to GMI bank
    And navigate to user info
    And Sent "user_username" to username blank
    And Sent "user_pw" to password blank
    And click to sign in button
    And click on aktas User drop-down
    And click on User Info
    Then update "first_Name"

#      @Test15
  Scenario: TC_004
    Given login to GMI bank
    And navigate to user info
    And Sent "user_username" to username blank
    And Sent "user_pw" to password blank
    And click to sign in button
    And click on aktas User drop-down
    And click on User Info
    Then enter and update "last_Name"

#  @Test15
  Scenario: TC_005
    Given login to GMI bank
    And navigate to user info
    And Sent "user_username" to username blank
    And Sent "user_pw" to password blank
    And click to sign in button
    And click on aktas User drop-down
    And click on User Info
    Then update the "email"