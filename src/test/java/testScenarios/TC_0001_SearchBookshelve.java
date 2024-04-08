package testScenarios;

import org.testng.annotations.Test;

import pageObjects.UrbanLadderHomePage;
import testBase.BaseClass;

public class TC_0001_SearchBookshelve extends BaseClass{
	 UrbanLadderHomePage uhp;
		
		@Test(priority = 1, groups = { "Smoke Test one" })
		public void sendInSearch()
		{
			getLogger().info("**********Starting TC_0001_SearchBookshelve************");
			getLogger().info("**********Passing input in search Bar************");
			
			uhp = new UrbanLadderHomePage(driver);
			uhp.inputBox();
			
			getLogger().info("**********sendInSearch() successfully passed************");
		}
		
		@Test(priority = 2, groups = { "Smoke Test one" })
		public void clicksearch()
		{
			getLogger().info("**********Clicking Search Button************");
			
			uhp.clickSearch();
					
			getLogger().info("**********clicksearch() successfully passed************");
			getLogger().info("**********Finished TC_0001_SearchBookshelve************");
		}
}

