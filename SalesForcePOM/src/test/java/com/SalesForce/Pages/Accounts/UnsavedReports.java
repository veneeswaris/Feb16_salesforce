package com.SalesForce.Pages.Accounts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SalesForce.Base.BasePage;

public class UnsavedReports extends BasePage {

	public UnsavedReports(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//img[@id='ext-gen148']") WebElement dateField;
	@FindBy(xpath="//div[contains(text(),'Created Date')]") WebElement createdDate;
	@FindBy(id="ext-gen152") WebElement month;
	@FindBy(xpath="/html[1]/body[1]/div[16]/ul[1]/li[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/em[1]/button[1]") WebElement todayDate;
	@FindBy(id="ext-gen154") WebElement month1;
	@FindBy(xpath="//button[@id='ext-gen296']") WebElement todayDate1;
	@FindBy(id="ext-gen49") WebElement savebutton;
	@FindBy(id="saveReportDlg_reportNameField") WebElement reportName;
	@FindBy(id="saveReportDlg_DeveloperName") WebElement reportUniqueName;
	@FindBy(id="ext-gen316") WebElement saveAndRun;
	
	@FindBy(xpath="//h2[contains(text(),'Unsaved Report')]") WebElement reportHeader;
	
	public void clickDateField()
	{
		waitUntilVisible(dateField);
		clickElement(dateField);
	}
	public void clickcreatedDate()
	{
		waitUntilVisible(createdDate);
		clickElement(createdDate);
	}
	public void clickmonth()
	{
		waitUntilVisible(month);
		clickElement(month);
	}
	public void clickTodayDate()
	{
		waitUntilVisible(todayDate);
		clickElement(todayDate);
	}
	public void clickmonth1()
	{
		waitUntilVisible(month1);
		clickElement(month1);
	}
	public void clickTodayDate1()
	{
		waitUntilVisible(todayDate1);
		clickElement(todayDate1);
	}
	public void clicksavebutton()
	{
		waitUntilVisible(savebutton);
		clickElement(savebutton);
	}
	public void enterTextIntoReportName()
	{
		waitUntilVisible(reportName);
		enterText(reportName, "veniReportPOM1");
	}
	public void enterTextIntoReportUniqueName()
	{
		waitUntilVisible(reportUniqueName);
		enterText(reportUniqueName, "veniUniqueReportPOM1");
	}
	public void clicksaveAndRun()
	{
		waitUntilVisible(saveAndRun);
		clickElement(saveAndRun);
	}
	public String getReportHeaderText()
	{
		return reportHeader.getText();
	}

}
