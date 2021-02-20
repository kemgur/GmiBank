package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.US_002GmiHomePage;
import pages.US_002GmiRegisterPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_002_StepDefinitions {

    US_002GmiHomePage homePage = new US_002GmiHomePage();
    US_002GmiRegisterPage registerPage = new US_002GmiRegisterPage();

    @Given("User on the login page")
    public void userOnTheLoginPage() {
        Driver.getDriver().get(ConfigReader.getProperty("gmi_home_page"));
    }

    @And("User navigates to register page")
    public void userNavigatesToRegisterPage() {
        homePage.picture.click();
        homePage.registerButton.click();
    }

    @Then("User clicks on SSN textbox")
    public void userClicksOnSSNTextbox() throws InterruptedException {
        registerPage.ssnTextbox.click();
        Thread.sleep(5000);

    }

    @Then("User doesnt provide {string} and click tab")
    public void userDoesntProvideAndClickTab(String data) {
        registerPage.ssnTextbox.sendKeys(Keys.TAB);
    }

    @And("User should see the {string}")
    public void userShouldSeeThe(String errorMessage) {
        Assert.assertEquals(ConfigReader.getProperty(errorMessage), registerPage.ssnErrorMessage.getText());
    }

    @Then("User clicks on First Name textbox")
    public void userClicksOnFirstNameTextbox() {
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
        registerPage.newPasswordConformationTextbox.click();
    }
}
