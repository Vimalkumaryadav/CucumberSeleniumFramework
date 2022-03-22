package com.test.pages;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;
import com.test.hooks.Hooks;
import com.test.utils.waitMethods;

public class Registration_Page extends Hooks {
	/**
	 * In this class, we define all the Login page elements along with methods and
	 * declaration, we can reuse these methods accorss project
	 * 
	 */

	public Registration_Page() {
		PageFactory.initElements(driver, this);
	}

	// Defining all the Registration page elements in the below standards

	@FindBy(xpath = "//a[text()=' start your 30-day free trial ']")
	WebElement Register_button;

	@FindBy(xpath = "//select[@id='title']")
	WebElement Title;

	@FindBy(xpath = "//input[@id='company']")
	WebElement company_Name;

	@FindBy(xpath = "//p[text()='Business Name is required']")
	WebElement company_Name_Validation;

	@FindBy(xpath = "//select[@id='company_type_id']")
	WebElement business_Type;

	@FindBy(id = "first_name")
	WebElement first_Name;

	@FindBy(xpath = "//p[text()='First Name is required']")
	WebElement first_Name_Validation;

	@FindBy(id = "last_name")
	WebElement last_Name;

	@FindBy(xpath = "//p[text()='Last Name is required']")
	WebElement last_Name_Validation;

	@FindBy(xpath = "//input[@id='email']")
	WebElement email_Signup;

	@FindBy(xpath = "//p[text()='Email is required']")
	WebElement email_Validation;

	@FindBy(xpath = "//input[@id='password']")
	WebElement password_Signup;

	@FindBy(xpath = "//p[text()='Password is required']")
	WebElement password_Validation;

	@FindBy(id = "password_confirmation")
	WebElement passwordConfirm_Signup;

	@FindBy(xpath = "//p[text()='Confirm Password is required']")
	WebElement passwordConfirm_Validation;

	@FindBy(xpath = "//input[@id='agree']")
	WebElement agree_Checkbox;

	@FindBy(xpath = "//button[text()='Register']")
	WebElement register_Button;

	@FindBy(xpath = "//h1[text()='Thank You']")
	WebElement thankYouMessage;

	@FindBy(xpath = "//pre[contains(text(),'Dear Amazon Web Services Customer,')]")
	WebElement email_Verification;

	@FindBy(xpath = "//a[contains(text(),'Verify Email Address')]")
	WebElement email_Verification2;

	@FindBy(xpath = "//h1[text()='Registration Complete']")
	WebElement registrationSuccessMessage;

	public void validationElements() throws Exception {
		try {
			Register_button.click();
			waitMethods.wait5();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView()", register_Button); 
			waitMethods.wait5();
			register_Button.click();
			waitMethods.wait2();
			element_validation(first_Name_Validation, last_Name_Validation, email_Validation, company_Name_Validation,
					password_Validation, passwordConfirm_Validation,
					"All the fields are validated in the registration page", "Validation Failed in the registration page");	
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void register(String title, String firstname, String lastname, String email, String businesstype,
			String businessname, String password, String confirmpassword) throws Exception {
		try {
			waitMethods.wait2();
			Select TitleSelect = new Select(Title);
			TitleSelect.selectByVisibleText(title);

			waitMethods.wait2();

			first_Name.sendKeys(firstname);

			waitMethods.wait2();

			last_Name.sendKeys(lastname);

			email_Signup.sendKeys(email);

			Select BusinessTypeSelect = new Select(business_Type);
			BusinessTypeSelect.selectByVisibleText(businesstype);

			company_Name.sendKeys(businessname);

			password_Signup.sendKeys(password);
			passwordConfirm_Signup.sendKeys(confirmpassword);

			waitMethods.wait2();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");

			waitMethods.wait2();
			try {
				Actions a = new Actions(driver);
				a.moveToElement(agree_Checkbox).click().build().perform();
			} catch (Exception e) {
				System.out.println(e);
			}

			register_Button.click();

			waitMethods.wait2();
			String ThankYouMesssage = thankYouMessage.getText();
			if (ThankYouMesssage.equalsIgnoreCase("Thank You")) {
				System.out.println("Registration successfully");
				et.log(LogStatus.PASS, "Registration succesfully");
			} else {
				et.log(LogStatus.FAIL, "Registration_Error");
				takeScreenshot("Registration_Error");
				driver.quit();
			}
		} catch (Exception e) {
			et.log(LogStatus.FAIL, "Registration_Error");
			takeScreenshot("Registration_Error");
			driver.quit();
		}

	}

	public void Yopmail(String email) throws Exception {
		try {
			((JavascriptExecutor) driver).executeScript("window.open()");
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));

			/********** YOP MAIL **********/

			driver.get("http://www.yopmail.com/en/");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			driver.findElement(By.id("login")).sendKeys(email, Keys.ENTER);
			waitMethods.wait2();
			WebElement FrameLocation = driver.findElement(By.name("ifmail"));
			driver.switchTo().frame(FrameLocation);

			try {
				email_Verification2.click();
				waitMethods.wait3();
				driver.switchTo().window(tabs.get(1));
			} catch (Exception e) {
				String Email_Verification = email_Verification.getText();

				String Verified_Email = Email_Verification.substring(295, 748);

				System.out.println(Verified_Email);
				driver.switchTo().defaultContent();

				/***** VERIFIED EMAIL *****/

				driver.get(Verified_Email);
			}
			driver.close();
			waitMethods.wait2();
			driver.switchTo().window(tabs.get(0));

			driver.get(targetURL);
			et.log(LogStatus.PASS, "Email Verified Successfully");
			waitMethods.wait2();
		} catch (Exception e) {
			takeScreenshot("Email verification Failed");
		}

	}

}
