package com.test.steps;

import com.test.pages.Certificate_Page;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class Certificate_Steps {

	Certificate_Page cp = new Certificate_Page();

	@Then("^I validate the fields in the certificate page$")
	public void i_validate_the_fields_in_the_certificate_page() throws Throwable {
		cp.validatingCertificate();
	}

	@And("^I Add Certificate \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" and click on save certificate button$")
	public void i_add_certificate_something_something_something_and_click_on_save_certificate_button(
			String certificatename, String certificatenetprice, String certificategrossprice) throws Throwable {
		cp.addCertificate(certificatename, certificatenetprice, certificategrossprice);
	}

	@And("^I Add duplicate Certificate \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" and click on save certificate button$")
	public void i_add_duplicate_certificate_something_something_something_and_click_on_save_certificate_button(
			String certificatename, String certificatenetprice, String certificategrossprice) throws Throwable {
		cp.valiateDuplicateCertificate(certificatename, certificatenetprice, certificategrossprice);
	}
}
