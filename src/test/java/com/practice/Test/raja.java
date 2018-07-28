package com.practice.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class raja {
	
	@Test
	public void run()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Select sel = new Select(driver.findElement(By.id("multiselect1")));
		Assert.assertTrue(sel.isMultiple());
		Reporter.log("it is multiseleted", true);
		List<String> ll = new ArrayList<String>();
		List<WebElement> all = sel.getOptions();
		for (WebElement name : all) {
			System.out.println("elemnts present in it are:" + name.getText());
			ll.add(name.getText());
		}
		Collections.sort(ll);
		Iterator<String> it = ll.iterator();
		while (it.hasNext()) {
			String text = it.next();
			System.out.println("the element after shorting is :" + text);
		}

		driver.close();

	}

}
