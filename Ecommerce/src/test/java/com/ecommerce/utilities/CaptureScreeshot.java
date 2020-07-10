package com.ecommerce.utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreeshot {
	
	public static String screenshot(WebDriver driver)
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		String dest = "C:/Users/pankaj.koriya/eclipse-workspace/Ecommerce/Screenshots/Ecommerce_" + CaptureScreeshot.getDateAndTime() + ".png";
		
		try
		{
		FileHandler.copy(src, new File(dest));
		}
		catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		return dest;
		
	}
	
	public static String getDateAndTime()
	{
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss");
		String formattedDate = sdf.format(date);
		return formattedDate;
	}

}
