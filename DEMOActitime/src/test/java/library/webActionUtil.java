package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webActionUtil 
{
	long ETO;
	WebDriver driver;
	WebDriverWait wait;
	
	public webActionUtil(WebDriver driver, long ETO) 
	{
		wait=new WebDriverWait(driver, ETO);
		this.driver=driver;
		this.ETO=ETO;
	}
	
	public void clickOnElement(WebElement target)
	{
		wait.until(ExpectedConditions.elementToBeClickable(target));
		target.click();
	}
	
	public void enterKeys(WebElement target, String Keys)
	{
		wait.until(ExpectedConditions.visibilityOf(target));
		target.clear();
		target.sendKeys(Keys);
	}

}
