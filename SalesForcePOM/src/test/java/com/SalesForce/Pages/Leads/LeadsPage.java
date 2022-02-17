package com.SalesForce.Pages.Leads;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.SalesForce.Base.BasePage;

public class LeadsPage extends BasePage {

	public LeadsPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="fcf") WebElement leadDropdown;
	@FindBy(xpath="//input[@value=' Go! ']") WebElement goButton;
	@FindBy(xpath="//input[@value=' New ']") WebElement newButton;
	@FindBy(id="name_lastlea2") WebElement lastName;
	@FindBy(id="lea3") WebElement company;
	@FindBy(xpath="//input[@value=' Save ']") WebElement saveButton;
	
	@FindBy(xpath="//h2[contains(text(),'Lead Detail')]") WebElement leadVerfiyLink;
	
	
	public void clickLeadDropDown()
	{
		waitUntilVisible(leadDropdown);
		clickElement(leadDropdown);
	}
	public void LeadsDefaultView()
	{
		waitUntilVisible(leadDropdown);
		Select select=new Select(leadDropdown);
		select.selectByVisibleText("Today's Leads");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void clickgoButton()
	{
		waitUntilVisible(goButton);
		clickElement(goButton);
	}
	public void newLead()
	{
		waitUntilVisible(newButton);
		clickElement(newButton);
		waitUntilVisible(lastName);
		enterText(lastName, "ABCDe");
		waitUntilVisible(company);
		enterText(company, "ABCDe");
		waitUntilVisible(saveButton);
		clickElement(saveButton);
		pageRefresh();
	}
	public String getleadVerfiyLink()
	{
		return leadVerfiyLink.getText();
	}

}
