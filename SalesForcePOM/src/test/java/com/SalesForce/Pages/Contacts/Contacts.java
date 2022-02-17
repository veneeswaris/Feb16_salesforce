package com.SalesForce.Pages.Contacts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.SalesForce.Base.BasePage;

public class Contacts extends BasePage {

	public Contacts(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//input[@value=' New ']") WebElement newButton;
	@FindBy(id="name_lastcon2") WebElement lastName;
	@FindBy(id="con4") WebElement AcctName;
	@FindBy(xpath="//input[@value=' Save ']") WebElement saveButton;
	@FindBy(linkText="Create New View") WebElement createNewView;
	@FindBy(id="fname") WebElement viewName;
	@FindBy(id="devname") WebElement viewUniqueName;
	@FindBy(id="hotlist_mode") WebElement rightDropdown;
	@FindBy(id="fcf") WebElement viewDropdown;
	@FindBy(xpath="//tbody/tr[2]/th[1]/a[1]") WebElement recentContact;
	@FindBy(xpath="//input[@value='Cancel']") WebElement cancelButton;
	@FindBy(xpath="//input[@value='Save & New']") WebElement saveNewButton;
	
	@FindBy(xpath="//tbody/tr[1]/td[2]/div[1]/div[1]/div[1]/h1[1]") WebElement contactVerify;
	@FindBy(xpath="//h2[contains(text(),'Contact Detail')]") WebElement contactDetailVerify;
	@FindBy(xpath="//div[@class='requiredInput']//div[@class='errorMsg']") WebElement getError;
	
	public void newContact() throws InterruptedException
	{
		waitUntilVisible(newButton);
		clickElement(newButton);
		Thread.sleep(3000);
		waitUntilVisible(lastName);
		enterText(lastName, "Shanm");
		Thread.sleep(3000);
		waitUntilVisible(AcctName);
		enterText(AcctName, "test");
		Thread.sleep(3000);
		waitUntilVisible(saveButton);
		clickElement(saveButton);
	}
	
	public void createNewView() throws InterruptedException
	{
		waitUntilVisible(createNewView);
		clickElement(createNewView);
		waitUntilVisible(viewName);
		enterText(viewName, "viewnameveni121");
		waitUntilVisible(viewUniqueName);
		viewUniqueName.clear();
		Thread.sleep(2000);
		enterText(viewUniqueName, "viewnameveni1");
		waitUntilVisible(saveButton);
		clickElement(saveButton);
		
	}
	public void recentCreateContact()
	{
		Select select=new Select(rightDropdown);
		select.selectByVisibleText("Recently Modified");
	}
	public void selectViewDropdown()
	{
		waitUntilVisible(viewDropdown);
		Select select=new Select(viewDropdown);
		select.selectByVisibleText("My Contacts");
	}
	public void viewContact()
	{
		waitUntilVisible(recentContact);
		clickElement(recentContact);
	}
	public void createNewViewError()
	{
		waitUntilVisible(createNewView);
		clickElement(createNewView);
		viewName.clear();
		waitUntilVisible(viewUniqueName);
		enterText(viewUniqueName, "EFGH");
		waitUntilVisible(saveButton);
		clickElement(saveButton);
		
	}
	public void createNewViewCancel()
	{
		waitUntilVisible(createNewView);
		clickElement(createNewView);
		waitUntilVisible(viewName);
		enterText(viewName, "viewnameveni");
		waitUntilVisible(viewUniqueName);
		enterText(viewUniqueName, "viewnameveni");
		waitUntilVisible(cancelButton);
		clickElement(cancelButton);
		
	}
	public void createNewContactSaveNew() throws InterruptedException
	{
		waitUntilVisible(newButton);
		clickElement(newButton);
		waitUntilVisible(lastName);
		enterText(lastName, "Shanm1");
		Thread.sleep(3000);
		waitUntilVisible(AcctName);
		enterText(AcctName, "test");
		waitUntilVisible(saveNewButton);
		clickElement(saveNewButton);
		
	}
	public String getContactVerfiyLink()
	{
		return contactVerify.getText();
	}
	public String getContactDetailVerfiyLink()
	{
		return contactDetailVerify.getText();
	}
	public String getErrorMessage()
	{
		System.out.println(getError.getText());
		return getError.getText();
	}
	

}
