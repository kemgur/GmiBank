package com.gmibank.stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gmibank.pojos.Applicants;
import com.gmibank.utilities.ConfigReader;
import com.gmibank.utilities.ReadTxt;
import com.gmibank.utilities.WriteToTxt;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.io.IOException;
import java.util.Arrays;

public class US_023_StepDefinitions {
    Applicants[] applicants;
    Response response;
    JsonPath jsonPath;


    @Given("Gmi Bank user goes to api end point {string}")
    public void gmiBankUserGoesToApiEndPoint(String endpoint) {
        response = RestAssured.
                given().
                accept(ContentType.JSON).
                contentType(ContentType.JSON).
                auth().
                oauth2(ConfigReader.getProperty("token")).
                when().
                get(endpoint).
                then().
                extract().
                response();

        response.prettyPrint();

        jsonPath = response.jsonPath();
    }

    @And("Gmi Bank user validate data")
    public void gmiBankUserValidateData() throws IOException {
        //applicants = new Applicants(67342, "189-10-1111", "Nilufer", "Er", "",
        //      "123-454-7890", 67909, "nilu", "nilufer.ersoz@gmail.com", "2021-01-19T02:20:51.603Z");


        ObjectMapper objectMapper = new ObjectMapper();

        applicants = objectMapper.readValue(response.asString(), Applicants[].class);

        //System.out.println(jsonPath.getString("ssn"));

        //WriteToTxt.saveDataInFileWithSSN("allApplicantsSsn", applicants);

        Assert.assertEquals(applicants[0].getAddress(), "xd");




    }
}
