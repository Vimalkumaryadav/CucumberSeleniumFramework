package com.test.steps;

import com.test.hooks.Hooks;
import com.test.pages.Registration_Page;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;

public class Registration_Steps extends Hooks {

	/**
	 * * @STEP Definition class, in this we build glue code for all the cucumber
	 * feature file steps
	 *
	 */

	// Create object for the Login Page class
	Registration_Page rp = new Registration_Page();;

	// Runs before the test, we're opening browser in this method

	@When("^I validate the fields in registration page$")
	public void i_validate_the_fields_in_registration_page() throws Throwable {
		rp.validationElements();
	}

	@Then("^I again login into application with registrated user$")
	public void i_again_login_into_application_with_registrated_user() throws Throwable {
		driver.switchTo().defaultContent();
		driver.navigate().refresh();
	}
	
	@And("^I enter \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" and \"([^\"]*)\" and click on register$")
	public void i_enter_and_and_click_on_register(String title, String firstname, String lastname, String email,
			String businesstype, String businessname, String password, String confirmpassword) throws Throwable {
		rp.register(title, firstname, lastname, email, businesstype, businessname, password, confirmpassword);
	}

	@And("^I navigate to email and enter \"([^\"]*)\" and Verify the email$")
	public void i_navigate_to_email_and_enter_and_Verify_the_email(String email) throws Throwable {
		rp.Yopmail(email);
	}
}
