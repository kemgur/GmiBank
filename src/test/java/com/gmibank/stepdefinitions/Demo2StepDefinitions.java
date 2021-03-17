package com.gmibank.stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gmibank.jsonmodels.CountryJson;
import com.gmibank.pojos.Country;
import com.gmibank.pojos.Customer;
import com.gmibank.utilities.ConfigReader;
import com.gmibank.utilities.DatabaseUtility;
import com.gmibank.utilities.PDFGenerator;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.gmibank.utilities.DatabaseUtility.getQueryResultList;

public class Demo2StepDefinitions {
    Response response;
    Response responseAll;
    JsonPath jsonPath;
    Country[] country;
    List<Country> dbCountry = new ArrayList<>();

    @Given("User on the api endpoint {string}")
    public void api_end_point(String url) {
        response = RestAssured.given().headers(
                "Authorization",
                "Bearer " + ConfigReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(ConfigReader.getProperty(url))
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();
        response.prettyPrint();
    }

    List<Integer> idlistesi = new ArrayList<>();

    @Given("Validation countries")
    public void validate_edelim() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        country = objectMapper.readValue(response.asString(), Country[].class);
        System.out.println("ilk name okunuyor dikkat ");
        System.out.println("ilk name ");
        System.out.println(country[0].getName());
        System.out.println("id listesi geliyor ");
        System.out.println();
        for (int i = 0; i < country.length; i++) {
            idlistesi.add(country[i].getId());
            System.out.println("id  :" + country[i].getId());
        }
        JsonPath jsonPath = response.jsonPath();
        String countryId = jsonPath.getString("id");
        Assert.assertTrue("bulunamadi ", countryId.contains("74418"));
        //    WriteToTxt.saveDataInFileWithid("id.txt", country);
        //   List<String> readId = ReadTxt.returnCustomerSNNList("id.txt");
        //   Assert.assertEquals("sorun var ",idlistesi,readId);
        // System.out.println("hersey basarili ");
    }

    // Create Country
    @Given("create a country using to api end point {string}")
    public void create_a_country_using_to_api_end_point(String url) {
        response = RestAssured.given().headers(
                "Authorization",
                "Bearer " + ConfigReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .body(CountryJson.createCountry)
                .post(ConfigReader.getProperty(url))
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        response.prettyPrint();
    }

    // Validate Created  Country and  Database
    @Given("creates a connection with db using {string} , {string} and {string}")
    public void creates_a_connection_with_db_using_and(String url, String username, String password) {
        DatabaseUtility.createConnection(ConfigReader.getProperty(url), ConfigReader.getProperty(username), ConfigReader.getProperty(password));
    }

    @Given("user provides the query {string} and {string}")
    public void user_provides_the_query_and(String query, String column) {
        List<Object> list = DatabaseUtility.getColumnData(query, column);
        Country[] countries1 = new Country[list.size()];
        for (int i = 0; i < list.size() - 1; i++) {
            Country country2 = new Country();
            country2.setId(Integer.parseInt(list.get(i).toString().trim()));
            dbCountry.add(country2);
            System.out.println(dbCountry.get(i).getId());
        }
    }

    @Then("validate created country with {int}")
    public void validate_created_country_with(Integer id) {
        List<Integer> database = new ArrayList<>();
        for (int i = 0; i < dbCountry.size(); i++) {
            database.add(dbCountry.get(i).getId());
        }
        System.out.println("=================================");
        System.out.println();
        Assert.assertTrue(database.contains(id));
        System.out.println("basardik ");
    }

    @Given("user updates a country using api end point {string}  {string} and its extension {string}")
    public void user_updates_a_country_using_api_end_point_and_its_extension(String url, String name, String id) {
        Map<String, Object> updateInfos = new HashMap<>();
        updateInfos.put("id", "22320");
        updateInfos.put("name", "Team30's Country");
        updateInfos.put("states", null);
        response = RestAssured.given().headers(
                "Authorization",
                "Bearer " + ConfigReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .body(updateInfos)
                .put(ConfigReader.getProperty(url))
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();
        response.prettyPrint();
    }

    @Given("user deletes a country using endpoint {string} and its extension {string}")
    public void user_deletes_a_country_using_endpoint_and_its_extension(String url, String id) {
        response = RestAssured.given().headers(
                "Authorization",
                "Bearer " + ConfigReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .delete(ConfigReader.getProperty(url) + id)
                .then()
                .extract()
                .response();

        responseAll = RestAssured.given().headers(
                "Authorization",
                "Bearer " + ConfigReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(ConfigReader.getProperty(url))
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();
        JsonPath jsonPath = responseAll.jsonPath();
        String remainingIds = jsonPath.getString("id");
        System.out.println("***********************************************");
        Assert.assertFalse("silinmedi haberin olsun ", remainingIds.contains(id));
        System.out.println("-------------------------");
        System.out.println("islem tamam ");
    }

    @Given("demo pdf user creates a connection with db using {string} , {string} and {string}")
    public void demo_pdf_user_creates_a_connection_with_db_using_and(String url, String username, String password) {
        DatabaseUtility.createConnection(ConfigReader.getProperty(url), ConfigReader.getProperty(username), ConfigReader.getProperty(password));
    }

    @Given("demo pdf user provides the query {string}")
    public void demo_pdf_user_provides_the_query(String query) {
        List<Customer> Customers = new ArrayList<>();
        List<List<Object>> list = getQueryResultList(query);
        for (int i = 0; i <= 5; i++) {
            Customer customer = new Customer();
            customer.setFirstName(list.get(i).get(1).toString());
            customer.setLastName(list.get(i).get(2).toString());
            customer.setMobilePhoneNumber(list.get(i).get(5).toString());
            //      customer.setCity(list.get(i).get(9).toString());
            customer.setSsn(list.get(i).get(10).toString());
            Customers.add(customer);
        }
        PDFGenerator.pdfGeneratorRowsAndCellsWithListFirstToFive("                    *** Team 30 THE BUG FINDERS DEMO PRESENTATION *** \n                                                      === ilk datalar  ===", Customers, "     sunumDosyasi.pdf");

    }
}