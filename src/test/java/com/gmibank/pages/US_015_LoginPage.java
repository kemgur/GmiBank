package com.gmibank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.gmibank.utilities.Driver;

public class US_015_LoginPage {

    public US_015_LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameTextbox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordTextbox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;
}
