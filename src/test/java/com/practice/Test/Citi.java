package com.practice.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Citi {
	public static WebDriver driver;
  @Test
  public void citiData() {

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.online.citibank.co.in/products-services/online-services/internet-banking.htm");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//p[.='Internet Banking.']/../..//a[.='LOGIN NOW']")).click();
		windows(0);
		System.out.println(driver.getTitle());
		
  }
  
  public static void windows(int index)
  {
	  Set<String> windows = driver.getWindowHandles();
	  List<String>ll=new ArrayList<String>(windows);
	  for(int i=0;i<=index;i++)
	  {
		  driver.switchTo().window(ll.get(index));
	  }
	  
  }
}
