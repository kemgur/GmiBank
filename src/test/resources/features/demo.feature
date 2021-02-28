@Demo
  Feature: Demo Presentation
    Scenario: User does every step to transfer money
      Given User on the home page
      And User navigates to register page
      And User applies for registration
      Then User on the home page
      And User navigates to login page
      And Login to admin account "admin_username" "admin_pw"
      Then Admin activates the account of the user who has made the application
      And Logging out from the admin account
      Then Login to the manager account "manager_username" "manager_pw"
      And Manager integrates bank account to registered user
      Then Logging out from the manager account
      And User logs into his-her own account
      And User navigates to My accounts page
      Then User makes money transfer
      And User verify his-her money transfer
