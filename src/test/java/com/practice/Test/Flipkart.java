package com.practice.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Flipkart 
{
	@Test
	public void flipkartTest()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[.='Men']"))).perform();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		List<WebElement> all = driver.findElements(By.xpath("//span[.='Men']/../..//span[.='Footwear']/../../..//a"));
		System.out.println(all.size());
		for(WebElement name:all)
		{
			System.out.println(name.getText());
		}
		//driver.close();
	}

}
