package com.gmibank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\default-cucumber_reports.html",
                "json:target\\json-reports/cucumber.json",
                "junit:target\\xml-report/cucumber.xml" ,
                "pretty", "html:target/Destination.html"},

        features="src/test/resources/features",
        glue= "com/gmibank/stepdefinitions",
        dryRun = false,
        tags = "@secondUI"
)

public class Runner {
}
