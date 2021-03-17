package com.gmibank.stepdefinitions;


import com.gmibank.pojos.Country;
import com.gmibank.utilities.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.it.Ma;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.asserts.SoftAssert;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_025_StepDefinitions {

    private Map<String, Object> body;

    @Given("user goes API")
    public void user_goes_api() {

    }

    @And("user {string} create a country {string} and state {string}")
    public void userCreateACountryAndState(String url, String name, String state) {

        Country countries = new Country(name, null);

        String token = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZWFtMzBtYW5hZ2VyIiwiYXV0aCI6IlJPTEVfTUFOQUdFUiIsImV4cCI6MTYxNTk3MzkzN30.SsH2_hDMa7W9DTg0q5sH2lcd1vnxUxwmm6tiWkPeGOR0amelxs1ANkZwtbDdDzgaUW3ciFDbKsiYdbpp8C06Vg";

        Map<String, Object> body = new HashMap<>();
        body.put("name", countries.getName());
        body.put("states", countries.getStates());

        System.out.println(body);

        Response response;
        response = given().
                accept(ContentType.JSON).
                contentType(ContentType.JSON).
                auth().
                oauth2(token).
                when().
                body(body).
                post(url).
                then().
                extract().
                response();
        response.prettyPrint();
       Country actualCountryData = response.as(Country.class);
        SoftAssert softAssert = new SoftAssert();

        System.out.println(actualCountryData.getName());
        System.out.println(countries.getName());
        softAssert.assertEquals(actualCountryData.getName(), countries.getName());

        softAssert.assertAll();



    }

    @Then("user validates country and state")
    public void user_validates_country_and_state() {


    }


}
