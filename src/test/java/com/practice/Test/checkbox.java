package com.practice.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class checkbox {

	@Test
	public void checkboxData()
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///C:/Users/User/Desktop/Reports/checkbox.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		List<WebElement> all = driver.findElements(By.xpath("//input[@type='checkbox']"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		for(WebElement name:all)
		{
		String data = name.getText();
			System.out.println(data);
		}
		
	}

}
