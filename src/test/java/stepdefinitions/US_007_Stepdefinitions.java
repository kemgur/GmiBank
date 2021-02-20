package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.UpdateUserInformationPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_007_Stepdefinitions {

    UpdateUserInformationPage updateUserInformationPage=new UpdateUserInformationPage();

    @Given("Go to {string}")
    public void go_to(String gmibank) {
        Driver.getDriver().get(gmibank);
    }

    @Given("Navigate to sign in page")
    public void navigate_to_sign_in_page() {
        updateUserInformationPage.accountMenu.click();
        updateUserInformationPage.signInFirst.click();
    }

    @Given("Enter {string} in username textbox")
    public void enter_in_username_textbox(String username) {
        updateUserInformationPage.usernameTextBox.sendKeys(ConfigReader.getProperty(username));

    }

    @Given("Enter {string} in the password text box")
    public void enter_in_the_password_text_box(String password) {
       updateUserInformationPage.passwordTextBox.sendKeys(ConfigReader.getProperty(password));
    }

    @Given("Click the sign in button")
    public void click_the_sign_in_button() {
        updateUserInformationPage.signInSecond.click();

    }

    @Given("Navigate to user info page")
    public void navigate_to_user_info_page() {
        updateUserInformationPage.userAktas.click();
        updateUserInformationPage.userInfo.click();
    }

    @Given("Delete the mail in the email text box")
    public void delete_the_mail_in_the_email_text_box() {
        updateUserInformationPage.emailTextBox.clear();

    }

    @Given("Enter a letter-only {string} into the email text box")
    public void enter_a_letter_only_into_the_email_text_box(String email) {
        updateUserInformationPage.emailTextBox.sendKeys(ConfigReader.getProperty(email));

    }

    @Then("Then I should see the error message {string}")
    public void then_i_should_see_the_error_message(String error) {
        Assert.assertTrue(updateUserInformationPage.errorMessage.getText().contains(ConfigReader.getProperty(error)));

    }




    @And("Click the save button")
    public void clickTheSaveButton() {
        updateUserInformationPage.saveButton.click();

    }

    @Then("Then I should see the saved message {string}")
    public void thenIShouldSeeTheSavedMessage(String savedmessage) {
        Assert.assertTrue(updateUserInformationPage.settingsSavedMessage.getText().contains(savedmessage));
    }

    @And("Select the {string} option from the language dropdown")
    public void selectTheOptionFromTheLanguageDropdown(String language) {
        Select select=new Select(updateUserInformationPage.languageDropdown);
        select.selectByVisibleText(language);
    }


}
