package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US003_StongPasswordPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US003_StepDefinitions {

    US003_StongPasswordPage strongPassword = new US003_StongPasswordPage();

    @Given("Go to {string}")
    public void go_to(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("gmi_url"));

    }
    //public void log_in_yazisina_tiklar() {
    //        ckHotelsPage.ilkLogIn.click();
    //    }
    @Then("Click the login button from the login page")
    public void click_the_login_button_from_the_login_page() {
        strongPassword.accountMenu.click();
    }

    @Then("Click the register button from the popup window")
    public void click_the_register_button_from_the_popup_window() {
        strongPassword.registerButton.click();
    }

    @Then("scroll down the page")
    public void scroll_down_the_page() {
        strongPassword.scroolPage();
    }


    @Then("Enter a password in lower case in the new password")
    public void enter_a_password_in_lower_case_in_the_new_password() {
        strongPassword.firstPassword.sendKeys(ConfigReader.getProperty("lower_Case"));
    }

    @Then("see change in Password strength")
    public void see_change_in_password_strength() {
        Assert.assertTrue(strongPassword.redPoint.isDisplayed());

    }

}
