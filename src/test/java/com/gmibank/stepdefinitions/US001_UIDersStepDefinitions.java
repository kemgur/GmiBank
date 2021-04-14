package com.gmibank.stepdefinitions;

import com.github.javafaker.Faker;
import com.gmibank.pages.US001_UIDersRegistrationAndHomePage;
import com.gmibank.utilities.ConfigurationReader;
import com.gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.Test;

public class US001_UIDersStepDefinitions {
    US001_UIDersRegistrationAndHomePage uiders = new US001_UIDersRegistrationAndHomePage();
    Faker faker = new Faker();
    String password = faker.internet().password(10, 15, true, true);

    @Given("User on the {string}")
    public void userOnThe(String url) {
        Driver.getDriver().get(ConfigurationReader.getProperty(url));
    }

    @And("User navigates to registration page")
    public void userNavigatesToRegistrationPage() {
        Driver.wait(2);
        uiders.iconButton.click();
        uiders.registerButtonHomePage.click();
    }


    @Then("User provides a valid ssn")
    public void userProvidesAValidSsn() {
        Driver.wait(2);
        uiders.ssnTextBox.sendKeys(faker.idNumber().ssnValid());
    }

    @And("User provides a valid firstname")
    public void userProvidesAValidFirstname() {
        Driver.wait(2);
        uiders.firstNameTextBox.sendKeys(faker.name().firstName());
    }

    @And("User provides a valid lastname")
    public void userProvidesAValidLastname() {
        Driver.wait(2);
        uiders.lastNameTextBox.sendKeys(faker.name().lastName());
    }

    @And("User provides a valid address")
    public void userProvidesAValidAddress() {
        Driver.wait(2);
        uiders.addressTextBox.sendKeys(faker.address().fullAddress());
    }

    @And("User provides a valid phonenumber")
    public void userProvidesAValidPhonenumber() {
        Driver.wait(2);
        uiders.mobilePhoneNumberTextBox.sendKeys("524-964-8547");
    }

    @And("User provides a valid username")
    public void userProvidesAValidUsername() {
        Driver.wait(2);
        uiders.userNameTextBox.sendKeys(faker.name().username()); // ebubekir.sahin
    }

    @And("User provides a valid email")
    public void userProvidesAValidEmail() {
        Driver.wait(2);
        uiders.emailTextBox.sendKeys(faker.name().firstName() + faker.name().lastName() + faker.number().digits(2) + "@gmail.com");
    }


    @And("User provides a valid password")
    public void userProvidesAValidPassword() {
        Driver.wait(2);
    uiders.firstPasswordTextBox.sendKeys(password);
    }

    @And("User provides a valid password confirmation")
    public void userProvidesAValidPasswordConfirmation() {
        Driver.wait(2);
        uiders.secondPasswordTextBox.sendKeys(password);
    }

    @And("User clicks Register button")
    public void userClicksRegisterButton() {
        Driver.wait(2);
        uiders.registerButtonRegistrationPage.click();
        Driver.wait(1);
    }

    @And("User asserts that he could register successfully")
    public void userAssertsThatHeCouldRegisterSuccessfully() {
        //Assert.assertTrue(uiders.successMessage.size()==2);
        Assert.assertTrue(uiders.successMessage2.isDisplayed());
    }
}
