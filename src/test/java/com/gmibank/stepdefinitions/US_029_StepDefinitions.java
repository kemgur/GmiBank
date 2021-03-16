package com.gmibank.stepdefinitions;
/*
import io.cucumber.java.en.Given;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.List;
public class US_029_StepDefinitions {
    List<Object> userEmailList;
    List<Object> countryNameList;
    List<Object> stateNameList;
    @Given("user creates a connection with db using {string} , {string} and {string}")
    public void user_creates_a_connection_with_db_using_and(String url, String user, String password) {
        DatabaseUtility.createConnection(url,user,password);
    }
    @Given("user retrieves the info of user from database using {string} and {string}")
    public void userRetrievesTheInfoOfUserFromDatabaseUsingAnd(String query, String userEmail) {
        userEmailList = DatabaseUtility.getColumnData(query,userEmail);
        System.out.println(userEmailList);
    }
    @Given("user validates users' info")
    public void user_validates_users_info() {
        Assert.assertTrue(userEmailList.contains("anonymous@localhost"));
        System.out.println("Test passed");
    }
    @Given("user retrieves all countries' info from database using {string} and {string}")
    public void user_retrieves_all_countries_info_from_database_using_and(String query, String name) {
        countryNameList = DatabaseUtility.getColumnData(query,name);
        System.out.println(countryNameList.toString());
    }
    @Given("user validates countries' info")
    public void user_validates_countries_info() {
        Assert.assertTrue(countryNameList.contains("firdevs"));
        System.out.println("Test passed");
    }
    @Given("user retrieves all states from database using {string} and {string}")
    public void user_retrieves_all_states_from_database_using_and(String query, String name) {
        stateNameList = DatabaseUtility.getColumnData(query,name);
        System.out.println(stateNameList);
    }
    @Given("user validates states")
    public void user_validates_states() {
        Assert.assertTrue(stateNameList.contains("Basse-Normandie "));
        System.out.println("Test passed");
    }
    @Given("user closes connection")
    public void userClosesConnection() {
        DatabaseUtility.closeConnection();
    }
}


 */