package com.practice.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Easy {
	@Test
	public void easyTrip() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SoftAssert sa=new SoftAssert();

		sa.assertEquals(driver.getTitle(), "Book Flights, Hotels, Bus Tickets & Holidays - EaseMyTrip.com");
		Reporter.log("Tittle is matching", true);
		driver.close();
		sa.assertAll();

	}

}
