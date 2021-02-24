
Feature:

  Background:
    When user goes to "GmiBank_url"
    And user clicks on SignIn Dropdown menu
    And user clicks on Sign In  link
    And user sends valid employee "employee_username" to username textbox
    And user enters valid employee "employee_password" in the password textbox
    And user clicks on Sign In button
    And user clicks on My Operations link
    And user clicks on Manage Customers
    And user clicks on Create a new Customer link
    And user enters a "first_name" in First Name textbox
    And user enters a "last_name" in Last Name textbox
    And user enters a "middle_initial" in Middle Initial textbox
    And user enters a "email" in Email textbox
    And user enters a "mobil_phone_number" in Mobile Phone Number textbox
    And user enters a "phone_number" in Phone Number textbox
    And user enters a "zip_code" in Zip Code textbox

  Scenario:TC_010_Address as street and number should be provided  and cannot be left blank

    And user doesn't enter  anything in Adress textbox
    And user enters a "city" in City textbox
    And user enters a "ssn_code" in Ssn Code textbox
    And user creates "date"
    And user selects "country" from Country dropdown menu
    And user selects "user" from User dropdown menu
    And user clicks on Save button
    Then user should see this message under Address textbox: "required_message"


  Scenario: TC_002_City should be provided and cannot be left as blank

    And user enters an "address" in Address textbox
    And user doesn't enter  anything in Citytextbox
    And user enters a "ssn_code" in Ssn Code textbox
    And user creates "date"
    And user selects "country" from Country dropdown menu
    And user selects "user" from User dropdown menu
    And user clicks on Save button
    Then user should see this message under City textbox: "required_message"
@hs
  Scenario: TC_003_Country should be typed and cannot be blank
    And user enters an "address" in Address textbox
    And user enters a "city" in City textbox
    And user enters a "ssn_code" in Ssn Code textbox
    And user creates "date"
    And user doesn't select country from Country dropdown menu
    And user selects "user" from User dropdown menu
    And user clicks on Save button
    Then user shouldn't see this message under Country textbox: "created_message"