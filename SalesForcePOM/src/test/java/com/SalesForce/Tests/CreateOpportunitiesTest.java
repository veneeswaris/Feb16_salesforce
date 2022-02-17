package com.SalesForce.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SalesForce.Base.BaseTest;
import com.SalesForce.Utilities.CommonUtilities;

public class CreateOpportunitiesTest extends BaseTest {

	String u_name=CommonUtilities.getApplicationProperty("username");
	String p_word=CommonUtilities.getApplicationProperty("password");
	
	@Test(enabled=true, priority=1)
	public void T15_Opportunities()
	{
		loginPage.enterintoUsername(u_name);
		loginPage.enterIntoPassword(p_word);
		loginPage.clickLoginButton();
		userPage.clickOpportunities();
		userPage.clickdialogCloseButton();
		opportunitiesPage.clickViewDropdown();
		String title=userPage.getTitleOfPage();
		Assert.assertEquals(title, "Opportunities: Home ~ Salesforce - Developer Edition");
	}
	@Test(enabled=true, priority=2)
	public void T16_createNewOpportunities() throws InterruptedException
	{
		loginPage.enterintoUsername(u_name);
		loginPage.enterIntoPassword(p_word);
		loginPage.clickLoginButton();
		userPage.clickOpportunities();
		userPage.clickdialogCloseButton();
		opportunitiesPage.createNewOpportunities();
		 String opp_header=opportunitiesPage.getOppHeaderText();
		 Assert.assertEquals(opp_header, "Opportunity");
	}
	@Test(enabled=true, priority=3)
	public void TC17_TestOpportunityPipelineReport() 
	{
		loginPage.enterintoUsername(u_name);
		loginPage.enterIntoPassword(p_word);
		loginPage.clickLoginButton();
		userPage.clickOpportunities();
		userPage.clickdialogCloseButton();
		opportunitiesPage.clickopportunityPipeline();
		String title=userPage.getTitleOfPage();
		Assert.assertEquals(title, "Opportunity Pipeline ~ Salesforce - Developer Edition");
	}
	
	@Test(enabled=true, priority=4)
	public void TC18_StuckOpportunityPipelineReport() 
	{
		loginPage.enterintoUsername(u_name);
		loginPage.enterIntoPassword(p_word);
		loginPage.clickLoginButton();
		userPage.clickOpportunities();
		userPage.clickdialogCloseButton();
		opportunitiesPage.clickstuckOpportunities();
		String title=userPage.getTitleOfPage();
		Assert.assertEquals(title, "Stuck Opportunities ~ Salesforce - Developer Edition");
	}
	
	@Test(enabled=true, priority=5)
	public void TC19_TestQuarterlySummaryReport() 
	{
		loginPage.enterintoUsername(u_name);
		loginPage.enterIntoPassword(p_word);
		loginPage.clickLoginButton();
		userPage.clickOpportunities();
		userPage.clickdialogCloseButton();
		opportunitiesPage.testQuarterSummaryReport();
		String title=userPage.getTitleOfPage();
		Assert.assertEquals(title, "Opportunities: Home ~ Salesforce - Developer Edition");
	}
	
	
}
