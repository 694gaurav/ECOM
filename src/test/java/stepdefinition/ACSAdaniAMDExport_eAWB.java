package stepdefinition;


import static Helper.BaseObjects.driver;
import static Helper.BaseObjects.loginScreen;
import static Helper.BaseObjects.wm;
import static Helper.BaseObjects.cm;
import static Helper.BaseObjects.Export;
import static Helper.BaseVariables.Entity;
import static Helper.BaseVariables.Password;
import static Helper.BaseVariables.Username;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.graphbuilder.math.Expression;

import Methods.CommonMethods;
import Methods.WebDriverMethod;
import Methods.WebdriverMethods;
import TestDataOperations.TestDataReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ACSAdaniAMDExport_eAWB {
	
	//String AdaniAMDExport = cm.Random_AWBNo();	
	
	
	public boolean verify;

	
	@Then("^User should go to e-AWB tab for sub menu Create AWB$")
	public void User_should_go_to_e_AWB_tab_for_sub_menu_Create_AWB() throws InterruptedException, AWTException 
	{		
		Actions ebookingaction = new Actions(driver);
		ebookingaction.moveToElement(Export.AdaniAMD_eAWBTab).perform();Thread.sleep(500);
		Export.AdaniAMD_eAWBCeateAWBTab.click();Thread.sleep(1000);		
	}
	
	@Then("^User should Select Kale GHA1 CTO from dropdown$")
	public void User_should_Select_Kale_GHA1_CTO_from_dropdown() throws InterruptedException, AWTException 
	{		
		Select SelectCTOKaleGHA1 = new Select(Export.AdaniAMD_eAWBCeateAWBCTODropdown);Thread.sleep(1000);		
		SelectCTOKaleGHA1.selectByVisibleText("Kale_GHA1");Thread.sleep(1000);		
	}
	
	@Then("^User should Select Direct shipment Type$")
	public void User_should_Select_Direct_shipment_Type() throws InterruptedException, AWTException 
	{		
		// By default direct shipment selected
	}
	
	@Then("^User should enter AWB No with prefix$")
	public void User_should_enter_AWB_No_with_prefix() throws InterruptedException, AWTException 
	{	
		Thread.sleep(1000);	
		Export.AdaniAMD_eAWBCeateAWBPrefix.sendKeys("999");Thread.sleep(1000);		
		Export.AdaniAMD_eAWBCeateAWBNumber.sendKeys(ACSAdaniAMD_Export.AdaniAMDExport21);Thread.sleep(1000);		
		Export.AdaniAMD_eAWBCeateAWBShipperAccNumber.click();
		
	}
	
	@Then("^User should add Shipper details and save$")
	public void User_should_add_Shipper_details_and_save() throws InterruptedException, AWTException 
	{	
		Export.AdaniAMD_eAWBCeateAddShipperIcon.click();Thread.sleep(2000);	
			driver.switchTo().frame(0);
		
			Export.AdaniAMD_EBookigAddShipperCompanyName.sendKeys("Shipper"+cm.RandomNo(3));Thread.sleep(500);
			Export.AdaniAMD_eAWBCeateAddShipperAddress1.sendKeys("White House Andheri");Thread.sleep(500);
			Export.AdaniAMD_eAWBCeateAddShipperPinCode.sendKeys(cm.RandomNo(6));Thread.sleep(500);
			Export.AdaniAMD_eAWBCeateAddShipperCountry.sendKeys("IN");Thread.sleep(500);
			Export.AdaniAMD_eAWBCeateAddShipperState.sendKeys("MH");Thread.sleep(500);
			Export.AdaniAMD_eAWBCeateAddShipperCity.sendKeys("BOM");Thread.sleep(500);
			Export.AdaniAMD_eAWBCeateAddShipperOtherCity.click();Thread.sleep(500);
			
			  JavascriptExecutor js = (JavascriptExecutor) driver;
		      js.executeScript("arguments[0].scrollIntoView();",Export.AdaniAMD_eAWBCeateAddShipperPinCode);Thread.sleep(1000);
		      
			Export.AdaniAMD_eAWBCeateAddShipperConsigneeSave.click();Thread.sleep(2000);
			driver.switchTo().defaultContent();Thread.sleep(500);
			wm.JavascriptExecutorClick(driver, Export.AdaniAMD_eAWBCeateAddShipperConsigneeSaveOk);Thread.sleep(2000);
			
			
		
	}
	
	@Then("^User Should add Consignee details and save$")
	public void User_Should_add_Consignee_details_and_save() throws InterruptedException, AWTException 
	{	
		Export.AdaniAMD_eAWBCeateAddConsigeeIcon.click();Thread.sleep(2000);	
	   driver.switchTo().frame(0);
	
		
	  Export.AdaniAMD_eAWBCeateAddConsigeeName.sendKeys("Consignee"+cm.RandomNo(3));Thread.sleep(500);
	  Export.AdaniAMD_eAWBCeateAddConsigeeAddress1.sendKeys("Golden Lane Bandra");Thread.sleep(500);
	  Export.AdaniAMD_eAWBCeateAddConsigeePinCode.sendKeys(cm.RandomNo(6));Thread.sleep(500);
	  Export.AdaniAMD_eAWBCeateAddConsigeeCountry.sendKeys("AE");Thread.sleep(500);
	  Export.AdaniAMD_eAWBCeateAddConsigeeState.sendKeys("DXB");Thread.sleep(500);
	  Export.AdaniAMD_eAWBCeateAddConsigeeCity.sendKeys("DXB");Thread.sleep(500);
	  Export.AdaniAMD_eAWBCeateAddConsigeeOtherCity.click();Thread.sleep(500);
	  JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("arguments[0].scrollIntoView();",Export.AdaniAMD_eAWBCeateAddConsigeePinCode);Thread.sleep(1000);
      
	Export.AdaniAMD_eAWBCeateAddConsigneeSave.click();Thread.sleep(2000);
	driver.switchTo().defaultContent();Thread.sleep(1500);
	
	try
	{
		wm.JavascriptExecutorClick(driver, Export.AdaniAMD_eAWBCeateAddConsigneeSaveOk);Thread.sleep(2000);
	}
	catch(Exception E)
	{
		wm.JavascriptExecutorClick(driver, Export.AdaniAMD_eAWBCeateAddConsigneeSaveOk1);Thread.sleep(2000);
	}
	Thread.sleep(8000);
	}
	
	@Then("^User Should put other information$")
	public void User_Should_put_other_information() throws InterruptedException, AWTException 
	{	
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView();",Export.AdaniAMD_EBookingCreateAWBChargeCode);Thread.sleep(3000);
		wm.JavascriptExecutorClick(driver, Export.AdaniAMD_eAWBCreateRoutingInfoIcon);
		Export.AdaniAMD_eAWBCreateRIDestiPort.sendKeys("DXB");Thread.sleep(2000);
		Export.AdaniAMD_eAWBCreateRIOk.click();Thread.sleep(2000);
		
		Select SelectCreateMAWBChargeCode = new Select(Export.AdaniAMD_EBookingCreateAWBChargeCode);Thread.sleep(500);
	    SelectCreateMAWBChargeCode.selectByVisibleText("CA");Thread.sleep(500);Thread.sleep(1000);
	    
	    //Export.AdaniAMD_eAWB__FirstCarrier.sendKeys("Test");Thread.sleep(500);
	    
	    try 
	    {
	    	Export.AdaniAMD_QuickASI_CarrierCode.sendKeys("ZZ");Thread.sleep(500);
	    }
	    catch (Exception E)
	    {
	    	
	    }
	    Export.AdaniAMD_eAWBCreateFlightNo.sendKeys(cm.RandomNo(4));Thread.sleep(1500);
	    
	    Export.AdaniAMD_EBookingCreateAWBCustomeBrokerDropdown.click();Thread.sleep(500);
	    wm.JavascriptExecutorClick(driver, Export.AdaniAMD_EBookingCreateAWBCustomeBrokerAeroprime);Thread.sleep(500);
	    
	    JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    js1.executeScript("arguments[0].scrollIntoView();",Export.AdaniAMD_EBookigAddDimensionIcon1);Thread.sleep(3000);
	    
	    Export.AdaniAMD_EBookingCreateAWBRateAsAgreedCheckBox.click();Thread.sleep(500);Thread.sleep(1000);
	    
	    Export.AdaniAMD_EBookigAddDimensionIcon1.click();Thread.sleep(1000);
		Export.AdaniAMD_AddSBDimNOP1.sendKeys("30");Thread.sleep(1000);
		Export.AdaniAMD_AddSBDimLength1.sendKeys("13");Thread.sleep(500);
		Export.AdaniAMD_AddSBDimWidth1.sendKeys("14");Thread.sleep(500);
		Export.AdaniAMD_AddSBDimHeight1.sendKeys("15");Thread.sleep(500);
		Export.AdaniAMD_AddSBDimVolume1.click();Thread.sleep(500);
		
		Export.AdaniAMD_eAWBCreateDimensionPopupOk.click();Thread.sleep(1000);
		Export.AdaniAMD_EBookingGrossWt1.sendKeys("300");Thread.sleep(1000);
		
		Select SelectCreateMAWBRateClass1 = new Select(Export.AdaniAMD_EBookingCreateAWBRateClass1);Thread.sleep(500);
		SelectCreateMAWBRateClass1.selectByVisibleText("C");Thread.sleep(500);Thread.sleep(1000);
		
		Export.AdaniAMD_EBookingCreateAWBCommodityItem1.sendKeys(cm.RandomNo(5));
		
		Export.AdaniAMD_EBookingCargoDescription1.sendKeys("PAPER");
		
	}
	

	@Then("^User should save AWB job$")
	public void User_should_save_AWB_job() throws InterruptedException, AWTException 
	{	
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    js1.executeScript("arguments[0].scrollIntoView();",Export.AdaniAMD_EBookingCreateAWBSaveButton);Thread.sleep(3000);
	    wm.JavascriptExecutorClick(driver, Export.AdaniAMD_EBookingCreateAWBSaveButton);Thread.sleep(15000);
	    wm.JavascriptExecutorClick(driver, Export.AdaniAMD_QuickASI_MessageAlertOK);Thread.sleep(15000);
	}
	
	@Then("^User Should Search AWB number21 for further process$")
	public void User_Should_Search_AWB_number21_for_further_process() throws InterruptedException, AWTException 
	{	
		//Export.AdaniAMD_FilterMAWBNo.sendKeys("57472774");Thread.sleep(2000);
		Export.AdaniAMD_FilterMAWBNo.sendKeys(ACSAdaniAMD_Export.AdaniAMDExport21);Thread.sleep(2000);
		Export.AdaniAMD_FilterOperator.click();Thread.sleep(3000);
		Export.AdaniAMD_FilterContains.click();Thread.sleep(5000);
	}
	//----------------------- AdaniAMDExport_eAWBSave1 ---------------------
	
	@Then("^User should Select Kale GHA2 CTO from dropdown$")
	public void User_should_Select_Kale_GHA2_CTO_from_dropdown() throws InterruptedException, AWTException 
	{		
		Select SelectCTOKaleGHA1 = new Select(Export.AdaniAMD_eAWBCeateAWBCTODropdown);Thread.sleep(1000);		
		SelectCTOKaleGHA1.selectByVisibleText("Kale_GHA2");Thread.sleep(1000);		
	}
	
	@Then("^User should Select Consol shipment Type$")
	public void User_should_Select_Consol_shipment_Type() throws InterruptedException, AWTException 
	{		
		Export.AdaniAMD_eAWBCeateAWBConsolShipment.click();Thread.sleep(1000);
	}
	
	@Then("^User should add House Job$")
	public void User_should_add_House_Job() throws InterruptedException, AWTException 
	{		
		Thread.sleep(5000);
		wm.JavascriptExecutorClick(driver, Export.AdaniAMD_EBookigSaveSubmitFlightDetailsPopupYes);Thread.sleep(1000);
		
		driver.switchTo().frame("IframHAWB");
		
		Export.AdaniAMD_eAWBCreateAWBHouseNo.sendKeys("H1");Thread.sleep(1000);
		Export.AdaniAMD_eAWBCreateAWBHouseAddShipperIcon.click();Thread.sleep(4000);
		
		//driver.switchTo().defaultContent();Thread.sleep(1500);
		
		driver.switchTo().frame("IframConsignee");
		
		Export.AdaniAMD_eAWBCreateAWBHouseAddShipperCompantName.sendKeys("Shipper"+cm.RandomNo(3));Thread.sleep(500);
		Export.AdaniAMD_eAWBCeateAddShipperAddress1.sendKeys("White House Andheri");Thread.sleep(500);
		Export.AdaniAMD_eAWBCeateAddShipperPinCode.sendKeys(cm.RandomNo(6));Thread.sleep(500);
		Export.AdaniAMD_eAWBCeateAddShipperCountry.sendKeys("IN");Thread.sleep(500);
		Export.AdaniAMD_eAWBCeateAddShipperState.sendKeys("MH");Thread.sleep(500);
		Export.AdaniAMD_eAWBCeateAddShipperCity.sendKeys("BOM");Thread.sleep(500);
		Export.AdaniAMD_eAWBCeateAddShipperOtherCity.click();Thread.sleep(500);
		
		 JavascriptExecutor js1 = (JavascriptExecutor) driver;
	     js1.executeScript("arguments[0].scrollIntoView();",Export.AdaniAMD_eAWBCeateAddShipperPinCode);Thread.sleep(1000);
	      
		Export.AdaniAMD_eAWBCeateAddShipperConsigneeSave.click();Thread.sleep(2000);
		
		driver.switchTo().defaultContent();Thread.sleep(1500);
		
		driver.switchTo().frame("IframHAWB");
		
		wm.JavascriptExecutorClick(driver, Export.AdaniAMD_eAWBCreateAWBHouseAddShipperSaveOk);Thread.sleep(2000);
		
	
		
		Export.AdaniAMD_eAWBCreateAWBHouseAddConsigneeIcon.click();
		
		driver.switchTo().frame("IframConsignee");
		
		 Export.AdaniAMD_eAWBCeateAddConsigeeName.sendKeys("Consignee"+cm.RandomNo(3));Thread.sleep(500);
		  Export.AdaniAMD_eAWBCeateAddConsigeeAddress1.sendKeys("Golden Lane Bandra");Thread.sleep(500);
		  Export.AdaniAMD_eAWBCeateAddConsigeePinCode.sendKeys(cm.RandomNo(6));Thread.sleep(500);
		  Export.AdaniAMD_eAWBCeateAddConsigeeCountry.sendKeys("AE");Thread.sleep(500);
		  Export.AdaniAMD_eAWBCeateAddConsigeeState.sendKeys("DXB");Thread.sleep(500);
		  Export.AdaniAMD_eAWBCeateAddConsigeeCity.sendKeys("DXB");Thread.sleep(500);
		  Export.AdaniAMD_eAWBCeateAddConsigeeOtherCity.click();Thread.sleep(500);
		  JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("arguments[0].scrollIntoView();",Export.AdaniAMD_eAWBCeateAddConsigeePinCode);Thread.sleep(1000);
	      
		Export.AdaniAMD_eAWBCeateAddConsigneeSave.click();Thread.sleep(2000);
		driver.switchTo().defaultContent();Thread.sleep(500);
		
		driver.switchTo().frame("IframHAWB");
		
		wm.JavascriptExecutorClick(driver, Export.AdaniAMD_eAWBCreateAWBHouseAddShipperSaveOk);Thread.sleep(2000);
		
		 //JavascriptExecutor js2 = (JavascriptExecutor) driver;
	     // js2.executeScript("arguments[0].scrollIntoView();",Export.AdaniAMD_eAWBCreateAWBHouseNo);Thread.sleep(1000);
	      
	      Export.AdaniAMD_eAWBCreateAWBHouseOrigin.sendKeys("AMD");Thread.sleep(1500);
	      Export.AdaniAMD_eAWBCreateAWBHouseDestination.sendKeys("DXB");Thread.sleep(1500);
	      Export.AdaniAMD_eAWBCreateAWBHouseNoP.sendKeys("30");Thread.sleep(1500);
	      Export.AdaniAMD_eAWBCreateAWBHouseGrossWt.sendKeys("300");Thread.sleep(1500);
	      
	      Select SelectCreateMAWBChargeCode = new Select(Export.AdaniAMD_eAWBCreateAWBHouseChargeCode);Thread.sleep(500);
		    SelectCreateMAWBChargeCode.selectByVisibleText("CA");Thread.sleep(500);Thread.sleep(1000);
		    
	      Export.AdaniAMD_eAWBCreateAWBHouseCargoDesc.sendKeys("PAPER");Thread.sleep(1500);
	      
	     
		    
		    Export.AdaniAMD_QuickASI_HAWBBulkCHAAssignmentButton.click();	Thread.sleep(2500);	   
		  
		    driver.switchTo().frame("IframConsolDO");
		    Export.AdaniAMD_eAWBCreateAWBHouseBulkHouseCheckBox.click();Thread.sleep(2500);
		    
		    Select SelectBulkCHADropDown = new Select(Export.AdaniAMD_QuickASI_HAWBBulkCHADropdown);Thread.sleep(500);
		    SelectBulkCHADropDown.selectByVisibleText("AEROPRIME Cargo Pvt Ltd.");Thread.sleep(500);Thread.sleep(1000);
		    
		    Export.AdaniAMD_QuickASI_HAWBBulkAssignCHAButton.click();Thread.sleep(2500);
		    
		    wm.JavascriptExecutorClick(driver, Export.AdaniAMD_QuickASI_HAWBBulkAssignCHAOK);Thread.sleep(1000);
		    
		    driver.switchTo().defaultContent();Thread.sleep(500);
		    driver.switchTo().frame("IframHAWB");
		    
		    wm.JavascriptExecutorClick(driver, Export.AdaniAMD_QuickASI_HAWBBulkAssignCHAClose);Thread.sleep(1000);
		    wm.JavascriptExecutorClick(driver, Export.AdaniAMD_eAWBCreateAWBHouseSaveButton);Thread.sleep(3000);
		    driver.switchTo().defaultContent();Thread.sleep(500);
		   wm.JavascriptExecutorClick(driver, Export.AdaniAMD_eAWBCreateAWBHouseCloseButton);Thread.sleep(3000);
	}
	
	@Then("^User Should put other information for consol job$")
	public void User_Should_put_other_information_for_consol_job() throws InterruptedException, AWTException 
	{	
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView();",Export.AdaniAMD_EBookingCreateAWBChargeCode);Thread.sleep(3000);
		wm.JavascriptExecutorClick(driver, Export.AdaniAMD_eAWBCreateRoutingInfoIcon);
		Export.AdaniAMD_eAWBCreateRIDestiPort.sendKeys("DXB");Thread.sleep(2000);
		Export.AdaniAMD_eAWBCreateRIOk.click();Thread.sleep(2000);
		
		Select SelectCreateMAWBChargeCode = new Select(Export.AdaniAMD_EBookingCreateAWBChargeCode);Thread.sleep(500);
	    SelectCreateMAWBChargeCode.selectByVisibleText("CA");Thread.sleep(500);Thread.sleep(1000);
	    
	    Export.AdaniAMD_eAWBCreateFlightNo.sendKeys(cm.RandomNo(4));
	    
	  //  Export.AdaniAMD_EBookingCreateAWBCustomeBrokerDropdown.click();Thread.sleep(500);
	  //  wm.JavascriptExecutorClick(driver, Export.AdaniAMD_EBookingCreateAWBCustomeBrokerAeroprime);Thread.sleep(500);
	    
	    JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    js1.executeScript("arguments[0].scrollIntoView();",Export.AdaniAMD_EBookigAddDimensionIcon1);Thread.sleep(3000);
	    
	    Export.AdaniAMD_EBookingCreateAWBRateAsAgreedCheckBox.click();Thread.sleep(500);Thread.sleep(1000);
	    
	    Export.AdaniAMD_EBookigAddDimensionIcon1.click();Thread.sleep(1000);
		Export.AdaniAMD_AddSBDimNOP1.sendKeys("30");Thread.sleep(1000);
		Export.AdaniAMD_AddSBDimLength1.sendKeys("13");Thread.sleep(500);
		Export.AdaniAMD_AddSBDimWidth1.sendKeys("14");Thread.sleep(500);
		Export.AdaniAMD_AddSBDimHeight1.sendKeys("15");Thread.sleep(500);
		Export.AdaniAMD_AddSBDimVolume1.click();Thread.sleep(500);
		
		Export.AdaniAMD_eAWBCreateDimensionPopupOk1.click();Thread.sleep(1000);
		
		Select SelectCreateMAWBRateClass1 = new Select(Export.AdaniAMD_EBookingCreateAWBRateClass1);Thread.sleep(500);
		SelectCreateMAWBRateClass1.selectByVisibleText("C");Thread.sleep(500);Thread.sleep(1000);
		Export.AdaniAMD_EBookingCreateAWBCommodityItem1.sendKeys(cm.RandomNo(5));
		//Export.AdaniAMD_EBookingGrossWt1.sendKeys("300");Thread.sleep(1000);	
		
		//Export.AdaniAMD_EBookingCargoDescription1.sendKeys("PAPER");
		
		
	}
	
	@Then("^User should add Shipping Bill with single SB for kale GHA2 CTO for consol job$")
	public void User_should_add_Shipping_Bill_with_single_SB_for_kale_GHA2_CTO_for_consol_job() throws InterruptedException, AWTException 
	{
		Thread.sleep(10000);
		wm.JavascriptExecutorClick(driver, Export.AdaniAMD_AddSBMileStone);Thread.sleep(500);
		//Export.AdaniAMD_AddSBMileStone.click();Thread.sleep(500);
		wm.isElementTextMatch(driver, Export.AdaniAMD_AddSBDetailsScreen, "Shipping Bill Details");Thread.sleep(1000);
		
		
		Export.AdaniAMD_AddSBNumber1.sendKeys(cm.RandomNo(7));Thread.sleep(1000);
		Export.AdaniAMD_AddSBDate1.click();Thread.sleep(1000);
		Export.CurrentDate();Thread.sleep(1000);
		
		Select SelectSBTypeManual1 = new Select(Export.AdaniAMD_AddSBType1);Thread.sleep(1500);
		SelectSBTypeManual1.selectByVisibleText("Manual");Thread.sleep(1500);
		
		Export.AdaniAMD_AddSBHAWB1.click();Thread.sleep(1500);
		Select SelectSBHAWB1= new Select(Export.AdaniAMD_AddSBHAWBDrpodown1);Thread.sleep(1500);
		
		
		SelectSBHAWB1.selectByIndex(1);Thread.sleep(1500);
		Export.AdaniAMD_AddSBNOP1.click();
		Thread.sleep(1500);
		
		//Export.AdaniAMD_AddSBNOP1.sendKeys("30");Thread.sleep(1500);
		//Export.AdaniAMD_AddSBGrossWt1.sendKeys("300");Thread.sleep(1500);
		Export.AddSB();Thread.sleep(1500);
		
		Export.AdaniAMD_AddSBSave.click();Thread.sleep(8000);
		wm.JavascriptExecutorClick(driver, Export.AdaniAMD_AddSBSaveOk);Thread.sleep(6000);
	}
	
	@Then("^User should process TSP Payment with Vechicle token for consol shipment$")
	public void User_should_process_TSP_Payment_with_Vechicle_token_for_consol_shipment() throws InterruptedException 
	{
		Export.AdaniAMD_TSPMileStone.click();Thread.sleep(2000);
		//Export.AdaniAMD_TSPMileStone.click();Thread.sleep(2000);
		wm.isElementTextMatch(driver, Export.AdaniAMD_TSPPaymentScreen, "TSP Payment");Thread.sleep(3000);
		Thread.sleep(1500);
		 Select TSPCargoType1 = new Select(Export.AdaniAMD_TSPCargoTypeDropdown1);Thread.sleep(1500);
		 TSPCargoType1.selectByVisibleText("General Cargo");Thread.sleep(500);
		 
		 Select TSPComodityName1 = new Select(Export.AdaniAMD_TSPComodityName1);
		 try
			{
				 TSPComodityName1.selectByVisibleText("ANTENNAS : GEN");Thread.sleep(1500);
				
			}
			catch(Exception E1)
			{
				 TSPComodityName1.selectByVisibleText("FOOD ITEAM : GEN");Thread.sleep(1500);
			}
			
		  Export.AdaniAMD_SBDetailsCheckBox.click();Thread.sleep(3000);
	      	
		  Export.AdaniAMD_TSPTransactionPassword1.sendKeys("Kale@JUN2425");Thread.sleep(4000);
		 
		Export.AdaniAMD_TSPPayNowButton1.click();Thread.sleep(9000);
		Export.AdaniAMD_TSPPayNowOKButtonbulk.click();Thread.sleep(19000);
		wm.JavascriptExecutorClick(driver, Export.AdaniAMD_TSPPayNowNoButton);Thread.sleep(9000);
		Export.AdaniAMD_TSPMileStone.click();Thread.sleep(2000);
		
		Export.AdaniAMD_GenerateTokenVechicleNo.sendKeys("MH"+cm.RandomNo(4));Thread.sleep(500);
		Export.AdaniAMD_GenerateDriverLicNo.sendKeys("DLN"+cm.RandomNo(4));Thread.sleep(500);
		Export.AdaniAMD_GenerateTokenDriverName.sendKeys("Jhon");Thread.sleep(500);
		Export.AdaniAMD_GenerateTokenDriverMobNo.sendKeys(cm.RandomNo(10));Thread.sleep(500);
		
		wm.JavascriptExecutorClick(driver, Export.AdaniAMD_GenerateTokenButton);Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, Export.AdaniAMD_GenerateTokenButtonOk);Thread.sleep(4000);
		
		
	}
	
	//-----------------------End AdaniAMDExport_eAWBSave2 ---------------------
	
	@Then("^User should go to e-AWB tab for sub menu Templates$")
	public void User_should_go_to_e_AWB_tab_for_sub_menu_Templates() throws InterruptedException, AWTException 
	{		
		Actions ebookingaction = new Actions(driver);
		ebookingaction.moveToElement(Export.AdaniAMD_eAWBTab).perform();Thread.sleep(500);
		Export.AdaniAMD_eAWBCreateTemplates.click();Thread.sleep(1000);		
	}
	
	@Then("^User should save as template AWB job$")
	public void User_should_save_as_template_AWB_job() throws InterruptedException, AWTException 
	{	
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    js1.executeScript("arguments[0].scrollIntoView();",Export.AdaniAMD_EBookingCreateAWBSaveasTemplateButton);Thread.sleep(3000);
	    wm.JavascriptExecutorClick(driver, Export.AdaniAMD_EBookingCreateAWBSaveasTemplateButton);Thread.sleep(10000);
	    Export.AdaniAMD_EBookigTempleteNameText.sendKeys("Templete" +cm.RandomNo(3));Thread.sleep(1000);
		Export.AdaniAMD_EBookigTempleteNameOk.click();Thread.sleep(5000);
		Export.AdaniAMD_EBookingCreateAWBSaveasTemplatePopupMsgOk.click();Thread.sleep(1000);
	}
	
	
	
	//-----------------------End AdaniAMDExport_eAWBSaveAsTemplete ---------------------
	
	@Then("^User should go to e-AWB tab for sub menu HAWB List$")
	public void User_should_go_to_e_AWB_tab_for_sub_menu_HAWB_List() throws InterruptedException, AWTException 
	{		
		Actions ebookingaction = new Actions(driver);
		ebookingaction.moveToElement(Export.AdaniAMD_eAWBTab).perform();Thread.sleep(500);
		Export.AdaniAMD_eAWBHAWBList.click();Thread.sleep(1000);		
	}
	
	@Then("^User should verify HAWB List page$")
	public void User_should_verify_HAWB_List_page() throws InterruptedException, AWTException 
	{		
		wm.isElementTextMatch(driver, Export.AdaniAMD_eAWBHAWBListPageVerify, "HAWB List");		Thread.sleep(1000);	
	}
	
	@Then("^User should check HAWB no using view icon$")
	public void User_should_check_HAWB_no_using_view_icon() throws InterruptedException, AWTException 
	{		
		//Export.AdaniAMD_eAWBHAWBListViewIcon.click();	Thread.sleep(5000);		
		//wm.JavascriptExecutorClick(driver, Export.AdaniAMD_eAWBHAWBListViewPopUpClose);Thread.sleep(8000);	
		
	}
	
	// ---------------------- End AdaniAMDExport_HAWBList -----------------------
	
	
	
		@Then("^User should go to e-AWB tab for sub menu House Manifest$")
		public void User_should_go_to_e_AWB_tab_for_sub_menu_House_Manifest() throws InterruptedException, AWTException 
		{		
			Actions ebookingaction = new Actions(driver);
			ebookingaction.moveToElement(Export.AdaniAMD_eAWBTab).perform();Thread.sleep(500);
			Export.AdaniAMD_eAWBHouseManifest.click();Thread.sleep(1000);		
		}
		
		@Then("^User should create HAWB using house manifest menu then create shipment$")
		public void User_should_create_HAWB_using_house_manifest_menu_then_create_shipment() throws InterruptedException, AWTException 
		{		
			Export.AdaniAMD_eAWBCreateAWBHouseNo.sendKeys("House"+cm.RandomNo(2));Thread.sleep(1000);
			
			// Shipper
			Export.AdaniAMD_eAWBCreateAWBHouseAddShipperIcon.click();Thread.sleep(2000);
			
			driver.switchTo().frame(0);
			
			Export.AdaniAMD_eAWBCreateAWBHouseAddShipperCompantName.sendKeys("Shipper"+cm.RandomNo(3));Thread.sleep(500);
			Export.AdaniAMD_eAWBCeateAddShipperAddress1.sendKeys("White House Andheri");Thread.sleep(500);
			Export.AdaniAMD_eAWBCeateAddShipperPinCode.sendKeys(cm.RandomNo(6));Thread.sleep(500);
			Export.AdaniAMD_eAWBCeateAddShipperCountry.sendKeys("IN");Thread.sleep(500);
			Export.AdaniAMD_eAWBCeateAddShipperState.sendKeys("MH");Thread.sleep(500);
			Export.AdaniAMD_eAWBCeateAddShipperCity.sendKeys("BOM");Thread.sleep(500);
			Export.AdaniAMD_eAWBCeateAddShipperOtherCity.click();Thread.sleep(500);
			
			 JavascriptExecutor js1 = (JavascriptExecutor) driver;
		     js1.executeScript("arguments[0].scrollIntoView();",Export.AdaniAMD_eAWBCeateAddShipperPinCode);Thread.sleep(1000);
		      
			Export.AdaniAMD_eAWBCeateAddShipperConsigneeSave.click();Thread.sleep(2000);
			
			driver.switchTo().defaultContent();Thread.sleep(1500);		
			
			try
			{
				wm.JavascriptExecutorClick(driver, Export.AdaniAMD_eAWBCreateAWBHouseAddShipperSaveOk);Thread.sleep(2000);
			}
			catch(Exception E)
			{
				wm.JavascriptExecutorClick(driver, Export.AdaniAMD_eAWBCreateAWBHouseAddShipperSaveOk1);Thread.sleep(2000);
			}
			
			
			
			// Consignee
			
			Export.AdaniAMD_eAWBCreateAWBHouseAddConsigneeIcon.click();
			
			driver.switchTo().frame(0);
			
			 Export.AdaniAMD_eAWBCeateAddConsigeeName.sendKeys("Consignee"+cm.RandomNo(3));Thread.sleep(500);
			  Export.AdaniAMD_eAWBCeateAddConsigeeAddress1.sendKeys("Golden Lane Bandra");Thread.sleep(500);
			  Export.AdaniAMD_eAWBCeateAddConsigeePinCode.sendKeys(cm.RandomNo(6));Thread.sleep(500);
			  Export.AdaniAMD_eAWBCeateAddConsigeeCountry.sendKeys("AE");Thread.sleep(500);
			  Export.AdaniAMD_eAWBCeateAddConsigeeState.sendKeys("DXB");Thread.sleep(500);
			  Export.AdaniAMD_eAWBCeateAddConsigeeCity.sendKeys("DXB");Thread.sleep(500);
			  Export.AdaniAMD_eAWBCeateAddConsigeeOtherCity.click();Thread.sleep(500);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
		      js.executeScript("arguments[0].scrollIntoView();",Export.AdaniAMD_eAWBCeateAddConsigeePinCode);Thread.sleep(1000);
		      
			Export.AdaniAMD_eAWBCeateAddConsigneeSave.click();Thread.sleep(2000);
			driver.switchTo().defaultContent();Thread.sleep(500);
			
			try
			{
				wm.JavascriptExecutorClick(driver, Export.AdaniAMD_eAWBCreateAWBHouseAddShipperSaveOk);Thread.sleep(2000);
			}
			catch (Exception E)
			{
				wm.JavascriptExecutorClick(driver, Export.AdaniAMD_eAWBCreateAWBHouseAddShipperSaveOk11);Thread.sleep(2000);
			}
			
			//--------------
			
			Export.AdaniAMD_eAWBCreateAWBHouseOrigin.sendKeys("AMD");Thread.sleep(1500);
		      Export.AdaniAMD_eAWBCreateAWBHouseDestination.sendKeys("DXB");Thread.sleep(1500);
		      Export.AdaniAMD_eAWBCreateAWBHouseNoP.sendKeys("30");Thread.sleep(1500);
		      Export.AdaniAMD_eAWBCreateAWBHouseGrossWt.sendKeys("300");Thread.sleep(1500);
		      
		      Select SelectCreateMAWBChargeCode = new Select(Export.AdaniAMD_eAWBCreateAWBHouseChargeCode);Thread.sleep(500);
			    SelectCreateMAWBChargeCode.selectByVisibleText("CA");Thread.sleep(500);Thread.sleep(1000);
			    
		      Export.AdaniAMD_eAWBCreateAWBHouseCargoDesc.sendKeys("PAPER");Thread.sleep(1500);
		      
		      Export.AdaniAMD_eAWBCreateAWBHouseSaveButton.click();Thread.sleep(2500);
		      wm.JavascriptExecutorClick(driver, Export.AdaniAMD_eAWBHouseManifestSavePoppupOk);Thread.sleep(2500);
		      
		      
		      Select SelectCTOKaleGHA1 = new Select(Export.AdaniAMD_eAWBCeateAWBCTODropdown);Thread.sleep(1000);		
			  SelectCTOKaleGHA1.selectByVisibleText("Kale_GHA1");Thread.sleep(1000);
			  
			  Thread.sleep(1000);	
				Export.AdaniAMD_eAWBCeateAWBPrefix.sendKeys("999");Thread.sleep(1000);		
				Export.AdaniAMD_eAWBCeateAWBNumber.sendKeys(ACSAdaniAMD_Export.AdaniAMDExport22);Thread.sleep(1000);		
				Export.AdaniAMD_eAWBCeateAWBShipperAccNumber.click();
				
				Export.AdaniAMD_eAWBCeateAddShipperIcon.click();Thread.sleep(2000);	
				driver.switchTo().frame(0);
			
				Export.AdaniAMD_EBookigAddShipperCompanyName.sendKeys("Shipper"+cm.RandomNo(3));Thread.sleep(500);
				Export.AdaniAMD_eAWBCeateAddShipperAddress1.sendKeys("White House Andheri");Thread.sleep(500);
				Export.AdaniAMD_eAWBCeateAddShipperPinCode.sendKeys(cm.RandomNo(6));Thread.sleep(500);
				Export.AdaniAMD_eAWBCeateAddShipperCountry.sendKeys("IN");Thread.sleep(500);
				Export.AdaniAMD_eAWBCeateAddShipperState.sendKeys("MH");Thread.sleep(500);
				Export.AdaniAMD_eAWBCeateAddShipperCity.sendKeys("BOM");Thread.sleep(500);
				Export.AdaniAMD_eAWBCeateAddShipperOtherCity.click();Thread.sleep(500);
				
				  JavascriptExecutor js2 = (JavascriptExecutor) driver;
			      js2.executeScript("arguments[0].scrollIntoView();",Export.AdaniAMD_eAWBCeateAddShipperPinCode);Thread.sleep(1000);
			      
				Export.AdaniAMD_eAWBCeateAddShipperConsigneeSave.click();Thread.sleep(2000);
				driver.switchTo().defaultContent();Thread.sleep(500);
				wm.JavascriptExecutorClick(driver, Export.AdaniAMD_eAWBCeateAddShipperConsigneeSaveOk);Thread.sleep(2000);
			
				
				Export.AdaniAMD_eAWBCeateAddConsigeeIcon.click();Thread.sleep(2000);	
				   driver.switchTo().frame(0);
				
					
				  Export.AdaniAMD_eAWBCeateAddConsigeeName.sendKeys("Consignee"+cm.RandomNo(3));Thread.sleep(500);
				  Export.AdaniAMD_eAWBCeateAddConsigeeAddress1.sendKeys("Golden Lane Bandra");Thread.sleep(500);
				  Export.AdaniAMD_eAWBCeateAddConsigeePinCode.sendKeys(cm.RandomNo(6));Thread.sleep(500);
				  Export.AdaniAMD_eAWBCeateAddConsigeeCountry.sendKeys("AE");Thread.sleep(500);
				  Export.AdaniAMD_eAWBCeateAddConsigeeState.sendKeys("DXB");Thread.sleep(500);
				  Export.AdaniAMD_eAWBCeateAddConsigeeCity.sendKeys("DXB");Thread.sleep(500);
				  Export.AdaniAMD_eAWBCeateAddConsigeeOtherCity.click();Thread.sleep(500);
				  JavascriptExecutor js3 = (JavascriptExecutor) driver;
			      js3.executeScript("arguments[0].scrollIntoView();",Export.AdaniAMD_eAWBCeateAddConsigeePinCode);Thread.sleep(1000);
			      
				Export.AdaniAMD_eAWBCeateAddConsigneeSave.click();Thread.sleep(2000);
				driver.switchTo().defaultContent();Thread.sleep(500);
				
				wm.JavascriptExecutorClick(driver, Export.AdaniAMD_eAWBCeateAddConsigneeSaveOk);Thread.sleep(2000);
				
				JavascriptExecutor j4 = (JavascriptExecutor) driver;
			    j4.executeScript("arguments[0].scrollIntoView();",Export.AdaniAMD_EBookingCreateAWBChargeCode);Thread.sleep(3000);
				wm.JavascriptExecutorClick(driver, Export.AdaniAMD_eAWBCreateRoutingInfoIcon);
				Export.AdaniAMD_eAWBCreateRIDestiPort.sendKeys("DXB");Thread.sleep(2000);
				Export.AdaniAMD_eAWBCreateRIOk.click();Thread.sleep(2000);
				
				Select SelectCreateMAWBChargeCode1 = new Select(Export.AdaniAMD_EBookingCreateAWBChargeCode);Thread.sleep(500);
			    SelectCreateMAWBChargeCode1.selectByVisibleText("CA");Thread.sleep(500);Thread.sleep(1000);
			    
			    Export.AdaniAMD_eAWBCreateFlightNo.sendKeys(cm.RandomNo(4));
			    
			    Export.AdaniAMD_EBookingCreateAWBCustomeBrokerDropdown.click();Thread.sleep(500);
			    wm.JavascriptExecutorClick(driver, Export.AdaniAMD_EBookingCreateAWBCustomeBrokerAeroprime);Thread.sleep(500);
			    
			    JavascriptExecutor js4 = (JavascriptExecutor) driver;
			    js4.executeScript("arguments[0].scrollIntoView();",Export.AdaniAMD_EBookigAddDimensionIcon1);Thread.sleep(3000);
			    
			    Export.AdaniAMD_EBookingCreateAWBRateAsAgreedCheckBox.click();Thread.sleep(500);Thread.sleep(1000);
			    
			    Export.AdaniAMD_EBookigAddDimensionIcon1.click();Thread.sleep(1000);
				Export.AdaniAMD_AddSBDimNOP1.sendKeys("30");Thread.sleep(1000);
				Export.AdaniAMD_AddSBDimLength1.sendKeys("13");Thread.sleep(500);
				Export.AdaniAMD_AddSBDimWidth1.sendKeys("14");Thread.sleep(500);
				Export.AdaniAMD_AddSBDimHeight1.sendKeys("15");Thread.sleep(500);
				Export.AdaniAMD_AddSBDimVolume1.click();Thread.sleep(500);
				
				Export.AdaniAMD_eAWBCreateDimensionPopupOk.click();Thread.sleep(1000);
				Export.AdaniAMD_EBookingGrossWt1.sendKeys("300");Thread.sleep(1000);
				
				Select SelectCreateMAWBRateClass1 = new Select(Export.AdaniAMD_EBookingCreateAWBRateClass1);Thread.sleep(500);
				SelectCreateMAWBRateClass1.selectByVisibleText("C");Thread.sleep(500);Thread.sleep(1000);
				
				Export.AdaniAMD_EBookingCreateAWBCommodityItem1.sendKeys(cm.RandomNo(5));
				
				Export.AdaniAMD_EBookingCargoDescription1.sendKeys("PAPER");
				
				JavascriptExecutor js5 = (JavascriptExecutor) driver;
			    js5.executeScript("arguments[0].scrollIntoView();",Export.AdaniAMD_EBookingCreateAWBSaveButton);Thread.sleep(3000);
			    wm.JavascriptExecutorClick(driver, Export.AdaniAMD_EBookingCreateAWBSaveButton);Thread.sleep(17000);
			    wm.JavascriptExecutorClick(driver, Export.AdaniAMD_QuickASI_MessageAlertOK);Thread.sleep(8000);	
		}
		
		
		
		@Then("^User should go to e-AWB tab for sub menu Attach MAWB to HAWB$")
		public void User_should_go_to_e_AWB_tab_for_sub_menu_Attach_MAWB_to_HAWB() throws InterruptedException, AWTException 
		{		
			Actions ebookingaction = new Actions(driver);
			ebookingaction.moveToElement(Export.AdaniAMD_eAWBTab).perform();Thread.sleep(500);
			Export.AdaniAMD_eAWBAttactMAWBtoHAWB.click();Thread.sleep(1000);		
		}
		
		@Then("^User should verify attach MAWB to HAWB page$")
		public void User_should_verify_attach_MAWB_to_HAWB_page() throws InterruptedException, AWTException 
		{		
			System.out.println("Verified");		
		}
		
		@Then("^User should put MAWB no with prefix for adding house$")
		public void User_should_put_MAWB_no_with_prefix_for_adding_house() throws InterruptedException, AWTException 
		{		
			Export.AdaniAMD_eAWBHouseAttachMAWBPrefix.sendKeys("999");Thread.sleep(1000);	
			Export.AdaniAMD_eAWBHouseAttachMAWBNo.sendKeys(ACSAdaniAMD_Export.AdaniAMDExport22);Thread.sleep(1000);	
			Export.AdaniAMD_eAWBHouseAttachMAWBNNoSearch.click();Thread.sleep(4000);	
		}
		
		@Then("^User should select HAWB no from available HAWB and click on attach button$")
		public void User_should_select_HAWB_no_from_available_HAWB_and_click_on_attach_button() throws InterruptedException, AWTException 
		{		
			
			Thread.sleep(5000);	
			Export.AdaniAMD_eAWBHouseAttachHAWBCheckBox.click();Thread.sleep(1000);	
			wm.JavascriptExecutorClick(driver, Export.AdaniAMD_eAWBCreateAWBHouseSaveButton);Thread.sleep(9000);
			wm.JavascriptExecutorClick(driver, Export.AdaniAMD_eAWBHouseAttachHAWBAttachPopupOk);Thread.sleep(1000);	
		}
		
		@Then("^User Should Search AWB number22 for further process$")
		public void User_Should_Search_AWB_number22_for_further_process() throws InterruptedException, AWTException 
		{	
			//Export.AdaniAMD_FilterMAWBNo.sendKeys("57472774");Thread.sleep(2000);
			Export.AdaniAMD_FilterMAWBNo.sendKeys(ACSAdaniAMD_Export.AdaniAMDExport22);Thread.sleep(2000);
			Export.AdaniAMD_FilterOperator.click();Thread.sleep(3000);
			Export.AdaniAMD_FilterContains.click();Thread.sleep(5000);
		}
	
		// ---------------------- End AdaniAMDExport_HouseManifestAndAttachMAWBtoHAWB -----------------------
	
	
	
	
	
	
	
	
	@Then("^User should go to e-AWB tab for sub menu EDI Dashboard$")
	public void User_should_go_to_e_AWB_tab_for_sub_menu_EDI_Dashboard() throws InterruptedException, AWTException 
	{		
		Actions ebookingaction = new Actions(driver);
		ebookingaction.moveToElement(Export.AdaniAMD_eAWBTab).perform();Thread.sleep(500);
		Export.AdaniAMD_eAWBEDIDashboard.click();Thread.sleep(1000);		
	}
	
	@Then("^User should verify EDI Dashboard page$")
	public void User_should_verify_EDI_Dashboard_page() throws InterruptedException, AWTException 
	{		
		wm.isElementTextMatch(driver, Export.AdaniAMD_eAWBEDIDashboardPageVerify, "EDI Dashboard");		
	}
	
	@Then("^User should verify Clear Button$")
	public void User_should_verify_Clear_Button() throws InterruptedException, AWTException 
	{		
		Export.AdaniAMD_eAWBEDIDashboardAWBPrefix.sendKeys("125");	Thread.sleep(1000);
		Export.AdaniAMD_eAWBEDIDashboardClearButton.click();Thread.sleep(1000);
	}
	
	@Then("^User should verify valid AWB number$")
	public void User_should_verify_valid_AWB_number() throws InterruptedException, AWTException 
	{		
		Export.AdaniAMD_eAWBEDIDashboardAWBPrefix.sendKeys("125");	Thread.sleep(1000);
		Export.AdaniAMD_eAWBEDIDashboardAWBNo.sendKeys("100166941");	Thread.sleep(1000);
		Export.AdaniAMD_eAWBEDIDashboardSearchButton.click();Thread.sleep(1000);
	}
	
	@Then("^User should verify invalid AWB number$")
	public void User_should_verify_invalid_AWB_number() throws InterruptedException, AWTException 
	{		
		Export.AdaniAMD_eAWBEDIDashboardAWBNo.clear();Thread.sleep(1000);
		Export.AdaniAMD_eAWBEDIDashboardAWBNo.sendKeys("166941");	Thread.sleep(1000);
		Export.AdaniAMD_eAWBEDIDashboardSearchButton.click();Thread.sleep(1000);
		System.out.println("Invalid AWB number");Thread.sleep(1000);
	
	}
	
	
	//------------------------  End AdaniAMDExport_EDIDashboard ------------------ 
	
	
	
	@Then("^User should go to e-AWB tab for sub menu HAWB detail upload$")
	public void User_should_go_to_e_AWB_tab_for_sub_menu_HAWB_detail_upload() throws InterruptedException, AWTException 
	{		
		Actions ebookingaction = new Actions(driver);
		ebookingaction.moveToElement(Export.AdaniAMD_eAWBTab).perform();Thread.sleep(500);
		Export.AdaniAMD_eAWBHAWBDetailUpload.click();Thread.sleep(1000);		
	}
	
	@Then("^User should verify HAWB detail upload page$")
	public void User_should_verify_HAWB_detail_upload_page() throws InterruptedException, AWTException 
	{		
		wm.isElementTextMatch(driver, Export.AdaniAMD_eAWBHAWBDetailUploadPageVerify, "HAWB Details Upload");		
	}
	
	@Then("^User should verify is able to click on Download Sample Excel File Link$")
	public void User_should_verify_is_able_to_click_on_Download_Sample_Excel_File_Link() throws InterruptedException, AWTException 
	{		
		Thread.sleep(5000);
		wm.JavascriptExecutorClick(driver, Export.AdaniAMD_eAWBHAWBDetailUploadSampleDownloadFile);	Thread.sleep(5000);
	}
	
	//------------------------  End AdaniAMDExport_HAWBDetailUpload_DownloadSampleFile ------------------ 
	
	@Then("^User should upload incorrect HAWB file format document$")
	public void User_should_upload_incorrect_HAWB_file_format_document() throws InterruptedException, AWTException 
	{		
		Thread.sleep(2000);
		//wm.JavascriptExecutorClick(driver, Export.AdaniAMD_eAWBHAWBDetailUploadChooseFileButton);	Thread.sleep(2000);
		//Export.AdaniAMD_eAWBHAWBDetailUploadChooseFileButton.click();Thread.sleep(5000);
		
		Actions a = new Actions(driver);
	      a.moveToElement(driver.findElement(By.id(("ctl00_hldPageHeader_fuctlLoadFilePath")))).click().
	      build().perform();Thread.sleep(5000);
	      
		Robot rb1 = new Robot();
		rb1.delay(2000);
		StringSelection ss1 = new StringSelection("C:\\Users\\priyanka.sikchi\\OneDrive - Kale Logistics Solutions Private Limited\\Priyanka\\Kale Workspace\\ACS-Adani\\GitHub\\ACS-Adani\\AdaniAMD\\dummy documents\\HAWBSampleIncorrectFormat.xlsx");  rb1.delay(2000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);rb1.keyPress(KeyEvent.VK_CONTROL); rb1.delay(2000);
		rb1.keyPress(KeyEvent.VK_V); 
		rb1.delay(2000);
		rb1.keyPress(KeyEvent.VK_ENTER); rb1.delay(500);
		rb1.keyPress(KeyEvent.VK_ENTER);
		
		rb1.delay(2000);
		Export.AdaniAMD_eAWBHAWBDetailUploadFileUploadButton.click();Thread.sleep(10000);
		
	}
	//-------------------- End AdaniAMDExport_HAWBDetailUpload_UploadIncorrectFile --------------
	
	@Then("^User should upload correct HAWB file format document$")
	public void User_should_upload_correct_HAWB_file_format_document() throws InterruptedException, AWTException 
	{		
		Thread.sleep(2000);
		//wm.JavascriptExecutorClick(driver, Export.AdaniAMD_eAWBHAWBDetailUploadChooseFileButton);	Thread.sleep(2000);
		//Export.AdaniAMD_eAWBHAWBDetailUploadChooseFileButton.click();Thread.sleep(5000);
		
		Actions a = new Actions(driver);
	      a.moveToElement(driver.findElement(By.id(("ctl00_hldPageHeader_fuctlLoadFilePath")))).click().
	      build().perform();Thread.sleep(5000);
	      
		Robot rb1 = new Robot();
		rb1.delay(2000);
		StringSelection ss1 = new StringSelection("C:\\Users\\priyanka.sikchi\\OneDrive - Kale Logistics Solutions Private Limited\\Priyanka\\Kale Workspace\\ACS-Adani\\GitHub\\ACS-Adani\\AdaniAMD\\dummy documents\\HAWBSampleCorrectFormat.xlsx");  rb1.delay(2000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);rb1.keyPress(KeyEvent.VK_CONTROL); rb1.delay(2000);
		rb1.keyPress(KeyEvent.VK_V); 
		rb1.delay(2000);
		rb1.keyPress(KeyEvent.VK_ENTER); rb1.delay(500);
		rb1.keyPress(KeyEvent.VK_ENTER);
		
		rb1.delay(2000);
		Export.AdaniAMD_eAWBHAWBDetailUploadFileUploadButton.click();Thread.sleep(10000);
		
	}
	@Then("^User should go to e-AWB tab for sub menu MAWB List$")
	public void User_should_go_to_e_AWB_tab_for_sub_menu_MAWB_List() throws InterruptedException, AWTException 
	{		
		Actions ebookingaction = new Actions(driver);
		ebookingaction.moveToElement(Export.AdaniAMD_eAWBTab).perform();Thread.sleep(500);
		Export.AdaniAMD_eAWBHAWBMAWBList.click();Thread.sleep(3000);		
	}
	@Then("^User Should Search AWB number from excel for further process$")
	public void User_Should_Search_AWB_number_from_excel_for_further_process() throws InterruptedException, AWTException 
	{	
        Export.AdaniAMD_FilterMAWBNo.sendKeys("43767356");Thread.sleep(2000);
		//Export.AdaniAMD_FilterMAWBNo.sendKeys(ACSAdaniAMD_Export.AdaniAMDExport);Thread.sleep(2000);
		Export.AdaniAMD_FilterOperator.click();Thread.sleep(3000);
		Export.AdaniAMD_FilterContains.click();Thread.sleep(5000);
	}
	@Then("^User should click on edit shipment for other details$")
	public void User_should_click_on_edit_shipment_for_other_details() throws InterruptedException, AWTException 
	{	
       
		Export.AdaniAMD_eAWBHAWBMAWBListEditIcon.click();Thread.sleep(3000);
	}
	
	@Then("^User should update shipment details$")
	public void User_should_update_shipment_details() throws InterruptedException, AWTException 
	{	
       
		Export.AdaniAMD_eAWBCreateFlightNo.sendKeys(cm.RandomNo(4));Thread.sleep(1000);
		
		Export.AdaniAMD_EBookingCreateAWBCustomeBrokerDropdown.click();Thread.sleep(500);
	    wm.JavascriptExecutorClick(driver, Export.AdaniAMD_EBookingCreateAWBCustomeBrokerAeroprime);Thread.sleep(500);
	    
	    Export.AdaniAMD_EBookingCreateAWBRateAsAgreedCheckBox.click();Thread.sleep(500);Thread.sleep(1000);
	    
	    JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    js1.executeScript("arguments[0].scrollIntoView();",Export.AdaniAMD_EBookigAddDimensionIcon1);Thread.sleep(3000);
	    
	    Export.AdaniAMD_EBookigAddDimensionIcon1.click();Thread.sleep(1000);
		
		Export.AdaniAMD_AddSBDimLength1.sendKeys("13");Thread.sleep(500);
		Export.AdaniAMD_AddSBDimWidth1.sendKeys("14");Thread.sleep(500);
		Export.AdaniAMD_AddSBDimHeight1.sendKeys("15");Thread.sleep(500);
		Export.AdaniAMD_AddSBDimVolume1.click();Thread.sleep(500);
		
		Export.AdaniAMD_eAWBCreateDimensionPopupOk1.click();Thread.sleep(1000);
		
		
		Export.AdaniAMD_EBookingCreateAWBCommodityItem1.sendKeys(cm.RandomNo(5));
	}
	
	//------------------End AdaniAMDExport_HAWBDetailUpload_UploadCorrectFile ---------------
}	
		