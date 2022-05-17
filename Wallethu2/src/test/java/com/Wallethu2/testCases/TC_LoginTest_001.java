package com.Wallethu2.testCases;


import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Wallethu2.pageObjects.LoginPage;


public class TC_LoginTest_001 extends BaseClass
{

	@Test
	public void loginTest() throws IOException, InterruptedException 
	{
			
		logger.info("URL is opened");
		String title=driver.getTitle();
		System.out.println(title);
		logger.info("get title sucess"+title);
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");
		
		lp.setPassword(password);
		logger.info("Entered password");
		
		lp.setPassword2(password);
		logger.info("Entered password2");
		
		lp.chckbox();
		logger.info("unchecked");
		
		lp.joinbutton();
		logger.info("clicked join btn");
		
		Thread.sleep(5000);
		
		driver.get(baseURL1);
        Thread.sleep(5000);
        
        ((JavascriptExecutor)driver).executeScript("scrollBy(0,550)");
		Thread.sleep(8000);
		
		lp.review();
		Thread.sleep(8000);
		
		driver.switchTo().activeElement().sendKeys("Information on this page is provided 'as is' and solely for informational purposes, not for any other purpose or advice. In addition, this information does not originate from us and thus, we do not guarantee its accuracy.\n" + 
				"\n" + 
				"You can check the profile page of each professional or company to determine whether they are a paying advertiser (indicated by the word \"sponsored\"). Regardless of advertiser status, none of the listings, reviews, or other information on Wallet Hub constitutes, in any way, a referral or endorsement by us of the respective financial company or professional, or vice versa. Furthermore, it is important to note that the inclusion of a financial company or professional on Wallet Hub does not necessarily indicate their involvement with the site or control over the information that we display. Information is displayed first and foremost for the benefit of consumers.\n" + 
				"\n" + 
				"Editorial and user-generated content on this page is not reviewed or otherwise endorsed by any financial institution. In addition, it is not the financial institution’s responsibility to ensure all posts and questions are answered.");
		Thread.sleep(10000);
		
		String title1=driver.getTitle();
		System.out.println(title1);
		logger.info("get title sucess"+ ' ' + title1);
		Thread.sleep(10000);
		
		captureScreen(driver,"loginTest1");
		logger.info("pture sreenshot");
	
		if(driver.getTitle().equals(title1))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
	}
}
