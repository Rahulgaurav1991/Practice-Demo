package com.practice.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Market {
	@Test
	public void run() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String requied = driver.findElement(By.xpath("//h2[.='Text Area Field Two']/..//div[1]//textarea")).getText();
		System.out.println(requied);
		List<WebElement> allelement = driver.findElements(By.xpath("//h2[.='Table']/..//tr[2]//td[2]"));

		for (WebElement name : allelement) {
			String text = name.getText();
			System.out.println("the name and vslue:" + text);

		}
		driver.close();
	}

}
