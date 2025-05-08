package com.vodafone.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.vodafone.base.AutomationWrapper;
import com.vodafone.pages.DashboardPage;
import com.vodafone.pages.LoginPage;

public class LoginTest extends AutomationWrapper {

	@Test
	public void validLogin() {
		
		LoginPage login= new LoginPage(driver);
		login.enterUsername("Admin");
		login.enterPassword("admin123");
		login.clickOnLogin();
		
		
		
		//Assert the text
		DashboardPage dashboard= new DashboardPage(driver);
		Assert.assertEquals(dashboard.getQuickLaunchText(), "Quick Launch");
		

	}
	
	public void invalidoginTest() {
		LoginPage login= new LoginPage(driver);
		login.enterUsername("Admin");
		login.enterPassword("admin123");
		login.clickOnLogin();
		
		String ActualError= login.getInvalidErrorMessage();
		Assert.assertEquals(ActualError,"Invalid credentials");
		
				
		
	}

}
