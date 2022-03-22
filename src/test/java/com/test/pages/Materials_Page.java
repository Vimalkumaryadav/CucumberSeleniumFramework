package com.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;
import com.test.hooks.Hooks;
import com.test.utils.waitMethods;

public class Materials_Page extends Hooks {
	public Materials_Page() {
		PageFactory.initElements(driver, this);
	}

	/***** EDIT CATEGORY *****/

	@FindBy(xpath = "//a[contains(text(),'Price Lists')]")
	WebElement priceLists;

	@FindBy(xpath = "//a[text()='Materials']")
	WebElement Materials;

	@FindBy(xpath = "//a[text()='Edit Categories']")
	WebElement edit_Category;

	@FindBy(xpath = "//a[text()='Add Main Category ']")
	WebElement add_Main_Category;

	@FindBy(xpath = "//input[@id='main-category-title']")
	WebElement main_Category_Title;

	@FindBy(xpath = "//div[text()='Category title is required']")
	WebElement main_Category_Title_Validation;

	@FindBy(xpath = "//button[text()='Save Changes']")
	WebElement category_Save;

	@FindBy(xpath = "//button[text()='Save changes']")
	WebElement retailer_Save;

	@FindBy(xpath = "//button[text()='Close']")
	WebElement category_closeButton;
	
	@FindBy(xpath = "//span[text()='×']")
	WebElement product_closeButton;
	
	@FindBy(xpath = "//a[text()='Sub Categories']")
	WebElement sub_Category_Tab;

	@FindBy(xpath = "//a[text()='Add Sub Category ']")
	WebElement add_Sub_Category;

	@FindBy(xpath = "//select[@class='form-control ']")
	WebElement select_Main_Category_For_Sub;

	@FindBy(xpath = "//div[text()='Main Category is required']")
	WebElement main_Category_In_Sub_Category_Validation;

	@FindBy(xpath = "//input[@name='title']")
	WebElement sub_Category_Title;

	@FindBy(xpath = "//div[text()='Sub Category title is required']")
	WebElement Sub_Category_Validation;

	@FindBy(xpath = "//a[text()='Retailers']")
	WebElement retails_Tab;

	@FindBy(xpath = "//a[text()='Add Retailer ']")
	WebElement add_Retailers;

	@FindBy(xpath = "//input[@placeholder='Retailer']")
	WebElement retailers_Title;

	@FindBy(xpath = "//div[text()='Retailer title is required']")
	WebElement retailers_Validation;

	/***** ADD PRODUCT *****/

	@FindBy(xpath = "//a[contains(text(),'Add Product')]")
	WebElement add_Product;

	@FindBy(xpath = "//select[@name='main_category_id']")
	WebElement select_Main_Category;

	@FindBy(xpath = "//div[text()='Main category is required']")
	WebElement select_Main_Category_Validation;

	@FindBy(xpath = "//select[@name='sub_category_id']")
	WebElement select_sub_Category;

	@FindBy(xpath = "//select[@name='retailer_id']")
	WebElement select_retailer;

	@FindBy(xpath = "//input[@name='product_sku']")
	WebElement product_SKU;

	@FindBy(xpath = "//div[text()='Product SKU is required']")
	WebElement product_SKU_Validation;

	@FindBy(xpath = "//input[@name='net_price']")
	WebElement net_Price;

	@FindBy(xpath = "//div[text()='Net Price is required']")
	WebElement net_Price_Validation;

	@FindBy(xpath = "//input[@name='gross_price']")
	WebElement gross_Price;

	@FindBy(xpath = "//div[text()='Gross Price is required']")
	WebElement gross_Price_Validation;

	@FindBy(xpath = "//input[@name='quantity']")
	WebElement pack_size;

	@FindBy(xpath = "//div[text()='Quantity is required']")
	WebElement pack_size_Validation;

	@FindBy(xpath = "//input[@name='web_address']")
	WebElement web_address;

	@FindBy(xpath = "//textarea[@name='description']")
	WebElement descriptiontext;

	@FindBy(xpath = "//div[text()='Product Description is required']")
	WebElement descriptiontext_Validation;

	@FindBy(xpath = "(//a[text()='5555'])[1]")
	WebElement duplicate_ProductSKU1;

	@FindBy(xpath = "(//a[text()='5555'])[2]")
	WebElement duplicate_ProductSKU2;

	public void validatingCategories() throws Exception {
		try {
			waitMethods.wait2();
			Actions action = new Actions(driver);
			action.moveToElement(priceLists).perform();

			Materials.click();
			waitMethods.waitUntillElementIsVisible(edit_Category);
			edit_Category.click();
			waitMethods.waitUntillElementIsVisible(add_Main_Category);
			add_Main_Category.click();
			waitMethods.waitUntillElementIsVisible(category_Save);
			category_Save.click();
			waitMethods.waitUntillElementIsVisible(main_Category_Title_Validation);
			element_validation(main_Category_Title_Validation, "Main Category Validated successfully",
					"Main Category Validation Failed");
			waitMethods.waitUntillElementIsVisible(category_closeButton);
			category_closeButton.click();
			waitMethods.waitUntillElementIsVisible(sub_Category_Tab);
			sub_Category_Tab.click();
			waitMethods.waitUntillElementIsVisible(add_Sub_Category);
			add_Sub_Category.click();
			waitMethods.waitUntillElementIsVisible(category_Save);
			category_Save.click();
			waitMethods.waitUntillElementIsVisible(main_Category_In_Sub_Category_Validation);
			element_validation(main_Category_In_Sub_Category_Validation, Sub_Category_Validation,
					"Main and Sub Categories Validated successfully", "Main and Sub Categories Validation Failed");
			waitMethods.waitUntillElementIsVisible(category_closeButton);
			category_closeButton.click();
			waitMethods.waitUntillElementIsVisible(retails_Tab);
			retails_Tab.click();
			waitMethods.waitUntillElementIsVisible(add_Retailers);
			add_Retailers.click();
			waitMethods.waitUntillElementIsVisible(retailer_Save);
			retailer_Save.click();
			waitMethods.waitUntillElementIsVisible(retailers_Validation);
			element_validation(retailers_Validation, "Retailers Validated successfully", "Retailers Validation Failed");
			waitMethods.waitUntillElementIsVisible(category_closeButton);
			category_closeButton.click();
		} catch (Exception e) {
			et.log(LogStatus.FAIL, "Validating Category Failed");
			takeScreenshot("Validating_Category_Failed");
		}
	}

	public void AddingCategories(String maincategorytitle, String selectmaincategory, String subcategorytitle,
			String retailertitle) throws InterruptedException {
		try {
			waitMethods.wait2();
			Actions action = new Actions(driver);
			action.moveToElement(priceLists).perform();

			Materials.click();
			waitMethods.waitUntillElementIsVisible(edit_Category);
			edit_Category.click();
			waitMethods.waitUntillElementIsVisible(add_Main_Category);
			add_Main_Category.click();
			waitMethods.waitUntillElementIsVisible(main_Category_Title);
			main_Category_Title.sendKeys(maincategorytitle);
			waitMethods.waitUntillElementIsVisible(category_Save);
			category_Save.click();
			waitMethods.waitUntillElementIsVisible(category_closeButton);
			category_closeButton.click();
			waitMethods.waitUntillElementIsVisible(sub_Category_Tab);
			sub_Category_Tab.click();
			waitMethods.waitUntillElementIsVisible(add_Sub_Category);
			add_Sub_Category.click();
			waitMethods.waitUntillElementIsVisible(sub_Category_Title);
			Select mainCategory = new Select(select_Main_Category_For_Sub);
			mainCategory.selectByVisibleText(selectmaincategory);
			waitMethods.wait2();
			sub_Category_Title.sendKeys(subcategorytitle);
			waitMethods.waitUntillElementIsVisible(category_Save);
			category_Save.click();
			waitMethods.waitUntillElementIsVisible(category_closeButton);
			category_closeButton.click();
			waitMethods.waitUntillElementIsVisible(retails_Tab);
			retails_Tab.click();
			waitMethods.waitUntillElementIsVisible(add_Retailers);
			add_Retailers.click();
			waitMethods.waitUntillElementIsVisible(retailers_Title);
			retailers_Title.sendKeys(retailertitle);
			waitMethods.waitUntillElementIsVisible(retailer_Save);
			retailer_Save.click();
			waitMethods.waitUntillElementIsVisible(category_closeButton);
			category_closeButton.click();
			et.log(LogStatus.PASS, "Added Categories Successfully");
		} catch (Exception e) {
			et.log(LogStatus.FAIL, "Adding Category Failed");
			takeScreenshot("Adding_Category_Failed");
		}

	}

	public void validatingProduct() throws Exception {
		try {
			waitMethods.wait2();
			Actions action = new Actions(driver);
			action.moveToElement(priceLists).perform();
			waitMethods.waitUntillElementIsVisible(Materials);
			Materials.click();
			waitMethods.waitUntillElementIsVisible(add_Product);
			add_Product.click();
			waitMethods.waitUntillElementIsVisible(category_Save);
			category_Save.click();
			waitMethods.waitUntillElementIsVisible(select_Main_Category);

			element_validation(select_Main_Category_Validation, product_SKU_Validation, net_Price_Validation,
					gross_Price_Validation, pack_size_Validation, descriptiontext_Validation,
					"Product Validated successfully", "Product Validation Failed");
			category_closeButton.click();
			waitMethods.wait2();
		} catch (Exception e) {
			et.log(LogStatus.FAIL, "Validating Product Failed");
			takeScreenshot("Validating_Product_Failed");
		}
	}

	public void validatingDuplicateProduct(String maincategorytitle, String selectmaincategory, String subcategorytitle,
			String retailertitle, String productsku, String netprice, String grossprice, String packsize,
			String webaddress, String description) throws InterruptedException {
		try {
			waitMethods.wait2();
			Actions action = new Actions(driver);
			action.moveToElement(priceLists).perform();
			waitMethods.waitUntillElementIsVisible(Materials);
			Materials.click();
			waitMethods.waitUntillElementIsVisible(add_Product);
			add_Product.click();
			waitMethods.waitUntillElementIsVisible(select_Main_Category);
			Select mainCategory = new Select(select_Main_Category);
			mainCategory.selectByVisibleText(maincategorytitle);
			waitMethods.waitUntillElementIsVisible(select_sub_Category);
			Select subCategory = new Select(select_sub_Category);
			subCategory.selectByVisibleText(subcategorytitle);
			waitMethods.waitUntillElementIsVisible(select_retailer);
			Select retailer = new Select(select_retailer);
			retailer.selectByVisibleText(retailertitle);
			product_SKU.sendKeys(productsku);
			net_Price.sendKeys(netprice);
			gross_Price.sendKeys(grossprice);
			pack_size.sendKeys(packsize);
			web_address.sendKeys(webaddress);
			descriptiontext.sendKeys(description);
			category_Save.click();
			waitMethods.wait5();
			try {
				category_closeButton.click();	
			} catch (Exception e) {
				product_closeButton.click();
			}
			
			waitMethods.wait5();
			String ProductSKU1 = duplicate_ProductSKU1.getText();
			String ProductSKU2 = duplicate_ProductSKU2.getText();

			System.out.println(ProductSKU1);
			System.out.println(ProductSKU2);
			waitMethods.waitUntillElementIsVisible(duplicate_ProductSKU1);
			element_Duplicate(ProductSKU1, ProductSKU2, "Product duplicate Validatation successful",
					"Valiation Failed able to duplicate Product");
			et.log(LogStatus.PASS, "Added Product Successfully");
		} catch (Exception e) {
			et.log(LogStatus.FAIL, "Adding Product Failed");
			takeScreenshot("Adding_Product_Failed");
		}

	}

	public void AddingProduct(String maincategorytitle, String selectmaincategory, String subcategorytitle,
			String retailertitle, String productsku, String netprice, String grossprice, String packsize,
			String webaddress, String description) throws InterruptedException {
		try {
			waitMethods.wait2();
			Actions action = new Actions(driver);
			action.moveToElement(priceLists).perform();
			waitMethods.waitUntillElementIsVisible(Materials);
			Materials.click();
			waitMethods.waitUntillElementIsVisible(add_Product);
			add_Product.click();
			waitMethods.waitUntillElementIsVisible(select_Main_Category);
			Select mainCategory = new Select(select_Main_Category);
			mainCategory.selectByVisibleText(maincategorytitle);
			waitMethods.waitUntillElementIsVisible(select_sub_Category);
			Select subCategory = new Select(select_sub_Category);
			subCategory.selectByVisibleText(subcategorytitle);
			waitMethods.waitUntillElementIsVisible(select_retailer);
			Select retailer = new Select(select_retailer);
			retailer.selectByVisibleText(retailertitle);
			product_SKU.sendKeys(productsku);
			net_Price.sendKeys(netprice);
			gross_Price.sendKeys(grossprice);
			pack_size.sendKeys(packsize);
			web_address.sendKeys(webaddress);
			descriptiontext.sendKeys(description);
			category_Save.click();
			waitMethods.waitUntillElementIsVisible(category_closeButton);
			category_closeButton.click();
			waitMethods.wait2();
			et.log(LogStatus.PASS, "Added Product Successfully");
		} catch (Exception e) {
			et.log(LogStatus.FAIL, "Adding Product Failed");
			takeScreenshot("Adding_Product_Failed");
		}

	}
}
