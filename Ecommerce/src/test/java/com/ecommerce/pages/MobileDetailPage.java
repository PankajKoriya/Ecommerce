package com.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MobileDetailPage {
	
	WebDriver driver;
	By sonyXpriceDetailPage = By.xpath("//span[@id='product-price-1']/span");
	
	public MobileDetailPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	public String getPriceOfsonyXFromDetailsPage()
	{
		return driver.findElement(sonyXpriceDetailPage).getText();
	}

}
