package com.test.steps;

import com.test.hooks.Hooks;
import com.test.pages.Login_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;

public class Login_Steps extends Hooks {

	String ActualTitle;

	/**
	 * * @STEP Definition class, in this we build glue code for all the cucumber
	 * feature file steps
	 *
	 */
	Login_Page lp = new Login_Page();;

	// In this step, we're navigating to URL of the application
	@Given("^I navigated to the application and to registration page$")
	public void i_navigated_to_the_application_and_to_registration_page() throws Throwable {
		navigateToApplication();
	}

	@And("I enter \"([^\"]*)\" and \"([^\"]*)\" and click on submit")
	public void i_enter_and_and_click_on_submit(String username, String password) throws Throwable {
		lp = new Login_Page();
		lp.enterUsernamePassword(username, password);
	}

	@Then("^Application should display expected result based on \"([^\"]*)\"$")
	public void application_should_display_expected_result_based_on_valid(String criteria) throws Throwable {
		lp.validateLogin(criteria);
	}

	/***** Other Feature testing *****/

	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		navigateToApplication();
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_credentials(String email, String password) throws Throwable {
		lp = new Login_Page();
		lp.enterUsernamePassword(email, password);
	}

	@And("^application should display expected result based on \"([^\"]*)\"$")
	public void user_gets_the_title_of_the_page(String criteria) throws Throwable {
		lp.validateLogin(criteria);
	}

	@When("^forgot your password link should be displayed$")
	public void forgot_your_password_link_should_be_displayed() throws Throwable {
		lp.isForgotPwdLinkExist();
	}

	@And("^registration link should be displayed$")
	public void registration_link_should_be_displayed() throws Throwable {
		lp.validatingRegister();
	}
}
