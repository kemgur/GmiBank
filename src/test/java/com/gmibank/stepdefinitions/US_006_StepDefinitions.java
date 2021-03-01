package com.gmibank.stepdefinitions;

import com.gmibank.pages.US_006_UserInfoSegmentPage;
import com.gmibank.utilities.ConfigReader;
import com.gmibank.utilities.Driver;
import com.gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import java.util.List;

public class US_006_StepDefinitions extends ReusableMethods {

    US_006_UserInfoSegmentPage userInfo=new US_006_UserInfoSegmentPage();

    @Given("login to GMI bank")
    public void login_to_gmi_bank() {
        Driver.getDriver().get("http://www.gmibank.com/");
    }

    @Given("navigate to user info")
    public void navigate_to_user_info() {
        userInfo.picture.click();
        userInfo.SignInButton.click();
    }

    @Given("Sent {string} to username blank")
    public void sent_to_username_blank(String userName) {
        userInfo.username.sendKeys(ConfigReader.getProperty(userName));
    }

    @Given("Sent {string} to password blank")
    public void sent_to_password_blank(String pass) {
        userInfo.password.sendKeys(ConfigReader.getProperty(pass));
    }

    @Given("click to sign in button")
    public void click_to_sign_in_button() {
        userInfo.login.click();

    }

    @Given("click on aktas User drop-down")
    public void click_on_aktas_user_drop_down() {
        userInfo.UserAktas.click();
        ReusableMethods.waitFor(2);
    }

    @Then("click on User Info")
    public void click_on_user_info() {
        userInfo.userInfoBtn.click();
    }

    @Then("verify firstname, lastname email and language")
    public void verify_firstname_lastname_email_and_language() {
        boolean isDisplayedName=userInfo.firstName.isDisplayed();
        boolean isDisplayedLastName=userInfo.firstName.isDisplayed();
        boolean isDisplayedEmail=userInfo.firstName.isDisplayed();
        boolean isDisplayedLanguage=userInfo.firstName.isDisplayed();

        Assert.assertTrue("aktas", isDisplayedName);
        Assert.assertTrue("User", isDisplayedLastName);
        Assert.assertTrue("t30user@user.com", isDisplayedEmail);

        Select select=new Select(userInfo.dorpdownSelect);
        select.selectByVisibleText("English");
        ReusableMethods.waitFor(2);
        select.selectByVisibleText("Türkçe");

    }

    @Then("verify {int} languages {string}")
    public void verify_languages(Integer int1, String string) {

        Select select=new Select(userInfo.dorpdownSelect);
        List<WebElement> options = select.getOptions();

        for(WebElement element:options) {
            String ddValue = element.getText();
            System.out.println(ddValue);
        }
    }

    @Then("update {string}")
    public void update(String fn) {
        ReusableMethods.waitFor(2);
        userInfo.firstName.clear();
        ReusableMethods.waitFor(2);
        userInfo.firstName.sendKeys(ConfigReader.getProperty(fn));
        userInfo.submit.click();

    }

    @Then("enter and update {string}")
    public void enter_and_update(String ln) {
        ReusableMethods.waitFor(2);
        userInfo.lastName.clear();
        ReusableMethods.waitFor(2);
        userInfo.lastName.sendKeys(ConfigReader.getProperty(ln));
        userInfo.submit.click();
    }

    @Then("update the {string}")
    public void update_the(String mail) {
        ReusableMethods.waitFor(2);
        userInfo.email.clear();
        ReusableMethods.waitFor(2);
        userInfo.email.sendKeys(ConfigReader.getProperty(mail));
        userInfo.submit.click();
    }
}
