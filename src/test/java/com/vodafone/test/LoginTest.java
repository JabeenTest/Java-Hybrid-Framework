package com.vodafone.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vodafone.base.AutomationWrapper;
import com.vodafone.pages.DashboardPage;
import com.vodafone.pages.LoginPage;
import com.vodafone.utils.DataUtils;

public class LoginTest extends AutomationWrapper {

	@Test
	public void validLogin() {

		LoginPage login = new LoginPage(driver);
		login.enterUsername("Admin");
		login.enterPassword("admin123");

		login.clickOnLogin();

		// Assert the text
		DashboardPage dashboard = new DashboardPage(driver);
		Assert.assertEquals(dashboard.getQuickLaunchText(), "Quick Launch");

	}
	// create @Dataprovider method invalidloginData()

	@Test(dataProviderClass = DataUtils.class, dataProvider = "invalidloginData")
	public void invalidoginTest(String username, String password, String expectedError) {
		LoginPage login = new LoginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		login.clickOnLogin();

		String ActualError = login.getInvalidErrorMessage();
		Assert.assertEquals(ActualError, expectedError);

	}

}
