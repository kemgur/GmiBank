@demo
Feature: ApiDemo2
  Scenario:Reading Country, putting in order Id's, Creating Country
    Given User on the api endpoint "https://www.gmibank.com/api/tp-countries"
    And Validation countries
    And  create a country using to api end point "https://www.gmibank.com/api/tp-countries"


  Scenario Outline:  ulkeyi update etme
    And  user updates a country using api end point "https://www.gmibank.com/api/tp-countries"  "<name>" and its extension "<id>"
    Examples: Update country
      |name|id|
      |cennet |25589|
  Scenario Outline: ulke silme
    Given user deletes a country using endpoint "<endPoint>" and its extension "<id>"
    Examples: Delete Country
      |endPoint                                |id    |
      |https://www.gmibank.com/api/tp-countries%7C/73028%7C
  @pdf
  Scenario Outline: pdf alma :)
    Given demo pdf user creates a connection with db using "jdbc:postgresql://157.230.48.97:5432/gmibank_db" , "techprodb_user" and "Techpro_@126"
    And demo pdf user provides the query "<query>"
    Examples: demo read the data
      |query|
      |Select * from tp_customer|




