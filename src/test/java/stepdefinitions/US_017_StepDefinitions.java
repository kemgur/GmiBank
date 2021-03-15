package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.US_017_AdminToManageUsers;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US_017_StepDefinitions {

    US_017_AdminToManageUsers adminManage = new US_017_AdminToManageUsers();

    @Given("click on Administration drop-down")
    public void click_on_administration_drop_down() {
        adminManage.administrationDD.click();

    }

    @Given("click on the User management")
    public void click_on_the_user_management() {
        ReusableMethods.waitFor(1);
        adminManage.userManagement.click();
    }

    @Given("find a user on registration table")
    public void find_a_user_on_registration_table() {
        ReusableMethods.waitFor(2);

        String expectedValue = "ROLE_USER";


        List<WebElement> rows = Driver.getDriver().findElements(By.xpath("//table[@class='table table-striped']/tbody/tr/td"));

        for (int i = 1; i < rows.size(); i++) {

            String rowText = rows.get(i - 1).getText();

            System.out.println(rowText);

            if (rowText.contains(expectedValue)) {

               WebElement getStr= Driver.getDriver().findElement(By.xpath("//table[@class='table table-striped']/tbody/tr[" + i + "]/td[4]"));
               ReusableMethods.waitFor(2);
                getStr.click();
                System.out.println(getStr.getText());
                break;
//                adminManage.userActivated.click();

            }

        }

    }

    @Given("find a employee on registration table")
    public void find_a_employee_on_registration_table() {
        ReusableMethods.waitFor(2);

        String expectedValue = "ROLE_EMPLOYEE";

        List<WebElement> rows = Driver.getDriver().findElements(By.xpath("//Table[@class='table table-striped']/tbody/tr/td"));

        for (int i = 1; i < rows.size(); i++) {

            String rowText = rows.get(i - 1).getText();

            System.out.println(rowText);

            if (rowText.contains(expectedValue)) {

                WebElement getStr= Driver.getDriver().findElement(By.xpath("//table[@class='table table-striped']/tbody/tr[" + i + "]/td[4]"));
                ReusableMethods.waitFor(3);
                getStr.click();
                ReusableMethods.waitFor(3);
                System.out.println(getStr.getText());
                break;

            }

        }
    }

    @Given("find a manager on registration table")
    public void find_a_manager_on_registration_table() {
        ReusableMethods.waitFor(2);

        String expectedValue = "ROLE_MANAGER";

        List<WebElement> rows = Driver.getDriver().findElements(By.xpath("//Table[@class='table table-striped']/tbody/tr/td"));

        for (int i = 1; i < rows.size(); i++) {

            String rowText = rows.get(i - 1).getText();

            System.out.println(rowText);

            if (rowText.contains(expectedValue)) {

                WebElement getStr= Driver.getDriver().findElement(By.xpath("//table[@class='table table-striped']/tbody/tr[" + i + "]/td[4]"));
                ReusableMethods.waitFor(3);
                getStr.click();
                ReusableMethods.waitFor(3);
                System.out.println(getStr.getText());
                break;

            }

        }
    }

    @Given("find a admin on registration table")
    public void find_a_admin_on_registration_table() {

        String expectedValue = "ROLE_ADMIN";

        List<WebElement> rows = Driver.getDriver().findElements(By.xpath("//Table[@class='table table-striped']/tbody/tr/td"));

        for (int i = 1; i < rows.size(); i++) {

            String rowText = rows.get(i - 1).getText();

            System.out.println(rowText);

            if (rowText.contains(expectedValue)) {

                ReusableMethods.waitFor(1);
                WebElement getStr= Driver.getDriver().findElement(By.xpath("//table[@class='table table-striped']/tbody/tr[" + i + "]/td[4]"));
                ReusableMethods.waitFor(3);
                getStr.click();
                ReusableMethods.waitFor(2);
                System.out.println(getStr.getText());
                break;

            }

        }
    }

    @Given("You can view all user info \\(admin, manager, employee and user)")
    public void you_can_view_all_user_info_admin_manager_employee_and_user() {

        String expectedValue = "ROLE_ADMIN";

        List<WebElement> rows = Driver.getDriver().findElements(By.xpath("//Table[@class='table table-striped']/tbody/tr/td"));

        for (int i = 1; i < rows.size(); i++) {

            String rowText = rows.get(i - 1).getText();

            System.out.println(rowText);

            if (rowText.contains(expectedValue)) {

                ReusableMethods.waitFor(1);
                WebElement getStr= Driver.getDriver().findElement(By.xpath("//table[@class='table table-striped']/tbody/tr[" + i + "]/td[10]/div/a[1]"));
                ReusableMethods.waitFor(2);
                System.out.println(getStr.getText());
                ReusableMethods.waitFor(3);
                ReusableMethods.jsClick(getStr);
                ReusableMethods.waitFor(2);

                break;

            }

        }

    }

    @Given("You can edit all user info  \\(admin, manager, employee and user)")
    public void you_can_edit_all_user_info_admin_manager_employee_and_user() {


        String expectedValue = "ROLE_ADMIN";

        List<WebElement> rows = Driver.getDriver().findElements(By.xpath("//Table[@class='table table-striped']/tbody/tr/td"));

        for (int i = 1; i < rows.size(); i++) {

            String rowText = rows.get(i - 1).getText();

            System.out.println(rowText);

            if (rowText.contains(expectedValue)) {

                ReusableMethods.waitFor(1);
                WebElement getStr= Driver.getDriver().findElement(By.xpath("//table[@class='table table-striped']/tbody/tr[" + i + "]/td[10]/div/a[2]"));
                ReusableMethods.waitFor(2);
                System.out.println(getStr.getText());
                ReusableMethods.waitFor(3);
                ReusableMethods.jsClick(getStr);
                ReusableMethods.waitFor(2);

                break;

            }

        }

    }

    @Given("You can delete all user info  \\(admin, manager, employee and user)")
    public void you_can_delete_all_user_info_admin_manager_employee_and_user() {


        String expectedValue = "ROLE_ADMIN";

        List<WebElement> rows = Driver.getDriver().findElements(By.xpath("//Table[@class='table table-striped']/tbody/tr/td"));

        for (int i = 1; i < rows.size(); i++) {

            String rowText = rows.get(i - 1).getText();

            System.out.println(rowText);

            if (rowText.contains(expectedValue)) {

                ReusableMethods.waitFor(1);
                WebElement getStr= Driver.getDriver().findElement(By.xpath("//table[@class='table table-striped']/tbody/tr[" + i + "]/td[10]/div/a[3]"));
                ReusableMethods.waitFor(2);
                System.out.println(getStr.getText());
                ReusableMethods.waitFor(3);
                ReusableMethods.jsClick(getStr);
                ReusableMethods.waitFor(3);

                break;

            }

        }

    }

}
