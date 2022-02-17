package com.SalesForce.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SalesForce.Base.BaseTest;
import com.SalesForce.Utilities.CommonUtilities;

public class ContactsTest extends BaseTest {
	String u_name=CommonUtilities.getApplicationProperty("username");
	String p_word=CommonUtilities.getApplicationProperty("password");
	
	@Test(enabled=true, priority=1)
	public void TC25_CreateNewContacts() throws InterruptedException
	{
		loginPage.enterintoUsername(u_name);
		loginPage.enterIntoPassword(p_word);
		loginPage.clickLoginButton();
		userPage.clickContacts();
		userPage.clickdialogCloseButton();
		contacts.newContact();
		String contactText=contacts.getContactDetailVerfiyLink();
		Assert.assertEquals(contactText, "Contact Detail");
	}
	@Test(enabled=true, priority=2)
	public void TC26_CreateNewView() throws InterruptedException
	{
		loginPage.enterintoUsername(u_name);
		loginPage.enterIntoPassword(p_word);
		loginPage.clickLoginButton();
		userPage.clickContacts();
		userPage.clickdialogCloseButton();
		contacts.createNewView();
		String title=userPage.getTitleOfPage();
		Assert.assertEquals(title, "Contacts ~ Salesforce - Developer Edition");
		/*
		 * String contactText=contacts.getContactVerfiyLink();
		 * Assert.assertEquals(contactText, "Contacts");
		 */
	}
	@Test(enabled=true, priority=3)
	public void TC27_RecentlyCreatedContacts() throws InterruptedException
	{
		loginPage.enterintoUsername(u_name);
		loginPage.enterIntoPassword(p_word);
		loginPage.clickLoginButton();
		userPage.clickContacts();
		userPage.clickdialogCloseButton();
		contacts.recentCreateContact();
		String title=userPage.getTitleOfPage();
		Assert.assertEquals(title, "Contacts: Home ~ Salesforce - Developer Edition");
	}
	@Test(enabled=true, priority=4)
	public void TC28_MyContactsView() throws InterruptedException
	{
		loginPage.enterintoUsername(u_name);
		loginPage.enterIntoPassword(p_word);
		loginPage.clickLoginButton();
		userPage.clickContacts();
		userPage.clickdialogCloseButton();
		contacts.selectViewDropdown();
		String title=userPage.getTitleOfPage();
		Assert.assertEquals(title, "Contacts: Home ~ Salesforce - Developer Edition");
	}
	@Test(enabled=true, priority=5)
	public void TC29_ViewContacts() throws InterruptedException
	{
		loginPage.enterintoUsername(u_name);
		loginPage.enterIntoPassword(p_word);
		loginPage.clickLoginButton();
		userPage.clickContacts();
		userPage.clickdialogCloseButton();
		contacts.viewContact();
		String contactText=contacts.getContactDetailVerfiyLink();
		Assert.assertEquals(contactText, "Contact Detail");
	}
	@Test(enabled=true, priority=6)
	public void TC30_CreateNewView_ErrorMessage() throws InterruptedException
	{
		loginPage.enterintoUsername(u_name);
		loginPage.enterIntoPassword(p_word);
		loginPage.clickLoginButton();
		userPage.clickContacts();
		userPage.clickdialogCloseButton();
		contacts.createNewViewError();
		String error=contacts.getErrorMessage();
		Assert.assertEquals(error, "Error: You must enter a value");
	}
	@Test(enabled=true, priority=7)
	public void TC31_CreateNewViewCancel() throws InterruptedException
	{
		loginPage.enterintoUsername(u_name);
		loginPage.enterIntoPassword(p_word);
		loginPage.clickLoginButton();
		userPage.clickContacts();
		userPage.clickdialogCloseButton();
		contacts.createNewViewCancel();
		String title=userPage.getTitleOfPage();
		Assert.assertEquals(title, "Contacts: Home ~ Salesforce - Developer Edition");
	}
	@Test(enabled=true, priority=8)
	public void TC32_CreateNewContactsSaveNew() throws InterruptedException
	{
		loginPage.enterintoUsername(u_name);
		loginPage.enterIntoPassword(p_word);
		loginPage.clickLoginButton();
		userPage.clickContacts();
		userPage.clickdialogCloseButton();
		contacts.createNewContactSaveNew();
		String title=userPage.getTitleOfPage();
		Assert.assertEquals(title, "Contact Edit: New Contact ~ Salesforce - Developer Edition");
	}
}
