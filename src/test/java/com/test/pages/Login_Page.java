package com.test.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;
import com.test.hooks.Hooks;
import com.test.utils.waitMethods;

public class Login_Page extends Hooks {
	/**
	 * In this class, we define all the Login page elements along with methods and
	 * declaration, we can reuse these methods accorss project
	 * 
	 */

	public Login_Page() {
		PageFactory.initElements(driver, this);
	}

	// Defining all the Login page elements in the below standards

	@FindBy(xpath = "//input[@id='email']")
	public WebElement username;

	@FindBy(xpath = "//input[@id='Password']")
	public WebElement password;

	@FindBy(id = "btnFormSub")
	public WebElement login_Button;

	@FindBy(xpath = "//a[contains(text(),'Work')]")
	public WebElement Dashboard_Work;

	@FindBy(xpath = "//strong[text()='These credentials do not match our records.']")
	public WebElement warnMessage;

	@FindBy(xpath = "//div[text()='Confirm your password']")
	public WebElement confirmPasswordWarning;

	@FindBy(xpath = "//strong[text()='The email has already been taken.']")
	public WebElement alreadyTakenEmail;

	@FindBy(xpath = "//p[text()='Thank you for registering your free Toolbot account.']")
	public WebElement ThankYouMessage;

	@FindBy(xpath = "//a[text()=' Forgot your password? ']")
	public WebElement forgotPassword;

	@FindBy(xpath = "//p[text()='The email must be a valid email address.']")
	public WebElement emailValidation;

	@FindBy(xpath = "//p[text()='These credentials do not match our records.']")
	public WebElement loginValidation;
	
	@FindBy(xpath = "//a[text()=' start your 30-day free trial ']")
	public WebElement registerLink;
	

	// Login method
	public void enterUsernamePassword(String email, String pwd) throws Exception {
		try {
			waitMethods.wait3();
			username.sendKeys(email);
			password.sendKeys(pwd, Keys.ENTER);	
		} catch (Exception e) {
			System.out.println(e);
			et.log(LogStatus.FAIL, "Credentials Failed");
		}
		
	}

	// Forgot Password method
	public void isForgotPwdLinkExist() throws Exception {
		if (forgotPassword.isDisplayed()) {
			et.log(LogStatus.PASS, "Forgot Password link is verified");
		} else {
			et.log(LogStatus.FAIL, "Forgot Password link Failed");
		}
	}

	//Validation method
	public void validatingLogin() throws Exception {
		waitMethods.wait2();
		try {
			if (loginValidation.isDisplayed()) {
				et.log(LogStatus.PASS, "Email validated succesfully");
			}
		} catch (Exception e) {
			et.log(LogStatus.FAIL, "Email validation Failed");
			System.out.println(e);
		}
	}

	public void validatingRegister() throws Exception{
		waitMethods.wait2();
		try {
			if (registerLink.isDisplayed()) {
				et.log(LogStatus.PASS, "registration Link validated succesfully");
			}
		} catch (Exception e) {
			et.log(LogStatus.FAIL, "registration Link validation Failed");
			System.out.println(e);
		}
	}
	// Login validation method
	public void validateLogin(String criteria) throws Exception {
		if (criteria.equals("valid")) {
			waitMethods.waitUntillElementIsVisible(Dashboard_Work);

			Hooks.element_validation(Dashboard_Work, "The Login is Success and Verified",
					"Login Validation is Failed, Please refer Screenshot");
		} else if (criteria.equals("invalid")) {
			waitMethods.waitUntillElementIsVisible(loginValidation);
			System.err.println("Login Validation Pass for Invalid Input");
			Hooks.element_validation(loginValidation, "Login Validation Pass for Invalid Input",
					"Login Validation is Failed for Invalid Input, Please refer Screenshot");
		} else {
			System.out.println("There is issue with Login criteria field");
		}

	}

}
