package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UpdateUserInformationPage {
    public UpdateUserInformationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//input[@id='email']")
    public WebElement emailTextBox;

    @FindBy (xpath = "//select[@id='langKey']")
    public WebElement languageDropdown;

    @FindBy (xpath = "//button[@class='btn btn-primary']")
    public WebElement saveButton;


    @FindBy (id = "account-menu")
    public WebElement accountMenu;

    @FindBy (xpath = "//*[text()='Sign in'][1]")
    public WebElement signInFirst;

    @FindBy (xpath = "//input[@id='username']")
    public WebElement usernameTextBox;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement passwordTextBox;



    @FindBy (xpath = "//button[@class='btn btn-primary']")
    public WebElement signInSecond;


    @FindBy(xpath = "//*[text()='This field is invalid']")
    public WebElement errorMessage;


    @FindBy(xpath = "//div[@role='alert']")
    public WebElement ssettingSavedMessage;


    @FindBy(xpath = "(//a[@aria-haspopup='true'])[2]")
    public WebElement user;







}
