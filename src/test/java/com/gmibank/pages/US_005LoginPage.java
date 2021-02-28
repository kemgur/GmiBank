package com.gmibank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.gmibank.utilities.Driver;

public class US_005LoginPage {
    public US_005LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);}

        @FindBy(xpath = "//a[@aria-haspopup='true']")
        public WebElement signInGor;

        @FindBy(xpath = "//*[text()='Sign in']")
        public WebElement signIn;

        @FindBy(xpath = "//input[@type='text']")
        public WebElement userBox;

        @FindBy(xpath = "//input[@type='password']")
        public WebElement passBox;

        @FindBy(xpath = "//button[@type='submit']")
        public WebElement signInButton;

        @FindBy(xpath = "(//div[@role='alert'])[1]")
        public WebElement sifreSifir;

        @FindBy(linkText = "Register a new account")
       public WebElement register;

        @FindBy(xpath = "//*[text()=' Please check your credentials and try again.']")
        public WebElement hataMesaji;

        @FindBy (xpath = "//*[text()='Enter the email address you used to register']")
        public WebElement sifirlamaMsj;






}
