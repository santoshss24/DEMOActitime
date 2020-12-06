package testcases;

import org.testng.annotations.Test;

import pages.Homepage;

public class TC001 extends Basetest 
{
	@Test
	public void addTask()
	{
		Homepage homepage=new Homepage(driver, webActionUtil);
		homepage.clickOnTask();
		homepage.copyTaskTo();
		homepage.selectCustomer();
		homepage.selectProject();
		homepage.clickOnCopyTask();
		
	}

}
