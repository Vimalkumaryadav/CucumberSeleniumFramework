package com.test.steps;

import com.test.hooks.Hooks;
import com.test.pages.Adding_Client_Page;
import com.test.pages.Login_Page;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Adding_Client_Steps extends Hooks {

	Adding_Client_Page acp = new Adding_Client_Page();

	Login_Page lp = new Login_Page();

	@When("^I sign in with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_sign_in_with_something_and_something(String email, String password) throws Throwable {
		lp = new Login_Page();
		lp.enterUsernamePassword(email, password);
	}

	@When("^I navigate to client tab and click on add client button$")
	public void i_navigate_to_client_tab_and_click_on_add_client_button() throws Throwable {
		acp.adding_Client();
	}

	@Then("^I validate the fields in the client details tab$")
	public void i_validate_the_fields_in_the_client_details_tab() throws Throwable {
		acp.validationClientDetailsElements();
	}

	@Then("^I validate the fields in the client address tab$")
	public void i_validate_the_fields_in_the_client_address_tab() throws Throwable {
		acp.validationAddressElements();
	}

	@And("^I validate email by passing already used \"([^\"]*)\"$")
	public void i_validate_email_by_passing_already_used_something(String clientemailduplicate) throws Throwable {
		acp.validatingDuplicateEmail(clientemailduplicate);
	}

	@And("^I validate email by passing invalid email \"([^\"]*)\"$")
	public void i_validate_email_by_passing_invalid_email_something(String clientfirstname) throws Throwable {
		acp.passinginvalidemail(clientfirstname);
	}

	@And("^I enter the \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" and click on sumbit button$")
	public void i_enter_the_something_something_something_something_something_something_something_and_click_on_sumbit_button(
			String clienttitle, String clientfirstname, String clientlastname, String telephonenumber,
			String mobilenumber, String clientemail, String notes) throws Throwable {
		acp.client_Detail(clienttitle, clientfirstname, clientlastname, telephonenumber, mobilenumber, clientemail,
				notes);
	}

	@Then("^I click on Add Address button and enter the \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" and click on save changes button$")
	public void i_click_on_add_address_button_and_enter_the_something_something_something_something_something_something_and_click_on_save_changes_button(
			String address1, String address2, String town, String county, String postcode, String addressnotes)
			throws Throwable {
		acp.client_Address(address1, address2, town, county, postcode, addressnotes);
	}
}
