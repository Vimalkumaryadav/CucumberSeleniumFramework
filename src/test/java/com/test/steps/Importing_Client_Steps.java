package com.test.steps;

import com.test.pages.Importing_Client_Page;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Importing_Client_Steps {

	Importing_Client_Page icp = new Importing_Client_Page();

	@Then("^I import client through excel file$")
	public void i_import_client_through_excel_file() throws Throwable {
		icp.importing_Client();
	}

	@When("^I navigate to client tab and click on import client button$")
	public void i_navigate_to_client_tab_and_click_on_import_client_button() throws Throwable {
		icp.navigatingToClientImport();
	}
}
