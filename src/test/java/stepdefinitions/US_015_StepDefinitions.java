package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US_002GmiHomePage;
import pages.US_015_LoginPage;
import pages.US_015_MyAccountsPage;
import pages.US_015_UserPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_015_StepDefinitions {
    US_002GmiHomePage homePage = new US_002GmiHomePage();
    US_015_LoginPage loginPage = new US_015_LoginPage();
    US_015_UserPage userPage = new US_015_UserPage();
    US_015_MyAccountsPage myAccountsPage = new US_015_MyAccountsPage();

    @And("User navigates to login page")
    public void userNavigatesToLoginPage() {
        homePage.picture.click();
        ReusableMethods.waitFor(1);
        homePage.loginButton.click();
    }

    @Then("User provides {string} username")
    public void userProvidesUsername(String usernames) {
        loginPage.usernameTextbox.sendKeys(ConfigReader.getProperty(usernames));
    }

    @Then("User provides {string} password")
    public void userProvidesPassword(String passwords) {
        loginPage.passwordTextbox.sendKeys(ConfigReader.getProperty(passwords));
    }

    @Then("User clicks Sign in button")
    public void userClicksSignInButton() {
        loginPage.signInButton.click();
    }

    @And("User navigates to My accounts page")
    public void userNavigatesToMyAccountsPage() {
        userPage.myOperations.click();
        Driver.wait(1);
        userPage.myAccounts.click();
    }

    @And("User should see his-her Account types")
    public void userShouldSeeHisHerAccountTypes() {
        Assert.assertTrue(myAccountsPage.firstAccountType.isDisplayed());
        Assert.assertTrue(myAccountsPage.secondAccountType.isDisplayed());
    }


    @Then("User should see his-her Accounts transactions")
    public void userShouldSeeHisHerAccountsTransactions() {
        Assert.assertTrue(myAccountsPage.transactionId.isDisplayed());
    }

    @And("User click view Transaction button")
    public void userClickViewTransactionButton() {
        myAccountsPage.viewTransaction.click();
    }
}
