Feature: Validate_all_data_performing_database_testing_using_the_port_and
  _following_credentials_jdbc:postgresql:will_be_given_user:""and_password:""
  Background: Create connection
    Given user creates a connection with db using "jdbc:postgresql://157.230.48.97:5432/gmibank_db" , "techprodb_user" and "Techpro_@126"
  Scenario Outline: All_users'_info_should_be_retrieved_by_database_and_validated
    Given user retrieves the info of user from database using "<query>" and "<columnName>"
    And user validates users info
    Examples:
    |query|columnName|
    |Select * From jhi_user|email|
  Scenario Outline: All countries' info should be retrieved by database and validated
    Given user retrieves all countries' info from database using "<query>" and "<columnName>"
    And user validates countries' info
    Examples: retrieve info
    |query|columnName|
    |Select * From tp_country|name|
  Scenario Outline: All states should related to USA should be retrieved by database and validated
    Given user retrieves all states from database using "<query>" and "<columnName>"
    And user validates states
    Examples: retrieve info
      |query|columnName|
      |Select * From tp_state|name|
  Scenario: Close connection
    Given user closes connection
