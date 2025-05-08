package com.vodafone.test;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vodafone.base.AutomationWrapper;

public class LoginUITest2 extends AutomationWrapper {
	
	@Test
	public void titleTest() {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "OrangeHRM");
	}

	@Test
	public void headerTitle() {
		// Assert the header - Login
		String actualHeader = driver.findElement(By.xpath("//h5")).getText();
		Assert.assertEquals(actualHeader, "Login");
	}
}
