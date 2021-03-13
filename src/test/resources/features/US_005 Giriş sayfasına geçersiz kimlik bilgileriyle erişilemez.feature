@loginpage
Feature: US_005 Giriş sayfasına geçersiz kimlik bilgileriyle erişilemez

  Background:

    Given Kullanici GmiBank adresine gider
    And Kullanici Sign In sayfasina gider
    And Kullanici Sign In a tiklar

  Scenario Outline: TC_001 Valid username invalid password datalarla sign in yapilamamali

    Then Kullanici UsernameBoxa valid bir deger girer
    And Kullanici PasswordBoxa "<invalid_password>" bir deger girer
    And Kullanici SignIn butonuna tiklar
    And Kullanici cikan hata mesajini dogrular

    Examples:Invalid password Liste

      | invalid_password |
      | pass_invalid2    |
      | pass_invalid3    |
      | pass_invalid4    |


  Scenario: TC_002 Invalid username valid password datalarla sign in yapilamamali
    Then Kullanici UsernameBoxa Invalid bir deger girer
    And Kullanici PasswordBoxa valid bir deger girer
    And Kullanici SignIn butonuna tiklar
    And Kullanici cikan hata mesajini dogrular

  Scenario: TC_003 Invalid username Invalid password datalarla sign in yapilamamali
    Then Kullanici UsernameBoxa Invalid bir deger girer
    And Kullanici PasswordBoxa invalid bir deger girer
    And Kullanici SignIn butonuna tiklar
    And Kullanici cikan hata mesajini dogrular

  Scenario: TC_004 Geçersiz kimlik bilgilerine sahip kullanıcılara şifrelerini sıfırlama seçeneği sunulmalıdır
    And Kullanici UsernameBoxa valid bir deger girer
    And Kullanici PasswordBoxa invalid bir deger girer
    And Kullanici Did you forget your password? a tiklar
    And Sifre sifirlama mesajinin ciktigini dogrular

  Scenario: TC_005 Kullanıcıya henüz kaydolmadıysa, kayıt sayfasına gitme seçeneği verilmelidir.

    And Kullanici Register a new account a tiklar
    And Kullanici kayit sayfasina geldigini Url ile dogrular






