package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_010_CustomerAdressCreatePage {

    public US_010_CustomerAdressCreatePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement SignInDropdown;

    @FindBy(linkText = "Sign in")
    public WebElement SignIn;

    @FindBy(id = "username")
    public  WebElement usernameTextBox;

    @FindBy(id = "password")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement SignInButton;

    @FindBy(id="entity-menu")
    public WebElement myOperations;

    @FindBy(linkText = "Manage Customers")
    public WebElement manageCustomers;

    @FindBy(id = "jh-create-entity")
    public WebElement createNewCustomer;

    @FindBy(name = "firstName")
    public WebElement firstnameTextBox;

    @FindBy(name = "lastName")
    public WebElement lastnameTextBox;

    @FindBy(name = "middleInitial")
    public WebElement middleinitialTextBox;

    @FindBy(name = "email")
    public WebElement emailTextBox;

    @FindBy(name = "mobilePhoneNumber")
    public WebElement mobilphonenumberTextBox;

    @FindBy(name = "phoneNumber")
    public WebElement phonenumberTextBox;

    @FindBy(name = "zipCode")
    public WebElement zipcodeTextBox;

    @FindBy(name = "address")
    public WebElement addressTextBox;

    @FindBy(name = "city")
    public WebElement cityTextBox;

    @FindBy(name = "ssn")
    public WebElement ssnTextBox;

    @FindBy(name = "createDate")
    public  WebElement createDate;

    @FindBy(name = "country.id")
    public WebElement countryDropdown;

    @FindBy(name = "state")
    public WebElement state;

    @FindBy(name = "user.id")
    public WebElement userDropdown;

    @FindBy(id = "save-entity")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement requiredMessage;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement createdMessage;
}
