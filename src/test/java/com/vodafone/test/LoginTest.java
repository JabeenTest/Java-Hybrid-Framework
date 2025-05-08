package com.vodafone.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.vodafone.base.AutomationWrapper;

public class LoginTest extends AutomationWrapper {

	@Test
	public void validLogin() {
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin1234");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

	}

}
