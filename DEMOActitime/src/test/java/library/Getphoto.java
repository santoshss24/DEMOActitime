package library;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Getphoto 
{
	public static void getPhoto(WebDriver driver)
	{
		LocalDateTime ldt=LocalDateTime.now();
		String date = ldt.toString().replace(":","-");
		
		TakesScreenshot t=(TakesScreenshot) driver;
		File scrFile = t.getScreenshotAs(OutputType.FILE);
		
		File destFile=new File(IAutoConstants.IMG_PATH+date+".png");
		
		try {
			FileUtils.copyFile(scrFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
