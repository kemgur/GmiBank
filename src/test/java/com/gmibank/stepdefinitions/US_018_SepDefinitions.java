package com.gmibank.stepdefinitions;

import com.gmibank.pages.US_010_and_012_EmployeeCustomerPage;
import com.gmibank.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class US_018_SepDefinitions {
    US_010_and_012_EmployeeCustomerPage employeeCustomerPage = new US_010_and_012_EmployeeCustomerPage();

    @When("user sends valid manager {string} to username textbox")
    public void user_sends_valid_manager_to_username_textbox(String manager_username) {
        employeeCustomerPage.usernameTextBox.sendKeys(ConfigurationReader.getProperty(manager_username));


    }


    @And("user enters valid manager {string} in the password textbox")
    public void userEntersValidManagerInThePasswordTextbox(String manager_password) {
        employeeCustomerPage.passwordTextBox.sendKeys(ConfigurationReader.getProperty(manager_password));
    }
}





