package com.gmibank.stepdefinitions;

import com.gmibank.pages.US013_NewAccountPage;
import com.gmibank.utilities.ConfigReader;
import com.gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class US_013_StepDefinitions {
    US013_NewAccountPage newAccountPage = new US013_NewAccountPage();


    @Given("go to {string}")
    public void goTo(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty("gmi_url"));
    }

    @Then("Click the login button from the loginpage")
    public void click_the_login_button_from_the_loginpage() { newAccountPage.accountMenu.click(); }

    @Then("Click the Sign In button from the popup window")
    public void click_the_sign_in_button_from_the_popup_window() { newAccountPage.signInButton.click(); }

    @Then("enter a valid username and password")
    public void enter_a_valid_username_and_password() {
        newAccountPage.userNameTextBox.sendKeys(ConfigReader.getProperty("employee_login"));
        newAccountPage.passwordTextBox.sendKeys(ConfigReader.getProperty("employee_pw"));
    }

    @Then("Click the Sign in button")
    public void click_the_sign_in_button() {
        newAccountPage.secondSignInButton.click();
    }

    @Then("Click on the My Operation tab")
    public void click_on_the_my_operation_tab() {
        newAccountPage.myOperationButton.click();
    }

    @Then("click on Manage Account from the drop down tab")
    public void click_on_manage_account_from_the_drop_down_tab() {
        newAccountPage.manageAccountButton.click();
    }

    @Then("Click on Create A New Account from the page that opens")
    public void click_on_create_a_new_account_from_the_page_that_opens() {
        newAccountPage.createAccount.click();
    }


    @Given("a data must be entered in the description field")
    public void aDataMustBeEnteredInTheDescriptionField() throws InterruptedException {

        newAccountPage.descriptionTextBox.sendKeys(ConfigReader.getProperty("description_text"));
        Thread.sleep(3000);

    }


    @Given("Money in dollars must be entered in the balance field")
    public void money_in_dollars_must_be_entered_in_the_balance_field() throws InterruptedException {

        newAccountPage.balanceTextBox.sendKeys(ConfigReader.getProperty("balance"));
        Thread.sleep(3000);
    }


    @Given("customer should be able to select their account type from the drop down menu")
    public void customer_should_be_able_to_select_their_account_type_from_the_drop_down_menu() throws InterruptedException {

        WebElement dropDown = newAccountPage.accountTypeDropDown;
        Select select = new Select(dropDown);
        select.selectByValue("SAVING");
        Thread.sleep(3000);
    }

    @Given("customer should be able to choose account status")
    public void customer_should_be_able_to_choose_account_status() throws InterruptedException {
        WebElement dropDown = newAccountPage.statusTypeDropDown;
        Select select = new Select(dropDown);
        select.selectByValue("ACTIVE");
        Thread.sleep(3000);
    }

    @Given("should scroll down the page")
    public void should_scroll_down_the_page() {
        newAccountPage.scroolPage();
    }

    @Then("The user can choose an employee from the employee domain if they want")
    public void the_user_can_choose_an_employee_from_the_employee_domain_if_they_want() {
        //none
    }

    @Then("Customer should be able to save when customer presses save button")
    public void customer_should_be_able_to_save_when_customer_presses_save_button() throws InterruptedException {
        newAccountPage.descriptionTextBox.sendKeys(ConfigReader.getProperty("description_text"));
        newAccountPage.balanceTextBox.sendKeys(ConfigReader.getProperty("balance"));
        WebElement dropDown = newAccountPage.accountTypeDropDown;
        Select select = new Select(dropDown);
        select.selectByValue("INVESTING");
        Thread.sleep(3000);
        WebElement dropDown1 = newAccountPage.statusTypeDropDown;
        Select select1 = new Select(dropDown1);
        select1.selectByValue("SUESPENDED");
        Thread.sleep(3000);
        newAccountPage.scroolPage();
        newAccountPage.saveButton.click();
    }

    @And("user close the page")
    public void userCloseThePage() {
        Driver.closeDriver();
    }
}
