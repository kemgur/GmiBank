Feature: System_should_allow_to_delete_states_using_api_end_point
  Scenario Outline: User can just delete each state 1 by 1
    Given user deletes states using endpoint "<endPoint>" and its extension "<id>" and validate
    Examples: Delete states
    |endPoint                             |id|
    |https://www.gmibank.com/api/tp-states|/25398|
