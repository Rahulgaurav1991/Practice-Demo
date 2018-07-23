package com.practice.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ng {
	public static WebDriver driver;

	@BeforeTest
	public void preCondtions() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
	}
	@BeforeClass
	public void run2() {
		driver=new ChromeDriver();
		
	}
	
	@BeforeMethod
	public void run3()
	{
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		
	}

	@Test
	public void run() {
		boolean logo = driver.findElement(By.xpath("//i[contains(@class,'_logo img sp_IYLU795hhRY sx')]"))
				.isDisplayed();
	
		Assert.assertTrue(logo);
		Reporter.log("Logo is displayed", true);
	}

	@AfterTest
	public void preCodition() {
		driver.quit();

	}

}
