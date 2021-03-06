package com.gmibank.stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import com.gmibank.pages.UpdateUserInformationPage;
import com.gmibank.utilities.ConfigurationReader;
import com.gmibank.utilities.Driver;
import com.gmibank.utilities.ReusableMethods;

public class US_007_Stepdefinitions {

    UpdateUserInformationPage updateUserInformationPage=new UpdateUserInformationPage();

    @Given("Navigate to sign in page")
    public void navigate_to_sign_in_page() {
        updateUserInformationPage.accountMenu.click();
        updateUserInformationPage.signInFirst.click();
    }

    @Given("Enter {string} in username textbox")
    public void enter_in_username_textbox(String username) {
        updateUserInformationPage.usernameTextBox.sendKeys(ConfigurationReader.getProperty(username));

    }

    @Given("Enter {string} in the password text box")
    public void enter_in_the_password_text_box(String password) {
        updateUserInformationPage.passwordTextBox.sendKeys(ConfigurationReader.getProperty(password));
    }

    @Given("Click the sign in button")
    public void click_the_sign_in_button() {
        updateUserInformationPage.signInSecond.click();

    }

    @Given("Navigate to user info page")
    public void navigate_to_user_info_page() {
        updateUserInformationPage.user.click();
        updateUserInformationPage.userinfo.click();
    }

    @Given("Delete the mail in the email text box")
    public void delete_the_mail_in_the_email_text_box() {
        updateUserInformationPage.emailTextBox.clear();

    }

    @Given("Enter a letter-only {string} into the email text box")
    public void enter_a_letter_only_into_the_email_text_box(String email) {
        updateUserInformationPage.emailTextBox.sendKeys(ConfigurationReader.getProperty(email));

    }

    @Then("Then I should see the error message {string}")
    public void then_i_should_see_the_error_message(String error) {
        Assert.assertTrue(updateUserInformationPage.errorMessage.getText().contains(ConfigurationReader.getProperty(error)));

    }

    @And("Click the save button")
    public void clickTheSaveButton() {
        updateUserInformationPage.saveButton.click();

    }

    @And("Select the {string} option from the language dropdown")
    public void selectTheOptionFromTheLanguageDropdown(String language) throws InterruptedException {
        Select select=new Select(updateUserInformationPage.languageDropdown);
        select.selectByVisibleText(ConfigurationReader.getProperty(language));
        ReusableMethods.waitFor(3);
    }

    @Then("Then user should see the text {string} on the web page")
    public void thenUserShouldSeeTheTextOnTheWebPage(String languageSettings) throws InterruptedException {
        ReusableMethods.waitFor(3);
        Assert.assertEquals(ConfigurationReader.getProperty(languageSettings), updateUserInformationPage.settingSavedMessage.getText());
        ReusableMethods.waitFor(3);
    }

    @Given("user goes to {string} homepage")
    public void userGoesToHomepage(String gmibank) {
        Driver.getDriver().get(ConfigurationReader.getProperty(gmibank));
    }
}
