package stepdefinition;

import static Helper.BaseObjects.Nmial_Outbound;
import static Helper.BaseObjects.driver;
import static Helper.BaseObjects.loginScreen;
import static Helper.BaseObjects.wm;
import static Helper.BaseVariables.Entity;
import static Helper.BaseVariables.Password;
import static Helper.BaseVariables.Username;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestDataOperations.TestDataReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Helper.BaseObjects.*;
import static Helper.BaseVariables.BrowserName;
import static Helper.BaseVariables.Entity;
import static Helper.BaseVariables.Password;
import static Helper.BaseVariables.Username;
import static Helper.Constants.*;
//import static Helper.Constants.URL;
import static Helper.Constants.URL_GHA;
//import static Helper.Constants.Ecom_URL;

import Pages.ECOM_Outbound;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.swing.JFrame;

import java.io.*;
import java.time.Duration;

import Pages.ACS_GHA_XPath;


public class Test_BialEcom {
	Actions a= new Actions(driver);
	String nop= wm.RandomNo(1), GrWt="10";
	String awb= wm.Random_awbNo();
	String originalTab = driver.getWindowHandle();
	public String AwbGenerated, Flight;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    String flight="6e"+wm.RandomNo(4);
    String flightNo= flight.substring(2);
   
	

	@When("launch browser for BIAL Ecom application and login with {string} BIAL user given in {string} sheet for Outbound")
	public void launch_browser_for_bial_ecom_application_and_login_with_bial_user_given_in_sheet_for_outbound(String entity, String sheetName) throws Throwable {
		String Ecom_URL= "https://bialuat.cargobyblr.in/BIAL_ACS_UAT/UI/Upliftlogin.aspx";
        System.out.println("nop=" +Integer.toString((Integer.parseInt(nop)-1))+"\t"+nop);
		((JavascriptExecutor) driver).executeScript("window.open('" + Ecom_URL + "', '_blank');");    

        for (String handle : driver.getWindowHandles()) {
        driver.switchTo().window(handle);}
        
		Entity = entity;
		TestDataReader.ReadLoginDetails(Entity);
		Thread.sleep(500);
		System.out.println("usr= " + Username);
		System.out.println("pwd= " + Password);
		// loginScreen.isLoginScreenDisplayed();
		
		
	}
	
	@When("launch BIAL ECOM application")
	public void launch_bial_ecom_application() {
		String Ecom_URL= "http://bialuat.cargobyblr.in/BIAL_ACS_UAT/UI/Upliftlogin.aspx";
        System.out.println("nop=" +Integer.toString((Integer.parseInt(nop)-1))+"\t"+nop);
		((JavascriptExecutor) driver).executeScript("window.open('" + Ecom_URL + "', '_blank');");    

        for (String handle : driver.getWindowHandles()) {
        driver.switchTo().window(handle);}

	}
	
	@When("I login with {string} BIAL Ecom Agent user given in {string} sheet for Outbound")
	public void i_login_with_bial_ecom_agent_user_given_in_sheet_for_outbound(String entity, String sheetName) throws Throwable {
		Thread.sleep(3000);		
		wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.ECOM_Popup, 30);
//		ECOM_Outbound.ECOM_Popup.click();
		Entity = entity;
		TestDataReader.ReadLoginDetails(Entity);
		Thread.sleep(1000);
		wm.VisibilityOfElementExplicityWait(driver, loginScreen.ECOMlogin_Btn, 30);
        wm.scrollTillElement(driver, loginScreen.ECOMlogin_Btn);
		System.out.println("usr= " + Username);
		System.out.println("pwd= " + Password);
		loginScreen.ECOM_Login(entity, Username, Password);
		// loginScreen.isLoginScreenDisplayed();
		
		Thread.sleep(8000);
		wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.CTO_PopupBtn, 30);

	}
	
	@When("click on CTO popup button for Outbound")
	public void click_on_cto_popup_button_for_outbound() throws Throwable {
//		ECOM_Outbound.CTO_Rdb.click();
        wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.CTO_PopupBtn, 30);
		ECOM_Outbound.CTO_PopupBtn.click();
		Thread.sleep(8000);
	}
	
	@When("click eAWB> Create AWB button for Outbound")
	public void click_e_awb_create_awb_button_for_outbound() throws Throwable {
        wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.eAWB_Tab, 30);
        ECOM_Outbound.eAWB_Tab.click();
        wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.CreateAWB_Hyperlink, 30);
		Thread.sleep(8000);
		ECOM_Outbound.CreateAWB_Hyperlink.click();
		Thread.sleep(8000);

	}
	
	@When("click on Copy icon for Outbound")
	public void click_on_copy_icon_for_outbound() throws Throwable {
	    ECOM_Outbound.CopyAWB_Icon.click();
		Thread.sleep(8000);
	    ECOM_Outbound.CopyYes_Btn.click();
		Thread.sleep(8000);
		wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.CopyAwbPfx_Tb, 30);

	}
	
	@When("enter {string} Awb Pfx details for Outbound")
	public void enter_awb_pfx_details_for_outbound(String value) throws Throwable {
		ECOM_Outbound.CopyAwbPfx_Tb.sendKeys(value, Keys.TAB);
		Thread.sleep(3000);

		ECOM_Outbound.CopyAwb_Tb.sendKeys(awb, Keys.END);
		Thread.sleep(3000);

	}
	
	@When("enter {string} Awb Pfx details and enter AWB cargo details for Outbound")
	public void enter_awb_pfx_details_and_enter_awb_cargo_details_for_outbound(String value) throws Throwable {
		ECOM_Outbound.CopyAwbPfx_Tb.sendKeys(value, Keys.TAB);
		Thread.sleep(3000);
		ECOM_Outbound.CopyAwb_Tb.sendKeys(awb, Keys.END);
		Thread.sleep(3000);
		ECOM_Outbound.Dest_Tb.sendKeys("HYD", Keys.END);
//		ECOM_Outbound.EcomNOP_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
//		Thread.sleep(8000);
//
//        ECOM_Outbound.EcomNOP_Tb.sendKeys("3", Keys.END);
//        
//        ECOM_Outbound.EcomGrWt_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
//        ECOM_Outbound.EcomGrWt_Tb.sendKeys("300", Keys.END);
        ECOM_Outbound.FlightPfx_Tb.sendKeys("6E", Keys.TAB);
        ECOM_Outbound.Flight_Tb.sendKeys(wm.RandomNo(4), Keys.END);
        
        Select typeDD= new Select(ECOM_Outbound.CargoType_DD);
        typeDD.selectByIndex(1);
        Select Commodity= new Select(ECOM_Outbound.CommodityType_DD);
        Commodity.selectByIndex(1);
        ECOM_Outbound.AddConsignee_Icon.click();		Thread.sleep(3000);
        driver.switchTo().frame(ECOM_Outbound.Consignee_iframe);
		  Thread.sleep(3000);
		
        ECOM_Outbound.ConsigneeName_Tb.sendKeys("OMEGA"+" "+ "SHIPPER", Keys.BACK_SPACE);
		  Thread.sleep(8000);
//	       ECOM_Outbound.ConsigneeName_Tb.sendKeys(Keys.BACK_SPACE);
//	       Thread.sleep(8000);


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        List<WebElement> suggestions =  wait.until(
//                ExpectedConditions.visibilityOfAllElementsLocatedBy(
//                        By.xpath("//li[@class='ui-menu-item']/div"))
//        );
        

//        if (suggestions.get(0).getText().contains("OMEGA SHIPPERS")) {
//        	suggestions.get(0).click();}

		wm.scrollTillElement(driver, ECOM_Outbound.SaveConsignee_Btn); 
		  Thread.sleep(3000);

		driver.switchTo().defaultContent();
		
		  
//WebElement okBtn = wait.until(
//    ExpectedConditions.elementToBeClickable(
//        By.xpath("//div[@aria-describedby='addConsignee'][2]/div[3]//button[1]")
//    )
//);
//
//okBtn.click();
//
//		ECOM_Outbound.ConsigneeOk_Btn.click();
//		  Thread.sleep(3000);

	}
	
	@When("deselect eComm shipment checkbox for Outbound")
	public void deselect_e_comm_shipment_checkbox_for_outbound() throws Throwable {
		if(ECOM_Outbound.Ecom_Cb.isSelected()) {
	      ECOM_Outbound.Ecom_Cb.click();
		  Thread.sleep(3000);
		}

	}
	
	@When("enter {string} NOP and {string} Gross Weight for Outbound")
	public void enter_nop_and_gross_weight_for_outbound(String value1, String value2) throws Throwable {
		Thread.sleep(20000);

		ECOM_Outbound.EcomNOP_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
		Thread.sleep(8000);

        ECOM_Outbound.EcomNOP_Tb.sendKeys(value1, Keys.END);
        
        ECOM_Outbound.EcomGrWt_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
        ECOM_Outbound.EcomGrWt_Tb.sendKeys(value2, Keys.END);
        
	}
	
	@When("select {string} CTO for ECOM Outbound")
	public void select_cto_for_ecom_outbound(String value) throws Throwable {
		Select ctoDD= new Select(ECOM_Outbound.CTO_DD);
		ctoDD.selectByVisibleText(value);
		Thread.sleep(3000);

	}
	
	@When("enter {string} NOP and {string} Gross Weight for NonEShipmentOutbound")
	public void enter_nop_and_gross_weight_for_non_e_shipment_outbound(String value1, String value2) throws Throwable {
		ECOM_Outbound.EcomNOP_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
		Thread.sleep(8000);

        ECOM_Outbound.EcomNOP_Tb.sendKeys(nop, Keys.END);
        
        ECOM_Outbound.EcomGrWt_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
        ECOM_Outbound.EcomGrWt_Tb.sendKeys(GrWt, Keys.END);        

	}
	
	@When("enter Vehicle details and click on Add Token for NonEShipment Outbound")
	public void enter_vehicle_details_and_click_on_add_token_for_non_e_shipment_outbound() throws Throwable {
		ECOM_Outbound.VehicleNo_Tb.sendKeys("MH01"+wm.RandomNo(4), Keys.END);
	    ECOM_Outbound.DriverLicenseNo_Tb.sendKeys("D"+wm.RandomNo(5), Keys.END);
	    ECOM_Outbound.DriverName_Tb.sendKeys("tester", Keys.END);
	    ECOM_Outbound.DriverMobileno_Tb.sendKeys("982"+wm.RandomNo(7), Keys.END);
	    ECOM_Outbound.AgentMobileno_Tb.sendKeys("982"+wm.RandomNo(7), Keys.END);
	    ECOM_Outbound.NOP1_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);Thread.sleep(3000);
	    ECOM_Outbound.NOP1_Tb.sendKeys("1", Keys.END);
	    ECOM_Outbound.GrossWeight1_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);

	    ECOM_Outbound.GrossWeight1_Tb.sendKeys("5", Keys.END);Thread.sleep(3000);
	    ECOM_Outbound.TokenRemarks_Tb.sendKeys("ok", Keys.END);
		   Thread.sleep(3000);
		ECOM_Outbound.AddToken_Icon.click();
		   Thread.sleep(3000);
	    wm.scrollTillElement(driver, ECOM_Outbound.GenerateToken_Btn);

	}
	
	@When("click on Add Shipment and select shipment for Outbound")
	public void click_on_add_shipment_and_select_shipment_for_outbound() throws Throwable {
	    ECOM_Outbound.AddTokenShipment_Btn.click();
		   Thread.sleep(3000);
		driver.switchTo().frame(ECOM_Outbound.Shipment_iframe);
		wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.AddShipment_Cb, 30);
		ECOM_Outbound.AddShipment_Cb.get(1).click();		   Thread.sleep(3000);
		ECOM_Outbound.AddShipment_Cb.get(2).click();		   Thread.sleep(3000);
		ECOM_Outbound.AddSelectedShipment_Btn.click();		   Thread.sleep(3000);

	}
	
	@When("enter {int} Vehicle details and click on Generate Token for NonEShipment Outbound")
	public void enter_vehicle_details_and_click_on_generate_token_for_non_e_shipment_outbound(Integer int1) throws Throwable {
		ECOM_Outbound.VehicleNo2_Tb.sendKeys("MH01"+wm.RandomNo(4), Keys.END); 		   Thread.sleep(3000);
	    ECOM_Outbound.DriverLicenseNo2_Tb.sendKeys("D"+wm.RandomNo(5), Keys.END);		   Thread.sleep(3000);
	    ECOM_Outbound.DriverName2_Tb.sendKeys("tester", Keys.END);		   Thread.sleep(3000);
	    ECOM_Outbound.DriverMobileno2_Tb.sendKeys("982"+wm.RandomNo(7), Keys.END);		   Thread.sleep(3000);
	    ECOM_Outbound.AgentMobileno2_Tb.sendKeys("982"+wm.RandomNo(7), Keys.END);		   Thread.sleep(3000);
	    ECOM_Outbound.NOP2_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE); Thread.sleep(3000);
	    ECOM_Outbound.NOP2_Tb.sendKeys(Integer.toString(Integer.parseInt(ECOM_Outbound.AWBnop_Tb.getText())-1), Keys.END);		   Thread.sleep(3000);
	    ECOM_Outbound.GrossWeight2_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE); Thread.sleep(3000);
	    ECOM_Outbound.GrossWeight2_Tb.sendKeys("5", Keys.END);		   Thread.sleep(3000);
	    ECOM_Outbound.TokenRemarks2_Tb.sendKeys("ok", Keys.END);		   Thread.sleep(3000);
		   Thread.sleep(3000);

	    ECOM_Outbound.GenerateToken_Btn.click();
		   Thread.sleep(3000);
		   
	   Thread.sleep(3000);
	   wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.GenerateTokenOk_Btn, 30);
	   ECOM_Outbound.GenerateTokenOk_Btn.click();
		   Thread.sleep(3000);


	}
	
	@When("click on bag Dimension icon for Outbound")
	public void click_on_bag_dimension_icon_for_outbound() throws Throwable {
		Thread.sleep(8000);

	    ECOM_Outbound.FlightDate_Icon.click();
		Thread.sleep(8000);
		for(int j=0;j<	ECOM_Outbound.FlightDate_Calendar.size();j++) {
			if(ECOM_Outbound.FlightDate_Calendar.get(j).isEnabled()) 
				ECOM_Outbound.FlightDate_Calendar.get(j).click();
				break;			
		}
        ECOM_Outbound.EcomBagDimension_Icon.click();
	    Thread.sleep(10000);    

	}
	
		
	@When("click on Save AWB button for Outbound")
	public void click_on_save_awb_button_for_outbound() throws Throwable {
	    Thread.sleep(20000);

		ECOM_Outbound.SaveAWB_Btn.click();
	    Thread.sleep(20000);

	    ECOM_Outbound.OkSavedAWB_Btn.click();
	    Thread.sleep(20000);

	}
	
	@When("click on Proceed button and of Export")
	public void click_on_proceed_button_and_of_export() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


	//EcomBag_1.2
	@When("select eComm shipment checkbox for Outbound")
	public void select_e_comm_shipment_checkbox_for_outbound() throws Throwable  {
		if(!(ECOM_Outbound.Ecom_Cb.isSelected())){
		   ECOM_Outbound.Ecom_Cb.click();
	      Thread.sleep(3000);
		}

	}
	
	@When("click on Add dimension of entered bags and update pieces for Copy Outbound")
	public void click_on_add_dimension_of_entered_bags_and_update_pieces_for_copy_outbound() throws Throwable {
		Thread.sleep(3000);
	    if(wm.isElementPresent(driver, ECOM_Outbound.DeleteDimension_Icon)) {
		    ECOM_Outbound.DeleteDimension_Icon.click();
		    Thread.sleep(3000);
		    
		   wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.AddBag_Icon, 30);
			    Thread.sleep(3000);
	    }

		    ECOM_Outbound.AddBag_Icon.click();
		    Thread.sleep(3000);

		    ECOM_Outbound.DimensionNOP1_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
		    Thread.sleep(3000);
		    ECOM_Outbound.DimensionNOP1_Tb.sendKeys("2", Keys.TAB);
//		    ECOM_Outbound.AddBag_Icon.click();
		    Thread.sleep(8000);
		    
		    wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.ProceedAddBag_Btn, 30);
		    ECOM_Outbound.ProceedAddBag_Btn.click();
		    Thread.sleep(3000);
		    
		    ECOM_Outbound.DimensionNOP2_Tb.sendKeys("1", Keys.TAB);
		    Thread.sleep(8000);
		    ECOM_Outbound.ProceedAddBag_Btn.click();
		    Thread.sleep(3000);

		    ECOM_Outbound.Length1_Tb.sendKeys("20", Keys.END);
		    Thread.sleep(10000);
//		    ECOM_Outbound.ProceedAddBag_Btn.click();
//		    Thread.sleep(10000);

		    ECOM_Outbound.Width1_Tb.click();
		    ECOM_Outbound.Width1_Tb.sendKeys("30", Keys.END);
		    Thread.sleep(10000);

		    ECOM_Outbound.Height1_Tb.click();
		    ECOM_Outbound.Height1_Tb.sendKeys("20", Keys.END);
		    Thread.sleep(10000);
		    
		    ECOM_Outbound.BagPiece1_Tb.sendKeys("B"+wm.RandomNo(3), Keys.END);
		    ECOM_Outbound.BagWeight1_Tb.sendKeys("10", Keys.END);
		    
		    ECOM_Outbound.BagPiece2_Tb.sendKeys("B"+wm.RandomNo(3), Keys.END);
		    ECOM_Outbound.BagWeight2_Tb.sendKeys("15", Keys.END);
		    
		    ECOM_Outbound.BagPiece3_Tb.sendKeys("B"+wm.RandomNo(3), Keys.END);
		    ECOM_Outbound.BagWeight3_Tb.sendKeys("5", Keys.END);
		    Thread.sleep(8000);
	  
		    wm.scrollTillElement(driver, ECOM_Outbound.OkDimension_PopupBtn);
		    ECOM_Outbound.OkDimension_PopupBtn.click();
		    Thread.sleep(8000);

		
		
	}

	
	@When("click on Add dimension of entered bags and update pieces for Outbound")
	public void click_on_add_dimension_of_entered_bags_and_update_pieces_for_outbound() throws Throwable {
		Thread.sleep(3000);
	    if(wm.isElementPresent(driver, ECOM_Outbound.DeleteDimension_Icon)) {
		    ECOM_Outbound.DeleteDimension_Icon.click();
		    Thread.sleep(3000);
		    
		   wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.AddBag_Icon, 30);
			    Thread.sleep(3000);
	    }

		    ECOM_Outbound.AddBag_Icon.click();
		    Thread.sleep(3000);

		    ECOM_Outbound.DimensionNOP1_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
		    Thread.sleep(3000);
		    ECOM_Outbound.DimensionNOP1_Tb.sendKeys("1", Keys.TAB);
//		    ECOM_Outbound.AddBag_Icon.click();
		    Thread.sleep(20000);
		    
		    wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.ProceedAddBag_Btn, 30);
		    ECOM_Outbound.ProceedAddBag_Btn.click();
		    Thread.sleep(3000);
		    
//		    ECOM_Outbound.DimensionNOP2_Tb.sendKeys("2", Keys.TAB);
//		    Thread.sleep(8000);
//		    ECOM_Outbound.ProceedAddBag_Btn.click();
//		    Thread.sleep(3000);

		    ECOM_Outbound.Length2_Tb.sendKeys("20", Keys.END);
		    Thread.sleep(10000);
//		    ECOM_Outbound.ProceedAddBag_Btn.click();
//		    Thread.sleep(10000);

		    ECOM_Outbound.Width2_Tb.click();
		    ECOM_Outbound.Width2_Tb.sendKeys("30", Keys.END);
		    Thread.sleep(10000);

		    ECOM_Outbound.Height2_Tb.click();
		    ECOM_Outbound.Height2_Tb.sendKeys("20", Keys.END);
		    Thread.sleep(10000);
		    
		    ECOM_Outbound.BagPiece1_Tb.sendKeys("B"+wm.RandomNo(3), Keys.END);
		    ECOM_Outbound.BagWeight1_Tb.sendKeys("10", Keys.END);
		    
//		    ECOM_Outbound.BagPiece2_Tb.sendKeys("B"+wm.RandomNo(3), Keys.END);
//		    ECOM_Outbound.BagWeight2_Tb.sendKeys("15", Keys.END);
//		    
//		    ECOM_Outbound.BagPiece3_Tb.sendKeys("B"+wm.RandomNo(3), Keys.END);
//		    ECOM_Outbound.BagWeight3_Tb.sendKeys("5", Keys.END);
//		    Thread.sleep(8000);
	  
		    wm.scrollTillElement(driver, ECOM_Outbound.OkDimension_PopupBtn);
		    ECOM_Outbound.OkDimension_PopupBtn.click();
		    Thread.sleep(8000);

	}
	
	@When("click on ASI icon of AWB for Outbound")
	public void click_on_asi_icon_of_awb_for_outbound() throws Throwable {
	    Thread.sleep(20000);

	    wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.AWB_ASI_Icon, 30);
	    ECOM_Outbound.AWB_ASI_Icon.click();
	    Thread.sleep(10000);
	    ECOM_Outbound.ProceedAWB_Btn.click();
	    Thread.sleep(10000);

	}
	
	@When("click on ASI Proceed button and Export")
	public void click_on_asi_proceed_button_and_export() throws Throwable {
	    ECOM_Outbound.YesASI_Confirmation_Btn.click();
	    Thread.sleep(10000);
	    ECOM_Outbound.SentASI_Ok_Btn.click();
	    Thread.sleep(10000);


	}

	@When("click on logout icon of Outbound")
	public void click_on_logout_icon_of_outbound() throws Throwable {
	    ECOM_Outbound.Logout_Icon.click();
	    Thread.sleep(3000);
	    ECOM_Outbound.Logout_Hyperlink.click();
	    Thread.sleep(3000);

	}
	
	@When("I login with {string} BIAL Ecom Approver user given in {string} sheet for Outbound")
	public void i_login_with_bial_ecom_approver_user_given_in_sheet_for_outbound(String entity, String sheetName) throws Throwable {
		Thread.sleep(8000);		
		wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.ECOM_Popup, 30);
//		ECOM_Outbound.ECOM_Popup.click();
		Entity = entity;
		TestDataReader.ReadLoginDetails(Entity);
		Thread.sleep(8000);
		wm.VisibilityOfElementExplicityWait(driver, loginScreen.ECOMlogin_Btn, 30);
        wm.scrollTillElement(driver, loginScreen.ECOMlogin_Btn);
		System.out.println("usr= " + Username);
		System.out.println("pwd= " + Password);
		// loginScreen.isLoginScreenDisplayed();
		loginScreen.ECOM_Login(entity, Username, Password);
		Thread.sleep(8000);
		wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.CTO_PopupBtn, 30);

	}
		
	@When("approve submitted ASI for Outbound")
	public void approve_submitted_asi_for_outbound() throws Throwable {
//	      wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.ApprovedCO_Icon, 30);
//		   Thread.sleep(3000);
//          ECOM_Outbound.COapprove_Btn.click();
		   Thread.sleep(8000);
		   wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.COapprove_Icon, 30);
		   Thread.sleep(8000);

		   ECOM_Outbound.COapprove_Icon.click();
			Thread.sleep(8000);


	}
	
	@When("approve {string} Flight No in Airline")
	public void approve_flight_no_in_airline(String string) throws Throwable {
		ECOM_Outbound.ApproveFlightNo_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
		ECOM_Outbound.ApproveFlightNo_Tb.sendKeys(wm.RandomNo(4), Keys.END);
		ECOM_Outbound.COapprove_Btn.click();
		Thread.sleep(3000);
		ECOM_Outbound.Yesapprove_Btn.click();
		Thread.sleep(3000);
        ECOM_Outbound.Okapprove_Btn.click();
		Thread.sleep(3000);

	}
	
	@When("search {string} pfx {string} AWB for Approval")
	public void search_pfx_awb_for_approval(String value1, String value2) throws Throwable {
		Thread.sleep(3000);
		ECOM_Outbound.ApproveAWBsearch_Tb.sendKeys(value1+awb, Keys.END);
		Thread.sleep(3000);
		ECOM_Outbound.ApproveAWBsearch_Btn.click();
		Thread.sleep(3000);

	}	
	

	@When("click on CO icon of AWB for Outbound")
	public void click_on_co_icon_of_awb_for_outbound() throws Throwable {
	   Thread.sleep(8000);
	   ECOM_Outbound.ApprovedCO_Icon.click();
	   wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.CO_Request_Popup, 30);
	   Thread.sleep(8000);
	   ECOM_Outbound.YesCO_Request_Btn.click();
	   Thread.sleep(8000);
	   ECOM_Outbound.OkCO_Request_Btn.click();
	   Thread.sleep(8000);

	}
	
	@When("click on Reports> IDG Report for Outbound")
	public void click_on_reports_idg_report_for_outbound() throws Throwable {
		ECOM_Outbound.Reports_Tab.click();
		   Thread.sleep(8000);
        wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.IdgReport_Hyperlink, 30);
		   Thread.sleep(8000);
		ECOM_Outbound.IdgReport_Hyperlink.click();
		   Thread.sleep(8000);

	}
	
	@When("click on IDG Export to Excel button for Outbound")
	public void click_on_idg_export_to_excel_button_for_outbound() throws Throwable {
	   ECOM_Outbound.ExportIDG_Btn.click();
	   Thread.sleep(8000);

	}
	
	@When("enter {string} AWB filter for Outbound")
	public void enter_awb_filter_for_outbound(String value) throws Throwable {
		Thread.sleep(3000);
		ECOM_Outbound.AWB_Filter.sendKeys(awb, Keys.END);
		Thread.sleep(3000);
		ECOM_Outbound.AwbFilter_Icon.click();
		Thread.sleep(8000);
		ECOM_Outbound.AwbFilterContains_Hyperlink.click();
		Thread.sleep(8000);		

	}


	@When("click on Edit icon with Cargo type and Shipper Consignee details for Outbound")
	public void click_on_edit_icon_with_cargo_type_and_shipper_consignee_details_for_outbound() throws Throwable {
		ECOM_Outbound.EditAWB1_Icon.click();
		   Thread.sleep(3000);

		 Select cargoTypeDD= new Select(ECOM_Outbound.CargoType_DD);
		   cargoTypeDD.selectByVisibleText("General Cargo");
		   Thread.sleep(8000);

//	     Select commodity= new Select(ECOM_Outbound.CommodityType_DD);
//		   commodity.selectByIndex(5);
//		   Thread.sleep(8000);
  
	     ECOM_Outbound.AddShipper_Icon.click();
		   Thread.sleep(20000);

//	     ECOM_Outbound.ShipperName_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
//		   Thread.sleep(8000);
//	     ECOM_Outbound.ShipperName_Tb.sendKeys("OMEGA SHIPPER", Keys.END);
//		   Thread.sleep(8000);
//
//	     wm.scrollTillElement(driver, ECOM_Outbound.SaveShipper_Btn);
//	     ECOM_Outbound.SaveShipper_Btn.click();
//		   Thread.sleep(3000);
//
//	     ECOM_Outbound.OkShipper_Btn.click();
	}

	@Then("verify record is displayed as Approved")
	public void verify_record_is_displayed_as_approved() throws Throwable {

	}
	
	@When("click on TSP icon and click on Pay Now button for Outbound")
	public void click_on_tsp_icon_and_click_on_pay_now_button_for_outbound() throws Throwable {
	   Thread.sleep(10000);
	   wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.TSP_Icon, 30);
	   ECOM_Outbound.TSP_Icon.click();
	   Thread.sleep(20000);

	   ECOM_Outbound.TspHSN_Code_Tb.sendKeys(wm.RandomNo(6), Keys.END);
		Entity = "BIAL ECOM UAT";
		TestDataReader.ReadLoginDetails(Entity);
		Thread.sleep(5000);
		System.out.println("pwd= " + Password);

	   ECOM_Outbound.TspTransactionPwd_Tb.sendKeys(Password, Keys.END);
	   ECOM_Outbound.TspPayNow_Btn.click();
	   Thread.sleep(10000);
	   ECOM_Outbound.YesTsp_Btn.click();
	   Thread.sleep(10000);
	   ECOM_Outbound.TspToken_Btn.click();
	   Thread.sleep(10000);

	   
	}

	@When("click on Vehicle Token icon for Outbound")
	public void click_on_vehicle_token_icon_for_outbound() throws Throwable {
	    Thread.sleep(8000);
	    ECOM_Outbound.VehicleToken_Icon.click();
		   Thread.sleep(20000);
		wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.VehicleNo_Tb, 30);
		   Thread.sleep(3000);
	}
	
	@When("enter Vehicle details and click on Generate Token for Add NonEShipment Outbound")
	public void enter_vehicle_details_and_click_on_generate_token_for_add_non_e_shipment_outbound() throws Throwable {
		 Thread.sleep(3000);
	        wm.scrollTillElement(driver, ECOM_Outbound.VehicleNo_Tb);
			ECOM_Outbound.VehicleNo_Tb.sendKeys("MH01"+wm.RandomNo(4), Keys.END);        Thread.sleep(1000);
		    ECOM_Outbound.DriverLicenseNo_Tb.sendKeys("D"+wm.RandomNo(5), Keys.END);        Thread.sleep(1000);
		    ECOM_Outbound.DriverName_Tb.sendKeys("tester", Keys.END);Thread.sleep(1000);
		    ECOM_Outbound.DriverMobileno_Tb.sendKeys("982"+wm.RandomNo(7), Keys.END);Thread.sleep(1000);
		    ECOM_Outbound.AgentMobileno_Tb.sendKeys("982"+wm.RandomNo(7), Keys.END);Thread.sleep(1000);;
//		    ECOM_Outbound.NOP1_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);Thread.sleep(3000);
//		    ECOM_Outbound.NOP1_Tb.sendKeys("1", Keys.END);
		    ECOM_Outbound.GrossWeight1_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);

		    ECOM_Outbound.GrossWeight1_Tb.sendKeys("5", Keys.END);Thread.sleep(3000);
		    ECOM_Outbound.TokenRemarks_Tb.sendKeys("ok", Keys.END);
			   Thread.sleep(3000);
		    wm.scrollTillElement(driver, ECOM_Outbound.GenerateToken_Btn);
		    ECOM_Outbound.GenerateToken_Btn.click();
			   Thread.sleep(3000);
			   
			wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.GenerateTokenOk_Btn, 30);
			ECOM_Outbound.GenerateTokenOk_Btn.click();
			   Thread.sleep(3000);

	}
	
	@When("enter Vehicle details and click on Generate Token for NonEShipment Outbound")
	public void enter_vehicle_details_and_click_on_generate_token_for_non_e_shipment_outbound() throws Throwable {
        Thread.sleep(3000);
        wm.scrollTillElement(driver, ECOM_Outbound.VehicleNo_Tb);
		ECOM_Outbound.VehicleNo_Tb.sendKeys("MH01"+wm.RandomNo(4), Keys.END);        Thread.sleep(1000);
	    ECOM_Outbound.DriverLicenseNo_Tb.sendKeys("D"+wm.RandomNo(5), Keys.END);        Thread.sleep(1000);
	    ECOM_Outbound.DriverName_Tb.sendKeys("tester", Keys.END);Thread.sleep(1000);
	    ECOM_Outbound.DriverMobileno_Tb.sendKeys("982"+wm.RandomNo(7), Keys.END);Thread.sleep(1000);
	    ECOM_Outbound.AgentMobileno_Tb.sendKeys("982"+wm.RandomNo(7), Keys.END);Thread.sleep(1000);;
	    ECOM_Outbound.NOP1_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);Thread.sleep(3000);
	    ECOM_Outbound.NOP1_Tb.sendKeys("1", Keys.END);
	    ECOM_Outbound.GrossWeight1_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);

	    ECOM_Outbound.GrossWeight1_Tb.sendKeys("5", Keys.END);Thread.sleep(3000);
	    ECOM_Outbound.TokenRemarks_Tb.sendKeys("ok", Keys.END);
		   Thread.sleep(3000);
	    wm.scrollTillElement(driver, ECOM_Outbound.GenerateToken_Btn);
	    ECOM_Outbound.GenerateToken_Btn.click();
		   Thread.sleep(3000);
		   
		wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.GenerateTokenOk_Btn, 30);
		ECOM_Outbound.GenerateTokenOk_Btn.click();
		   Thread.sleep(3000);


	}
	
	@When("enter Vehicle details and click on Generate Token for Outbound")
	public void enter_vehicle_details_and_click_on_generate_token_for_outbound() throws Throwable {
	    ECOM_Outbound.VehicleNo_Tb.sendKeys("MH01"+wm.RandomNo(4), Keys.END);   Thread.sleep(3000);
	    ECOM_Outbound.DriverLicenseNo_Tb.sendKeys("D"+wm.RandomNo(5), Keys.END);	   Thread.sleep(3000);
	    ECOM_Outbound.DriverName_Tb.sendKeys("tester", Keys.END);  Thread.sleep(3000);
	    ECOM_Outbound.DriverMobileno_Tb.sendKeys("982"+wm.RandomNo(7), Keys.END);   Thread.sleep(3000);
	    ECOM_Outbound.AgentMobileno_Tb.sendKeys("982"+wm.RandomNo(7), Keys.END);   Thread.sleep(3000);
	    ECOM_Outbound.TokenRemarks_Tb.sendKeys("ok", Keys.END);	   Thread.sleep(3000);
		Thread.sleep(3000);

	    wm.scrollTillElement(driver, ECOM_Outbound.GenerateToken_Btn);
	    ECOM_Outbound.GenerateToken_Btn.click();
		   Thread.sleep(3000);

	}

	//Regenerate Token
	@When("enter Vehicle details and click on Add Token for Outbound")
	public void enter_vehicle_details_and_click_on_add_token_for_outbound() throws Throwable {
		ECOM_Outbound.VehicleNo_Tb.sendKeys("MH01"+wm.RandomNo(4), Keys.END);
	    ECOM_Outbound.DriverLicenseNo_Tb.sendKeys("D"+wm.RandomNo(5), Keys.END);
	    ECOM_Outbound.DriverName_Tb.sendKeys("tester", Keys.END);
	    ECOM_Outbound.DriverMobileno_Tb.sendKeys("982"+wm.RandomNo(7), Keys.END);
	    ECOM_Outbound.AgentMobileno_Tb.sendKeys("982"+wm.RandomNo(7), Keys.END);
	    ECOM_Outbound.NOP1_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);Thread.sleep(3000);
	    ECOM_Outbound.NOP1_Tb.sendKeys("2", Keys.END);
	    ECOM_Outbound.GrossWeight1_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);

	    ECOM_Outbound.GrossWeight1_Tb.sendKeys("20", Keys.END);Thread.sleep(3000);
	    ECOM_Outbound.TokenRemarks_Tb.sendKeys("ok", Keys.END);
		   Thread.sleep(3000);
		ECOM_Outbound.AddToken_Icon.click();
		   Thread.sleep(3000);
	    wm.scrollTillElement(driver, ECOM_Outbound.GenerateToken_Btn);


	}
	
	@When("enter {int} Vehicle details and click on Generate Token for Outbound")
	public void enter_vehicle_details_and_click_on_generate_token_for_outbound(Integer int1) throws Throwable {
		ECOM_Outbound.VehicleNo2_Tb.sendKeys("MH01"+wm.RandomNo(4), Keys.END); 		   Thread.sleep(3000);
	    ECOM_Outbound.DriverLicenseNo2_Tb.sendKeys("D"+wm.RandomNo(5), Keys.END);		   Thread.sleep(3000);
	    ECOM_Outbound.DriverName2_Tb.sendKeys("tester", Keys.END);		   Thread.sleep(3000);
	    ECOM_Outbound.DriverMobileno2_Tb.sendKeys("982"+wm.RandomNo(7), Keys.END);		   Thread.sleep(3000);
	    ECOM_Outbound.AgentMobileno2_Tb.sendKeys("982"+wm.RandomNo(7), Keys.END);		   Thread.sleep(3000);
	    ECOM_Outbound.NOP2_Tb.sendKeys("1", Keys.END);		   Thread.sleep(3000);
	    ECOM_Outbound.GrossWeight2_Tb.sendKeys("10", Keys.END);		   Thread.sleep(3000);
	    ECOM_Outbound.TokenRemarks2_Tb.sendKeys("ok", Keys.END);		   Thread.sleep(3000);
		   Thread.sleep(3000);

	    ECOM_Outbound.GenerateToken_Btn.click();
		   Thread.sleep(3000);
		wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.GenerateTokenOk_Btn, 30);
		ECOM_Outbound.GenerateTokenOk_Btn.click();
		   Thread.sleep(3000);

	}

	//Upload Bag Pieces
	@When("upload file of Bag pieces for Outbound")
	public void upload_file_of_bag_pieces_for_outbound() throws Throwable {
        Thread.sleep(8000);
		ECOM_Outbound.UploadBagPieces_Btn.sendKeys("D:\\Bag No. Template.xlsx");
		   Thread.sleep(8000);
		ECOM_Outbound.UploadPieces_Btn.click();
		   Thread.sleep(8000);
		ECOM_Outbound.BagUploadOk_Btn.click();
		   Thread.sleep(8000);
	    wm.scrollTillElement(driver, ECOM_Outbound.OkDimension_PopupBtn);
	    ECOM_Outbound.OkDimension_PopupBtn.click();
	    Thread.sleep(8000);

	}

	@When("click on Print icon for AWB Outbound")
	public void click_on_print_icon_for_awb_outbound() throws Throwable {
	   ECOM_Outbound.PrintAWB_Icon.click();
	   Thread.sleep(3000);

	}
	
	@When("click on Roll paper radiobutton for Outbound")
	public void click_on_roll_paper_radiobutton_for_outbound() {
       ECOM_Outbound.RollPaper_Rdb.click();
	}
	
	@When("enter label information for Outbound")
	public void enter_label_information_for_outbound() {
	   ECOM_Outbound.LabelCopies_Tb.sendKeys("1", Keys.END);
	   ECOM_Outbound.LabelFrom_Tb.sendKeys("1", Keys.END);
	   ECOM_Outbound.LabelTo_Tb.sendKeys("2", Keys.END);

	}
	
	@When("click on Print button for Outbound")
	public void click_on_print_button_for_outbound() throws Throwable {
       ECOM_Outbound.PrintAWB_Btn.click();
	   Thread.sleep(3000);
	   for (String handle : driver.getWindowHandles()) {
	        driver.switchTo().window(handle);}	        

	}
	
	//Ecom eDocket 
	@When("upload eDocket files for Outbound")
	public void upload_e_docket_files_for_outbound() throws Throwable {
	   ECOM_Outbound.eDocket_Icon.click();
	   Thread.sleep(20000);
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//       WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable());
//        dropdown.click();
       driver.switchTo().frame(ECOM_Outbound.iframe);
       wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//select[@id='ctl00_hldPage_ddlistDocTemplates']"))).click();

       Select document1DD= new Select(ECOM_Outbound.SelectDocument1_DD);
       document1DD.selectByIndex(1);
	   Thread.sleep(3000);

       ECOM_Outbound.ChooseFile1_Btn.sendKeys("D:\\pdf1.pdf");
	   Thread.sleep(3000);
	   ECOM_Outbound.eDocketUpload_Btn.click();
	   Thread.sleep(3000);
	   ECOM_Outbound.eDocketRecord_Cb.click();
	   Thread.sleep(3000);

       ECOM_Outbound.eDocketSubmit_Btn.click();
	   Thread.sleep(3000);
	   ECOM_Outbound.eDocketOk_Btn.click();
	   Thread.sleep(3000);

	   driver.switchTo().defaultContent();
	   Thread.sleep(3000);

	}
	
	@Then("verify eDocket files are uploaded in Approver")
	public void verify_e_docket_files_are_uploaded_in_approver() {

		
	}

	//TSP ASI
	@When("launch browser for Galaxy application and login with {string} ACS GHA user given in {string} sheet for ECOM TSP")
	public void launch_browser_for_galaxy_application_and_login_with_acs_gha_user_given_in_sheet_for_ecom_tsp(String entity, String sheetName) throws Throwable {
		String URL_Galaxy= "https://galaxyuat.kalelogistics.com/GalaxyV3DOM/Login.aspx";
		((JavascriptExecutor) driver).executeScript("window.open('" + URL_Galaxy+ "', '_blank');");    
		
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
	    driver.switchTo().window(tabs.get(1));
	      System.out.println("Back to original tab: " + driver.getTitle());
			AwbGenerated= Nmial_Outbound.AwbShipment_Grid.getText().toString();
		     Thread.sleep(10000);

        driver.switchTo().window(tabs.get(3));
        System.out.println("Switched back to new tab: " + driver.getTitle());
	     Thread.sleep(10000);


	}
	
	@When("click on Billing>> Customer Invoice for TSP")
	public void click_on_billing_customer_invoice_for_tsp() throws Throwable {
		   Thread.sleep(3000);
	     Nmial_Outbound.Billing_Tab.click();
		   Thread.sleep(3000);
		   Nmial_Outbound.TspCustomerInvoice_Tab.click();
		   Thread.sleep(3000);
		   driver.switchTo().frame(Nmial_Outbound.PageFrame);
		   Thread.sleep(3000);
		   Select typeDD= new Select(Nmial_Outbound.DocumentType_DD);
		   typeDD.selectByIndex(1);
		   Nmial_Outbound.DocumentID_Tb.sendKeys(AwbGenerated, Keys.TAB);
		   Thread.sleep(3000);

		Nmial_Outbound.SearchInvoice_Btn.click();
		   Thread.sleep(8000);

	}
	
	@When("select {string} Document Type, enter AWB, click on Search button with click on Calc Charges and Pay Proceed button")
	public void select_document_type_enter_awb_click_on_search_button_with_click_on_calc_charges_and_pay_proceed_button(String value) throws Throwable {
		Nmial_Outbound.CalculateCharges_Btn.click();
		   Thread.sleep(3000);
	    Nmial_Outbound.PayProceed_Btn.click();
		   Thread.sleep(3000);

	}

	//Resubmit CO
	@When("click on {int} Edit icon of EShipment for Outbound")
	public void click_on_edit_icon_of_e_shipment_for_outbound(Integer row) throws Throwable {
	   wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.EditAWB_Icon, 30);
	   ECOM_Outbound.EditAWB_Icon.get(row-1).click();
	   Thread.sleep(3000);
       wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.CargoType_DD, 30);
       
	}

	@When("enter Dimension pieces for NonEShipment")
	public void enter_dimension_pieces_for_non_e_shipment() throws Throwable {
		Thread.sleep(3000);
	    if(wm.isElementPresent(driver, ECOM_Outbound.DeleteDimension_Icon)) {
		    ECOM_Outbound.DeleteDimension_Icon.click();
		    Thread.sleep(3000);
		    
	    }

		    ECOM_Outbound.DimensionNOP1_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
		    Thread.sleep(3000);
		    ECOM_Outbound.DimensionNOP1_Tb.sendKeys(nop, Keys.END);
		    Thread.sleep(3000);
		    ECOM_Outbound.OkDimension_PopupBtn.click();
		    Thread.sleep(8000);


	}

	@When("select Cargo and Commodity type of EShipment for Outbound")
	public void select_cargo_and_commodity_type_of_e_shipment_for_outbound() {
		Select cargo= new Select(ECOM_Outbound.CargoType_DD);
	       cargo.selectByIndex(5);
	       Select commodity= new Select(ECOM_Outbound.CommodityType_DD);
	       commodity.selectByIndex(5);
		
	}
	
	@When("click on Ok button of Resubmit popup")
	public void click_on_ok_button_of_resubmit_popup() throws Throwable {
		wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.OkResubmitASI_Btn, 30);
		   Thread.sleep(3000);
		ECOM_Outbound.OkResubmitASI_Btn.click();
		   Thread.sleep(3000);

	}
	
	//SIR
	@When("launch browser for Ecom GHA application and login with {string} ECOM GHA user given in {string} sheet for Outbound")
	public void launch_browser_for_ecom_gha_application_and_login_with_ecom_gha_user_given_in_sheet_for_outbound(String entity, String value2) throws Throwable {
		String Ecom_URL= "https://galaxyuat.kalelogistics.com/GalaxyV3DOM/Login.aspx";
        System.out.println("nop=" +Integer.toString((Integer.parseInt(nop)-1))+"\t"+nop);
		((JavascriptExecutor) driver).executeScript("window.open('" + Ecom_URL + "', '_blank');");    

        for (String handle : driver.getWindowHandles()) {
        driver.switchTo().window(handle);}
        
		Entity = entity;
		TestDataReader.ReadLoginDetails(Entity);
		Thread.sleep(500);
		loginScreen.Bial_Login(entity, Username, Password);
		   Thread.sleep(3000);
		   
		   List<String> tabs = new ArrayList<>(driver.getWindowHandles());
		    driver.switchTo().window(tabs.get(0));
			   Thread.sleep(20000);

		      System.out.println("Back to original tab: " + driver.getTitle());
		      AwbGenerated= Nmial_Outbound.AwbShipment_Grid.getText().toString();
				     Thread.sleep(10000);
//		      Flight= Nmial_Outbound.AwbFlight_Grid.getText().toString();
//			     Thread.sleep(10000);

		        driver.switchTo().window(tabs.get(1));
		        System.out.println("Switched back to new tab: " + driver.getTitle());
			     Thread.sleep(10000);
	       
	}
	
	@When("launch browser for Ecom GHA application and login with {string} ECOM GHA user given in {string} sheet for Inbound")
	public void launch_browser_for_ecom_gha_application_and_login_with_ecom_gha_user_given_in_sheet_for_inbound(String entity, String value) throws Throwable {
		String Ecom_URL= "https://galaxyuat.kalelogistics.com/GalaxyV3DOM/Login.aspx";
        System.out.println("nop=" +Integer.toString((Integer.parseInt(nop)-1))+"\t"+nop);
		((JavascriptExecutor) driver).executeScript("window.open('" + Ecom_URL + "', '_blank');");    

        for (String handle : driver.getWindowHandles()) {
        driver.switchTo().window(handle);}
        
		Entity = entity;
		TestDataReader.ReadLoginDetails(Entity);
		Thread.sleep(500);
		loginScreen.Bial_Login(entity, Username, Password);
		   Thread.sleep(3000);

	}
	
		
	@When("click on VCT> VCT Generation and click on VCT no for ECOM Outbound")
	public void click_on_vct_vct_generation_and_click_on_vct_no_for_ecom_outbound() throws Throwable {
	   wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.VCT_Tab, 30);
	   ECOM_Outbound.VCT_Tab.click();
	   wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.VctGeneration_Tab, 30);
	   ECOM_Outbound.VctGeneration_Tab.click();
	   Thread.sleep(3000);
	    driver.switchTo().frame(Nmial_Outbound.PageFrame);
	   Thread.sleep(3000);
	   wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.VCTno_List, 30);
	   ECOM_Outbound.VCTno_List.click();
	   Thread.sleep(8000);

	   ECOM_Outbound.Details_Tab.click();
	   Thread.sleep(3000);
       driver.switchTo().defaultContent();
	   Thread.sleep(3000);

	}
	
	@When("click on VCT> VCT Acceptance, select {int} Bag level shipment  select Door and {string} click on Dock In button for ECOM Outbound")
	public void click_on_vct_vct_acceptance_select_bag_level_shipment_select_door_and_click_on_dock_in_button_for_ecom_outbound(Integer row, String value) throws Throwable {
	   ECOM_Outbound.VctAccpt_Tab.click();
	   Thread.sleep(3000);
	    driver.switchTo().frame(Nmial_Outbound.PageFrame);
	   Thread.sleep(3000);

//	   ECOM_Outbound.CargoVCT_Cb.get(row-1).click();
//	   wm.scrollTillElement(driver, ECOM_Outbound.AcceptCargo_Btn);
//	   Thread.sleep(3000);

	}
	
	@When("click on Accept button for ECOM Outbound")
	public void click_on_accept_button_for_ecom_outbound() throws Throwable {
		ECOM_Outbound.AwbNOP1_Tb.sendKeys(ECOM_Outbound.RemainingNOP_Lbl.getText().toString(), Keys.TAB);	Thread.sleep(5000);
		Select doorDD= new Select(ECOM_Outbound.Door_DD);
		doorDD.selectByIndex(1);Thread.sleep(3000);
        ECOM_Outbound.DockIn_Btn.click();Thread.sleep(3000);
//		wm.scrollTillElement(driver, ECOM_Outbound.AcceptCargo_Btn);		   Thread.sleep(3000);
//		ECOM_Outbound.AcceptCargo_Btn.click();
//		   Thread.sleep(20000);
//    	wm.scrollTillElement(driver, ECOM_Outbound.DockIn_Tb);
//		   Thread.sleep(20000);

		   ECOM_Outbound.CargoVCT_Cb.get(1).click();
		   Thread.sleep(20000);
		   ECOM_Outbound.AwbNOP1_Tb.sendKeys("1", Keys.END);Thread.sleep(3000);
		   ECOM_Outbound.AwbLength1_Tb.sendKeys("100", Keys.TAB);		   Thread.sleep(3000);
		   ECOM_Outbound.AwbWidth1_Tb.sendKeys("100", Keys.TAB);		   Thread.sleep(3000);
		   ECOM_Outbound.AwbHeight1_Tb.sendKeys("200", Keys.TAB);		   Thread.sleep(3000);

		   
			wm.scrollTillElement(driver, ECOM_Outbound.AcceptCargo_Btn);		   Thread.sleep(3000);
			ECOM_Outbound.AcceptCargo_Btn.click();
			   Thread.sleep(20000);
			   
		wm.scrollTillElement(driver, ECOM_Outbound.VCT_Tb);
	    ECOM_Outbound.CargoVCT_Cb.get(2).click();
		   Thread.sleep(20000);
		   ECOM_Outbound.AwbNOP1_Tb.sendKeys("1", Keys.END);Thread.sleep(3000);
		   ECOM_Outbound.AwbLength1_Tb.sendKeys("100", Keys.TAB);		   Thread.sleep(5000);
		   ECOM_Outbound.AwbWidth1_Tb.sendKeys("100", Keys.TAB);		   Thread.sleep(5000);
		   ECOM_Outbound.AwbHeight1_Tb.sendKeys("200", Keys.TAB);		   Thread.sleep(5000);

			   
		   wm.scrollTillElement(driver, ECOM_Outbound.AcceptCargo_Btn);		   Thread.sleep(3000);
			ECOM_Outbound.AcceptCargo_Btn.click();
		   Thread.sleep(20000);
		
    	wm.scrollTillElement(driver, ECOM_Outbound.VCT_Tb);
		   Thread.sleep(20000);
		ECOM_Outbound.CargoVCT_Cb.get(3).click();
			   Thread.sleep(20000);
			   ECOM_Outbound.AwbNOP1_Tb.sendKeys("1", Keys.END);Thread.sleep(3000);
			   ECOM_Outbound.AwbLength1_Tb.sendKeys("100", Keys.TAB);		   Thread.sleep(5000);
			   ECOM_Outbound.AwbWidth1_Tb.sendKeys("100", Keys.TAB);		   Thread.sleep(5000);
			   ECOM_Outbound.AwbHeight1_Tb.sendKeys("200", Keys.TAB);		   Thread.sleep(5000);
				   
	    wm.scrollTillElement(driver, ECOM_Outbound.AcceptCargo_Btn);		   Thread.sleep(20000);
		ECOM_Outbound.AcceptCargo_Btn.click();
		   Thread.sleep(20000);

		wm.scrollTillElement(driver, ECOM_Outbound.VCT_Tb); Thread.sleep(20000);
		ECOM_Outbound.CargoVCT_Cb.get(0).click();
		   Thread.sleep(20000);

	    ECOM_Outbound.CompleteAccpt_Btn.click();Thread.sleep(20000);
	    driver.switchTo().alert().accept();
		   Thread.sleep(20000);
		   List<String> tabs = new ArrayList<>(driver.getWindowHandles());
		    driver.switchTo().window(tabs.get(0));
		      System.out.println("Back to original tab: " + driver.getTitle());
            driver.navigate().refresh();
 		   Thread.sleep(20000);

		   
	}

	
	@When("select {int} Bag level shipment  select Door and {string} click on Dock In button for ECOM Outbound")
	public void select_bag_level_shipment_select_door_and_click_on_dock_in_button_for_ecom_outbound(Integer row, String value) {
	   
	}
	
	@When("click on Accept button and click on Complete Accept button for ECOM Outbound")
	public void click_on_accept_button_and_click_on_complete_accept_button_for_ecom_outbound() throws Throwable {
		ECOM_Outbound.AwbNOP1_Tb.sendKeys("1", Keys.TAB);		   Thread.sleep(5000);
		   ECOM_Outbound.AwbLength1_Tb.sendKeys("100", Keys.TAB);		   Thread.sleep(5000);
		   ECOM_Outbound.AwbWidth1_Tb.sendKeys("100", Keys.TAB);		   Thread.sleep(5000);
		   ECOM_Outbound.AwbHeight1_Tb.sendKeys("200", Keys.TAB);		   Thread.sleep(5000);

		wm.scrollTillElement(driver, ECOM_Outbound.AcceptCargo_Btn);		   Thread.sleep(3000);
		ECOM_Outbound.AcceptCargo_Btn.click();
		   Thread.sleep(20000);
    	wm.scrollTillElement(driver, ECOM_Outbound.DockIn_Tb);
		   Thread.sleep(20000);

		   ECOM_Outbound.CargoVCT_Cb.get(1).click();
		   Thread.sleep(20000);

		wm.scrollTillElement(driver, ECOM_Outbound.CompleteAccpt_Btn);
		   Thread.sleep(3000);

	    ECOM_Outbound.CompleteAccpt_Btn.click();
		   Thread.sleep(20000);

		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		         Alert alert = wait.until(ExpectedConditions.alertIsPresent());
   
		driver.switchTo().alert().accept();
		   Thread.sleep(20000);

	}
	
	@When("select {int} AWB level shipment for ECOM Outbound")
	public void select_awb_level_shipment_for_ecom_outbound(Integer row) throws Throwable {
		ECOM_Outbound.VctAccpt_Tab.click();
		   Thread.sleep(3000);
		    driver.switchTo().frame(Nmial_Outbound.PageFrame);
		   Thread.sleep(3000);

		   ECOM_Outbound.CargoVCT_Cb.get(row-1).click();

		   Thread.sleep(5000);
        String remaining= ECOM_Outbound.RemainingNOP_Lbl.getText().toString();
		   Thread.sleep(5000);

		wm.scrollTillElement(driver, ECOM_Outbound.AwbNOP1_Tb);
		   Thread.sleep(5000);
		   ECOM_Outbound.AwbNOP1_Tb.sendKeys(remaining, Keys.TAB);		   Thread.sleep(5000);
		   ECOM_Outbound.AwbLength1_Tb.sendKeys("100", Keys.TAB);		   Thread.sleep(5000);
		   ECOM_Outbound.AwbWidth1_Tb.sendKeys("100", Keys.TAB);		   Thread.sleep(5000);
		   ECOM_Outbound.AwbHeight1_Tb.sendKeys("200", Keys.TAB);		   Thread.sleep(5000);
		wm.scrollTillElement(driver, ECOM_Outbound.AcceptCargo_Btn);
			   Thread.sleep(5000);


//		ECOM_Outbound.AcceptCargo_Btn.click();
//		   Thread.sleep(20000);

	}
	
	@When("click on Complete Accept button for ECOM Outbound")
	public void click_on_complete_accept_button_for_ecom_outbound() throws Throwable {
	    ECOM_Outbound.CompleteAccpt_Btn.click();
		   Thread.sleep(5000);
	    List<String> tabs = new ArrayList<>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	      System.out.println("Back to original tab: " + driver.getTitle());
	      AwbGenerated= Nmial_Outbound.AwbShipment_Grid.getText().toString();
			     Thread.sleep(10000);

	        driver.switchTo().window(tabs.get(0));
	        System.out.println("Switched back to new tab: " + driver.getTitle());
		     Thread.sleep(10000);

	}
	
	@When("click on SIR icon of created AWB for ECOM Outbound")
	public void click_on_sir_icon_of_created_awb_for_ecom_outbound() throws Throwable {
	    wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.SIR_Icon, 30);
		   Thread.sleep(5000);
		for(int j=0;j<5;j++) {
		driver.navigate().refresh();
		   Thread.sleep(3000);
		}


	}

	//AWB BTT
	
	@When("click on Exports> Export AWB Amendment for Outbound")
	public void click_on_exports_export_awb_amendment_for_outbound() throws Throwable {
	 
	}
	
	@When("enter {string} AWB and click on Search button for AWB Amendment ECOM Outbound")
	public void enter_awb_and_click_on_search_button_for_awb_amendment_ecom_outbound(String value) throws Throwable {
		 List<String> tabs = new ArrayList<>(driver.getWindowHandles());
		 driver.switchTo().window(tabs.get(0));
		   System.out.println("Back to original tab: " + driver.getTitle());
		   AwbGenerated= Nmial_Outbound.AwbShipment_Grid.getText().toString();
		   Thread.sleep(5000);
		   System.out.println("awb= "+AwbGenerated);

		 driver.switchTo().window(tabs.get(1));
		   System.out.println("Switched back to new tab: " + driver.getTitle());
		   Thread.sleep(5000);
		
		 driver.switchTo().defaultContent();  Thread.sleep(5000);
		   ECOM_Outbound.Exports_Tab.click();
		   Thread.sleep(5000);
		ECOM_Outbound.ExportAwbAmendment_Tab.click();
		   Thread.sleep(5000);


		driver.switchTo().frame(Nmial_Outbound.PageFrame);		   Thread.sleep(5000);
	    ECOM_Outbound.AwbAmendment_Tb.sendKeys(AwbGenerated, Keys.END);		   Thread.sleep(5000);
	    ECOM_Outbound.SearchAwbAmendment_Tb.click();
		   Thread.sleep(5000);

	}
	
	@When("click on Logout button for Galaxy ECOM")
	public void click_on_logout_button_for_galaxy_ecom() throws Throwable {
	    driver.switchTo().defaultContent();
		   Thread.sleep(5000);
	    ECOM_Outbound.GalaxyLogout_Icon.click();
		   Thread.sleep(5000);

	}
	
	@When("click on Bag Details button and add Bag for Outbound")
	public void click_on_bag_details_button_and_add_bag_for_outbound() throws Throwable {
		

	   wm.scrollTillElement(driver, ECOM_Outbound.BagDetails_Btn);	   
   
      // Store window handles BEFORE child window opens
       Set<String> handlesBefore = driver.getWindowHandles();

       // ---- Action that opens child window ----
       // driver.findElement(...).click(); 


	   ECOM_Outbound.BagDetails_Btn.click();	   Thread.sleep(10000);
	   String p= driver.getWindowHandle();
 		Set<String> s= driver.getWindowHandles();
 		Iterator<String> I= s.iterator();
 		Object[] windowHandles= driver.getWindowHandles().toArray();
 		driver.switchTo().window((String) windowHandles[2]);
 		System.out.println(driver.getTitle());
 	

//         Store window handles AFTER child window opens
      Set<String> handlesAfter = driver.getWindowHandles();
       wm.scrollTillElement(driver, ECOM_Outbound.AddAmendBag_Icon.get(2));Thread.sleep(10000);
       ECOM_Outbound.AddAmendBag_Icon.get(2).click();	   Thread.sleep(10000);
	    ECOM_Outbound.BagNo4_Tb.sendKeys("B"+wm.RandomNo(3), Keys.END);	   Thread.sleep(10000);
	    ECOM_Outbound.BagGrWt4_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);Thread.sleep(10000);
	    ECOM_Outbound.BagGrWt4_Tb.sendKeys("30", Keys.END);	   Thread.sleep(10000);
	    ECOM_Outbound.SaveAmendBag_Btn.click();	   Thread.sleep(10000);
     wait.until(ExpectedConditions.alertIsPresent());
  // Now handle the alert in that popup window
     wait.until(ExpectedConditions.alertIsPresent());
     Alert alert = driver.switchTo().alert();
     alert.accept();   // Clicks OK / Accept
     
     // Store window handles AFTER child window opens
//     Set<String> handlesAfter = driver.getWindowHandles();
//       // Identify and close the child window
//       for (String handle : handlesAfter) {
//           if (!handlesBefore.contains(handle)) {
//               driver.switchTo().window(handle);
//               driver.close();   // closes child window only
//               break;
//           }
//       }
//
//       // Switch back to second tab
//       driver.switchTo().window(secondTabHandle);       		
 	
	driver.switchTo().window((String) windowHandles[1]);
	   Thread.sleep(10000);
// Nmial_Outbound.CancelDamage_Btn.click(); 		
     Thread.sleep(8000); 
      Thread.sleep(8000); 
      
      driver.switchTo().frame(Nmial_Outbound.PageFrame);


	}
	
	@When("enter Chargeable Weight")
	public void enter_chargeable_weight() throws Throwable {
	   ECOM_Outbound.ChWtBag_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);	    Thread.sleep(10000); 
	   ECOM_Outbound.ChWtBag_Tb.sendKeys("300", Keys.END);	    Thread.sleep(10000);
	   ECOM_Outbound.SaveChWt_Btn.click();	    Thread.sleep(10000); 
	   driver.switchTo().defaultContent();

	}
	
		
	@When("click on Exports> Security Acceptance for Outbound and click on search button for AWB")
	public void click_on_exports_security_acceptance_for_outbound_and_click_on_search_button_for_awb() throws Throwable {
		ECOM_Outbound.SecurityAccpt_Tab.click(); Thread.sleep(8000);
		driver.switchTo().frame(Nmial_Outbound.PageFrame);
		ECOM_Outbound.AccptDetails_Tab.click();  Thread.sleep(8000);
		
		ECOM_Outbound.AccptPfx_Tb.sendKeys("312", Keys.END);
		ECOM_Outbound.AccptAWB_Tb.sendKeys(AwbGenerated.substring(4), Keys.TAB); Thread.sleep(8000);
		ECOM_Outbound.AccptSearch_Btn.click();Thread.sleep(8000);
		Select machineDD= new Select(ECOM_Outbound.MachineNo_DD);
		machineDD.selectByIndex(3);
				
	}
	
	@When("click on Print sticker icon, click on Save button and click on Rejection button for Outbound")
	public void click_on_print_sticker_icon_click_on_save_button_and_click_on_rejection_button_for_outbound() throws Throwable {
	       Set<String> handlesBefore = driver.getWindowHandles();

		ECOM_Outbound.PrintSticker_Icon.click();
		Thread.sleep(8000);
		 String p= driver.getWindowHandle();
	  		Set<String> s= driver.getWindowHandles();
	  		Iterator<String> I= s.iterator();
	  		Object[] windowHandles= driver.getWindowHandles().toArray();
	  		driver.switchTo().window((String) windowHandles[2]);
	  		System.out.println(driver.getTitle());
			Thread.sleep(8000);
		 wm.scrollTillElement(driver, ECOM_Outbound.CancelAccpt_Btn);
		 ECOM_Outbound.CancelAccpt_Btn.click();
			Thread.sleep(8000);
	 	driver.switchTo().window((String) windowHandles[1]);
		    Thread.sleep(8000);
        driver.switchTo().frame(Nmial_Outbound.PageFrame);
//	     Store window handles AFTER child window opens
//	     Set<String> handlesAfter = driver.getWindowHandles();		Thread.sleep(8000);

	       // Identify and close the child window
//	       for (String handle : handlesAfter) {
//	           if (!handlesBefore.contains(handle)) {
//	               driver.switchTo().window(handle);
//	               driver.close();   // closes child window only
//	               break;
//	           }
//	       }       
	   
		wm.scrollTillElement(driver, ECOM_Outbound.SaveAccpt_Btn);
		Thread.sleep(8000);
		ECOM_Outbound.SaveAccpt_Btn.click();
		Thread.sleep(8000);
		

		
	}
	
	@When("select AWB to reject, enter Remarks and click on Reject button for Outbound")
	public void select_awb_to_reject_enter_remarks_and_click_on_reject_button_for_outbound() throws Throwable {
		
  		 Thread.sleep(10000);
       // Store window handles BEFORE child window opens
//       Set<String> handlesBefore = driver.getWindowHandles();

       ECOM_Outbound.Rejection_Btn.click();
		Thread.sleep(20000);
		String p= driver.getWindowHandle();
  		Set<String> s= driver.getWindowHandles();
  		Iterator<String> I= s.iterator();
  		Object[] windowHandles= driver.getWindowHandles().toArray();
  		driver.switchTo().window((String) windowHandles[2]);
  		System.out.println(driver.getTitle());
  		

	    Set<String> handlesAfter = driver.getWindowHandles();

  		ECOM_Outbound.Reject_Cb1.click();
  		ECOM_Outbound.Reject_Cb2.click();
  		ECOM_Outbound.RemarkReject_Tb.sendKeys("rejected bags", Keys.END);
  		ECOM_Outbound.Reject_Btn.click();
  		wait.until(ExpectedConditions.alertIsPresent());
  	     // Now handle the alert in that popup window
  	        wait.until(ExpectedConditions.alertIsPresent());
  	        Alert alert = driver.switchTo().alert();
  	        alert.accept();   // Clicks OK / Accept
  	       Thread.sleep(8000);
  	       
  	     wait.until(ExpectedConditions.alertIsPresent());
  	     // Now handle the alert in that popup window
  	        wait.until(ExpectedConditions.alertIsPresent());
  	        alert = driver.switchTo().alert();
  	        alert.accept();   // Clicks OK / Accept
  	       Thread.sleep(8000);
  	       
  	 	driver.switchTo().window((String) windowHandles[1]);
   	       Thread.sleep(8000);

  	       
  	  // Identify and close the child window
//  	       for (String handle : handlesAfter) {
//  	           if (!handlesBefore.contains(handle)) {
//  	               driver.switchTo().window(handle);
//  	               driver.close();   // closes child window only
//  	               break;
//  	           }
//  	       }

  	       // Switch back to second tab
//  	       driver.switchTo().window(secondTabHandle);
  	   		
	}
	
	@When("click on More> Back To Town and search AWB for Outbound")
	public void click_on_more_back_to_town_and_search_awb_for_outbound() throws Throwable {
	   driver.switchTo().defaultContent();	Thread.sleep(8000); 
	   ECOM_Outbound.ExportMore_Icon.click();
	    Thread.sleep(8000); 
	   wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.BackToTown_Hyperlink, 30); 
	   ECOM_Outbound.BackToTown_Hyperlink.click();
	    Thread.sleep(8000); 
       driver.switchTo().frame(Nmial_Outbound.PageFrame);Thread.sleep(8000); 
       ECOM_Outbound.BttAwbPfx_Tb.sendKeys("312", Keys.END);
       ECOM_Outbound.BttAwb_Tb.sendKeys(AwbGenerated.substring(4).toString(), Keys.END);
       ECOM_Outbound.BttSearch_Btn.click();Thread.sleep(8000);
       wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.BttPkg_Tb, 30);Thread.sleep(8000);
	}
	
	@When("enter BTT details with Reason, enter Bag BTT details and click on Record BTT button for Outbound")
	public void enter_btt_details_with_reason_enter_bag_btt_details_and_click_on_record_btt_button_for_outbound() throws Throwable {
		ECOM_Outbound.BttPkg_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);Thread.sleep(8000);
		ECOM_Outbound.BttPkg_Tb.sendKeys("2", Keys.TAB);Thread.sleep(8000);
		ECOM_Outbound.BttReason_Tb.sendKeys("DMG", Keys.TAB);Thread.sleep(8000);
		ECOM_Outbound.BttCustomRefNo_Tb.sendKeys(wm.RandomNo(7), Keys.END);Thread.sleep(8000);
		ECOM_Outbound.Btt1_Tb.sendKeys("1", Keys.END);Thread.sleep(8000);
		ECOM_Outbound.Btt2_Tb.sendKeys("1", Keys.END);Thread.sleep(8000);

		ECOM_Outbound.RecordBTT_Btn.click();Thread.sleep(8000);
	}
	
	@When("select BTT Document and click on Collect Charges button for Outbound")
	public void select_btt_document_and_click_on_collect_charges_button_for_outbound() throws Throwable {
	   ECOM_Outbound.BttDocument_Cb.click();Thread.sleep(8000);
	   ECOM_Outbound.CollectCharge_Btn.click();Thread.sleep(20000);
	   
	}
	
	@When("click on Calculate Charges and Pay Proceed button for Outbound")
	public void click_on_calculate_charges_and_pay_proceed_button_for_outbound() throws Throwable {
	   driver.switchTo().defaultContent();Thread.sleep(8000);
	   driver.switchTo().frame(ECOM_Outbound.PageFrame);Thread.sleep(8000);
		Nmial_Outbound.CalculateCharges_Btn.click();Thread.sleep(8000);
		wm.scrollTillElement(driver, Nmial_Outbound.PayProceed_Btn);
		Nmial_Outbound.PayProceed_Btn.click();Thread.sleep(8000);
	}
	
	@When("select BTT Document and click on Generate Gatepass button for Outbound")
	public void select_btt_document_and_click_on_generate_gatepass_button_for_outbound() throws Throwable {
	   ECOM_Outbound.BttDocument_Cb.click();Thread.sleep(8000);
	   ECOM_Outbound.GenerateGP_Btn.click();Thread.sleep(8000);
	}
	
	@When("select BTT Document and click on Release Gatepass button for Outbound")
	public void select_btt_document_and_click_on_release_gatepass_button_for_outbound() throws Throwable {
		   ECOM_Outbound.BttDocument_Cb.click();Thread.sleep(8000);
		   ECOM_Outbound.ReleaseGP_Btn.click();Thread.sleep(8000);

	}
	
	//Gatepass
	@When("click on Masters>> More>> Flight> Details in ECOM GHA")
	public void click_on_masters_more_flight_details_in_ecom_gha() throws Throwable {
		 Nmial_Outbound.Masters_Tab.click();
		    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.FlightMore_Icon, 30);
		    Nmial_Outbound.FlightMore_Icon.click();
		    Thread.sleep(3000);
		    Nmial_Outbound.FlightECOM_Hyperlink.click();
		    Thread.sleep(3000);
		    
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
	
	@When("click on Add button and enter {string} Flight No, select {string} Aircraft Type in Flight Details of ECOM GHA")
	public void click_on_add_button_and_enter_flight_no_select_aircraft_type_in_flight_details_of_ecom_gha(String value1, String value2) throws Throwable {
		Thread.sleep(3000);
		Nmial_Outbound.Flight_Tb.sendKeys(flight, Keys.END);
	    Nmial_Outbound.AircraftType_Tb.sendKeys("100", Keys.END);
	    a.sendKeys(Keys.SHIFT);
	    Thread.sleep(3000);
	    a.sendKeys(Keys.ARROW_DOWN);
	    Thread.sleep(3000);
	    a.sendKeys(Keys.END);
	    Thread.sleep(3000);
	}
	
	@When("click on Routing details and enter {string} Origin, {string} Destination Airport details and click on Save button of ECOM GHA")
	public void click_on_routing_details_and_enter_origin_destination_airport_details_and_click_on_save_button_of_ecom_gha(String value1, String value2) throws Throwable {
		Nmial_Outbound.RoutingDetails_Tab.click();
	    Thread.sleep(3000);
	    
	    Nmial_Outbound.AirportCity_Tb.sendKeys(value1, Keys.END);Thread.sleep(3000);
	    Nmial_Outbound.DepartureDate_Tb.sendKeys(wm.CurrentDate("dd/MM/yyyy"), Keys.END);	    Thread.sleep(3000);
	    Nmial_Outbound.DepartureTimeHH_Tb.sendKeys("17", Keys.TAB);	    Thread.sleep(3000);
	    Nmial_Outbound.DepartureTimeMM_Tb.sendKeys("00", Keys.TAB);	    Thread.sleep(3000);


	    Nmial_Outbound.DestinationCity_Tb.sendKeys(value2, Keys.END);	    Thread.sleep(3000);
	    Nmial_Outbound.ArrivalDate_Tb.sendKeys(wm.CurrentDate("dd/MM/yyyy"), Keys.END);	    Thread.sleep(3000);
	    Nmial_Outbound.ArrivalTimeHH_Tb.sendKeys("21", Keys.END);	    Thread.sleep(3000);
	    Nmial_Outbound.ArrivalTimeMM_Tb.sendKeys("00", Keys.END);	    Thread.sleep(3000);
	    
	    Nmial_Outbound.SaveFlight_Icon.click();
	    Thread.sleep(8000);
	    driver.switchTo().defaultContent();
	    Thread.sleep(8000);

	}

	@When("click on Export>> Build Manifest in ECOM GHA")
	public void click_on_export_build_manifest_in_ecom_gha() {
		Nmial_Outbound.Exports_Tab.click();
		Nmial_Outbound.BuildManifest_Tab.click();
		driver.switchTo().frame(Nmial_Outbound.PageFrame);
	}
	
	@When("enter {string} and search flight and click on Add ULD details in ECOM GHA")
	public void enter_and_search_flight_and_click_on_add_uld_details_in_ecom_gha(String value) throws Throwable {
	    Nmial_Outbound.FlightPfxBuildManifest_Tb.sendKeys(value, Keys.TAB);
	    Nmial_Outbound.FlightNoBuildManifest_Tb.sendKeys("3241", Keys.TAB);
	    Nmial_Outbound.FlightNoBuildManifest_Tb.sendKeys(Flight.substring(3), Keys.TAB);
	    Nmial_Outbound.SearchBuildManifest_Icon.click();	    Thread.sleep(3000);

//	    driver.switchTo().frame(Nmial_Outbound.PageFrame);
	    
	    Nmial_Outbound.UldPfxBuildManifest_Tb.sendKeys("AA", Keys.TAB);	    Thread.sleep(8000);
	    Nmial_Outbound.UldNoBuildManifest_Tb.sendKeys(wm.RandomNo(5), Keys.TAB);	    Thread.sleep(8000);
	    Nmial_Outbound.UldFlightBuildManifest_Tb.sendKeys("6e", Keys.TAB);	    Thread.sleep(8000);

	    Nmial_Outbound.AddUldBuildManifest_Btn.click();
	    Thread.sleep(8000);

	}
	
	@When("select ULD and click on Add Ship button in ECOM GHA")
	public void select_uld_and_click_on_add_ship_button_in_ecom_gha() throws Throwable {
	    Nmial_Outbound.ULD_Cb.click();	    Thread.sleep(8000);
	    ECOM_Outbound.AddShip_Btn.click();Thread.sleep(8000);
	    String p= driver.getWindowHandle();
  		Set<String> s= driver.getWindowHandles();
  		Iterator<String> I= s.iterator();
  		Object[] windowHandles= driver.getWindowHandles().toArray();
  		driver.switchTo().window((String) windowHandles[1]);
  		System.out.println(driver.getTitle());
  		
  		ECOM_Outbound.ShipmentOnHand_Cb.click();	    Thread.sleep(8000);
  		ECOM_Outbound.AddShipment_Btn.click();	    Thread.sleep(8000);
  		
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
	
	@When("select shipment and click on Add Shipment button in ECOM GHA")
	public void select_shipment_and_click_on_add_shipment_button_in_ecom_gha() {
		
		
	   
	}
	
	@When("click on Close ULD, click on Flight Builtup button and clicked on Generate Gatepass button in ECOM GHA")
	public void click_on_close_uld_click_on_flight_builtup_button_and_clicked_on_generate_gatepass_button_in_ecom_gha() throws Throwable {
		 Nmial_Outbound.CloseULD_Icon.click();
		   Thread.sleep(3000);
	    String p= driver.getWindowHandle();
		Set<String> s= driver.getWindowHandles();
		Iterator<String> I= s.iterator();
		Object[] windowHandles= driver.getWindowHandles().toArray();
		driver.switchTo().window((String) windowHandles[1]);
	    System.out.println(driver.getTitle());
	    
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.CloseULD_Rdb, 30);
	    Nmial_Outbound.CloseULD_Rdb.click();  Thread.sleep(3000);
	    ECOM_Outbound.CloseSaveULD_Btn.click();
		   Thread.sleep(3000);
           wait.until(ExpectedConditions.alertIsPresent());
           Alert alert = driver.switchTo().alert();
           alert.accept();   // Clicks OK / Accept
   	    Thread.sleep(8000); 
   	    
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
	    
	    driver.switchTo().frame(Nmial_Outbound.PageFrame);        
        Nmial_Outbound.FlightBuiltUp_Btn.click();
		driver.switchTo().window((String) windowHandles[1]);
	    System.out.println(driver.getTitle());
	    
	    ECOM_Outbound.Gatepass_Cb.click();  Thread.sleep(8000); 
	    Nmial_Outbound.GenerateGatepass_Btn.click(); Thread.sleep(8000); 
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
	
	@When("click on Exports>> More>> Gatepass and click on Release Gatepass button in ECOM GHA")
	public void click_on_exports_more_gatepass_and_click_on_release_gatepass_button_in_ecom_gha() {
	    
	}
	
	@When("click on Exports>> Security Acceptance and clicked on Final Submit button in ECOM GHA")
	public void click_on_exports_security_acceptance_and_clicked_on_final_submit_button_in_ecom_gha() {
	    
	}
	
	//Inbound WDO
	@When("click on Imports>> Import Manifest and enter created {string} Flight of ECOM GHA")
	public void click_on_imports_import_manifest_and_enter_created_flight_of_ecom_gha(String string) throws Throwable {
		 Nmial_Outbound.Imports_Tab.click();
		    Thread.sleep(3000);

		    Nmial_Outbound.ImportManifest_Tab.click();
		    Thread.sleep(3000);
//		    String awbFlightPfx= flight.substring(0, 2);
//		    String awbFlight= flight.substring(Math.max(0, flight.length()-4));
		      
		    String awbFlightPfx= "6E";
//		    String awbFlight= flightNo.substring(2);

	     wait.until(ExpectedConditions.numberOfWindowsToBe(2));

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
			driver.switchTo().window((String) windowHandles[2]);
			System.out.println(driver.getTitle());
			
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

	@When("click on ULD and add AWB details in ECOM GHA")
	public void click_on_uld_and_add_awb_details_in_ecom_gha() throws Throwable {
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
	    Nmial_Outbound.Origin1_Tb.sendKeys("HYD", Keys.TAB);
	    Thread.sleep(8000);	 
	    Nmial_Outbound.Origin1_Tb.sendKeys("HYD", Keys.END);
	    Thread.sleep(8000);	 

	    Nmial_Outbound.CommodityCode1_Tb.sendKeys("1269", Keys.TAB);

		Nmial_Outbound.Commodity1_Hyperlink.click();
	    Thread.sleep(8000);

//		Nmial_Outbound.Commodity1_Hyperlink.sendKeys(Keys.CONTROL+"A", Keys.CONTROL+"C");
//	    Thread.sleep(8000);
//		Nmial_Outbound.NatureOfGoods1_Tb.sendKeys("testing", Keys.END);
//	    Thread.sleep(8000);
        Nmial_Outbound.ManifestedNPX1_Tb.sendKeys("5", Keys.TAB);
        Nmial_Outbound.ManifestedWtExp1_Tb.sendKeys("50", Keys.TAB);
        Nmial_Outbound.DeclaredChWt1_Tb.sendKeys("50", Keys.TAB);
        Nmial_Outbound.ConsigneeCode1_Tb.sendKeys("BDE", Keys.TAB);
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

	    Nmial_Outbound.CommodityCode2_Tb.sendKeys("779", Keys.TAB);

	    a.moveToElement(Nmial_Outbound.Commodity2_Hyperlink).doubleClick().click().perform();
	    Thread.sleep(8000);

//		Nmial_Outbound.Commodity1_Hyperlink.sendKeys(Keys.CONTROL+"A", Keys.CONTROL+"C");
//	    Thread.sleep(8000);
//		Nmial_Outbound.NatureOfGoods2_Tb.sendKeys("testing", Keys.END);
//	    Thread.sleep(8000);
        Nmial_Outbound.ManifestedNPX2_Tb.sendKeys("6", Keys.TAB);
        Nmial_Outbound.ManifestedWtExp2_Tb.sendKeys("60", Keys.TAB);
        Nmial_Outbound.DeclaredChWt2_Tb.sendKeys("60", Keys.TAB);
        Nmial_Outbound.ConsigneeCode2_Tb.sendKeys("BDE", Keys.TAB);
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

	    Nmial_Outbound.CommodityCode3_Tb.sendKeys("1218", Keys.TAB);

	    a.moveToElement(Nmial_Outbound.Commodity3_Hyperlink).doubleClick().click().perform();
	    Thread.sleep(8000);

//		Nmial_Outbound.Commodity1_Hyperlink.sendKeys(Keys.CONTROL+"A", Keys.CONTROL+"C");
//	    Thread.sleep(8000);
//		Nmial_Outbound.NatureOfGoods3_Tb.sendKeys("testing", Keys.END);
//	    Thread.sleep(8000);
        Nmial_Outbound.ManifestedNPX3_Tb.sendKeys("7", Keys.TAB);
        Nmial_Outbound.ManifestedWtExp3_Tb.sendKeys("70", Keys.TAB);
        Nmial_Outbound.DeclaredChWt3_Tb.sendKeys("70", Keys.TAB);
        Nmial_Outbound.ConsigneeCode3_Tb.sendKeys("BDE", Keys.TAB);
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
//		Nmial_Outbound.NatureOfGoods4_Tb.sendKeys("testing", Keys.END);
//	    Thread.sleep(8000);
        Nmial_Outbound.ManifestedNPX4_Tb.sendKeys("8", Keys.TAB);
        Nmial_Outbound.ManifestedWtExp4_Tb.sendKeys("80", Keys.TAB);
        Nmial_Outbound.DeclaredChWt4_Tb.sendKeys("80", Keys.TAB);
        Nmial_Outbound.ConsigneeCode4_Tb.sendKeys("BDE", Keys.TAB);
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

	    Nmial_Outbound.CommodityCode5_Tb.sendKeys("754", Keys.TAB);

	    a.moveToElement(Nmial_Outbound.Commodity5_Hyperlink).doubleClick().click().perform();
	    Thread.sleep(8000);

//		Nmial_Outbound.Commodity1_Hyperlink.sendKeys(Keys.CONTROL+"A", Keys.CONTROL+"C");
//	    Thread.sleep(8000);
		Nmial_Outbound.NatureOfGoods5_Tb.sendKeys("testing", Keys.END);
	    Thread.sleep(8000);
        Nmial_Outbound.ManifestedNPX5_Tb.sendKeys("4", Keys.TAB);
        Nmial_Outbound.ManifestedWtExp5_Tb.sendKeys("40", Keys.TAB);
	    Thread.sleep(8000);

        Nmial_Outbound.DeclaredNPX5_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
	    Thread.sleep(8000);
        Nmial_Outbound.DeclaredNPX5_Tb.sendKeys("10", Keys.TAB);
	    Thread.sleep(8000);
        Nmial_Outbound.DeclaredNPX5_Tb.sendKeys("10", Keys.END);
	    Thread.sleep(8000);


        Nmial_Outbound.AwbWt5_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
	    Thread.sleep(8000);
        Nmial_Outbound.AwbWt5_Tb.sendKeys("100", Keys.END);
	    Thread.sleep(8000);
        Nmial_Outbound.DeclaredChWt5_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
	    Thread.sleep(8000);

        Nmial_Outbound.DeclaredChWt5_Tb.sendKeys("300", Keys.TAB);
        Nmial_Outbound.ConsigneeCode5_Tb.sendKeys("BDE", Keys.TAB);
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


		driver.switchTo().window((String) windowHandles[1]);
	    Thread.sleep(8000); 

	           // (Optional) Switch back to parent
//	           driver.switchTo().window(parent);

	}
	
	@When("enter {string} ATA date time and save {string} DocReceive, {string} Breakdown details of ECOM GHA")
	public void enter_ata_date_time_and_save_doc_receive_breakdown_details_of_ecom_gha(String value1, String value2, String value3) throws Throwable {
		Thread.sleep(3000); 
		driver.switchTo().frame(Nmial_Outbound.PageFrame);
		Thread.sleep(3000); 
		 Nmial_Outbound.ATA_Date_Tb.click();
		 Thread.sleep(3000); 
	//	 Nmial_Outbound.ATA_Date_Tb.sendKeys("15/05/2026");
	   Nmial_Outbound.ATA_Date_Tb.sendKeys(wm.CurrentDate("dd/MM/yyyy"), Keys.TAB);
	   System.out.println("Current Date: " + wm.CurrentDate("dd/MM/yyyy"));
	    Thread.sleep(30000); 
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
	  		driver.switchTo().window((String) windowHandles[2]);
	  		System.out.println(driver.getTitle());
	  		
	  	Nmial_Outbound.DocReceiveDate_Tb.sendKeys(wm.CurrentDate("dd/MM/yyyy"), Keys.END);
	  	System.out.println("Current Date: " + wm.CurrentDate("dd/MM/yyyy"));
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

		driver.switchTo().window((String) windowHandles[1]);
	    Thread.sleep(8000); 
	    
	    Thread.sleep(10000); 
		driver.switchTo().window((String) windowHandles[1]);
	    Thread.sleep(8000); 


	}
	
	@When("select all ULD shipment and click on Match button of ECOM GHA")
	public void select_all_uld_shipment_and_click_on_match_button_of_ecom_gha() throws Throwable {
		driver.switchTo().frame(Nmial_Outbound.PageFrame);
	    Thread.sleep(3000); 

	   Nmial_Outbound.SelectAllAwb_Cb.click();
	    Thread.sleep(20000); 

	   Nmial_Outbound.MatchShipment_Btn.click();
	    Thread.sleep(20000); 

	   wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.OkMatchShipment_Btn, 30);
	   Nmial_Outbound.OkMatchShipment_Btn.click();
	    Thread.sleep(8000); 


	}
	
	@Then("verify display of matched  shipment of ECOM GHA")
	public void verify_display_of_matched_shipment_of_ecom_gha() throws Throwable {
		   wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.MatchedShipment_Cb, 30);
		    Thread.sleep(10000); 

	}
	
	@When("select {int} shipment for Damaged Shipment and click on Discrepancy of ECOM GHA")
	public void select_shipment_for_damaged_shipment_and_click_on_discrepancy_of_ecom_gha(Integer row) throws Throwable {
		Nmial_Outbound.MatchedShipment_Cb.get(row-1).click();
	    Thread.sleep(3000); 
//	    Nmial_Outbound.Damage_Btn.click();
//	    Thread.sleep(3000); 

	}
	
	@When("enter Damage pieces details of ECOM GHA")
	public void enter_damage_pieces_details_of_ecom_gha() throws Throwable {
		String p= driver.getWindowHandle();
  		Set<String> s= driver.getWindowHandles();
  		Iterator<String> I= s.iterator();
  		Object[] windowHandles= driver.getWindowHandles().toArray();
//  		driver.switchTo().window((String) windowHandles[2]);
  		System.out.println(driver.getTitle());
	    Thread.sleep(3000);
	    Set<String> oldWindows = driver.getWindowHandles();

	    Nmial_Outbound.Damage_Btn.click();
	    Thread.sleep(10000); 
//  		driver.switchTo().window((String) windowHandles[1]);

       Set<String> newWindows = driver.getWindowHandles();
	 // Find newly opened window
	 newWindows.removeAll(oldWindows);
	   String popupWindow = newWindows.iterator().next();

	 // Switch to popup
	   driver.switchTo().window(popupWindow);

	    Thread.sleep(10000); 
	    int x= driver.manage().window().getPosition().getX();
		int y= driver.manage().window().getPosition().getY();
		Point p1= driver.manage().window().getPosition();
		wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.DamagePieces_Tb, 30);
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
	
	@When("select {int} shipment for Excess Shipment and click on Discrepancy of ECOM GHA")
	public void select_shipment_for_excess_shipment_and_click_on_discrepancy_of_ecom_gha(Integer row) throws Throwable {
		driver.switchTo().frame(Nmial_Outbound.PageFrame);
	    Thread.sleep(8000); 

		Nmial_Outbound.MatchedShipment_Cb.get(row-1).click();
		Nmial_Outbound.Discrepancy_Btn.click();
	    Thread.sleep(10000); 

		String p= driver.getWindowHandle();
  		Set<String> s= driver.getWindowHandles();
  		Iterator<String> I= s.iterator();
  		Object[] windowHandles= driver.getWindowHandles().toArray();
  		driver.switchTo().window((String) windowHandles[1]);
  		System.out.println(driver.getTitle());
	}
	

	
	@When("enter {string} Excess received NOP of ECOM GHA")
	public void enter_excess_received_nop_of_ecom_gha(String value) throws Throwable {
		   Nmial_Outbound.DiscrepancyNPR_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
		   Thread.sleep(3000); 

		   Nmial_Outbound.DiscrepancyNPR_Tb.sendKeys(value, Keys.END);
		   Thread.sleep(3000); 

	}
	
	@When("click on Save Discrepancy button of ECOM GHA")
	public void click_on_save_discrepancy_button_of_ecom_gha() throws Throwable {
		 String p= driver.getWindowHandle();
	  		Set<String> s= driver.getWindowHandles();
	  		Iterator<String> I= s.iterator();
	  		Object[] windowHandles= driver.getWindowHandles().toArray();
	  		driver.switchTo().window((String) windowHandles[1]);
	  		System.out.println(driver.getTitle());
		    Thread.sleep(3000); 
		    

		Nmial_Outbound.SaveDiscrepancy_Btn.click();
	    Thread.sleep(8000); 	    
        wait.until(ExpectedConditions.alertIsPresent());
   // Now handle the alert in that popup window
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();   // Clicks OK / Accept
   // Nmial_Outbound.CancelDamage_Btn.click();
        Thread.sleep(8000); 
        alert.accept(); 
        driver.switchTo().window((String) windowHandles[0]);
        Thread.sleep(8000); 

	}
	
	@When("select {int} shipment for Part Shipment and click on Discrepancy of ECOM GHA")
	public void select_shipment_for_part_shipment_and_click_on_discrepancy_of_ecom_gha(Integer row) throws Throwable {
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
	
	@When("enter {string} Short landed received NOP of ECOM GHA")
	public void enter_short_landed_received_nop_of_ecom_gha(String value) throws Throwable {
		Nmial_Outbound.DiscrepancyNPR_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
	    Thread.sleep(3000); 

	    Nmial_Outbound.DiscrepancyNPR_Tb.sendKeys(value, Keys.END);
	    Thread.sleep(3000); 

	}
	
	@When("click on Flight Finalize button of ECOM GHA")
	public void click_on_flight_finalize_button_of_ecom_gha() throws Throwable  {
		driver.switchTo().frame(Nmial_Outbound.PageFrame);
	    Thread.sleep(3000); 

	    Nmial_Outbound.FlightFinalize_Btn.click();
	    Thread.sleep(3000); 

	}

	@When("click on Inbound tab, select flight and enter Chargeable Weight and click on Approve Delivery Order of ECOM")
	public void click_on_inbound_tab_select_flight_and_enter_chargeable_weight_and_click_on_approve_delivery_order_of_ecom() throws Throwable {
	    Thread.sleep(8000); 
	    ECOM_Outbound.Inbound_Tab.click();
	    Thread.sleep(8000); 

	//    for(int j=0;j<5;j++) {
	    ECOM_Outbound.Inbound_Cb.get(0).click();Thread.sleep(5000); 
	    ECOM_Outbound.ChWt_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);Thread.sleep(3000);
	    ECOM_Outbound.ChWt_Tb.sendKeys("500", Keys.TAB);Thread.sleep(3000);
	    
	    ECOM_Outbound.Inbound_Cb.get(1).click();Thread.sleep(5000); 
	    ECOM_Outbound.ChWt_Tb2.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);Thread.sleep(3000);
	    ECOM_Outbound.ChWt_Tb2.sendKeys("500", Keys.TAB);Thread.sleep(3000);
	    
	    ECOM_Outbound.Inbound_Cb.get(2).click();Thread.sleep(5000); 
	    ECOM_Outbound.ChWt_Tb3.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);Thread.sleep(3000);
	    ECOM_Outbound.ChWt_Tb3.sendKeys("500", Keys.TAB);Thread.sleep(3000);
	    
	    ECOM_Outbound.Inbound_Cb.get(3).click();Thread.sleep(5000); 
	    ECOM_Outbound.ChWt_Tb4.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);Thread.sleep(3000);
	    ECOM_Outbound.ChWt_Tb4.sendKeys("500", Keys.TAB);Thread.sleep(3000);
	    
	    ECOM_Outbound.Inbound_Cb.get(4).click();Thread.sleep(5000); 
	    ECOM_Outbound.ChWt_Tb5.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);Thread.sleep(3000);
	    ECOM_Outbound.ChWt_Tb5.sendKeys("500", Keys.TAB);Thread.sleep(3000);
	    
	    
	   
	//    }
	    wm.scrollTillElement(driver, ECOM_Outbound.ApproveDeliveryOrder_Btn);Thread.sleep(3000);
	    ECOM_Outbound.ApproveDeliveryOrder_Btn.click();	    Thread.sleep(3000); 
	    ECOM_Outbound.YesADO_Btn.click();	    Thread.sleep(8000); 
        wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.ReleasedADO_Btn, 30);
        ECOM_Outbound.ReleasedADO_Btn.click();Thread.sleep(8000);
	
	}
	
	//MLM
		
	@When("enter and add ULD details of ECOM GHA")
	public void enter_and_add_uld_details_of_ecom_gha() throws Throwable {
       

	}
	
	@When("click on created ULD, enter and save MLM shipment details of ECOM GHA")
	public void click_on_created_uld_enter_and_save_mlm_shipment_details_of_ecom_gha() throws Throwable {
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
	    Nmial_Outbound.Pfx1_Tb.sendKeys("MLM", Keys.TAB);
	    Thread.sleep(3000);	 
	    Nmial_Outbound.Origin1_Tb.sendKeys("HYD", Keys.TAB);
	    Thread.sleep(8000);	 
	    Nmial_Outbound.Origin1_Tb.sendKeys("HYD", Keys.END);
	    Thread.sleep(8000);	 

//		Nmial_Outbound.Commodity1_Hyperlink.sendKeys(Keys.CONTROL+"A", Keys.CONTROL+"C");
//	    Thread.sleep(8000);
		Nmial_Outbound.NatureOfGoods1_Tb.sendKeys("General Cargo", Keys.END);
	    Thread.sleep(8000);
	    Nmial_Outbound.AwbSaveClose_Btn.click();
	    Thread.sleep(8000); 

	    // handle the alert in popup
	           wait.until(ExpectedConditions.alertIsPresent());
	           Alert alert = driver.switchTo().alert();
	           alert.accept();   // Clicks OK / Accept
	   	    Thread.sleep(8000); 


		driver.switchTo().window((String) windowHandles[1]);
	    Thread.sleep(8000); 

	}
	
	@When("select shipment and click on Discrepancy button to enter details of ECOM GHA")
	public void select_shipment_and_click_on_discrepancy_button_to_enter_details_of_ecom_gha() throws Throwable {	
	    Thread.sleep(8000); 

		Nmial_Outbound.MatchedShipment_Cb.get(0).click();
		Nmial_Outbound.Discrepancy_Btn.click();
	    Thread.sleep(10000); 

		String p= driver.getWindowHandle();
  		Set<String> s= driver.getWindowHandles();
  		Iterator<String> I= s.iterator();
  		Object[] windowHandles= driver.getWindowHandles().toArray();
  		driver.switchTo().window((String) windowHandles[2]);
  		System.out.println(driver.getTitle());
	
	   Nmial_Outbound.DiscrepancyNPR_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
		   Thread.sleep(3000); 

		   Nmial_Outbound.DiscrepancyNPR_Tb.sendKeys("10", Keys.END);
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
        wait.until(ExpectedConditions.alertIsPresent());
        alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(8000);

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
        

       String mainWindow = driver.getWindowHandle();

      // After popup opens
      for (String window : driver.getWindowHandles()) {
      if (!window.equals(mainWindow)) {
        driver.switchTo().window(window);
        driver.close();
        }
      }

      // ✅ Always return to main window
       driver.switchTo().window(mainWindow);
        
        wait.until(driver -> driver.getWindowHandles().size() == 1);
        Thread.sleep(8000); 

        // continue work on parent
        System.out.println("Child window closed, back to parent!");
	    Set<String> oldWindows = driver.getWindowHandles();

        Set<String> newWindows = driver.getWindowHandles();
   	 // Find newly opened window
   	 newWindows.removeAll(oldWindows);

        driver.switchTo().window((String) windowHandles[0]);
        Thread.sleep(8000); 
        
        driver.switchTo().defaultContent();
//        Nmial_Outbound.Imports_Tab.click();
	    Thread.sleep(3000);
        ECOM_Outbound.ExportMore_Icon.click();
	    Thread.sleep(8000); 
	    wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.AssociateAwb_Hyperlink, 30); 
	    ECOM_Outbound.AssociateAwb_Hyperlink.click();
	     Thread.sleep(8000); 
        driver.switchTo().frame(Nmial_Outbound.PageFrame);Thread.sleep(8000); 
     
        ECOM_Outbound.MlmAwbPfx_Tb.sendKeys("MLM", Keys.TAB); Thread.sleep(3000);
        ECOM_Outbound.MlmAwb_Tb.sendKeys(ECOM_Outbound.MlmAwb_Lbl.getText().toString().substring(4), Keys.TAB); Thread.sleep(3000);

	}
	
	@When("click on Import> More> Associate AWB and of ECOM GHA")
	public void click_on_import_more_associate_awb_and_of_ecom_gha() throws Throwable {		
	     ECOM_Outbound.SearchMLM_Btn.click();Thread.sleep(3000);

	}
	
	@When("enter {string} ATA date time, select shipment and click on Match button of ECOM GHA")
	public void enter_ata_date_time_select_shipment_and_click_on_match_button_of_ecom_gha(String value) throws Throwable {
		Thread.sleep(3000); 
		driver.switchTo().frame(Nmial_Outbound.PageFrame);
		Thread.sleep(3000); 
	   Nmial_Outbound.ATA_Date_Tb.sendKeys(wm.CurrentDate("dd/MM/yyyy"), Keys.TAB);
	    Thread.sleep(3000); 
	   Nmial_Outbound.ATA_Time_Tb.sendKeys(value, Keys.END);
	    Thread.sleep(3000); 
	    Nmial_Outbound.RecordATA_Btn.click();
	    Thread.sleep(30000); 
	    
	   Nmial_Outbound.SelectAllAwb_Cb.click();
	    Thread.sleep(8000); 

	   Nmial_Outbound.MatchShipment_Btn.click();
	    Thread.sleep(8000); 

	   wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.OkMatchShipment_Btn, 30);
	   Nmial_Outbound.OkMatchShipment_Btn.click();
	    Thread.sleep(8000); 
	    
	}
	
	@When("select {string} Action dropdown,enter and save AWB details as part shipment NOP and Gross Weight")
	public void select_action_dropdown_enter_and_save_awb_details_as_part_shipment_nop_and_gross_weight(String value) throws Throwable {
	     ECOM_Outbound.AssociateAwbPfx_Tb.sendKeys("312", Keys.TAB);Thread.sleep(3000);
	     ECOM_Outbound.MlmAwbNo_Tb.sendKeys(wm.RandomNo(7), Keys.TAB);Thread.sleep(3000);
	     ECOM_Outbound.SaveAssociateMlm_Btn.click();Thread.sleep(3000);

	}

	@When("click on Inbound tab, select flight for ASI, TSP and generate token for ECOM GHA")
	public void click_on_inbound_tab_select_flight_for_asi_tsp_and_generate_token_for_ecom_gha() throws Throwable {
		ECOM_Outbound.Inbound_Tab.click();	    Thread.sleep(8000); 
        wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.AsiADO_Icon, 30);
       
        ECOM_Outbound.ASIStatus_Icon1.click();
	       Thread.sleep(8000);
        ECOM_Outbound.ProceedWdoAWB_Btn.click();
        Thread.sleep(10000);
        ECOM_Outbound.OkAsiWdo_Btn.click();
	       Thread.sleep(8000);
	       
	       ECOM_Outbound.ASIStatus_Icon2.click();
	       Thread.sleep(8000);
           ECOM_Outbound.ProceedWdoAWB_Btn.click();
           Thread.sleep(10000);
           ECOM_Outbound.OkAsiWdo_Btn.click();
	       Thread.sleep(8000);
	       
	       ECOM_Outbound.ASIStatus_Icon3.click();
	       Thread.sleep(8000);
           ECOM_Outbound.ProceedWdoAWB_Btn.click();
           Thread.sleep(10000);
           ECOM_Outbound.OkAsiWdo_Btn.click();
	       Thread.sleep(8000);
	       
	       ECOM_Outbound.ASIStatus_Icon4.click();
	       Thread.sleep(8000);
           ECOM_Outbound.ProceedWdoAWB_Btn.click();
           Thread.sleep(10000);
           ECOM_Outbound.OkAsiWdo_Btn.click();
	       Thread.sleep(8000);
	       
	       ECOM_Outbound.ASIStatus_Icon5.click();
	       Thread.sleep(8000);
           ECOM_Outbound.ProceedWdoAWB_Btn.click();
           Thread.sleep(10000);
           ECOM_Outbound.OkAsiWdo_Btn.click();
	       Thread.sleep(8000);
	       
	         wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.TSP2, 30);
               ECOM_Outbound.TSP2.click();
		       TestDataReader.ReadLoginDetails("BIAL ECOM UAT");
		       Thread.sleep(5000);
		       wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.TspAdoTransaction_Tb, 30);
		       System.out.println("pwd= " + Password);
               ECOM_Outbound.TspAdoTransaction_Tb.sendKeys(Password, Keys.END);
               ECOM_Outbound.TspAdoPayNow_Btn.click();Thread.sleep(3000);
               wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.TspAdoYes_Btn, 30);
               ECOM_Outbound.TspAdoYes_Btn.click();Thread.sleep(5000);
               wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.TspGenerateToken_Btn, 30);
          	 ECOM_Outbound.TspGenerateToken_Btn.click();Thread.sleep(3000);
           	Thread.sleep(3000);
            ECOM_Outbound.VehicleNo_Tb.sendKeys("MH01"+wm.RandomNo(4), Keys.END);   Thread.sleep(3000);
    	    ECOM_Outbound.DriverLicenseNo_Tb.sendKeys("D"+wm.RandomNo(5), Keys.END);	   Thread.sleep(3000);
    	    ECOM_Outbound.DriverName_Tb.sendKeys("tester", Keys.END);  Thread.sleep(3000);
    	    ECOM_Outbound.DriverMobileno_Tb.sendKeys("982"+wm.RandomNo(7), Keys.END);   Thread.sleep(3000);
    	    ECOM_Outbound.AgentMobileno_Tb.sendKeys("982"+wm.RandomNo(7), Keys.END);   Thread.sleep(3000);
    	    ECOM_Outbound.TokenRemarks_Tb.sendKeys("ok", Keys.END);	   Thread.sleep(3000);
    		Thread.sleep(3000);

    	    wm.scrollTillElement(driver, ECOM_Outbound.GenerateToken_Btn);
    	    wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.GenerateToken_Btn, 30);
    	    ECOM_Outbound.GenerateToken_Btn.click();
    		   Thread.sleep(3000);
    		   wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.GenerateTokenOk_Btn, 30);
    		ECOM_Outbound.GenerateTokenOk_Btn.click();
    		   Thread.sleep(5000);
           	
	       
	      
	       
	         wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.TSP3, 30);
               ECOM_Outbound.TSP3.click();
		       TestDataReader.ReadLoginDetails("BIAL ECOM UAT");
		       Thread.sleep(5000);
		       wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.TspAdoTransaction_Tb, 30);
		       System.out.println("pwd= " + Password);
               ECOM_Outbound.TspAdoTransaction_Tb.sendKeys(Password, Keys.END);
               ECOM_Outbound.TspAdoPayNow_Btn.click();Thread.sleep(6000);
               wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.TspAdoYes_Btn, 30);
               ECOM_Outbound.TspAdoYes_Btn.click();Thread.sleep(6000);
               wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.TspGenerateToken_Btn, 30);
          	 ECOM_Outbound.TspGenerateToken_Btn.click();Thread.sleep(6000);
           	Thread.sleep(3000);
            ECOM_Outbound.VehicleNo_Tb.sendKeys("MH01"+wm.RandomNo(4), Keys.END);   Thread.sleep(3000);
    	    ECOM_Outbound.DriverLicenseNo_Tb.sendKeys("D"+wm.RandomNo(5), Keys.END);	   Thread.sleep(3000);
    	    ECOM_Outbound.DriverName_Tb.sendKeys("tester", Keys.END);  Thread.sleep(3000);
    	    ECOM_Outbound.DriverMobileno_Tb.sendKeys("982"+wm.RandomNo(7), Keys.END);   Thread.sleep(3000);
    	    ECOM_Outbound.AgentMobileno_Tb.sendKeys("982"+wm.RandomNo(7), Keys.END);   Thread.sleep(3000);
    	    ECOM_Outbound.TokenRemarks_Tb.sendKeys("ok", Keys.END);	   Thread.sleep(3000);
    		Thread.sleep(3000);

    	    wm.scrollTillElement(driver, ECOM_Outbound.GenerateToken_Btn);
    	    ECOM_Outbound.GenerateToken_Btn.click();
    		   Thread.sleep(3000);
    		ECOM_Outbound.GenerateTokenOk_Btn.click();
    		   Thread.sleep(3000);
           	
	       
	      
	       
	         wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.TSP4, 30);
               ECOM_Outbound.TSP4.click();
		       TestDataReader.ReadLoginDetails("BIAL ECOM UAT");
		       Thread.sleep(8000);
		       wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.TspAdoTransaction_Tb, 30);
		       System.out.println("pwd= " + Password);
               ECOM_Outbound.TspAdoTransaction_Tb.sendKeys(Password, Keys.END);
               ECOM_Outbound.TspAdoPayNow_Btn.click();Thread.sleep(6000);
               ECOM_Outbound.TspAdoYes_Btn.click();Thread.sleep(6000);
          	 ECOM_Outbound.TspGenerateToken_Btn.click();Thread.sleep(3000);
           	Thread.sleep(3000);
            ECOM_Outbound.VehicleNo_Tb.sendKeys("MH01"+wm.RandomNo(4), Keys.END);   Thread.sleep(3000);
    	    ECOM_Outbound.DriverLicenseNo_Tb.sendKeys("D"+wm.RandomNo(5), Keys.END);	   Thread.sleep(3000);
    	    ECOM_Outbound.DriverName_Tb.sendKeys("tester", Keys.END);  Thread.sleep(3000);
    	    ECOM_Outbound.DriverMobileno_Tb.sendKeys("982"+wm.RandomNo(7), Keys.END);   Thread.sleep(3000);
    	    ECOM_Outbound.AgentMobileno_Tb.sendKeys("982"+wm.RandomNo(7), Keys.END);   Thread.sleep(3000);
    	    ECOM_Outbound.TokenRemarks_Tb.sendKeys("ok", Keys.END);	   Thread.sleep(3000);
    		Thread.sleep(6000);

    	    wm.scrollTillElement(driver, ECOM_Outbound.GenerateToken_Btn);
    	    ECOM_Outbound.GenerateToken_Btn.click();
    		   Thread.sleep(6000);
    		ECOM_Outbound.GenerateTokenOk_Btn.click();
    		   Thread.sleep(3000);
           	
	       
	      
	       
	         wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.TSP5, 30);
	         Thread.sleep(5000);
               ECOM_Outbound.TSP5.click();
		       TestDataReader.ReadLoginDetails("BIAL ECOM UAT");
		       Thread.sleep(8000);
		       wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.TspAdoTransaction_Tb, 30);
		       System.out.println("pwd= " + Password);
               ECOM_Outbound.TspAdoTransaction_Tb.sendKeys(Password, Keys.END);
               ECOM_Outbound.TspAdoPayNow_Btn.click();Thread.sleep(6000);
               ECOM_Outbound.TspAdoYes_Btn.click();Thread.sleep(6000);
          	 ECOM_Outbound.TspGenerateToken_Btn.click();Thread.sleep(3000);
           	Thread.sleep(3000);
            
    	    ECOM_Outbound.VehicleNo_Tb.sendKeys("MH01"+wm.RandomNo(4), Keys.END);   Thread.sleep(3000);
    	    ECOM_Outbound.DriverLicenseNo_Tb.sendKeys("D"+wm.RandomNo(5), Keys.END);	   Thread.sleep(3000);
    	    ECOM_Outbound.DriverName_Tb.sendKeys("tester", Keys.END);  Thread.sleep(3000);
    	    ECOM_Outbound.DriverMobileno_Tb.sendKeys("982"+wm.RandomNo(7), Keys.END);   Thread.sleep(3000);
    	    ECOM_Outbound.AgentMobileno_Tb.sendKeys("982"+wm.RandomNo(7), Keys.END);   Thread.sleep(3000);
    	    ECOM_Outbound.TokenRemarks_Tb.sendKeys("ok", Keys.END);	   Thread.sleep(3000);
    		Thread.sleep(3000);

    	    wm.scrollTillElement(driver, ECOM_Outbound.GenerateToken_Btn);
    	    ECOM_Outbound.GenerateToken_Btn.click();
    		   Thread.sleep(6000);
    		ECOM_Outbound.GenerateTokenOk_Btn.click();
    		   Thread.sleep(6000);
    		   
    		   wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.TSP1, 30);
  	         Thread.sleep(5000);
                 ECOM_Outbound.TSP1.click();
  		       TestDataReader.ReadLoginDetails("BIAL ECOM UAT");
  		       Thread.sleep(8000);
  		       wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.TspAdoTransaction_Tb, 30);
  		       System.out.println("pwd= " + Password);
                 ECOM_Outbound.TspAdoTransaction_Tb.sendKeys(Password, Keys.END);
                 ECOM_Outbound.TspAdoPayNow_Btn.click();Thread.sleep(6000);
                 ECOM_Outbound.TspAdoYes_Btn.click();Thread.sleep(6000);
            	 ECOM_Outbound.TspGenerateToken_Btn.click();Thread.sleep(3000);
             	Thread.sleep(3000);
              
      	    ECOM_Outbound.VehicleNo_Tb.sendKeys("MH01"+wm.RandomNo(4), Keys.END);   Thread.sleep(3000);
      	    ECOM_Outbound.DriverLicenseNo_Tb.sendKeys("D"+wm.RandomNo(5), Keys.END);	   Thread.sleep(3000);
      	    ECOM_Outbound.DriverName_Tb.sendKeys("tester", Keys.END);  Thread.sleep(3000);
      	    ECOM_Outbound.DriverMobileno_Tb.sendKeys("982"+wm.RandomNo(7), Keys.END);   Thread.sleep(3000);
      	    ECOM_Outbound.AgentMobileno_Tb.sendKeys("982"+wm.RandomNo(7), Keys.END);   Thread.sleep(3000);
      	    ECOM_Outbound.TokenRemarks_Tb.sendKeys("ok", Keys.END);	   Thread.sleep(3000);
      		Thread.sleep(3000);

      	    wm.scrollTillElement(driver, ECOM_Outbound.GenerateToken_Btn);
      	    ECOM_Outbound.GenerateToken_Btn.click();
      		   Thread.sleep(6000);
      		ECOM_Outbound.GenerateTokenOk_Btn.click();
      		   Thread.sleep(6000);
        
        /*
        
        Thread.sleep(8000);
		for(int j=0;j<5;j++) {
			//ECOM_Outbound.ProceedWdoAWB_Btn
          if(wm.isElementPresent(driver, ECOM_Outbound.AwbWDO_Lbl)) 
          {
      		   AwbGenerated= ECOM_Outbound.AwbWDO_Lbl.get(j).toString();
		       ECOM_Outbound.AsiADO_Icon.get(j).click();
		       Thread.sleep(8000);
	           ECOM_Outbound.ProceedWdoAWB_Btn.click();
	           Thread.sleep(10000);
	           ECOM_Outbound.OkAsiWdo_Btn.click();
		       Thread.sleep(8000);

               wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.TspADO_Icon.get(j), 30);
               ECOM_Outbound.TspADO_Icon.get(j).click();
		       TestDataReader.ReadLoginDetails("BIAL ECOM UAT");
		       Thread.sleep(5000);
		       wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.TspAdoTransaction_Tb, 30);
		       System.out.println("pwd= " + Password);
               ECOM_Outbound.TspAdoTransaction_Tb.sendKeys(Password, Keys.END);
               ECOM_Outbound.TspAdoPayNow_Btn.click();Thread.sleep(3000);
               ECOM_Outbound.TspAdoYes_Btn.click();Thread.sleep(3000);
   //            ECOM_Outbound.TspGenerateToken_Btn.click();Thread.sleep(3000);
               break;
          }} 
		 ECOM_Outbound.TspGenerateToken_Btn.click();Thread.sleep(3000);
      	Thread.sleep(3000);
      	 wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.CTO_PopupBtn, 30);
 		ECOM_Outbound.CTO_PopupBtn.click();
 		Thread.sleep(8000);
      
	    ECOM_Outbound.VehicleNo_Tb.sendKeys("MH01"+wm.RandomNo(4), Keys.END);   Thread.sleep(3000);
	    ECOM_Outbound.DriverLicenseNo_Tb.sendKeys("D"+wm.RandomNo(5), Keys.END);	   Thread.sleep(3000);
	    ECOM_Outbound.DriverName_Tb.sendKeys("tester", Keys.END);  Thread.sleep(3000);
	    ECOM_Outbound.DriverMobileno_Tb.sendKeys("982"+wm.RandomNo(7), Keys.END);   Thread.sleep(3000);
	    ECOM_Outbound.AgentMobileno_Tb.sendKeys("982"+wm.RandomNo(7), Keys.END);   Thread.sleep(3000);
	    ECOM_Outbound.TokenRemarks_Tb.sendKeys("ok", Keys.END);	   Thread.sleep(3000);
		Thread.sleep(3000);

	    wm.scrollTillElement(driver, ECOM_Outbound.GenerateToken_Btn);
	    ECOM_Outbound.GenerateToken_Btn.click();
		   Thread.sleep(3000);
		ECOM_Outbound.GenerateTokenOk_Btn.click();
		   Thread.sleep(3000); */
		   
		   String Ecom_URL= "https://galaxyuat.kalelogistics.com/GalaxyV3DOM/Login.aspx";
	        System.out.println("nop=" +Integer.toString((Integer.parseInt(nop)-1))+"\t"+nop);
			((JavascriptExecutor) driver).executeScript("window.open('" + Ecom_URL + "', '_blank');");    

	        for (String handle : driver.getWindowHandles()) {
	        driver.switchTo().window(handle);}
	        
			Entity = "ECOM GHA user";
			TestDataReader.ReadLoginDetails(Entity);
			Thread.sleep(500);
			loginScreen.Bial_Login(Entity, Username, Password);
			   Thread.sleep(3000);
/*
		   
	    driver.switchTo().defaultContent();	 Thread.sleep(10000);
	    Nmial_Outbound.ImportsGHA_Tab.click();Thread.sleep(3000);
	    Nmial_Outbound.WarehouseLocation_Tab.click();Thread.sleep(3000);
	    driver.switchTo().frame(Nmial_Outbound.PageFrame);
	    Nmial_Outbound.WH_AwbPfx_Tb.sendKeys(AwbGenerated.substring(0, 2), Keys.END);
	    Nmial_Outbound.WH_Awb_Tb.sendKeys(AwbGenerated.substring(4), Keys.TAB);Thread.sleep(3000);
	    Nmial_Outbound.WH_AwbSearch_Btn.click();Thread.sleep(3000);
	    
	    Nmial_Outbound.GroupIdWH_Tb.sendKeys(wm.RandomNo(7), Keys.END);
	    Nmial_Outbound.LocationWH_Icon.click();Thread.sleep(3000);
	    wm.scrollTillElement(driver, Nmial_Outbound.SaveLocationWH_Btn);Thread.sleep(3000);
	    Nmial_Outbound.SaveLocationWH_Btn.click();Thread.sleep(3000);
	    driver.switchTo().defaultContent();
        Nmial_Outbound.GroupIdWH_Tb.sendKeys(wm.RandomNo(7), Keys.END);
	    Nmial_Outbound.LocationWH_Icon.click();Thread.sleep(3000);
	    wm.scrollTillElement(driver, Nmial_Outbound.SaveLocationWH_Btn);Thread.sleep(3000);
	    Nmial_Outbound.SaveLocationWH_Btn.click();Thread.sleep(3000);
	    driver.switchTo().defaultContent();
	    
		Nmial_Outbound.ImportMore_Hyperlink.click();
		ECOM_Outbound.WDO_Hyperlink.click();Thread.sleep(3000);
		driver.switchTo().frame(Nmial_Outbound.PageFrame);
		ECOM_Outbound.WDOpfx_Tb.sendKeys(AwbGenerated.substring(0, 2), Keys.END);Thread.sleep(3000);
		ECOM_Outbound.WDOawb_Tb.sendKeys(AwbGenerated.substring(4), Keys.END);Thread.sleep(3000);
		ECOM_Outbound.WDOsearch_Btn.click();Thread.sleep(3000);
		wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.WDO_Cb, 30);
		ECOM_Outbound.WDO_Cb.click();Thread.sleep(3000);
		ECOM_Outbound.WDOcustomRef_Tb.sendKeys(wm.RandomNo(7), Keys.END);Thread.sleep(3000);
		wm.scrollTillElement(driver, ECOM_Outbound.GenerateWDO_Btn);
		ECOM_Outbound.GenerateWDO_Btn.click();Thread.sleep(3000);
		ECOM_Outbound.ReleasedWDO_Btn.click();Thread.sleep(3000);   
		
		*/
		}

	
	
	@When("click on Imports> Warehouse Location and save AWB details for ECOM GHA")
	public void click_on_imports_warehouse_location_and_save_awb_details_for_ecom_gha() throws Throwable {
	  	
	}
	
	@When("click on Imports> More> Warehouse Delivery Order, search AWB, click on Generate WDO and Release button for ECOM GHA")
	public void click_on_imports_more_warehouse_delivery_order_search_awb_click_on_generate_wdo_and_release_button_for_ecom_gha() throws Throwable {
	
	}
	
	//Track and Trace
	@When("click on Track and Trace tab of ECOM")
	public void click_on_track_and_trace_tab_of_ecom() throws Throwable {
		wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.TrackTrace_Tab, 30);
		ECOM_Outbound.TrackTrace_Tab.click();
		Thread.sleep(3000);
	
	}
	
	@When("clicked on AWB, select {int} Bag and click on Go button of ECOM")
	public void clicked_on_awb_select_bag_and_click_on_go_button_of_ecom(Integer row) throws Throwable {
		ECOM_Outbound.AwbTrackTrace_Hyperlink.get(0).click();
		Thread.sleep(3000);
		wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.BagNo_DD, 30);
		ECOM_Outbound.BagNo_DD.click();Thread.sleep(3000);
		wm.VisibilityOfElementExplicityWait(driver, ECOM_Outbound.BagDD_List, 30);
		ECOM_Outbound.BagDD_List.get(row).click();

	}
	
	@Then("verify Flight shipment departure as updated")
	public void verify_flight_shipment_departure_as_updated() throws Throwable {
		ECOM_Outbound.BagGo_Btn.click();
		Thread.sleep(3000);
	}

	
	
}
