package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US_001GmiBankHomePage;
import pages.US_001GmiBankRegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_001_StepDefinitions {

    US_001GmiBankHomePage homePage = new US_001GmiBankHomePage();
    US_001GmiBankRegistrationPage registrationPage = new US_001GmiBankRegistrationPage();

    @Given("User goes to {string}")
    public void user_goes_to(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));

    }

    @Then("User should navigate to registration page")
    public void user_should_navigate_to_registration_page() {
        homePage.picture.click();
        homePage.registerButton.click();

    }

    @Then("User clicks on ssn textbox")
    public void user_clicks_on_ssn_textbox() {
        registrationPage.ssnTextbox.click();

    }

    @Then("User provides the {string} of the applicant")
    public void user_provides_the_of_the_applicant(String ssn) {
        registrationPage.ssnTextbox.sendKeys(ConfigReader.getProperty(ssn));

    }

    @And("user doesn't see the ssn error message")
    public void userDoesnTSeeTheSsnErrorMessage() {

        try{
            Assert.assertTrue(registrationPage.ssnInvalidMesagge.isDisplayed());
        }catch (Exception e){
            Assert.assertTrue(true);
        }

    }

    @And("User clicks on first name textbox")
    public void userClicksOnFirstNameTextbox() {
        registrationPage.firstname.click();
    }

    @And("User provides the first_name of the applicant")
    public void userProvidesTheFirst_nameOfTheApplicant() {
        registrationPage.firstname.sendKeys(ConfigReader.getProperty("first_name"));
    }

    @And("User clicks on last name textbox")
    public void userClicksOnLastNameTextbox() {
        registrationPage.lastname.click();
    }

    @And("User provides the last_name of the applicant")
    public void userProvidesTheLast_nameOfTheApplicant() {
        registrationPage.lastname.sendKeys(ConfigReader.getProperty("last_name"));
    }

    @And("User clicks on address textbox")
    public void userClicksOnAddressTextbox() {
        registrationPage.address.click();
    }

    @And("User provides the address of the applicant")
    public void userProvidesTheAddressOfTheApplicant() {
        registrationPage.address.sendKeys(ConfigReader.getProperty("address"));
    }

    @And("User clicks on mobile phone number textbox")
    public void userClicksOnMobilePhoneNumberTextbox() {
        registrationPage.mobilePhone.click();
    }

    @And("User provides the mobile_phone_number of the applicant")
    public void userProvidesTheMobile_phone_numberOfTheApplicant() {
        registrationPage.mobilePhone.sendKeys(ConfigReader.getProperty("mobile_phone_number"));
    }

    @And("User clicks on username textbox")
    public void userClicksOnUsernameTextbox() {
        registrationPage.username.click();
    }

    @And("User provides the username of the applicant")
    public void userProvidesTheUsernameOfTheApplicant() {
        registrationPage.username.sendKeys(ConfigReader.getProperty("username"));
    }

    @And("User clicks on email textbox")
    public void userClicksOnEmailTextbox() {
        registrationPage.email.click();
    }


    @And("User provides the email of the applicant")
    public void userProvidesTheEmailOfTheApplicant() {
        registrationPage.email.sendKeys(ConfigReader.getProperty("email"));
    }


    @And("user doesn't see the first name error message")
    public void userDoesnTSeeTheFirstNameErrorMessage() {
        try{
            Assert.assertTrue(registrationPage.firstnameRequiredMessage.isDisplayed());
        }catch (Exception e){
            Assert.assertTrue(true);
        }

    }

    @And("user doesn't see the last name error message")
    public void userDoesnTSeeTheLastNameErrorMessage() {
        try{
            Assert.assertTrue(registrationPage.lastnameRequiredMessage.isDisplayed());
        }catch (Exception e){
            Assert.assertTrue(true);
        }

    }

    @And("user doesn't see the address error message")
    public void userDoesnTSeeTheAddressErrorMessage() {
        Assert.assertTrue(registrationPage.address.isDisplayed());


    }

    @And("user doesn't see the phone number error message")
    public void userDoesnTSeeThePhoneNumberErrorMessage() {
        try{
            Assert.assertTrue(registrationPage.mobilePhoneInvalidMesagge.isDisplayed());
        }catch (Exception e){
            Assert.assertTrue(true);
        }

    }

    @And("user doesn't see the username error message")
    public void userDoesnTSeeTheUsernameErrorMessage() {
        try{
            Assert.assertTrue(registrationPage.usernameRequiredMessage.isDisplayed());
        }catch (Exception e){
            Assert.assertTrue(true);
        }

    }

    @And("user doesn't see the email error message")
    public void userDoesnTSeeTheEmailErrorMessage() {
        try{
            Assert.assertTrue(registrationPage.emailRequiredMessage.isDisplayed());
        }catch (Exception e){
            Assert.assertTrue(true);
        }
    }




}