package com.SalesForce.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SalesForce.Base.BaseTest;
import com.SalesForce.Utilities.CommonUtilities;

public class RandomTest extends BaseTest{
	String u_name=CommonUtilities.getApplicationProperty("username");
	String p_word=CommonUtilities.getApplicationProperty("password");
	
	@Test(enabled=true, priority=1)
	public void TC33_HomeFirstLastName()
	{
		loginPage.enterintoUsername(u_name);
		loginPage.enterIntoPassword(p_word);
		loginPage.clickLoginButton();
		userPage.clickHome();
		userPage.clickdialogCloseButton();
		home.clickNameLink();
	}
	@Test(enabled=true, priority=2)
	public void TC34_EditLastName() throws InterruptedException
	{
		loginPage.enterintoUsername(u_name);
		loginPage.enterIntoPassword(p_word);
		loginPage.clickLoginButton();
		userPage.clickHome();
		userPage.clickdialogCloseButton();
		home.clickNameLink();
		home.EditLastName();
		/*
		 * String title=userPage.getUrlOfPage(); Assert.assertEquals(title,
		 * "https://tekarch15-dev-ed.my.salesforce.com/_ui/core/userprofile/UserProfilePage?u=0058c000007hIJy&tab=sfdc.ProfilePlatformFeed"
		 * );
		 */
	}
	@Test(enabled=true, priority=3)
	public void TC35_allTabs() throws InterruptedException
	{
		loginPage.enterintoUsername(u_name);
		loginPage.enterIntoPassword(p_word);
		loginPage.clickLoginButton();
		userPage.clickallTabs();
		//userPage.clickdialogCloseButton();
		allTabs.allTabs_Remove();
	}
	@Test(enabled=true, priority=4)
	public void T36_BlockEvent()
	{
		loginPage.enterintoUsername(u_name);
		loginPage.enterIntoPassword(p_word);
		loginPage.clickLoginButton();
		userPage.clickHome();
		userPage.clickdialogCloseButton();
		calender.createBlockEvent();
	}
	@Test(enabled=true, priority=5)
	public void T37_BlockEventWeeklyOccurance()
	{
		loginPage.enterintoUsername(u_name);
		loginPage.enterIntoPassword(p_word);
		loginPage.clickLoginButton();
		userPage.clickHome();
		userPage.clickdialogCloseButton();
		calender.createBlockEventWeeklyOccurance();
	}
}
