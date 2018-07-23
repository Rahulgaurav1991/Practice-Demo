package com.practice.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.testng.annotations.Test;

public class para {
	
	@Test()
	public void market() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bseindia.com/markets/Equity/newsensexstream.aspx");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		WebElement ele = driver.findElement(new ByAll(By.xpath("//a[.='ADANIPORTS']/../..//td[4]")));
		System.out.println(ele.getText());
		driver.close();
	}
	
	@Test(priority=1)
	public void run() {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Desktop/Reports/Table.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> all = driver.findElements(By.id("t1"));
		List<String> ll = new ArrayList<String>();
		for (WebElement name : all) {
			ll.add(name.getText());

		}
		Collections.sort(ll);
		for (String sort : ll) {
			System.out.println("element after shorting is:" + sort);
		}
		driver.close();
	}
}
