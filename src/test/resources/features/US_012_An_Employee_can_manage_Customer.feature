Feature: US_012_ An Employee can manage customer

  Background:
    When user goes to "GmiBank_url"
    And user clicks on SignIn Dropdown menu
    And user clicks on Sign In  link
    And user sends valid employee "employee_username" to username textbox
    And user enters valid employee "employee_password" in the password textbox
    And user clicks on Sign In button
    And user clicks on My Operations link
    And user clicks on Manage Customers

  Scenario Outline: TC_001_All customers should show up on manage customers module populating the account information of the customer

    And user sees that the first customer's "<cellno>" is not empty
    Examples:
      | cellno                     |
      | first_name_control         |
      | last_name_control          |
      | Middle_initial_control     |
      | email_control              |
      | mobil_phone_number_control |
      | phone_number_control       |
      | address_control            |
      | create_date_control        |

  @hs
  Scenario Outline: TC_002_All customers should show up on manage customers module populating the account information of the customer
    And user clicks on page 2
    And user sees that the first customer's "<cellno>" is not empty
    Examples:
      | cellno                     |
      | first_name_control         |
      | last_name_control          |
      | Middle_initial_control     |
      | email_control              |
      | mobil_phone_number_control |
      | phone_number_control       |
      | address_control            |
      | create_date_control        |

  Scenario Outline: TC_003_All customers should show up on manage customers module populating the account information of the customer
    And user clicks on page_3
    And user sees that the first customer's "<cellno>" is not empty
    Examples:
      | cellno                     |
      | first_name_control         |
      | last_name_control          |
      | Middle_initial_control     |
      | email_control              |
      | mobil_phone_number_control |
      | phone_number_control       |
      | address_control            |
      | create_date_control        |


  Scenario: TC_004_"There should be a View option where customer can be navigated to all customer info and see edit button there"
    And user click on the first customer's View button
    Then there should be Edit button at the bottom and left


  Scenario: TC_005_There should be an Edit button where all customer information can be populated
    Then there should be Edit button  of first customer on the page that opens


  Scenario: TC_006_The Edit portal can allow user to create or update the user info
    And user clicks on first customer's Edit button
    And user enters a "first_name" in First Name textbox
    And user enters a "last_name" in Last Name textbox
    And user enters a "middle_initial" in Middle Initial textbox
    And user enters a "email" in Email textbox
    And user enters a "mobil_phone_number" in Mobile Phone Number textbox
    And user enters a "phone_number" in Phone Number textbox
    And user enters a "zip_code" in Zip Code textbox
    And user enters an "address" in Address textbox
    And user enters a "city" in City textbox
    And user enters a "ssn_code" in Ssn Code textbox
    And user creates "date"
    And user selects "country" from Country dropdown menu
    And user selects "user" from User dropdown menu
    And user clicks on Save button
    And Then user should see "delete_message"

  Scenario: TC_007_User can delete a customer, but seeing a message if the user is sure about deletion
    And user clicks on Delete button
    And there is a Confirm Delete pop up
    And user clicks on Delete button
    Then user should see "delete_message"

    

