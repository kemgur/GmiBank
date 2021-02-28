package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_014GmiBankCreateAnAccountPage {

    public US_014GmiBankCreateAnAccountPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='My Operations']")
    public WebElement myOperations;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement manageAccounts;

    @FindBy(id = "jh-create-entity")
    public WebElement createNewAccount;

    @FindBy(id = "tp-account-description")
    public WebElement descriptionTextbox;

    @FindBy(id = "tp-account-balance")
    public WebElement balanceTextbox;

    @FindBy(id = "tp-account-accountType")
    public WebElement accountTypeDropdown;

    @FindBy(id = "tp-account-accountStatusType")
    public WebElement accountStatusTypeDropdown;

    @FindBy(xpath = "//input[@name='createDate']")
    public WebElement createDateTextbox;

    @FindBy(id = "tp-account-closedDate")
    public WebElement closedDateTextbox;

    @FindBy(id = "save-entity")
    public WebElement saveButton;

    @FindBy(xpath = "/div[@class='invalid-feedback']")
    public WebElement invalidMessage;




}
