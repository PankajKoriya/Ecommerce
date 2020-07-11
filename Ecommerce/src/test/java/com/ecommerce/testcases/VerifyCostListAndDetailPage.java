package com.ecommerce.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ecommerce.pages.BaseClass;
import com.ecommerce.pages.MobileDetailPage;
import com.ecommerce.pages.MobilePage;

public class VerifyCostListAndDetailPage extends BaseClass{
	
	@Test
	public void verifyCost()
	{
		logger = extent.createTest("Verify the mobile cost on list and detail page");
		
		MobilePage mp = new MobilePage(driver);
		
		MobileDetailPage mdp = new MobileDetailPage(driver);
		
		mp.clickOnMobileMenu();
		
		logger.info("Clicked on mobile menu");
		
		String priceOnListPage = mp.getSonyXprice();
		
		logger.info("Fetch price of sonyXperia from the list page");
		
		mp.clickSonyXlink();
		
		logger.info("Clicked on sonyXperia link");
		
		String priceOnDetailPage = mdp.getPriceOfsonyXFromDetailsPage();
		
		logger.info("Fetch price of sonyXperia from the details page");
		
		Assert.assertEquals(priceOnListPage, priceOnDetailPage);
		
		logger.info("Price of sonyXperia is verified");
		
	}

}
