package com.test.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/features/01Register_Page.feature",
		"src/test/resources/features/02Login_Page.feature",
		"src/test/resources/features/03Adding_Client_Page.feature",
		"src/test/resources/features/04Labour_Page.feature",
		"src/test/resources/features/05Certificate_Page.feature",
		"src/test/resources/features/06Materials_Page.feature"}, monochrome = true, glue = { "com.test.steps" }, plugin = {
				"pretty", "json:JSON_Reports/latest-log.json", "html:target/latest-cucumber-report" })

public class GenericRunner {

}