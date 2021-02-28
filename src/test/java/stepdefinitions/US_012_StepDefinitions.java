package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.US_010_and_012_EpployeeCustomerPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class US_012_StepDefinitions {

    US_010_and_012_EpployeeCustomerPage epployeeCustomerPage = new US_010_and_012_EpployeeCustomerPage();

    @And("user sees that the first customer's {string} is not empty")
    public void userSeesThatTheFirstCustomerSIsNotEmpty(String cellno) {

        WebElement header = epployeeCustomerPage.headers.get(Integer.valueOf(ConfigReader.getProperty(cellno)));

        WebElement data= epployeeCustomerPage.cells.get(Integer.valueOf(ConfigReader.getProperty(cellno)));
        System.out.println(header.getText()+" : "+data.getText());
        Assert.assertTrue(data.isDisplayed());

    }

    @And("user clicks on page {int}")
    public void userClicksOnPage(int arg0) {
        epployeeCustomerPage.page2.click();
        ReusableMethods.waitFor(1);
    }

    @And("user clicks on page_{int}")
    public void userClicksOnPage_(int arg0) {
        epployeeCustomerPage.page3.click();
        ReusableMethods.waitFor(1);
    }

    @And("user click on the first customer's View button")
    public void userClickOnTheFirstCustomerSViewButton() {
        epployeeCustomerPage.viewButton.click();
    }

    @Then("there should be Edit button at the bottom and left")
    public void thereShouldBeEditButtonAtTheBottomAndLeft() {
        Assert.assertTrue(epployeeCustomerPage.editViewButton.isDisplayed());
    }

    @Then("there should be Edit button  of first customer on the page that opens")
    public void thereShouldBeEditButtonOfFirstCustomerOnThePageThatOpens() {
        Assert.assertTrue(epployeeCustomerPage.editButton.isDisplayed());
        epployeeCustomerPage.editButton.click();
    }

    @And("user clicks on first customer's Edit button")
    public void userClicksOnFirstCustomerSEditButton() {
        epployeeCustomerPage.editButton.click();

    }

    @And("Then user should see {string}")
    public void thenUserShouldSee(String arg0) {
        Assert.assertTrue(epployeeCustomerPage.delete_message.isDisplayed());
        System.out.println(epployeeCustomerPage.delete_message.getText());
    }
    @When("user clicks on Delete button")
    public void user_clicks_on_delete_button() {

        WebElement son = Driver.getDriver().findElement(By.xpath("//li[@class='page-item disabled']"));
        son.click();
       epployeeCustomerPage.deleteButton.click();
    }

    @When("there is a Confirm Delete pop up")
    public void there_is_a_confirm_delete_pop_up() {
        epployeeCustomerPage.deleteConfirmButton.click();
    }

    @Then("user should see {string}")
    public void userShouldSee(String delete_message) {
        Assert.assertEquals(ConfigReader.getProperty(delete_message), epployeeCustomerPage.delete_message.getText());
        System.out.println(epployeeCustomerPage.delete_message.getText());
    }
}
