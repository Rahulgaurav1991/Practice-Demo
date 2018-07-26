package com.practice.Test;

import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mukesh2 {

	@Test
	public void mukeshTable() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.className("dropbtn"))).perform();
        List<WebElement> alloptions = driver.findElements(By.xpath("//button[.='Automation Tools']/..//a"));
		for (WebElement name : alloptions) {
			System.out.println(name.getText());
			if (name.getText().equalsIgnoreCase("Selenium")) {
				name.click();
				break;

			}
		}
	}

}
