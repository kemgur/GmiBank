package com.gmibank.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import com.gmibank.pages.US_002GmiHomePage;
import com.gmibank.pages.US_002GmiRegisterPage;
import com.gmibank.pages.US_015_LoginPage;
import com.gmibank.pages.US_015_UserPage;
import com.gmibank.utilities.ConfigReader;
import com.gmibank.utilities.Driver;

public class DemoStepDefinitions {
    US_002GmiRegisterPage registerPage = new US_002GmiRegisterPage();
    US_002GmiHomePage homePage = new US_002GmiHomePage();
    US_015_LoginPage loginPage = new US_015_LoginPage();
    US_015_UserPage userPage = new US_015_UserPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("User applies for registration")
    public void user_applies_for_registration() {
        Driver.waitAndSendKeys(registerPage.ssnTextbox, ConfigReader.getProperty("demo_ssn"), 5);
        Driver.waitAndSendKeys(registerPage.firstNameTextbox, ConfigReader.getProperty("demo_firstname"), 5);
        Driver.waitAndSendKeys(registerPage.lastNameTextbox, ConfigReader.getProperty("demo_lastname"), 5);
        Driver.waitAndSendKeys(registerPage.addressTextbox, ConfigReader.getProperty("demo_address"), 5);
        Driver.waitAndSendKeys(registerPage.mobilePhoneTextBox, ConfigReader.getProperty("demo_mobile"), 5);
        Driver.waitAndSendKeys(registerPage.usernameTextbox, ConfigReader.getProperty("demo_username"), 5);
        Driver.waitAndSendKeys(registerPage.emailTextbox, ConfigReader.getProperty("demo_email"), 5);
        Driver.waitAndSendKeys(registerPage.newPasswordTextbox, ConfigReader.getProperty("demo_password"), 5);
        Driver.waitAndSendKeys(registerPage.newPasswordConfirmationTextbox, ConfigReader.getProperty("demo_password"), 5);
        Driver.waitAndClick(registerPage.signInButton, 5);

        Driver.wait(4);
    }

    @Then("Login to admin account {string} {string}")
    public void login_to_admin_account(String username, String password) {

        Driver.waitAndSendKeys(loginPage.usernameTextbox, ConfigReader.getProperty(username), 5);
        Driver.waitAndSendKeys(loginPage.passwordTextbox, ConfigReader.getProperty(password), 5);
        Driver.waitAndClick(loginPage.signInButton, 5);

        Driver.wait(4);
    }

    @Then("Admin activates the account of the user who has made the application")
    public void admin_activates_the_account_of_the_user_who_has_made_the_application() {
        Driver.waitAndClick(userPage.administration, 5);
        Driver.waitAndClick(userPage.userManagement, 5);
        actions.
                sendKeys(Keys.END).
                perform();

        Driver.waitAndClick(userPage.lastPageButton, 5);
        Driver.waitAndClick(userPage.team30DemoEditButton, 5);
        Driver.waitAndClick(userPage.activatedButton, 5);
        Driver.waitAndClick(userPage.save, 5);

        Driver.wait(4);
    }

    @Then("Logging out from the admin account")
    public void logging_out_from_the_admin_account() {
        Driver.waitAndClick(userPage.icon, 5);
        Driver.waitAndClick(userPage.signOut, 5);

        Driver.wait(4);
    }

    @Then("Login to the manager account {string} {string}")
    public void login_to_the_manager_account(String username, String password) {
        Driver.waitAndClick(userPage.signInAgain, 5);



        Driver.waitAndSendKeys(loginPage.usernameTextbox, ConfigReader.getProperty(username), 5);
        Driver.waitAndSendKeys(loginPage.passwordTextbox, ConfigReader.getProperty(password), 5);

        Driver.waitAndClick(loginPage.signInButton, 5);

        Driver.wait(4);
    }

    @Then("Manager integrates bank account to registered user")
    public void manager_integrates_bank_account_to_registered_user() {
        Driver.waitAndClick(userPage.myOperations, 5);
        Driver.waitAndClick(userPage.manageCustomers, 5);
        Driver.waitAndClick(userPage.createNewCustomer, 5);

        Driver.waitAndSendKeys(userPage.searchSsn, ConfigReader.getProperty("demo_ssn"), 5);
        userPage.searchButton.click();
        Driver.waitAndSendKeys(userPage.middle, ConfigReader.getProperty("demo_middle"), 5);
        Driver.waitAndSendKeys(userPage.phoneNumber, ConfigReader.getProperty("demo_mobile"), 5);
        Driver.waitAndSendKeys(userPage.zipCode, ConfigReader.getProperty("demo_zip"), 5);
        Driver.waitAndSendKeys(userPage.city, ConfigReader.getProperty("demo_city"), 5);

        actions.
                keyDown(Keys.LEFT_CONTROL).
                click(userPage.firstAcc).
                click(userPage.secondAcc).
                keyUp(Keys.LEFT_CONTROL).
                perform();

        Driver.waitAndClick(userPage.save, 5);
        Driver.wait(4);

    }

    @Then("Logging out from the manager account")
    public void logging_out_from_the_manager_account() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User logs into his-her own account")
    public void user_logs_into_his_her_own_account() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User makes money transfer")
    public void user_makes_money_transfer() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User verify his-her money transfer")
    public void user_verify_his_her_money_transfer() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
