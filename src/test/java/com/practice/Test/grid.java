package com.practice.Test;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class grid {

	@Test(enabled=false)
	public void run() throws Exception 
	{

		URL url=new URL("http://localhost:4444/wd/hub");
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WIN8_1);
		WebDriver driver=new RemoteWebDriver(url,dc);
		driver.get("http://facebook.com");
		}
	
		
		
	}


