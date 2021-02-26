package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_002GmiRegisterPage {
    public US_002GmiRegisterPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssnTextbox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement ssnErrorMessage;

    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstNameTextbox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement firstNameErrorMessage;

    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement lastNameTextbox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement lastNameErrorMessage;

    @FindBy(xpath = "//input[@name='address']")
    public WebElement addressTextbox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])")
    public WebElement addressErrorMessage;

    @FindBy(xpath = "//input[@name='mobilephone']")
    public WebElement mobilePhoneTextBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])")
    public WebElement mobilePhoneErrorMessage;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameTextbox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement usernameErrorMessage;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailTextbox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement emailErrorMessage;

    @FindBy(xpath = "//input[@name='firstPassword']")
    public WebElement newPasswordTextbox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement newPasswordErrorMessage;

    @FindBy(xpath = "//input[@name='secondPassword']")
    public WebElement newPasswordConfirmationTextbox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement newPasswordConfirmationErrorMessage;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])")
    public WebElement invalidEmailErrorMessage;

}
