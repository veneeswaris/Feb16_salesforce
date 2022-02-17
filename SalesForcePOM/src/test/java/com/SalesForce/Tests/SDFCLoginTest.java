package com.SalesForce.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SalesForce.Base.BaseTest;
//import com.SalesForce.Pages.SDFCLogin.SDFCLoginPage;
import com.SalesForce.Utilities.CommonUtilities;

public class SDFCLoginTest extends BaseTest {
	static String url=CommonUtilities.getApplicationProperty("url");
	static String u_name=CommonUtilities.getApplicationProperty("username");
	static String p_word=CommonUtilities.getApplicationProperty("password");
	
	@Test(priority=1)
	public void TC1_invalidLogin() throws InterruptedException
	{
		loginPage.enterintoUsername(u_name);
		loginPage.clickLoginButton();
		String actualError=loginPage.getUnameError();
		Thread.sleep(3000);
		Assert.assertEquals(actualError, "Please enter your password.");
	}
	public void validLogin() throws InterruptedException
	{
		loginPage.enterintoUsername(u_name);
		loginPage.enterIntoPassword(p_word);
		loginPage.clickLoginButton();
		String title=userPage.getTitleUserMenuPage();
		Thread.sleep(3000);
		Assert.assertEquals(title, "Home Page ~ Salesforce - Developer Edition");
	}
	@Test(priority=2)
	public void TC3_checkRememberMe() throws InterruptedException
	{
		loginPage.clearUsername();
		loginPage.enterintoUsername(u_name);
		loginPage.clearPassword();
		loginPage.enterIntoPassword(p_word);
		loginPage.clickRememberMe();
		loginPage.clickLoginButton();
		userPage.clickUserMenu();
		userPage.clickLogout();
		String uname_text=loginPage.getTextOfUsername();
	//	System.out.println(uname_text);
		Thread.sleep(3000);
		Assert.assertEquals(uname_text, u_name);
	}
	@Test(priority=3)
	public void TC4_forgotPassword() throws InterruptedException
	{
		loginPage.clickForgotPassword();
		loginPage.enterInUnameForgot(u_name);
		loginPage.clickContinue();
		String chkEmailText=loginPage.get_chk_email_header();
		Thread.sleep(3000);
		Assert.assertEquals(chkEmailText, "Check Your Email");
	}
	
	@Test(priority=4)
	public void TC4B_forgotPassword() throws InterruptedException
	{
		loginPage.enterintoUsername("123");
		loginPage.enterIntoPassword("123");
		loginPage.clickLoginButton();
		String actualError=loginPage.getUnameError();
		Thread.sleep(3000);
		Assert.assertEquals(actualError, "Please check your username and password. If you still can't log in, contact your Salesforce administrator.");
	}
	

}
