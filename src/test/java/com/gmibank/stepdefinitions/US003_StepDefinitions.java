package com.gmibank.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import com.gmibank.pages.US003_StongPasswordPage;
import com.gmibank.utilities.ConfigReader;
import com.gmibank.utilities.Driver;

public class US003_StepDefinitions {

    US003_StongPasswordPage strongPassword = new US003_StongPasswordPage();

    @Given("Go to {string}")
    public void go_to(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("gmi_url"));

    }

    @Then("Click the login button from the login page")
    public void click_the_login_button_from_the_login_page() {
        strongPassword.accountMenu.click();
    }

    @Then("Click the register button from the popup window")
    public void click_the_register_button_from_the_popup_window() {
        strongPassword.registerButton.click();
    }

    @Then("scroll down the page")
    public void scroll_down_the_page() {
        strongPassword.scroolPage();
    }


    @Then("Enter a password in lower case in the new password")
    public void enter_a_password_in_lower_case_in_the_new_password() {
        strongPassword.firstPassword.sendKeys(ConfigReader.getProperty("lower_Case"));
    }

    @Then("see change in Password strength")
    public void see_change_in_password_strength() {
        Assert.assertTrue(strongPassword.redPoint.isDisplayed());

    }


    @And("Enter a password in upper case in the new password")
    public void enterAPasswordInUpperCaseInTheNewPassword() {
        strongPassword.firstPassword.sendKeys(ConfigReader.getProperty("a_Upper_Case"));
    }

    @And("see change in Password strength \\(orange)")
    public void seeChangeInPasswordStrengthOrange() {
        Assert.assertTrue(strongPassword.orangePoint.isDisplayed());
    }


    @And("Enter a password in digit in the new password")
    public void enterAPasswordInDigitInTheNewPassword(){
        strongPassword.firstPassword.sendKeys(ConfigReader.getProperty("a_Digit"));
    }

    @And("see change in Password strength \\(green)")
    public void seeChangeInPasswordStrengthGreen() {
        Assert.assertTrue(strongPassword.greenPoint.isDisplayed());
    }


    @And("enter a special character as password in new password")
    public void enterASpecialCharacterAsPasswordInNewPassword() {
        strongPassword.firstPassword.sendKeys(ConfigReader.getProperty("spacial_Character"));
    }

    @And("see change in Password strength \\(darkgreen)")
    public void seeChangeInPasswordStrengthDarkgreen() {
        Assert.assertTrue(strongPassword.darkGreenPoint.isDisplayed());
    }


    @And("enter the password in seven characters for all desired properties")
    public void enterThePasswordInSevenCharactersForAllDesiredProperties() {
        strongPassword.firstPassword.sendKeys(ConfigReader.getProperty("sevenCharacter"));
    }

    @And("see change in Password strength \\(againdarkgreen)")
    public void seeChangeInPasswordStrengthAgaindarkgreen() {
        Assert.assertTrue(strongPassword.darkGreenPoint.isDisplayed());
    }

    @And("user closes the page")
    public void userClosesThePage() {
        Driver.closeDriver();
    }
}
