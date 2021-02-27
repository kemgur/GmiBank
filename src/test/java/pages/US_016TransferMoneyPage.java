package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_016TransferMoneyPage {
    public US_016TransferMoneyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='My Operations']")
    public WebElement myOpr;

    @FindBy(xpath = "//*[text()='My Accounts']")
    public WebElement myAcc;

    @FindBy(xpath = "//*[text()='Transfer Money']")
    public WebElement trnsMoney;

    @FindBy(id = "fromAccountId")
    public WebElement ilkHesap;

    @FindBy(id = "toAccountId")
    public WebElement ikinciHesap;

    @FindBy(id = "balance")
    public WebElement balanceBox;

    @FindBy(id = "description")
    public WebElement aciklama;

    @FindBy(id = "make-transfer")
    public WebElement makeTransfer;

    @FindBy(xpath = "//*[text()='Transfer is succesfull']")
    public WebElement onayMesaji;

    @FindBy (xpath = "(//td)[1]")
    public WebElement hesap1;

    @FindBy(xpath = "(//td)[5]")
    public WebElement hesap2;







}
