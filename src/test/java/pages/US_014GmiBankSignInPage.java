package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class US_014GmiBankSignInPage {


    public US_014GmiBankSignInPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "username")
    public WebElement usernameTextbox;

    @FindBy(id = "password")
    public WebElement passwordTextbox;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement signInButton;





}