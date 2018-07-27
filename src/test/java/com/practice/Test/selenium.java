package com.practice.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class selenium {

	public static WebDriver driver;

	@Test(enabled = false)
	public void data() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.seleniumhq.org/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[.='Download']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		boolean element = driver.findElement(By.xpath("//td[.='Java']/..//td[4]")).isDisplayed();
		Assert.assertTrue(element);
		Reporter.log("Element is present", true);
		driver.close();

	}

	@Test
	public void window() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.online.citibank.co.in");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[@title='Services'])[1]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[.='Internet Banking']"))).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//p[.='Internet Banking.']/../..//a[.='LOGIN NOW']")).click();
		switchWindows(1);
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//body[@onload='javascript:loadValue();']")).sendKeys("rahul");

	}

	public static void switchWindows(int index) {
		Set<String> allwindows = driver.getWindowHandles();
		List<String> ll = new ArrayList<String>(allwindows);
		for (int i = 0; i <= index; i++) {
			driver.switchTo().window(ll.get(index));
		}

	}

}
