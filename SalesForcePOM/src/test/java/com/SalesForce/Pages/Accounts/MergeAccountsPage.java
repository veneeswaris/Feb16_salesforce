package com.SalesForce.Pages.Accounts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SalesForce.Base.BasePage;

public class MergeAccountsPage extends BasePage {

	public MergeAccountsPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="srch") WebElement searchAccounts;
	@FindBy(xpath="//input[@value='Find Accounts']") WebElement findAccounts;
	@FindBy(id="cid0") WebElement checkboxAccount1;
	@FindBy(id="cid1") WebElement checkboxAccount2;
	@FindBy(xpath="//input[@value=' Next ']") WebElement nextButton;
	@FindBy(xpath="//input[@value=' Merge ']") WebElement mergeButton;
	
	
	public void enterTextIntoSearchAccounts()
	{
		waitUntilVisible(searchAccounts);
		enterText(searchAccounts, "ven");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void clickFindAccounts()
	{
		waitUntilVisible(findAccounts);
		clickElement(findAccounts);
	}
	public void clickcheckboxAccount1()
	{
		waitUntilVisible(checkboxAccount1);
		if(!checkboxAccount1.isSelected())
		clickElement(checkboxAccount1);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void clickcheckboxAccount2()
	{
		waitUntilVisible(checkboxAccount2);
		if(!checkboxAccount2.isSelected())
		clickElement(checkboxAccount2);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void clicknextButton()
	{
		waitUntilVisible(nextButton);
		clickElement(nextButton);
	}
	public void clickmergeButton()
	{
		waitUntilVisible(mergeButton);
		clickElement(mergeButton);
	}
	public void accAlert()
	{
		alertAccept();
	}

}
