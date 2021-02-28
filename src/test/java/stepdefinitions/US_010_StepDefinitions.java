package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.US_010_and_012_EpployeeCustomerPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_010_StepDefinitions {
    US_010_and_012_EpployeeCustomerPage customerAdressCreatePage= new US_010_and_012_EpployeeCustomerPage();

    @When("user goes to {string}")
    public void user_goes_to(String GmiBank_url) {
        Driver.getDriver().get(ConfigReader.getProperty(GmiBank_url));
    }

    @And("user clicks on SignIn Dropdown menu")
    public void userClicksOnSignInDropdownMenu() {
        customerAdressCreatePage.SignInDropdown.click();
    }

    @When("user clicks on Sign In  link")
    public void user_clicks_on_sign_in_link() {
        customerAdressCreatePage.SignIn.click();
    }

    @When("user sends valid employee {string} to username textbox")
    public void user_sends_valid_employee_to_username_textbox(String employee_username) {
        customerAdressCreatePage.usernameTextBox.sendKeys(ConfigReader.getProperty(employee_username));

    }

    @When("user enters valid employee {string} in the password textbox")
    public void user_enters_valid_employee_in_the_password_textbox(String employee_password) {
        customerAdressCreatePage.passwordTextBox.sendKeys(ConfigReader.getProperty(employee_password));

    }

    @When("user clicks on Sign In button")
    public void user_clicks_on_sign_in_button() throws InterruptedException {
        customerAdressCreatePage.SignInButton.click();

    }

    @When("user clicks on My Operations link")
    public void user_clicks_on_my_operations_link() {
        customerAdressCreatePage.myOperations.click();

    }

    @When("user clicks on Manage Customers")
    public void user_clicks_on_manage_customers() {

        customerAdressCreatePage.manageCustomers.click();
    }

    @When("user clicks on Create a new Customer link")
    public void user_clicks_on_create_a_new_customer_link() {
        customerAdressCreatePage.createNewCustomer.click();
    }

    @When("user enters a {string} in First Name textbox")
    public void user_enters_a_in_first_name_textbox(String first_name) {
        customerAdressCreatePage.firstnameTextBox.sendKeys(ConfigReader.getProperty(first_name));
    }

    @When("user enters a {string} in Last Name textbox")
    public void user_enters_a_in_last_name_textbox(String last_name) {
        customerAdressCreatePage.lastnameTextBox.sendKeys(ConfigReader.getProperty(last_name));
    }

    @When("user enters a {string} in Middle Initial textbox")
    public void user_enters_a_in_middle_initial_textbox(String middle_initial) {
        customerAdressCreatePage.middleinitialTextBox.sendKeys(ConfigReader.getProperty(middle_initial));
    }

    @When("user enters a {string} in Email textbox")
    public void user_enters_a_in_email_textbox(String email) {
        customerAdressCreatePage.emailTextBox.sendKeys(ConfigReader.getProperty(email));
    }
   @When("user enters a {string} in Mobile Phone Number textbox")
    public void user_enters_a_in_mobile_phone_number_textbox(String mobil_phone_number) {
        customerAdressCreatePage.mobilphonenumberTextBox.sendKeys(ConfigReader.getProperty(mobil_phone_number));
    }

    @When("user enters a {string} in Phone Number textbox")
    public void user_enters_a_in_phone_number_textbox(String phone_number) {
       customerAdressCreatePage.phonenumberTextBox.sendKeys(ConfigReader.getProperty(phone_number));
    }

    @When("user enters a {string} in Zip Code textbox")
    public void user_enters_a_in_zip_code_textbox(String zip_code) {
        customerAdressCreatePage.zipcodeTextBox.sendKeys(ConfigReader.getProperty(zip_code));
    }

    @When("user doesn't enter  anything in Adress textbox")
    public void user_doesn_t_enter_anything_in_adress_textbox() {

    }

    @When("user enters a {string} in City textbox")
    public void user_enters_a_in_city_textbox(String city) {
        customerAdressCreatePage.cityTextBox.sendKeys(ConfigReader.getProperty(city));
    }

    @When("user enters a {string} in Ssn Code textbox")
    public void user_enters_a_code_in_ssn_code_textbox(String ssn_code) {
        customerAdressCreatePage.ssnTextBox.clear();
        customerAdressCreatePage.ssnTextBox.sendKeys(ConfigReader.getProperty(ssn_code));
    }

    @When("user creates {string}")
    public void user_creates(String date) {
       customerAdressCreatePage.createDate.sendKeys(ConfigReader.getProperty(date));
    }

    @When("user selects {string} from Country dropdown menu")
    public void user_selects_from_country_dropdown_menu(String country) {
        Select select = new Select(customerAdressCreatePage.countryDropdown);
        select.selectByVisibleText(ConfigReader.getProperty(country));
    }

    @When("user selects {string} from User dropdown menu")
    public void user_selects_from_user_dropdown_menu(String user) {
       // Select select = new Select(customerAdressCreatePage.userDropdown);
        //select.selectByVisibleText(ConfigReader.getProperty(user));
    }

    @When("user clicks on Save button")
    public void user_clicks_on_save_button() {
        customerAdressCreatePage.saveButton.click();

    }

    @Then("user should see this message under Address textbox: {string}")
    public void user_should_see_this_message_under_address_textbox(String required_message) {
        Assert.assertEquals(ConfigReader.getProperty(required_message), customerAdressCreatePage.requiredMessage.getText());
    }

    @And("user enters an {string} in Address textbox")
    public void userEntersAnInAddressTextbox(String address) {
        customerAdressCreatePage.addressTextBox.sendKeys(ConfigReader.getProperty(address));
    }

    @Given("user doesn't enter  anything in Citytextbox")
    public void user_doesn_t_enter_anything_in_citytextbox() {

    }

    @Then("user should see this message under City textbox: {string}")
    public void user_should_see_this_message_under_city_textbox(String required_message) {
        Assert.assertEquals(ConfigReader.getProperty(required_message), customerAdressCreatePage.requiredMessage.getText());
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
        Assert.assertFalse(customerAdressCreatePage.createdMessage.isDisplayed());
    }
}
