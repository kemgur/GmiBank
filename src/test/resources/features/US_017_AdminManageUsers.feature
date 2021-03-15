Feature: System should allow the Admin to manage users

  Background:
    Given login to GMI bank
    And navigate to user info
    And Sent "admin_username" to username blank
    And Sent "admin_pw" to password blank
    And click to sign in button
    Given click on Administration drop-down
    And click on the User management

  Scenario: TC_01
    Given  find a user on registration table

  Scenario: TC_02
    Given find a employee on registration table

  Scenario: TC_03
    Given find a manager on registration table

  Scenario: TC_04
    Given find a admin on registration table

  Scenario: TC_05
    Given You can view all user info (admin, manager, employee and user)

  Scenario: TC_06
    Given You can edit all user info  (admin, manager, employee and user)

  Scenario: TC_07
    Given You can delete all user info  (admin, manager, employee and user)
