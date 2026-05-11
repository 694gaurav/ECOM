package stepdefinition;

import static Helper.BaseVariables.Entity;
import static Helper.BaseVariables.Password;
import static Helper.BaseVariables.Username;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestDataOperations.TestDataReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.masterthought.cucumber.json.Row;

import static Helper.BaseObjects.*;


public class NMIAL_Inbound {
	Actions a= new Actions(driver);
    String flight="6e"+wm.RandomNo(4);
    String flightNo= flight.substring(2);
   
  
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	
	@When("launch browser for GHA application and login with {string} ACS GHA user given in {string} sheet for Flight create")
	public void launch_browser_for_gha_application_and_login_with_acs_gha_user_given_in_sheet_for_flight_create(String entity, String sheetName) throws Throwable {
		
		String URL_GHA= "https://galaxycmsuat.adani.com/GHAAdaniNMIDOMUAT/DashBoard.aspx#";
//		String URL_GHA="https://adaniuat.kalelogistics.com/GHAAdaniNMIDOMUAT/Login.aspx";
		((JavascriptExecutor) driver).executeScript("window.open('" + URL_GHA + "', '_blank');");    

        for (String handle : driver.getWindowHandles()) {
        driver.switchTo().window(handle);}
        
        System.out.println("awb= "+wm.Random_awbNo());
        
     // Get parent window
     String parentWindow = driver.getWindowHandle();

     // Get all window handles (2 tabs)
     Set<String> allWindows = driver.getWindowHandles();

     for (String window : allWindows) {
         if (!window.equals(parentWindow)) {
             // Switch to second tab
             driver.switchTo().window(window);
             driver.close();  // Close the second tab
         }
     }

     // Switch back to parent tab
     driver.switchTo().window(parentWindow);

		        
		Entity = entity;
		TestDataReader.ReadLoginDetails(Entity);
		Thread.sleep(500);
		System.out.println("usr= " + Username);
		System.out.println("pwd= " + Password);
		// loginScreen.isLoginScreenDisplayed();
		
		loginScreen.GHA_Login(entity, Username, Password);
		Thread.sleep(8000);
	}
	
	
	
	@When("click on Masters>> More>> Flight> Details in GHA")
	public void click_on_masters_more_flight_details_in_gha() throws Throwable {
	    Nmial_Outbound.Masters_Tab.click();
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.FlightMore_Icon, 30);
	    Nmial_Outbound.FlightMore_Icon.click();
	    Thread.sleep(3000);
	    Nmial_Outbound.FlightInbound_Tab.click();
	    Thread.sleep(20000);
	    
	    driver.switchTo().frame(Nmial_Outbound.PageFrame);
	    Thread.sleep(3000);
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.AddFlightDetails_Icon, 30);
	    Nmial_Outbound.FlightDetails_Tab.click();
	    Thread.sleep(3000);

	    Nmial_Outbound.AddFlightDetails_Icon.click();
	    Thread.sleep(3000);
	    driver.switchTo().defaultContent();
	    Thread.sleep(3000);
	    driver.switchTo().frame(Nmial_Outbound.PageFrame);
	    Thread.sleep(3000);

	}
	
	@When("select CTO popup screen Ok button of Export")
	public void select_cto_popup_screen_ok_button_of_export() throws Throwable {
	    Thread.sleep(8000);
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.OkSelectCTO_Btn, 30);
	    Nmial_Outbound.OkSelectCTO_Btn.click();
	    Thread.sleep(8000);
		
	}
	
	@When("click on Add button and enter {string} Flight No, select {string} Aircraft Type in Flight Details of GHA")
	public void click_on_add_button_and_enter_flight_no_select_aircraft_type_in_flight_details_of_gha(String value1, String value2) throws Throwable {
	    Thread.sleep(3000);
		Nmial_Outbound.Flight_Tb.sendKeys(value1+flightNo, Keys.END);
	    Nmial_Outbound.AircraftType_Tb.sendKeys("100", Keys.END);
	    a.sendKeys(Keys.SHIFT);
	    Thread.sleep(3000);
	    a.sendKeys(Keys.ARROW_DOWN);
	    Thread.sleep(3000);
	    a.sendKeys(Keys.END);
	    Thread.sleep(3000);

	}
	
	@When("click on Routing details and enter {string} Origin, {string} Destination Airport details and click on Save button of GHA")
	public void click_on_routing_details_and_enter_origin_destination_airport_details_and_click_on_save_button_of_gha(String value1, String value2) throws Throwable {
		Nmial_Outbound.RoutingDetails_Tab.click();
	    Thread.sleep(3000);
	    
	    Nmial_Outbound.AirportCity_Tb.sendKeys(value1, Keys.END);
	    Nmial_Outbound.DepartureDate_Tb.sendKeys(wm.CurrentDate("dd/MM/yyyy"), Keys.END);	    Thread.sleep(3000);
	    Nmial_Outbound.DepartureTimeHH_Tb.sendKeys("10", Keys.TAB);	    Thread.sleep(3000);
	    Nmial_Outbound.DepartureTimeMM_Tb.sendKeys("00", Keys.TAB);	    Thread.sleep(3000);


	    Nmial_Outbound.DestinationCity_Tb.sendKeys(value2, Keys.END);	    Thread.sleep(3000);
	    Nmial_Outbound.ArrivalDate_Tb.sendKeys(wm.CurrentDate("dd/MM/yyyy"), Keys.END);	    Thread.sleep(3000);
	    Nmial_Outbound.ArrivalTimeHH_Tb.sendKeys("13", Keys.END);	    Thread.sleep(3000);
	    Nmial_Outbound.ArrivalTimeMM_Tb.sendKeys("00", Keys.END);	    Thread.sleep(3000);
	    
	    Nmial_Outbound.SaveFlight_Icon.click();
	    Thread.sleep(8000);
	    driver.switchTo().defaultContent();
	    Thread.sleep(8000);

	}
	
	@When("click on Imports>> Import Manifest and enter created {string} Flight of GHA")
	public void click_on_imports_import_manifest_and_enter_created_flight_of_gha(String value) throws Throwable {
		 wait.until(ExpectedConditions.numberOfWindowsToBe(1));

	        // 1) Switch to the SECOND tab (recommended: identify by URL or Title)
//	        String secondTabHandle = Nmial_Outbound.switchToWindowByUrlOrTitle(driver, wait,
//	                /* urlFragment */ "https://galaxycmsuat.adani.com/GHAAdaniNMIDOMUAT/DashBoard.aspx", /* titleFragment */ null);
//
//	        if (secondTabHandle == null) {
//	            // Fallback: index-based (less reliable because Set is not strictly ordered everywhere)
//	            secondTabHandle = Nmial_Outbound.switchToNthWindow(driver, 1); // 0-based: 0=first, 1=second
//	        }

	    Nmial_Outbound.Imports_Tab.click();
	    Thread.sleep(3000);

	    Nmial_Outbound.ImportManifest_Tab.click();
	    Thread.sleep(3000);
//	    String awbFlightPfx= flight.substring(0, 2);
//	    String awbFlight= flight.substring(Math.max(0, flight.length()-4));
	      
	    String awbFlightPfx= "6E";
//	    String awbFlight= flightNo.substring(2);

     wait.until(ExpectedConditions.numberOfWindowsToBe(1));

     driver.switchTo().frame(Nmial_Outbound.PageFrame);
	    Thread.sleep(3000);

	    Nmial_Outbound.FlightPfx_Tb.sendKeys(awbFlightPfx, Keys.TAB);
	    Thread.sleep(3000);	  	    
     Nmial_Outbound.CreatedFlightNo_Tb.sendKeys(flightNo, Keys.TAB);
	    Thread.sleep(3000);     

	    Nmial_Outbound.FlightPopup_Icon.click();
	    String p= driver.getWindowHandle();
		Set<String> s= driver.getWindowHandles();
		Iterator<String> I= s.iterator();
		Object[] windowHandles= driver.getWindowHandles().toArray();
		driver.switchTo().window((String) windowHandles[1]);
		System.out.println(driver.getTitle());
		
		Thread.sleep(8000);
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.FlightsPopup_Hyperlink, 30);
	    Nmial_Outbound.FlightsPopup_Hyperlink.get(0).click();
		Thread.sleep(8000);
 	driver.switchTo().window((String) windowHandles[0]);
		Thread.sleep(3000);

 	driver.switchTo().defaultContent();
		Thread.sleep(3000);
     driver.switchTo().frame(Nmial_Outbound.PageFrame);
	    Thread.sleep(3000); 
	}

	@When("click on Imports>> Import Manifest and enter created Flight of GHA")
	public void click_on_imports_import_manifest_and_enter_created_flight_of_gha() throws Throwable {		 

	}
	
	@When("enter {string} with {string} and add Flight ULD details")
	public void enter_with_and_add_flight_uld_details(String value1, String value2) throws Throwable {
	  Nmial_Outbound.ULD_Pfx_Tb.sendKeys(value1, Keys.TAB);	 
	  Thread.sleep(1000);

	  Nmial_Outbound.ULD_No_Tb.sendKeys(wm.RandomNo(5), Keys.TAB);
	  Nmial_Outbound.ULD_FlightPfx_Tb.sendKeys(value2, Keys.TAB);
	  Thread.sleep(1000);

	  Nmial_Outbound.AddULD_Btn.click();
	    Thread.sleep(3000);		    
	  wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.UldNo_Hyperlink, 30);
	    Thread.sleep(30000);		    

	}
	
	@When("click on ULD and add AWB details in GHA")
	public void click_on_uld_and_add_awb_details_in_gha() throws Throwable {
		Nmial_Outbound.UldNo_Hyperlink.click();
	    Thread.sleep(3000);	
	    String p= driver.getWindowHandle();
		Set<String> s= driver.getWindowHandles();
		Iterator<String> I= s.iterator();
		Object[] windowHandles= driver.getWindowHandles().toArray();
		driver.switchTo().window((String) windowHandles[1]);
		System.out.println(driver.getTitle());
		
		int x= driver.manage().window().getPosition().getX();
		int y= driver.manage().window().getPosition().getY();
		Point p1= driver.manage().window().getPosition();
		
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.Pfx1_Tb, 30);
	    Nmial_Outbound.Pfx1_Tb.sendKeys("312", Keys.TAB);
	    Thread.sleep(3000);	 
	    Nmial_Outbound.Awb1_Tb.sendKeys(wm.Random_awbNo(), Keys.END);
	    Thread.sleep(8000);	 
	    Nmial_Outbound.Origin1_Tb.sendKeys("HYD", Keys.TAB);
	    Thread.sleep(8000);	 
	    Nmial_Outbound.Origin1_Tb.sendKeys("HYD", Keys.END);
	    Thread.sleep(8000);	 

	    Nmial_Outbound.CommodityCode1_Tb.sendKeys("1269", Keys.TAB);

		Nmial_Outbound.Commodity1_Hyperlink.click();
	    Thread.sleep(8000);

//		Nmial_Outbound.Commodity1_Hyperlink.sendKeys(Keys.CONTROL+"A", Keys.CONTROL+"C");
//	    Thread.sleep(8000);
		Nmial_Outbound.NatureOfGoods1_Tb.sendKeys("testing", Keys.END);
	    Thread.sleep(8000);
        Nmial_Outbound.ManifestedNPX1_Tb.sendKeys("6", Keys.TAB);
        Nmial_Outbound.ManifestedWtExp1_Tb.sendKeys("60", Keys.TAB);
        Nmial_Outbound.DeclaredChWt1_Tb.sendKeys("60", Keys.TAB);
        Nmial_Outbound.ConsigneeCode1_Tb.sendKeys("CRG", Keys.TAB);
	    Thread.sleep(8000);
        Nmial_Outbound.AddAwb2_Icon.click();
	    Thread.sleep(8000);
	    
	    Nmial_Outbound.Pfx2_Tb.sendKeys("312", Keys.TAB);
	    Thread.sleep(3000);	 
	    Nmial_Outbound.Awb2_Tb.sendKeys(wm.Random_awbNo(), Keys.END);
	    Thread.sleep(3000);	 
	    Nmial_Outbound.Origin2_Tb.sendKeys("HYD", Keys.TAB);
	    Thread.sleep(3000);	 
	    Nmial_Outbound.Origin2_Tb.sendKeys("HYD", Keys.END);
	    Thread.sleep(3000);	 

	    Nmial_Outbound.CommodityCode2_Tb.sendKeys("1118", Keys.TAB);

	    a.moveToElement(Nmial_Outbound.Commodity2_Hyperlink).doubleClick().click().perform();
	    Thread.sleep(8000);

//		Nmial_Outbound.Commodity1_Hyperlink.sendKeys(Keys.CONTROL+"A", Keys.CONTROL+"C");
//	    Thread.sleep(8000);
		Nmial_Outbound.NatureOfGoods2_Tb.sendKeys("testing", Keys.END);
	    Thread.sleep(8000);
        Nmial_Outbound.ManifestedNPX2_Tb.sendKeys("8", Keys.TAB);
        Nmial_Outbound.ManifestedWtExp2_Tb.sendKeys("80", Keys.TAB);
        Nmial_Outbound.DeclaredChWt2_Tb.sendKeys("80", Keys.TAB);
        Nmial_Outbound.ConsigneeCode2_Tb.sendKeys("CRG", Keys.TAB);
	    Thread.sleep(8000);
        Nmial_Outbound.AddAwb3_Icon.click();
	    Thread.sleep(8000);
	    
	    Nmial_Outbound.Pfx3_Tb.sendKeys("312", Keys.TAB);
	    Thread.sleep(3000);	 
	    Nmial_Outbound.Awb3_Tb.sendKeys(wm.Random_awbNo(), Keys.END);
	    Thread.sleep(3000);	 
	    Nmial_Outbound.Origin3_Tb.sendKeys("HYD", Keys.TAB);
	    Thread.sleep(3000);	 
	    Nmial_Outbound.Origin3_Tb.sendKeys("HYD", Keys.END);
	    Thread.sleep(3000);	 

	    Nmial_Outbound.CommodityCode3_Tb.sendKeys("1231", Keys.TAB);

	    a.moveToElement(Nmial_Outbound.Commodity3_Hyperlink).doubleClick().click().perform();
	    Thread.sleep(8000);

//		Nmial_Outbound.Commodity1_Hyperlink.sendKeys(Keys.CONTROL+"A", Keys.CONTROL+"C");
//	    Thread.sleep(8000);
		Nmial_Outbound.NatureOfGoods3_Tb.sendKeys("testing", Keys.END);
	    Thread.sleep(8000);
        Nmial_Outbound.ManifestedNPX3_Tb.sendKeys("14", Keys.TAB);
        Nmial_Outbound.ManifestedWtExp3_Tb.sendKeys("140", Keys.TAB);
        Nmial_Outbound.DeclaredChWt3_Tb.sendKeys("140", Keys.TAB);
        Nmial_Outbound.ConsigneeCode3_Tb.sendKeys("CRG", Keys.TAB);
	    Thread.sleep(8000); 
	    Nmial_Outbound.AddAwb4_Icon.click();
	    Thread.sleep(8000);

	    Nmial_Outbound.Pfx4_Tb.sendKeys("312", Keys.TAB);
	    Thread.sleep(3000);	 
	    Nmial_Outbound.Awb4_Tb.sendKeys(wm.Random_awbNo(), Keys.END);
	    Thread.sleep(3000);	 
	    Nmial_Outbound.Origin4_Tb.sendKeys("HYD", Keys.TAB);
	    Thread.sleep(3000);	 
	    Nmial_Outbound.Origin4_Tb.sendKeys("HYD", Keys.END);
	    Thread.sleep(3000);	 

	    Nmial_Outbound.CommodityCode4_Tb.sendKeys("1218", Keys.TAB);

	    a.moveToElement(Nmial_Outbound.Commodity4_Hyperlink).doubleClick().click().perform();
	    Thread.sleep(8000);

//		Nmial_Outbound.Commodity1_Hyperlink.sendKeys(Keys.CONTROL+"A", Keys.CONTROL+"C");
//	    Thread.sleep(8000);
		Nmial_Outbound.NatureOfGoods4_Tb.sendKeys("testing", Keys.END);
	    Thread.sleep(8000);
        Nmial_Outbound.ManifestedNPX4_Tb.sendKeys("15", Keys.TAB);
        Nmial_Outbound.ManifestedWtExp4_Tb.sendKeys("150", Keys.TAB);
        Nmial_Outbound.DeclaredChWt4_Tb.sendKeys("150", Keys.TAB);
        Nmial_Outbound.ConsigneeCode4_Tb.sendKeys("CRG", Keys.TAB);
	    Thread.sleep(8000); 
	    Nmial_Outbound.AddAwb5_Icon.click();
	    Thread.sleep(8000);

	    Nmial_Outbound.Pfx5_Tb.sendKeys("312", Keys.TAB);
	    Thread.sleep(3000);	 
	    Nmial_Outbound.Awb5_Tb.sendKeys(wm.Random_awbNo(), Keys.END);
	    Thread.sleep(3000);	 
	    Nmial_Outbound.Origin5_Tb.sendKeys("HYD", Keys.TAB);
	    Thread.sleep(3000);	 
	    Nmial_Outbound.Origin5_Tb.sendKeys("HYD", Keys.END);
	    Thread.sleep(3000);	 

	    Nmial_Outbound.CommodityCode5_Tb.sendKeys("1120", Keys.TAB);

	    a.moveToElement(Nmial_Outbound.Commodity5_Hyperlink).doubleClick().click().perform();
	    Thread.sleep(8000);

//		Nmial_Outbound.Commodity1_Hyperlink.sendKeys(Keys.CONTROL+"A", Keys.CONTROL+"C");
//	    Thread.sleep(8000);
		Nmial_Outbound.NatureOfGoods5_Tb.sendKeys("testing", Keys.END);
	    Thread.sleep(8000);
        Nmial_Outbound.ManifestedNPX5_Tb.sendKeys("12", Keys.TAB);
        Nmial_Outbound.ManifestedWtExp5_Tb.sendKeys("120", Keys.TAB);
	    Thread.sleep(8000);

        Nmial_Outbound.DeclaredNPX5_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
	    Thread.sleep(8000);
        Nmial_Outbound.DeclaredNPX5_Tb.sendKeys("30", Keys.TAB);
	    Thread.sleep(8000);
        Nmial_Outbound.DeclaredNPX5_Tb.sendKeys("30", Keys.END);
	    Thread.sleep(8000);


        Nmial_Outbound.AwbWt5_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
	    Thread.sleep(8000);
        Nmial_Outbound.AwbWt5_Tb.sendKeys("300", Keys.END);
	    Thread.sleep(8000);
        Nmial_Outbound.DeclaredChWt5_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
	    Thread.sleep(8000);

        Nmial_Outbound.DeclaredChWt5_Tb.sendKeys("300", Keys.TAB);
        Nmial_Outbound.ConsigneeCode5_Tb.sendKeys("CRG", Keys.TAB);
	    Thread.sleep(8000); 

	    Nmial_Outbound.AwbSaveClose_Btn.click();
	    Thread.sleep(8000); 
//        driver.switchTo().alert().accept();
//	    Thread.sleep(8000); 

	    // handle the alert in popup
	           wait.until(ExpectedConditions.alertIsPresent());
	           Alert alert = driver.switchTo().alert();
	           alert.accept();   // Clicks OK / Accept
	   	    Thread.sleep(8000); 


		driver.switchTo().window((String) windowHandles[0]);
	    Thread.sleep(8000); 

	           // (Optional) Switch back to parent
//	           driver.switchTo().window(parent);


	}

	@When("enter ATA date time and save Breakdown details of GHA")
	public void enter_ata_date_time_and_save_breakdown_details_of_gha() throws Throwable {

	}
	
	@When("enter {string} ATA date time and save {string} DocReceive, {string} Breakdown details of GHA")
	public void enter_ata_date_time_and_save_doc_receive_breakdown_details_of_gha(String value1, String value2, String value3) throws Throwable {
		Thread.sleep(3000); 
		driver.switchTo().frame(Nmial_Outbound.PageFrame);
		Thread.sleep(3000); 
	   Nmial_Outbound.ATA_Date_Tb.sendKeys(wm.CurrentDate("dd/MM/yyyy"), Keys.TAB);
	    Thread.sleep(3000); 
	   Nmial_Outbound.ATA_Time_Tb.sendKeys(value1, Keys.END);
	    Thread.sleep(3000); 
	    Nmial_Outbound.RecordATA_Btn.click();
	    Thread.sleep(30000); 
	    
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
//	    Nmial_Outbound.CancelBreakdown_Btn.click();
	    Set<String> allWindows = driver.getWindowHandles();

        // iterate and close the new (child) window
        for (String window : allWindows) {
            if (!window.equals(p)) {
                driver.switchTo().window(window);  // switch to child
                driver.close();                    // close child
            }
        }

        // switch back to parent window
        driver.switchTo().window(p);

        // continue work on parent
        System.out.println("Child window closed, back to parent!");

		driver.switchTo().window((String) windowHandles[0]);
	    Thread.sleep(8000); 
	    
	    Thread.sleep(10000); 
		driver.switchTo().window((String) windowHandles[0]);
	    Thread.sleep(8000); 


	}


	//Matched shipment
	@When("select all ULD shipment and click on Match button of GHA")
	public void select_all_uld_shipment_and_click_on_match_button_of_gha() throws Throwable {
		driver.switchTo().frame(Nmial_Outbound.PageFrame);
	    Thread.sleep(3000); 

	   Nmial_Outbound.SelectAllAwb_Cb.click();
	    Thread.sleep(8000); 

	   Nmial_Outbound.MatchShipment_Btn.click();
	    Thread.sleep(8000); 

	   wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.OkMatchShipment_Btn, 30);
	   Nmial_Outbound.OkMatchShipment_Btn.click();
	    Thread.sleep(8000); 

	}

    //Discrepancy
	@Then("verify display of matched  shipment of GHA")
	public void verify_display_of_matched_shipment_of_gha() throws Throwable {
	   wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.MatchedShipment_Cb, 30);
	    Thread.sleep(8000); 

	}
	
	@When("select {int} shipment for Excess Shipment and click on Discrepancy of GHA")
	public void select_shipment_for_excess_shipment_and_click_on_discrepancy_of_gha(Integer row) throws Throwable {
		driver.switchTo().frame(Nmial_Outbound.PageFrame);
	    Thread.sleep(8000); 

		Nmial_Outbound.MatchedShipment_Cb.get(row-1).click();
		Nmial_Outbound.Discrepancy_Btn.click();

		String p= driver.getWindowHandle();
  		Set<String> s= driver.getWindowHandles();
  		Iterator<String> I= s.iterator();
  		Object[] windowHandles= driver.getWindowHandles().toArray();
  		driver.switchTo().window((String) windowHandles[1]);
  		System.out.println(driver.getTitle());
	}
	
	@When("enter {string} Excess received NOP of GHA")
	public void enter_excess_received_nop_of_gha(String value) throws Throwable {
	   Nmial_Outbound.DiscrepancyNPR_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
	   Thread.sleep(3000); 

	   Nmial_Outbound.DiscrepancyNPR_Tb.sendKeys(value, Keys.END);
	   Thread.sleep(3000); 

	}

	@When("click on Save Discrepancy button of GHA")
	public void click_on_save_discrepancy_button_of_gha() throws Throwable {
		 String p= driver.getWindowHandle();
	  		Set<String> s= driver.getWindowHandles();
	  		Iterator<String> I= s.iterator();
	  		Object[] windowHandles= driver.getWindowHandles().toArray();
	  		driver.switchTo().window((String) windowHandles[1]);
	  		System.out.println(driver.getTitle());
		    Thread.sleep(3000); 
		    

		Nmial_Outbound.SaveDiscrepancy_Btn.click();
	    Thread.sleep(3000); 	    
        wait.until(ExpectedConditions.alertIsPresent());
     // Now handle the alert in that popup window
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();   // Clicks OK / Accept
    // Nmial_Outbound.CancelDamage_Btn.click();
       Thread.sleep(8000); 
      driver.switchTo().window((String) windowHandles[0]);
    Thread.sleep(8000); 

}
	
	@When("select {int} shipment for Part Shipment and click on Discrepancy of GHA")
	public void select_shipment_for_part_shipment_and_click_on_discrepancy_of_gha(Integer row) throws Throwable {
		driver.switchTo().frame(Nmial_Outbound.PageFrame);
	    Thread.sleep(3000); 

		Nmial_Outbound.MatchedShipment_Cb.get(row-1).click();
	    Thread.sleep(3000); 
	    Nmial_Outbound.Discrepancy_Btn.click();
	    String p= driver.getWindowHandle();
  		Set<String> s= driver.getWindowHandles();
  		Iterator<String> I= s.iterator();
  		Object[] windowHandles= driver.getWindowHandles().toArray();
  		driver.switchTo().window((String) windowHandles[1]);
  		System.out.println(driver.getTitle());

	}

	@When("enter {string} Short landed received NOP of GHA")
	public void enter_short_landed_received_nop_of_gha(String value) throws Throwable {
		  Nmial_Outbound.DiscrepancyNPR_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
		    Thread.sleep(3000); 

		  Nmial_Outbound.DiscrepancyNPR_Tb.sendKeys(value, Keys.END);
		    Thread.sleep(3000); 

	}

	//Discrepancy Damage Shipment
	@When("select {int} shipment for Damaged Shipment and click on Discrepancy of GHA")
	public void select_shipment_for_damaged_shipment_and_click_on_discrepancy_of_gha(Integer row) throws Throwable {
		Nmial_Outbound.MatchedShipment_Cb.get(row-1).click();
	    Thread.sleep(3000); 
	    Nmial_Outbound.Damage_Btn.click();

	}
	
	@When("enter Damage pieces details of GHA")
	public void enter_damage_pieces_details_of_gha() throws Throwable {
	    String p= driver.getWindowHandle();
  		Set<String> s= driver.getWindowHandles();
  		Iterator<String> I= s.iterator();
  		Object[] windowHandles= driver.getWindowHandles().toArray();
  		driver.switchTo().window((String) windowHandles[1]);
  		System.out.println(driver.getTitle());
	    Thread.sleep(3000); 
	    

        // ---- code that opens the new window ----
        // Example:
        // driver.findElement(By.id("openWindowBtn")).click();


		Nmial_Outbound.DamagePieces_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
	    Thread.sleep(3000); 
	   Nmial_Outbound.DamagePieces_Tb.sendKeys("2", Keys.END);
	    Thread.sleep(3000);
	    
	   Nmial_Outbound.DamageWeight_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
	    Thread.sleep(3000); 
	   Nmial_Outbound.DamageWeight_Tb.sendKeys("20", Keys.END);
	    Thread.sleep(3000); 

	   Nmial_Outbound.DocumentWeight_Tb.sendKeys("60", Keys.END);
	    Thread.sleep(3000); 
	   Nmial_Outbound.ActualWeight_Tb.sendKeys("20", Keys.END);
	    Thread.sleep(3000); 

	   wm.scrollTillElement(driver, Nmial_Outbound.Damaged_Tb);
	    Thread.sleep(3000); 
	    Nmial_Outbound.Damaged_Cb.click();
	    Nmial_Outbound.Damaged_Tb.sendKeys("2", Keys.END);
	    
	    wm.scrollTillElement(driver, Nmial_Outbound.SaveDamageDetails_Btn);
	    Nmial_Outbound.DamagedRemarks_Tb.sendKeys("ok", Keys.END);
	    Nmial_Outbound.GHA_Rep_Tb.sendKeys("testing", Keys.END);
	    Nmial_Outbound.Airline_Rep_Tb.sendKeys("testing", Keys.END);
	    Nmial_Outbound.Customs_Rep_Tb.sendKeys("testing", Keys.END);
	    Thread.sleep(3000); 

	    Nmial_Outbound.SaveDamageDetails_Btn.click();
	    Thread.sleep(3000); 

	    // Now handle the alert in that popup window
	           wait.until(ExpectedConditions.alertIsPresent());
	           Alert alert = driver.switchTo().alert();
	           alert.accept();   // Clicks OK / Accept
//	    Nmial_Outbound.CancelDamage_Btn.click();
	    Thread.sleep(8000); 
	    // get all window handles
	    Set<String> allWindows = driver.getWindowHandles();

        // iterate and close the new (child) window
        for (String window : allWindows) {
            if (!window.equals(p)) {
                driver.switchTo().window(window);  // switch to child
                driver.close();                    // close child
            }
        }

        // switch back to parent window
        driver.switchTo().window(p);

        // continue work on parent
        System.out.println("Child window closed, back to parent!");

		driver.switchTo().window((String) windowHandles[0]);
	    Thread.sleep(8000); 

	}
	
	@When("click on Flight Finalize button of GHA")
	public void click_on_flight_finalize_button_of_gha() throws Throwable {
		driver.switchTo().frame(Nmial_Outbound.PageFrame);
	    Thread.sleep(3000); 

	    Nmial_Outbound.FlightFinalize_Btn.click();
	    Thread.sleep(3000); 

	}

	//Inbound1.1
	@When("click on Inbound for Airline")
	public void click_on_inbound_for_airline() throws Throwable {
	    Thread.sleep(3000); 
		 wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.Inbound_Tab, 30);
		    Thread.sleep(3000); 
		    Nmial_Outbound.Inbound_Tab.click();
		    Thread.sleep(3000);
	}
	
	@When("click on Inbound>> Shipments of NMIAL")
	public void click_on_inbound_shipments_of_nmial() throws Throwable {
		 wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.Inbound_Tab, 30);
		    Thread.sleep(3000); 
		    Nmial_Outbound.Inbound_Tab.click();
		    Thread.sleep(3000);

	}
	
	@When("enter {string} created Flight No of NMIAL")
	public void enter_created_flight_no_of_nmial(String value) {
	    
	}
	
	@Then("verify display of Discrepancy Damage detail in NMIAL")
	public void verify_display_of_discrepancy_damage_detail_in_nmial() {
	    
	}
	
	@When("launch browser for ACS application and login for Inbound")
	public void launch_browser_for_acs_application_and_login_for_inbound() {
		String URL_ACS= "https://acsadaniuat.kalelogistics.com/ACS_NMIAL_UAT/UI/Upliftlogin.aspx";
		((JavascriptExecutor) driver).executeScript("window.open('" + URL_ACS + "', '_blank');");    

        for (String handle : driver.getWindowHandles()) {
        driver.switchTo().window(handle);}
        
     // Get parent window
     String parentWindow = driver.getWindowHandle();

     // Get all window handles (2 tabs)
     Set<String> allWindows = driver.getWindowHandles();

     for (String window : allWindows) {
         if (!window.equals(parentWindow)) {
             // Switch to second tab
             driver.switchTo().window(window);
             driver.close();  // Close the second tab
         }
     }

     // Switch back to parent tab
     driver.switchTo().window(parentWindow);

	}

	
	@When("click on Inbound and search {string} Flight filter for Airline")
	public void click_on_inbound_and_search_flight_filter_for_airline(String value) throws Throwable {
		 wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.Inbound_Tab, 30);
		    Thread.sleep(8000); 
		    Nmial_Outbound.Inbound_Tab.click();
		    Thread.sleep(20000);

	     Nmial_Outbound.FlightNoFilter_Tb.sendKeys(flightNo, Keys.END);
		    Thread.sleep(8000);
         Nmial_Outbound.ApplyFilter_Icon.click();
		    Thread.sleep(8000);
         wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.ContainsFilter_Icon, 30);
         Nmial_Outbound.ContainsFilter_Icon.click();
		    Thread.sleep(8000);

	}
	
	@When("enter {string} Flight and click on Search button for NMIAL")
	public void enter_flight_and_click_on_search_button_for_nmial(String value) throws Throwable {
	    Nmial_Outbound.AdoFlight_Tb.sendKeys("6e"+flightNo, Keys.END);
	    Thread.sleep(3000);
	    Nmial_Outbound.SearchADO_Btn.click();
	    Thread.sleep(3000);

	}

	
	@When("enter Chargeable Weight for displayed AWB filter of Airline")
	public void enter_chargeable_weight_for_displayed_awb_filter_of_airline() throws Throwable {
		Nmial_Outbound.SelectAllADO_Cb.click();
	    Thread.sleep(3000);
	    Nmial_Outbound.ChargeableWeight_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
	    Thread.sleep(3000);
	    Nmial_Outbound.ChargeableWeight_Tb.sendKeys("500", Keys.END);
	    Thread.sleep(3000);

	    wm.scrollTillElement(driver, Nmial_Outbound.ApproveDeliveryOrder_Btn);
	}
	
	@When("click on Approve Delivery Order of Airline")
	public void click_on_approve_delivery_order_of_airline() throws Throwable {
	    Thread.sleep(3000);
		wm.scrollTillElement(driver, Nmial_Outbound.ApproveDeliveryOrder_Btn);
	    Nmial_Outbound.ApproveDeliveryOrder_Btn.click();
        wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.UpdatedADO_Btn, 30);
	    Nmial_Outbound.UpdatedADO_Btn.click();
	    Thread.sleep(3000);
	    Nmial_Outbound.ApprovedAsDO_Btn.click();
	    Thread.sleep(3000);

	}
	
	@When("click on Ready for Delivery icon of Export")
	public void click_on_ready_for_delivery_icon_of_export() throws Throwable {
	    Thread.sleep(8000);
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.ReadyForDelivery_Icon, 30);
	    Nmial_Outbound.ReadyForDelivery_Icon.click();
	    Thread.sleep(8000);
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.InboundASI_Icon, 30);

	}
	
	@When("clicked for ASI and TSP of Export")
	public void clicked_for_asi_and_tsp_of_export() throws Throwable {
		Thread.sleep(10000);
		Nmial_Outbound.InboundASI_Icon.click();
		Thread.sleep(10000);
		Nmial_Outbound.ProceedInboundASI_Btn.click();
		Thread.sleep(8000);
        Nmial_Outbound.OkInboundASI_Btn.click();
		Thread.sleep(8000);
		
		wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.InboundTSP_Icon, 30);
		Nmial_Outbound.InboundTSP_Icon.click();
		Thread.sleep(3000);
		
		TestDataReader.ReadLoginDetails("NMIAL Agent");
		Thread.sleep(8000);
		Nmial_Outbound.TransactionPwd_Inbound_Tb.sendKeys(Password, Keys.END);
		Thread.sleep(8000);
		Nmial_Outbound.InboundTSP_PayNow_Btn.click();
		Thread.sleep(3000);
		Nmial_Outbound.YesPayNow_Popup_Btn.click();
		Thread.sleep(8000);
		Nmial_Outbound.OkTspGenerated_Btn.click();
		Thread.sleep(8000);

	}
	
	@When("clicked for Book Slot of Export")
	public void clicked_for_book_slot_of_export() throws Throwable {
	    Thread.sleep(3000);
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.Inbound_BookSlot_Icon, 30);    
	    Nmial_Outbound.Inbound_BookSlot_Icon.click();
	    Thread.sleep(10000);
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.AvailableSlot_Btn, 30);	    
	    Nmial_Outbound.AvailableSlot_Btn.get(0).click();
	    Thread.sleep(3000);
        Nmial_Outbound.VehicleNo_Tb.sendKeys("MHAB"+wm.RandomNo(5), Keys.END);	    Thread.sleep(3000);
        Nmial_Outbound.DriverName_Tb.sendKeys("damini", Keys.END);	    Thread.sleep(3000);
        Nmial_Outbound.DriverMobileNo_Tb.sendKeys("982"+wm.RandomNo(7), Keys.END);	    Thread.sleep(3000);
        Nmial_Outbound.DriverLicenseNo_Tb.sendKeys("DL"+wm.RandomNo(5), Keys.END);	    Thread.sleep(3000);
        
        Nmial_Outbound.InboundSaveSlot_Btn.click();
	    Thread.sleep(3000);
	    Nmial_Outbound.Inbound_OkSlotBooked_Btn.click();
	    Thread.sleep(3000);

	}
	
	@When("click on Parking In icon of Inbound Vehicle and click on Refresh button of Export")
	public void click_on_parking_in_icon_of_inbound_vehicle_and_click_on_refresh_button_of_export() throws Throwable {
	    Thread.sleep(3000);
	    Select cargoTypeDD= new Select(Nmial_Outbound.CargoType_DD);
	    cargoTypeDD.selectByVisibleText("Domestic");
		Thread.sleep(8000);

	    Nmial_Outbound.SearchParking_Tb.sendKeys("IND", Keys.END);
		Thread.sleep(20000);
//		wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.ParkingIn_Icon.get(0), 30);

		 Nmial_Outbound.ParkingIn_Icon.get(Nmial_Outbound.ParkingIn_Icon.size()-1).click();
//		    Nmial_Outbound.ParkingIn_Icon.get(Nmial_Outbound.ParkingIn_Icon.size()-1).click();
			Thread.sleep(20000);

		    Nmial_Outbound.OkParkingIn_Btn.click();
			Thread.sleep(20000);
	}
	
	//Inbound1.2
	@When("select {string} Branch dropdown of Nmial Dock")
	public void select_branch_dropdown_of_nmial_dock(String value) throws Throwable {
	   wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.DockBranch_Icon, 30);
		Thread.sleep(3000);
	   Nmial_Outbound.DockBranch_Icon.click();
		Thread.sleep(3000);
	   wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.Branch_List, 30);
	   Nmial_Outbound.Branch_List.click();
		Thread.sleep(3000);
		
	   Select modeDD= new Select(Nmial_Outbound.DockMode_DD);
	   modeDD.selectByIndex(1);
		Thread.sleep(3000);


	}
	
	@When("select {string} Terminal, {string} Cargo Type and {string} Mode")
	public void select_terminal_cargo_type_and_mode(String string, String string2, String string3) {
	
	}
	
	@When("assign dock for VT of Book Slot")
	public void assign_dock_for_vt_of_book_slot() {
	
	}
	
	@When("select Dock and clicked on Assign button")
	public void select_dock_and_clicked_on_assign_button() {
	
	}
	
	@When("click on VCT Generation for Imports>> Warehouse Location  for {string} booked AWB in GHA")
	public void click_on_vct_generation_for_imports_warehouse_location_for_booked_awb_in_gha(String value) throws Throwable {
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
		
		List<String> tabs = new ArrayList<>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(0));
	      System.out.println("Back to original tab: " + driver.getTitle());
		  String AwbGenerated= Nmial_Outbound.InboundAWB1_Lbl.getText().toString().substring(4);
		     Thread.sleep(10000);

        driver.switchTo().window(tabs.get(1));
        System.out.println("Switched back to new tab: " + driver.getTitle());
	     Thread.sleep(10000);


		Nmial_Outbound.WH_Awb_Tb.sendKeys(AwbGenerated, Keys.END);
		Thread.sleep(8000);	

		Nmial_Outbound.WH_AwbSearch_Btn.click();
		Thread.sleep(8000);	
		Nmial_Outbound.GroupIdWH_Tb.sendKeys(wm.RandomNo(7), Keys.END);
		Thread.sleep(8000);	
		Nmial_Outbound.LocationWH_Icon.click();
		Thread.sleep(8000);	

		Nmial_Outbound.SaveLocationWH_Btn.click();
		Thread.sleep(8000);	
		driver.switchTo().defaultContent();		
//		Nmial_Outbound.WDO_Tab.click();
		Thread.sleep(8000);	
		driver.switchTo().frame(Nmial_Outbound.PageFrame);
		Thread.sleep(8000);		
		
		
	}
	
	@When("capture AWB details for Inbound Warehouse Location in GHA")
	public void capture_awb_details_for_inbound_warehouse_location_in_gha() {
	    
	}
	
	@When("click on VCT Generation for Imports>> Warehouse Location  for {string} AWB and Warehouse Delivery Order> Search AWB> Generate WDO> Released in GHA")
	public void click_on_vct_generation_for_imports_warehouse_location_for_awb_and_warehouse_delivery_order_search_awb_generate_wdo_released_in_gha(String value) throws Throwable {
		Thread.sleep(8000);		
		wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.ImportsGHA_Tab, 30);
		Nmial_Outbound.ImportsGHA_Tab.click();
		Thread.sleep(8000);		
		Nmial_Outbound.WarehouseLocation_Tab.click();
		Thread.sleep(8000);	
		driver.switchTo().frame(Nmial_Outbound.PageFrame);
		Thread.sleep(8000);	
		Nmial_Outbound.WH_AwbPfx_Tb.sendKeys("312", Keys.END);
		Nmial_Outbound.WH_Awb_Tb.sendKeys(value, Keys.END);		
		Nmial_Outbound.WH_AwbSearch_Btn.click();
		Thread.sleep(8000);	
//		 String p= driver.getWindowHandle();
//	  		Set<String> s= driver.getWindowHandles();
//	  		Iterator<String> I= s.iterator();
//	  		Object[] windowHandles= driver.getWindowHandles().toArray();
//	  		driver.switchTo().window((String) windowHandles[2]);
//	  		System.out.println(driver.getTitle());
//	  	wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.AwbWH_Hyperlink, 30);
//		Thread.sleep(8000);	

//	  	Nmial_Outbound.AwbWH_Hyperlink.get(0).click();
//		Thread.sleep(8000);	
//		
//		driver.switchTo().defaultContent();
//		Thread.sleep(8000);	
//  		driver.switchTo().window((String) windowHandles[1]);
//		Thread.sleep(8000);	

//		driver.switchTo().frame(Nmial_Outbound.PageFrame);
//		Thread.sleep(8000);	
		Nmial_Outbound.GroupIdWH_Tb.sendKeys(wm.RandomNo(7), Keys.END);
		Thread.sleep(8000);	
		Nmial_Outbound.LocationWH_Icon.click();
		Thread.sleep(8000);	
//	 		windowHandles= driver.getWindowHandles().toArray();
//	  		driver.switchTo().window((String) windowHandles[2]);
//	  		System.out.println(driver.getTitle());
//	  	wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.LocationWH_Hyperlink, 30);
//	  	Nmial_Outbound.LocationWH_Hyperlink.get(6).click();
//		Thread.sleep(8000);	
		
		Nmial_Outbound.SaveLocationWH_Btn.click();
		Thread.sleep(8000);	
		driver.switchTo().defaultContent();		
		Nmial_Outbound.WDO_Tab.click();
		Thread.sleep(8000);	
		driver.switchTo().frame(Nmial_Outbound.PageFrame);
		Thread.sleep(8000);	

		Select searchBy= new Select(Nmial_Outbound.SearchBy_DD);
		searchBy.selectByIndex(1);
		Thread.sleep(8000);	

		Nmial_Outbound.WdoAwbPfx_Tb.sendKeys("312", Keys.END);
		Nmial_Outbound.WdoAwb_Tb.sendKeys(value, Keys.END);
		Nmial_Outbound.WdoSearch_Btn.click();
		Thread.sleep(8000);	
        wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.WDO_Cb, 30);
        Nmial_Outbound.WDO_Cb.click();
		Thread.sleep(3000);	
		Nmial_Outbound.GenerateWDO_Btn.click();
		Thread.sleep(3000);	
		Nmial_Outbound.ReleaseWDO_Btn.click();
		Thread.sleep(3000);	

	}
	
	@Then("verify Parking In, Parking Out and Terminal GateIn for tpsuser")
	public void verify_parking_in_parking_out_and_terminal_gate_in_for_tpsuser() {
		String URL_GHA= "https://adaniuat.kalelogistics.com/GHAAdaniNMIDOMUAT/Login.aspx";

		((JavascriptExecutor) driver).executeScript("window.open('" + URL_GHA + "', '_blank');");    

        for (String handle : driver.getWindowHandles()) {
        driver.switchTo().window(handle);}
	}

	
	@When("click on Terminal Gate Out icon of tps user")
	public void click_on_terminal_gate_out_icon_of_tps_user() throws Throwable {
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.TerminalGateOut_Icon, 30);
	    Nmial_Outbound.TerminalGateOut_Icon.click();
		Thread.sleep(3000);	

	}

	@When("click on Imports>> More>> Import Operation Reports in GHA")
	public void click_on_imports_more_import_operation_reports_in_gha() throws Throwable {
	   Nmial_Outbound.Imports_Tab.click();
	   Nmial_Outbound.ImportMore_Hyperlink.click();
		Thread.sleep(8000);	

	   wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.ImportReports_Hyperlink, 30);
		Thread.sleep(8000);	

	   Nmial_Outbound.ImportReports_Hyperlink.click();
		Thread.sleep(8000);	
		
	   driver.switchTo().frame(Nmial_Outbound.PageFrame);
		Thread.sleep(8000);	

	   
	}
	
	@When("select {string} Type of Report in GHA Import")
	public void select_type_of_report_in_gha_import(String value) throws Throwable {
	    Select report= new Select(Nmial_Outbound.SelectReport_DD);
	    report.selectByVisibleText(value);
		Thread.sleep(8000);	

	    Nmial_Outbound.FromDate_Icon.click();
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.Calendar_Grid, 30);
	    Nmial_Outbound.Calendar_Grid.get(10).click();
	    
	    Nmial_Outbound.ToDate_Icon.click();
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.Calendar_Grid, 30);
	    Nmial_Outbound.Calendar_Grid.get(Nmial_Outbound.Calendar_Grid.size()-5).click();
		Thread.sleep(8000);	
		Nmial_Outbound.ViewReport_Btn.click();
		Thread.sleep(8000);	

	}
	
	//Mutiple Mawb location
	@When("click on VCT Generation for Imports>> Warehouse Location  for {string} AWB in GHA")
	public void click_on_vct_generation_for_imports_warehouse_location_for_awb_in_gha(String value) throws Throwable {
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

		Nmial_Outbound.WH_AwbSearch_Btn.click();
		Thread.sleep(8000);	
		Nmial_Outbound.GroupIdWH_Tb.sendKeys(wm.RandomNo(7), Keys.END);
		Thread.sleep(8000);	
		Nmial_Outbound.LocationWH_Icon.click();
		Thread.sleep(8000);	

		Nmial_Outbound.SaveLocationWH_Btn.click();
		Thread.sleep(8000);	
		driver.switchTo().defaultContent();		
//		Nmial_Outbound.WDO_Tab.click();
		Thread.sleep(8000);	
		driver.switchTo().frame(Nmial_Outbound.PageFrame);
		Thread.sleep(8000);	

	}
	
	@When("click on Move icon of AWB in GHA")
	public void click_on_move_icon_of_awb_in_gha() {
	   Nmial_Outbound.Move_Icon.click();
	}
	
	@When("select new location and click on Save button in GHA")
	public void select_new_location_and_click_on_save_button_in_gha() throws Throwable {
		Nmial_Outbound.LocationWH_Icon.click();
		Thread.sleep(8000);	

		Nmial_Outbound.SaveLocationWH_Btn.click();
		Thread.sleep(8000);	
		driver.switchTo().defaultContent();		

	}
	
	//Billing
	@When("enter {string} AWB, {string} Document Type and click on Search button for Import")
	public void enter_awb_document_type_and_click_on_search_button_for_import(String string, String string2) throws Throwable {
		List<String> tabs = new ArrayList<>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(0));
	      System.out.println("Back to original tab: " + driver.getTitle());
		  String AwbGenerated= Nmial_Outbound.InboundAWB1_Lbl.getText().toString();
	     Thread.sleep(3000);
		Nmial_Outbound.Logout_Menu.click();
		wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.Logout_Icon, 30);
		Thread.sleep(3000);
     	Nmial_Outbound.Logout_Icon.click();
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(3000);

        driver.switchTo().window(tabs.get(1));
        System.out.println("Switched back to new tab: " + driver.getTitle());
	     Thread.sleep(3000);
	     
	     Nmial_Outbound.Billing_Tab.click();
		   Thread.sleep(3000);
		   Nmial_Outbound.CustomerInvoice_Tab.click();
		   Thread.sleep(3000);
		   driver.switchTo().frame(Nmial_Outbound.PageFrame);
		   Thread.sleep(3000);
	     
		Select documentDD= new Select(Nmial_Outbound.DocumentType_DD);
		documentDD.selectByIndex(2);
		   Thread.sleep(8000);
		   
		Nmial_Outbound.DocumentID_Tb.click();
		   Thread.sleep(8000);
		Nmial_Outbound.DocumentID_Tb.sendKeys(AwbGenerated, Keys.TAB);
		   Thread.sleep(3000);

		Nmial_Outbound.SearchInvoice_Btn.click();
		   Thread.sleep(8000);

	}

	
	@When("click on Billing> Customer Invoice for Outbound")
	public void click_on_billing_customer_invoice_for_outbound() throws Throwable {
	   Nmial_Outbound.Billing_Tab.click();
	   Thread.sleep(3000);
	   Nmial_Outbound.CustomerInvoice_Tab.click();
	   Thread.sleep(3000);
	   driver.switchTo().frame(Nmial_Outbound.PageFrame);
	   Thread.sleep(3000);

	   
	}
	
	@When("click on Billing> Customer Invoice for Inbound")
	public void click_on_billing_customer_invoice_for_inbound() throws Throwable {
		Nmial_Outbound.Billing_Tab.click();
		   Thread.sleep(3000);
		   Nmial_Outbound.CustomerInvoice_Tab.click();
		   Thread.sleep(3000);
		   driver.switchTo().frame(Nmial_Outbound.PageFrame);
		   Thread.sleep(3000);

	}
	
	@When("enter {string} AWB and click on Search button for Outbound")
	public void enter_awb_and_click_on_search_button_for_outbound(String value) throws Throwable {
		Nmial_Outbound.DocumentID_Tb.sendKeys(value, Keys.TAB);
		   Thread.sleep(3000);

		Nmial_Outbound.SearchInvoice_Btn.click();
		   Thread.sleep(8000);

	}
	
	@When("enter {string} AWB, {string} Document Type and click on Search button for Outbound")
	public void enter_awb_document_type_and_click_on_search_button_for_outbound(String value1, String value2) throws Throwable {
		Select documentDD= new Select(Nmial_Outbound.DocumentType_DD);
		documentDD.selectByIndex(2);
		   Thread.sleep(8000);
		   
		Nmial_Outbound.DocumentID_Tb.click();
		   Thread.sleep(8000);
		Nmial_Outbound.DocumentID_Tb.sendKeys(value1, Keys.TAB);
		   Thread.sleep(3000);

		Nmial_Outbound.SearchInvoice_Btn.click();
		   Thread.sleep(8000);
	}
	
	@When("click on Calculate Charge button for Outbound")
	public void click_on_calculate_charge_button_for_outbound() throws Throwable {
		Nmial_Outbound.CalculateCharges_Btn.click();
		   Thread.sleep(8000);
        wm.scrollTillElement(driver, Nmial_Outbound.PayProceed_Btn);
		   Thread.sleep(10000);

	}
	
	@When("select {string} Mode of Payment and clicked on Pay Proceed button for Outbound")
	public void select_mode_of_payment_and_clicked_on_pay_proceed_button_for_outbound(String value) throws Throwable {
		Nmial_Outbound.PayProceed_Btn.click();
		   Thread.sleep(8000);
		wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.GeneratedOutboundInvoice_Lbl, 30);
		   Thread.sleep(8000);
		
		String generatedInv= Nmial_Outbound.GeneratedOutboundInvoice_Lbl.getText();
		   Thread.sleep(8000);
   
	   driver.switchTo().defaultContent();
		   Thread.sleep(3000);
        Nmial_Outbound.Billing_Tab.click();
		   Thread.sleep(3000);
		Nmial_Outbound.CreditNote_Tab.click();
		   Thread.sleep(3000);
		driver.switchTo().frame(Nmial_Outbound.PageFrame);
		   Thread.sleep(3000);

	    Nmial_Outbound.InvoiceCreditNote_Tb.sendKeys(generatedInv, Keys.END);
		   Thread.sleep(3000);
	}
	
	@When("click on Billing> Credit Note for Outbound")
	public void click_on_billing_credit_note_for_outbound() throws Throwable {
		

	}
	
	@When("enter {string} generated Invoice No and click on Search button for Outbound")
	public void enter_generated_invoice_no_and_click_on_search_button_for_outbound(String value) throws Throwable {
        Nmial_Outbound.SearchInvoiceCN_Btn.click();
		   Thread.sleep(3000);
        wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.InvoiceNoCN_Hyperlink, 30);
		   Thread.sleep(3000);

	}
	
	@When("click on Invoice hyperlink for Outbound")
	public void click_on_invoice_hyperlink_for_outbound() throws Throwable {
		Nmial_Outbound.InvoiceNoCN_Hyperlink.click();
		   Thread.sleep(3000);

	}
	
	@When("enter {string} Credit percentage and clicked on Pay Proceed button for Outbound")
	public void enter_credit_percentage_and_clicked_on_pay_proceed_button_for_outbound(String value) throws Throwable {
	    Nmial_Outbound.PercentageCN_Tb.sendKeys(value, Keys.TAB);
		   Thread.sleep(3000);

	    Nmial_Outbound.RemarksCN_Tb.sendKeys("testing", Keys.END);
		   Thread.sleep(3000);

	    Nmial_Outbound.ProceedCN_Btn.click();
		   Thread.sleep(3000);
        wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.InvoiceNoCN1_Hyperlink, 30);
	}
	
    //Demurrage Charge
	@When("click on PE icon for GHA")
	public void click_on_pe_icon_for_gha() throws Throwable {
		Nmial_Outbound.PE_Icon.click();
		String p= driver.getWindowHandle();
  		Set<String> s= driver.getWindowHandles();
  		Iterator<String> I= s.iterator();
  		Object[] windowHandles= driver.getWindowHandles().toArray();
  		driver.switchTo().window((String) windowHandles[1]);
  		System.out.println(driver.getTitle());
		   Thread.sleep(50000);
        wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.Tariff_Icon, 30);

	}
	
	@When("clicked on Tariff> Tariff Configurator for GHA")
	public void clicked_on_tariff_tariff_configurator_for_gha() throws Throwable {
		Nmial_Outbound.Tariff_Icon.click();
		   Thread.sleep(3000);
	    Nmial_Outbound.TariffConfigurator_Icon.click();
		   Thread.sleep(3000);

	}
	
	@When("clicked on logout button for GHA")
	public void clicked_on_logout_button_for_gha() throws Throwable {
        driver.switchTo().defaultContent();
		   Thread.sleep(3000);
        Nmial_Outbound.GhaLogout_Icon.click();
		   Thread.sleep(3000);

           
	}

}
