package com.SalesForce.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SalesForce.Base.BaseTest;
import com.SalesForce.Pages.Accounts.AccountsPage;
import com.SalesForce.Utilities.CommonUtilities;

public class CreateAccountsTest extends BaseTest {
	
	String u_name=CommonUtilities.getApplicationProperty("username");
	String p_word=CommonUtilities.getApplicationProperty("password");
	
	@Test(enabled=true, priority=1)
	public void TC10_CreateAccount()
	{
		loginPage.enterintoUsername(u_name);
		loginPage.enterIntoPassword(p_word);
		loginPage.clickLoginButton();
		userPage.clickAccounts();
		userPage.clickdialogCloseButton();
		accounts.clickNewButton();
		accounts.enterTextIntoAccountName();
		accounts.clickSaveButtonAccount();
		String acct_name=accounts.getTextOfRecentAcctName();
		String account_name=accounts.returnacctName();
		Assert.assertEquals(acct_name, account_name);
	}
	@Test(enabled=true, priority=2)
	public void TC11_CreateNewView()
	{
		loginPage.enterintoUsername(u_name);
		loginPage.enterIntoPassword(p_word);
		loginPage.clickLoginButton();
		userPage.clickAccounts();
		userPage.clickdialogCloseButton();
		accounts.clickCreateNewView();
		accounts.enterTextIntoViewName();
		accounts.enterTextIntoViewUniqueName();
		accounts.clicksaveButtonViewPage();
		String title=userPage.getTitleOfPage();
		Assert.assertEquals(title, "Accounts ~ Salesforce - Developer Edition");
	
	}
	@Test(enabled=true, priority=3)
	public void T12_EditView()
	{
		loginPage.enterintoUsername(u_name);
		loginPage.enterIntoPassword(p_word);
		loginPage.clickLoginButton();
		userPage.clickAccounts();
		userPage.clickdialogCloseButton();
		editView.selectViewName();
		editView.clickEditLink();
		editView.enterTextIntoViewName();
		editView.selectfieldDropdown();
		editView.selectoperatorButton();
		editView.enterTextIntovalueButton();
		editView.selectAvailableFields();
		editView.clickAddButton();
		editView.clicksaveButton();	
		String title=userPage.getTitleOfPage();
		Assert.assertEquals(title, "Accounts ~ Salesforce - Developer Edition");
	}
	@Test(enabled=true, priority=4)
	public void T13_MergeAccounts()
	{
		loginPage.enterintoUsername(u_name);
		loginPage.enterIntoPassword(p_word);
		loginPage.clickLoginButton();
		userPage.clickAccounts();
		userPage.clickdialogCloseButton();
		accounts.clickmergeAccounts();
		String title=userPage.getTitleOfPage();
		Assert.assertEquals(title, "Merge My Accounts ~ Salesforce - Developer Edition");
		mergeAcct.enterTextIntoSearchAccounts();
		mergeAcct.clickFindAccounts();
		mergeAcct.clickcheckboxAccount1();
		mergeAcct.clickcheckboxAccount2();
		mergeAcct.clicknextButton();
		mergeAcct.clickmergeButton();
		mergeAcct.accAlert();
		userPage.clickAccounts();
	}
	@Test(enabled=true, priority=5)
	public void T14_CreateAccountReport()
	{
		loginPage.enterintoUsername(u_name);
		loginPage.enterIntoPassword(p_word);
		loginPage.clickLoginButton();
		userPage.clickAccounts();
		userPage.clickdialogCloseButton();
		accounts.clickreportLastActivity30days();
		accReport.clickDateField();
		accReport.clickcreatedDate();
		accReport.clickmonth();
		accReport.clickTodayDate();
		accReport.clickmonth1();
		accReport.clickTodayDate1();
		accReport.clicksavebutton();
		accReport.enterTextIntoReportName();
		accReport.enterTextIntoReportUniqueName();
		accReport.clicksaveAndRun();
		accReport.pageRefresh();
		
		  String rep_header=accReport.getReportHeaderText();
		 Assert.assertEquals(rep_header, "Unsaved Report");
		 
	}

}
