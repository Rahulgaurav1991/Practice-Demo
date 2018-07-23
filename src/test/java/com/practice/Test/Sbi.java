package com.practice.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sbi {
	public static WebDriver driver;

	@Test
	public void sbiClick() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://retail.onlinesbi.com/retail/login.htm#");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@title='Press Alt + 3 and Enter']")).click();
		changeWindow(1);
		Thread.sleep(10000);
		driver.close();
		}

	public static void changeWindow(int index) {
		Set<String> windows = driver.getWindowHandles();
		List<String>ll=new ArrayList<String>(windows);
		for (int i = 0; i <= index; i++) {
			driver.switchTo().window(ll.get(index));

			
			
			
		

		}

	}

}
