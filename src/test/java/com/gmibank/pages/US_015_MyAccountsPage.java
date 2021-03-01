package com.gmibank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.gmibank.utilities.Driver;

public class US_015_MyAccountsPage {

    public US_015_MyAccountsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//button[@type='button'])[2]")
    public WebElement viewTransaction;

    @FindBy(xpath = "(//td)[9]")
    public WebElement transactionId;

    @FindBy(xpath = "(//td)[2]")
    public WebElement firstAccountType;

    @FindBy(xpath = "(//td)[6]")
    public WebElement secondAccountType;
}
