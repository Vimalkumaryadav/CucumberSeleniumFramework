package com.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;
import com.test.hooks.Hooks;
import com.test.utils.waitMethods;

public class Importing_Client_Page extends Hooks {

	public Importing_Client_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Clients']")
	WebElement clientTab;

	@FindBy(xpath = "//a[text()='Import Clients']")
	WebElement import_Clients_Button;

	@FindBy(id = "exampleFormControlFile1")
	WebElement Choose_File;

	@FindBy(xpath = "//button[contains(text(),'Import Clients')]")
	WebElement import_Clients;

	@FindBy(xpath = "(//button[contains(text(),'Close')])[2]")
	WebElement close_Button;

	public void navigatingToClientImport() throws Exception {
		try {
			clientTab.click();
			waitMethods.waitUntillElementIsVisible(import_Clients_Button);
			import_Clients_Button.click();
			waitMethods.waitUntillElementIsVisible(import_Clients);
			et.log(LogStatus.PASS, "Navigated to Imported Client page Successfully");
		} catch (Exception e) {
			et.log(LogStatus.FAIL, "Importing Client Navigation Failed");
			takeScreenshot("Import_Client_Naviagtion_Failed");
			System.out.println("Error while navigating to importing client page: " + e);
		}
	}

	public void importing_Client() throws InterruptedException {

		try {
			Choose_File.sendKeys(
					"E:\\AccConnect\\Toolbot\\ToolBot Automation\\toolbot\\TestData\\Data\\Client_Example_Data.xlsx");
			waitMethods.wait2();
			import_Clients.click();
			waitMethods.waitUntillElementIsVisible(import_Clients);
			import_Clients.click();
			waitMethods.waitUntillElementIsVisible(close_Button);
			close_Button.click();
			et.log(LogStatus.PASS, "Imported Client Successfully");
		} catch (Exception e) {
			et.log(LogStatus.FAIL, "Importing Client Failed");
			takeScreenshot("Import_Client_Failed");
			System.out.println("Error while importing client: " + e);
		}
	}
}
