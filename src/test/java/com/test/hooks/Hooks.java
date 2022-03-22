package com.test.hooks;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.test.utils.waitMethods;

public class Hooks {
	public static WebDriver driver;
	public static String targetURL = "http://toolbotsprinttesting-env.eba-htdy2yq7.eu-west-1.elasticbeanstalk.com/login";
	public static String browserName = "GoogleChrome";
	public static int ImageNumber = 0;
	public static String TakeScreenShot = "Yes";
	public static String CurrentTime;
	public static WebDriverWait wait;

	// To get Current System date
	static DateFormat df1 = new SimpleDateFormat("_yyyy-MM-dd_hh-mm-ss a");
	static Date date1 = new Date();
	static String CurrentExecution = df1.format(date1);

	// To get Result in HTML view
	public static ExtentReports er = new ExtentReports("ExtentReports\\Log" + CurrentExecution + ".html");
	public static ExtentTest et = er.startTest("ToolBot Test Results");

	// Launch site
	public static void openBrowser() throws Exception {
		if (browserName.equalsIgnoreCase("GoogleChrome")) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "src/test/resources\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
	}

	public static void logOut() throws Exception {
		WebElement myAccount_tab = driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
		Actions action = new Actions(driver);
		action.moveToElement(myAccount_tab).perform();
		waitMethods.wait2();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	}

	public static void navigateToApplication() throws Exception {
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(targetURL);
	}

	// close
	public static void close() throws Exception {
		waitMethods.wait2();
		try {
			logOut();
		} catch (Exception e) {
			System.out.println(e);
		}

		waitMethods.wait2();
		driver.quit();

		// close reports
		er.flush();
		er.endTest(et);
	}

	public static String currentDate(String dateFormats) {

		DateFormat dateFormat = new SimpleDateFormat(dateFormats);
		Date date = new Date();
		String date1 = dateFormat.format(date);
		System.out.println(date1);

		return date1;
	}

	// TO Get Screenshots
	public static void takeScreenshot(String fileName) throws InterruptedException {
		try {

			/*
			 * DateFormat dateFormat = new SimpleDateFormat("MM/dd/yy hh:mm"); Date date =
			 * new Date(); String date1 = dateFormat.format(date);
			 */

			/******/
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			File source = screenshot.getScreenshotAs(OutputType.FILE);
			File destination = new File(System.getProperty("user.dir") + "/Screenshots/" + fileName + ".jpg");

			try {
				FileHandler.copy(source, destination);
			} catch (IOException e) {
				e.printStackTrace();
			}

			System.out.println("Screenshot Located At " + destination);
			/******/
			/*
			 * String FolderFile = ".Screenshots"; File srcFile = ((TakesScreenshot)
			 * driver).getScreenshotAs(OutputType.FILE); File DestFile = new
			 * File(FolderFile); //File DestFile = new
			 * File(FolderFile+"\\"+fileName+"-"+date1+ ".jpg"); FileHandler.copy(srcFile,
			 * DestFile);
			 */

		} catch (Exception e) {
			// take screen shots
			e.printStackTrace();
		}
	}

	public static void element_Comparison(String arg1, String arg2, String passMsg, String errMsg) throws Exception {
		try {
			if (arg1.contentEquals(arg2)) {
				et.log(LogStatus.PASS, passMsg);
			} else {
				et.log(LogStatus.FAIL, errMsg);
			}
		} catch (Exception e) {
			takeScreenshot(errMsg);
			et.log(LogStatus.ERROR, errMsg);
		}
	}

	public static void element_Duplicate(String arg1, String arg2, String passMsg, String errMsg) throws Exception {
		try {
			if (!arg1.contentEquals(arg2)) {
				et.log(LogStatus.PASS, passMsg);
			} else {
				takeScreenshot(errMsg);
				et.log(LogStatus.FAIL, errMsg);
			}
		} catch (Exception e) {
			takeScreenshot(errMsg);
			et.log(LogStatus.ERROR, errMsg);
		}
	}

	public static void element_validation(WebElement dashboard, String passMsg, String ErrMsg) throws Exception {
		try {
			if (dashboard.isDisplayed()) {
				et.log(LogStatus.PASS, passMsg);
			}
		} catch (Exception e) {
			takeScreenshot(ErrMsg);
			et.log(LogStatus.FAIL, ErrMsg);
		}

	}

	public static void element_validation(WebElement element1, WebElement element2, String passMsg, String ErrMsg)
			throws Exception {
		try {
			if (element1.isDisplayed() && element2.isDisplayed()) {
				et.log(LogStatus.PASS, passMsg);
			}
		} catch (Exception e) {
			takeScreenshot(ErrMsg);
			et.log(LogStatus.FAIL, ErrMsg);
		}

	}

	public static void element_validation(WebElement element1, WebElement element2, WebElement element3, String passMsg,
			String ErrMsg) throws Exception {
		try {
			if (element1.isDisplayed() && element2.isDisplayed() && element3.isDisplayed()) {
				et.log(LogStatus.PASS, passMsg);
			}
		} catch (Exception e) {
			takeScreenshot(ErrMsg);
			et.log(LogStatus.FAIL, ErrMsg);
		}

	}

	public static void element_validation(WebElement element1, WebElement element2, WebElement element3,
			WebElement element4, WebElement element5, WebElement element6, String passMsg, String ErrMsg)
			throws Exception {
		try {
			if (element1.isDisplayed() && element2.isDisplayed() && element3.isDisplayed() && element4.isDisplayed()
					&& element5.isDisplayed() && element6.isDisplayed()) {
				et.log(LogStatus.PASS, passMsg);
			}
		} catch (Exception e) {
			takeScreenshot(ErrMsg);
			et.log(LogStatus.FAIL, ErrMsg);
		}
	}

	public static void element_validation(WebElement element1, WebElement element2, WebElement element3,
			WebElement element4, WebElement element5, WebElement element6, WebElement element7, WebElement element8,
			String passMsg, String ErrMsg) throws Exception {
		try {
			if (element1.isDisplayed() && element2.isDisplayed() && element3.isDisplayed() && element4.isDisplayed()
					&& element5.isDisplayed() && element6.isDisplayed() && element7.isDisplayed()
					&& element8.isDisplayed()) {
				et.log(LogStatus.PASS, passMsg);
			}
		} catch (Exception e) {
			takeScreenshot(ErrMsg);
			et.log(LogStatus.FAIL, ErrMsg);
		}
	}

	public static void text_validation(String ActualMsg, String ExpectedMsg, String passMsg, String ErrMsg)
			throws Exception {
		if (ActualMsg.equals(ExpectedMsg)) {
			et.log(LogStatus.PASS, passMsg);
		} else {
			et.log(LogStatus.PASS, ErrMsg);
		}
	}

}
