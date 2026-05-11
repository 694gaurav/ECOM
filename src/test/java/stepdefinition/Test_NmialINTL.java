package stepdefinition;

import Pages.ACS_GHA_XPath;
import TestDataOperations.TestDataReader;
import Utils.BrowserUtils;
import static Helper.BaseObjects.*;
import static Helper.BaseVariables.BrowserName;
import static Helper.BaseVariables.Entity;
import static Helper.BaseVariables.Password;
import static Helper.BaseVariables.Username;
import static Helper.Constants.*;
import static Helper.Constants.URL_GHA;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_NmialINTL {
	Actions a= new Actions(driver);
    String flight="6e"+wm.RandomNo(4);
    String flightNo= flight;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	
	@When("launch browser for GHA application and login with {string} INTL GHA user given in {string} sheet for Export module")
	public void launch_browser_for_gha_application_and_login_with_intl_gha_user_given_in_sheet_for_export_module(String entity, String sheetName) throws Throwable {
		String URL_GHA= "https://galaxycmsuat.adani.com/NMIINTL/Login.aspx";

		((JavascriptExecutor) driver).executeScript("window.open('" + URL_GHA + "', '_blank');");    

        for (String handle : driver.getWindowHandles()) {
        driver.switchTo().window(handle);}
        
		Entity = entity;
		TestDataReader.ReadLoginDetails(Entity);
		Thread.sleep(500);
		System.out.println("usr= " + Username);
		System.out.println("pwd= " + Password);
		// loginScreen.isLoginScreenDisplayed();
		
		loginScreen.GHA_Login(entity, Username, Password);
		Thread.sleep(8000);

	}
	
	@When("click on Imports>> Import Manifest and enter created {string} Flight of INTL GHA")
	public void click_on_imports_import_manifest_and_enter_created_flight_of_intl_gha(String value) throws Throwable {
		 wait.until(ExpectedConditions.numberOfWindowsToBe(2));


	    Nmial_Outbound.Imports_Tab.click();
	    Thread.sleep(3000);

	    Nmial_Outbound.ImportManifest_Tab.click();
	    Thread.sleep(3000);
	      
	    String awbFlightPfx= "6E";
//	    String awbFlight= flightNo.substring(2);

  wait.until(ExpectedConditions.numberOfWindowsToBe(2));

  driver.switchTo().frame(Nmial_Outbound.PageFrame);
	    Thread.sleep(3000);

	    Nmial_Outbound.FlightPfx_Tb.sendKeys(awbFlightPfx, Keys.TAB);
	    Thread.sleep(3000);	  	    
  Nmial_Outbound.CreatedFlightNo_Tb.sendKeys(value, Keys.TAB);
	    Thread.sleep(3000);        
	    Nmial_Outbound.FlightPopup_Icon.click();
	    String p= driver.getWindowHandle();
		Set<String> s= driver.getWindowHandles();
		Iterator<String> I= s.iterator();
		Object[] windowHandles= driver.getWindowHandles().toArray();
		driver.switchTo().window((String) windowHandles[2]);
		System.out.println(driver.getTitle());
		
//		int x= driver.manage().window().getPosition().getX();
//		int y= driver.manage().window().getPosition().getY();
//		Point p1= driver.manage().window().getPosition();
//		
//		int x1= p1.getX(), y1= p1.getY();	
//		System.out.println("x= "+x1+"\t"+"y= "+y1);
		Thread.sleep(8000);
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.FlightsPopup_Hyperlink, 30);
	    Nmial_Outbound.FlightsPopup_Hyperlink.get(0).click();
		Thread.sleep(8000);
	driver.switchTo().window((String) windowHandles[1]);
		Thread.sleep(3000);

	driver.switchTo().defaultContent();
		Thread.sleep(3000);
  driver.switchTo().frame(Nmial_Outbound.PageFrame);
	    Thread.sleep(3000); 

	}
	
	@When("click on ULD and add Consol and Direct shipment AWB details in INTL GHA")
	public void click_on_uld_and_add_consol_and_direct_shipment_awb_details_in_intl_gha() throws Throwable {
		Nmial_Outbound.UldNo_Hyperlink.click();
	    Thread.sleep(3000);	
	    String p= driver.getWindowHandle();
		Set<String> s= driver.getWindowHandles();
		Iterator<String> I= s.iterator();
		Object[] windowHandles= driver.getWindowHandles().toArray();
		driver.switchTo().window((String) windowHandles[2]);
		System.out.println(driver.getTitle());
		
		int x= driver.manage().window().getPosition().getX();
		int y= driver.manage().window().getPosition().getY();
		Point p1= driver.manage().window().getPosition();
		
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.Pfx1_Tb, 30);
	    Nmial_Outbound.Pfx1_Tb.sendKeys("312", Keys.TAB);
	    Thread.sleep(3000);	 
	    Nmial_Outbound.Awb1_Tb.sendKeys(wm.Random_awbNo(), Keys.END);
	    Thread.sleep(8000);	 
	    Nmial_Outbound.Origin1_Tb.sendKeys("SAN", Keys.TAB);
	    Thread.sleep(8000);	 
	    Nmial_Outbound.ConsolShipment_Cb.click();

		Nmial_Outbound.NatureOfGoods1_Tb.sendKeys("gen", Keys.END);
	    Thread.sleep(8000);
        Nmial_Outbound.ManifestedNPX1_Tb.sendKeys("10", Keys.TAB);
        Nmial_Outbound.ManifestedWtExp1_Tb.sendKeys("100", Keys.TAB);
        Nmial_Outbound.DeclaredChWt1_Tb.sendKeys("100", Keys.TAB);
        Nmial_Outbound.ConsigneeCode1_Tb.sendKeys("EDS", Keys.TAB);
	    Thread.sleep(8000);
	    
        Nmial_Outbound.AddAwb2_Icon.click();
	    Thread.sleep(8000);
	    
	    Nmial_Outbound.Pfx2_Tb.sendKeys("312", Keys.TAB);
	    Thread.sleep(3000);	 
	    Nmial_Outbound.Awb2_Tb.sendKeys(wm.Random_awbNo(), Keys.END);
	    Thread.sleep(3000);	 
	    Nmial_Outbound.Origin2_Tb.sendKeys("SAN", Keys.END);
	    Thread.sleep(3000);	 

	    Nmial_Outbound.CommodityCode2_Tb.sendKeys("222", Keys.TAB);

    	Nmial_Outbound.NatureOfGoods2_Tb.sendKeys("gen", Keys.END);
	    Thread.sleep(8000);
        Nmial_Outbound.ManifestedNPX2_Tb.sendKeys("10", Keys.TAB);
        Nmial_Outbound.ManifestedWtExp2_Tb.sendKeys("100", Keys.TAB);
        Nmial_Outbound.DeclaredChWt2_Tb.sendKeys("100", Keys.TAB);
        Nmial_Outbound.ConsigneeCode2_Tb.sendKeys("EDS", Keys.TAB);
	    Thread.sleep(8000);

	    Nmial_Outbound.AwbSaveClose_Btn.click();
	    Thread.sleep(8000); 

	    Nmial_Outbound.AwbSaveClose_Btn.click();
	    Thread.sleep(8000); 
	    // Now handle the alert in that popup window
	           wait.until(ExpectedConditions.alertIsPresent());
	           Alert alert = driver.switchTo().alert();
	           alert.accept();   // Clicks OK / Accept
	   	    Thread.sleep(8000); 

	    Nmial_Outbound.Close_Btn.click();
	    Thread.sleep(8000); 
		driver.switchTo().window((String) windowHandles[1]);
	    Thread.sleep(8000); 	         

	}

	@When("enter Custom IGM, enter {string} ATA date time of INTL")
	public void enter_custom_igm_enter_ata_date_time_of_intl(String value) throws Throwable {
		Nmial_Outbound.CustomIGM_Tb.sendKeys(wm.RandomNo(7), Keys.TAB);
	    Thread.sleep(3000); 
	   Nmial_Outbound.ATA_Date_Tb.sendKeys(wm.CurrentDate("dd/MM/yyyy"), Keys.TAB);
	    Thread.sleep(3000); 
	   Nmial_Outbound.ATA_Time_Tb.sendKeys(value, Keys.END);
	    Thread.sleep(3000); 
	    Nmial_Outbound.RecordATA_Btn.click();
	    Thread.sleep(30000); 

	}
	
	@When("enter {string} with {string} Flight of INTL GHA")
	public void enter_with_flight_of_intl_gha(String value1, String value2) throws Throwable {
		
	}

	@When("clicked on Consol shipment icon of INTL GHA")
	public void clicked_on_consol_shipment_icon_of_intl_gha() throws Throwable {
	    Nmial_Outbound.ConsolShipment_Icon.click();
	    Thread.sleep(3000); 
		 wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		    String p= driver.getWindowHandle();
			Set<String> s= driver.getWindowHandles();
			Iterator<String> I= s.iterator();
			Object[] windowHandles= driver.getWindowHandles().toArray();
			driver.switchTo().window((String) windowHandles[2]);
			System.out.println(driver.getTitle());
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.HAWB1_Tb, 30);


	}
	
	@When("enter HAWB details of INTL GHA")
	public void enter_hawb_details_of_intl_gha() throws Throwable {
		 String p= driver.getWindowHandle();
			Set<String> s= driver.getWindowHandles();
			Iterator<String> I= s.iterator();
			Object[] windowHandles= driver.getWindowHandles().toArray();
			
		
		Nmial_Outbound.HAWB1_Tb.sendKeys("H101", Keys.TAB);
	    Thread.sleep(3000);	 
	    Nmial_Outbound.Origin1_Tb.sendKeys("SAN", Keys.TAB);
	    Thread.sleep(8000);	
	    Nmial_Outbound.Dest1_Tb.sendKeys("NMI", Keys.TAB);
	    Thread.sleep(8000);	

	    Nmial_Outbound.CommodityCode1_Tb.sendKeys("9990", Keys.TAB);
	    Thread.sleep(3000);	 

//		Nmial_Outbound.Commodity1_Hyperlink.sendKeys(Keys.CONTROL+"A", Keys.CONTROL+"C");
//	    Thread.sleep(8000);
		Nmial_Outbound.NatureOfGoods1_Tb.sendKeys("gen", Keys.END);
	    Thread.sleep(8000);
        Nmial_Outbound.HawbManifestedNPX1_Tb.sendKeys("6", Keys.TAB);
        Nmial_Outbound.HawbManifestedWtExp1_Tb.sendKeys("60", Keys.TAB);
        Nmial_Outbound.HawbDeclaredChWt1_Tb.sendKeys("60", Keys.TAB);
        Nmial_Outbound.ConsigneeCode1_Tb.sendKeys("EDS", Keys.TAB);
	    Thread.sleep(8000);
        Nmial_Outbound.AddAwb2_Icon.click();
	    Thread.sleep(8000);
	    
	    Nmial_Outbound.HAWB2_Tb.sendKeys("H102", Keys.TAB);
	    Thread.sleep(3000);	 
	    Nmial_Outbound.Origin2_Tb.sendKeys("SAN", Keys.END);
	    Thread.sleep(3000);	
	    Nmial_Outbound.Dest2_Tb.sendKeys("NMI", Keys.TAB);
	    Thread.sleep(8000);	
	    Nmial_Outbound.CommodityCode2_Tb.sendKeys("9990", Keys.TAB);
	    Thread.sleep(3000);	 
		Nmial_Outbound.NatureOfGoods2_Tb.sendKeys("gen", Keys.END);
	    Thread.sleep(8000);
        Nmial_Outbound.HawbManifestedNPX2_Tb.sendKeys("4", Keys.TAB);
        Nmial_Outbound.HawbManifestedWtExp2_Tb.sendKeys("40", Keys.TAB);
        Nmial_Outbound.HawbDeclaredChWt2_Tb.sendKeys("40", Keys.TAB);
        Nmial_Outbound.ConsigneeCode2_Tb.sendKeys("EDS", Keys.TAB);
	    Thread.sleep(8000);
        Nmial_Outbound.AddAwb3_Icon.click();
	    Thread.sleep(8000);
	    
	    Nmial_Outbound.HAWB3_Tb.sendKeys("H103", Keys.TAB);
	    Thread.sleep(3000);	 
	    Nmial_Outbound.Orgn3_Tb.sendKeys("SAN", Keys.END);
	    Thread.sleep(3000);	
	    Nmial_Outbound.Destn3_Tb.sendKeys("NMI", Keys.TAB);
	    Thread.sleep(8000);	
	    Nmial_Outbound.Consol_CommodityCode3_Tb.sendKeys("9990", Keys.TAB);
	    Thread.sleep(3000);	 
		Nmial_Outbound.Consol_NatureOfGoods3_Tb.sendKeys("gen", Keys.END);
	    Thread.sleep(8000);
        Nmial_Outbound.Consol_ManifestedNPX3_Tb.sendKeys("4", Keys.TAB);
        Nmial_Outbound.Consol_ManifestedWtExp3_Tb.sendKeys("40", Keys.TAB);
        Nmial_Outbound.Consol_DeclaredChWt3_Tb.sendKeys("40", Keys.TAB);
        Nmial_Outbound.Consol_ConsigneeCode3_Tb.sendKeys("EDS", Keys.TAB);
	    Thread.sleep(8000);
        Nmial_Outbound.AddAwb4_Icon.click();
	    Thread.sleep(8000);
	    
	    Nmial_Outbound.SelectHawb1_Cb.click();
	    Thread.sleep(8000);
	    Nmial_Outbound.SelectHawb2_Cb.click();
	    Thread.sleep(8000);

	    Nmial_Outbound.AwbSaveClose_Btn.click();
	    Thread.sleep(8000); 
	    // handle the alert in popup
	           wait.until(ExpectedConditions.alertIsPresent());
	           Alert alert = driver.switchTo().alert();
	           alert.accept();   // Clicks OK / Accept
	   	    Thread.sleep(8000); 

	    Nmial_Outbound.Close_Btn.click();
	    Thread.sleep(8000); 
		driver.switchTo().window((String) windowHandles[1]);
	    Thread.sleep(8000); 
	
	}
	
	@When("enter {int} HAWB details of INTL GHA")
	public void enter_hawb_details_of_intl_gha(Integer row) throws Throwable {
		 String p= driver.getWindowHandle();
			Set<String> s= driver.getWindowHandles();
			Iterator<String> I= s.iterator();
			Object[] windowHandles= driver.getWindowHandles().toArray();
			
		
		Nmial_Outbound.HAWB1_Tb.sendKeys("H101", Keys.TAB);
	    Thread.sleep(3000);	 
	    Nmial_Outbound.Origin1_Tb.sendKeys("SAN", Keys.TAB);
	    Thread.sleep(8000);	
	    Nmial_Outbound.Dest1_Tb.sendKeys("NMI", Keys.TAB);
	    Thread.sleep(8000);	

	    Nmial_Outbound.CommodityCode1_Tb.sendKeys("9990", Keys.TAB);
	    Thread.sleep(3000);	 

//		Nmial_Outbound.Commodity1_Hyperlink.sendKeys(Keys.CONTROL+"A", Keys.CONTROL+"C");
//	    Thread.sleep(8000);
		Nmial_Outbound.NatureOfGoods1_Tb.sendKeys("gen", Keys.END);
	    Thread.sleep(8000);
     Nmial_Outbound.HawbManifestedNPX1_Tb.sendKeys("6", Keys.TAB);
     Nmial_Outbound.HawbManifestedWtExp1_Tb.sendKeys("60", Keys.TAB);
     Nmial_Outbound.HawbDeclaredChWt1_Tb.sendKeys("60", Keys.TAB);
     Nmial_Outbound.ConsigneeCode1_Tb.sendKeys("EDS", Keys.TAB);
	    Thread.sleep(8000);
     Nmial_Outbound.AddAwb2_Icon.click();
	    Thread.sleep(8000);
	    
	    Nmial_Outbound.HAWB2_Tb.sendKeys("H102", Keys.TAB);
	    Thread.sleep(3000);	 
	    Nmial_Outbound.Origin2_Tb.sendKeys("SAN", Keys.END);
	    Thread.sleep(3000);	
	    Nmial_Outbound.Dest2_Tb.sendKeys("NMI", Keys.TAB);
	    Thread.sleep(8000);	
	    Nmial_Outbound.CommodityCode2_Tb.sendKeys("9990", Keys.TAB);
	    Thread.sleep(3000);	 
		Nmial_Outbound.NatureOfGoods2_Tb.sendKeys("gen", Keys.END);
	    Thread.sleep(8000);
     Nmial_Outbound.HawbManifestedNPX2_Tb.sendKeys("4", Keys.TAB);
     Nmial_Outbound.HawbManifestedWtExp2_Tb.sendKeys("40", Keys.TAB);
     Nmial_Outbound.HawbDeclaredChWt2_Tb.sendKeys("40", Keys.TAB);
     Nmial_Outbound.ConsigneeCode2_Tb.sendKeys("EDS", Keys.TAB);
	    Thread.sleep(8000);
     Nmial_Outbound.Consol_AddAwb4_Icon.click();
	    Thread.sleep(8000);
	    
	    Nmial_Outbound.HAWB3_Tb.sendKeys("H103", Keys.TAB);
	    Thread.sleep(3000);	 
	    Nmial_Outbound.Orgn3_Tb.sendKeys("SAN", Keys.END);
	    Thread.sleep(3000);	
	    Nmial_Outbound.Destn3_Tb.sendKeys("NMI", Keys.TAB);
	    Thread.sleep(8000);	
	    Nmial_Outbound.Consol_CommodityCode3_Tb.sendKeys("9990", Keys.TAB);
	    Thread.sleep(3000);	 
		Nmial_Outbound.Consol_NatureOfGoods3_Tb.sendKeys("gen", Keys.END);
	    Thread.sleep(8000);
     Nmial_Outbound.Consol_ManifestedNPX3_Tb.sendKeys("4", Keys.TAB);
     Nmial_Outbound.Consol_ManifestedWtExp3_Tb.sendKeys("40", Keys.TAB);
     Nmial_Outbound.Consol_DeclaredChWt3_Tb.sendKeys("40", Keys.TAB);
     Nmial_Outbound.Consol_ConsigneeCode3_Tb.sendKeys("EDS", Keys.TAB);
	    Thread.sleep(8000);
     Nmial_Outbound.Consol_AddAwb4_Icon.click();
	    Thread.sleep(8000);
	    
	    Nmial_Outbound.HAWB4_Tb.sendKeys("H104", Keys.TAB);
	    Thread.sleep(3000);	 
	    Nmial_Outbound.Orgn4_Tb.sendKeys("SAN", Keys.END);
	    Thread.sleep(3000);	
	    Nmial_Outbound.Destn4_Tb.sendKeys("NMI", Keys.TAB);
	    Thread.sleep(8000);	
	    Nmial_Outbound.Consol_CommodityCode4_Tb.sendKeys("9990", Keys.TAB);
	    Thread.sleep(3000);	 
		Nmial_Outbound.Consol_NatureOfGoods4_Tb.sendKeys("gen", Keys.END);
	    Thread.sleep(8000);
     Nmial_Outbound.Consol_ManifestedNPX4_Tb.sendKeys("4", Keys.TAB);
     Nmial_Outbound.Consol_ManifestedWtExp4_Tb.sendKeys("40", Keys.TAB);
     Nmial_Outbound.Consol_DeclaredChWt4_Tb.sendKeys("40", Keys.TAB);
     Nmial_Outbound.Consol_ConsigneeCode3_Tb.sendKeys("EDS", Keys.TAB);
	    Thread.sleep(8000);
     Nmial_Outbound.Consol_AddAwb5_Icon.click();
	    Thread.sleep(8000);
	       
	    Nmial_Outbound.HAWB5_Tb.sendKeys("H105", Keys.TAB);
	    Thread.sleep(3000);	 
	    Nmial_Outbound.Orgn5_Tb.sendKeys("SAN", Keys.END);
	    Thread.sleep(3000);	
	    Nmial_Outbound.Destn5_Tb.sendKeys("NMI", Keys.TAB);
	    Thread.sleep(8000);	
	    Nmial_Outbound.Consol_CommodityCode5_Tb.sendKeys("9990", Keys.TAB);
	    Thread.sleep(3000);	 
		Nmial_Outbound.Consol_NatureOfGoods5_Tb.sendKeys("gen", Keys.END);
	    Thread.sleep(8000);
     Nmial_Outbound.Consol_ManifestedNPX5_Tb.sendKeys("4", Keys.TAB);
     Nmial_Outbound.Consol_ManifestedWtExp5_Tb.sendKeys("40", Keys.TAB);
     Nmial_Outbound.Consol_DeclaredChWt5_Tb.sendKeys("40", Keys.TAB);
     Nmial_Outbound.Consol_ConsigneeCode5_Tb.sendKeys("EDS", Keys.TAB);
	    Thread.sleep(8000);
     Nmial_Outbound.Consol_AddAwb6_Icon.click();
	    Thread.sleep(8000);
	    
	    Nmial_Outbound.HAWB6_Tb.sendKeys("H106", Keys.TAB);
	    Thread.sleep(3000);	 
	    Nmial_Outbound.Orgn6_Tb.sendKeys("SAN", Keys.END);
	    Thread.sleep(3000);	
	    Nmial_Outbound.Destn6_Tb.sendKeys("NMI", Keys.TAB);
	    Thread.sleep(8000);	
	    Nmial_Outbound.Consol_CommodityCode6_Tb.sendKeys("9990", Keys.TAB);
	    Thread.sleep(3000);	 
		Nmial_Outbound.Consol_NatureOfGoods6_Tb.sendKeys("gen", Keys.END);
	    Thread.sleep(8000);
     Nmial_Outbound.Consol_ManifestedNPX6_Tb.sendKeys("4", Keys.TAB);
     Nmial_Outbound.Consol_ManifestedWtExp6_Tb.sendKeys("40", Keys.TAB);
     Nmial_Outbound.Consol_DeclaredChWt6_Tb.sendKeys("40", Keys.TAB);
     Nmial_Outbound.Consol_ConsigneeCode6_Tb.sendKeys("EDS", Keys.TAB);
	    Thread.sleep(8000);
     Nmial_Outbound.Consol_AddAwb7_Icon.click();
	    Thread.sleep(8000);
	       
	    Nmial_Outbound.HAWB7_Tb.sendKeys("H107", Keys.TAB);
	    Thread.sleep(3000);	 
	    Nmial_Outbound.Orgn7_Tb.sendKeys("SAN", Keys.END);
	    Thread.sleep(3000);	
	    Nmial_Outbound.Destn7_Tb.sendKeys("NMI", Keys.TAB);
	    Thread.sleep(8000);	
	    Nmial_Outbound.Consol_CommodityCode7_Tb.sendKeys("9990", Keys.TAB);
	    Thread.sleep(3000);	 
		Nmial_Outbound.Consol_NatureOfGoods7_Tb.sendKeys("gen", Keys.END);
	    Thread.sleep(8000);
     Nmial_Outbound.Consol_ManifestedNPX7_Tb.sendKeys("4", Keys.TAB);
     Nmial_Outbound.Consol_ManifestedWtExp7_Tb.sendKeys("40", Keys.TAB);
     Nmial_Outbound.Consol_DeclaredChWt7_Tb.sendKeys("40", Keys.TAB);
     Nmial_Outbound.Consol_ConsigneeCode7_Tb.sendKeys("EDS", Keys.TAB);
	    Thread.sleep(8000);
     Nmial_Outbound.Consol_AddAwb8_Icon.click();
	    Thread.sleep(8000);
	    
	    Nmial_Outbound.HAWB8_Tb.sendKeys("H108", Keys.TAB);
	    Thread.sleep(3000);	 
	    Nmial_Outbound.Orgn8_Tb.sendKeys("SAN", Keys.END);
	    Thread.sleep(3000);	
	    Nmial_Outbound.Destn8_Tb.sendKeys("NMI", Keys.TAB);
	    Thread.sleep(8000);	
	    Nmial_Outbound.Consol_CommodityCode8_Tb.sendKeys("9990", Keys.TAB);
	    Thread.sleep(3000);	 
		Nmial_Outbound.Consol_NatureOfGoods8_Tb.sendKeys("gen", Keys.END);
	    Thread.sleep(8000);
     Nmial_Outbound.Consol_ManifestedNPX8_Tb.sendKeys("4", Keys.TAB);
     Nmial_Outbound.Consol_ManifestedWtExp8_Tb.sendKeys("40", Keys.TAB);
     Nmial_Outbound.Consol_DeclaredChWt8_Tb.sendKeys("40", Keys.TAB);
     Nmial_Outbound.Consol_ConsigneeCode8_Tb.sendKeys("EDS", Keys.TAB);
	    Thread.sleep(8000);
     Nmial_Outbound.Consol_AddAwb9_Icon.click();
	    Thread.sleep(8000);
	    
	    
	    Nmial_Outbound.HAWB9_Tb.sendKeys("H109", Keys.TAB);
	    Thread.sleep(3000);	 
	    Nmial_Outbound.Orgn9_Tb.sendKeys("SAN", Keys.END);
	    Thread.sleep(3000);	
	    Nmial_Outbound.Destn9_Tb.sendKeys("NMI", Keys.TAB);
	    Thread.sleep(8000);	
	    Nmial_Outbound.Consol_CommodityCode9_Tb.sendKeys("9990", Keys.TAB);
	    Thread.sleep(3000);	 
		Nmial_Outbound.Consol_NatureOfGoods9_Tb.sendKeys("gen", Keys.END);
	    Thread.sleep(8000);
     Nmial_Outbound.Consol_ManifestedNPX9_Tb.sendKeys("4", Keys.TAB);
     Nmial_Outbound.Consol_ManifestedWtExp9_Tb.sendKeys("40", Keys.TAB);
     Nmial_Outbound.Consol_DeclaredChWt9_Tb.sendKeys("40", Keys.TAB);
     Nmial_Outbound.Consol_ConsigneeCode9_Tb.sendKeys("EDS", Keys.TAB);
	    Thread.sleep(8000);
     Nmial_Outbound.Consol_AddAwb10_Icon.click();
	    Thread.sleep(8000);
	       
	    Nmial_Outbound.HAWB10_Tb.sendKeys("H110", Keys.TAB);
	    Thread.sleep(3000);	 
	    Nmial_Outbound.Orgn10_Tb.sendKeys("SAN", Keys.END);
	    Thread.sleep(3000);	
	    Nmial_Outbound.Destn10_Tb.sendKeys("NMI", Keys.TAB);
	    Thread.sleep(8000);	
	    Nmial_Outbound.Consol_CommodityCode10_Tb.sendKeys("9990", Keys.TAB);
	    Thread.sleep(3000);	 
		Nmial_Outbound.Consol_NatureOfGoods10_Tb.sendKeys("gen", Keys.END);
	    Thread.sleep(8000);
     Nmial_Outbound.Consol_ManifestedNPX10_Tb.sendKeys("4", Keys.TAB);
     Nmial_Outbound.Consol_ManifestedWtExp10_Tb.sendKeys("40", Keys.TAB);
     Nmial_Outbound.Consol_DeclaredChWt10_Tb.sendKeys("40", Keys.TAB);
     Nmial_Outbound.Consol_ConsigneeCode10_Tb.sendKeys("EDS", Keys.TAB);
	    Thread.sleep(8000);
	    
	    Nmial_Outbound.SelectHawb1_Cb.click();
	    Thread.sleep(8000);
	    Nmial_Outbound.SelectHawb2_Cb.click();
	    Thread.sleep(8000);
	    Nmial_Outbound.SelectHawb3_Cb.click();
	    Thread.sleep(8000);
	    Nmial_Outbound.SelectHawb4_Cb.click();
	    Thread.sleep(8000);
	    Nmial_Outbound.SelectHawb5_Cb.click();
	    Thread.sleep(8000);
	    Nmial_Outbound.SelectHawb6_Cb.click();
	    Thread.sleep(8000);
	    Nmial_Outbound.SelectHawb7_Cb.click();
	    Thread.sleep(8000);
	    Nmial_Outbound.SelectHawb8_Cb.click();
	    Thread.sleep(8000);
	    Nmial_Outbound.SelectHawb9_Cb.click();
	    Thread.sleep(8000);
	    Nmial_Outbound.SelectHawb10_Cb.click();
	    Thread.sleep(8000);    
	    
	    
	    Nmial_Outbound.AwbSaveClose_Btn.click();
	    Thread.sleep(8000); 
	    // handle the alert in popup
	           wait.until(ExpectedConditions.alertIsPresent());
	           Alert alert = driver.switchTo().alert();
	           alert.accept();   // Clicks OK / Accept
	   	    Thread.sleep(8000); 

	    Nmial_Outbound.Close_Btn.click();
	    Thread.sleep(8000); 
		driver.switchTo().window((String) windowHandles[1]);
	    Thread.sleep(8000); 		
		
	}
	
	@When("click on Inbound tab of NMIAL INTL")
	public void click_on_inbound_tab_of_nmial_intl() throws Throwable {
		 wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.ImportsINTL_Tab, 30);
		 Thread.sleep(8000); 
		    Nmial_Outbound.ImportsINTL_Tab.click();
		 Thread.sleep(3000);

	}

	
	@When("clicked on Submit button of Weight Verification of INTL NMIAL")
	public void clicked_on_submit_button_of_weight_verification_of_intl_nmial() throws Throwable {
		
	    Thread.sleep(3000); 
		wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.SubmitWeightVerification_Icon, 30);
		Nmial_Outbound.SubmitWeightVerification_Icon.click();
		wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.ChargeWeightUpload_Btn, 30);
	    Thread.sleep(3000); 

	}
	
	@When("click on Charge Weight and Document Upload button of INTL NMIAL")
	public void click_on_charge_weight_and_document_upload_button_of_intl_nmial() throws Throwable {
		Robot robot= new Robot();

		Nmial_Outbound.ChargeWeightUpload_Btn.click();
	    Thread.sleep(20000); 

//		String filePath = "D:\\Nmial_INTL\\EDSInternationalPvtLtd_09881081000_16022026.xslx";           
//        StringSelection selection = new StringSelection(filePath);
//          Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
//  	    Thread.sleep(8000); 
//  	    robot.keyPress(KeyEvent.VK_CONTROL);
//  	    robot.keyPress(KeyEvent.VK_V);
//  	    robot.keyPress(KeyEvent.VK_V);
//  	    robot.keyPress(KeyEvent.VK_CONTROL);
//  	    robot.keyPress(KeyEvent.VK_ENTER);
//  	    robot.keyPress(KeyEvent.VK_ENTER);
//	    Thread.sleep(3000); 

		Nmial_Outbound.HawbUpload_Btn.click();
	    Thread.sleep(50000);  
	    wm.scrollTillElement(driver, Nmial_Outbound.UploadOther_Btn);
	    Nmial_Outbound.UploadOther_Btn.click();
	    Thread.sleep(50000);  

	}
	
	@When("click on VCT Generation for Imports>> Warehouse Location  for {string} AWB with {string} HAWB in GHA")
	public void click_on_vct_generation_for_imports_warehouse_location_for_awb_with_hawb_in_gha(String value1, String value2) throws Throwable {
		Thread.sleep(8000);		
		wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.ImportsGHA_Tab, 30);
		Nmial_Outbound.ImportsGHA_Tab.click();
		Thread.sleep(8000);		
		Nmial_Outbound.WarehouseLocation_Tab.click();
		Thread.sleep(8000);	
		driver.switchTo().frame(Nmial_Outbound.PageFrame);
		Thread.sleep(8000);	
		Nmial_Outbound.WH_AwbPfx_Tb.sendKeys("312", Keys.END);
		Thread.sleep(8000);	

		Nmial_Outbound.WH_Awb_Tb.sendKeys(value1, Keys.END);
		Thread.sleep(8000);	

		Nmial_Outbound.HawbWH_Tb.sendKeys(value2, Keys.END);
		Thread.sleep(8000);	

		Nmial_Outbound.SearchAwbINTL_Btn.click();
		Thread.sleep(8000);	
		Nmial_Outbound.GroupIdWH_Tb.sendKeys(wm.RandomNo(7), Keys.END);
		Thread.sleep(8000);	
		Nmial_Outbound.LocationWH_Icon.click();
		Thread.sleep(8000);	

	}
	
	@When("click on VCT Generation for Imports>> Warehouse Location  for {string} AWB in GHA INTL")
	public void click_on_vct_generation_for_imports_warehouse_location_for_awb_in_gha_intl(String value) throws Throwable {
		Thread.sleep(8000);		
		wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.ImportsGHA_Tab, 30);
		Nmial_Outbound.ImportsGHA_Tab.click();
		Thread.sleep(8000);		
		Nmial_Outbound.WarehouseLocation_Tab.click();
		Thread.sleep(8000);	
		driver.switchTo().frame(Nmial_Outbound.PageFrame);
		Thread.sleep(8000);	
		Nmial_Outbound.WH_AwbPfx_Tb.sendKeys("312", Keys.END);
		Thread.sleep(8000);	

		Nmial_Outbound.WH_Awb_Tb.sendKeys(value, Keys.END);
		Thread.sleep(8000);	

		Nmial_Outbound.SearchAwbINTL_Btn.click();
		Thread.sleep(8000);	
		Nmial_Outbound.GroupIdWH_Tb.sendKeys(wm.RandomNo(7), Keys.END);
		Thread.sleep(8000);	
		Nmial_Outbound.LocationWH_Icon.click();
		Thread.sleep(8000);	
	}
	
	@When("click on Save button for Location in GHA")
	public void click_on_save_button_for_location_in_gha() throws Throwable {
//		Nmial_Outbound.LocationWH_Icon.click();
//		Thread.sleep(8000);	

		Nmial_Outbound.SaveLocationWH_Btn.click();
		Thread.sleep(8000);	
		driver.switchTo().defaultContent();		
		Thread.sleep(8000);	
		driver.switchTo().frame(Nmial_Outbound.PageFrame);
		Thread.sleep(8000);	

	}

	@When("click on Inbound of NMIAL INTL")
	public void click_on_inbound_of_nmial_intl() throws Throwable {
		Thread.sleep(8000);	
		Nmial_Outbound.ImportsINTL_Tab.click();
		Thread.sleep(8000);	

	}
	
	@When("enter {string} IGM No for INTL Airline")
	public void enter_igm_no_for_intl_airline(String value) throws Throwable {
		Nmial_Outbound.IgmNo_Tb.sendKeys(value, Keys.END);
		Thread.sleep(3000);	

	}
	
	@When("enter Chargeable Weight for displayed AWB filter of INTL Airline")
	public void enter_chargeable_weight_for_displayed_awb_filter_of_intl_airline() throws Throwable {
		Nmial_Outbound.SelectAllADO_Cb.click();
	    Thread.sleep(3000);

	}

	
	@When("click on Submit Weight Verification icon of INTL NMIAL")
	public void click_on_submit_weight_verification_icon_of_intl_nmial() {
	
	}
	
	@When("enter {string} Chargeable weight and clicked on Submit button for Weight Verification in INTL NMIAL")
	public void enter_chargeable_weight_and_clicked_on_submit_button_for_weight_verification_in_intl_nmial(String value) throws Throwable {
	    Thread.sleep(3000);
		Nmial_Outbound.ChargeableWt_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
	    Thread.sleep(3000);
		Nmial_Outbound.ChargeableWt_Tb.sendKeys(value, Keys.TAB);
	    Thread.sleep(3000);
	    Nmial_Outbound.SubmitWt_Btn.click();
	    Thread.sleep(3000);

	}

	
	@When("upload HAWB details of INTL NMIAL")
	public void upload_hawb_details_of_intl_nmial() {
	
	}
	
	//Accept Reject Weight Verification
	@When("launch browser for INTL GHA application and login with {string} ACS GHA user given in {string} sheet for Export module")
	public void launch_browser_for_intl_gha_application_and_login_with_acs_gha_user_given_in_sheet_for_export_module(String entity, String sheetName) throws Throwable {
		String URL_GHA= "https://galaxycmsuat.adani.com/NMIINTL/Login.aspx";
		((JavascriptExecutor) driver).executeScript("window.open('" + URL_GHA + "', '_blank');");    

        for (String handle : driver.getWindowHandles()) {
        driver.switchTo().window(handle);}
        
		Entity = entity;
		TestDataReader.ReadLoginDetails(Entity);
		Thread.sleep(500);
		System.out.println("usr= " + Username);
		System.out.println("pwd= " + Password);
		// loginScreen.isLoginScreenDisplayed();
		
		loginScreen.GHA_Login(entity, Username, Password);
		Thread.sleep(8000);
	}

	
	@When("clicked on More> Dashboard of GHA INTL")
	public void clicked_on_more_dashboard_of_gha_intl() throws Throwable {
	    Nmial_Outbound.MoreINTL_Icon.click();
	    Thread.sleep(3000);
	    Nmial_Outbound.Dashboard_Hyperlink.click();
	    Thread.sleep(3000);

	}
	
	@When("click on ACS Request tab of GHA INTL")
	public void click_on_acs_request_tab_of_gha_intl() throws Throwable {
	    Nmial_Outbound.ApproveRejectACS_Hyperlink.click();
	    Thread.sleep(3000);

	}
	
	@When("click on Accept icon of submitted record of GHA INTL")
	public void click_on_accept_icon_of_submitted_record_of_gha_intl() throws Throwable {
        driver.switchTo().defaultContent();
	    Thread.sleep(1000);
	    driver.switchTo().frame(Nmial_Outbound.PageFrame);
	    Thread.sleep(1000);
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.AcceptWeightVerification_Icon, 30);
	    Thread.sleep(3000);
	    Nmial_Outbound.AcceptWeightVerification_Icon.click();
	    driver.switchTo().alert().accept();
	    Thread.sleep(3000);	    
	    driver.switchTo().alert().accept();
	    Thread.sleep(3000);	    

	}
	
	@When("click on Reject icon of other record of GHA INTL")
	public void click_on_reject_icon_of_other_record_of_gha_intl() throws Throwable {
		driver.switchTo().defaultContent();
	    Thread.sleep(1000);
	    driver.switchTo().frame(Nmial_Outbound.PageFrame);
	    Thread.sleep(1000);
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.RejectWeightVerification_Icon, 30);
	    Thread.sleep(3000);
	    Nmial_Outbound.RejectWeightVerification_Icon.click();
	    Thread.sleep(3000);

	}

	//Consol DO
	@When("enter {string} Flight No filter of INTL NMIAL UAT")
	public void enter_flight_no_filter_of_intl_nmial_uat(String value) throws Throwable {
        Nmial_Outbound.FlightNoFilter_Tb.sendKeys(value, Keys.END);
	    Thread.sleep(3000);
	    Nmial_Outbound.ApplyFilter_Icon.click();
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.ContainsFilter_Icon, 30);
        Nmial_Outbound.ContainsFilter_Icon.click();
	    Thread.sleep(3000);
	}
		
	@When("click on Consol DO icon of INTL NMIAL UAT")
	public void click_on_consol_do_icon_of_intl_nmial_uat() throws Throwable {
	    Thread.sleep(3000);
	    Nmial_Outbound.ConsolDO_Icon.click();
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.SubmitConsolDO_Btn, 30);
	    
	}
	
	@When("select Custom Broker and clicked on Submit button of INTL NMIAL UAT")
	public void select_custom_broker_and_clicked_on_submit_button_of_intl_nmial_uat() throws Throwable {
        Select customBrokerDD= new Select(Nmial_Outbound.CustomBroker_DD);
        customBrokerDD.selectByIndex(1);
	    Thread.sleep(3000);

        Nmial_Outbound.SubmitConsolDO_Btn.click();
	    Thread.sleep(3000);

	}
	
	//BoE
	@When("click on BOE icon of NMIAL INTL")
	public void click_on_boe_icon_of_nmial_intl() throws Throwable {
        Nmial_Outbound.BOE_Icon.click();
	    Thread.sleep(3000);
        wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.BoeNo_Tb, 30);
	}
	
	@When("enter BoE No, select {string} BoE Type and enter {string} CAV, {string} NOP of NMIAL INTL")
	public void enter_bo_e_no_select_bo_e_type_and_enter_cav_nop_of_nmial_intl(String value1, String value2, String value3) {
		Nmial_Outbound.BoeNo_Tb.sendKeys(wm.RandomNo(7), Keys.TAB);
		Select BoeTypeDD= new Select(Nmial_Outbound.BoeType_DD);
		BoeTypeDD.selectByIndex(1);
		Nmial_Outbound.CAV_Tb.sendKeys(value2, Keys.TAB);
		Nmial_Outbound.BoeNOP_Tb.sendKeys("4", Keys.END);
	}
	
	@When("upload BoE file and click on Save BoE button of NMIAL INTL")
	public void upload_bo_e_file_and_click_on_save_bo_e_button_of_nmial_intl() throws Throwable {
		Nmial_Outbound.UploadBOE_Icon.click();
	    Thread.sleep(30000);
//	    Nmial_Outbound.ChooseBOE_Btn.sendKeys("D:\\pdf1.pdf");
//	    Thread.sleep(20000);
//	    Nmial_Outbound.UploadBOE_Btn.click();
//	    Thread.sleep(20000);

	    Nmial_Outbound.CloseBOE_Btn.click();
	    Thread.sleep(10000);
	    Nmial_Outbound.SaveBOE_Btn.click();
	    Thread.sleep(10000);

	}
	
	@When("click on {int} Accept icon of submitted record of GHA INTL")
	public void click_on_accept_icon_of_submitted_record_of_gha_intl(Integer row) throws Throwable {
		driver.switchTo().frame(Nmial_Outbound.PageFrame);
	    Thread.sleep(8000);

	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.ApproveBOE_Icon, 30);
	    Nmial_Outbound.ApproveBOE_Icon.get(row-1).click();
	    Thread.sleep(8000);
	    driver.switchTo().alert().accept();
	    Thread.sleep(8000);
	    driver.switchTo().alert().accept();
	    Thread.sleep(8000);

	}


    @When("enter {string} ATA date time and save {string} DocReceive, {string} Breakdown details of GHA INTL")
    public void enter_ata_date_time_and_save_doc_receive_breakdown_details_of_gha_intl(String value1, String value2, String value3) throws Throwable {
    	  Nmial_Outbound.Breakdown_Btn.click();
  	    Thread.sleep(3000); 

  	    String p= driver.getWindowHandle();
  	  		Set<String> s= driver.getWindowHandles();
  	  		Iterator<String> I= s.iterator();
  	  		Object[] windowHandles= driver.getWindowHandles().toArray();
  	  		driver.switchTo().window((String) windowHandles[1]);
  	  		System.out.println(driver.getTitle());
  	  		
  	  	Nmial_Outbound.DocReceiveDate_Tb.sendKeys(wm.CurrentDate("dd/MM/yyyy"), Keys.END);
  	  	Nmial_Outbound.DocReceiveTime_Tb.sendKeys(value2+"05", Keys.END);
  	    Thread.sleep(10000); 

  	  	Nmial_Outbound.BreakdownStartDate_Tb.sendKeys(wm.CurrentDate("dd/MM/yyyy"), Keys.END);
  	  	Nmial_Outbound.BreakdownStartTime_Tb.sendKeys(value2+"05", Keys.END);
  	    Thread.sleep(10000); 

  	  	Nmial_Outbound.BreakdownEndDate_Tb.sendKeys(wm.CurrentDate("dd/MM/yyyy"), Keys.END);
  	  	Nmial_Outbound.BreakdownEndTime_Tb.sendKeys(value3+"10", Keys.END);
  	    Thread.sleep(3000); 

  	  	Nmial_Outbound.BreakdownUld_Cb.click();
  	    Thread.sleep(10000); 
  	    Nmial_Outbound.SaveBreakdown_Btn.click();
  	    Thread.sleep(10000); 
  	    Nmial_Outbound.CancelBreakdown_Btn.click();
  	    Thread.sleep(10000); 
  		driver.switchTo().window((String) windowHandles[0]);
  	    Thread.sleep(8000); 

    }
	
    @When("click on BOE ASI icon of NMIAL INTL")
    public void click_on_boe_asi_icon_of_nmial_intl() throws Throwable {
  	    Thread.sleep(8000); 
    	wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.BoE_ASI_Icon, 30);
        Nmial_Outbound.BoE_ASI_Icon.click();
  	    Thread.sleep(8000); 

    }
    
    @When("click on Proceed BoE ASI button of NMIAL INTL")
    public void click_on_proceed_bo_e_asi_button_of_nmial_intl() throws Throwable {
    	Nmial_Outbound.BoE_Proceed_Btn.click();
  	    Thread.sleep(8000); 

    }
	
    @When("click on BOE ACS Receipt icon of NMIAL INTL")
    public void click_on_boe_acs_receipt_icon_of_nmial_intl() throws Throwable {
  	    Thread.sleep(8000); 
    	wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.BoE_ACS_Icon, 30);
    	Nmial_Outbound.BoE_ACS_Icon.click();
  	    Thread.sleep(3000); 

    }

    @When("click on BOE TSP icon of INTL NMIAL UAT")
    public void click_on_boe_tsp_icon_of_intl_nmial_uat() throws Throwable {
        Nmial_Outbound.TspBoe_Icon.click();
   	    Thread.sleep(20000); 

    }
    
    @When("clicked on Pay Now button for BOE TSP")
    public void clicked_on_pay_now_button_for_boe_tsp() throws Throwable {
//		Entity = entity;
//		TestDataReader.ReadLoginDetails(Entity);
//		Thread.sleep(500);
//		System.out.println("usr= " + Username);
//		System.out.println("pwd= " + Password);

        Nmial_Outbound.TspTransaction_Tb.sendKeys("", Keys.END);
   	    Thread.sleep(3000); 

        Nmial_Outbound.BoePayNow_Btn.click();
   	    Thread.sleep(3000); 
        Nmial_Outbound.YesBoePayNow_Btn.click();
   	    Thread.sleep(3000); 

    }
    
    //Pick Order
    @When("click on Pick Order icon of INTL NMIAL")
    public void click_on_pick_order_icon_of_intl_nmial() throws Throwable {
    	Nmial_Outbound.PickOrder_Icon.click();
   	    Thread.sleep(3000); 

    }
    
    @When("enter {string} Pieces for examination of INTL NMIAL")
    public void enter_pieces_for_examination_of_intl_nmial(String value) throws Throwable {
    	wm.scrollTillElement(driver, Nmial_Outbound.POE_Tb);
    	Nmial_Outbound.POE_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
   	    Thread.sleep(3000); 

    	Nmial_Outbound.POE_Tb.sendKeys(value, Keys.END);
   	    Thread.sleep(3000); 
    	Nmial_Outbound.RemarksPOE_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
   	    Thread.sleep(3000); 
    	Nmial_Outbound.RemarksPOE_Tb.sendKeys("ok", Keys.END);
   	    Thread.sleep(3000); 

    }
    
    @When("click on Save Pick Order button of INTL NMIAL")
    public void click_on_save_pick_order_button_of_intl_nmial() throws Throwable {
    	Nmial_Outbound.SavePOE_Btn.click();
   	    Thread.sleep(3000); 
   	    Nmial_Outbound.OkPOE_Btn.click();
   	    Thread.sleep(3000); 

    }
    
    @Then("verify Request status for pieces of INTL NMIAL")
    public void verify_request_status_for_pieces_of_intl_nmial() {
        
    }

    //Forward for Examination
    @When("clicked on Imports> More>> Customs Actions of GHA INTL")
    public void clicked_on_imports_more_customs_actions_of_gha_intl() throws Throwable {
    	Nmial_Outbound.Imports_Tab.click();
    	Nmial_Outbound.MoreCustomActions_Icon.click();
    	Nmial_Outbound.CustomActions_Hyperlink.click();
   	    Thread.sleep(3000); 
    	driver.switchTo().frame(Nmial_Outbound.PageFrame);
   	    Thread.sleep(3000); 
    
    }
    
    @When("enter {string} AWB, {string} HAWB and click on Search button of GHA INTL")
    public void enter_awb_hawb_and_click_on_search_button_of_gha_intl(String value1, String value2) throws Throwable {
        Nmial_Outbound.WH_AwbPfx_Tb.sendKeys("312", Keys.END);
        Nmial_Outbound.WH_Awb_Tb.sendKeys(value1, Keys.END);
        Nmial_Outbound.HawbWH_Tb.sendKeys(value2, Keys.END);
        Nmial_Outbound.SearchFFE_Btn.click();
   	    Thread.sleep(3000); 
        
    }
    
    @When("click on Examination button, enter Custom Ref No and date,select Exam location and enter {string} Exam Pieces of GHA INTL")
    public void click_on_examination_button_enter_custom_ref_no_and_date_select_exam_location_and_enter_exam_pieces_of_gha_intl(String value) throws Throwable {
    	Nmial_Outbound.Examination_Btn.click();
		 wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		    String p= driver.getWindowHandle();
			Set<String> s= driver.getWindowHandles();
			Iterator<String> I= s.iterator();
			Object[] windowHandles= driver.getWindowHandles().toArray();
			driver.switchTo().window((String) windowHandles[2]);
			System.out.println(driver.getTitle());
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.CustomRefNo_Tb, 30);
	    Nmial_Outbound.CustomRefNo_Tb.sendKeys(wm.RandomNo(8), Keys.TAB);
	    Nmial_Outbound.CustomRefDate_Tb.sendKeys(wm.CurrentDate("dd/MM/yyyy"), Keys.TAB);
	    Nmial_Outbound.ExamLocation_Icon.click();
	    Nmial_Outbound.LocationCustomAction_Cb.click();
   	    Thread.sleep(3000); 

	    Nmial_Outbound.ExamPiecesGrid_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
	    Nmial_Outbound.ExamPiecesGrid_Tb.sendKeys(value, Keys.END);
   	    Thread.sleep(3000); 
    	
    }
    
    @When("click on Forward for Examination button of GHA INTL")
    public void click_on_forward_for_examination_button_of_gha_intl() throws Throwable {
    	Nmial_Outbound.FFE_Btn.click();
   	    Thread.sleep(3000); 

        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();   // Clicks OK / Accept
	    Thread.sleep(3000);
    }
    
    //OOC
    @When("click on OOC icon of INTL NMIAL")
    public void click_on_ooc_icon_of_intl_nmial() throws Throwable {
	    Thread.sleep(3000);
        wm.scrollTillElement(driver, Nmial_Outbound.OOC_Icon);
	    Thread.sleep(3000);
	    Nmial_Outbound.OOC_Icon.click();
	    Thread.sleep(3000);

    }
    
    @When("enter OOC number, select OOC Type and upload OOC file of INTL NMIAL")
    public void enter_ooc_number_select_ooc_type_and_upload_ooc_file_of_intl_nmial() throws Throwable {
    	Nmial_Outbound.OOCno_Tb.sendKeys(wm.RandomNo(5)+wm.RandomNo(5), Keys.END);
	    Thread.sleep(3000);

    	Select OocTypeDD= new Select(Nmial_Outbound.OOC_Type_DD);
    	OocTypeDD.selectByIndex(1);
	    Thread.sleep(3000);

    	Nmial_Outbound.UploadOoc_Icon.click();
	    Thread.sleep(8000);
	    Nmial_Outbound.UploadOoc_Btn.click();
	    Thread.sleep(8000);
	    Nmial_Outbound.CloseOoc_Btn.click();
	    Thread.sleep(3000);

    }
    
    @When("click on Save OOC button of INTL NMIAL")
    public void click_on_save_ooc_button_of_intl_nmial() throws Throwable {
    	Nmial_Outbound.SaveOoc_Btn.click();
	    Thread.sleep(3000);

    }
    
    
    
    
	
	
	
	
	
	
	
}
