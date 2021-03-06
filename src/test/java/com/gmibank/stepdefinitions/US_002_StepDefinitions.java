package com.gmibank.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import com.gmibank.pages.US_002GmiHomePage;
import com.gmibank.pages.US_002GmiRegisterPage;
import com.gmibank.utilities.ConfigurationReader;
import com.gmibank.utilities.Driver;

public class US_002_StepDefinitions {

    US_002GmiHomePage homePage = new US_002GmiHomePage();
    US_002GmiRegisterPage registerPage = new US_002GmiRegisterPage();

    @Given("User on the home page")
    public void userOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmi_home_page"));
        Driver.wait(2);
    }

    @And("User navigates to register page")
    public void userNavigatesToRegisterPage() {
        homePage.picture.click();
        Driver.wait(2);
        homePage.registerButton.click();
        Driver.wait(2);
    }

    @Then("User clicks on SSN textbox")
    public void userClicksOnSSNTextbox(){
        registerPage.ssnTextbox.click();
        Driver.wait(2);

    }

    @Then("User doesnt provide {string} and click tab")
    public void userDoesntProvideAndClickTab(String data) {
        Driver.wait(2);
        registerPage.ssnTextbox.sendKeys(Keys.TAB);
    }


    @Then("User clicks on First Name textbox")
    public void userClicksOnFirstNameTextbox() {
        Driver.wait(2);
        registerPage.firstNameTextbox.click();
    }

    @Then("User clicks on Last Name textbox")
    public void userClicksOnLastNameTextbox() {
        registerPage.lastNameTextbox.click();
    }

    @Then("User clicks on Address textbox")
    public void userClicksOnAddressTextbox() {
        registerPage.addressTextbox.click();
    }

    @Then("User clicks on Mobile Phone Number textbox")
    public void userClicksOnMobilePhoneNumberTextbox() {
        registerPage.mobilePhoneTextBox.click();
    }

    @Then("User clicks on Username textbox")
    public void userClicksOnUsernameTextbox() {
        registerPage.usernameTextbox.click();
    }

    @Then("User clicks on Email textbox")
    public void userClicksOnEmailTextbox() {
        registerPage.emailTextbox.click();
    }

    @Then("User clicks on New password textbox")
    public void userClicksOnNewPasswordTextbox() {
        registerPage.newPasswordTextbox.click();
    }

    @Then("User clicks on New password confirmation textbox")
    public void userClicksOnNewPasswordConfirmationTextbox() {
        registerPage.newPasswordConfirmationTextbox.click();
    }

    @And("User should see the SSN error message {string}")
    public void userShouldSeeTheSSNErrorMessage(String errorMessage) {
        Assert.assertEquals(ConfigurationReader.getProperty(errorMessage), registerPage.ssnErrorMessage.getText());

    }

    @And("User should see the First Name error message {string}")
    public void userShouldSeeTheFirstNameErrorMessage(String errorMessage) {
        Assert.assertEquals(ConfigurationReader.getProperty(errorMessage), registerPage.firstNameErrorMessage.getText());

    }

    @And("User should see the Last Name error message {string}")
    public void userShouldSeeTheLastNameErrorMessage(String errorMessage) {
        Assert.assertEquals(ConfigurationReader.getProperty(errorMessage), registerPage.lastNameErrorMessage.getText());
    }

    @And("User should see the Address error message {string}")
    public void userShouldSeeTheAddressErrorMessage(String errorMessage) {
        Assert.assertEquals(ConfigurationReader.getProperty(errorMessage), registerPage.addressErrorMessage.getText());
    }

    @And("User should see the Mobile Phone Number error message {string}")
    public void userShouldSeeTheMobilePhoneNumberErrorMessage(String errorMessage) {
        Assert.assertEquals(ConfigurationReader.getProperty(errorMessage), registerPage.mobilePhoneErrorMessage.getText());
    }

    @And("User should see the Username error message {string}")
    public void userShouldSeeTheUsernameErrorMessage(String errorMessage) {
        Assert.assertEquals(ConfigurationReader.getProperty(errorMessage), registerPage.usernameErrorMessage.getText());
        Driver.closeDriver();
    }

    @And("User should see the Email error message {string}")
    public void userShouldSeeTheEmailErrorMessage(String errorMessage) {
        Assert.assertEquals(ConfigurationReader.getProperty(errorMessage), registerPage.emailErrorMessage.getText());
    }

    @And("User should see the New password error message {string}")
    public void userShouldSeeTheNewPasswordErrorMessage(String errorMessage) {
        Assert.assertEquals(ConfigurationReader.getProperty(errorMessage), registerPage.newPasswordErrorMessage.getText());
    }

    @And("User should see the New password confirmation error message{string}")
    public void userShouldSeeTheNewPasswordConfirmationErrorMessage(String errorMessage) {
        Assert.assertEquals(ConfigurationReader.getProperty(errorMessage), registerPage.newPasswordConfirmationErrorMessage.getText());
    }


    @Then("User provide invalid SSN {string} and click tab")
    public void userProvideInvalidSSNAndClickTab(String invalidSsn) {
        registerPage.ssnTextbox.sendKeys(ConfigurationReader.getProperty(invalidSsn) + Keys.TAB);
    }

    @Then("User provide invalid Mobile Phone Number {string} and click tab")
    public void userProvideInvalidMobilePhoneNumberAndClickTab(String invalidMpn) {
        registerPage.mobilePhoneTextBox.sendKeys(ConfigurationReader.getProperty(invalidMpn) + Keys.TAB);
    }

    @Then("User provide invalid Email {string} and click tab")
    public void userProvideInvalidEmailAndClickTab(String invalidEmails) {
        registerPage.emailTextbox.sendKeys(ConfigurationReader.getProperty(invalidEmails) + Keys.TAB);
    }

    @And("User should see the Email invalid error message {string}")
    public void userShouldSeeTheEmailInvalidErrorMessage(String errorMessage) {
        Assert.assertEquals(ConfigurationReader.getProperty(errorMessage), registerPage.invalidEmailErrorMessage.getText());
    }

}
