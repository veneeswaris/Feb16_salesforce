package com.SalesForce.Tests;

import static org.testng.Assert.assertEquals;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SalesForce.Base.BaseTest;
import com.SalesForce.Utilities.CommonUtilities;

public class UserMenuDropDownTest extends BaseTest {
	
	static String url=CommonUtilities.getApplicationProperty("url");
	static String u_name=CommonUtilities.getApplicationProperty("username");
	static String p_word=CommonUtilities.getApplicationProperty("password");
	
	@Test(enabled=true,priority=1)
	public void TC5_userMenuDropdown()
	{
		loginPage.enterintoUsername(u_name);
		loginPage.enterIntoPassword(p_word);
		loginPage.clickLoginButton();
		userPage.clickUserMenu();
		String title=userPage.getTitleUserMenuPage();
		Assert.assertEquals(title, "Home Page ~ Salesforce - Developer Edition");
	}
	
	@Test(enabled=true,priority=2)
	public void TC6_myProfileOption() throws InterruptedException
	{
		loginPage.enterintoUsername(u_name);
		loginPage.enterIntoPassword(p_word);
		loginPage.clickLoginButton();
		userPage.clickUserMenu();
		userPage.clickMyProfile();
		myProfile.clickEditButton();
		myProfile.switchFrameContactInfo();
		myProfile.clickaboutButton();
		myProfile.enterIntoLastname();
		myProfile.clickSaveAllButton();
		myProfile.switchToDefaultContent1();
		myProfile.clickPostLink();
		myProfile.switchToPostIFrame();
		myProfile.enterIntoPostEditor();
		myProfile.switchToDefaultContent2();
		myProfile.clickPublishShareButton();
		myProfile.clickFileLink();
		myProfile.clickuploadLink();
		myProfile.sendKeysToChoosefileButton();
		myProfile.mouseOverImage();
		myProfile.addPhotoLink();
		myProfile.switchFramePhotoContentId();
		myProfile.sendKeysToChoosefile();
		myProfile.clickSaveButton1();
		myProfile.clickSaveButton2();
		String title=userPage.getUrlOfPage();
		Assert.assertEquals(title, "https://tekarch15-dev-ed.my.salesforce.com/_ui/core/userprofile/UserProfilePage?u=0058c000007hIJy&tab=sfdc.ProfilePlatformFeed");
	}
	
	@Test(enabled=true,priority=3)
	public void TC7_mySettingOption()
	{
		loginPage.enterintoUsername(u_name);
		loginPage.enterIntoPassword(p_word);
		loginPage.clickLoginButton();
		userPage.clickUserMenu();
		userPage.clickMySetting();
		mySetting.clickPersonalButton();
		mySetting.clickLoginHistoryButton();
		mySetting.clickDownloadHistory();
		mySetting.clickDisplayLayoutButton();
		mySetting.clickCustomizeTabLink();
		mySetting.selectCustomApp();
		mySetting.selectAvailableTab();
		mySetting.clickAddButton();
		mySetting.clickSaveButton();
		mySetting.clickEmailLink();
		mySetting.clickmyEmailSetting();
		mySetting.enterTextIntoEmailName();
		mySetting.enterTextIntoEmailAddress();
		mySetting.clickautoBCC();
		mySetting.clickSaveClick();
		mySetting.clickCalenderReminders();
		mySetting.clickReminderFont();
		mySetting.clickOpenTestReminder();
		boolean size=mySetting.getWindowsSize();
		Assert.assertEquals(true, size);
		
	}
	@Test(enabled=true,priority=4)
	public void TC8_developerConsole()
	{
		loginPage.enterintoUsername(u_name);
		loginPage.enterIntoPassword(p_word);
		loginPage.clickLoginButton();
		userPage.clickUserMenu();
		userPage.clickdeveloperConsole();
		int size=devConsole.developerConsoleWindowHandle();
		Assert.assertEquals(2, size);
	}
	
	@Test(enabled=true,priority=5)
	public void TC9_logOut()
	{
		loginPage.enterintoUsername(u_name);
		loginPage.enterIntoPassword(p_word);
		loginPage.clickLoginButton();
		userPage.clickUserMenu();
		userPage.clickLogout();
		String url=loginPage.getCurrentUrl();
		Assert.assertEquals(url, "https://tekarch15-dev-ed.my.salesforce.com/");
	}
}
