package com.SalesForce.Pages.UserMenuDropdown;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SalesForce.Base.BasePage;

public class DeveloperConsole extends BasePage {

	public DeveloperConsole(WebDriver driver)
	{
		super(driver);
	}
	
	public int developerConsoleWindowHandle()
	{
		 String currentWindow=driver.getWindowHandle();
		  System.out.println(currentWindow);
		  
		  Set<String> windows=driver.getWindowHandles();
		  int size=windows.size();
		  for(String newWindow:windows) { if(!newWindow.equals(currentWindow)) {
		  driver.switchTo().window(newWindow); break; } }
		  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  driver.close();
		  driver.switchTo().window(currentWindow);
		  return size;
	}
	
}
