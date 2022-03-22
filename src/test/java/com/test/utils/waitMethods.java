package com.test.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.hooks.Hooks;

public class waitMethods extends Hooks
{
	//wait methods from selenium code
	public static void waitMax()
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	//wait methods from Java
	public static void wait4() throws Exception
	{
		Thread.sleep(4000);
	}
	public static void wait5() throws Exception
	{
		Thread.sleep(5000);
	}
	public static void wait3() throws Exception
	{
		Thread.sleep(3000);
	}
	public static void wait2() throws Exception
	{
		Thread.sleep(2000);
	}
	
	public static void waitUntillElementIsVisible(WebElement e)
	{	
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(e));
	}
	
	public static void waitUntillElementIsPresent(WebElement webElement)
	{
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(webElement));	
	}
	
}
