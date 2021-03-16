package com.gmibank.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.gmibank.utilities.Driver;

public class US_019AdminHesapPage {
  
    public US_019AdminHesapPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='Manage Accounts']")
    public WebElement myAccnts;
    @FindBy(xpath = "//*[text()='Create a new Account']")
    public WebElement cerateAnewAcc;
    @FindBy(xpath = "//input[@name='description']")
    public WebElement descrip;
    @FindBy(xpath = "//input[@name='balance']")
    public WebElement balancebox;
    @FindBy(xpath = "//select[@name='accountType']")
    public WebElement accountType;
    @FindBy(xpath = "//select[@name='accountStatusType']")
    public WebElement accStatusType;
    @FindBy(xpath = "//select[@name='employee.id']")
    public WebElement employeeDrbx;
    @FindBy(xpath = "//*[text()='Save']")
    public WebElement saveButton;
    @FindBy(xpath = "//div[@role='alert']")
    public WebElement onayMesaji;
}
