package com.practice.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Window {

	@Test
	public void windows() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Set<String> all = driver.getWindowHandles();
		System.out.println(all.size());
		List<String> ll = new ArrayList<String>(all);
		driver.switchTo().window(ll.get(1));
		driver.manage().window().maximize();
		driver.close();
		driver.switchTo().window(ll.get(0));
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();

	}

}
