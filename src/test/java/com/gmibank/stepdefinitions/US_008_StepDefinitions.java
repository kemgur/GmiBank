package com.gmibank.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import com.gmibank.pages.US_008GmiPasswordHomePage;
import com.gmibank.utilities.ConfigurationReader;
import com.gmibank.utilities.Driver;



public class US_008_StepDefinitions {

    US_008GmiPasswordHomePage us008PasswordPage=new US_008GmiPasswordHomePage();

    @Given("User go to {string}")
    public void user_go_to(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Given("User Click the icon in homepage")
    public void user_click_the_sign_in_button_from_popup_window() {
        us008PasswordPage.iconHomePage.click();
    }
    @Then("User Click the sign in button")
    public void user_click_the_sign_in_button() {
      us008PasswordPage.signinButtonHomePage.click();
    }

    @Then("User Enter a valid {string} and {string}")
    public void user_enter_a_valid_and(String string, String string2) {
       us008PasswordPage.usernameTextbox.sendKeys(ConfigurationReader.getProperty("username"));
       us008PasswordPage.passwordTextbox.sendKeys(ConfigurationReader.getProperty("current_password"));
    }
    @Then("User click the signin button in signin page")
    public void User_click_the_signin_button_in_signin_page(){
        us008PasswordPage.signInButtonSignInPage.click();
    }
    @Then("User click the icon in user page")
    public void User_click_the_icon_in_user_page(){
        us008PasswordPage.iconUserPage.click();
    }


    @Then("User Click the password button from popup window")
    public void user_click_the_password_button_from_popup_window() {
      us008PasswordPage.passwordButtonUserPage.click();
    }

    @Given("User Enter current password on the current password field")
    public void user_enter_current_password1_on_the_current_password_field() {
        us008PasswordPage.currentPasswordTextbox.sendKeys(ConfigurationReader.getProperty("current_password"));
    }

    @Then("User Enter current password on the new password field")
    public void user_enter_current_password1_on_the_new_password_field() {
        us008PasswordPage.newPasswordTextbox.sendKeys(ConfigurationReader.getProperty("current_password"));
    }

    @Then("User Enter current password on confirmation field")
    public void user_enter_current_password1_on_confirmation_field() {
       us008PasswordPage.confirmPasswordTextbox.sendKeys(ConfigurationReader.getProperty("current_password"));
    }

    @Then("User Click the save button")
    public void user_click_the_save_button() throws InterruptedException {
        us008PasswordPage.saveButtonInPasswordPage.click();
        Thread.sleep(2000);
    }

    @Then("User See the error message")
    public void user_see_the_error_message(){
    try{
        Assert.assertTrue(us008PasswordPage.errorMessage.isDisplayed());
    }catch(Exception e){
        Assert.assertTrue(false);
    }

    }

    @Given("User Enter on the new password field least one lowercase char for stronger password")
    public void user_enter_on_the_new_password_field_least_lowercase_char_for_stronger_password() {
      us008PasswordPage.newPasswordTextbox.sendKeys(ConfigurationReader.getProperty("lower_password"));
    }

    @Given("User see the level chart change accordingly red")
    public void user_see_the_level_chart_change_accordingly_red() {
     Assert.assertTrue(us008PasswordPage.passwordStrengthPointRed.isDisplayed());

    }

    @Given("User Enter on the new password field least one uppercase char for stronger password")
    public void user_enter_on_the_new_password_field_least_uppercase_char_for_stronger_password() {
       us008PasswordPage.newPasswordTextbox.sendKeys(ConfigurationReader.getProperty("upper_password"));
    }
    @Given("User see the level chart change accordingly orange")
    public void user_see_the_level_chart_change_accordingly_orange() {
        Assert.assertTrue(us008PasswordPage.passwordStrengthPointOrange.isDisplayed());

    }

    @Given("User Enter on the new password field least one digit  for stronger password")
    public void user_enter_on_the_new_password_field_least_digit_for_stronger_password() {
        us008PasswordPage.newPasswordTextbox.sendKeys(ConfigurationReader.getProperty("digit_password"));
    }
    @Given("User see the level chart change accordingly yellow")
    public void user_see_the_level_chart_change_accordingly_second_yellow() {
        try{
            Assert.assertFalse(us008PasswordPage.passwordStrengthPointYellow.isDisplayed());
        }catch(NoSuchElementException e){
            Assert.assertTrue(false);
        }

    }

    @Given("User Enter on the new password field least one special char  for stronger password")
    public void user_enter_on_the_new_password_field_least_special_char_for_stronger_password() {

        us008PasswordPage.newPasswordTextbox.sendKeys(ConfigurationReader.getProperty("special_password"));
    }
    @Given("User see the level chart change accordingly lime")
    public void user_see_the_level_chart_change_accordingly_lime() {
        Assert.assertTrue(us008PasswordPage.passwordStrengthPointLime.isDisplayed());

    }

    @Given("User Enter at least seven chars for a stronger password")
    public void user_enter_at_least_chars_for_a_stronger_password() {
        us008PasswordPage.newPasswordTextbox.sendKeys(ConfigurationReader.getProperty("sevenChar_password"));
    }
    @Given("User see the level chart change accordingly green")
    public void user_see_the_level_chart_change_accordingly_second_green() {
        Assert.assertTrue(us008PasswordPage.passwordStrengthPointGreen.isDisplayed());

    }

    @Then("User Enter a new password on the new password field")
    public void user_enter_a_new_password_on_the_new_password_field() {
       us008PasswordPage.newPasswordTextbox.sendKeys(ConfigurationReader.getProperty("new_password_7chars"));
    }

    @Then("User Enter a new password on the confirm field")
    public void user_enter_a_new_password_on_the_confirm_field() {
        us008PasswordPage.confirmPasswordTextbox.sendKeys(ConfigurationReader.getProperty("new_password_7chars"));
    }

    @Then("User See the password changed message")
    public void user_see_the_password_changed_message() {
        Assert.assertTrue(us008PasswordPage.passwordChangedMessage.isDisplayed());
        us008PasswordPage.currentPasswordTextbox.clear();
        us008PasswordPage.currentPasswordTextbox.sendKeys(ConfigurationReader.getProperty("new_password_7chars"));
        us008PasswordPage.newPasswordTextbox.clear();
        us008PasswordPage.newPasswordTextbox.sendKeys(ConfigurationReader.getProperty("current_password"));
        us008PasswordPage.confirmPasswordTextbox.clear();
        us008PasswordPage.confirmPasswordTextbox.sendKeys(ConfigurationReader.getProperty("current_password"));
        us008PasswordPage.saveButtonInPasswordPage.click();
    }

}
