package com.gmibank.stepdefinitions;

import com.gmibank.pages.US_001GmiBankHomePage;
import com.gmibank.pages.US_014GmiBankCreateAnAccountPage;
import com.gmibank.pages.US_014GmiBankSignInPage;
import com.gmibank.utilities.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;


public class US_014_StepDefinitions {

    US_001GmiBankHomePage homePage = new US_001GmiBankHomePage();
    US_014GmiBankSignInPage signInPage = new US_014GmiBankSignInPage();
    US_014GmiBankCreateAnAccountPage createAnAccountPage = new US_014GmiBankCreateAnAccountPage();


    @Given("User clicks on the picture button")
    public void user_clicks_on_the_picture_button() {
        homePage.picture.click();

    }

    @Given("User Clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
        homePage.signInButton.click();

    }

    @Given("User enters their username in the username textbox")
    public void user_enters_their_username_in_the_username_textbox() {
        signInPage.usernameTextbox.sendKeys(ConfigReader.getProperty("usernameSignIn"));

    }

    @Given("User enters their password in the password textbox")
    public void user_enters_their_password_in_the_password_textbox() {
        signInPage.passwordTextbox.sendKeys(ConfigReader.getProperty("passwordSigIn"));

    }

    @Given("User clicks the sign in button on the login page.")
    public void user_clicks_the_sign_in_button_on_the_login_page() {
        signInPage.signInButton.click();

    }

    @And("User clicks My Operations button")
    public void userClicksMyOperationsButton() {
        createAnAccountPage.myOperations.click();

    }

    @And("User clicks Manage Accounts button")
    public void userClicksManageAccountsButton() {
        createAnAccountPage.manageAccounts.click();
    }

    @Given("User clicks Create a new account button")
    public void user_clicks_create_a_new_account_button() {
        createAnAccountPage.createNewAccount.click();

    }

    @Given("User enters their all informations in the textboxes")
    public void user_enters_their_all_informations_in_the_textboxes() {
        createAnAccountPage.descriptionTextbox.sendKeys("description");
        createAnAccountPage.balanceTextbox.sendKeys(ConfigReader.getProperty("balance"));
        Select select = new Select(createAnAccountPage.accountTypeDropdown);
        select.selectByValue(ConfigReader.getProperty("value1"));
        Select select1 = new Select(createAnAccountPage.accountStatusTypeDropdown);
        select1.selectByValue(ConfigReader.getProperty("value2"));



    }

    @Given("User clicks Create date button")
    public void user_clicks_create_date_button() {
        createAnAccountPage.createDateTextbox.click();


    }

    @And("User enters the date and the time")
    public void userEntersTheDateAndTheTime(){
        createAnAccountPage.createDateTextbox.sendKeys("03122020"+ Keys.TAB+"1300");
    }

    @Then("User clicks save button and should see that the account can not be created.")
    public void user_clicks_save_button_and_should_see_that_the_account_can_not_be_created() {
        createAnAccountPage.saveButton.click();
        try{Assert.assertTrue(createAnAccountPage.invalidMessage.isDisplayed());
        }catch (Exception e){
            Assert.assertTrue(false);

        }


    }

    @Then("You should see the date as month,day, year,hour and minute.")
    public void you_should_see_the_date_as_month_day_year_hour_and_minute() {

        String actualTime = createAnAccountPage.createDateTextbox.getAttribute("value");
        String expectedTime = "2020-03-12T13:00";
        Assert.assertEquals(expectedTime,actualTime);





    }



}
