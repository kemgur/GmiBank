package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.US_005LoginPage;
import pages.US_016TransferMoneyPage;
import pages.US_019AdminHesapPage;
import utilities.ConfigReader;

public class US_019StepDefinitions {
    US_005LoginPage loginPage=new US_005LoginPage();
    US_019AdminHesapPage adminHesapPage=new US_019AdminHesapPage();


    @Then("Kullanici usernameBoxa manager data girer")
    public void kullanici_username_boxa_manager_data_girer() {
        loginPage.userBox.sendKeys(ConfigReader.getProperty("manager_username"));

    }

    @Then("Kullanici passwordBoxa manager data girer")
    public void kullanici_password_boxa_manager_data_girer() {
        loginPage.passBox.sendKeys(ConfigReader.getProperty("manager_pw"));

    }

    @Then("Kullanici ManageAccounts a tiklar")
    public void kullanici_manage_accounts_a_tiklar() {
        adminHesapPage.myAccnts.click();

    }

    @Then("Kullanici Create a New Accounts a tiklar")
    public void kullanici_create_a_new_accounts_a_tiklar() {
        adminHesapPage.cerateAnewAcc.click();

    }


    @And("Kullanici Description kismina bir hesap aciklamasi girer")
    public void kullaniciDescriptionKisminaBirHesapAciklamasiGirer() {
        adminHesapPage.descrip.sendKeys(ConfigReader.getProperty("deciripton_aciklama"));
    }

    @And("Kullanici balance boxa bir {string} girer")
    public void kullaniciBalanceBoxaBirGirer(String bakiye) {
        adminHesapPage.balancebox.sendKeys(ConfigReader.getProperty(bakiye));
    }

    @And("Kullanici Account Type drobboxdan CHECKIN hesap turunu secer")
    public void kullaniciAccountTypeDrobboxdanCHECKINHesapTurunuSecer() {
        Select select=new Select(adminHesapPage.accountType);
        select.selectByValue("CHECKING");

    }

    @And("Kullanici Account Type drobboxdan SAVING hesap turunu secer")
    public void kullaniciAccountTypeDrobboxdanSAVINGHesapTurunuSecer() {
        Select select=new Select(adminHesapPage.accountType);
        select.selectByValue("SAVING");
    }

    @And("Kullanici Account Type drobboxdan CREDIT_CARD hesap turunu secer")
    public void kullaniciAccountTypeDrobboxdanCREDIT_CARDHesapTurunuSecer() {
        Select select=new Select(adminHesapPage.accountType);
        select.selectByValue("CREDIT_CARD");
    }

    @And("Kullanici Account Type drobboxdan INVESTING hesap turunu secer")
    public void kullaniciAccountTypeDrobboxdanINVESTINGHesapTurunuSecer() {
        Select select=new Select(adminHesapPage.accountType);
        select.selectByValue("INVESTING");
    }

    @And("Kullanici Account Status Type drobboxtan hesap durumunu ACTIVE olarak secer")
    public void kullaniciAccountStatusTypeDrobboxtanHesapDurumunuACTIVEOlarakSecer() {
        Select select=new Select(adminHesapPage.accStatusType);
        select.selectByValue("ACTIVE");
    }

    @And("Kullanici Account Status Type drobboxtan hesap durumunu SUSPENDED olarak secer")
    public void kullaniciAccountStatusTypeDrobboxtanHesapDurumunuSUSPENDEDOlarakSecer() {
        Select select=new Select(adminHesapPage.accStatusType);
        select.selectByValue("SUESPENDED");
    }

    @And("Kullanici Account Status Type drobboxtan hesap durumunu CLOSED olarak secer")
    public void kullaniciAccountStatusTypeDrobboxtanHesapDurumunuCLOSEDOlarakSecer() {
        Select select=new Select(adminHesapPage.accStatusType);
        select.selectByValue("CLOSED");

    }

    @And("Kullanici Employee drobboxdan bir musteri secer")
    public void kullaniciEmployeeDrobboxdanBirMusteriSecer() {
        Select select=new Select(adminHesapPage.employeeDrbx);
        select.selectByValue("");

    }

    @And("Kullanici save butonuna tiklar")
    public void kullaniciSaveButonunaTiklar() {
        adminHesapPage.saveButton.click();
        
    }

    @Then("Kullanici basarili bir sekilde hesap olsutu dogrulama mesajini kontrol eder")
    public void kullaniciBasariliBirSekildeHesapOlsutuDogrulamaMesajiniKontrolEder() {
       Assert.assertTrue(adminHesapPage.onayMesaji.isEnabled());
    }
}
