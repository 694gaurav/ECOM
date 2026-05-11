package stepdefinition;


import static Helper.BaseObjects.driver;
import static Helper.BaseObjects.loginScreen;
import static Helper.BaseObjects.wm;
import static Helper.BaseObjects.cm;
import static Helper.BaseObjects.Export;
import static Helper.BaseObjects.Import;
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
import com.sun.xml.bind.v2.schemagen.xmlschema.Import;

import Methods.CommonMethods;
import Methods.WebDriverMethod;
import Methods.WebdriverMethods;
import TestDataOperations.TestDataReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ACSAdaniAMD_Import {
	
	 String AdaniAMDImport1 = cm.Random_AWBNo();
	
	
	public boolean verify;

	@When("I login with {string} user given in {string} sheet for Import module")
	public void i_login_with_user_given_in_sheet_for_for_Import_module(String entity, String sheetName) throws Throwable {
		Entity = entity;
		TestDataReader.ReadLoginDetails(Entity);
		Thread.sleep(500);
		System.out.println("usr= " + Username);
		System.out.println("pwd= " + Password);
		// loginScreen.isLoginScreenDisplayed();
		loginScreen.Login(Entity, Username, Password);
		Thread.sleep(30000);

	}
	
	@When("^User should be able to click on Imports mode$")
	public void User_should_be_able_to_click_on_Imports_mode() throws Throwable 
	{
		Import.AdaniImportsModule.click();Thread.sleep(20000);

	}
	
	@Then("^User should check Shipment Details page should be displayed$")
	public void User_should_check_Shipment_Details_page_should_be_displayed() throws Throwable 
	{
		wm.isElementTextMatch(driver, Import.AdaniImportsShipmentDetailsPage, "Shipment Details");Thread.sleep(1000);

	}

	@Then("^User should be able to click on Add MAWB/HAWB button$")
	public void User_should_be_able_to_click_on_Add_MAWB_HAWB_button() throws Throwable 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView();",Import.AdaniImportsAddMAWB_HAWBButton);Thread.sleep(1000);
	    
	    wm.JavascriptExecutorClick(driver, Import.AdaniImportsAddMAWB_HAWBButton);Thread.sleep(1000);

	}
	@Then("^User should be able to enter all the MAWB Details$")
	public void User_should_be_able_to_enter_all_the_MAWB_Details() throws Throwable 
	{
		Import.AdaniImportsMAWBPrefixNumber.sendKeys("999");Thread.sleep(500);
		Import.AdaniImportsMAWBNumber.sendKeys(AdaniAMDImport1);Thread.sleep(500);
		Import.MAWBDeatils();Thread.sleep(1500);
		

	}
	
	@Then("^User should able to click on the Save button$")
	public void User_should_able_to_click_on_the_Save_button() throws Throwable 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView();",Import.AdaniImportsMAWBSaveButton);Thread.sleep(1000);
		
		wm.JavascriptExecutorClick(driver, Import.AdaniImportsMAWBSaveButton);Thread.sleep(3000);
		wm.JavascriptExecutorClick(driver, Import.AdaniImportsMAWBSaveButtonOkPupup);Thread.sleep(2000);

	}
	

	@Then("^User should logout import module application$")
	public void User_should_logout_import_module_application() throws InterruptedException 
	{
		Thread.sleep(8000);
		wm.driver.get("https://acsadaniuat.kalelogistics.com/ACS_AMD_UAT/UI/UpliftLogin.aspx");
		Thread.sleep(5000);		
	}
	
//	@Then("^User should search HAWB number in airline login$")
//	public void User_should_search_HAWB_number_in_airline_login() throws Throwable 
//	{
//		//Import.AdaniImportsAirlineMAWBNumber.sendKeys("34406131");Thread.sleep(1500);
//		Import.AdaniImportsAirlineMAWBNumber.sendKeys(AdaniAMDImport1);Thread.sleep(1500);
//		Import.AdaniImportsAirlineMAWBSearchButton.click();Thread.sleep(3500);
//
//	}
//	
//	@Then("^User should click on Pending DO icon of the new entry in the Action coloum$")
//	public void User_should_click_on_Pending_DO_icon_of_the_new_entry_in_the_Action_coloum() throws Throwable 
//	{
//		Import.AdaniImportsAirlineActionPendingDOIcon.click();Thread.sleep(1500);
//		Import.AdaniImportsAirlineActionPendingDOSubmitButton.click();Thread.sleep(5000);
//		Import.AdaniImportsAirlineActionPendingDOSubmitButtonOKPopup.click();Thread.sleep(2500);
//
//	}
	
//	@Then("^User should be able to click on the BoE milestone for direct shipment$")
//	public void User_should_be_able_to_click_on_the_BoE_milestone_for_direct_shipment() throws Throwable 
//	{
//		Thread.sleep(6000);
//		wm.JavascriptExecutorClick(driver, Import.AdaniImportsBoEMilestone);Thread.sleep(4500);
//		
//	}
//	
//	@Then("^User should enter valid BoE deatils$")
//	public void User_should_enter_valid_BoE_deatils() throws Throwable 
//	{
//		Thread.sleep(5000);
//		Import.AdaniImportsBoENumber.sendKeys(cm.RandomNo(7));Thread.sleep(1000);
//		Import.AdaniImportsBoEDate.click();Thread.sleep(1000);
//		Import.	CurrentDate();Thread.sleep(500);
//		Select SelectBoEType = new Select(Import.AdaniImportsBoETypeDrpodown);
//		SelectBoEType.selectByVisibleText("Manual");Thread.sleep(1000);
//		
//		Import.AdaniImportsBoECAVValue.sendKeys(cm.RandomNo(6));Thread.sleep(1000);
//		Import.AdaniImportsBoENOP.sendKeys("20");Thread.sleep(1000);
//		
//		
//	}
//	
//	@Then("^User should upload document for BoE$")
//	public void User_should_upload_document_for_BoE() throws Throwable 
//	{
//		Thread.sleep(1500);
//		wm.JavascriptExecutorClick(driver, Import.AdaniImportsBoEUploadIcon);
//		Thread.sleep(50000);
///*
//		driver.switchTo().frame(0);
//		
//		Actions a = new Actions(driver);
//	      a.moveToElement(driver.findElement(By.id(("ctl00_hldPage_fuctlUploadDocs")))).click().
//	      build().perform();Thread.sleep(1500);
//		//wm.JavascriptExecutorClick(driver, Import.AdaniImportsWeightVerificationMAWBNumberFileButton);Thread.sleep(2000);
//		
//		Robot rb1 = new Robot();
//		rb1.delay(2000);
//		StringSelection ss1 = new StringSelection("C:\\Users\\riyanka.sikchi\\OneDrive - Kale Logistics Solutions Private Limited\\Priyanka\\Kale Workspace July24\\ACS Adani AHMD July24\\GitHub\\ACS-Adani\\AdaniAMD\\pdf1.pdf");  rb1.delay(2000);
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);rb1.keyPress(KeyEvent.VK_CONTROL); rb1.delay(2000);
//		rb1.keyPress(KeyEvent.VK_V); 
//		rb1.delay(2000);
//		rb1.keyPress(KeyEvent.VK_ENTER); rb1.delay(500);
//		rb1.keyPress(KeyEvent.VK_ENTER);
//		rb1.delay(2000);
//		
//		Import.AdaniImportsBoEUploadFileButton.click();Thread.sleep(4500);
//		Import.AdaniImportsBoEUploadedDocumentDownload.click();Thread.sleep(3500);
//		
//		try
//		{
//			driver.switchTo().defaultContent();Thread.sleep(3000);
//			
//			wm.JavascriptExecutorClick(driver, Import.AdaniImportsBoEUploadfilePopupClose);Thread.sleep(3500);
//		}
//		catch(Exception E)
//		{
//			System.out.println("done");
//		}
//		*/
//	}
//	
//	@Then("^User should save BoE details$")
//	public void User_should_save_BoE_details() throws Throwable 
//	{
//		Import.AdaniImportsBoESaveButton.click();Thread.sleep(2500);
//		wm.JavascriptExecutorClick(driver, Import.AdaniImportsBoESaveButtonOkPopup);Thread.sleep(4500);
//		
//	}
//	
//	@Then("^User should be able to click on the TSP milestone for direct shipment self assign$")
//	public void User_should_be_able_to_click_on_the_TSP_milestone_for_direct_shipment_self_assign() throws Throwable 
//	{
//		
//		wm.JavascriptExecutorClick(driver, Import.AdaniImportsTSPMilestone);Thread.sleep(2500);
//	
//	}
//	
//	@Then("^User should prosess TSP payment for self$")
//	public void User_should_prosess_TSP_payment_for_self() throws Throwable 
//	{
//		try
//		{
//			Thread.sleep(3000);
//			wm.JavascriptExecutorClick(driver, Import.AdaniImportsTSPMilestoneSelfPaymentProceedButton);Thread.sleep(15000);
//			
//		}
//		catch (Exception E)
//		{
//			System.out.println("Trade Partner Selected");
//		}
//		
//		try
//		{
//			Thread.sleep(3000);
//			wm.JavascriptExecutorClick(driver, Import.AdaniImportsTSPMilestoneSelfPaymentProceedButton);Thread.sleep(15000);
//			
//		}
//		catch (Exception E)
//		{
//			System.out.println("Trade Partner Selected");
//		}
//		
//	
//	}
//	
//	@Then("^User should enter valid details for TSP payment and submmit$")
//	public void User_should_enter_valid_details_for_TSP_payment_and_submmit() throws Throwable 
//	{
//		Thread.sleep(10000);
//		Select SelectTSPCargo = new Select(Import.AdaniImportsTSPPaymentCargoTypeDropdown);
//		SelectTSPCargo.selectByVisibleText("General Cargo");Thread.sleep(2000);
//		
//		Select SelectTSPCommodity = new Select(Import.AdaniImportsTSPPaymentComodityDropdown);
//		SelectTSPCommodity.selectByVisibleText("ANTENNAS : GEN");Thread.sleep(6000);
//		
//		
//		Thread.sleep(25000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//	     js.executeScript("arguments[0].scrollIntoView();",Import.AdaniImportsTSPPaymentPassword);Thread.sleep(2000);
//	     
//		Import.AdaniImportsTSPPaymentPassword.sendKeys("Kale@JUN2425");Thread.sleep(4000);
//		
//		Import.AdaniImportsTSPPaymentPayNowButton.click();Thread.sleep(8000);
//		
//		wm.JavascriptExecutorClick(driver, Import.AdaniImportsTSPPaymentPayNowButtonYesPopup);Thread.sleep(30000);
//		wm.JavascriptExecutorClick(driver, Import.AdaniImportsTSPPaymentPayNowButtonOkPopup);Thread.sleep(18000);
//		
//	
//	}
//	
//
//	@Then("^To verify whether user is able to print the TSP print on click Print button from TSP payment screen$")
//	public void To_verify_whether_user_is_able_to_print_the_TSP_print_on_click_Print_button_from_TSP_payment_screen() throws Throwable 
//	{
//		
//		
//		wm.JavascriptExecutorClick(driver, Import.AdaniImportsTSPAmountHyperlink);Thread.sleep(16000);
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//	     js.executeScript("arguments[0].scrollIntoView();",Import.AdaniImportsTSPPrint1);Thread.sleep(2000);
//	     
//		wm.JavascriptExecutorClick(driver, Import.AdaniImportsTSPPrint1);Thread.sleep(6000);
//		
//		Set<String> allwindowid = driver.getWindowHandles();
//		Object[] windows = allwindowid.toArray();Thread.sleep(2000);
//    	String window1 = windows[0].toString();		
//    	driver.switchTo().window(window1);	
//    	Thread.sleep(5000);
//	
//	}
//	
//	@Then("^To verify whether the user is able to click OOC milestone$")
//	public void To_verify_whether_the_user_is_able_to_click_OOC_milestone() throws Throwable 
//	{
//		
//		
//		wm.JavascriptExecutorClick(driver, Import.AdaniImportsOOCMilestone);Thread.sleep(6000);
//		
//	}
//	
//	@Then("^User should fill valid details for OOC$")
//	public void User_should_fill_valid_details_for_OOC() throws Throwable 
//	{
//		Thread.sleep(5000);
//		Import.AdaniImportsOOCNumber.sendKeys(cm.RandomNo(10));Thread.sleep(1000);
//		Import.AdaniImportsOOCDate.click();Thread.sleep(1000);
//		Import.	CurrentDate();Thread.sleep(500);
//		
//		Select SelectBoEType = new Select(Import.AdaniImportsBoETypeDrpodown);
//		SelectBoEType.selectByVisibleText("Manual");Thread.sleep(4000);
//	
//	}
//	
//	@Then("^User should upload document for OOC$")
//	public void User_should_upload_document_for_OOC() throws Throwable 
//	{
//		
//		wm.JavascriptExecutorClick(driver, Import.AdaniImportsOOCUploadIcon);Thread.sleep(1000);
//		Thread.sleep(50000);
//		/*
//		driver.switchTo().frame(0);
//		
//		Actions a = new Actions(driver);
//	      a.moveToElement(driver.findElement(By.id(("ctl00_hldPage_fuctlUploadDocs")))).click().
//	      build().perform();Thread.sleep(1500);
//		//wm.JavascriptExecutorClick(driver, Import.AdaniImportsWeightVerificationMAWBNumberFileButton);Thread.sleep(2000);
//		
//		Robot rb1 = new Robot();
//		rb1.delay(2000);
//		StringSelection ss1 = new StringSelection("C:\\Users\\priyanka.sikchi\\OneDrive - Kale Logistics Solutions Private Limited\\Priyanka\\Kale Workspace\\ACS-Adani\\GitHub\\ACS-Adani\\AdaniAMD\\dummy documents\\pdf1.pdf");  rb1.delay(2000);
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);rb1.keyPress(KeyEvent.VK_CONTROL); rb1.delay(2000);
//		rb1.keyPress(KeyEvent.VK_V); 
//		rb1.delay(2000);
//		rb1.keyPress(KeyEvent.VK_ENTER); rb1.delay(500);
//		rb1.keyPress(KeyEvent.VK_ENTER);
//		rb1.delay(2000);
//		
//		Import.AdaniImportsBoEUploadFileButton.click();Thread.sleep(2500);
//		Import.AdaniImportsBoEUploadedDocumentDownload.click();Thread.sleep(1500);
//		
//		driver.switchTo().defaultContent();Thread.sleep(1500);
//		
//		wm.JavascriptExecutorClick(driver, Import.AdaniImportsOOCUploadfilePopupClose);Thread.sleep(3500);
//		*/
//	}
//	
//	@Then("^User should save OOC details$")
//	public void User_should_save_OOC_details() throws Throwable 
//	{
//		Import.AdaniImportsBoESaveButton.click();Thread.sleep(3500);
//		wm.JavascriptExecutorClick(driver, Import.AdaniImportsOOCSaveButtonOkPopup);Thread.sleep(4500);
//		
//	}
//	
//	@Then("^User should select VT checkbox$")
//	public void User_should_select_VT_checkbox() throws Throwable 
//	{
//	
//		wm.JavascriptExecutorClick(driver, Import.AdaniImportsVTCheckbox);Thread.sleep(1000);
//		
//	}
//	
//	@Then("^User should click on generate token button$")
//	public void User_should_click_on_generate_token_button() throws Throwable 
//	{
//	
//		
//		wm.JavascriptExecutorClick(driver, Import.AdaniImportsVTGenerateTokenButton);Thread.sleep(3000);
//		try
//		{
//			Import.AdaniImportsVTGenerateTokenKaleGHA1RadioButton.click();Thread.sleep(1000);
//			Import.AdaniImportsVTGenerateTokenProceedButton.click();Thread.sleep(5000);
//			
//		}
//		catch (Exception E)
//		{
//			System.out.println("Already CTO selected");
//			
//		}
//		
//	}
//	
//	@Then("^User should check if user is able to create single VT for multiple BoE using add shipment button$")
//	public void User_should_check_if_user_is_able_to_create_single_VT_for_multiple_BoE_using_add_shipment_button() throws Throwable 
//	{
//		Import.AdaniImportsVTGenerateTokenAddShipmentsButton.click();Thread.sleep(10000);	
//		
//		driver.switchTo().frame(0);
//		Import.AdaniImportsVTGenerateTokenAddShipmentsBoERowCheckbox.click();Thread.sleep(1000);	
//		Import.AdaniImportsVTGenerateTokenAddShipmentsAddButton.click();Thread.sleep(10000);
//		
//		driver.switchTo().defaultContent();Thread.sleep(500);
//		
//	}
//	
//	@Then("^User should enter valid vechicle details$")
//	public void User_should_enter_valid_vechicle_details() throws Throwable 
//	{
//		Import.AdaniImportsVTGenerateTokenVechicleNumber.sendKeys("VN"+cm.RandomNo(4));Thread.sleep(1000);		
//		Import.AdaniImportsVTGenerateTokenDriverLicNumber.sendKeys("DLN"+cm.RandomNo(5));Thread.sleep(1000);
//		Import.AdaniImportsVTGenerateTokenDriverName.sendKeys("Jhon");Thread.sleep(1000);
//		Import.AdaniImportsVTGenerateTokenDriverMobNumber.sendKeys(cm.RandomNo(10));Thread.sleep(1000);
//		Import.AdaniImportsVTGenerateTokenAgentMobNumber.sendKeys(cm.RandomNo(10));Thread.sleep(1000);
//		Import.AdaniImportsVTGenerateTokenbutton.click();Thread.sleep(8000);
//		wm.JavascriptExecutorClick(driver, Import.AdaniImportsVTGenerateTokenbuttonOkPopup);Thread.sleep(6000);
//		
//	}
//
//	@Then("^User should click on Track and Trace link$")
//	public void User_should_click_on_Track_and_Trace_link() throws Throwable 
//	{
//		
//		wm.JavascriptExecutorClick(driver, Import.AdaniImportsTrackAndTrace);Thread.sleep(5000);
//	
//	}

//	@Then("^User should search HAWB number in track and trace page$")
//	public void User_should_search_HAWB_number_in_track_and_trace_page() throws Throwable 
//	{
//		
//		Import.AdaniImportsHAWBDFilterMAWBNumberTrackAndTrace.sendKeys(AdaniAMDImport1);Thread.sleep(1500);
//		Import.AdaniImportsHAWBDFilterOperatorTrackAndTrace.click();Thread.sleep(1500);
//		Import.AdaniImportsHAWBDFilterContains.click();Thread.sleep(3500);
//
//	}
//	
//	
//	//----------------- End AdaniAMDImport_01 ------------------------
//	
//	@Then("^User should be able to enter multiple HAWB Details$")
//	public void User_should_be_able_to_enter_multiple_HAWB_Details() throws Throwable 
//	{
//		Import.HAWBDetails1();Thread.sleep(1500);
//		Import.HAWBDetails2();Thread.sleep(1500);
//	}
	
	@Then("^User should search HAWB number in shipment details page$")
	public void User_should_search_HAWB_number_in_shipment_details_page() throws Throwable 
	{
		Thread.sleep(2500);
		//Import.AdaniImportsHAWBDFilterMAWBNumber.sendKeys("42863170");Thread.sleep(1500);
		Import.AdaniImportsHAWBDFilterMAWBNumber.sendKeys(AdaniAMDImport1);Thread.sleep(1500);
		Import.AdaniImportsHAWBDFilterOperator.click();Thread.sleep(1500);
		Import.AdaniImportsHAWBDFilterContains.click();Thread.sleep(3500);

	}
	
//	@Then("^User should click on Pending icon of Weight Verification$")
//	public void User_should_click_on_Pending_icon_of_Weight_Verification() throws Throwable 
//	{
//		wm.JavascriptExecutorClick(driver, Import.AdaniImportsWeightVerificationMilestone);Thread.sleep(2000);
//
//	}
//	
//	@Then("^User should click on Upload Document icon against the HAWB record$")
//	public void User_should_click_on_Upload_Document_icon_against_the_HAWB_record() throws Throwable 
//	{
//		Thread.sleep(3000);
//		Import.AdaniImportsWeightVerificationDocumentUploadButton.click();Thread.sleep(1500);
//
//	}
//	
//	@Then("^User should click on MAWB Choose file button to upload the file$")
//	public void User_should_click_on_MAWB_Choose_file_button_to_upload_the_file() throws Throwable 
//	{
//		driver.switchTo().frame("IframConsignee11");
//		
//		Actions a = new Actions(driver);
//	      a.moveToElement(driver.findElement(By.id(("ctl00_hldPage_GridMAWBFILE_ctl02_fuctlUploadDocs")))).click().
//	      build().perform();Thread.sleep(1500);
//		//wm.JavascriptExecutorClick(driver, Import.AdaniImportsWeightVerificationMAWBNumberFileButton);Thread.sleep(2000);
//		
//		Robot rb1 = new Robot();
//		rb1.delay(2000);
//		StringSelection ss1 = new StringSelection("C:\\Users\\priyanka.sikchi\\OneDrive - Kale Logistics Solutions Private Limited\\Priyanka\\Kale Workspace\\ACS-Adani\\GitHub\\ACS-Adani\\AdaniAMD\\dummy documents\\pdf1.pdf");  rb1.delay(2000);
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);rb1.keyPress(KeyEvent.VK_CONTROL); rb1.delay(2000);
//		rb1.keyPress(KeyEvent.VK_V); 
//		rb1.delay(2000);
//		rb1.keyPress(KeyEvent.VK_ENTER); rb1.delay(500);
//		rb1.keyPress(KeyEvent.VK_ENTER);
//		rb1.delay(2000);
//	}
//	
//	@Then("^User should click on CONSOL Manifest Choose file button to upload the file$")
//	public void User_should_click_on_CONSOL_Manifest_Choose_file_button_to_upload_the_file() throws Throwable 
//	{
//		
//		Actions a = new Actions(driver);
//	      a.moveToElement(driver.findElement(By.id(("ctl00_hldPage_GrdUploadConsolfile_ctl02_fuctlUploadDocs2")))).click().
//	      build().perform();Thread.sleep(1500);
//		//wm.JavascriptExecutorClick(driver, Import.AdaniImportsWeightVerificationConsolManifestFileButton);Thread.sleep(2000);
//		
//		Robot rb2 = new Robot();
//		rb2.delay(2000);
//		StringSelection ss2 = new StringSelection("C:\\Users\\priyanka.sikchi\\OneDrive - Kale Logistics Solutions Private Limited\\Priyanka\\Kale Workspace\\ACS-Adani\\GitHub\\ACS-Adani\\AdaniAMD\\dummy documents\\pdf1.pdf");  rb2.delay(2000);
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2, null);rb2.keyPress(KeyEvent.VK_CONTROL); rb2.delay(2000);
//		rb2.keyPress(KeyEvent.VK_V); 
//		rb2.delay(2000);
//		rb2.keyPress(KeyEvent.VK_ENTER); rb2.delay(500);
//		rb2.keyPress(KeyEvent.VK_ENTER);
//		rb2.delay(2000);
//	}
//	
//	@Then("^User should click on Upload button$")
//	public void User_should_click_on_Upload_button() throws Throwable 
//	{
//		
//		Thread.sleep(3000);
//		wm.JavascriptExecutorClick(driver, Import.AdaniImportsWeightVerificationFileUploadButton);Thread.sleep(3000);
//		wm.JavascriptExecutorClick(driver, Import.AdaniImportsWeightVerificationFileUploadButtonOkPopup);Thread.sleep(5000);
//		
//		driver.switchTo().defaultContent();Thread.sleep(500);
//
//	}
//	
//	@Then("^User should be able to click on Submit button$")
//	public void User_should_be_able_to_click_on_Submit_button() throws Throwable 
//	{
//		
//		wm.JavascriptExecutorClick(driver, Import.AdaniImportsWeightVerificationSubmitButton);Thread.sleep(1000);
//		wm.JavascriptExecutorClick(driver, Import.AdaniImportsWeightVerificationSubmitButtonOKPopup);Thread.sleep(5000);
//		
//	}
//	
//	@Then("^To verify whether the user is able to click Consol DO and assign the shipment as self for Consol Shipment$")
//	public void To_verify_whether_the_user_is_able_to_click_Consol_DO_and_assign_the_shipment_as_self_for_Consol_Shipment() throws Throwable,InterruptedException 
//	{
//		Thread.sleep(1000);
//		try
//		{
//	
//		Actions move = new Actions(driver);
//		move.moveToElement(Import.AdaniImportsShipmentDetailsPageScrollBar).clickAndHold();
//		move.moveByOffset(100,0);
//		move.moveByOffset(100,0);
//		move.moveByOffset(100,0);
//		move.moveByOffset(100,0);
//		move.moveByOffset(100,0);
//		move.moveByOffset(500,0);
//		move.moveByOffset(500,0);
//	
//		move.release();
//    	move.perform();
//	    Thread.sleep(7000);
//		}
//		catch (Exception E)
//		{
//			System.out.println("Scrolling done");
//		}
//		wm.JavascriptExecutorClick(driver, Import.AdaniImportsConsolDOMilestone);Thread.sleep(1000);
//		
//		 Select SelectCTO = new Select(Import.AdaniImportsConsolDOCHADropdown);
//		   SelectCTO.selectByVisibleText("AEROPRIME Cargo Pvt Ltd.");Thread.sleep(500);
//		   Import.AdaniImportsConsolDONumber.sendKeys(cm.RandomNo(5));
//		   
//		   Import.AdaniImportsConsolDOSubmitButton.click();Thread.sleep(1000);
//		   wm.JavascriptExecutorClick(driver, Import.AdaniImportsConsolDOSubmitOkPopup);Thread.sleep(4000);
//		
//	}
//	
//	@Then("^User should enter valid BoE deatils for single HAWB$")
//	public void User_should_enter_valid_BoE_deatils_for_single_HAWB() throws Throwable 
//	{
//		Import.AdaniImportsBoENumber.sendKeys(cm.RandomNo(7));Thread.sleep(1000);
//		Import.AdaniImportsBoEDate.click();Thread.sleep(1000);
//		Import.	CurrentDate();Thread.sleep(500);
//		
//		Select SelectBoEType = new Select(Import.AdaniImportsBoETypeDrpodown);
//		SelectBoEType.selectByVisibleText("Manual");Thread.sleep(1000);
//		
//		Import.AdaniImportsBoECAVValue.sendKeys(cm.RandomNo(6));Thread.sleep(1000);
//		Import.AdaniImportsBoENOP.sendKeys("10");Thread.sleep(1000);
//		
//	}
//	
//	//------------------------------------ End AdaniAMDImport_02 ------------------------------
//	
//	@Then("^User should be able to enter single HAWB Details$")
//	public void User_should_be_able_to_enter_single_HAWB_Details() throws Throwable 
//	{
//		Import.HAWBDetailsSingle();Thread.sleep(1500);
//	}
//	
//	@Then("^To verify whether the user is able to click Consol DO and assign the shipment as Jeena CHA for Consol Shipment$")
//	public void To_verify_whether_the_user_is_able_to_click_Consol_DO_and_assign_the_shipment_as_Jeena_CHA_for_Consol_Shipment() throws Throwable,InterruptedException 
//	{
//		Thread.sleep(1000);
//		try
//		{
//	
//		Actions move = new Actions(driver);
//		move.moveToElement(Import.AdaniImportsShipmentDetailsPageScrollBar).clickAndHold();
//		move.moveByOffset(100,0);
//		move.moveByOffset(100,0);
//		move.moveByOffset(100,0);
//		move.moveByOffset(100,0);
//		move.moveByOffset(100,0);
//		move.moveByOffset(500,0);
//		move.moveByOffset(500,0);
//	
//		move.release();
//    	move.perform();
//	    Thread.sleep(7000);
//		}
//		catch (Exception E)
//		{
//			System.out.println("Scrolling done");
//		}
//		
//		Thread.sleep(3000);
//		wm.JavascriptExecutorClick(driver, Import.AdaniImportsConsolDOMilestone);Thread.sleep(1000);
//		
//		 Select SelectCTO = new Select(Import.AdaniImportsConsolDOCHADropdown);Thread.sleep(1000);
//		   SelectCTO.selectByVisibleText("JEENA & COMPANY");Thread.sleep(1500);
//		   Import.AdaniImportsConsolDONumber.sendKeys(cm.RandomNo(5));
//		   
//		   Import.AdaniImportsConsolDOSubmitButton.click();Thread.sleep(4000);
//		   wm.JavascriptExecutorClick(driver, Import.AdaniImportsConsolDOSubmitOkPopup);Thread.sleep(4000);
//		
//	}
//	
//	@Then("^User should enter valid BoE deatils with customs broker code$")
//	public void User_should_enter_valid_BoE_deatils_with_customs_broker_code() throws Throwable 
//	{
//		Import.AdaniImportsBoENumber.sendKeys(cm.RandomNo(7));Thread.sleep(1000);
//		Import.AdaniImportsBoEDate.click();Thread.sleep(1000);
//		Import.	CurrentDate();Thread.sleep(500);
//		
//		Select SelectBoEType = new Select(Import.AdaniImportsBoETypeDrpodown);
//		SelectBoEType.selectByVisibleText("Manual");Thread.sleep(1000);
//		
//		Import.AdaniImportsBoECAVValue.sendKeys(cm.RandomNo(6));Thread.sleep(1000);
//		Import.AdaniImportsBoENOP.sendKeys("20");Thread.sleep(1000);
//		
//		try 
//		{
//			Import.AdaniImportsBoECBC.sendKeys(cm.RandomNo(3));Thread.sleep(1000);
//		}
//		catch (Exception E)
//		{
//			System.out.println("Customs Broker Code available");
//		}
//		
//		
//		
//	}
//	
//	
//	
//	//------------------------------------ End AdaniAMDImport_03 ------------------------------
//	
//	@Then("^User should enter valid vechicle details if user is able to create multiple VT for single BoE$")
//	public void User_should_enter_valid_vechicle_details_if_user_is_able_to_create_multiple_VT_for_single_BoE() throws Throwable 
//	{
//		Import.AdaniImportsVTGenerateTokenVechicleNumber.sendKeys("VN"+cm.RandomNo(4));Thread.sleep(1000);		
//		Import.AdaniImportsVTGenerateTokenDriverLicNumber.sendKeys("DLN"+cm.RandomNo(5));Thread.sleep(1000);
//		Import.AdaniImportsVTGenerateTokenDriverName.sendKeys("Jhon");Thread.sleep(1000);
//		Import.AdaniImportsVTGenerateTokenDriverMobNumber.sendKeys(cm.RandomNo(10));Thread.sleep(1000);
//		Import.AdaniImportsVTGenerateTokenAgentMobNumber.sendKeys(cm.RandomNo(10));Thread.sleep(1000);
//		Import.AdaniImportsVTGenerateTokenNoP.clear();Thread.sleep(1000);
//		Import.AdaniImportsVTGenerateTokenNoP.sendKeys("10");Thread.sleep(1000);
//		Import.AdaniImportsVTGenerateTokenGrossWeight.clear();Thread.sleep(1000);
//		Import.AdaniImportsVTGenerateTokenGrossWeight.sendKeys("100");Thread.sleep(1000);
//		
//		wm.JavascriptExecutorClick(driver, Import.AdaniImportsVTGenerateTokenVechiclePlusButton);Thread.sleep(1000);
//		
//		Import.AdaniImportsVTGenerateTokenVechicleNumber1.sendKeys("VN"+cm.RandomNo(4));Thread.sleep(1000);		
//		Import.AdaniImportsVTGenerateTokenDriverLicNumber1.sendKeys("DLN"+cm.RandomNo(5));Thread.sleep(1000);
//		Import.AdaniImportsVTGenerateTokenDriverName1.sendKeys("Sunny");Thread.sleep(1000);
//		Import.AdaniImportsVTGenerateTokenDriverMobNumber1.sendKeys(cm.RandomNo(10));Thread.sleep(1000);
//		Import.AdaniImportsVTGenerateTokenAgentMobNumber1.sendKeys(cm.RandomNo(10));Thread.sleep(1000);
//		Import.AdaniImportsVTGenerateTokenNoP1.sendKeys("10");Thread.sleep(1000);
//		Import.AdaniImportsVTGenerateTokenGrossWeight1.sendKeys("100");Thread.sleep(1000);
//		
//		
//		wm.JavascriptExecutorClick(driver, Import.AdaniImportsVTGenerateTokenbutton);Thread.sleep(6000);
//		wm.JavascriptExecutorClick(driver, Import.AdaniImportsVTGenerateTokenbuttonOkPopup);Thread.sleep(6000);
//	}
//	
//	
//	//------------------------------------ End AdaniAMDImport_04 ------------------------------	
//	
//	
//		@Then("^User should click on Revoke hyperlink$")
//		public void User_should_click_on_Revoke_hyperlink() throws Throwable 
//		{
//			Thread.sleep(2000);
//			Import.AdaniImportsRevokeHyperlink.click();Thread.sleep(1000);
//		}
//		
//		@Then("^System should display Confirmation message popup to Revoke ADO with Revoke button$")
//		public void System_should_display_Confirmation_message_popup_to_Revoke_ADO_with_Revoke_button() throws Throwable 
//		{
//			Import.AdaniImportsRevokeConfirmationMsg.sendKeys("Test Revoke");Thread.sleep(1000);
//			Import.AdaniImportsRevokeButton.click();Thread.sleep(2000);
//			wm.JavascriptExecutorClick(driver, Import.AdaniImportsRevokeButtonOkPopup);Thread.sleep(3000);
//		}
//		
////------------------------------------ End AdaniAMDImport_07 ------------------------------
//		
//
//		@Then("^User should search HAWB number for completed VT$")
//		public void User_should_search_HAWB_number_for_completed_VT() throws InterruptedException, AWTException 
//		{
//			Import.AdaniImportsHAWBDFilterMAWBNumber.sendKeys("80026531");Thread.sleep(1500);
//			Import.AdaniImportsHAWBDFilterOperator.click();Thread.sleep(1500);
//			Import.AdaniImportsHAWBDFilterContains.click();Thread.sleep(15000);		
//		}
//		
//		@Then("^User should be able to click on completed icon of vehicle token$")
//		public void User_should_be_able_to_click_on_completed_icon_of_vehicle_token() throws InterruptedException, AWTException 
//		{
//			Thread.sleep(5000);
//			wm.JavascriptExecutorClick(driver, Import.AdaniImportsVTCompleteMilestone);Thread.sleep(3500);
//		}
//		
//		@Then("^User should be able to click on Edit token button and User should edit details$")
//		public void User_should_be_able_to_click_on_Edit_token_button_and_User_should_edit_details() throws InterruptedException, AWTException 
//		{
//			
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//		    js.executeScript("arguments[0].scrollIntoView();",Import.AdaniImportsVTEditTokenButton);Thread.sleep(1000);
//		    
//			wm.JavascriptExecutorClick(driver, Import.AdaniImportsVTEditTokenButton);Thread.sleep(3000);	
//			
//			JavascriptExecutor js1 = (JavascriptExecutor) driver;
//		    js1.executeScript("arguments[0].scrollIntoView();",Import.AdaniImportsVTEditTokenSaveButton);Thread.sleep(1000);
//		    
//			Import.AdaniImportsVTGenerateTokenVechicleNumber.clear();Thread.sleep(1000);	
//			Import.AdaniImportsVTGenerateTokenVechicleNumber.sendKeys("NEW VN"+cm.RandomNo(4));Thread.sleep(1000);	
//			Import.AdaniImportsVTGenerateTokenDriverLicNumber.clear();Thread.sleep(1000);	
//			Import.AdaniImportsVTGenerateTokenDriverLicNumber.sendKeys("NEW DLN"+cm.RandomNo(5));Thread.sleep(2000);
//			
//			wm.JavascriptExecutorClick(driver, Import.AdaniImportsVTEditTokenSaveButton);Thread.sleep(4000);
//			wm.JavascriptExecutorClick(driver, Import.AdaniImportsVTEditButtonOkPopup);Thread.sleep(5000);
//		}
//		
//		@Then("^User should be able to clcik on Print all button$")
//		public void User_should_be_able_to_clcik_on_Print_all_button() throws InterruptedException, AWTException 
//		{
//			wm.JavascriptExecutorClick(driver, Import.AdaniImportsVTPrintAllButton);Thread.sleep(3500);
//			
//		}
//		
//		@Then("^User should be able to select the checkbox of only VT$")
//		public void User_should_be_able_to_select_the_checkbox_of_only_VT() throws InterruptedException, AWTException 
//		{
//			wm.JavascriptExecutorClick(driver, Import.AdaniImportsVTPrintOnlyVTCheckbox);Thread.sleep(3500);
//		}
//		
//		@Then("^User should be able to click on Print button$")
//		public void User_should_be_able_to_click_on_Print_button() throws InterruptedException, AWTException 
//		{
//			wm.JavascriptExecutorClick(driver, Import.AdaniImportsVTPrintButton);Thread.sleep(5000);
//			
//			Set<String> allwindowid = driver.getWindowHandles();
//			Object[] windows = allwindowid.toArray();Thread.sleep(2000);
//	    	String window1 = windows[0].toString();		
//	    	driver.switchTo().window(window1);	
//	    	Thread.sleep(5000);
//		}
//		
//		@Then("^User should be able to select the checkbox of TSP and VT$")
//		public void User_should_be_able_to_select_the_checkbox_of_TSP_and_VT() throws InterruptedException, AWTException 
//		{
//			wm.JavascriptExecutorClick(driver, Import.AdaniImportsVTPrintTSTAndVTCheckbox);Thread.sleep(3500);
//		}
////------------------------------------ End AdaniAMDImport_08 ------------------------------
//		
//		@Then("^User should able to cancel token$")
//		public void User_should_able_to_cancel_token() throws InterruptedException, AWTException 
//		{
//			wm.JavascriptExecutorClick(driver, Import.AdaniImportsVTCancelTokenButton);Thread.sleep(3500);
//			wm.JavascriptExecutorClick(driver, Import.AdaniImportsVTCancelTokenButtonOkPopup);Thread.sleep(5000);
//		}
////------------------------------------ End AdaniAMDImport_09 ------------------------------
//		
//		
//		@Then("^User should Select Trade Partner from drop down select consignee and click on Proceed$")
//		public void User_should_Select_Trade_Partner_from_drop_down_select_consignee_and_click_on_Proceed() throws InterruptedException, AWTException 
//		{
//			wm.JavascriptExecutorClick(driver, Import.AdaniImportsTSPMilestone);Thread.sleep(3000);
//			
//			Select TradePartnerDropdown = new Select(Import.AdaniImportsTSPTrarePartnerDropdown);Thread.sleep(500);
//			TradePartnerDropdown.selectByVisibleText("Trade Partner");Thread.sleep(2500);
//			
//			Select TradePartnerConsigneeDropdown = new Select(Import.AdaniImportsTSPTradePartnerConsineeDropDown);Thread.sleep(500);
//			TradePartnerConsigneeDropdown.selectByVisibleText("ARSHIYA INTERNATIONAL LTD");Thread.sleep(2500);
//			
//			try
//			{
//				Thread.sleep(3000);
//				wm.JavascriptExecutorClick(driver, Import.AdaniImportsTSPMilestoneSelfPaymentProceedButton);Thread.sleep(15000);
//				
//			}
//			catch (Exception E)
//			{
//				System.out.println("Trade Partner Selected");
//			}
//			
//			try
//			{
//				Thread.sleep(3000);
//				wm.JavascriptExecutorClick(driver, Import.AdaniImportsTSPMilestoneSelfPaymentProceedButton);Thread.sleep(15000);
//				
//			}
//			catch (Exception E)
//			{
//				System.out.println("Trade Partner Selected");
//			}
//			
//			wm.JavascriptExecutorClick(driver, Import.AdaniImportsTSPTradePartnerConsineeOkPopup);Thread.sleep(15000);
//
//		}
////------------------------------------ End AdaniAMDImport_10 ------------------------------
//		
//		@Then("^User should click on search token button$")
//		public void User_should_click_on_search_token_button() throws InterruptedException, AWTException 
//		{
//			
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//		    js.executeScript("arguments[0].scrollIntoView();",Import.AdaniImports_SearchTokenButton);Thread.sleep(1000);
//		    
//			wm.JavascriptExecutorClick(driver, Import.AdaniImports_SearchTokenButton);Thread.sleep(1000);
//			wm.JavascriptExecutorClick(driver, Import.AdaniImports_SearchTokenButton);Thread.sleep(5000);
//			
//		}
//		
//		@Then("^User should search vechicle token using token number$")
//		public void User_should_search_vechicle_token_using_token_number() throws InterruptedException, AWTException 
//		{
//			Import.AdaniImports_SearchTokenTextBox.sendKeys("IVT2310170010");Thread.sleep(2000);
//			
//			wm.JavascriptExecutorClick(driver, Import.AdaniImports_SearchTokenSearchButton);Thread.sleep(4000);
//		
//		}
//	
//
//------------------------------------ End AdaniAMDImport_11 ------------------------------
		
		
		
		@Then("^User should Select Import Mode from dropdown$")
		public void User_should_Select_Import_Mode_from_dropdown() throws Throwable 
		{
			Select SelectMode = new Select(Import.AdaniImports_ReportsSubMenDwellTimeReportMode);Thread.sleep(500);
			SelectMode.selectByVisibleText("Import");Thread.sleep(500);
		}
		
		
		@Then("^User should Select Kale GHA1 CTO from dropdown for Dwell Time Report$")
		public void User_should_Select_Kale_GHA1_CTO_from_dropdown_for_Dwell_Time_Report() throws InterruptedException, AWTException 
		{
			
			Select SelectCTO = new Select(Import.AdaniImports_ReportsSubMenuDwellTimeReportCTODropDown);Thread.sleep(500);
			SelectCTO.selectByVisibleText("Kale_GHA1");Thread.sleep(500);
			
		}
	

//------------------------------------ End AdaniAMDImport_14 ------------------------------
		
		
		
		@Then("^User should Select Import Mode from dropdown for Tonnage Report$")
		public void User_should_Select_Import_Mode_from_dropdown_for_Tonnage_Report() throws InterruptedException, AWTException 
		{
			
			Select SelectMode = new Select(Import.AdaniImport_ReportsSubMenuTonnageReportMode);Thread.sleep(500);
			SelectMode.selectByVisibleText("Imports");Thread.sleep(500);
			
		}
		
		@Then("^User should Select Kale GHA1 CTO from dropdown for Tonnage Report$")
		public void User_should_Select_Kale_GHA1_CTO_from_dropdown_for_Tonnage_Report() throws InterruptedException, AWTException 
		{
			
			Select SelectCTO = new Select(Import.AdaniImport_ReportsSubMenuTonnageReportCTODropDown);Thread.sleep(500);
			SelectCTO.selectByVisibleText("Kale_GHA1");Thread.sleep(500);
			
		}
		
//    //------------------------------------ End AdaniAMDImport_16 ------------------------------
//		
//
//		@Then("^User should be able to click on Release and Revoke button$")
//		public void User_should_be_able_to_click_on_Release_and_Revoke_button() throws InterruptedException, AWTException 
//		{
//			
//			wm.JavascriptExecutorClick(driver, Import.AdaniImports_ReleaseRevokeDOButton);Thread.sleep(4000);
//		}
//		
//		@Then("^User should be able to click on checkbox to select shipment$")
//		public void User_should_be_able_to_click_on_checkbox_to_select_shipment() throws InterruptedException, AWTException 
//		{
//			Thread.sleep(2000);
//			try
//			{
//				driver.switchTo().frame(0);
//			}
//			catch (Exception E)
//			{
//				System.out.println("Frame already declaired");
//			}
//			
//			wm.JavascriptExecutorClick(driver, Import.AdaniImports_ReleaseDOCheckbox1);Thread.sleep(1000);
//			wm.JavascriptExecutorClick(driver, Import.AdaniImports_ReleaseDOCheckBox2);Thread.sleep(1000);
//			
//		}
//		
//		@Then("^User should be able to select CHA from dropdown$")
//		public void User_should_be_able_to_select_CHA_from_dropdown() throws InterruptedException, AWTException 
//		{
//			Thread.sleep(2000);
//			
//			 Select SelectCTO = new Select(Import.AdaniImportsConsolDOCHADropdown);Thread.sleep(500);
//			   SelectCTO.selectByVisibleText("AEROPRIME Cargo Pvt Ltd.");Thread.sleep(500);
//			   
//			   wm.JavascriptExecutorClick(driver, Import.AdaniImportsConsolDOSubmitButton);Thread.sleep(2500);
//			   wm.JavascriptExecutorClick(driver, Import.AdaniImports_ReleaseDOSubmitOkPopup);Thread.sleep(2500);
//			
//			
//		}
//		
//		@Then("^User should be able to click on Revoke DO tab$")
//		public void User_should_be_able_to_click_on_Revoke_DO_tab() throws InterruptedException, AWTException 
//		{
//			   Thread.sleep(2000);
//		   
//			   wm.JavascriptExecutorClick(driver, Import.AdaniImports_RevokeDOTab);Thread.sleep(2500);
//			
//		}
//		
//		@Then("^User should be able to click on Revoke DO button$")
//		public void User_should_be_able_to_click_on_Revoke_DO_button() throws InterruptedException, AWTException 
//		{
//			   Thread.sleep(2000);
//		   
//			   wm.JavascriptExecutorClick(driver, Import.AdaniImports_RevokeDOButton);Thread.sleep(2500);
//			   wm.JavascriptExecutorClick(driver, Import.AdaniImports_RevokeDOSubmitOkPopup);Thread.sleep(2500);
//			   wm.JavascriptExecutorClick(driver, Import.AdaniImports_ReleaseRevokeDOCancelButton);Thread.sleep(2500);
//			driver.switchTo().defaultContent();
//		}
//		
//    //------------------------------------ End AdaniAMDImport_17 ------------------------------
	
//	
//	@Then("^User should click on Track and Trace link$")
//	public void User_should_click_on_Track_and_Trace_link() throws Throwable 
//	{
//		
//		wm.JavascriptExecutorClick(driver, Import.AdaniImportsTrackAndTrace);Thread.sleep(5000);
//	
//	}
	
	

	@Then("^User should click on Track and Trace link$")
	public void User_should_click_on_Track_and_Trace_link() throws Throwable 
	{
		
		
	
	}
	
	@Then("^User should search HAWB number in airline login$")
	public void User_should_search_HAWB_number_in_airline_login() throws Throwable 
	{
		
	}
	
	@Then("^User should click on Pending DO icon of the new entry in the Action coloum$")
	public void User_should_click_on_Pending_DO_icon_of_the_new_entry_in_the_Action_coloum() throws Throwable 
	{
		
	}


	@Then("User should be able to click on the BoE milestone for direct shipment")
	public void user_should_be_able_to_click_on_the_bo_e_milestone_for_direct_shipment() 
	{
	   
	}
	@Then("User should enter valid BoE deatils")
	public void user_should_enter_valid_bo_e_deatils()
	{
	  
	}
	@Then("User should upload document for BoE")
	public void user_should_upload_document_for_bo_e() 
	{
	 
	}
	@Then("User should save BoE details")
	public void user_should_save_bo_e_details() {
	 
	}
	@Then("User should be able to click on the TSP milestone for direct shipment self assign")
	public void user_should_be_able_to_click_on_the_tsp_milestone_for_direct_shipment_self_assign() {
	
	}
	@Then("User should prosess TSP payment for self")
	public void user_should_prosess_tsp_payment_for_self() {
	    
	}
	@Then("User should enter valid details for TSP payment and submmit")
	public void user_should_enter_valid_details_for_tsp_payment_and_submmit() 
	{
	    
	}
	@Then("To verify whether user is able to print the TSP print on click Print button from TSP payment screen")
	public void to_verify_whether_user_is_able_to_print_the_tsp_print_on_click_print_button_from_tsp_payment_screen() 
	{
	    
	}
	@Then("To verify whether the user is able to click OOC milestone")
	public void to_verify_whether_the_user_is_able_to_click_ooc_milestone() 
	{
	  
	}
	@Then("User should fill valid details for OOC")
	public void user_should_fill_valid_details_for_ooc() 
	{


	}
	@Then("User should upload document for OOC")
	public void user_should_upload_document_for_ooc()
	{
	}
	@Then("User should save OOC details")
	public void user_should_save_ooc_details() 
	{
	    
	}
	@Then("User should select VT checkbox")
	public void user_should_select_vt_checkbox() 
	{
	    
	}
	@Then("User should click on generate token button")
	public void user_should_click_on_generate_token_button() 
	{
	    
	}
	@Then("User should check if user is able to create single VT for multiple BoE using add shipment button")
	public void user_should_check_if_user_is_able_to_create_single_vt_for_multiple_bo_e_using_add_shipment_button()
	{
	    
	}
	@Then("User should enter valid vechicle details")
	public void user_should_enter_valid_vechicle_details()
	{
	    
	}
	@Then("User should search HAWB number in track and trace page")
	public void user_should_search_hawb_number_in_track_and_trace_page() 
	{
	   
	}
	
	@Then("^User should enter valid vechicle details if user is able to create multiple VT for single BoE$")
	public void User_should_enter_valid_vechicle_details_if_user_is_able_to_create_multiple_VT_for_single_BoE() throws Throwable 
	{
		
	}
	

	@Then("^User should click on Revoke hyperlink$")
	public void User_should_click_on_Revoke_hyperlink() throws Throwable 
	{
		
	}
	
	@Then("^System should display Confirmation message popup to Revoke ADO with Revoke button$")
	public void System_should_display_Confirmation_message_popup_to_Revoke_ADO_with_Revoke_button() throws Throwable 
	{
		
	}
	
	
	@Then("User should search HAWB number for completed VT")
	public void user_should_search_hawb_number_for_completed_vt() {
	  
	}
	@Then("User should be able to click on completed icon of vehicle token")
	public void user_should_be_able_to_click_on_completed_icon_of_vehicle_token() {
	   
	}
	@Then("User should be able to click on Edit token button and User should edit details")
	public void user_should_be_able_to_click_on_edit_token_button_and_user_should_edit_details() {
	   
	}
	@Then("User should be able to clcik on Print all button")
	public void user_should_be_able_to_clcik_on_print_all_button() {
	    
	}
	@Then("User should be able to select the checkbox of only VT")
	public void user_should_be_able_to_select_the_checkbox_of_only_vt() {
	  
	}
	@Then("User should be able to click on Print button")
	public void user_should_be_able_to_click_on_print_button() {
	 
	}
	@Then("User should be able to select the checkbox of TSP and VT")
	public void user_should_be_able_to_select_the_checkbox_of_tsp_and_vt() {
	 
	}




}	
		