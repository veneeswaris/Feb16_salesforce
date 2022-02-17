package com.SalesForce.Pages.Accounts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SalesForce.Base.BasePage;

public class AccountsPage extends BasePage {
// has create new account elements and new view elements
	
	public AccountsPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//input[@value=' New ']") WebElement newButton;
	@FindBy(id="acc2") WebElement accountName;
	@FindBy(xpath="//input[@value=' Save ']") WebElement saveButtonAccount;
	@FindBy(linkText="Create New View") WebElement createNewView;
	@FindBy(id="fname") WebElement viewName;
	@FindBy(id="devname") WebElement viewUniqueName;
	@FindBy(xpath="//input[@value=' Save ']") WebElement saveButtonViewPage;
	@FindBy(linkText="Merge Accounts") WebElement mergeAccounts;
	@FindBy(linkText="Accounts with last activity > 30 days") WebElement reportLastActivity30days;
	@FindBy(xpath="//a[@href='/0018c00002A58Du']") WebElement recentAcctName;
	String account_name="Testing Acct.NamePOM";
	
	public String returnacctName()
	{
		return account_name;
	}
	
	public void clickNewButton()
	{
		waitUntilVisible(newButton);
		clickElement(newButton);
	}
	public void enterTextIntoAccountName()
	{
		waitUntilVisible(accountName);
		enterText(accountName, account_name);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void clickSaveButtonAccount()
	{
		waitUntilVisible(saveButtonAccount);
		clickElement(saveButtonAccount);
	}
	
	public void clickCreateNewView()
	{
		waitUntilVisible(createNewView);
		clickElement(createNewView);
	}
	public void enterTextIntoViewName()
	{
		waitUntilVisible(viewName);
		enterText(viewName, "viewNameVeniPOM1");
	}
	public void enterTextIntoViewUniqueName()
	{
		waitUntilVisible(viewUniqueName);
		enterText(viewUniqueName, "viewUniqueNameVeniPOM1");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void clicksaveButtonViewPage()
	{
		waitUntilVisible(saveButtonViewPage);
		clickElement(saveButtonViewPage);
	}
	public void clickmergeAccounts()
	{
		waitUntilVisible(mergeAccounts);
		clickElement(mergeAccounts);
	}
	public void clickreportLastActivity30days()
	{
		waitUntilVisible(reportLastActivity30days);
		clickElement(reportLastActivity30days);
	}
	public String getTextOfRecentAcctName()
	{
		String recentAcctText=recentAcctName.getText();
		return recentAcctText;
	}
	public String getCurrentUrl()
	{
		return driver.getCurrentUrl();
	}
	
	

}
