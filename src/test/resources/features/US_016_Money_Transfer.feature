Feature: Para_transferi_gerceklestirilebilmeli

  Background:

    Given Kullanici GmiBank adresine gider
    And Kullanici Sign In sayfasina gider
    And Kullanici Sign In a tiklar
    Then Kullanici usernameBoxa customer bir data girer
    And Kullanici passwordBoxa customer bir data girer
    And Kullanici SignIn butonuna tiklar
    And Kullanici My_Operations_a_tiklar

  Scenario: TC_001 Kullanıcı_en_az_2_hesaba_sahip_olmalıdır
    And Kullanici My_Accounts_a_tiklar
    And Kullanici iki hesap tanimli oldugunu dogrular

  Scenario: TC_002 Kullanıcı_hangi_hesaptan_para_transfer_edecegini_secmelidir
    And Kullanici Transfer Money e tiklar
    And Para transferi yapacagi ilk hesabi secer

  Scenario: TC_003 Kullanıcı_parasını_transfer_edecegi_hesabi_secmelidir
    And Kullanici Transfer Money e tiklar
    And Para transferi yapacagi ilk hesabi secer
    And Kullanici para transfer edecegi hesabi secer

  Scenario: TC_004 Kullanıcı_transfer_edecegi_para_miktarini_girmelidir
    And Kullanici Transfer Money e tiklar
    And Kullanici transfer edecegi para miktarini girer

  Scenario: TC_005 Kullanıcı_transfer_için_bir_açıklama_girmelidir
    And Kullanici Transfer Money e tiklar
    And Kullanici transfer icin bir aciklama girer

  Scenario: TC_006 Para_transferi_gerceklestirilebilmeli
    And Kullanici Transfer Money e tiklar
    And Para transferi yapacagi ilk hesabi secer
    And Kullanici para transfer edecegi hesabi secer
    And Kullanici transfer edecegi para miktarini girer
    And Kullanici transfer icin bir aciklama girer
    And Kullanici Make Transfer e tiklar
    And Kullanici cikan onay mesajini dogrular
