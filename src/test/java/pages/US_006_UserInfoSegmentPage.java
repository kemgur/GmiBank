package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_006_UserInfoSegmentPage extends ReusableMethods {

    public US_006_UserInfoSegmentPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "account-menu")
    public WebElement picture;

    @FindBy(xpath = "//span[text()='Sign in'][1]")
    public WebElement SignInButton;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public  WebElement login;


    public void login(String uid, String pwd) {
        sendText(username, uid);
        sendText(password, pwd);

    }

    @FindBy(xpath = "//span[text()='aktas User']")
    public WebElement UserAktas;

    @FindBy(xpath = "//span[text()='User Info']")
    public WebElement userInfoBtn;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//select[@id='langKey']")
    public WebElement dorpdownSelect;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submit;


}
