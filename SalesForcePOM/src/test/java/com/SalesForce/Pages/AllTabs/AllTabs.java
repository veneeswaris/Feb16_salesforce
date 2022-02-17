package com.SalesForce.Pages.AllTabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.SalesForce.Base.BasePage;

public class AllTabs extends BasePage {

	public AllTabs(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//input[@title='Customize My Tabs']") WebElement customizeMyTab;
	@FindBy(id="duel_select_1") WebElement selectedTabs;
	@FindBy(id="duel_select_0_left") WebElement removeButton;
	@FindBy(xpath="//tbody/tr[1]/td[2]/input[1]") WebElement saveButton;
	
	public void allTabs_Remove() throws InterruptedException
	{
		waitUntilVisible(customizeMyTab);
		clickElement(customizeMyTab);
		Select select1=new Select(selectedTabs);
		  select1.selectByVisibleText("Profile");
		  waitUntilVisible(removeButton);
		  Thread.sleep(5000);
		  clickElement(removeButton);
		  waitUntilVisible(saveButton); 
		  clickElement(saveButton);
	}
	
	
	

}
