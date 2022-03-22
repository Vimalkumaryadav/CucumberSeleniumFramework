package com.test.steps;

import com.test.pages.Estimate_Page;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Estimate_Steps {

	Estimate_Page ep=new Estimate_Page();
	
	@When("^I navigate to estimate page and add estimate$")
	public void i_navigate_to_estimate_page_and_add_estimate() throws Throwable {
		ep.adding_Estimate();
	}

	@And("^create estimate by entering \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" ,  \"([^\"]*)\" ,  \"([^\"]*)\" and save estimate$")
	public void create_estimate_by_entering_something_something_something_something_something_and_save_estimate(
			String jobreference, String paymentterms, String clienttitle , String clientfirstname , String clientlastname , String address1, String jobname, String jobdescription) throws Throwable {
		ep.creating_Estimate(jobreference, paymentterms, clienttitle, clientfirstname, clientlastname, address1, jobname, jobdescription);
	}
	
	@Then("^I added part materials \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" and save material$")
	public void i_added_part_materials_something_something_something_something_something_and_save_material(
			String selectmaincategory, String subcategorytitle, String retailertitle, String productsku,
			String quantity)
			throws Throwable {
		ep.adding_Parts_Materials(selectmaincategory, subcategorytitle, retailertitle, productsku, quantity);
	}

	@And("^Add labour charges by givng \"([^\"]*)\" and save labour charges $")
	public void add_labour_charges_by_givng_something_and_save_labour_charges(String labourquantity)
			throws Throwable {
		ep.adding_Labour_Charges(labourquantity);
	}
	
	@And("^Add certificate by selecting \"([^\"]*)\" and save certificate$")
	public void add_certificate_by_selecting_something_and_save_certificate(String certificatename)
			throws Throwable {
		ep.adding_Certificate(certificatename);
	}	
	@Then("^send estimate with message \"([^\"]*)\" and send estimate email$")
	public void send_estimate_with_message_something_and_send_estimate_email(String estimatemessage)
			throws Throwable {
		ep.sending_Estimate(estimatemessage);
	}

	@Then("^Add estimate as mark as invoice $")
	public void add_estimate_as_mark_as_invoice() throws Throwable {
		ep.marked_As_Invoice();
	}






}
