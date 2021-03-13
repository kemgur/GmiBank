Feature: Sistem_Admin_in_yeni_bir_Hesap_oluşturmasına_izin_vermelidir

  Background:
    Given Kullanici GmiBank adresine gider
    And Kullanici Sign In sayfasina gider
    And Kullanici Sign In a tiklar
    Then Kullanici usernameBoxa manager data girer
    And Kullanici passwordBoxa manager data girer
    And Kullanici SignIn butonuna tiklar
    Then Kullanici My_Operations_a_tiklar
    Then Kullanici ManageAccounts a tiklar
    And Kullanici Create a New Accounts a tiklar

  Scenario:TC_001_Kullanıcı_yeni_hesap_için_bir_açıklama_oluşturmalıdır_ve_boş_bırakmamali
    And Kullanici Description kismina bir hesap aciklamasi girer

  Scenario: TC_002_Kullanıcı_ilk_kez_hesap_oluştururken_Dolar_olarak_bir_bakiye_sağlamalıdır
    And Kullanici balance boxa bir "bakiye" girer

  Scenario: TC_003_Kullanıcı_CHECKIN_olarak_bir_hesap_türü_seçebilir
    And Kullanici Account Type drobboxdan CHECKIN hesap turunu secer

  Scenario: TC_004_Kullanıcı_SAVING_olarak_bir_hesap_türü_seçebilir
    And Kullanici Account Type drobboxdan SAVING hesap turunu secer

  Scenario: TC_005_Kullanıcı_CREDIT_CARD_olarak_bir_hesap_türü_seçebilir
    And Kullanici Account Type drobboxdan CREDIT_CARD hesap turunu secer

  Scenario: TC_006_Kullanıcı_INVESTING_olarak_bir_hesap_türü_seçebilir
    And Kullanici Account Type drobboxdan INVESTING hesap turunu secer

  Scenario: TC_007_Kullanici_hesap_durumunu_ACTIVE_olarak_tanımlanmalıdır
    And Kullanici Account Status Type drobboxtan hesap durumunu ACTIVE olarak secer

  Scenario: TC_008_Kullanici_hesap_durumunu_SUSPENDED_olarak_tanımlanmalıdır
    And Kullanici Account Status Type drobboxtan hesap durumunu SUSPENDED olarak secer

  Scenario: TC_009_Kullanici_hesap_durumunu_CLOSED_olarak_tanımlanmalıdır
    And Kullanici Account Status Type drobboxtan hesap durumunu CLOSED olarak secer

  Scenario: TC_010_Kullanıcı_açılır_menüden_bir_çalışan_seçebilir
    And Kullanici Employee drobboxdan bir musteri secer

  Scenario: TC_011_Kullanici_yeni_bir_Hesap_oluşturabilmelidir
    And Kullanici Description kismina bir hesap aciklamasi girer
    And Kullanici balance boxa bir "bakiye" girer
    And Kullanici Account Type drobboxdan CHECKIN hesap turunu secer
    And Kullanici Account Status Type drobboxtan hesap durumunu ACTIVE olarak secer
    And Kullanici save butonuna tiklar
    Then Kullanici basarili bir sekilde hesap olsutu dogrulama mesajini kontrol eder


