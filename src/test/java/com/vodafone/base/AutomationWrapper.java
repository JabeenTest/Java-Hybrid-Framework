package com.vodafone.base;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AutomationWrapper {
	protected WebDriver driver;

	@BeforeMethod
	public void setup() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	/*@AfterMethod
	public void teardown() {

		driver.quit();
	}*/
}
