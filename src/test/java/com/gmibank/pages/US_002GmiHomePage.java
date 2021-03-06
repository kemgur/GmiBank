package com.gmibank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.gmibank.utilities.Driver;

public class US_002GmiHomePage {

    public US_002GmiHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@aria-haspopup='true'])[2]")
    public WebElement picture;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement registerButton;

    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement loginButton;

}