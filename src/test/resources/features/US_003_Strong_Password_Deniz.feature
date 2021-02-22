@GmiBankStrongPassword
Feature:
  Scenario: US003_TC001 There should be at least 1 lowercase char for stronger password and
  see the level chart change accordingly
    Given Go to "gmi_url"
    Then Click the login button from the login page
    And Click the register button from the popup window
    And scroll down the page
    And Enter a password in lower case in the new password
    And see change in Password strength











