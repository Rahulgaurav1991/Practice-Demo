package com.practice.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Group {

	@Test(groups= {"regression","sanity"})
	public void run() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///C:/Users/User/Desktop/Reports/checkbox.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> all = driver.findElements(By.xpath("//input[@type='checkbox']"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		for (WebElement name : all) {
			String data = name.getText();
			System.out.println(data);
		}
		driver.quit();
	}

	@Test(groups= {"sanity"})
	public void sleep() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://google.co.in");
		driver.findElement(By.id("lst-ib")).sendKeys("rahul");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		List<WebElement> all = driver.findElements(By.className("sbqs_c"));
		for (WebElement name : all) {
			System.out.println(name.getText());
			if (name.getText().equalsIgnoreCase("rahul dravid")) {
				name.click();
				break;
			}
			driver.quit();

		}
	}

}
