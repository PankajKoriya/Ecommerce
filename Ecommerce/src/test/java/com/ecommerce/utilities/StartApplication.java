package com.ecommerce.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StartApplication {
	
	static WebDriver driver;
	
	public static WebDriver OpenBrowser(String browser, String url)
	{
		switch(browser)
		{
		case "chrome":
			
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		break;
		case "firefox":
			
			System.setProperty("webdriver.gecko.driver", "");
			driver = new FirefoxDriver();
		break;
		case "ie":
			
			System.setProperty("webdriver.ie.driver", "");
			driver = new ChromeDriver();
		break;
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
		
	}

}
