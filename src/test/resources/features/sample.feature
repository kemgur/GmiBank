@samplewip
Feature: US002System should not allow anyone to register with invalid credentials

  Scenario Outline: TC001, TC002, TC003 and TC004 email id cannot be created without "@" sign and "." extensions
    Given Go to GMI BANK Qa environment Home Page
    And User should navigate to Registration page
    Then User clicks on the Email text box(Isterseniz yazabilirsiniz)
    And User provides an invalid Email "<emails>"
    And User should see the This field is invalid error message
    Examples:Invalid emails
      | emails |
      | imail1 |
      | imail2 |
      | imail3 |
      | imail4 |