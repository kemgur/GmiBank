package com.gmibank.stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gmibank.pojos.Country3;
import com.gmibank.pojos.Customer3;
import com.gmibank.utilities.ConfigurationReader;
import com.gmibank.utilities.ReadTxt;
import com.gmibank.utilities.WriteToTxt;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertFalse;

public class CustomerApiStepDef {

    Response response;
    String apiToken = ConfigurationReader.getProperty("bearer");
    Customer3[] customer3;
    String filePath = ConfigurationReader.getProperty("filePath_Customer_Ssn");
    Country3[] country;
    String filePathCountryId = ConfigurationReader.getProperty("filePath_country_id");
    Response responseAll;


    @Given("All Customer API data is set to response using api end point {string}")
    public void allCustomerAPIDataIsSetToResponseUsingApiEndPoint(String api_endpoint) {
        response = given().
                headers("Authorization",
                        "Bearer " + apiToken,
                        "Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON).
                when().
                contentType(ContentType.JSON).
                get(ConfigurationReader.getProperty(api_endpoint)).
                then().
                extract().
                response();


        //response = given().auth().oauth2(apiToken) Ikinci bir authorization bicimi(Bearer type icin)
        //response.prettyPrint();

    }

    @Given("all customer info will be set to customers with deserialization")
    public void allCustomerInfoWillBeSetToCustomersWithDeserialization() throws IOException {
        ObjectMapper obje = new ObjectMapper();
        customer3 = obje.readValue(response.asString(), Customer3[].class);



        for (int i = 0; i < customer3.length; i++) {
            if (customer3[i].getUser() != null){
                System.out.println(customer3[i].getUser().getLogin());
            }
        }
        //System.out.println(customer3[4].getCountry3().getStates3());
    }

    @And("all customer info will be saved to txt files")
    public void allCustomerInfoWillBeSavedToTxtFiles() {
        WriteToTxt.saveDataInFileWithSSN(filePath, customer3);

    }

    @Then("all customer info has been validated")
    public void allCustomerInfoHasBeenValidated() {
        /*
821-84-3971
108-53-6655
224-71-4004
398-56-4356
         */

        List<String> expectedSsns = new ArrayList<>();
        expectedSsns.add("821-84-3971");
        expectedSsns.add("108-53-6655");
        expectedSsns.add("224-71-4004");
        expectedSsns.add("398-56-4356");

        List<String> actualList = ReadTxt.returnCustomerSNNList(filePath);
        Assert.assertTrue("Ssn'ler eslesmiyor", actualList.containsAll(expectedSsns));

    }


    @And("ders create a country {string}")
    public void dersCreateACountry(String arg0) {

    }

    @And("ders update created country using api end point {string}")
    public void dersUpdateCreatedCountryUsingApiEndPoint(String arg0) {

    }

    @And("ders delete created country using api end point {string} {string}")
    public void dersDeleteCreatedCountryUsingApiEndPoint(String arg0, String arg1) {

    }
}
