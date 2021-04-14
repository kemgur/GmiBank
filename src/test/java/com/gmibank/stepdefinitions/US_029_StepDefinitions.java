package com.gmibank.stepdefinitions;

import com.gmibank.utilities.ConfigurationReader;
import com.gmibank.utilities.DatabaseUtility;
import io.cucumber.java.en.Given;
import org.junit.Assert;

import java.util.List;
public class US_029_StepDefinitions {
    List<Object> userEmailList;
    List<Object> countryNameList;
    List<Object> stateNameList;
    @Given("User retrieves the info of user from database using {string} and {string}")
    public void userRetrievesTheInfoOfUserFromDatabaseUsingAnd(String query, String userEmail) {
        userEmailList = DatabaseUtility.getColumnData(query,userEmail);
        System.out.println(userEmailList);
    }
    @Given("User validates users info {string}")
    public void user_validates_users_info(String email) {
        Assert.assertTrue(userEmailList.contains(ConfigurationReader.getProperty(email)));
        System.out.println("Test passed");
    }
    @Given("User retrieves all countries' info from database using {string} and {string}")
    public void user_retrieves_all_countries_info_from_database_using_and(String query, String name) {
        countryNameList = DatabaseUtility.getColumnData(query,name);
        System.out.println(countryNameList.toString());
    }
    @Given("User validates countries' info")
    public void user_validates_countries_info() {
        Assert.assertTrue(countryNameList.contains("firdevs"));
        System.out.println("Test passed");
    }
    @Given("User retrieves all states from database using {string} and {string}")
    public void user_retrieves_all_states_from_database_using_and(String query, String name) {
        stateNameList = DatabaseUtility.getColumnData(query,name);
        System.out.println(stateNameList);
    }
    @Given("User validates states")
    public void user_validates_states() {
        Assert.assertTrue(stateNameList.contains("Basse-Normandie "));
        System.out.println("Test passed");
    }
    @Given("User closes connection")
    public void userClosesConnection() {
        DatabaseUtility.closeConnection();
    }
}


