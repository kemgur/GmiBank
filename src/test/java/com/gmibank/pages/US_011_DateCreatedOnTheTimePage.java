package com.gmibank.pages;

import com.gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class US_011_DateCreatedOnTheTimePage {

    public US_011_DateCreatedOnTheTimePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='My Operations']")
    public WebElement dropDown;

    @FindBy(xpath = "//*[text()='Manage Customers']")
    public WebElement manageCustomer;

    @FindBy(xpath = "//*[text()='Create a new Customer']")
    public WebElement createNewCustomer;

    @FindBy(xpath = "//*[@id='tp-customer-createDate']")
    public WebElement verifyDate;

    @FindBy(xpath = "//*[@class=\"table-responsive\"]/table/tbody/tr[3]/td[1]/a")
    public WebElement chooseUser;

    @FindBy(xpath = "//*[text()=\"234-55-8998\"]")
    public WebElement verifySSN;

    @FindBy(xpath = "//*[text()=\"First Name\"]")
    public WebElement FirstName;

    @FindBy(xpath = "//*[text()=\"Please\"]")
    public WebElement getFirstName;

    @FindBy(xpath = "//*[text()=\"Delete\"]")
    public WebElement getLastName;

    @FindBy(xpath = "//*[text()=\"Edit\"]")
    public WebElement editAccount;

    @FindBy(xpath = "//*[@name=\"phoneNumber\"]")
    public WebElement updatePhoneNumber;

    @FindBy(xpath = "//*[text()=\"Zelle Enrolled\"]")
    public WebElement zelle;

    @FindBy(xpath = "//*[text()='36502']")
    public WebElement verifyID;

    @FindBy(xpath = "//table/tbody/tr")
    public WebElement table;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div[1]/div/div/div/div/h2/b")
    public WebElement IDexpected;


    @FindBy(xpath = "//*[@id='save-entity']")
    public WebElement saveBtn;
}
