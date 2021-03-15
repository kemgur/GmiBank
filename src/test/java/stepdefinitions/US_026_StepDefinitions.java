package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.Country;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_026_StepDefinitions {

    @Given("user go to api end point {string} {string}, {string}")
    public void user_go_to_api_end_point(String endPoint, String id, String states) {
        String token="eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZWFtMzBhZG1pbiIsImF1dGgiOiJST0xFX0FETUlOIiwiZXhwIjoxNjE1NDk2NTI2fQ.FVs5rMAbVEvF0pdqKluqU5zJdF-5eZL7W4YvfGYvikGu1uaQrdAudcnLgJCrNZ4gT8PA8lWFDLgjNWEhMkNp0g";

//        Country country=new Country(id, name);
        Map<String,Object> expectedBody= new HashMap<>();
        expectedBody.put("id", 24106);
        expectedBody.put("name", null);

        Response response=given().
                accept(ContentType.JSON).
                contentType(ContentType.JSON).
                auth().
                oauth2(token).
                when().
                body(expectedBody).
                get(endPoint).
                then().
                extract().
                response();

        response.prettyPrint();

    }

    @Then("validate specific some data")
    public void validate_specific_some_data() {

    }
}
