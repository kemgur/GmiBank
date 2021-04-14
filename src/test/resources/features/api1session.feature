
Feature: Tum Customer api data testi
  Background: Set the Customer api url
    Given All Customer API data is set to response using api end point "customer_api_endpoint"

  Scenario: All Customers API data validation
    Given all customer info will be set to customers with deserialization
    And all customer info will be saved to txt files
    Then all customer info has been validated



