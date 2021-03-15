Feature:

  Scenario Outline:User can just update each country 1 by 1
    Given user go to api end point "https://www.gmibank.com/api/tp-countries" "<id>", "<name>"
    Then validate specific some data
    Examples:
      | id | name |

