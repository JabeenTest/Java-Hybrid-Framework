
package com.vodafone.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	
	private By quicklaunchocator=By.xpath("//p[contains(normalize-space(),'Quick')]");
	private WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getQuickLaunchText() {
		return driver.findElement(quicklaunchocator).getText();
	}
}
