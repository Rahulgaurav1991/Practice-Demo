package com.practice.Test;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Screnshot {
	WebDriver driver;
	
	@Test
	public void takeScrenshot() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://facebook.com");
		
		TakesScreenshot t=(TakesScreenshot)driver;
		 File src = t.getScreenshotAs(OutputType.FILE);
		 Files.copy(src, new File("./Screenshot/facebook.jpg"));
		 driver.close();
		
	}

}
