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
      Then Login to the employee account "employee_username" "employee_pw"
      And Employee integrates bank account to registered user
      Then Logging out from the employee account
      And User logs into his-her own account
      And User navigates to My accounts page
      Then User makes money transfer
      And User verify his-her money transfer
