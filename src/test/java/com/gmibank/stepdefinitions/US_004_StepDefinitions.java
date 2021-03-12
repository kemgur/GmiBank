package com.gmibank.stepdefinitions;

import com.gmibank.pages.US_004SignInPage;
import com.gmibank.utilities.ConfigReader;
import com.gmibank.utilities.Driver;
import com.gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;


public class US_004_StepDefinitions {

    US_004SignInPage us_004SignInPage = new US_004SignInPage();


    @Given("User on the home page {string}")
    public void userOnTheHomePage(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("User clicks on login dropdown button")
    public void userClicksOnLoginDropdownButton() {
        us_004SignInPage.loginDropdown.click();
    }

    @Then("User clicks on HomeSign In button")
    public void userClicksOnHomeSignInButton() {
        us_004SignInPage.HomeSignInButton.click();
    }

    /*@Then("User clicks on username textbox")
    public void userClicksOnUsernameTextbox() throws InterruptedException {
        us_004SignInPage.usernameTextbox.click();
        Thread.sleep(5000);
    }*/

    @Then("User enter valid {string}")
    public void userEnterValid(String username) {
        us_004SignInPage.usernameTextbox.sendKeys(ConfigReader.getProperty(username)+ Keys.TAB);

    }

    @Then("User clicks on password textbox")
    public void userClicksOnPasswordTextbox() throws InterruptedException {
        us_004SignInPage.passwordTextbox.click();
        Thread.sleep(5000);
        us_004SignInPage.passwordTextbox.sendKeys(ConfigReader.getProperty("password"));


    }

    @Then("User clicks on Sign in button")
    public void userClicksOnSignInButton() {
        us_004SignInPage.usernameTextbox.clear();
        us_004SignInPage.usernameTextbox.sendKeys(ConfigReader.getProperty("username"));
        us_004SignInPage.SignInButton.click();
    }


    @Then("User clicks on Cancel button")
    public void userClicksOnCancelButton() {
        us_004SignInPage.closeButton.click();
    }

    @And("User should be able to see the Admin Admin text")
    public void userShouldBeAbleToSeeTheAdminAdminText() {
        ReusableMethods.waitFor(3);

        Assert.assertEquals(ConfigReader.getProperty("display"), us_004SignInPage.AdminAdminButton.getText());





    }
}




