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

    @FindBy(xpath = "//*[text()='aktas User']")
    public WebElement userAktas;

    @FindBy (xpath = "//button[@class='btn btn-primary']")
    public WebElement signInSecond;


    //@FindBy(xpath = "//*[text()='User Info']")
   // public WebElement userInfo;

    @FindBy(xpath = "//*[@href='/account/settings']")
    public WebElement giris;

   // @FindBy(xpath = "//*[text()='Ayarlar']")
   // public WebElement ayarlar;



    @FindBy(xpath = "//*[text()='This field is invalid']")
    public WebElement errorMessage;

    @FindBy(partialLinkText = "//*[text()='Kullanıcı ayarları [']")
    public WebElement turkishConfirmation;

    @FindBy(partialLinkText = "//*[text()='User settings for [']")
    public WebElement englishConfirmation;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement abc;










}
