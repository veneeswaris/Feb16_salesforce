package com.SalesForce.Pages.AllTabs;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SalesForce.Base.BasePage;

public class CalenderPage extends BasePage {

	public CalenderPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//tbody/tr[1]/td[2]/div[1]/div[1]/div[1]/div[2]/span[2]/a") WebElement dateLink;
	@FindBy(xpath="//a[contains(text(),'8:00 PM')]") WebElement pm8Link;
	@FindBy(xpath="//a[contains(text(),'4:00 PM')]") WebElement pm4Link;
	@FindBy(xpath="//tbody/tr[2]/td[2]/div[1]/a[1]/img[1]") WebElement subjectComboWindow;
	@FindBy(linkText="Other") WebElement otherLink;
	@FindBy(id="EndDateTime_time") WebElement endTime;
	@FindBy(id="timePickerItem_42") WebElement end9Time;
	@FindBy(xpath="//input[@value=' Save ']") WebElement saveButton;
	
	@FindBy(id="timePickerItem_38") WebElement end7Time;
	@FindBy(id="IsRecurrence") WebElement recurrence;
	@FindBy(id="rectypeftw") WebElement weekly;
	@FindBy(id="RecurrenceEndDateOnly") WebElement endDateRecurring;
	@FindBy(xpath="//img[@title='Month View']") WebElement monthview;
	
	
	public void createBlockEvent()
	{
		waitUntilVisible(dateLink);
		clickElement(dateLink);
		waitUntilVisible(pm8Link);
		clickElement(pm8Link);
		waitUntilVisible(subjectComboWindow);
		clickElement(subjectComboWindow);
		
Set<String> windows=driver.getWindowHandles();
		
		String currentWindow=driver.getWindowHandle();
		if(windows.size()>1)
		{
			for(String newWindow:windows)
			{
			if(!currentWindow.equals(newWindow))
			{
				driver.switchTo().window(newWindow);
				break;
			}
			}
			waitUntilVisible(otherLink);
			clickElement(otherLink);
		}
		
		driver.switchTo().window(currentWindow);
		waitUntilVisible(endTime);
		clickElement(endTime);
		
		waitUntilVisible(end9Time);
		clickElement(end9Time);
		
		waitUntilVisible(saveButton);
		clickElement(saveButton);
			
	
	}
	public void createBlockEventWeeklyOccurance()
	{
		waitUntilVisible(dateLink);
		clickElement(dateLink);
		waitUntilVisible(pm4Link);
		clickElement(pm4Link);
		waitUntilVisible(subjectComboWindow);
		clickElement(subjectComboWindow);
		
Set<String> windows=driver.getWindowHandles();
		
		String currentWindow=driver.getWindowHandle();
		if(windows.size()>1)
		{
			for(String newWindow:windows)
			{
			if(!currentWindow.equals(newWindow))
			{
				driver.switchTo().window(newWindow);
				break;
			}
			}
			waitUntilVisible(otherLink);
			clickElement(otherLink);
		}
		
		driver.switchTo().window(currentWindow);
		
		waitUntilVisible(endTime);
		clickElement(endTime);
		
		waitUntilVisible(end7Time);
		clickElement(end7Time);
		
		if(!recurrence.isSelected())
		{
			waitUntilVisible(recurrence);
			clickElement(recurrence);
		}
		
		waitUntilVisible(weekly);
		clickElement(weekly);
		
		waitUntilVisible(endDateRecurring);
		endDateRecurring.sendKeys("2/20/2022");
		
		waitUntilVisible(saveButton);
		clickElement(saveButton);
		
		waitUntilVisible(monthview);
		clickElement(monthview);
			
	
	}

}
