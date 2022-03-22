package com.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;
import com.test.hooks.Hooks;
import com.test.utils.waitMethods;

public class Certificate_Page extends Hooks {

	public Certificate_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Price Lists')]")
	WebElement priceLists;

	@FindBy(xpath = "//a[text()='Certificates']")
	WebElement certificates;

	@FindBy(xpath = "//a[text()='Add Certificate ']")
	WebElement add_Certificate;

	@FindBy(xpath = "//input[@name='title']")
	WebElement certificate_Name;

	@FindBy(xpath = "//div[text()='Certificate title is required']")
	WebElement certificate_Name_Validation;

	@FindBy(xpath = "//input[@name='net_price']")
	WebElement certificate_Net_Price;

	@FindBy(xpath = "//div[text()='Net Price is required']")
	WebElement certificate_Net_Price_Validation;

	@FindBy(xpath = "//input[@name='gross_price']")
	WebElement certificate_Gross_Price;

	@FindBy(xpath = "//div[text()='Gross Price is required']")
	WebElement certificate_Gross_Price_Validation;

	@FindBy(xpath = "//button[text()='Save Changes']")
	WebElement save_Certificate;

	@FindBy(xpath = "//button[text()='Close']")
	WebElement close_Certificate;

	@FindBy(xpath = "(//a[@class='BlackToOrange add_edit'])[1]")
	WebElement certificate_Name_In_Grid1;

	@FindBy(xpath = "(//a[@class='BlackToOrange add_edit'])[2]")
	WebElement certificate_Name_In_Grid2;

	public void validatingCertificate() throws Exception {
		try {
			waitMethods.wait2();
			Actions action = new Actions(driver);

			action.moveToElement(priceLists).perform();
			certificates.click();

			add_Certificate.click();
			waitMethods.wait2();
			save_Certificate.click();
			waitMethods.wait2();
			element_validation(certificate_Name_Validation, certificate_Net_Price_Validation,
					certificate_Gross_Price_Validation, "All the fields are validated in the cerificate tab",
					"Validation Failed in Certificate tab");
		} catch (Exception e) {
			System.out.println(e);
			et.log(LogStatus.FAIL, "Certification Validation Failed");
		}
	}

	public void addCertificate(String certificatename, String certificatenetprice, String certificategrossprice)
			throws InterruptedException {
		try {
			waitMethods.wait2();
			certificate_Name.sendKeys(certificatename);
			certificate_Net_Price.sendKeys(certificatenetprice);
			certificate_Gross_Price.sendKeys(certificategrossprice);
			waitMethods.wait2();
			save_Certificate.click();
			waitMethods.wait2();
			et.log(LogStatus.PASS, "Added Certificate Successfully");
		} catch (Exception e) {
			et.log(LogStatus.FAIL, "Adding Certificate Failed");
			takeScreenshot("Adding_Certificate_Failed");
		}
	}

	public void valiateDuplicateCertificate(String certificatename, String certificatenetprice,
			String certificategrossprice) throws InterruptedException {
		try {
			waitMethods.wait2();
			Actions action = new Actions(driver);
			action.moveToElement(priceLists).perform();

			certificates.click();
			waitMethods.wait2();
			add_Certificate.click();
			waitMethods.wait2();
			certificate_Name.sendKeys(certificatename);
			certificate_Net_Price.sendKeys(certificatenetprice);
			certificate_Gross_Price.sendKeys(certificategrossprice);
			waitMethods.wait2();
			save_Certificate.click();
			waitMethods.wait4();
			driver.navigate().refresh();
			String certificateName1 = certificate_Name_In_Grid1.getText();
			String certificateName2 = certificate_Name_In_Grid2.getText();
			element_Duplicate(certificateName1, certificateName2, "Validatation successful",
					"Valiation Failed able to duplicate certificate");
			waitMethods.wait2();
			et.log(LogStatus.PASS, "Added Certificate Successfully");
		} catch (Exception e) {
			et.log(LogStatus.FAIL, "Adding Certificate Failed");
			takeScreenshot("Adding_Certificate_Failed");
		}
	}
}
