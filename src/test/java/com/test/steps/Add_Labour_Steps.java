package com.test.steps;

import com.test.pages.Add_Labour_Page;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class Add_Labour_Steps {

	Add_Labour_Page alp = new Add_Labour_Page();

	@And("^I validate the all fields in the Labour page$")
	public void i_validate_the_all_fields_in_the_labour_page() throws Throwable {
		alp.validatefields();
	}

	@Then("^I navigate to labour and enter the \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" and click on save button$")
	public void i_navigate_to_labour_and_enter_the_something_something_something_something_something_something_something_something_and_click_on_save_button(
			String calloutcharge, String hourlyrate, String dayrate, String weekendcalloutcharge,
			String weekendhourlyrate, String saturdaydayrate, String sundaydayrate, String emergencycalloutcharge)
			throws Throwable {
		alp.add_Labour(calloutcharge, hourlyrate, dayrate, weekendcalloutcharge, weekendhourlyrate, saturdaydayrate,
				sundaydayrate, emergencycalloutcharge);
	}
}
