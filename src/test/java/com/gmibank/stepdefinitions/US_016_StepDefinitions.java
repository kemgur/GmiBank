package com.gmibank.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import com.gmibank.pages.US_005LoginPage;
import com.gmibank.pages.US_016TransferMoneyPage;
import com.gmibank.utilities.ConfigurationReader;

public class US_016_StepDefinitions {
    US_005LoginPage loginPage=new US_005LoginPage();
    US_016TransferMoneyPage transferMoney=new US_016TransferMoneyPage();

    @Then("Kullanici usernameBoxa customer bir data girer")
    public void kullanici_username_boxa_customer_bir_data_girer() {
        loginPage.userBox.sendKeys(ConfigurationReader.getProperty("customer_usser"));

    }

    @Then("Kullanici passwordBoxa customer bir data girer")
    public void kullanici_password_boxa_customer_bir_data_girer() {
        loginPage.passBox.sendKeys(ConfigurationReader.getProperty("customer_pass"));

    }

    @Then("Kullanici My_Operations_a_tiklar")
    public void kullanici_my_operations_a_tiklar() {
        transferMoney.myOpr.click();


    }

    @Then("Kullanici My_Accounts_a_tiklar")
    public void kullanici_my_accounts_a_tiklar() {
        transferMoney.myAcc.click();

    }

    @Then("Kullanici iki hesap tanimli oldugunu dogrular")
    public void kullanici_iki_hesap_tanimli_oldugunu_dogrular() {
        Assert.assertTrue(transferMoney.hesap1.isEnabled());
        Assert.assertTrue(transferMoney.hesap2.isEnabled());


    }

    @And("Kullanici Transfer Money e tiklar")
    public void kullaniciTransferMoneyETiklar() {
        transferMoney.trnsMoney.click();
        
    }

    @And("Para transferi yapacagi ilk hesabi secer")
    public void paraTransferiYapacagiIlkHesabiSecer() {
        Select select=new Select(transferMoney.ilkHesap);
        select.selectByValue("76559");
    }

    @And("Kullanici para transfer edecegi hesabi secer")
    public void kullaniciParaTransferEdecegiHesabiSecer() {
        Select select=new Select(transferMoney.ikinciHesap);
        select.selectByValue("76560");

    }

    @And("Kullanici transfer edecegi para miktarini girer")
    public void kullaniciTransferEdecegiParaMiktariniGirer() {
        transferMoney.balanceBox.sendKeys(ConfigurationReader.getProperty("transfer_miktar"));
    }

    @And("Kullanici transfer icin bir aciklama girer")
    public void kullaniciTransferIcinBirAciklamaGirer() {
        transferMoney.aciklama.sendKeys(ConfigurationReader.getProperty("aciklama"));
    }

    @And("Kullanici Make Transfer e tiklar")
    public void kullaniciMakeTransferETiklar() {
        transferMoney.makeTransfer.click();

    }

    @And("Kullanici cikan onay mesajini dogrular")
    public void kullaniciCikanOnayMesajiniDogrular() {
        Assert.assertTrue(transferMoney.onayMesaji.isEnabled());
    }
}
