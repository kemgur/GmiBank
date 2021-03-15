package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_017_AdminToManageUsers {

    public US_017_AdminToManageUsers(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//Table[@class='table table-striped']/tbody/tr[i]/td[6]")
    public WebElement roleUser;

    @FindBy(xpath = "//Table[@class='table table-striped']/tbody/tr[i]/td[4]")
    public WebElement userActivated;

    @FindBy(xpath = "//Table[@class='table table-striped']/tbody/tr/td")
    public WebElement table;

    @FindBy(xpath = "//*[@id='admin-menu']/a/span")
    public WebElement administrationDD;

    @FindBy(xpath = "//*[@id='admin-menu']/div/a[1]/span")
    public WebElement userManagement;
//
//    @FindBy(xpath = "//Table[@class='table table-striped']/tbody/tr/td[6]")
//    public WebElement roleUser;


}
