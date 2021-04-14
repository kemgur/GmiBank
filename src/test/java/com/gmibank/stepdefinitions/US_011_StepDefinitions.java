package com.gmibank.stepdefinitions;

import com.gmibank.pages.US_011_DateCreatedOnTheTimePage;
import com.gmibank.utilities.ConfigurationReader;
import com.gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import java.time.LocalDate;


public class US_011_StepDefinitions {

    US_011_DateCreatedOnTheTimePage updateDate=new US_011_DateCreatedOnTheTimePage();


    @Given("click to My Operations and click the Manage Accounts")
    public void click_to_my_operations_and_click_the_manage_accounts() {

        ReusableMethods.waitFor(1);
        updateDate.dropDown.click();
        ReusableMethods.waitFor(1);
        updateDate.manageCustomer.click();
        ReusableMethods.waitFor(1);
    }

    @Given("click on the create a new customer button")
    public void click_on_the_create_a_new_customer_button() {

        updateDate.createNewCustomer.click();
        ReusableMethods.waitFor(1);

    }

    @Then("the date should the time of creating a customer")
    public void the_date_should_the_time_of_creating_a_customer() {

        System.out.println(updateDate.verifyDate.getText());

        updateDate.verifyDate.getText();

        String expectedDate="2021-02-24";

        LocalDate now= LocalDate.now();
        String a = updateDate.verifyDate.getAttribute("2021-02-25T00:00");
        System.out.println(a);
        //Assert.assertEquals(expectedDate, updateDate.verifyDate.getText());
    }

    @Then("The date should be created as month, day, year, hour and minute")
    public void the_date_should_be_created_as_month_day_year_hour_and_minute() {

    }

    @Given("select specific customer from the registration list and get ID")
    public void select_specific_customer_from_the_registration_list_and_get_id() {

        ReusableMethods.waitFor(2);
        String actualDI=updateDate.verifyID.getText();
        updateDate.chooseUser.click();
        ReusableMethods.waitFor(2);


    }

    @Then("verify the ID that you selected from the registration page")
    public void verify_the_id_that_you_selected_from_the_registration_page() {

        String actualDI=updateDate.verifyID.getText();
        String expectedID=updateDate.IDexpected.getText();
        Assert.assertEquals(expectedID,actualDI);
    }

    @Given("click on the edit button")
    public void click_on_the_edit_button() {
        updateDate.editAccount.click();
        updateDate.updatePhoneNumber.clear();
        ReusableMethods.waitFor(3);

    }

    @Then("update {string} from phone number blank")
    public void update_from_phone_number_blank(String phone) {
        updateDate.updatePhoneNumber.sendKeys(ConfigurationReader.getProperty(phone));
        ReusableMethods.waitFor(2);
    }

    @Then("User can select Zelle Enrolled optionally and save it")
    public void user_can_select_zelle_enrolled_optionally_and_save_it() {

        updateDate.zelle.click();
        ReusableMethods.waitFor(1);
        updateDate.zelle.click();
        ReusableMethods.waitFor(2);
        updateDate.saveBtn.click();
    }
}
