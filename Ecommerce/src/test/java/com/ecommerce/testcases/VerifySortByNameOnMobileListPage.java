package com.ecommerce.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ecommerce.pages.BaseClass;
import com.ecommerce.pages.MobilePage;

public class VerifySortByNameOnMobileListPage extends BaseClass{
	
	@Test
	public void verifySorting()
	{
		logger = extent.createTest("Verify Mobile Sort Order");
		
		MobilePage mp = new MobilePage(driver);
		
		String pageTitle = mp.verifypageTitle();
		
		Assert.assertEquals(pageTitle, "THIS IS DEMO SITE FOR   ");
		
		logger.info("Page title is verified");
		
		String homePageTitle = mp.verifyTitleOfHomePage();
		
		Assert.assertTrue(homePageTitle.equals("Home page"));
		
		logger.info("Home page title is verified");
		
		mp.clickOnMobileMenu();
		
		String mobilepageTitle = mp.verifyMobilePageTitle();
		
		Assert.assertTrue(mobilepageTitle.contains("MOBILE"));
		
		logger.info("Mobile page title is verified");
		
		mp.selectNameFromSortby();
		
		logger.info("Name is selected as sort by option");
		
		boolean sortOrder = mp.verifySortOrderOfMobiles();
		
		Assert.assertTrue(sortOrder);
		
		logger.info("Mobile list is sorted by name");
		
		System.out.println("Test case is passed");
	}
	

}
