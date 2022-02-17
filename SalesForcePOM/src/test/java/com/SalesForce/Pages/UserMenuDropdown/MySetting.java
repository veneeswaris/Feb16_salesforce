package com.SalesForce.Pages.UserMenuDropdown;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SalesForce.Base.BasePage;

public class MySetting extends BasePage {
	public MySetting(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath = "//span[@id='PersonalInfo_font']") WebElement personalButton;
	@FindBy(xpath = "//span[@id='LoginHistory_font']") WebElement LoginHistoryButton;
	@FindBy(xpath = "//a[contains(text(),'Download login history for last six months, includ')]") WebElement downloadHistory;
	@FindBy(xpath = "//span[@id='DisplayAndLayout_font']") WebElement displayLayoutButton;
	@FindBy(id = "CustomizeTabs_font") WebElement customizeTabLink;
	@FindBy(id = "p4") WebElement customApp;
	@FindBy(id="duel_select_0") WebElement availableTab;
	@FindBy(id="duel_select_0_right") WebElement addButton;
	@FindBy(xpath = "//tbody/tr[1]/td[2]/input[1]") WebElement saveButton;
	@FindBy(id="EmailSetup_font") WebElement emailLink;
	@FindBy(id="EmailSettings_font") WebElement myEmailSetting;
	@FindBy(id="sender_name") WebElement emailName;
	@FindBy(id="sender_email") WebElement emailAddress;
	@FindBy(id="auto_bcc1") WebElement autoBCC;
	@FindBy(xpath = "//input[@title='Save']") WebElement saveClick;
	@FindBy(id="CalendarAndReminders_font") WebElement calenderReminders;
	@FindBy(id="Reminders_font") WebElement reminderFont;
	@FindBy(id="testbtn") WebElement openTestReminder;
	
	public void clickPersonalButton()
	{
		waitUntilVisible(personalButton);
		clickElement(personalButton);
	}
	public void clickLoginHistoryButton()
	{
		waitUntilVisible(LoginHistoryButton);
		clickElement(LoginHistoryButton);
	}
	public void clickDownloadHistory()
	{
		waitUntilVisible(downloadHistory);
		clickElement(downloadHistory);
	}
	public void clickDisplayLayoutButton()
	{
		waitUntilVisible(displayLayoutButton);
		clickElement(displayLayoutButton);
	}
	public void clickCustomizeTabLink()
	{
		waitUntilVisible(customizeTabLink);
		clickElement(customizeTabLink);
	}
	public void selectCustomApp()
	{
		waitUntilVisible(customApp);
		selectByText(customApp, "Salesforce Chatter");
	}
	public void selectAvailableTab()
	{
		waitUntilVisible(availableTab);
		selectByText(availableTab, "Work Orders");
	}
	public void clickAddButton()
	{
		waitUntilVisible(addButton);
		clickElement(addButton);
	}
	public void clickSaveButton()
	{
		waitUntilVisible(saveButton);
		clickElement(saveButton);
	}
	public void clickEmailLink()
	{
		waitUntilVisible(emailLink);
		clickElement(emailLink);
	}
	public void clickmyEmailSetting()
	{
		waitUntilVisible(myEmailSetting);
		clickElement(myEmailSetting);
	}
	public void enterTextIntoEmailName()
	{
		waitUntilVisible(emailName);
		enterText(emailName, "Venee 123");
	}
	public void enterTextIntoEmailAddress()
	{
		waitUntilVisible(emailAddress);
		enterText(emailAddress, "veninitish@gmail.com");
	}
	public void clickautoBCC()
	{
		waitUntilVisible(autoBCC);
		clickElement(autoBCC);
	}
	public void clickSaveClick()
	{
		waitUntilVisible(saveClick);
		clickElement(saveClick);
	}
	public void clickCalenderReminders()
	{
		waitUntilVisible(calenderReminders);
		clickElement(calenderReminders);
	}
	public void clickReminderFont()
	{
		waitUntilVisible(reminderFont);
		clickElement(reminderFont);
	}
	public void clickOpenTestReminder()
	{
		waitUntilVisible(openTestReminder);
		clickElement(openTestReminder);
	}
	public boolean getWindowsSize()
	{
		Set<String> windows=driver.getWindowHandles();
		if(windows.size()>1)
			return true;
		else
		return false;
	}
	

}
