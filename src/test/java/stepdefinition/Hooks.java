package stepdefinition;

import static Helper.BaseObjects.*;

import static Helper.BaseVariables.BrowserName;
import static Helper.BaseVariables.FilePath;
import static Helper.BaseVariables.ScenarioID;
import static Helpers.BaseVariables.UserAgent;
import static Helpers.BaseVariables.ContentType;
import static Helpers.BaseVariables.Authorization;
import static Helpers.BaseVariables.API_URL;
import static Helpers.BaseVariables.ContentLength;
import static Helpers.BaseVariables.ConnectionName;
import static Helpers.BaseVariables.Host;
import static Helpers.BaseVariables.Accept;
import java.io.File;
import static Helpers.BaseObject.Post;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Methods.BrowserFactory;
import Methods.CommonMethods;
import Methods.ScreenShotMethod;
import Methods.WebDriverMethod;
import Pages.ACS_AdaniAMD_Admin_XPath;

import Pages.ACS_AdaniAMD_Export_XPath;
import Pages.ACS_AdaniAMD_Import_XPath;
import Pages.ECOM_Outbound;
import Pages.TiffaCreateAWB_XPath;
import Pages.PingCreateAWB_XPath;
import Pages.Login_Screen;
import Pages.NMIAL_Outbound_XPath;
import TestDataOperations.ConfigFileHandler;
import TestDataOperations.POJO;
import TestDataOperations.TestDataReader;
import Utils.BrowserUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import Methods.API_Methods;

import static Helper.Constants.*;


public class Hooks {


	@Before(order=1)
	public void Init(Scenario scenario) throws Throwable {
		System.out.println(" <----------------------- Scenario Start ------------------------->");
		ScenarioID = scenario.getName();
		TestDataReader.initTestDataReader();
		TestDataReader.ReadScenarioDetails();
		
		System.out.println("Scenario ID : " + ScenarioID);
		
		ConfigFileHandler.initConfigFileHandler();
		ConfigFileHandler.getBrowserName();
		
		driver = BrowserUtils.LaunchBrowser(BrowserName);
		System.out.println("enter to url");
//		driver.get(URL);
		driver.get(Ecom_URL);
		System.out.println("out of url");
		wm= new WebDriverMethod(driver);
		cm= new CommonMethods(driver);	
		Export= new ACS_AdaniAMD_Export_XPath(driver);	
		Import= new ACS_AdaniAMD_Import_XPath(driver);	
		Admin= new ACS_AdaniAMD_Admin_XPath(driver);
		Tiffa= new TiffaCreateAWB_XPath(driver);
		Nmial_Outbound= new NMIAL_Outbound_XPath(driver);
		ECOM_Outbound= new ECOM_Outbound(driver);
		Ping= new PingCreateAWB_XPath(driver);
		pojo = new POJO(driver);
	   loginScreen= new Login_Screen(driver);
	   Post = new API_Methods(API_URL, Authorization, ContentType, UserAgent, 
				Accept, Host, ConnectionName, ContentLength);
		//homeScreen= new Home_Screen(driver);
		//exportsScreen= new ExportsPage(driver);
		//importscreen= new ImportsPage(driver);
						
	}
		
	@After(order=1)
	public void TakeAndAttachScreenshot(Scenario sc) throws Throwable
	{
		ConfigFileHandler.initConfigFileHandler();
		FilePath= ConfigFileHandler.getScreenshotPath();
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		sc.attach(screenshot, "image/png", "image");
		File screenshot_with_scenario_name = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		ss = new ScreenShotMethod(driver);
		ss.ReportScreenshot(driver, sc, FilePath);		
		Thread.sleep(2000);		
	//	driver.quit();			
		System.out.println(" <----------------------- Run After the Scenario ------------------------->");
		
	}
	
	@After(order=0)
	public void CloseBrowser()
	{
	//	driver.quit();		
		System.out.println(" <----------------------- Scenario End ------------------------->");
	}
	
	
}
