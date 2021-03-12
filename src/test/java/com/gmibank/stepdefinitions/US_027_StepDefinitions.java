package com.gmibank.stepdefinitions;
import com.gmibank.utilities.ConfigReader;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import static io.restassured.RestAssured.given;
public class US_027_StepDefinitions {
    @Given("user deletes states using endpoint {string} and its extension {string} and validate")
    public void userDeletesStatesUsingEndpointAndItsExtensionAndValidate(String api_url, String id) {
        Response response = given().headers("Authorization","Bearer " + ConfigReader.getProperty("token"),
                "Content-Type",ContentType.JSON,
                "Accept", ContentType.JSON)
                .when()
                .delete(api_url+id)
                .then()
                .extract()
                .response();
        Response responseAll = given().headers("Authorization","Bearer " + ConfigReader.getProperty("token"),
                "Content-Type",ContentType.JSON,
                "Accept", ContentType.JSON)
                .when()
                .get(api_url)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        responseAll.prettyPrint();
        JsonPath jsonPath = responseAll.jsonPath();
        String kalanIdler = jsonPath.getString("id");
        System.out.println(kalanIdler);
        Assert.assertFalse("not delete",kalanIdler.contains(id));
        System.out.println("Test passed");
    }
}
