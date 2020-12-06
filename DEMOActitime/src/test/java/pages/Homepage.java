package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Basepage
{
	@FindBy(id = "logoutLink")
	private WebElement logoutLink;
	
	@FindBy(xpath = "(//div[text()='Calls'])[1]")
	private WebElement task;
	
	@FindBy(xpath = "//div[text()='ACTIONS']")
	private WebElement actionDropDown;
	
	@FindBy(xpath = "//div[text()='Copy to']")
	private WebElement copyToButton;
	
	@FindBy(xpath = "//div[text()='- Select Customer -']")
	private WebElement selectCustomerDropdown;
	
	@FindBy(xpath = "//div[text()='Big Bang Company']")
	private WebElement selectCustomer;
	
	@FindBy(xpath = "//div[text()='- Select Project -']")
	private WebElement selectProjectDropDown;
	
	@FindBy(xpath = "//div[text()='Flight operations']")
	private WebElement selectProject;
	
	@FindBy(xpath = "//div[text()='Copy']")
	private WebElement copyTaskToButton;

	public Homepage(WebDriver driver, library.webActionUtil webActionUtil) {
		super(driver, webActionUtil);
		
	}
	
	public void clickOnLogout()
	{
		webActionUtil.clickOnElement(logoutLink);
	}
	
	public void clickOnTask()
	{
		webActionUtil.clickOnElement(task);
	}
	
	public void copyTaskTo()
	{
		webActionUtil.clickOnElement(actionDropDown);
		webActionUtil.clickOnElement(copyToButton);
	}
	
	public void selectCustomer()
	{
		webActionUtil.clickOnElement(selectCustomerDropdown);
		webActionUtil.clickOnElement(selectCustomer);
	}
	
	public void selectProject()
	{
		webActionUtil.clickOnElement(selectProjectDropDown);
		webActionUtil.clickOnElement(selectProject);
	}
	
	public void clickOnCopyTask()
	{
		webActionUtil.clickOnElement(copyTaskToButton);
	}

}
