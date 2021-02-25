package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.WeakHashMap;

public class US013_NewAccountPage {
    public US013_NewAccountPage(){ PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "account-menu")
    public WebElement accountMenu;

    @FindBy(id = "login-item")
    public WebElement signInButton;

    @FindBy(id = "username")
    public WebElement userNameTextBox;

    @FindBy(id = "password")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//*[@id='login-page']/div/form/div[3]/button[2]")
    public WebElement secondSignInButton;

    @FindBy(id = "entity-menu")
    public WebElement myOperationButton;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement manageAccountButton;

    @FindBy(id = "jh-create-entity")
    public  WebElement createAccount;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement descriptionError;

    @FindBy(id = "tp-account-description")
    public WebElement descriptionTextBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement balanceError;

    @FindBy(xpath = "//input[@name='balance']")
    public WebElement balanceTextBox;

    @FindBy(xpath = "//select[@name='accountType']")
    public WebElement accountTypeDropDown;

    @FindBy(xpath = "//select[@name='accountStatusType']")
    public WebElement statusTypeDropDown;

    @FindBy(id = "save-entity")
    public WebElement saveButton;


    public void scroolPage(){
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

}
