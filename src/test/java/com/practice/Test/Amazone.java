package com.practice.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazone {
	
	@Test
	public void amazoneData()
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		WebDriverWait wait=new WebDriverWait(driver,20);
	    WebElement element = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//img[@alt='Arthur Harvey - Premium formal shirts']"))));
	    
	    boolean disp = element.isDisplayed();
	    Assert.assertTrue(disp);
	    Reporter.log("is disp",true);
		
		
	}

}
