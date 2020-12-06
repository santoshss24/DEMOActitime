package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import library.Getphoto;
import library.IAutoConstants;
import library.webActionUtil;
import pages.Homepage;
import pages.LoginPage;

public class Basetest implements IAutoConstants 
{
	WebDriver driver;
	webActionUtil webActionUtil;
	@BeforeClass
	public void lauchApp()
	{
		if (BROWSER_NAME.equalsIgnoreCase("chrome")) {
			
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
		}else if (BROWSER_NAME.equalsIgnoreCase("firefox")) {
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver=new FirefoxDriver();
		}else {
			System.out.println("BrowserNotSupported");
		}
		driver.manage().window().maximize();
		
		long implicit=Long.parseLong(ITO);
		driver.manage().timeouts().implicitlyWait(implicit, TimeUnit.SECONDS);
		
		driver.get(APP_URL);
		long explicit=Long.parseLong(ETO);
		webActionUtil=new webActionUtil(driver, explicit);
	}
	
	@BeforeMethod
	public void Login()
	{
		LoginPage l=new LoginPage(driver, webActionUtil);
		l.login(USERNAME, PASSWORD);
	}
	
	@AfterMethod
	public void logout(ITestResult result)
	{
		if (result.getStatus()==2) {
			Getphoto.getPhoto(driver);
		}
		Homepage homepage=new Homepage(driver, webActionUtil);
		homepage.clickOnLogout();
	}
	
	@AfterClass(enabled = false)
	public void closeApp()
	{
		driver.quit();
	}
	

}
