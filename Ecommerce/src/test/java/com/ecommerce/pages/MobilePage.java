package com.ecommerce.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MobilePage{
	
	WebDriver driver;
	By mobileMenu = By.xpath("(//nav[@id='nav']/ol/li/a)[1]");
	By sortByDropDown = By.xpath("(//select[@title='Sort By'])[1]");
	By homepageTitle = By.xpath("//h2[contains(text(),'This is demo')]");
	By mobilepageTitle = By.xpath("//h1[contains(text(),'Mobile')]");
	By mobileItems = By.xpath("//h2[@class='product-name']");
	By sonyXprice = By.xpath("//span[@id='product-price-1']/span");
	By sonyXlink = By.xpath("//a[@title='Sony Xperia']");
	
	public MobilePage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	public String verifypageTitle()
	{
		return driver.findElement(homepageTitle).getText();
	}
	public String verifyTitleOfHomePage()
	{
		return driver.getTitle();
	}
	
	public void clickOnMobileMenu()
	{
		driver.findElement(mobileMenu).click();
	}
	
	public String verifyMobilePageTitle()
	{
		return driver.findElement(mobilepageTitle).getText();
	}
	
	public void selectNameFromSortby()
	{
		driver.findElement(sortByDropDown).click();
		
		Select select = new Select(driver.findElement(sortByDropDown));
		List<WebElement> options =  select.getOptions();
		int numberOfOptions = options.size();
		
		for(int i=0; i<numberOfOptions; i++)
		{
			String option = options.get(i).getText();
			if(option.contains("Name"))
			{
				select.selectByIndex(i);
				break;
			}
		}
	}
	
	public boolean verifySortOrderOfMobiles()
	{
		List<WebElement> listOfMobiles = driver.findElements(mobileItems);
		int numberOfMobiles = listOfMobiles.size();
		
		ArrayList<String> mobiles = new ArrayList<>();
		
		for(int i=0; i<numberOfMobiles; i++)
		{
			String mobileName = listOfMobiles.get(i).getText();
			mobiles.add(mobileName);
		}
		
		ArrayList<String> copyOfMobiles = new ArrayList<>();
		
		for(String name : mobiles)
		{
			copyOfMobiles.add(name);
		}
		
		Collections.sort(copyOfMobiles);
		
		if(mobiles.equals(copyOfMobiles))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String getSonyXprice()
	{
		return driver.findElement(sonyXprice).getText();
	}
	
	public void clickSonyXlink()
	{
		driver.findElement(sonyXlink).click();
	}
	
}
