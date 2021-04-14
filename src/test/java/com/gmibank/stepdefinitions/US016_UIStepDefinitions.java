package com.gmibank.stepdefinitions;

import com.gmibank.pages.US016_UIDersSignInAndCustomerPage;
import com.gmibank.utilities.ConfigurationReader;
import com.gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;

public class US016_UIStepDefinitions {
    int totalBalance1;
    int totalBalance2;
    int gonderilcekPara;
    int gonderilcekParaCent;
    US016_UIDersSignInAndCustomerPage signInCustomerPage = new US016_UIDersSignInAndCustomerPage();

    @And("DUser navigates to sign in page")
    public void duserNavigatesToSignInPage() {
        signInCustomerPage.iconButton.click();
        Driver.wait(1);
        signInCustomerPage.signInButtonHomePage.click();
        Driver.wait(1);
    }

    @Then("DUser provide a valid username")
    public void duserProvideAValidUsername() {
        signInCustomerPage.usernameTextBox.sendKeys(ConfigurationReader.getProperty("e_username1"));
        Driver.wait(1);
    }

    @And("DUser provide a valid password")
    public void duserProvideAValidPassword() {
        signInCustomerPage.passwordTextBox.sendKeys(ConfigurationReader.getProperty("e_password1"));
        Driver.wait(1);
    }

    @Then("DUser click on the sign in button")
    public void duserClickOnTheSignInButton() {
        signInCustomerPage.signInButtonSignInPage.click();
        Driver.wait(1);
    }

    @And("DUser navigates My Accounts Page")
    public void duserNavigatesMyAccountsPage() {
        signInCustomerPage.myOperationsButton.click();
        Driver.wait(1);
        signInCustomerPage.myAccountsButton.click();
        Driver.wait(1);
    }

    @Then("DUser gets the info about Users accounts balance")
    public void duserGetsTheInfoAboutUsersAccountsBalance() {
        totalBalance1 = Integer.parseInt(signInCustomerPage.firstAccountBalance.getText());
        Driver.wait(1);
        totalBalance2 = Integer.parseInt(signInCustomerPage.secondAccountBalance.getText());
        Driver.wait(1);
    }

    @And("DUser navigates to Transfer Money Page")
    public void duserNavigatesToTransferMoneyPage() {
        signInCustomerPage.myOperationsButton.click();
        Driver.wait(1);
        signInCustomerPage.transferMoneyButton.click();
        Driver.wait(1);
    }

    @Then("DUser does the money transfer")
    public void duserDoesTheMoneyTransfer() {
        gonderilcekPara = 100;
        gonderilcekParaCent = 50;
        Select select1 = new Select(signInCustomerPage.fromDropDown);
        select1.selectByIndex(1);
        Driver.wait(1);
        Select select2 = new Select(signInCustomerPage.toDropDown);
        select2.selectByIndex(1);
        Driver.wait(1);
        signInCustomerPage.balanceTextBox.sendKeys(gonderilcekPara + "");
        Driver.wait(1);
        signInCustomerPage.balanceCentTextBox.clear();
        Driver.wait(1);
        signInCustomerPage.balanceCentTextBox.sendKeys(gonderilcekParaCent + "");
        Driver.wait(1);
        signInCustomerPage.descriptionTextBox.sendKeys("Kira Parasi");
        Driver.wait(1);
        signInCustomerPage.makeTransferButton.click();
        Driver.wait(1);
    }

    @And("DUser validates that User s money transferred successfully")
    public void duserValidatesThatUserSMoneyTransferedSuccessfully() {
        signInCustomerPage.myOperationsButton.click();
        Driver.wait(1);
        signInCustomerPage.myAccountsButton.click();
        Driver.wait(1);

        Assert.assertEquals(totalBalance1 - (gonderilcekPara * 100 + gonderilcekParaCent) + "", signInCustomerPage.firstAccountBalance.getText());
        Assert.assertEquals(totalBalance2 + (gonderilcekPara*100 + gonderilcekParaCent) + "", signInCustomerPage.secondAccountBalance.getText());
    }


}
