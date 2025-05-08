package com.vodafone.test;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginUITest {
	
	@Test
	 public void titleTest()
	 {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  
	  //checking title
	  String actualTitle= driver.getTitle();
	  Assert.assertEquals(actualTitle, "OrangeHRM");
	 }
	
	@Test
	public void headerTitle()
	 {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  
	  //checking title
	  String actualheader= driver.findElement(By.xpath("//h5")).getText();
	  Assert.assertEquals(actualheader, "Login");
	 }
	 
}
