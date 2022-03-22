package com.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;
import com.test.hooks.Hooks;
import com.test.utils.waitMethods;

public class Add_Labour_Page extends Hooks {

	public Add_Labour_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Price Lists')]")
	WebElement priceLists;

	@FindBy(xpath = "//a[text()='Labour']")
	WebElement Labour;

	@FindBy(xpath = "(//input[@name='rate[]'])[1]")
	WebElement callout_Charge;

	@FindBy(xpath = "(//p[@name='rate[]'])[1]")
	WebElement callout_Charge_Validation;

	@FindBy(xpath = "(//input[@name='rate[]'])[2]")
	WebElement hourly_Rate;

	@FindBy(xpath = "(//p[@name='rate[]'])[2]")
	WebElement hourly_Rate_Validation;

	@FindBy(xpath = "(//input[@name='rate[]'])[3]")
	WebElement day_Rate;

	@FindBy(xpath = "(//p[@name='rate[]'])[3]")
	WebElement day_Rate_Validation;

	@FindBy(xpath = "(//input[@name='rate[]'])[4]")
	WebElement weekend_Callout_charge;

	@FindBy(xpath = "(//p[@name='rate[]'])[4]")
	WebElement weekend_Callout_charge_Valdation;

	@FindBy(xpath = "(//input[@name='rate[]'])[5]")
	WebElement weekend_hourly_Rate;

	@FindBy(xpath = "(//p[@name='rate[]'])[5]")
	WebElement weekend_hourly_Rate_Valdation;

	@FindBy(xpath = "(//input[@name='rate[]'])[6]")
	WebElement saturday_Day_Rate;

	@FindBy(xpath = "(//p[@name='rate[]'])[6]")
	WebElement saturday_Day_Rate_Validation;

	@FindBy(xpath = "(//input[@name='rate[]'])[7]")
	WebElement sunday_Day_Rate;

	@FindBy(xpath = "(//p[@name='rate[]'])[7]")
	WebElement sunday_Day_Rate_Validation;

	@FindBy(xpath = "(//input[@name='rate[]'])[8]")
	WebElement emergency_Callout_charge;

	@FindBy(xpath = "(//p[@name='rate[]'])[8]")
	WebElement emergency_Callout_charge_Validation;

	@FindBy(xpath = "//button[text()='Save Changes']")
	WebElement save_Labour;

	@FindBy(xpath = "(//button[text()='Close'])[2]")
	WebElement close_Button;

	public void validatefields() throws Exception {
		try {
			waitMethods.wait2();
			Actions action = new Actions(driver);
			action.moveToElement(priceLists).perform();

			Labour.click();
			waitMethods.wait2();
			save_Labour.click();
			waitMethods.wait2();
			element_validation(callout_Charge_Validation, hourly_Rate_Validation, day_Rate_Validation,
					weekend_Callout_charge_Valdation, weekend_hourly_Rate_Valdation, saturday_Day_Rate_Validation,
					sunday_Day_Rate_Validation, emergency_Callout_charge_Validation,
					"All the Fields are Validation in labour page", "Validation Failed in Labour Page");
			waitMethods.wait2();
			close_Button.click();
			waitMethods.wait2();
		} catch (Exception e) {
			System.out.println(e);
			et.log(LogStatus.FAIL, "Labour Validation Failed");
		}
	}

	public void add_Labour(String calloutcharge, String hourlyrate, String dayrate, String weekendcalloutcharge,
			String weekendhourlyrate, String saturdaydayrate, String sundaydayrate, String emergencycalloutcharge)
			throws InterruptedException {
		try {
			waitMethods.wait2();
			Actions action = new Actions(driver);

			action.moveToElement(priceLists).perform();

			Labour.click();
			waitMethods.wait2();

			callout_Charge.sendKeys(calloutcharge);
			hourly_Rate.sendKeys(hourlyrate);
			day_Rate.sendKeys(dayrate);
			weekend_Callout_charge.sendKeys(weekendcalloutcharge);
			weekend_hourly_Rate.sendKeys(weekendhourlyrate);
			saturday_Day_Rate.sendKeys(saturdaydayrate);
			waitMethods.wait2();
			sunday_Day_Rate.sendKeys(sundaydayrate);
			emergency_Callout_charge.sendKeys(emergencycalloutcharge);
			waitMethods.wait2();
			save_Labour.click();
			waitMethods.wait2();
			close_Button.click();
			waitMethods.wait2();
			et.log(LogStatus.PASS, "Added Labour charges Successfully");
		} catch (Exception e) {
			et.log(LogStatus.FAIL, "Adding Labour Rates Failed");
			takeScreenshot("Adding_Labour_Rates_Failed");
		}

	}

}
