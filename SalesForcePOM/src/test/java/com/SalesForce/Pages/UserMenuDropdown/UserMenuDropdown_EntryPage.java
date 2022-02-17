package com.SalesForce.Pages.UserMenuDropdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SalesForce.Base.BasePage;

public class UserMenuDropdown_EntryPage extends BasePage {

	public UserMenuDropdown_EntryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//@FindBy(id="Logout") WebElement logout;
	@FindBy(id="userNav") WebElement userMenu;
	@FindBy(linkText ="Logout") WebElement logout; 
	@FindBy(linkText = "My Profile") WebElement myProfile;
	@FindBy(linkText = "My Settings") WebElement mySetting;
	@FindBy(linkText = "Developer Console") WebElement developerConsole;
	@FindBy(linkText = "Accounts") WebElement accounts;
	@FindBy(linkText = "Opportunities") WebElement Opportunities;
	@FindBy(linkText = "Leads") WebElement leads;
	@FindBy(linkText = "Contacts") WebElement Contacts;
	@FindBy(linkText = "Home") WebElement home;
	@FindBy(xpath = "//img[@title='All Tabs']") WebElement allTabs;
	@FindBy(id="tryLexDialogX") WebElement dialogCloseButton;
	
	public void clickUserMenu()
	{
		waitUntilVisible(userMenu);
		clickElement(userMenu);
	}
	public void clickLogout()
	{
		waitUntilVisible(logout);
		clickElement(logout);
	}
	public String getTitleUserMenuPage()
	{
		return getTitleOfPage();
	}
	public void clickMyProfile()
	{
		waitUntilVisible(myProfile);
		clickElement(myProfile);
	}
	public void clickMySetting()
	{
		waitUntilVisible(mySetting);
		clickElement(mySetting);
	}
	public void clickdeveloperConsole()
	{
		waitUntilVisible(developerConsole);
		clickElement(developerConsole);
	}
	public void clickAccounts()
	{
		waitUntilVisible(accounts);
		clickElement(accounts);
	}
	public void clickdialogCloseButton()
	{
		waitUntilVisible(dialogCloseButton);
		clickElement(dialogCloseButton);
	}
	public void clickOpportunities()
	{
		waitUntilVisible(Opportunities);
		clickElement(Opportunities);
	}
	public void clickleads()
	{
		waitUntilVisible(leads);
		clickElement(leads);
	}
	public void clickContacts()
	{
		waitUntilVisible(Contacts);
		clickElement(Contacts);
	}
	public void clickHome()
	{
		waitUntilVisible(home);
		clickElement(home);
	}
	public void clickallTabs()
	{
		waitUntilVisible(allTabs);
		clickElement(allTabs);
	}


}
