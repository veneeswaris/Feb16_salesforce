package com.SalesForce.Pages.Accounts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SalesForce.Base.BasePage;

public class EditAccViewPage extends BasePage {

	public EditAccViewPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="fcf") WebElement viewDropdown;
	@FindBy(linkText="Edit") WebElement editLink;
	@FindBy(id="fname") WebElement viewName;
	@FindBy(id="fcol1") WebElement fieldDropdown;
	@FindBy(id="fop1") WebElement operatorButton;
	@FindBy(id="fval1") WebElement valueButton;
	@FindBy(id="colselector_select_0") WebElement availableFields;
	@FindBy(id="colselector_select_0_right") WebElement addButton;
	@FindBy(xpath="//input[@value=' Save ']") WebElement saveButton;
	
	public void selectViewName()
	{
		waitUntilVisible(viewDropdown);
		selectByText(viewDropdown, "viewNameVeni1");
	}
	public void clickEditLink()
	{
		waitUntilVisible(editLink);
		clickElement(editLink);
	}
	public void enterTextIntoViewName()
	{
		waitUntilVisible(viewName);
		enterText(viewName, "view name editingPOM1");
	}
	public void selectfieldDropdown()
	{
		waitUntilVisible(fieldDropdown);
		selectByText(fieldDropdown, "Account Name");
	}
	public void selectoperatorButton()
	{
		waitUntilVisible(operatorButton);
		selectByText(operatorButton, "contains");
	}
	public void enterTextIntovalueButton()
	{
		waitUntilVisible(valueButton);
		enterText(valueButton, "a");
	}
	public void selectAvailableFields()
	{
		waitUntilVisible(availableFields);
		selectByText(availableFields, "Last Activity");
	}
	public void clickAddButton()
	{
		waitUntilVisible(addButton);
		clickElement(addButton);
	}
	public void clicksaveButton()
	{
		waitUntilVisible(saveButton);
		clickElement(saveButton);
	}
	

}
