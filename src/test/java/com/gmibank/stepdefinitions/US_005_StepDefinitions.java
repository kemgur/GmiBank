package com.gmibank.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import com.gmibank.pages.US_005LoginPage;
import com.gmibank.utilities.ConfigurationReader;
import com.gmibank.utilities.Driver;
import com.gmibank.utilities.ReusableMethods;

public class US_005_StepDefinitions {
    US_005LoginPage loginPage=new US_005LoginPage();

    @Given("Kullanici GmiBank adresine gider")
    public void kullanici_gmi_bank_adresine_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmibank_url"));

    }

    @Given("Kullanici Sign In sayfasina gider")
    public void kullanici_sign_in_sayfasina_gider() {
        loginPage.signInGor.click();

    }

    @Given("Kullanici Sign In a tiklar")
    public void kullanici_sign_in_a_tiklar() {
        loginPage.signIn.click();

    }

    @Then("Kullanici UsernameBoxa valid bir deger girer")
    public void kullanici_username_boxa_valid_bir_deger_girer() {
        loginPage.userBox.sendKeys(ConfigurationReader.getProperty("user_valid"));

    }

    @Then("Kullanici PasswordBoxa invalid bir deger girer")
    public void kullanici_password_boxa_invalid_bir_deger_girer() {
        loginPage.passBox.sendKeys(ConfigurationReader.getProperty("pass_invalid1"));

    }

    @Then("Kullanici SignIn butonuna tiklar")
    public void kullanici_sign_in_butonuna_tiklar() {
        loginPage.signInButton.click();

    }

    @Then("Kullanici cikan hata mesajini dogrular")
    public void kullanici_cikan_hata_mesajini_dogrular() {
    Assert.assertTrue(loginPage.hataMesaji.isEnabled());

    }


    @Then("Kullanici UsernameBoxa Invalid bir deger girer")
    public void kullaniciUsernameBoxaInvalidBirDegerGirer() {
        loginPage.userBox.sendKeys(ConfigurationReader.getProperty("user_invalid"));

    }

    @And("Kullanici PasswordBoxa valid bir deger girer")
    public void kullaniciPasswordBoxaValidBirDegerGirer() {
        loginPage.passBox.sendKeys(ConfigurationReader.getProperty("pass_valid"));
    }

    @And("Kullanici Did you forget your password? a tiklar")
    public void kullaniciDidYouForgetYourPasswordATiklar() {
        ReusableMethods.waitFor(3);
        loginPage.sifreSifir.click();
        loginPage.sifreSifir.click();
    }

    @And("Sifre sifirlama mesajinin ciktigini dogrular")
    public void sifreSifirlamaMesajininCiktiginiDogrular() {
        Assert.assertTrue(loginPage.sifirlamaMsj.isEnabled());
    }

    @And("Kullanici Register a new account a tiklar")
    public void kullaniciRegisterANewAccountATiklar() {
        ReusableMethods.waitFor(3);
        loginPage.register.click();
        loginPage.register.click();

    }

    @And("Kullanici kayit sayfasina geldigini Url ile dogrular")
    public void kullaniciKayitSayfasinaGeldiginiUrlIleDogrular() {
        String  actualUrl=Driver.getDriver().getCurrentUrl();
        System.out.println(actualUrl);
        String exptedUrl="https://www.gmibank.com/account/register";
        Assert.assertEquals(actualUrl,exptedUrl);
    }

    @And("Kullanici PasswordBoxa {string} bir deger girer")
    public void kullaniciPasswordBoxaBirDegerGirer(String pass) {
        loginPage.passBox.sendKeys(ConfigurationReader.getProperty(pass));
    }
}
