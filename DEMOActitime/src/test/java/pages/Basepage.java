package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import library.webActionUtil;

public class Basepage 
{
	public WebDriver driver;
	public webActionUtil webActionUtil;
	public Basepage(WebDriver driver, webActionUtil webActionUtil) {
	
		this.driver=driver;
		this.webActionUtil=webActionUtil;
		PageFactory.initElements(driver, this);
	}

}
