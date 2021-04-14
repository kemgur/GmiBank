package com.gmibank.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import com.gmibank.pages.US_002GmiHomePage;
import com.gmibank.pages.US_002GmiRegisterPage;
import com.gmibank.pages.US_015_LoginPage;
import com.gmibank.pages.US_015_UserPage;
import com.gmibank.utilities.ConfigurationReader;
import com.gmibank.utilities.Driver;
import org.openqa.selenium.support.ui.Select;

public class DemoStepDefinitions {
    US_002GmiRegisterPage registerPage = new US_002GmiRegisterPage();
    US_002GmiHomePage homePage = new US_002GmiHomePage();
    US_015_LoginPage loginPage = new US_015_LoginPage();
    US_015_UserPage userPage = new US_015_UserPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("User applies for registration")
    public void user_applies_for_registration() {
        Driver.wait(1);
        Driver.waitAndSendKeys(registerPage.ssnTextbox, ConfigurationReader.getProperty("demo_ssn"), 5);
        Driver.wait(1);
        Driver.waitAndSendKeys(registerPage.firstNameTextbox, ConfigurationReader.getProperty("demo_firstname"), 5);
        Driver.wait(1);
        Driver.waitAndSendKeys(registerPage.lastNameTextbox, ConfigurationReader.getProperty("demo_lastname"), 5);
        Driver.wait(1);
        Driver.waitAndSendKeys(registerPage.addressTextbox, ConfigurationReader.getProperty("demo_address"), 5);
        Driver.wait(1);
        Driver.waitAndSendKeys(registerPage.mobilePhoneTextBox, ConfigurationReader.getProperty("demo_mobile"), 5);
        Driver.wait(1);
        Driver.waitAndSendKeys(registerPage.usernameTextbox, ConfigurationReader.getProperty("demo_username"), 5);
        Driver.wait(1);
        Driver.waitAndSendKeys(registerPage.emailTextbox, ConfigurationReader.getProperty("demo_email"), 5);
        Driver.wait(1);
        Driver.waitAndSendKeys(registerPage.newPasswordTextbox, ConfigurationReader.getProperty("demo_password"), 5);
        Driver.wait(1);
        Driver.waitAndSendKeys(registerPage.newPasswordConfirmationTextbox, ConfigurationReader.getProperty("demo_password"), 5);
        Driver.wait(1);
        Driver.waitAndClick(registerPage.signInButton, 5);

        Driver.wait(2);
    }

    @Then("Login to admin account {string} {string}")
    public void login_to_admin_account(String username, String password) {
        Driver.wait(2);
        Driver.waitAndSendKeys(loginPage.usernameTextbox, ConfigurationReader.getProperty(username), 5);
        Driver.wait(2);
        Driver.waitAndSendKeys(loginPage.passwordTextbox, ConfigurationReader.getProperty(password), 5);
        Driver.wait(2);
        Driver.waitAndClick(loginPage.signInButton, 5);

        Driver.wait(2);
    }

    @Then("Admin activates the account of the user who has made the application")
    public void admin_activates_the_account_of_the_user_who_has_made_the_application() {

        Driver.waitAndClick(userPage.administration, 5);
        Driver.wait(2);
        Driver.waitAndClick(userPage.userManagement, 5);
        Driver.wait(2);
        actions.
                sendKeys(Keys.END).
                perform();
        Driver.wait(2);
        Driver.waitAndClick(userPage.lastPageButton, 5);
        Driver.wait(2);
        Driver.waitAndClick(userPage.team30DemoEditButton, 5);
        Driver.wait(2);
        Driver.waitAndClick(userPage.activatedButton, 5);
        Driver.wait(2);
        Driver.waitAndClick(userPage.save, 5);

        Driver.wait(2);
    }

    @Then("Logging out from the admin account")
    public void logging_out_from_the_admin_account() {
        Driver.waitAndClick(userPage.icon, 5);
        Driver.wait(2);
        Driver.waitAndClick(userPage.signOut, 5);

        Driver.wait(2);
    }

    @Then("Login to the employee account {string} {string}")
    public void login_to_the_manager_account(String username, String password) {
        Driver.waitAndClick(userPage.signInAgain, 5);
        Driver.wait(2);


        Driver.waitAndSendKeys(loginPage.usernameTextbox, ConfigurationReader.getProperty(username), 5);
        Driver.wait(2);
        Driver.waitAndSendKeys(loginPage.passwordTextbox, ConfigurationReader.getProperty(password), 5);
        Driver.wait(2);

        Driver.waitAndClick(loginPage.signInButton, 5);

        Driver.wait(2);
    }

    @Then("Employee integrates bank account to registered user")
    public void employee_integrates_bank_account_to_registered_user() {
        Driver.waitAndClick(userPage.myOperations, 5);
        Driver.wait(2);
        Driver.waitAndClick(userPage.manageCustomers, 5);
        Driver.wait(2);
        Driver.waitAndClick(userPage.createNewCustomer, 5);
        Driver.wait(2);

        Driver.waitAndSendKeys(userPage.searchSsn, ConfigurationReader.getProperty("demo_ssn"), 5);
        Driver.wait(2);
        userPage.searchButton.click();
        Driver.wait(2);
        Driver.waitAndSendKeys(userPage.middle, ConfigurationReader.getProperty("demo_middle"), 5);
        Driver.wait(2);
        Driver.waitAndSendKeys(userPage.phoneNumber, ConfigurationReader.getProperty("demo_mobile"), 5);
        Driver.wait(2);
        Driver.waitAndSendKeys(userPage.zipCode, ConfigurationReader.getProperty("demo_zip"), 5);
        Driver.wait(2);
        Driver.waitAndSendKeys(userPage.city, ConfigurationReader.getProperty("demo_city"), 5);
        Driver.wait(2);

        actions.
                keyDown(Keys.LEFT_CONTROL).
                click(userPage.firstAcc).
                click(userPage.secondAcc).
                keyUp(Keys.LEFT_CONTROL).
                perform();
        Driver.wait(2);
        Driver.waitAndClick(userPage.save, 5);
        Driver.wait(2);

    }

    @Then("Logging out from the employee account")
    public void logging_out_from_the_employee_account() {
        Driver.waitAndClick(userPage.tus, 5);
        Driver.wait(2);
        Driver.waitAndClick(userPage.cikis, 5);
        Driver.wait(2);
    }

    @Then("User logs into his-her own account")
    public void user_logs_into_his_her_own_account() {
        Driver.waitAndClick(userPage.signInAgain, 5);
        Driver.wait(2);
        Driver.waitAndSendKeys(loginPage.usernameTextbox, ConfigurationReader.getProperty("demo_username"), 5);
        Driver.wait(2);
        Driver.waitAndSendKeys(loginPage.passwordTextbox, ConfigurationReader.getProperty("demo_password"), 5);
        Driver.wait(2);
        Driver.waitAndClick(loginPage.signInButton, 5);
        Driver.wait(2);
    }

    @Then("User makes money transfer")
    public void user_makes_money_transfer() {
       Driver.waitAndClick(userPage.myOperations, 5);
        Driver.wait(2);
        Driver.waitAndClick(userPage.transferMoney, 5);
        Driver.wait(2);
        Select from = new Select(userPage.fromDD);
        from.selectByIndex(1);
        Driver.wait(2);
        Select to = new Select(userPage.toDD);
        to.selectByIndex(1);
        Driver.wait(2);

        Driver.waitAndSendKeys(userPage.balance, ConfigurationReader.getProperty("demo_balance"), 5);
        Driver.wait(2);
        userPage.balanceCent.clear();
        Driver.wait(2);
        Driver.waitAndSendKeys(userPage.balanceCent, ConfigurationReader.getProperty("demo_balance_cent"), 5);
        Driver.wait(2);
        Driver.waitAndSendKeys(userPage.descriptionTextbox, ConfigurationReader.getProperty("demo_description"), 5);
        Driver.wait(2);

        Driver.waitAndClick(userPage.makeTransferButton, 5);
        Driver.wait(2);
    }

    @Then("User verify his-her money transfer")
    public void user_verify_his_her_money_transfer() {
        Driver.wait(2);
        Assert.assertTrue(userPage.transferConfirm.isDisplayed());
    }
}
