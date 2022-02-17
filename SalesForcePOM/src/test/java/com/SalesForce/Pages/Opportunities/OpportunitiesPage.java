package com.SalesForce.Pages.Opportunities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.SalesForce.Base.BasePage;

public class OpportunitiesPage extends BasePage{

	public OpportunitiesPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="fcf") WebElement viewDropdown;
	@FindBy(xpath="//tbody/tr[1]/td[2]/input[1]") WebElement newButton;
	@FindBy(id="opp3") WebElement oppName;
	@FindBy(id="opp4") WebElement acctName;
	@FindBy(id="opp9") WebElement date;
	@FindBy(id="opp11") WebElement stage;
	@FindBy(id="opp6") WebElement leadSource;
	@FindBy(xpath="//input[@value=' Save ']") WebElement saveButton;
	@FindBy(linkText="Opportunity Pipeline") WebElement opportunityPipeline;
	@FindBy(linkText="Stuck Opportunities") WebElement stuckOpportunities;
	@FindBy(id="quarter_q") WebElement interval;
	@FindBy(id="open") WebElement include;
	
	@FindBy(xpath="//tbody/tr[1]/td[2]/div[1]/div[1]/div[1]/h1[1]") WebElement oppHeader;
	
	
	
 public void clickViewDropdown()
	{
		waitUntilVisible(viewDropdown);
		clickElement(viewDropdown);
	}
 public void createNewOpportunities() throws InterruptedException
 {
	 waitUntilVisible(newButton);
		clickElement(newButton);
		
		waitUntilVisible(oppName);
		enterText(oppName, "opp123POM1");
		
		waitUntilVisible(acctName);
		enterText(acctName, "test");
		
		waitUntilVisible(date);
		enterText(date, "2/13/2022");
		
		waitUntilVisible(stage);
		Select select=new Select(stage);
		select.selectByVisibleText("Qualification");
		
		Thread.sleep(3000);
		
		waitUntilVisible(leadSource);
		Select select1=new Select(leadSource);
		select1.selectByVisibleText("Web");
		
		Thread.sleep(3000);
		
		waitUntilVisible(saveButton);
		clickElement(saveButton);
		
		pageRefresh();
		
 }
 public void clickopportunityPipeline()
	{
		waitUntilVisible(opportunityPipeline);
		clickElement(opportunityPipeline);
	}
 public void clickstuckOpportunities()
	{
		waitUntilVisible(stuckOpportunities);
		clickElement(stuckOpportunities);
	}
 public void testQuarterSummaryReport()
 {
	 Select select=new Select(interval);
		select.selectByVisibleText("Current and Previous FY");
		Select select1=new Select(include);
		select1.selectByVisibleText("Open Opportunities");
 }
 
 public String getOppHeaderText()
	{
		return oppHeader.getText();
	}
 

}
