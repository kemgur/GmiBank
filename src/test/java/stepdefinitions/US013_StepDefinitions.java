package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.US013_NewAccountPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US013_StepDefinitions {
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
    public void aDataMustBeEnteredInTheDescriptionField() {
        newAccountPage.descriptionTextBox.sendKeys(ConfigReader.getProperty("description_text"));
    }

    //@Given("Should get a warning if the Description field is blank")
    //public void should_get_a_warning_if_the_description_field_is_blank() {
       // Assert.assertTrue(newAccountPage.descriptionError.isDisplayed());
    //}

    @Given("Money in dollars must be entered in the balance field")
    public void money_in_dollars_must_be_entered_in_the_balance_field() {
        newAccountPage.balanceTextBox.sendKeys(ConfigReader.getProperty("balance"));
    }

    //@Then("If left blank, an error message should be received")
   // public void if_left_blank_an_error_message_should_be_received() {
       // Assert.assertTrue(newAccountPage.balanceError.isDisplayed());

   // }

    @Given("customer should be able to select their account type from the drop down menu")
    public void customer_should_be_able_to_select_their_account_type_from_the_drop_down_menu() {
        WebElement dropDown = newAccountPage.accountTypeDropDown;
        Select select = new Select(dropDown);
        select.selectByValue("SAVING");
    }

    @Given("customer should be able to choose account status")
    public void customer_should_be_able_to_choose_account_status() {
        WebElement dropDown = newAccountPage.statusTypeDropDown;
        Select select = new Select(dropDown);
        select.selectByValue("ACTIVE");
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
    public void customer_should_be_able_to_save_when_customer_presses_save_button() {
        newAccountPage.saveButton.click();
    }

    @And("user close the page")
    public void userCloseThePage() {
        Driver.closeDriver();
    }
}

