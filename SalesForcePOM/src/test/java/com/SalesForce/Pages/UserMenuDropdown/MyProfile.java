package com.SalesForce.Pages.UserMenuDropdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SalesForce.Base.BasePage;

public class MyProfile extends BasePage {

	public MyProfile(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//a[@class='contactInfoLaunch editLink']//img[@title='Edit Profile']") WebElement editButton;
	@FindBy(xpath = "//a[contains(text(),'About')]") WebElement aboutButton;
	@FindBy(id = "lastName") WebElement lastName;
	@FindBy(xpath = "//input[@value='Save All']") WebElement saveAllButton;
	@FindBy(xpath = "//tbody/tr[1]/td[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/span[1]") WebElement postLink;
	@FindBy(xpath = "//iframe[@title='Rich Text Editor, publisherRichTextEditor']") WebElement postIframe;
	@FindBy(xpath = "/html[1]/body[1]") WebElement postEditor;
	@FindBy(xpath = "//input[@id='publishersharebutton']") WebElement publisherShareButton;
	@FindBy(id = "publisherAttachContentPost") WebElement fileLink;
	@FindBy(id = "chatterUploadFileAction") WebElement uploadLink;
	@FindBy(id = "chatterFile") WebElement chooseFileButton;
	@FindBy(xpath = "//tbody/tr[1]/td[1]/div[1]/div[2]/div[1]/span[2]/img[1]") WebElement imgMouseOver;
	@FindBy(id = "uploadLink") WebElement addPhotoLink;
	@FindBy(id = "j_id0:uploadFileForm:uploadInputFile") WebElement chooseFile;
	@FindBy(id = "j_id0:uploadFileForm:uploadBtn") WebElement saveButton1;
	@FindBy(id = "j_id0:j_id7:save") WebElement saveButton2;
	
	
	public void clickEditButton() throws InterruptedException
	{
		waitUntilVisible(editButton);
		clickElement(editButton);
		Thread.sleep(3000);
	}
	
	public void switchFrameContactInfo()
	{
		driver.switchTo().frame("contactInfoContentId");
	}
	
	public void clickaboutButton() throws InterruptedException
	{
		waitUntilVisible(aboutButton);
		clickElement(aboutButton);
		Thread.sleep(3000);
	}
	public void enterIntoLastname()
	{
		waitUntilVisible(lastName);
		clearElement(lastName);
		enterText(lastName, "Shan1");
	}
	public void clickSaveAllButton()
	{
		waitUntilVisible(saveAllButton);
		clickElement(saveAllButton);
	}
	public void switchToDefaultContent1()
	{
		driver.switchTo().defaultContent();
	}
	public void clickPostLink()
	{
		waitUntilVisible(postLink);
		clickElement(postLink);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void switchToPostIFrame() throws InterruptedException
	{
		driver.switchTo().frame(postIframe);
		Thread.sleep(5000);
	}
	public void enterIntoPostEditor()
	{
		enterText(postEditor, "Testing Posting POM");
	}
	
	
	public void switchToDefaultContent2()
	{
		driver.switchTo().defaultContent();
	}
	
	public void clickPublishShareButton()
	{
		waitUntilVisible(publisherShareButton);
		clickElement(publisherShareButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickFileLink()
	{
		waitUntilVisible(fileLink);
		clickElement(fileLink);
	}
	public void clickuploadLink()
	{
		waitUntilVisible(uploadLink);
		clickElement(uploadLink);
	}
	
	public void sendKeysToChoosefileButton()
	{
		waitUntilVisible(chooseFileButton);
		enterText(chooseFileButton, "C:\\\\Users\\\\User\\\\Downloads\\\\camera.jpg");
	}
	public void mouseOverImage()
	{
		waitUntilVisible(imgMouseOver);
		mouseOver(imgMouseOver);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void addPhotoLink()
	{
		waitUntilVisible(addPhotoLink);
		clickElement(addPhotoLink);
	}
		
	public void switchFramePhotoContentId()
	{
		driver.switchTo().frame("uploadPhotoContentId");
	}
	public void sendKeysToChoosefile()
	{
		waitUntilVisible(chooseFile);
		enterText(chooseFile, "C:\\Users\\User\\Downloads\\tiger.jpg");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void clickSaveButton1()
	{
		waitUntilVisible(saveButton1);
		clickElement(saveButton1);
	}
	public void clickSaveButton2()
	{
		waitUntilVisible(saveButton2);
		clickElement(saveButton2);
	}
	

}
