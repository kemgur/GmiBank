package com.gmibank.stepdefinitions;

import com.gmibank.pages.US001_UIDersRegistrationAndHomePage;
import com.gmibank.utilities.ConfigurationReader;
import com.gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class US002StepDefs {
    Actions actions = new Actions(Driver.getDriver());
    US001_UIDersRegistrationAndHomePage page = new US001_UIDersRegistrationAndHomePage();
    @Given("Go to GMI BANK Qa environment Home Page")
    public void goToGMIBANKQaEnvironmentHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmibank_url"));
    }

    @And("User should navigate to Registration page")
    public void userShouldNavigateToRegistrationPage() {
        page.iconButton.click();
        page.registerButtonHomePage.click();
        actions.
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).perform();
    }

    @Then("User clicks on the Email text box\\(Isterseniz yazabilirsiniz)")
    public void userClicksOnTheEmailTextBoxIstersenizYazabilirsiniz() {
        actions.click(page.emailTextBox).perform();
    }

    @And("User provides an invalid Email {string}")
    public void userProvidesAnInvalidEmail(String invalidEmails) {
        page.emailTextBox.sendKeys(ConfigurationReader.getProperty(invalidEmails));
        actions.
                sendKeys(Keys.TAB).
                perform();
    }

    @And("User should see the This field is invalid error message")
    public void userShouldSeeTheErrorMessage() {
        Assert.assertEquals(ConfigurationReader.getProperty("e_hata_mesaji"), page.hataMesaji.getText());
    }
}
