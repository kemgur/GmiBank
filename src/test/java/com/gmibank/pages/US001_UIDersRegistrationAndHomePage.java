package com.gmibank.pages;


import com.gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US001_UIDersRegistrationAndHomePage {

        public US001_UIDersRegistrationAndHomePage(){
            PageFactory.initElements(Driver.getDriver(), this);
        }

    @FindBy(id = "account-menu")
    public WebElement iconButton;

    @FindBy(xpath = "//*[text()='Register']")
    public WebElement registerButtonHomePage;

    @FindBy(id = "ssn")
    public WebElement ssnTextBox;

    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstNameTextBox;

    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement lastNameTextBox;

    @FindBy(id = "address")
    public WebElement addressTextBox;

    @FindBy(id = "mobilephone")
    public WebElement mobilePhoneNumberTextBox;

    @FindBy(id = "username")
    public WebElement userNameTextBox;

    @FindBy(id = "email")
    public WebElement emailTextBox;

    @FindBy(id = "firstPassword")
    public WebElement firstPasswordTextBox;

    @FindBy(id = "secondPassword")
    public WebElement secondPasswordTextBox;

    @FindBy(id = "register-submit")
    public WebElement registerButtonRegistrationPage;

    @FindBy(xpath = "//div[@role='alert']")
    public List<WebElement> successMessage;

    @FindBy(xpath = "//*[contains(text(),'Registration saved!')]")
    public WebElement successMessage2;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement hataMesaji;
}
