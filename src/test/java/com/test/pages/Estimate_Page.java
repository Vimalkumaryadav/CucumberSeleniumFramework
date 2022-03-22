package com.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;
import com.test.hooks.Hooks;
import com.test.utils.waitMethods;

public class Estimate_Page extends Hooks {

	public Estimate_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Work')]")
	WebElement workTab;

	@FindBy(xpath = "//a[text()='Estimates & Quotes']")
	WebElement estimateTab;

	@FindBy(xpath = "//a[text()='Create New']")
	WebElement create_Estimate;

	@FindBy(xpath = "//input[@name='estimate_date']")
	WebElement estimate_Date;

	@FindBy(xpath = "//input[@name='reference']")
	WebElement job_Reference;

	@FindBy(xpath = "//input[@name='term_days']")
	WebElement payment_Terms;

	@FindBy(xpath = "//select[@name='client_id']")
	WebElement client_Select;

	@FindBy(xpath = "(//a[text()='New'])[1]")
	WebElement client_New;

	@FindBy(xpath = "//select[@name='client_address_id']")
	WebElement address_Select;

	@FindBy(xpath = "(//a[text()='New'])[2]")
	WebElement address_New;

	@FindBy(xpath = "//input[@name='job_name']")
	WebElement job_Name;

	@FindBy(xpath = "//textarea[@name='notes']")
	WebElement job_description;

	@FindBy(xpath = "//button[text()='Create Header']")
	WebElement create_Header;

	@FindBy(xpath = "(//button[text()='Close'])[2]")
	WebElement estimate_Sucess_Popup;

	@FindBy(xpath = "(//button[text()='Close'])[1]")
	WebElement close_Popups;

	/***** ADD PARTS & MATETRIALS *****/

	@FindBy(xpath = "//a[@id='add-estimate-parts']")
	WebElement add_Estimate_Parts;

	@FindBy(xpath = "//select[@name='main_category_id']")
	WebElement select_Main_Category;

	@FindBy(xpath = "//select[@name='sub_category_id']")
	WebElement select_sub_Category;

	@FindBy(xpath = "//select[@name='retailer_id']")
	WebElement select_retailer;

	@FindBy(xpath = "//select[@name='product_id']")
	WebElement select_Product_SKU;

	@FindBy(xpath = "//input[@name='quantity']")
	WebElement select_quantity;

	@FindBy(xpath = "//button[text()='Add']")
	WebElement add_Button;

	/***** ADD LABOUR *****/

	@FindBy(xpath = "//a[@id='add-labour']")
	WebElement add_labour;

	@FindBy(xpath = "//input[@name='quantity']")
	WebElement add_Labour_Quantity;

	/***** ADD CERTIFICATE *****/

	@FindBy(xpath = "//a[@id='add-certificate']")
	WebElement add_Certificate;

	@FindBy(xpath = "//select[@name='certificate_id']")
	WebElement select_Certificate;

	@FindBy(xpath = "//a[contains(@class,'btn tw-bg-primary tw-text-white tw-mt-1 tw-ml-1 add_edit')]")
	WebElement estimate_Send_Button;

	@FindBy(xpath = "//textarea[@name='body']")
	WebElement estimate_Message;

	@FindBy(xpath = "//button[text()='Send']")
	WebElement estimate_Email_Send;

	@FindBy(xpath = "//a[text()='Mark as Accepted']")
	WebElement mark_As_Expected;

	@FindBy(xpath = "//button[text()='Yes']")
	WebElement are_You_Sure;

	@FindBy(xpath = "//a[text()='Mark as Invoice']")
	WebElement mark_As_Invoice;

	public void adding_Estimate() throws InterruptedException {
		try {
			Actions action = new Actions(driver);
			action.moveToElement(workTab).perform();
			waitMethods.wait2();
			estimateTab.click();
			waitMethods.wait2();
			create_Estimate.click();
			waitMethods.wait2();
			et.log(LogStatus.PASS, "Added Estimate Successfully");
		} catch (Exception e) {
			et.log(LogStatus.FAIL, "Adding Estimate Failed");
			takeScreenshot("Adding_Estimate_Failed");
		}
	}

	public void creating_Estimate(String jobreference, String paymentterms, String clienttitle, String clientfirstname,
			String clientlastname, String address1, String jobname, String jobdescription) throws InterruptedException {
		try {
			String date = currentDate("ddMMyyyy");
			estimate_Date.sendKeys(date);
			job_Reference.sendKeys(jobreference);
			payment_Terms.sendKeys(paymentterms);
			Select clientSelect = new Select(client_Select);
			clientSelect.selectByVisibleText(clienttitle + " " + clientfirstname + " " + clientlastname);
			Select addressSelect = new Select(address_Select);
			addressSelect.selectByVisibleText(address1);
			job_Name.sendKeys(jobname);
			job_description.sendKeys(jobdescription);
			create_Header.click();
			waitMethods.wait2();
			estimate_Sucess_Popup.click();
			waitMethods.wait2();
			et.log(LogStatus.PASS, "Created Estimate Successfully");
		} catch (Exception e) {
			et.log(LogStatus.FAIL, "Creating Estimate Failed");
			takeScreenshot("Creating_Estimate_Failed");
		}
	}

	public void adding_Parts_Materials(String selectmaincategory, String subcategorytitle, String retailertitle,
			String productsku, String quantity) throws InterruptedException {
		try {
			add_Estimate_Parts.click();
			waitMethods.wait2();
			Select mainCategory = new Select(select_Main_Category);
			mainCategory.selectByVisibleText(selectmaincategory);
			waitMethods.wait2();
			Select subCategory = new Select(select_sub_Category);
			subCategory.selectByVisibleText(subcategorytitle);
			waitMethods.wait2();
			Select retailer = new Select(select_retailer);
			retailer.selectByVisibleText(retailertitle);
			waitMethods.wait2();
			Select productSKU = new Select(select_Product_SKU);
			productSKU.selectByVisibleText(productsku);
			waitMethods.wait2();
			select_quantity.sendKeys(quantity);
			waitMethods.wait2();
			add_Button.click();
			waitMethods.wait2();
			close_Popups.click();
			waitMethods.wait2();
			et.log(LogStatus.PASS, "Added Materials Successfully");
		} catch (Exception e) {
			et.log(LogStatus.FAIL, "Adding Materials Failed");
			takeScreenshot("Adding_Materials_Failed");
		}
	}

	public void adding_Labour_Charges(String labourquantity) throws InterruptedException {
		try {
			add_labour.click();
			waitMethods.wait2();
			add_Labour_Quantity.sendKeys(labourquantity);
			add_Button.click();
			waitMethods.wait2();
			close_Popups.click();
			waitMethods.wait2();
			et.log(LogStatus.PASS, "Added Labour Charges Successfully");
		} catch (Exception e) {
			et.log(LogStatus.FAIL, "Adding Labour Charges Failed");
			takeScreenshot("Adding_Labout_Charges_Failed");
		}
	}

	public void adding_Certificate(String certificatename) throws InterruptedException {
		try {
			add_Certificate.click();
			waitMethods.wait2();
			Select Certificate = new Select(select_Certificate);
			Certificate.selectByVisibleText(certificatename);
			waitMethods.wait2();
			add_Button.click();
			waitMethods.wait2();
			close_Popups.click();
			waitMethods.wait2();
			et.log(LogStatus.PASS, "Added Certificate Successfully");
		} catch (Exception e) {
			et.log(LogStatus.FAIL, "Adding Certificate Failed");
			takeScreenshot("Adding_Certificate_Failed");
		}
	}

	public void sending_Estimate(String estimatemessage) throws InterruptedException {
		try {
			estimate_Send_Button.click();
			waitMethods.wait2();
			estimate_Message.sendKeys(estimatemessage);
			waitMethods.wait2();
			estimate_Email_Send.click();
			waitMethods.wait2();
			mark_As_Expected.click();
			waitMethods.wait2();
			are_You_Sure.click();
			waitMethods.wait2();
			estimate_Sucess_Popup.click();
			waitMethods.wait2();
			et.log(LogStatus.PASS, "Estimate sent Successfully");
		} catch (Exception e) {
			et.log(LogStatus.FAIL, "Sending Estimate Failed");
			takeScreenshot("Sending_Estimate_Failed");
		}
	}

	public void marked_As_Invoice() throws InterruptedException {
		try {
			mark_As_Invoice.click();
			waitMethods.wait2();
			are_You_Sure.click();
			waitMethods.wait2();
			estimate_Sucess_Popup.click();
			waitMethods.wait2();
			et.log(LogStatus.PASS, "Estimate Marked as Invoice Successfully");
		} catch (Exception e) {
			et.log(LogStatus.FAIL, "Marked as Invoice Failed");
			takeScreenshot("Marked_As_Invoice_Failed");
		}

	}
}
