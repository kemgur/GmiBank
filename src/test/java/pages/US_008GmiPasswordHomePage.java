package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_008GmiPasswordHomePage {

    public US_008GmiPasswordHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@aria-haspopup]")
    public WebElement iconHomePage;

    @FindBy(id = "login-item")
    public WebElement signinButtonHomePage;

    @FindBy(id = "username")
    public WebElement usernameTextbox;

    @FindBy(id = "password")
    public WebElement passwordTextbox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButtonSignInPage;

    @FindBy(xpath = "(//a[@aria-haspopup='true'])[3]")
    public WebElement iconUserPage;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[10]")
    public WebElement passwordButtonUserPage;

    @FindBy(xpath = "//input[@name='currentPassword']")
    public WebElement currentPasswordTextbox;

    @FindBy(xpath = "//input[@name='newPassword']")
    public WebElement newPasswordTextbox;

    @FindBy(xpath = "//li[@style='background-color: rgb(255, 0, 0);']")
    public WebElement passwordStrengthPointRed;

    @FindBy(xpath = "//li[@style='background-color: rgb(255, 153, 0);'][2]")
    public WebElement passwordStrengthPointOrange;

    @FindBy(xpath = "//li[@style='background-color: rgb(255, 255, 0);'][3]")
    public WebElement passwordStrengthPointYellow;

    @FindBy(xpath = "(//li[@style='background-color: rgb(153, 255, 0);'])[4]")
    public WebElement passwordStrengthPointLime;

    @FindBy(xpath = "(//li[@style='background-color: rgb(0, 255, 0);'])[5]")
    public WebElement passwordStrengthPointGreen;

    @FindBy(xpath = "//input[@name='confirmPassword']")
    public WebElement confirmPasswordTextbox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButtonInPasswordPage;

    @FindBy(xpath = "//*[contains(text(),'The password could not be changed.')]")
    public WebElement errorMessage;

    @FindBy(xpath = "//*[text()='Password changed!']")
    public WebElement passwordChangedMessage;



}
