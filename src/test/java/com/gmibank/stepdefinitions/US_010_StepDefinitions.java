package com.gmibank.stepdefinitions;

import com.gmibank.pages.US_010_and_012_EmployeeCustomerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import com.gmibank.utilities.ConfigurationReader;
import com.gmibank.utilities.Driver;
import com.gmibank.utilities.ReusableMethods;


public class US_010_StepDefinitions {
    US_010_and_012_EmployeeCustomerPage employeeCustomerPage= new US_010_and_012_EmployeeCustomerPage();

    @When("user goes to {string}")
    public void user_goes_to(String GmiBank_url) {
        Driver.getDriver().get(ConfigurationReader.getProperty(GmiBank_url));
    }

    @And("user clicks on SignIn Dropdown menu")
    public void userClicksOnSignInDropdownMenu() {
        employeeCustomerPage.SignInDropdown.click();
    }

    @When("user clicks on Sign In  link")
    public void user_clicks_on_sign_in_link() {
        employeeCustomerPage.SignIn.click();
    }

    @When("user sends valid employee {string} to username textbox")
    public void user_sends_valid_employee_to_username_textbox(String employee_username) {
        employeeCustomerPage.usernameTextBox.sendKeys(ConfigurationReader.getProperty(employee_username));

    }

    @When("user enters valid employee {string} in the password textbox")
    public void user_enters_valid_employee_in_the_password_textbox(String employee_password) {
        employeeCustomerPage.passwordTextBox.sendKeys(ConfigurationReader.getProperty(employee_password));

    }

    @When("user clicks on Sign In button")
    public void user_clicks_on_sign_in_button() throws InterruptedException {
        employeeCustomerPage.SignInButton.click();

    }

    @When("user clicks on My Operations link")
    public void user_clicks_on_my_operations_link() {
        employeeCustomerPage.myOperations.click();

    }

    @When("user clicks on Manage Customers")
    public void user_clicks_on_manage_customers() {

        employeeCustomerPage.manageCustomers.click();
    }

    @When("user clicks on Create a new Customer link")
    public void user_clicks_on_create_a_new_customer_link() {
        employeeCustomerPage.createNewCustomer.click();
    }

    @When("user enters a {string} in First Name textbox")
    public void user_enters_a_in_first_name_textbox(String first_name) {
        employeeCustomerPage.firstnameTextBox.clear();
        employeeCustomerPage.firstnameTextBox.sendKeys(ConfigurationReader.getProperty(first_name));
    }

    @When("user enters a {string} in Last Name textbox")
    public void user_enters_a_in_last_name_textbox(String last_name) {
        employeeCustomerPage.lastnameTextBox.clear();
        employeeCustomerPage.lastnameTextBox.sendKeys(ConfigurationReader.getProperty(last_name));
    }

    @When("user enters a {string} in Middle Initial textbox")
    public void user_enters_a_in_middle_initial_textbox(String middle_initial) {
        employeeCustomerPage.middleinitialTextBox.clear();
        employeeCustomerPage.middleinitialTextBox.sendKeys(ConfigurationReader.getProperty(middle_initial));
    }

    @When("user enters a {string} in Email textbox")
    public void user_enters_a_in_email_textbox(String email) {
        employeeCustomerPage.emailTextBox.clear();
        employeeCustomerPage.emailTextBox.sendKeys(ConfigurationReader.getProperty(email));
    }
   @When("user enters a {string} in Mobile Phone Number textbox")
    public void user_enters_a_in_mobile_phone_number_textbox(String mobil_phone_number) {
       employeeCustomerPage.mobilphonenumberTextBox.clear();
        employeeCustomerPage.mobilphonenumberTextBox.sendKeys(ConfigurationReader.getProperty(mobil_phone_number));
    }

    @When("user enters a {string} in Phone Number textbox")
    public void user_enters_a_in_phone_number_textbox(String phone_number) {
        employeeCustomerPage.phonenumberTextBox.clear();
        employeeCustomerPage.phonenumberTextBox.sendKeys(ConfigurationReader.getProperty(phone_number));
    }

    @When("user enters a {string} in Zip Code textbox")
    public void user_enters_a_in_zip_code_textbox(String zip_code) {
        employeeCustomerPage.zipcodeTextBox.clear();
        employeeCustomerPage.zipcodeTextBox.sendKeys(ConfigurationReader.getProperty(zip_code));
    }

    @When("user doesn't enter  anything in Adress textbox")
    public void user_doesn_t_enter_anything_in_adress_textbox() {

    }

    @When("user enters a {string} in City textbox")
    public void user_enters_a_in_city_textbox(String city) {
        employeeCustomerPage.cityTextBox.clear();
        employeeCustomerPage.cityTextBox.sendKeys(ConfigurationReader.getProperty(city));
    }

    @When("user enters a {string} in Ssn Code textbox")
    public void user_enters_a_code_in_ssn_code_textbox(String ssn_code) {
        employeeCustomerPage.ssnTextBox.clear();
        employeeCustomerPage.ssnTextBox.sendKeys(ConfigurationReader.getProperty(ssn_code));
    }

    @When("user creates {string}")
    public void user_creates(String date) {

       employeeCustomerPage.createDate.sendKeys(ConfigurationReader.getProperty(date));
    }

    @When("user selects {string} from Country dropdown menu")
    public void user_selects_from_country_dropdown_menu(String country) {
        Select select = new Select(employeeCustomerPage.countryDropdown);
        select.selectByVisibleText(ConfigurationReader.getProperty(country));
    }

    @When("user selects {string} from User dropdown menu")
    public void user_selects_from_user_dropdown_menu(String user) {

       // Select select = new Select(employeeCustomerPage.userDropdown);
        //select.selectByVisibleText(ConfigReader.getProperty(user));
    }

    @When("user clicks on Save button")
    public void user_clicks_on_save_button() {
        employeeCustomerPage.saveButton.click();

    }

    @Then("user should see this message under Address textbox: {string}")
    public void user_should_see_this_message_under_address_textbox(String required_message) {
        Assert.assertEquals(ConfigurationReader.getProperty(required_message), employeeCustomerPage.requiredMessage.getText());
    }

    @And("user enters an {string} in Address textbox")
    public void userEntersAnInAddressTextbox(String address) {
        employeeCustomerPage.addressTextBox.sendKeys(ConfigurationReader.getProperty(address));
    }

    @Given("user doesn't enter  anything in Citytextbox")
    public void user_doesn_t_enter_anything_in_citytextbox() {

    }

    @Then("user should see this message under City textbox: {string}")
    public void user_should_see_this_message_under_city_textbox(String required_message) {
        Assert.assertEquals(ConfigurationReader.getProperty(required_message), employeeCustomerPage.requiredMessage.getText());
    }


    @And("user doesn't select country from Country dropdown menu")
    public void userDoesnTSelectCountryFromCountryDropdownMenu() {

    }

    @Then("user shouldn't see this this message on the page: {string}")
    public void userShouldnTSeeThisMessageUnderCountryTextbox(String created_message) {
       // System.out.println(Driver.getDriver().switchTo().alert().getText());

    }

    @And("user doesn't enter a state in State textbox")
    public void userDoesnTEnterAStateInStateTextbox() {

    }

    @Then("user shouldn't see created_message")
    public void userShouldnTSeeCreated_message() {
        ReusableMethods.waitFor(1);
        Assert.assertFalse(employeeCustomerPage.createdMessage.isDisplayed());
    }
}
