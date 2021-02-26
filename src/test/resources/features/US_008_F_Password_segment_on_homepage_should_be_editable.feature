@wip
Feature: US 008 Password segment on Homepage should be editable
Background:
  Given User go to "url"
  And User Click the icon in homepage
  Then User Click the sign in button
  Then User Enter a valid "username" and "current password"
  Then User click the signin button in signin page
  Then User click the icon in user page
  Then User Click the password button from popup window

@wip1
  Scenario: TC 001 The old password should not be used

    Given User Enter current password on the current password field
    Then User Enter current password on the new password field
    Then User Enter current password on confirmation field
    And User Click the save button
    And User See the error message

@wip2
  Scenario:TC 002 There should be at least 1 lowercase char for stronger password and
    see the level chart change accordingly
      Given User Enter on the new password field least one lowercase char for stronger password
      And User see the level chart change accordingly red

  @wip3
  Scenario: TC 003 There should be at least 1 uppercase char and see the level  chart change accordingly
        Given User Enter on the new password field least one uppercase char for stronger password
        And User see the level chart change accordingly orange

   @wip4
  Scenario: TC 004 There should be at least 1 digit and see the level chart change accordingly
    Given User Enter on the new password field least one digit  for stronger password
    And User see the level chart change accordingly yellow

  @wip5
  Scenario: TC 005 There should be at least 1 special char and see the level bar change accordingly
    Given User Enter on the new password field least one special char  for stronger password
    And User see the level chart change accordingly lime

   @wip6
    Scenario: TC 006 There should be at least 7 chars for a stronger password
      Given User Enter at least seven chars for a stronger password
      And User see the level chart change accordingly green

  @wip7
      Scenario: TC 007 The new password should be confirmed with least 7 chars
        Given User Enter current password on the current password field
        Then User Enter a new password on the new password field
        Then User Enter a new password on the confirm field
        Then User Click the save button
        And User See the password changed message

