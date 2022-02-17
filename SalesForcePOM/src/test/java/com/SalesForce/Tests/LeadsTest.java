package com.SalesForce.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SalesForce.Base.BaseTest;
import com.SalesForce.Utilities.CommonUtilities;

public class LeadsTest extends BaseTest{
	String u_name=CommonUtilities.getApplicationProperty("username");
	String p_word=CommonUtilities.getApplicationProperty("password");
	
	@Test(enabled=true, priority=1)
	public void TC20_LeadsTab()
	{
		loginPage.enterintoUsername(u_name);
		loginPage.enterIntoPassword(p_word);
		loginPage.clickLoginButton();
		userPage.clickleads();
		userPage.clickdialogCloseButton();
		String title=userPage.getTitleOfPage();
		Assert.assertEquals(title, "Leads: Home ~ Salesforce - Developer Edition");
	}
	@Test(enabled=true, priority=2)
	public void TC21_LeadsDropdown()
	{
		loginPage.enterintoUsername(u_name);
		loginPage.enterIntoPassword(p_word);
		loginPage.clickLoginButton();
		userPage.clickleads();
		userPage.clickdialogCloseButton();
		leads.clickLeadDropDown();
		String title=userPage.getTitleOfPage();
		Assert.assertEquals(title, "Leads: Home ~ Salesforce - Developer Edition");
	}
	@Test(enabled=true, priority=3)
	public void TC22_LeadsDefaultView()
	{
		loginPage.enterintoUsername(u_name);
		loginPage.enterIntoPassword(p_word);
		loginPage.clickLoginButton();
		userPage.clickleads();
		userPage.clickdialogCloseButton();
		leads.clickLeadDropDown();
		leads.LeadsDefaultView();
		userPage.clickUserMenu();
		userPage.clickLogout();
		loginPage.enterintoUsername(u_name);
		loginPage.enterIntoPassword(p_word);
		loginPage.clickLoginButton();
		userPage.clickleads();
		//userPage.clickdialogCloseButton();
		leads.clickgoButton();
		String title=userPage.getTitleOfPage();
		Assert.assertEquals(title, "Leads ~ Salesforce - Developer Edition");
		
		
	}
	@Test(enabled=true, priority=4)
	public void TC23_TodayLeadsWork()
	{
		loginPage.enterintoUsername(u_name);
		loginPage.enterIntoPassword(p_word);
		loginPage.clickLoginButton();
		userPage.clickleads();
		userPage.clickdialogCloseButton();
		leads.clickLeadDropDown();
		leads.LeadsDefaultView();
		String title=userPage.getTitleOfPage();
		Assert.assertEquals(title, "Leads ~ Salesforce - Developer Edition");
	}
	@Test(enabled=true, priority=5)
	public void TC24_TodayLeadsWork()
	{
		loginPage.enterintoUsername(u_name);
		loginPage.enterIntoPassword(p_word);
		loginPage.clickLoginButton();
		userPage.clickleads();
		userPage.clickdialogCloseButton();
		leads.newLead();
		String leadText=leads.getleadVerfiyLink();
		Assert.assertEquals(leadText, "Lead Detail");
	}
}
