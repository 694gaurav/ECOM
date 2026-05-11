package Methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.Scenario;

public class ScreenShotMethod {

	
	String ScreenShotFolderPath = null, ScreenShotPath = null, TimeStamp = null;
	String ScreenShotFolder = null, ScreenShotPassedFolder = null, ScreenShotFailedFolder = null;
	String ConfigKeysFile = "Config_Keys.properties";
	
	public CommonMethods cm;
	public WebDriverMethod wm;
	
	public ScreenShotMethod(WebDriver driver) throws Throwable 
	{
		File file = new File(ConfigKeysFile);
		InputStream fis = new FileInputStream(file);
		Properties pf = new Properties();
		pf.load(fis);
	}
	
	public String ScreenShot(WebDriver driver) throws IOException
	{
		try
        {
	  		TimeStamp = new SimpleDateFormat("ddMMMyyyy_HHmmss").format(Calendar.getInstance().getTime());
	  	    ScreenShotPath = ScreenShotFolderPath+"Rembang_"+TimeStamp+".png";
	  	    File screenshots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);       		 
		    FileUtils.copyFile(screenshots, new File(ScreenShotPath));
        }
	  	catch(Exception Ex)
	  	{
	  		System.out.println(Ex.getMessage());       	
	  	}
	  	return ScreenShotPath;
	}
	
	public String ScreenShot(WebDriver driver, String screenshotName, String path) throws IOException
	{
		try
        {
	  		TimeStamp = new SimpleDateFormat("ddMMMyyyy_HHmmss").format(Calendar.getInstance().getTime());
	  	    ScreenShotPath = path+"Canopus_"+screenshotName+"_"+".png";
	  	   
	  	    File screenshots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);       		 
		    FileUtils.copyFile(screenshots, new File(ScreenShotPath));
        }
	  	catch(Exception Ex)
	  	{
	  		System.out.println(Ex.getMessage());       	
	  	}
	  	return ScreenShotPath;
	}
	
	
	public void ReportScreenshot(WebDriver driver, Scenario scenario, String path)
	{
		try
		{
			String screenshotName = scenario.getName().replaceAll(" ", "_"); 
            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            File screenshot_with_scenario_name = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); 
            Collection<String> scenarioTags= scenario.getSourceTagNames();            
	        File screenshots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
            
            if (scenario.isFailed() == false)
            {
            	ScreenShotPath = "Pass_Canopus_"+screenshotName+"_"+".png";
            }
            else
            {
            	ScreenShotPath = "Fail_Canopus_"+screenshotName+"_"+".png";
            }
	  	    
            try
            {
               File destinationPath = new File(path);  
               System.out.println("Screenshot Tag: "+scenarioTags);
               System.out.println("Screenshot Name: " + screenshotName);
		       FileUtils.copyFile(screenshot_with_scenario_name,destinationPath); 
//		       new File(path+screenshotName)
            }
            catch (Exception e) 
            {
                System.out.println("Exception= "+e);
            }

		} 
		catch(Exception Ex)
	  	{
	  		System.out.println(Ex.getMessage());       	
	  	} 
	}

	
	
}
