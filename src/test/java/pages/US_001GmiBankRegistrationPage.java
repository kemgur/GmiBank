package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_001GmiBankRegistrationPage {

    public US_001GmiBankRegistrationPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssnTextbox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement ssnInvalidMesagge;

    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstname;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement firstnameRequiredMessage;

    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement lastname;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement lastnameRequiredMessage;

    @FindBy(xpath = "//input[@name='address']")
    public WebElement address;

    @FindBy(xpath = "//input[@name='mobilephone']")
    public WebElement mobilePhone;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public WebElement mobilePhoneInvalidMesagge;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement username;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public WebElement usernameRequiredMessage;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[6]")
    public WebElement emailRequiredMessage;







}
