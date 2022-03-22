package com.test.steps;

import com.test.hooks.Hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ServiceHooks extends Hooks{
	
	@Before
	public void initiateTest() throws Exception {
		openBrowser();
	}
	
	@After
	public void closeTest() throws Exception {
		close();
	}
}
