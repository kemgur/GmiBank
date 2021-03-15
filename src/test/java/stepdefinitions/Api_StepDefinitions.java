package stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.Customer;
import utilities.ConfigReader;
import utilities.WriteToTxt;

import java.io.IOException;
import java.sql.SQLOutput;

import static io.restassured.RestAssured.given;

public class Api_StepDefinitions {

    Response response;
    Customer[] customers;


    @Given("user go to api end point {string}")
    public void user_go_to_api_end_point(String api_end_point) {
      response = given().headers("Authorization",
                "Bearer " + ConfigReader.getProperty("token"), "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON)
                .when()
                .get(api_end_point)
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();
        response.prettyPrint();
        System.out.println("====================");
    }

    @Given("read all customer and set create pojo class")
    public void read_all_customer_and_set_create_pojo_class() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Customer[] customers=objectMapper.readValue(response.asString(), Customer[].class);
        System.out.println(customers[3].getFirstName());
        System.out.println(customers[0].getAddress());

        System.out.println("======================================");
        for (int i = 0; i< customers.length; i++){

            System.out.println(customers[i].getFirstName());
        }
        System.out.println("======================================");

        for (int i=0; i<customers.length; i++){
            System.out.println(customers[i].getAddress());
        }
        System.out.println("======================================");

        for (int i=0; i<customers.length; i++){
            if (customers[i].getUser() !=null) {
                System.out.println(customers[i].getUser().getFirstName());
            }
        }
    }


    @Then("validate data")
    public void validate_data() {

        WriteToTxt.saveDataInFileWithSSN("allCustomerSSN.txt", customers);
    }


}
