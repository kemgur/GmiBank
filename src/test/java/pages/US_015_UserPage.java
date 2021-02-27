package pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_015_UserPage {

    public US_015_UserPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='My Operations']")
    public WebElement myOperations;

    @FindBy(xpath = "//*[text()='My Accounts']")
    public WebElement myAccounts;

    @FindBy(xpath = "(//a[@aria-haspopup='true'])[2]")
    public WebElement administration;

    @FindBy(xpath = "//*[text()='User management']")
    public WebElement userManagement;

    @FindBy(xpath = "(//a[@class='page-link'])[9]")
    public WebElement lastPageButton;

    @FindBy(xpath = "//a[@href='/admin/user-management/dt30/edit']")
    public WebElement team30DemoEditButton;

    @FindBy(xpath = "//input[@name='activated']")
    public WebElement activatedButton;

    @FindBy(xpath = "//*[text()='Sign out']")
    public WebElement signOut;

    @FindBy(xpath = "//*[text()='Manage Customers']")
    public WebElement manageCustomers;

    @FindBy(xpath = "//*[text()='Create a new Customer']")
    public WebElement createNewCustomer;

    @FindBy(xpath = "//input[@name='search-ssn']")
    public WebElement searchSsn;

    @FindBy(xpath = "(//button[@type='button'])[2]")
    public WebElement searchButton;

    @FindBy(xpath = "//input[@name='phoneNumber']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//input[@name='middleInitial']")
    public WebElement middle;

    @FindBy(xpath = "//input[@name='zipCode']")
    public WebElement zipCode;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement city;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement save;

    @FindBy(xpath = "(//a[@aria-haspopup])[3]")
    public WebElement icon;

    @FindBy(xpath = "//*[text()='SIGN IN AGAIN']")
    public WebElement signInAgain;

    @FindBy(xpath = "//*[text()='Demo Team30 Hesap']")
    public WebElement firstAcc;

    @FindBy(xpath = "//*[text()='Demo Team30 Hesap2']")
    public WebElement secondAcc;
}
