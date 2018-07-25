package com.practice.Test;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class selenium {
	
	@Test
	public void data()
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.seleniumhq.org/");
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[.='Download']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		boolean element = driver.findElement(By.xpath("//td[.='Java']/..//td[4]")).isDisplayed();
		Assert.assertTrue(element);
		Reporter.log("Element is present",true);
		driver.close();
		
		
	}

}
