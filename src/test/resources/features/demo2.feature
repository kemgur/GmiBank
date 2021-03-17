@demo2
Feature: ApiDemo2
  Scenario: putting in order Id's, Reading, Creating, Updating and Deleting Country
    Given User on the api endpoint "country_api"
    And Validation countries
    And create a country using to api end point "country_api"
    And user updates a country using api end point "country_api"  "name" and its extension "id"
    And user deletes a country using endpoint "country_api" and its extension "country_id"

  @demoJDBC
  Scenario Outline: All users info should be retrieved by database and validated
    Given demo pdf user creates a connection with db using "gmibank_jdbc" , "techpro_username" and "techpro_pw"
    And user retrieves the info of user from database using "<query>" and "<columnName>"
    Then user validates users info "jdbc_email"
    Examples:
      |query|columnName|
      |Select * From jhi_user|email|
  @DemoPdf
  Scenario Outline: Generate Datas to Pdf
    Given demo pdf user creates a connection with db using "gmibank_jdbc" , "techpro_username" and "techpro_pw"
    And demo pdf user provides the query "<query>"
    Examples: demo read the data
      |query|
      |Select * from tp_customer|




