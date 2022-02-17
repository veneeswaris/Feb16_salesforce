package com.SalesForce.Pages.Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SalesForce.Base.BasePage;

public class Home extends BasePage {

	public Home(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//tbody/tr[1]/td[2]/div[1]/div[1]/div[1]/div[2]/span/h1/a") WebElement nameLink;
	@FindBy(xpath="//a[@class='contactInfoLaunch editLink']//img[@title='Edit Profile']") WebElement editButton;
	@FindBy(xpath="//a[contains(text(),'About')]") WebElement aboutButton;
	@FindBy(id="lastName") WebElement lastName;
	@FindBy(xpath="//input[@value='Save All']") WebElement saveAllButton;
	
	public void clickNameLink()
	{
		waitUntilVisible(nameLink);
		clickElement(nameLink);
	}

	public void EditLastName() throws InterruptedException
	{
		 waitUntilElementClickable(editButton); Thread.sleep(5000);
		  editButton.click(); Thread.sleep(5000);
		  
		  driver.switchTo().frame("contactInfoContentId");
			 waitUntilVisible(aboutButton); clickElement(aboutButton);
			 lastName.clear();
			  enterText(lastName, "Abcd"); 
			  clickElement(saveAllButton);
				 
			  
			  driver.switchTo().defaultContent();
			 
	}
}
