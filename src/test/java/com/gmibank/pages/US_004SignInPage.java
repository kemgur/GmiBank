package com.gmibank.pages;


import com.gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class US_004SignInPage {
    public US_004SignInPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath ="//li[@id='account-menu']")
    public WebElement loginDropdown;

    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement HomeSignInButton;

    @FindBy(xpath="//input[@id='username']")
    public WebElement usernameTextbox;

    @FindBy(xpath ="//input[@id='password']")
    public WebElement passwordTextbox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement SignInButton;

    @FindBy(xpath = "//*[text()='Cancel']")
    public WebElement closeButton;

    @FindBy(xpath = "//*[text()='Admin Admin']")
    public WebElement AdminAdminButton;

}

