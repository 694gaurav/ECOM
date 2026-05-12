package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.masterthought.cucumber.json.Row;

import static Helper.BaseObjects.*;
import static Helper.BaseVariables.BrowserName;
import static Helper.BaseVariables.Entity;
import static Helper.BaseVariables.Password;
import static Helper.BaseVariables.Username;
import static Helper.Constants.*;
import static Helper.Constants.URL_GHA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.io.*;


import Pages.ACS_GHA_XPath;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.Table.Cell;

import Pages.ACS_GHA_XPath;
import TestDataOperations.TestDataReader;
import Utils.BrowserUtils;


public class NMIAL_Outbound {
	String originalTab = driver.getWindowHandle();
	String AwbGenerated;
	Actions a= new Actions(driver);
	
	@When("I login with {string} ACS Agent user given in {string} sheet for Export module")
	public void i_login_with_acs_agent_user_given_in_sheet_for_export_module(String entity, String sheetName) throws Throwable {
		Entity = entity;
		TestDataReader.ReadLoginDetails(Entity);
		Thread.sleep(8000);
//		try {
//		wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.Authentication_Popup, 30);
//		Nmial_Outbound.Authentication_Popup.click();
//		}
//		catch(Exception e) {
//			System.out.println("No Popup");
//			
//		}
		Thread.sleep(8000);
		wm.VisibilityOfElementExplicityWait(driver, loginScreen.nmialLogin_Btn, 30);
        wm.scrollTillElement(driver, loginScreen.nmialLogin_Btn);
		System.out.println("usr= " + Username);
		System.out.println("pwd= " + Password);
		// loginScreen.isLoginScreenDisplayed();
		loginScreen.Nmial_Login(Entity, Username, Password);
		Thread.sleep(8000);

	}

	@When("click on {int} Copy Master AWB icon of Export")
	public void click_on_copy_master_awb_icon_of_export(Integer int1) throws Throwable {
	     wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.CopyAWB_Icon, 30);
			Thread.sleep(8000);

	     Nmial_Outbound.CopyAWB_Icon.click();
			Thread.sleep(8000);

	     wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.YesCopyAWB_Btn, 30);
	}
	
	@When("click on Yes button of Copy AWB Confirmation button of Export")
	public void click_on_yes_button_of_copy_awb_confirmation_button_of_export() throws Throwable {
		Nmial_Outbound.YesCopyAWB_Btn.click();
		Thread.sleep(8000);

		wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.CopyAWB_Pfx_Tb, 30);
		
	}
	
	@When("enter {string} AWB Pfx and AWB No of Export")
	public void enter_awb_pfx_and_awb_no_of_export(String value) throws Throwable {
		Select CTO_DD= new Select(Nmial_Outbound.SelectCTO_DD);
		CTO_DD.selectByIndex(2);		
		
		Nmial_Outbound.CopyAWB_Pfx_Tb.sendKeys(value, Keys.END);
		Thread.sleep(8000);

		Nmial_Outbound.CopyAWB_Tb.sendKeys(wm.Random_awbNo(), Keys.END);
		Thread.sleep(8000);

	}
	
	@When("enter {string} Flight No and select Flight Date of Export")
	public void enter_flight_no_and_select_flight_date_of_export(String value) throws Throwable {
		Nmial_Outbound.Origin_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
		Nmial_Outbound.Origin_Tb.sendKeys("NMI", Keys.TAB);
		
		Nmial_Outbound.Destination_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
		Nmial_Outbound.Destination_Tb.sendKeys("BOM", Keys.TAB);
		
		Nmial_Outbound.FlightDate_Icon.click();

		Nmial_Outbound.AwbFlightNo_Tb.sendKeys("123", Keys.END);
		Thread.sleep(8000);

	}
	
	@When("click on AWB Save button of Export")
	public void click_on_awb_save_button_of_export() throws Throwable {
	   Nmial_Outbound.SaveAWB_Btn.click();
		Thread.sleep(8000);
		wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.OkSavedAWB_Btn, 30);

	}
	
	@When("click on AWB Saved Ok button of Export")
	public void click_on_awb_saved_ok_button_of_export() throws Throwable {
		Nmial_Outbound.OkSavedAWB_Btn.click();
		Thread.sleep(8000);

	}

	@When("click on AWB ASI icon of Export")
	public void click_on_awb_asi_icon_of_export() throws Throwable {
		Thread.sleep(8000);
		wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.AWB_ASI_Icon, 30);
	    Nmial_Outbound.AWB_ASI_Icon.click();
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.ProceedAWB_Btn, 30);
		Thread.sleep(10000);

	}
	
	@When("click on Proceed button and click on Yes Confirmation button of Export")
	public void click_on_proceed_button_and_click_on_yes_confirmation_button_of_export() throws Throwable {
		Thread.sleep(8000);
		Nmial_Outbound.ProceedAWB_Btn.click();
		wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.YesASI_Confirmation_Btn, 30);
		Thread.sleep(20000);
		Nmial_Outbound.YesASI_Confirmation_Btn.click();
		Thread.sleep(20000);
		wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.SentASI_Ok_Btn, 30);
		Nmial_Outbound.SentASI_Ok_Btn.click();
		Thread.sleep(8000);

	}
	
	@When("click on CO icon and click on Yes button in CO Request popup screen of Export")
	public void click_on_co_icon_and_click_on_yes_button_in_co_request_popup_screen_of_export() throws Throwable {
		Thread.sleep(8000);
        Nmial_Outbound.CO_Icon.click();
        wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.CO_Request_Popup, 30);
        Nmial_Outbound.YesCO_Request_Btn.click();
        wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.OkCO_Request_Btn, 30);
        Nmial_Outbound.OkCO_Request_Btn.click();
        wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.ApprovedCO_Icon, 30);
		Thread.sleep(3000);

	}
	
	@When("click on Logout button of ACS Agent of Export")
	public void click_on_logout_button_of_acs_agent_of_export() throws Throwable {
		Thread.sleep(3000);
		Nmial_Outbound.Logout_Menu.click();
		wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.Logout_Icon, 30);
		Thread.sleep(8000);

		Nmial_Outbound.Logout_Icon.click();
		Thread.sleep(8000);

	}
	
	@When("I login with {string} ACS Airline user given in {string} sheet for Export module")
	public void i_login_with_acs_airline_user_given_in_sheet_for_export_module(String entity, String sheetName) throws Throwable {
		Entity = entity;
		TestDataReader.ReadLoginDetails(Entity);
		Thread.sleep(8000);
		wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.Authentication_Popup, 30);
		Nmial_Outbound.Authentication_Popup.click();
		Thread.sleep(8000);

		System.out.println("usr= " + Username);
		System.out.println("pwd= " + Password);
		// loginScreen.isLoginScreenDisplayed();
		loginScreen.Nmial_Login(Entity, Username, Password);
		Thread.sleep(3000);

	}
	
	@When("click on Action icon to approve or reject submitted CTO for Export")
	public void click_on_action_icon_to_approve_or_reject_submitted_cto_for_export() throws Throwable {
        wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.AirlineAction_Icon, 30);
		Thread.sleep(8000);

        Nmial_Outbound.AirlineAction_Icon.click();
		Thread.sleep(3000);
	
	}
	
	@When("click on Approve button for Export")
	public void click_on_approve_button_for_export() throws Throwable {
        Nmial_Outbound.ApproveCO_Btn.click();
        Nmial_Outbound.YesProceedCO_Btn.click();
		wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.CO_Approved_Btn, 30);
		Nmial_Outbound.CO_Approved_Btn.click();
		Thread.sleep(3000);

	}
     
	@When("launch browser for GHA application and login with {string} ACS GHA user given in {string} sheet for Bial GHA")
	public void launch_browser_for_gha_application_and_login_with_acs_gha_user_given_in_sheet_for_bial_gha(String entity, String sheetName) throws Throwable {
		String URL_GHA= "https://galaxycmsuat.adani.com/GHAAdaniNMIDOMUAT/DashBoard.aspx#";
//		String URL_GHA= "https://adaniuat.kalelogistics.com/GHAAdaniNMIDOMUAT/Login.aspx";

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



	@When("launch browser for GHA application and login with {string} ACS GHA user given in {string} sheet for Export module")
	public void launch_browser_for_gha_application_and_login_with_acs_gha_user_given_in_sheet_for_export_module(String entity, String sheetName) throws Throwable {
		String URL_GHA= "https://galaxycmsuat.adani.com/GHAAdaniNMIDOMUAT/DashBoard.aspx#";
		((JavascriptExecutor) driver).executeScript("window.open('" + URL_GHA+ "', '_blank');");    
		
        for (String handle : driver.getWindowHandles()) {
        driver.switchTo().window(handle);}
        
		Entity = entity;
		TestDataReader.ReadLoginDetails(entity);
		Thread.sleep(500);
		System.out.println("usr= " + Username);
		System.out.println("pwd= " + Password);
		// loginScreen.isLoginScreenDisplayed();
		
		loginScreen.GHA_Login(entity, Username, Password);
		Thread.sleep(8000);
	}

	@When("launch browser for GHA application and login with {string} Galaxy Bial user given in {string} sheet and capture generated details for Export module")
	public void launch_browser_for_gha_application_and_login_with_galaxy_bial_user_given_in_sheet_and_capture_generated_details_for_export_module(String entity, String sheetName) throws Throwable {
		String URL_Bial= "https://galaxyuat.kalelogistics.com/GalaxyV3DOM/Login.aspx";
		((JavascriptExecutor) driver).executeScript("window.open('" + URL_Bial+ "', '_blank');");    
		
        for (String handle : driver.getWindowHandles()) {
        driver.switchTo().window(handle);}
        
		Entity = entity;
		TestDataReader.ReadLoginDetails(entity);
		Thread.sleep(500);
		System.out.println("usr= " + Username);
		System.out.println("pwd= " + Password);
		// loginScreen.isLoginScreenDisplayed();
		
		loginScreen.Bial_Login(entity, Username, Password);
		Thread.sleep(8000);
 	

	    List<String> tabs = new ArrayList<>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(0));
	      System.out.println("Back to original tab: " + driver.getTitle());
			AwbGenerated= Nmial_Outbound.UnkShipment_Grid.getText().toString();
		     Thread.sleep(10000);

        driver.switchTo().window(tabs.get(1));
        System.out.println("Switched back to new tab: " + driver.getTitle());
	     Thread.sleep(10000);

//		Nmial_Outbound.OldAwb_Tb.sendKeys(wm.Random_awbNo(), Keys.END);

	}

	
	@When("I login with {string} ACS GHA credentials")
	public void i_login_with_acs_gha_credentials(String value) {
		
	}
	
	@When("capture generated AWB details for Export")
	public void capture_generated_awb_details_for_export() throws Throwable {
        driver.switchTo().window(originalTab);
        System.out.println("Back to original tab: " + driver.getTitle());

       Thread.sleep(10000);
		AwbGenerated= Nmial_Outbound.GeneratedAWB_Grid.getText().toString();

       String[] awb = AwbGenerated.split("-");
       System.out.println(awb[0]+"\t"+awb[1]);

              // Print the results
              for (String part : awb) {
                  System.out.println(part);
              }

              List<String> tabs = new ArrayList<>(driver.getWindowHandles());

              driver.switchTo().window(tabs.get(1));
              System.out.println("Switched back to new tab: " + driver.getTitle());

        	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.Exports_Tab, 30);
        	    Nmial_Outbound.Exports_Tab.click();
        	    Nmial_Outbound.AwbDetail_Tab.click();
        	    
        	    driver.switchTo().defaultContent();
        	    Thread.sleep(1000);
        	    driver.switchTo().frame(Nmial_Outbound.PageFrame);
        	    Thread.sleep(1000);
        	    
        	    Nmial_Outbound.AwbPrefix_Tb.sendKeys(awb[0], Keys.END);
        	    Thread.sleep(1000);
        	    Nmial_Outbound.Awb_Tb.sendKeys(awb[1], Keys.TAB);
        	    Thread.sleep(5000);     

	}

	
	@When("click on Exports>> AWB Detail and enter generated AWB in AWB fields for search in Export GHA")
	public void click_on_exports_awb_detail_and_enter_generated_awb_in_awb_fields_for_search_in_export_gha() throws Throwable {

	}
	
	@Then("verify CO as Approved in Export GHA")
	public void verify_co_as_approved_in_export_gha() {	
        driver.switchTo().window(originalTab);
        System.out.println("Back to original tab: " + driver.getTitle());

		
	}
	
		
	@When("click on TSP icon, enter details and click on Pay Now button of Export")
	public void click_on_tsp_icon_enter_details_and_click_on_pay_now_button_of_export() throws Throwable {
         Thread.sleep(20000);
		  wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.TSP_Icon, 30);
		  Nmial_Outbound.TSP_Icon.click();
		    Thread.sleep(20000);
		  TestDataReader.ReadLoginDetails("NMIAL Agent");
			Thread.sleep(20000);
		  Nmial_Outbound.TransactionPwd_TSP_Tb.sendKeys(Password, Keys.END);
		    Thread.sleep(8000);
		  Nmial_Outbound.PayNow_Btn.click();
		    Thread.sleep(8000);
	      wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.YesPayNow_Popup_Btn, 30);
		    Thread.sleep(8000);
	}
	@When("click on Yes and Ok button for TSP in Export")
	public void click_on_yes_and_ok_button_for_tsp_in_export() throws Throwable {
		 Nmial_Outbound.YesPayNow_Popup_Btn.click();
		    Thread.sleep(8000);
		 Nmial_Outbound.OkTspGenerated_Btn.click();
		    Thread.sleep(8000);
	}

	
	@When("click on Book Slot icon after TSP generated of Export")
	public void click_on_book_slot_icon_after_tsp_generated_of_export() throws Throwable {
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.BookSlot_Icon, 30);
	    Nmial_Outbound.BookSlot_Icon.click();
	    Thread.sleep(8000);

	}
	
	@When("click on Available slot and enter Vehicle details of Export")
	public void click_on_available_slot_and_enter_vehicle_details_of_export() throws Throwable {
	    Thread.sleep(20000);
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.AvailableSlot_Btn, 30);
	    Nmial_Outbound.AvailableSlot_Btn.get(0).click();
	    Thread.sleep(3000);
	    Nmial_Outbound.VehicleNo_Tb.sendKeys("MH"+"AB"+wm.RandomNo(4), Keys.TAB);
	    Thread.sleep(1000);
    
	    Nmial_Outbound.DriverName_Tb.sendKeys("ramesh", Keys.TAB);
	    Thread.sleep(1000);

	    Nmial_Outbound.DriverMobileNo_Tb.sendKeys("982"+wm.RandomNo(7), Keys.END);
	    Thread.sleep(1000);

	    Nmial_Outbound.DriverLicenseNo_Tb.sendKeys("D"+wm.RandomNo(7), Keys.END);
	    Thread.sleep(3000);

	}
	
	@When("click on Save Book Slot button of Export")
	public void click_on_save_book_slot_button_of_export() throws Throwable {
		wm.scrollTillElement(driver, Nmial_Outbound.SaveSlot_Btn);
	    Nmial_Outbound.SaveSlot_Btn.click();
	    Thread.sleep(3000);
        wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.OkSlotBooked_Btn, 30);
        Nmial_Outbound.OkSlotBooked_Btn.click();
	    Thread.sleep(3000);
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.eDocket_Icon, 30);

	}
	
	@When("click on Slot Booked icon of Export")
	public void click_on_slot_booked_icon_of_export() throws Throwable {
	   wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.SlotBooked_Icon, 30);
	   Nmial_Outbound.SlotBooked_Icon.click();
	    Thread.sleep(30000);
	   wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.SelectSlot_Cb, 30);
	   
	}
	
	@When("select slot and click on Print VT button of Export")
	public void select_slot_and_click_on_print_vt_button_of_export() throws Throwable {
//	    Nmial_Outbound.SelectSlot_Cb.click();
	    Thread.sleep(8000);
        Nmial_Outbound.PrintVT_Btn.click();
	    Thread.sleep(3000);
	    
	    List<String> tabs = new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(tabs.get(0));
        System.out.println("Switched back to new tab: " + driver.getTitle());
	    Thread.sleep(3000);

        Nmial_Outbound.EditSlot_Btn.click();
	    Thread.sleep(3000);

	}
	
	@When("click on Update slot button, select slot and clicked on Update button of Export")
	public void click_on_update_slot_button_select_slot_and_clicked_on_update_button_of_export() throws Throwable {
        Nmial_Outbound.ChooseSlot_Btn.click();
	    Thread.sleep(3000);

        wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.AvailableSlots_Popup, 30);
	    Thread.sleep(3000);
        Nmial_Outbound.CancelAvailableSlots_Btn.click();
	    Thread.sleep(3000);
	    Nmial_Outbound.BackSlot_Btn.click();
	    Thread.sleep(3000);

	}
	
	//Send Manifest
	@When("click on Booked Slot icon of Export")
	public void click_on_booked_slot_icon_of_export() {
        wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.SlotBooked_Icon, 30);
        Nmial_Outbound.SlotBooked_Icon.click();
	}

	
	@When("click on Send Manifest icon of Export")
	public void click_on_send_manifest_icon_of_export() throws Throwable {
	    Thread.sleep(8000);
		wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.SendManifest_Icon, 30);
		Nmial_Outbound.SendManifest_Icon.click();
	    Thread.sleep(8000);
		wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.SendManifestEmail_Tb, 30);
	    Thread.sleep(8000);

	}
	
	@When("enter {string} email and click on Send Email button of Export")
	public void enter_email_and_click_on_send_email_button_of_export(String value) throws Throwable {
//		Nmial_Outbound.SendManifestEmail_Tb.sendKeys(value, Keys.END);
//	    Thread.sleep(8000);
//        a.moveToElement(Nmial_Outbound.CloseMail_Btn).doubleClick(Nmial_Outbound.CloseMail_Btn).click().build().perform();
//		Nmial_Outbound.SendMail_Btn.click();
	    Thread.sleep(8000);

	}
	
	//ACS Receipt
	@When("click on ACS Receipt icon of Export")
	public void click_on_acs_receipt_icon_of_export() throws Throwable {
		List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        System.out.println("Switched back to new tab: " + driver.getTitle());

		wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.AcsReceipt_Icon, 30);
		Nmial_Outbound.AcsReceipt_Icon.click();
	    Thread.sleep(8000);
        driver.switchTo().window(tabs.get(0));
        System.out.println("Switched back to new tab: " + driver.getTitle());

	}


	@When("click on eDocket icon of Export")
	public void click_on_e_docket_icon_of_export() throws Throwable {
		Nmial_Outbound.eDocket_Icon.click();
	    Thread.sleep(8000);
		wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.eDocket_Popup, 30);
	    Thread.sleep(8000);

	}
	
	@When("select and upload documents of Export")
	public void select_and_upload_documents_of_export() throws Throwable {
		Select DocType_DD= new Select(Nmial_Outbound.SelectDocument1_DD);
		DocType_DD.selectByIndex(4);
	    Thread.sleep(3000);
	    Nmial_Outbound.ChooseFile1_Btn.sendKeys("D:\\Report.pdf");

		DocType_DD= new Select(Nmial_Outbound.SelectDocument2_DD);
		DocType_DD.selectByIndex(12);
	    Thread.sleep(3000);
	    Nmial_Outbound.ChooseFile2_Btn.sendKeys("D:\\Report.pdf");
	    Thread.sleep(3000);

		Nmial_Outbound.SelectAll_Cb.click();
	    Thread.sleep(3000);

	}
	
	@When("click on eDocket Submit button and Ok button of Export")
	public void click_on_e_docket_submit_button_and_ok_button_of_export() throws Throwable {
		Nmial_Outbound.eDocketSubmit_Btn.click();
		wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.OkeDocket_Btn, 30);
		Nmial_Outbound.OkeDocket_Btn.click();
	    Thread.sleep(3000);
	    
	    List<String> tabs = new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(tabs.get(1));
        System.out.println("Switched back to new tab: " + driver.getTitle());
        driver.switchTo().window(tabs.get(0));
        System.out.println("Switched back to new tab: " + driver.getTitle());

	}
	
	//TPS- Parking In
	@When("I login with {string} TPS user given in {string} sheet for Export module")
	public void i_login_with_tps_user_given_in_sheet_for_export_module(String entity, String sheetName) throws Throwable {
		Entity = entity;
		TestDataReader.ReadLoginDetails(Entity);
		Thread.sleep(500);
		Thread.sleep(8000);
		wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.Authentication_Popup, 30);
		Nmial_Outbound.Authentication_Popup.click();
		Thread.sleep(8000);
		wm.VisibilityOfElementExplicityWait(driver, loginScreen.nmialLogin_Btn, 30);
		System.out.println("usr= " + Username);
		System.out.println("pwd= " + Password);
		// loginScreen.isLoginScreenDisplayed();
		loginScreen.Nmial_Login(Entity, Username, Password);
		Thread.sleep(8000);
	}
	
	@When("select Cargo Type of Export")
	public void select_cargo_type_of_export() throws Throwable {
	    Select cargoTypeDD= new Select(Nmial_Outbound.CargoType_DD);
	    cargoTypeDD.selectByVisibleText("Domestic");
		Thread.sleep(8000);

	    Nmial_Outbound.SearchParking_Tb.sendKeys("OUD", Keys.END);
		Thread.sleep(20000);
//		wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.ParkingIn_Icon.get(0), 30);

	}
	
	@When("click on Parking In icon of Outbound Vehicle and click on Refresh button of Export")
	public void click_on_parking_in_icon_of_outbound_vehicle_and_click_on_refresh_button_of_export() throws Throwable {
	    Nmial_Outbound.ParkingIn_Icon.get(Nmial_Outbound.ParkingIn_Icon.size()-1).click();
//	    Nmial_Outbound.ParkingIn_Icon.get(Nmial_Outbound.ParkingIn_Icon.size()-1).click();
		Thread.sleep(20000);

	    Nmial_Outbound.OkParkingIn_Btn.click();
		Thread.sleep(20000);

	}
	
	@When("click on Parking Out icon of Outbound Vehicle and click on Refresh button of Export")
	public void click_on_parking_out_icon_of_outbound_vehicle_and_click_on_refresh_button_of_export() throws Throwable {
		Nmial_Outbound.ParkingOut_Icon.get(0).click();
		Thread.sleep(20000);

	    Nmial_Outbound.OkParkingIn_Btn.click();
		Thread.sleep(20000);
		
//		Nmial_Outbound.TerminalGateIn_Icon.get(0).click();
//	    Nmial_Outbound.OkParkingIn_Btn.click();
//		Thread.sleep(8000);
	    
	}
	
	@When("click on Terminal Gate In icon of Outbound Vehicle of Export")
	public void click_on_terminal_gate_in_icon_of_outbound_vehicle_of_export() throws Throwable {
		Nmial_Outbound.TerminalGateIn_Icon.get(0).click();
		Thread.sleep(20000);

	    Nmial_Outbound.OkParkingIn_Btn.click();
		Thread.sleep(20000);
	    List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        System.out.println("Switched back to new tab: " + driver.getTitle());
		Thread.sleep(8000);

	}


	//GHA
	@When("click on VCT>> VCT Generation in GHA")
	public void click_on_vct_vct_generation_in_gha() throws Throwable {
        Nmial_Outbound.VCT_Tab.click();
        wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.VctGeneration_Tab, 30);
        Nmial_Outbound.VctGeneration_Tab.click();
		Thread.sleep(8000);
		Nmial_Outbound.VCTnoOutbound_Record.click();

	}
	
	@Then("verify display of Park In and Park Out date time in GHA")
	public void verify_display_of_park_in_and_park_out_date_time_in_gha() {
	    
	}
	
	@When("click on VCT>> VCT Acceptance in GHA")
	public void click_on_vct_vct_acceptance_in_gha() throws Throwable {
        Nmial_Outbound.VctAcceptance_Tab.click();
		Thread.sleep(8000);

	}
	
	@Then("verify Gate In and Dock In of AWB in GHA")
	public void verify_gate_in_and_dock_in_of_awb_in_gha() throws Throwable {
		Nmial_Outbound.SearchVctAcceptance_Btn.click();
		Thread.sleep(8000);
		Nmial_Outbound.GateInDate_Tb.sendKeys(wm.CurrentDate("dd/MM/yyyy"), Keys.END);
		Nmial_Outbound.GateInTime_Tb.sendKeys("1600", Keys.END);

	}
	
	@When("enter GroupId, NOP with dimensions and click Accept Cargo button in GHA")
	public void enter_group_id_nop_with_dimensions_and_click_accept_cargo_button_in_gha() {
	   
	}
	
	@When("launch browser for GHA application and login with {string} Galaxy Bial user given in {string} sheet for Export module")
	public void launch_browser_for_gha_application_and_login_with_galaxy_bial_user_given_in_sheet_for_export_module(String entity, String sheetName) throws Throwable {
//		String URL_Bial= "https://galaxyuat.kalelogistics.com/GalaxyV3DOM/Login.aspx";
//		((JavascriptExecutor) driver).executeScript("window.open('" + URL_Bial+ "', '_blank');");    
//		
//        for (String handle : driver.getWindowHandles()) {
//        driver.switchTo().window(handle);}
//        
//		Entity = entity;
//		TestDataReader.ReadLoginDetails(entity);
//		Thread.sleep(500);
//		System.out.println("usr= " + Username);
//		System.out.println("pwd= " + Password);
//		// loginScreen.isLoginScreenDisplayed();
//		
//		loginScreen.Bial_Login(entity, Username, Password);
//		Thread.sleep(8000);

	}
	
	@When("click on More>> Tracing Unit for UNK shipment and click on Change AWB tab in Bial")
	public void click_on_more_tracing_unit_for_unk_shipment_and_click_on_change_awb_tab_in_bial() throws Throwable {
	    Nmial_Outbound.More_Icon.click();
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.TracingUnit_Hyperlink, 30);
	    Nmial_Outbound.TracingUnit_Hyperlink.click();
		Thread.sleep(8000);
		
		wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.ChangeAwb_Tab, 30);
		Nmial_Outbound.ChangeAwb_Tab.click();
		driver.switchTo().defaultContent();
	    Thread.sleep(1000);
	    driver.switchTo().frame(Nmial_Outbound.PageFrame);
	    Thread.sleep(1000);
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.OldAwbPfx_Tb, 30);
	    
	}
	
	@When("capture generated AWB details for Export for Bial")
	public void capture_generated_awb_details_for_export_for_bial() throws Throwable {
      driver.switchTo().window(originalTab);
      System.out.println("Back to original tab: " + driver.getTitle());

     Thread.sleep(10000);
		AwbGenerated= Nmial_Outbound.GeneratedAWB_Grid.getText().toString();
		

//     String[] awb = AwbGenerated.split("-");
//     System.out.println(awb[0]+"\t"+awb[1]);
//
//            // Print the results
//            for (String part : awb) {
//                System.out.println(part);
//            }
//
            List<String> tabs = new ArrayList<>(driver.getWindowHandles());

            driver.switchTo().window(tabs.get(1));
            System.out.println("Switched back to new tab: " + driver.getTitle());
    		Nmial_Outbound.OldAwb_Tb.sendKeys(wm.Random_awbNo(), Keys.END);

	}

	@When("capture UNK shipment details for BIAL")
	public void capture_unk_shipment_details_for_bial() throws Throwable {
        driver.switchTo().window(originalTab);
        System.out.println("Back to original tab: " + driver.getTitle());

       Thread.sleep(10000);
		AwbGenerated= Nmial_Outbound.UnkShipment_Grid.getText().toString();

	}

	@When("enter {string} old and new {string} AWB in Bial")
	public void enter_old_and_new_awb_in_bial(String value1, String value2) throws Throwable {
		Nmial_Outbound.OldAwbPfx_Tb.sendKeys(value1, Keys.TAB);
      String[] awb = AwbGenerated.split("-");
      System.out.println(awb[0]+"\t"+awb[1]);

             // Print the results
             for (String part : awb) {
                 System.out.println(part);
             }

    	Nmial_Outbound.OldAwb_Tb.sendKeys(awb[1], Keys.END);
        Thread.sleep(3000);

    	Nmial_Outbound.NewAwbPfx_Tb.sendKeys("999", Keys.END);
        Thread.sleep(3000);

    	Nmial_Outbound.NewAwb_Tb.sendKeys(wm.Random_awbNo(), Keys.END);
        Thread.sleep(3000);

	}	
	
	@When("click on Save icon for Change AWB in Bial")
	public void click_on_save_icon_for_change_awb_in_bial() throws Throwable {
        Thread.sleep(3000);
        Nmial_Outbound.SaveChangedAwb_Icon.click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(2));
        System.out.println("Switched back to new tab: " + driver.getTitle());

	}


	
	
	@When("click on Complete button in GHA")
	public void click_on_complete_button_in_gha() {
	   
	}
	
	@When("click on More>> Tracing Unit in GHA")
	public void click_on_more_tracing_unit_in_gha() {
	   
	}
	
	@When("click on VCT>> VCT Acceptance of GHA in Export")
	public void click_on_vct_vct_acceptance_of_gha_in_export() {
	   
	}
	
	@Then("verify complete Acceptance validation of UNK number of Export")
	public void verify_complete_acceptance_validation_of_unk_number_of_export() {
	   
	}
	
	@When("click on Outbound>> Track and Trace tab for Export")
	public void click_on_outbound_track_and_trace_tab_for_export() throws Throwable {
	    Nmial_Outbound.TrackAndTrace_Tab.click();
	    Thread.sleep(3000);     
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.AwbFilter_Tb, 30);
	
	}
	
	@Then("verify Parking, Dock and Warehouse Acceptance icons of GHA in Nmial Export")
	public void verify_parking_dock_and_warehouse_acceptance_icons_of_gha_in_nmial_export() {
	    
	}

	//Edit
	@When("click on Edit icon of created AWB of Export")
	public void click_on_edit_icon_of_created_awb_of_export() throws Throwable {
        Nmial_Outbound.EditAwb_Icon.click();
        Thread.sleep(3000);
	}
	
	@When("enter NOP and select {string} Cargo Type of Export")
	public void enter_nop_and_select_cargo_type_of_export(String value) throws Throwable {
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.EditNOP_Tb, 0);
	    Nmial_Outbound.EditNOP_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
	    Nmial_Outbound.EditNOP_Tb.sendKeys(wm.RandomNo(1), Keys.TAB);
	    Select cargoTypeDD= new Select(Nmial_Outbound.EditCargoType_DD);
	    cargoTypeDD.selectByVisibleText(value);
        Thread.sleep(3000);
        
        Select commodityDD= new Select(Nmial_Outbound.CommodityType_DD);
        commodityDD.selectByIndex(4);
        Thread.sleep(3000);

	}
	
	@When("click on Cancel icon of displayed record of Export")
	public void click_on_cancel_icon_of_displayed_record_of_export() throws Throwable {
		Nmial_Outbound.Back_Btn.click();
        Thread.sleep(3000);

	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.CancelAwb_Icon, 30);
	    Nmial_Outbound.CancelAwb_Icon.click();
        Thread.sleep(8000);
//        Nmial_Outbound.OkDelete_Btn.click();
//        Thread.sleep(3000);

	}
	
	//Single VT Single Shipment
	@When("click on Available slot and select {int} Unassigned shipments of Export")
	public void click_on_available_slot_and_select_unassigned_shipments_of_export(Integer row) throws Throwable {
	    Thread.sleep(50000);
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.AvailableSlot_Btn, 30);
	    Nmial_Outbound.AvailableSlot_Btn.get(0).click();
	    Thread.sleep(8000);
	    Nmial_Outbound.AddSlot_Icon.click();
	    Thread.sleep(8000);
	    Nmial_Outbound.UnassignedShipment_Tab.click();
	    Thread.sleep(3000);
	    
	    for(int j=1;j<= row;j++) {
        Nmial_Outbound.UnassignedShipment_Cb.get(j).click();
        }

	}
	
	@When("click on Proceed button of booked slot of Export")
	public void click_on_proceed_button_of_booked_slot_of_export() {
	    Nmial_Outbound.ProceedShipment_Btn.click();
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.SaveShipment_Btn, 30);
	}
	
	@When("click on Save Assign button of Outbound")
	public void click_on_save_assign_button_of_outbound() throws Throwable {
		Nmial_Outbound.SaveShipment_Btn.click();
	    Thread.sleep(3000);

	}
	
	@When("enter {string} NOP for shipment of Outbound")
	public void enter_nop_for_shipment_of_outbound(String value) throws Throwable {
        Nmial_Outbound.AllocatedNOP_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
        Nmial_Outbound.AllocatedNOP_Tb.sendKeys(value, Keys.END);
	    Thread.sleep(3000);

	}
	
	@When("enter Vehicle details of Outbound")
	public void enter_vehicle_details_of_outbound() throws Throwable {
	    Nmial_Outbound.VehicleNo_Tb.sendKeys("MH"+"AB"+wm.RandomNo(4), Keys.TAB);
	    Thread.sleep(1000);
    
	    Nmial_Outbound.DriverName_Tb.sendKeys("ramesh", Keys.TAB);
	    Thread.sleep(1000);

	    Nmial_Outbound.DriverMobileNo_Tb.sendKeys("982"+wm.RandomNo(7), Keys.END);
	    Thread.sleep(1000);

	    Nmial_Outbound.DriverLicenseNo_Tb.sendKeys("D"+wm.RandomNo(7), Keys.END);
	    Thread.sleep(3000);

	}

//Multiple Vehicle Single Shipment
	@When("enter {string} No of vehicles of Outbound")
	public void enter_no_of_vehicles_of_outbound(String value) throws Throwable {
	    Nmial_Outbound.NoOfVehicle_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
	    Thread.sleep(3000);
	    Nmial_Outbound.NoOfVehicle_Tb.sendKeys(value, Keys.END);
	    Thread.sleep(3000);
		wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.AvailableSlot_Btn, 30);

	}
	
	@When("select all displayed slots for Vehicle detail of Outbound")
	public void select_all_displayed_slots_for_vehicle_detail_of_outbound() throws Throwable {
		Nmial_Outbound.MultipleSlot_Cb.get(0).click();
	    Thread.sleep(3000);
	    Nmial_Outbound.AvailableSlot_Btn.get(0).click();
	    Thread.sleep(3000);
	    			    
	}
	
	@When("enter Vehicle1 detail,select shipment with {string} NOP and click View Shipment Proceed Save button of Outbound")
	public void enter_vehicle1_detail_select_shipment_with_nop_and_click_view_shipment_proceed_save_button_of_outbound(String value) throws Throwable {
		Nmial_Outbound.VehicleNo_Tb.sendKeys("MH"+"AB"+wm.RandomNo(4), Keys.TAB);
	    Thread.sleep(3000);
		Nmial_Outbound.DriverName_Tb.sendKeys("ramesh", Keys.TAB);
	    Thread.sleep(3000);
		Nmial_Outbound.DriverMobileNo_Tb.sendKeys("982"+wm.RandomNo(7), Keys.TAB);
	    Thread.sleep(3000);
		Nmial_Outbound.DriverLicenseNo_Tb.sendKeys("DL"+wm.RandomNo(4), Keys.TAB);
	    Thread.sleep(3000);
	    Nmial_Outbound.AddSlot_Icon.click();
	    Thread.sleep(3000);
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.UnassignedShipment_Tab, 30);
	    Nmial_Outbound.UnassignedShipment_Tab.click();
	    Thread.sleep(3000);

	    Nmial_Outbound.AllocateNOP1_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
	    Thread.sleep(3000);
	    Nmial_Outbound.AllocateNOP1_Tb.sendKeys(value, Keys.END);
	    Thread.sleep(3000);

	    Nmial_Outbound.ProceedShipment_Btn.click();
	    Thread.sleep(3000);
	    Nmial_Outbound.SaveShipment_Btn.click();  
	    Thread.sleep(3000);

	}
	
	@When("enter Vehicle2 detail and select shipment with {string} NOP and click View Shipment Proceed Save button of Outbound")
	public void enter_vehicle2_detail_and_select_shipment_with_nop_and_click_view_shipment_proceed_save_button_of_outbound(String value) throws Throwable {
		Nmial_Outbound.MultipleSlot_Cb.get(1).click();
	    Thread.sleep(3000);
	    Nmial_Outbound.AvailableSlot_Btn.get(1).click();
	    Thread.sleep(3000);

		String vehicle= Nmial_Outbound.VehicleNo_Tb.getText().toString();
		Nmial_Outbound.VehicleNo2_Tb.sendKeys(vehicle, Keys.TAB);
	    Thread.sleep(3000);
	    Nmial_Outbound.ViewSummary2_Icon.click();
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.OkShipmentAssign_Btn, 30);
	    Nmial_Outbound.OkShipmentAssign_Btn.click();
	    Thread.sleep(3000);

	}
	
	@When("enter Vehicle3 detail and select shipment with {string} NOP and click View Shipment Proceed Save button   of Outbound")
	public void enter_vehicle3_detail_and_select_shipment_with_nop_and_click_view_shipment_proceed_save_button_of_outbound(String value) throws Throwable {
		Nmial_Outbound.MultipleSlot_Cb.get(2).click();
	    Thread.sleep(3000);
	    Nmial_Outbound.AvailableSlot_Btn.get(2).click();
	    Thread.sleep(3000);
	    
	    String vehicle= Nmial_Outbound.VehicleNo2_Tb.getText().toString();
		Nmial_Outbound.VehicleNo3_Tb.sendKeys(vehicle, Keys.TAB);
	    Thread.sleep(3000);
	    Nmial_Outbound.ViewSummary3_Icon.click();
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.OkShipmentAssign_Btn, 30);
	    Nmial_Outbound.OkShipmentAssign_Btn.click();
	    Thread.sleep(3000);
	}

	@When("click on VCT> VCT Generation and click on Outbound VCT> VCT Acceptance for Export")
	public void click_on_vct_vct_generation_and_click_on_outbound_vct_vct_acceptance_for_export() throws Throwable {
	   Nmial_Outbound.VCT_Tab.click();
	    Thread.sleep(3000);
	   Nmial_Outbound.VctGeneration_Tab.click();
	    Thread.sleep(3000);

	    driver.switchTo().frame(Nmial_Outbound.PageFrame);
	    Thread.sleep(3000);
       Nmial_Outbound.VCTnoOutbound_Lbl.click();
	    Thread.sleep(3000);
       driver.switchTo().defaultContent();
	    Thread.sleep(3000);

       Nmial_Outbound.VctAcceptance_Tab.click();
	    driver.switchTo().frame(Nmial_Outbound.PageFrame);
	    Thread.sleep(8000);
	   wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.CargoAWB_Cb, 30);
	   Nmial_Outbound.CargoAWB_Cb.get(1).click();
	    Thread.sleep(8000);

	}
	
	@When("enter Dock In time and clicked on Dock In button for Export")
	public void enter_dock_in_time_and_clicked_on_dock_in_button_for_export() throws Throwable {
	    Nmial_Outbound.DockInTime_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
	    Thread.sleep(8000);
//	    Nmial_Outbound.DockInTime_Tb.sendKeys("1155", Keys.TAB);
	    Nmial_Outbound.DockIn_Btn.click();
	    Thread.sleep(8000);

	}
	
	@When("select {int} AWB, enter NOP, Length, Width, Height and click on Accept Cargo button for Export")
	public void select_awb_enter_nop_length_width_height_and_click_on_accept_cargo_button_for_export(Integer int1) throws Throwable {
	    Nmial_Outbound.NOP_Tb.sendKeys(Nmial_Outbound.CargoNOP_Lbl.getText(), Keys.TAB);
	    Nmial_Outbound.Length_Tb.sendKeys("100", Keys.TAB);
	    Thread.sleep(3000);
        String awb= Nmial_Outbound.CargoAWB_Lbl.getText().toString();
	    Nmial_Outbound.Width_Tb.sendKeys("50", Keys.TAB);
	    Thread.sleep(3000);

	    Nmial_Outbound.Height_Tb.sendKeys("30", Keys.TAB);
	    Thread.sleep(3000);

	    wm.scrollTillElement(driver, Nmial_Outbound.AcceptCargo_Btn);
	    Nmial_Outbound.AcceptCargo_Btn.click();
	    Thread.sleep(3000);
	    wm.scrollTillElement(driver, Nmial_Outbound.CargoAWB_Lbl);
       
	    driver.switchTo().defaultContent();
	    Thread.sleep(3000);
	    Nmial_Outbound.Exports_Tab.click();
	    Thread.sleep(3000);
        Nmial_Outbound.SecurityAcceptance_Tab.click();
	    Thread.sleep(3000);
	    driver.switchTo().frame(Nmial_Outbound.PageFrame);
	    Thread.sleep(3000);
        Nmial_Outbound.VctAwbFilter_Tb.sendKeys(awb,Keys.END);
	    Thread.sleep(3000);
        Nmial_Outbound.VctAwbDetail_Hyperlink.click();
	    Thread.sleep(3000);
	    driver.switchTo().defaultContent();
	    Thread.sleep(3000);
	    driver.switchTo().frame(Nmial_Outbound.PageFrame);
	    Thread.sleep(3000);

	}
	
	@Then("verify display of Accepted cargo list for Export")
	public void verify_display_of_accepted_cargo_list_for_export() {
	    
	}
	
	@When("click on Exports> Security Acceptance and search accepted AWB for Export")
	public void click_on_exports_security_acceptance_and_search_accepted_awb_for_export() throws Throwable {
	    
	}
	
	@When("click on Save Final Submit button for Export")
	public void click_on_save_final_submit_button_for_export() throws Throwable {
		 Select machineNoDD= new Select(Nmial_Outbound.MachineNo_DD);
	        machineNoDD.selectByIndex(1);
	        wm.scrollTillElement(driver, Nmial_Outbound.SaveAcceptance_Btn);
	        Nmial_Outbound.SaveAcceptance_Btn.click();
		    Thread.sleep(3000);
	}
	
	@When("click on Export> Build Manifest for Export")
	public void click_on_export_build_manifest_for_export() {
	    
	}

    //Build Manifest
	@When("click on Exports> Build Manifest")
	public void click_on_exports_build_manifest() throws Throwable {
	   Nmial_Outbound.Exports_Tab.click();
	   Thread.sleep(3000);
	   Nmial_Outbound.BuildManifest_Tab.click();
	   Thread.sleep(3000);
	   driver.switchTo().frame(Nmial_Outbound.PageFrame);
	   Thread.sleep(3000);

	}
	
	@When("select Flight and add {string} ULD of Export")
	public void select_flight_and_add_uld_of_export(String value) throws Throwable {
		Nmial_Outbound.FlightPfxBuildManifest_Tb.sendKeys("6e", Keys.TAB);
		   Thread.sleep(3000);
		Nmial_Outbound.FlightNoBuildManifest_Tb.sendKeys("999", Keys.TAB);
		   Thread.sleep(3000);
		Nmial_Outbound.SearchBuildManifest_Icon.click();
		   Thread.sleep(3000);

		Nmial_Outbound.UldPfxBuildManifest_Tb.sendKeys(value, Keys.TAB);
		   Thread.sleep(3000);
		Nmial_Outbound.UldNoBuildManifest_Tb.sendKeys(wm.RandomNo(4), Keys.TAB);
		   Thread.sleep(3000);
		Nmial_Outbound.UldFlightBuildManifest_Tb.sendKeys("6e", Keys.END);
		Nmial_Outbound.SearchBuildManifest_Icon.click();
		
		Select uld= new Select(Nmial_Outbound.UldPositionBuildManifest_DD);
		uld.selectByIndex(1);
		   Thread.sleep(3000);
		   
		Nmial_Outbound.AddUldBuildManifest_Btn.click();
		   Thread.sleep(3000);
        wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.ULD_Cb, 30);
	}
	
	@When("select ULD and click on Add Shipment button of Export")
	public void select_uld_and_click_on_add_shipment_button_of_export() {
		Nmial_Outbound.ULD_Cb.click();
		Nmial_Outbound.AddUldShipment_Btn.click();
		 String p= driver.getWindowHandle();
	  		Set<String> s= driver.getWindowHandles();
	  		Iterator<String> I= s.iterator();
	  		Object[] windowHandles= driver.getWindowHandles().toArray();
	  		driver.switchTo().window((String) windowHandles[2]);
	  		System.out.println(driver.getTitle());
	  	
	}
	
	@When("enter {string} and search Shipment on hand and Add shipment for Export")
	public void enter_and_search_shipment_on_hand_and_add_shipment_for_export(String value) throws Throwable {
	   Nmial_Outbound.UldShipmentPfx_Tb.sendKeys("312", Keys.END);
	   Thread.sleep(3000);
	   Nmial_Outbound.UldShipment_Tb.sendKeys(value, Keys.END);
	   Thread.sleep(3000);
	   Nmial_Outbound.SearchUldShipment_Btn.click();
	   Thread.sleep(3000);
	   wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.UldShipment_Cb, 30);
	   Nmial_Outbound.UldShipment_Cb.click();
	   Nmial_Outbound.UldNOP_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
	   Thread.sleep(3000);

	   Nmial_Outbound.UldNOP_Tb.sendKeys("5", Keys.END);
	   Thread.sleep(3000);

	   Nmial_Outbound.AddShipment_Btn.click();
	   Thread.sleep(3000);

	}
	
	@When("select Flight of Build Manifest Export")
	public void select_flight_of_build_manifest_export() throws Throwable {
		Nmial_Outbound.FlightPfxBuildManifest_Tb.sendKeys("6e", Keys.TAB);
		   Thread.sleep(3000);
		Nmial_Outbound.FlightNoBuildManifest_Tb.sendKeys("999", Keys.TAB);
		   Thread.sleep(3000);
		Nmial_Outbound.SearchBuildManifest_Icon.click();
		   Thread.sleep(8000);
		
		driver.switchTo().defaultContent();
		   Thread.sleep(8000);
		driver.switchTo().frame(Nmial_Outbound.PageFrame);
		   Thread.sleep(8000);
  

	}
	
	@When("click on Close ULD and select Close Rdb and {string} Save Scale Weight button for Export")
	public void click_on_close_uld_and_select_close_rdb_and_save_scale_weight_button_for_export(String value) throws Throwable {
	    Nmial_Outbound.CloseULD_Icon.click();
		   Thread.sleep(3000);
	    String p= driver.getWindowHandle();
		Set<String> s= driver.getWindowHandles();
		Iterator<String> I= s.iterator();
		Object[] windowHandles= driver.getWindowHandles().toArray();
		driver.switchTo().window((String) windowHandles[1]);
	    System.out.println(driver.getTitle());
	    
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.CloseULD_Rdb, 30);
	    Nmial_Outbound.CloseULD_Rdb.click();
	    Nmial_Outbound.ScaleWeight_Tb.sendKeys("100", Keys.END);
	    
	    Select scaleNoDD= new Select(Nmial_Outbound.WeighingScaleNumber_DD);
	    scaleNoDD.selectByIndex(1);
	    
	    Nmial_Outbound.SaveScaleWeight_Btn.click();
		   Thread.sleep(3000);

	}

    //Gatepass
	@When("select flight for Gatepass of closed ULD")
	public void select_flight_for_gatepass_of_closed_uld() throws Throwable {
		Nmial_Outbound.FlightPfxBuildManifest_Tb.sendKeys("6e", Keys.TAB);
		   Thread.sleep(3000);
		Nmial_Outbound.FlightNoBuildManifest_Tb.sendKeys("999", Keys.TAB);
		   Thread.sleep(3000);
		Nmial_Outbound.SearchBuildManifest_Icon.click();
		   Thread.sleep(8000);
		
		driver.switchTo().defaultContent();
		   Thread.sleep(8000);
		driver.switchTo().frame(Nmial_Outbound.PageFrame);
		   Thread.sleep(8000);
	}
	
	@When("select ULD, click on Generate Gatepass and click on Cancel of Export")
	public void select_uld_click_on_generate_gatepass_and_click_on_cancel_of_export() throws Throwable {
		Nmial_Outbound.ULD_Cb.click();
		Nmial_Outbound.FlightBuiltUp_Btn.click();
		 String p= driver.getWindowHandle();
	  		Set<String> s= driver.getWindowHandles();
	  		Iterator<String> I= s.iterator();
	  		Object[] windowHandles= driver.getWindowHandles().toArray();
	  		driver.switchTo().window((String) windowHandles[2]);
	  		System.out.println(driver.getTitle());
	  		
	    Nmial_Outbound.UldFlightBuiltUp_Cb.click();
		   Thread.sleep(8000);
		   Nmial_Outbound.GenerateGatepass_Btn.click();
		   Thread.sleep(8000);

	}
	
	@When("click on Exports> Gatepass and select {string} flight for Gatepass, select ULD and click on Release button")
	public void click_on_exports_gatepass_and_select_flight_for_gatepass_select_uld_and_click_on_release_button(String value) throws Throwable {
	    Nmial_Outbound.Exports_Tab.click();
	    Nmial_Outbound.Gatepass_Tab.click();
		   Thread.sleep(8000);
	    driver.switchTo().frame(Nmial_Outbound.PageFrame);
		   Thread.sleep(8000);
        Nmial_Outbound.GatepassPfx_Tb.sendKeys("6e", Keys.TAB);
        Nmial_Outbound.GatepassFlight_Tb.sendKeys(value, Keys.END);
        Nmial_Outbound.GatepassSearch_Icon.click();
        wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.Gatepass_Hyperlink, 30);
        Nmial_Outbound.Gatepass_Hyperlink.click();
        wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.GatepassUld_Cb, 30);
        Thread.sleep(3000);

        Nmial_Outbound.GatepassUld_Cb.click();
        Thread.sleep(3000);
        Nmial_Outbound.GatepassRelease_Btn.click();
        Thread.sleep(3000);
	    driver.switchTo().defaultContent();
        Thread.sleep(3000);

	}
	
	@When("click on Print Manifest icon and click on Proceed for Export")
	public void click_on_print_manifest_icon_and_click_on_proceed_for_export() throws Throwable {
	    Nmial_Outbound.PrintManifest_Icon.click();
	    Thread.sleep(3000);
	    driver.switchTo().defaultContent();
        Thread.sleep(3000);
	    driver.switchTo().frame(Nmial_Outbound.PageFrame);
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.FlightManifest_Rdb, 30);
        Thread.sleep(3000);
        wm.scrollTillElement(driver, Nmial_Outbound.ProceedManifest_Btn);
        Nmial_Outbound.ProceedManifest_Btn.click();
        Thread.sleep(3000);
        driver.switchTo().defaultContent();

	}
	
	@When("select ULD Offload of Export")
	public void select_uld_offload_of_export() throws Throwable {
		Nmial_Outbound.ULD_Cb.click();
        Thread.sleep(3000);

	}

	@When("clicked on Print Manifest icon and click on Proceed for Export")
	public void clicked_on_print_manifest_icon_and_click_on_proceed_for_export() throws Throwable {
		
		Nmial_Outbound.PrintManifest_Icon.click();
		   Thread.sleep(8000);
        driver.switchTo().defaultContent();
           Thread.sleep(3000);
	    driver.switchTo().frame(Nmial_Outbound.PageFrame);
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.FlightManifest_Rdb.get(2), 30);
           Thread.sleep(3000);

	    wm.scrollTillElement(driver, Nmial_Outbound.ProceedManifest_Btn);
           Thread.sleep(3000);
	    Nmial_Outbound.ProceedManifest_Btn.click();
           Thread.sleep(3000);
     driver.switchTo().defaultContent();
           Thread.sleep(3000);
	}

	
	@When("click on Build Manifest , clicked on Print Manifest icon and click on Proceed for Export")
	public void click_on_build_manifest_clicked_on_print_manifest_icon_and_click_on_proceed_for_export() throws Throwable {
		Nmial_Outbound.BuildManifest_Tab.click();
		driver.switchTo().frame(Nmial_Outbound.PageFrame);
		   Thread.sleep(8000);	

		Nmial_Outbound.FlightPfxBuildManifest_Tb.sendKeys("6e", Keys.TAB);
		   Thread.sleep(3000);
		Nmial_Outbound.FlightNoBuildManifest_Tb.sendKeys("999", Keys.TAB);
		   Thread.sleep(3000);
		Nmial_Outbound.SearchBuildManifest_Icon.click();
		   Thread.sleep(8000);
		Nmial_Outbound.PrintManifest_Icon.click();
		   Thread.sleep(8000);
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
	    driver.switchTo().frame(Nmial_Outbound.PageFrame);
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.FlightManifest_Rdb.get(2), 30);
        Thread.sleep(3000);

	    wm.scrollTillElement(driver, Nmial_Outbound.ProceedManifest_Btn);
        Thread.sleep(3000);
	    Nmial_Outbound.ProceedManifest_Btn.click();
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        Thread.sleep(3000);

	}


	@When("click on Build Manifest and enter {string} Record ATD and clicked on Finalize Flight button")
	public void click_on_build_manifest_and_enter_record_atd_and_clicked_on_finalize_flight_button(String value) throws Throwable {
		Nmial_Outbound.BuildManifest_Tab.click();
		driver.switchTo().frame(Nmial_Outbound.PageFrame);
		   Thread.sleep(8000);	

		Nmial_Outbound.FlightPfxBuildManifest_Tb.sendKeys("6e", Keys.TAB);
		   Thread.sleep(3000);
		Nmial_Outbound.FlightNoBuildManifest_Tb.sendKeys("999", Keys.TAB);
		   Thread.sleep(3000);
		Nmial_Outbound.SearchBuildManifest_Icon.click();
		   Thread.sleep(8000);
		
		Nmial_Outbound.AtdDate_Tb.sendKeys(wm.CurrentDate("dd/MM/yyyy"), Keys.END);
		   Thread.sleep(3000);
		Nmial_Outbound.AtdTime_Tb.sendKeys(value, Keys.END);
		   Thread.sleep(3000);
		Nmial_Outbound.RecordATD_Btn.click();
		   Thread.sleep(3000);
		Nmial_Outbound.FinalizeFlightATD_Btn.click();
		   Thread.sleep(3000);

	}

    //Credit Billing
	@When("capture generated AWB details for Billing Export")
	public void capture_generated_awb_details_for_billing_export() throws Throwable {
		List<String> tabs = new ArrayList<>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(0));
	      System.out.println("Back to original tab: " + driver.getTitle());
			AwbGenerated= Nmial_Outbound.GeneratedAWB_Grid.getText().toString();
		     Thread.sleep(10000);

        driver.switchTo().window(tabs.get(1));
        System.out.println("Switched back to new tab: " + driver.getTitle());
	     Thread.sleep(10000);
	     
	     Nmial_Outbound.Billing_Tab.click();
		   Thread.sleep(3000);
		   Nmial_Outbound.TspCustomerInvoice_Tab.click();
		   Thread.sleep(3000);
		   driver.switchTo().frame(Nmial_Outbound.PageFrame);
		   Thread.sleep(3000);
		   Nmial_Outbound.DocumentID_Tb.sendKeys(AwbGenerated, Keys.TAB);
		   Thread.sleep(3000);

		Nmial_Outbound.SearchInvoice_Btn.click();
		   Thread.sleep(8000);


		
	}

	
	@When("click on Billing> Credit Billing for Airline")
	public void click_on_billing_credit_billing_for_airline() throws Throwable {
	    Nmial_Outbound.Billing_Tab.click();
	    Nmial_Outbound.CreditBilling_Tab.click();
		   Thread.sleep(3000);
        driver.switchTo().frame(Nmial_Outbound.PageFrame);
        
	}
	
	@When("select {string} Debit Party Name, {string} Airline GSA and {string} Frequency for Airline")
	public void select_debit_party_name_airline_gsa_and_frequency_for_airline(String value1, String value2, String value3) throws Throwable {
	    Select DD= new Select(Nmial_Outbound.DebitParty_DD);
	    DD.selectByIndex(1);
	    Nmial_Outbound.Airline_Tb.sendKeys(value2, Keys.TAB);
		   Thread.sleep(3000);

	    DD= new Select(Nmial_Outbound.AirlineGSA_DD);
	    DD.selectByIndex(1);
		   Thread.sleep(3000);

	    DD= new Select(Nmial_Outbound.Frequency_DD);
	    DD.selectByVisibleText(value3);
		   Thread.sleep(3000);

	}
	
	@When("select From and To date for Airline")
	public void select_from_and_to_date_for_airline() throws Throwable {
	    Nmial_Outbound.AirlineFromDate_Icon.click();
		   Thread.sleep(3000);
//		Nmial_Outbound.AirlineFromDate_Grid.click();
//		   Thread.sleep(3000);

		Nmial_Outbound.AirlineToDate_Icon.click();
		   Thread.sleep(3000);
//		Nmial_Outbound.AirlineToDate_Grid.get(1).click();;
//		   Thread.sleep(3000);

	}
	
	@When("click on Calculate Charge for Airline")
	public void click_on_calculate_charge_for_airline() {
	    Nmial_Outbound.AirlineCalculateCharge_Btn.click();
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.ViewCharge_Btn, 30);
	}
	
	@When("click on View icon, select Charge, click on Confirm and Generate Invoice button for Airline")
	public void click_on_view_icon_select_charge_click_on_confirm_and_generate_invoice_button_for_airline() throws Throwable {
		Nmial_Outbound.ViewCharge_Btn.click();
		 String p= driver.getWindowHandle();
	  		Set<String> s= driver.getWindowHandles();
	  		Iterator<String> I= s.iterator();
	  		Object[] windowHandles= driver.getWindowHandles().toArray();
	  		driver.switchTo().window((String) windowHandles[2]);
	  		System.out.println(driver.getTitle());
		Thread.sleep(3000);	
	  	Nmial_Outbound.SelectCharge_Cb.click();
		Thread.sleep(3000);	
		Nmial_Outbound.ConfirmCharge_Btn.click();
		Thread.sleep(3000);	
		Nmial_Outbound.ConfirmGenerateInvoice_Btn.click();
		Thread.sleep(3000);	

	}

	// Commodity
	@When("enter {string} Flight No, {string} for Commodity and select Flight Date of Export")
	public void enter_flight_no_for_commodity_and_select_flight_date_of_export(String value1, String value2) throws Throwable {
		Nmial_Outbound.Origin_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
		Nmial_Outbound.Origin_Tb.sendKeys("NMI", Keys.TAB);
		
		Nmial_Outbound.Destination_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
		Nmial_Outbound.Destination_Tb.sendKeys("BOM", Keys.TAB);
		
		Nmial_Outbound.FlightDate_Icon.click();
		Thread.sleep(1000);

		Nmial_Outbound.AwbFlightNo_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
		Nmial_Outbound.AwbFlightNo_Tb.sendKeys("123", Keys.END);
		Thread.sleep(3000);
		
		Select cargoDD= new Select(Nmial_Outbound.CargoType_DD);
		cargoDD.selectByVisibleText(value2);
		Thread.sleep(3000);

		Select commodity= new Select(Nmial_Outbound.CommodityType_DD);
		commodity.selectByIndex(1);
		Thread.sleep(1000);

	}
	
	@When("clicked on Offload ULD button of Export")
	public void clicked_on_offload_uld_button_of_export() throws Throwable {
	    Nmial_Outbound.OffloadULD_Btn.click();
		Thread.sleep(1000);
		 String p= driver.getWindowHandle();
	  		Set<String> s= driver.getWindowHandles();
	  		Iterator<String> I= s.iterator();
	  		Object[] windowHandles= driver.getWindowHandles().toArray();
	  		driver.switchTo().window((String) windowHandles[2]);
	  		System.out.println(driver.getTitle());
		 Thread.sleep(1000);
		 
		Nmial_Outbound.OffloadULD_Rdb.click();
		 Thread.sleep(1000);
        Nmial_Outbound.LocationSearch_Icon.click(); 
		 Thread.sleep(1000);
		Nmial_Outbound.OffloadReason_Icon.click();
		 Thread.sleep(1000);
        Nmial_Outbound.SaveOffload_Btn.click();
		 Thread.sleep(1000);

	}

	@When("click on Reject button for Export")
	public void click_on_reject_button_for_export() throws Throwable {
		Nmial_Outbound.AirlineReject_Btn.click();
		 Thread.sleep(1000);
	    Nmial_Outbound.YesProceedCO_Btn.click();
		 Thread.sleep(3000);
		 wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.RejectReason_Tb, 30);
		Nmial_Outbound.RejectReason_Tb.sendKeys("testing", Keys.END);
		 Thread.sleep(3000);
		 Nmial_Outbound.RejectSubmit_Btn.click();
		 Thread.sleep(3000);

	}
	
    // Import Build Manifest
	@When("clicked on Record ATA, Breakdown and Match Import Shipment")
	public void clicked_on_record_ata_breakdown_and_match_import_shipment() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@When("clicked on Warehouse Delivery Order tab, Generate Print WDO with Demurrage Charge and Released Shipment Import")
	public void clicked_on_warehouse_delivery_order_tab_generate_print_wdo_with_demurrage_charge_and_released_shipment_import() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

  

	
	
	
	
	
	
	
	
	
}
