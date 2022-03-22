package com.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;
import com.test.hooks.Hooks;
import com.test.utils.waitMethods;

public class Adding_Client_Page extends Hooks {

	public Adding_Client_Page() {
		PageFactory.initElements(driver, this);
	}

	// Defining all the Add Client page elements in the below standards

	@FindBy(xpath = "//a[text()=\"Clients\"]")
	WebElement clientTab;

	@FindBy(xpath = "//button[text()='Add Client']")
	WebElement add_Client_Button;

	@FindBy(xpath = "//select[@id='title']")
	WebElement client_Title;

	@FindBy(xpath = "//input[@id='firstName']")
	WebElement first_Name;

	@FindBy(xpath = "//p[text()='First Name is required']")
	WebElement first_Name_Validation;

	@FindBy(xpath = "//input[@id='lastName']")
	WebElement last_Name;

	@FindBy(xpath = "//p[text()='Last Name is required']")
	WebElement last_Name_Valiation;

	@FindBy(xpath = "//input[@id='telephone']")
	WebElement telephone;

	@FindBy(xpath = "//input[@id='mobile']")
	WebElement Mobile;

	@FindBy(xpath = "//input[@id='email']")
	WebElement client_Email;

	@FindBy(xpath = "//p[text()='Please change the email for this client. Another client has the same email']")
	WebElement client_Email_Validation;
	
	@FindBy(xpath = "//p[text()='Email is not a valid email address']")
	WebElement client_Email_Invalid;
	
	@FindBy(xpath = "//textarea[@id='notes']")
	WebElement note;

	@FindBy(xpath = "//button[text()='Save Client Details ']")
	WebElement Save_Client_Details_Button;

	// Defining all the Add Address page elements in the below standards

	@FindBy(xpath = "//button[text()=' Add Address ']")
	WebElement add_Address_to_Client;

	@FindBy(xpath = "//input[@id='address1']")
	WebElement addressOne;

	@FindBy(xpath = "//p[text()='Address 1 is required']")
	WebElement addressOne_Validation;

	@FindBy(xpath = "//input[@id='address2']")
	WebElement addressTwo;

	@FindBy(xpath = "//input[@id='town']")
	WebElement townText;

	@FindBy(xpath = "//p[text()='Town is required']")
	WebElement town_Validation;

	@FindBy(xpath = "//select[@id='county']")
	WebElement countyDropdown;

	@FindBy(xpath = "//input[@id='postalCode']")
	WebElement postCode;

	@FindBy(xpath = "//p[text()='Post Code is required']")
	WebElement postCode_Validation;

	@FindBy(xpath = "//textarea[@id='notes']")
	WebElement address_Notes;

	@FindBy(xpath = "//button[text()='Save Changes ']")
	WebElement save_Changes;

	@FindBy(xpath = "//button[text()=' Close ']")
	WebElement popup_Close_Button;

	public void adding_Client() throws InterruptedException {
		try {
			waitMethods.waitUntillElementIsVisible(clientTab);
			clientTab.click();
			waitMethods.waitUntillElementIsVisible(add_Client_Button);
			add_Client_Button.click();
			waitMethods.wait2();
			et.log(LogStatus.PASS, "Adding Client succesfully");
		} catch (Exception e) {
			et.log(LogStatus.FAIL, "Adding Client Failed");
			takeScreenshot("Adding_Client_Failed");
		}

	}

	public void validationClientDetailsElements() throws Exception {
		try {
			Save_Client_Details_Button.click();
			element_validation(first_Name_Validation, last_Name_Valiation,
					"All the fields are validated in the client details tab", "Validation Failed in client details tab");	
		} catch (Exception e) {
			System.out.println(e);
			et.log(LogStatus.FAIL, "Client Details Validation Failed");
		}
	}

	public void validationAddressElements() throws Exception {
		try {
			waitMethods.wait2();
			add_Address_to_Client.click();
			waitMethods.waitUntillElementIsVisible(save_Changes);
			save_Changes.click();
			waitMethods.wait2();
			element_validation(addressOne_Validation, town_Validation, postCode_Validation,
					"All the fields are validated in the client address tab", "Validation Failed in client address tab");	
		} catch (Exception e) {
			System.out.println(e);
			et.log(LogStatus.FAIL, "Client Address Validation Failed");
		}
	}

	public void validatingDuplicateEmail(String clientemailduplicate) throws Exception {
		try {
			waitMethods.wait2();
			first_Name.sendKeys("test");
			last_Name.sendKeys("test");
			client_Email.sendKeys(clientemailduplicate);
			Save_Client_Details_Button.click();
			waitMethods.wait2();
			element_validation(client_Email_Validation, "Duplicate email field is validated in the client details tab",
					"Duplicate email validation Failed in client details tab");	
		} catch (Exception e) {
			System.out.println(e);
			et.log(LogStatus.FAIL, "Duplicate Email Validation Failed");
		}
	}
	
	public void passinginvalidemail(String clientfirstname)throws Exception {
		try {
			waitMethods.wait2();
			first_Name.sendKeys("test");
			last_Name.sendKeys("test");
			client_Email.clear();
			client_Email.sendKeys(clientfirstname);
			Save_Client_Details_Button.click();
			waitMethods.wait2();
			element_validation(client_Email_Invalid, "Invalid email field is validated in the client details tab",
					"Invalid email validation Failed in client details tab");	
		} catch (Exception e) {
			System.out.println(e);
			et.log(LogStatus.FAIL, "Invalid Email Validation Failed");
		}
	}

	public void client_Detail(String clienttitle, String clientfirstname, String clientlastname, String telephonenumber,
			String mobilenumber, String clientemail, String notes) throws InterruptedException {
		try {
			Select TitleDropdown = new Select(client_Title);
			TitleDropdown.selectByVisibleText(clienttitle);
			first_Name.clear();
			first_Name.sendKeys(clientfirstname);
			last_Name.clear();
			last_Name.sendKeys(clientlastname);
			telephone.sendKeys(telephonenumber);
			Mobile.sendKeys(mobilenumber);
			client_Email.clear();
			client_Email.sendKeys(clientemail);
			note.sendKeys(notes);
			waitMethods.waitUntillElementIsVisible(Save_Client_Details_Button);
			Save_Client_Details_Button.click();
			et.log(LogStatus.PASS, "Client Details Saved succesfully");
		} catch (Exception e) {
			et.log(LogStatus.FAIL, "Client Details Failed");
			takeScreenshot("Client_Details_Failed");
		}

	}

	public void client_Address(String address1, String address2, String town, String county, String postcode,
			String addressnotes) throws InterruptedException {
		try {
			addressOne.sendKeys(address1);
			addressTwo.sendKeys(address2);
			townText.sendKeys(town);
			Select CountyDropdown = new Select(countyDropdown);
			CountyDropdown.selectByVisibleText(county);
			postCode.sendKeys(postcode);
			address_Notes.sendKeys(addressnotes);
			waitMethods.waitUntillElementIsVisible(save_Changes);
			save_Changes.click();
			waitMethods.waitUntillElementIsVisible(popup_Close_Button);
			popup_Close_Button.click();
			waitMethods.wait2();
			et.log(LogStatus.PASS, "Client Address Saved succesfully");
		} catch (Exception e) {
			et.log(LogStatus.FAIL, "Client Address Failed");
			takeScreenshot("Client_Address_Failed");
		}

	}
}
