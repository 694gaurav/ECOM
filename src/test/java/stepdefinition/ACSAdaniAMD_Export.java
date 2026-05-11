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

public class ACSAdaniAMD_Export {
	
	 static String AdaniAMDExport = cm.Random_AWBNo();	
	 static String AdaniAMDExport1 = cm.Random_AWBNo();	
	 static String AdaniAMDExport2 = cm.Random_AWBNo();	
	 static String AdaniAMDExport3 = cm.Random_AWBNo();	
	 static String AdaniAMDExport4 = cm.Random_AWBNo();	
	 static String AdaniAMDExport5 = cm.Random_AWBNo();	
	 static String AdaniAMDExport6 = cm.Random_AWBNo();	
	 static String AdaniAMDExport7 = cm.Random_AWBNo();	
	 static String AdaniAMDExport8 = cm.Random_AWBNo();	
	 static String AdaniAMDExport9 = cm.Random_AWBNo();	
	 static String AdaniAMDExport10 = cm.Random_AWBNo();	
	 static String AdaniAMDExport11 = cm.Random_AWBNo();	
	 static String AdaniAMDExport12 = cm.Random_AWBNo();	
	 static String AdaniAMDExport13 = cm.Random_AWBNo();	
	 static String AdaniAMDExport14 = cm.Random_AWBNo();	
	 static String AdaniAMDExport15 = cm.Random_AWBNo();	
	 static String AdaniAMDExport16 = cm.Random_AWBNo();	
	 static String AdaniAMDExport17 = cm.Random_AWBNo();	
	 static String AdaniAMDExport18 = cm.Random_AWBNo();	
	 static String AdaniAMDExport19 = cm.Random_AWBNo();	
	 static String AdaniAMDExport20 = cm.Random_AWBNo();	
	 static String AdaniAMDExport21 = cm.Random_AWBNo();
	 static String AdaniAMDExport22 = cm.Random_AWBNo();
	 static String AdaniAMDExport23 = cm.Random_AWBNo();
	 static String AdaniAMDExport24 = cm.Random_AWBNo();
	 static String AdaniAMDExport25 = cm.Random_AWBNo();
	 static String AdaniAMDExport26 = cm.Random_AWBNo();
	
	
	public boolean verify;

	@When("I login with {string} user given in {string} sheet for Export module")
	public void i_login_with_user_given_in_sheet_for_for_Export_module(String entity, String sheetName) throws Throwable {
		Entity = entity;
		TestDataReader.ReadLoginDetails(Entity);
		Thread.sleep(500);
		System.out.println("usr= " + Username);
		System.out.println("pwd= " + Password);
		// loginScreen.isLoginScreenDisplayed();
		loginScreen.Login(Entity, Username, Password);
		Thread.sleep(8000);

	}

	@Given("^To verify whether the user is able to see Airport name as per selection from login page$")
	public void To_verify_whether_the_user_is_able_to_see_Airport_name_as_per_selection_from_login_page() throws InterruptedException 
	{
		 wm.isElementTextMatch(driver, Export.AdaniExportModule, "Exports");Thread.sleep(1000);
		 wm.isElementTextMatch(driver, Export.AirportNameAMD, "Ahmedabad");Thread.sleep(1000);
		
	}
	
	
	
	@Then("^User should go to e-AWB tab for creating Quick ASI$")
	public void User_should_go_to_e_AWB_tab_for_creating_Quick_ASI() throws InterruptedException 
	{
		 Export.AdaniAMD_eAWBTab.click();Thread.sleep(500);
		 Export.AdaniAMD_QuickASI.click();Thread.sleep(1000);
		
	}
	//---------------------------------
	
	@Then("User Should create Shipment with quick ASI {string} and {string} CTO-Kale GHA1, Direct, Non-Bonded, Same CHA")
	public void User_Should_create_Shipment_with_quick_ASI_CTO_Kale_GHA1_Direct_Non_Bonded_Same_CHA(String MAWBNo01, String CTO) throws InterruptedException 
	{
		
		   Select SelectCTO = new Select(Export.AdaniAMD_QuickASI_SelectCTODropdown);
		   SelectCTO.selectByVisibleText(CTO);Thread.sleep(500);
		   
		 
		   Export.AdaniAMD_QuickASI_MAWBPrefix.sendKeys("999");Thread.sleep(500);
		   
		   
		   Export.AdaniAMD_QuickASI_MAWBNumber.sendKeys(AdaniAMDExport1);Thread.sleep(1500);
		   System.out.println("AdaniAMDExport_01 AWB No:" +AdaniAMDExport1);
		   
		   Export.QuickASI();Thread.sleep(500);
		   
		   try
		   {
			   Export.AdaniAMD_QuickASI_CarrierCode.sendKeys("ZZ");Thread.sleep(500);
		   }
		   catch (Exception E)
		   {
			   System.out.println("Carrier code available");Thread.sleep(500);
		   }
		   Export.AdaniAMD_QuickASI_FlightNo.sendKeys(cm.RandomNo(4));Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_AssignCHASelect.click();Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_AssignCHAName.click();Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_SaveAWB.click();Thread.sleep(15000);
		   wm.JavascriptExecutorClick(driver,Export.AdaniAMD_QuickASI_MessageAlertOK);Thread.sleep(6000);
	}
	@Given("User Should Search MAWB number1 {string} for further process")
	public void User_Should_Search_MAWB_number1_for_further_process(String MAWBNo01) throws InterruptedException 
	{
		Export.AdaniAMD_FilterMAWBNo.sendKeys(AdaniAMDExport1);Thread.sleep(2000);
		Export.AdaniAMD_FilterOperator.click();Thread.sleep(3000);
		Export.AdaniAMD_FilterContains.click();Thread.sleep(5000);
		
	}
	
	@Then("^User should process ASI submission$")
	public void User_should_process_ASI_submission() throws InterruptedException 
	{
		Thread.sleep(7000);
		wm.JavascriptExecutorClick(driver,Export.AdaniAMD_ASIMileStone);Thread.sleep(6000);
		 //Export.AdaniAMD_ASIMileStone.click();Thread.sleep(6000);
		 wm.isElementTextMatch(driver, Export.AdaniAMD_ASISubmissionScreen, "ASI Submission");Thread.sleep(15000);
		 Export.AdaniAMD_ASIProceedButton.click();Thread.sleep(18000);
		 wm.JavascriptExecutorClick(driver,Export.AdaniAMD_ASIProceedButtonYes);Thread.sleep(15000);
		 
		 try
		 {
			 wm.JavascriptExecutorClick(driver, Export.AdaniAMD_ASIProceedButtonOk);Thread.sleep(9000);
			 //Export.AdaniAMD_ASIProceedButtonOk.click();Thread.sleep(9000);
		 }
		 catch (Exception E)
		 {
			 System.out.println("done");
		 }
		 
		 
	}
	
	@Then("^User Should verify carting order$")
	public void User_Should_verify_carting_order() throws InterruptedException 
	{
		
		
		 try
		 {
			 Export.AdaniAMD_COResubmitMileStone.click();Thread.sleep(6000);
			 Export.AdaniAMD_COResubmitYes.click();Thread.sleep(6000);
			 Export.AdaniAMD_COResubmitPopUpOk.click();Thread.sleep(8000);
			 
		 }
		 catch (Exception E)
		 {
			 System.out.println("CO Done");
		 }
		 
		 Thread.sleep(8000);
	}
	
	@Then("^User should add Shipping Bill with single SB for kale GHA1 CTO$")
	public void User_should_add_Shipping_Bill_with_single_SB_for_kale_GHA1_CTO() throws InterruptedException 
	{
		/*
		Thread.sleep(10000);
		wm.JavascriptExecutorClick(driver, Export.AdaniAMD_AddSBMileStone);Thread.sleep(500);
		//Export.AdaniAMD_AddSBMileStone.click();Thread.sleep(500);
		wm.isElementTextMatch(driver, Export.AdaniAMD_AddSBDetailsScreen, "Shipping Bill Details");Thread.sleep(1000);
		
		
		Export.AdaniAMD_AddSBNumber1.sendKeys(cm.RandomNo(7));Thread.sleep(1000);
		Export.AdaniAMD_AddSBDate1.click();Thread.sleep(1000);
		Export.CurrentDate();Thread.sleep(1000);
		
		Select SelectSBTypeManual1 = new Select(Export.AdaniAMD_AddSBType1);Thread.sleep(1500);
		SelectSBTypeManual1.selectByVisibleText("Manual");Thread.sleep(1500);
		
		//Export.AdaniAMD_AddSBNOP1.sendKeys("30");
		Thread.sleep(2500);
		//Export.AdaniAMD_AddSBNOP1.clear();Thread.sleep(1000);
		//Export.AdaniAMD_AddSBNOP1.sendKeys("30");Thread.sleep(1500);
		//Export.AdaniAMD_AddSBGrossWt1.sendKeys("300");Thread.sleep(2500);
		Thread.sleep(2500);
		//Export.AdaniAMD_AddSBGrossWt1.clear();Thread.sleep(1000);
		//Export.AdaniAMD_AddSBGrossWt1.sendKeys("300");Thread.sleep(1500);
		Export.AddSB();Thread.sleep(1500);
		Thread.sleep(25000);
		//Export.AdaniAMD_AddSBSave.click();Thread.sleep(10000);
		Thread.sleep(10000);
		 //wm.JavascriptExecutorClick(driver,Export.AdaniAMD_AddSBSaveOk);Thread.sleep(7000);
		Thread.sleep(7000);
		*/
		
	}
	
	@Then("^User should process TSP Payment with generate token for kale GHA1 CTO$")
	public void User_should_process_TSP_Payment_with_generate_token_for_kale_GHA1_CTO() throws InterruptedException 
	{
		Export.AdaniAMD_TSPMileStone.click();Thread.sleep(2000);
		try
		{
			Export.AdaniAMD_TSPPaymentMethodProceed.click();Thread.sleep(7000);
		}
		catch (Exception E)
		{
			System.out.println("Method proceed pop up not showing");
		}
		
		try
		{
			Export.AdaniAMD_TSPPaymentMethodProceed1.click();Thread.sleep(7000);
		}
		catch (Exception E)
		{
			System.out.println("Method proceed pop up not showing");
		}
		
		wm.isElementTextMatch(driver, Export.AdaniAMD_TSPPaymentScreen, "TSP Payment");Thread.sleep(6000);
		Export.TSPPayment();Thread.sleep(3000);
		Export.AdaniAMD_TSPPayNowButton1.click();Thread.sleep(7000);
		Export.AdaniAMD_TSPPayNowOKButton.click();Thread.sleep(6000);
		wm.JavascriptExecutorClick(driver,Export.AdaniAMD_TSPPayNowYesButton);Thread.sleep(8000);
		Export.GenerateToken();Thread.sleep(4000);
	
	}
	
	@Then("User should goto track and trace tab for verify AdaniAMDExport_01")
	public void User_should_goto_track_and_trace_tab_for_verify_AdaniAMDExport_01(String MAWBNo01) throws InterruptedException 
	{
		Export.AdaniAMD_TrackAndTraceTab.click();Thread.sleep(15000);
		 wm.isElementTextMatch(driver, Export.AdaniAMD_TrackAndTraceTabScreen, "Track and Trace at AMD Airport");Thread.sleep(1000);
		Export.AdaniAMD_TrackAndTraceFilterAWB.sendKeys(AdaniAMDExport1);Thread.sleep(2000);
		Export.AdaniAMD_TrackAndTraceOperator.click();Thread.sleep(3000);
		Export.AdaniAMD_FilterContains.click();Thread.sleep(5000);
	
	}
	
	@Then("^User should Send Manifest request$")
	public void User_should_Send_Manifest_request() throws InterruptedException 
	{
		
		Export.AdaniAMD_SendManifestMilestone.click();Thread.sleep(2000);
		Export.SendManifest();Thread.sleep(2000);
		
	}
	
	@Then("^User Should check ACS Receipt$")
	public void User_Should_check_ACS_Receipt() throws InterruptedException 
	{
		
		/*Export.AdaniAMD_ACSReceiptMilestone.click();Thread.sleep(3000);
		Set<String> allwindowid = driver.getWindowHandles();Thread.sleep(3000);
		Object[] windows = allwindowid.toArray();Thread.sleep(5000);
    	String window2 = windows[1].toString();		Thread.sleep(3000);
    	driver.switchTo().window(window2);	Thread.sleep(2000);	
    	Thread.sleep(10000);*/
	}
	
	@Then("^User should print Token from Vechicle token milestone$")
	public void User_should_print_Token_from_Vechicle_token_milestone() throws InterruptedException 
	{
		/*Set<String> allwindowid = driver.getWindowHandles();
		Object[] windows = allwindowid.toArray();Thread.sleep(2000);
    	String window1 = windows[0].toString();		
    	driver.switchTo().window(window1);	
    	Thread.sleep(2000);
		Export.AdaniAMD_VechicleTokenMileStone.click();Thread.sleep(2000);
		Export.PrintToken();Thread.sleep(2000);*/
	}
	//------------------------ End @AdaniAMDExport_01 --------------------------
	
	@Then("User should create shipment with quick ASI {string} and {string} CTO-Kale_GHA1, Direct, Non-Bonded, Different CHA")
	public void User_should_create_shipment_with_quick_ASI_and_CTO_Kale_GHA1_Direct_Non_Bonded_Different_CHA(String MAWBNo02, String CTO) throws InterruptedException 
	{
		
		   Select SelectCTO = new Select(Export.AdaniAMD_QuickASI_SelectCTODropdown);
		   SelectCTO.selectByVisibleText(CTO);Thread.sleep(500);
		   
		   Export.AdaniAMD_QuickASI_MAWBPrefix.sendKeys("999");Thread.sleep(1000);
		   Export.AdaniAMD_QuickASI_MAWBNumber.sendKeys(AdaniAMDExport2);Thread.sleep(1000);
		   
		   System.out.println("AdaniAMDExport_02 AWB No:" +AdaniAMDExport2);
		   //Export.AdaniAMD_QuickASI_MAWBPrefix.click();Thread.sleep(500);
		   //Export.AdaniAMD_QuickASI_MAWBNumber.sendKeys(AWB_AdaniAMDExport_02);Thread.sleep(1500);
		   Export.QuickASI();Thread.sleep(500);
		   try
		   {
			   Export.AdaniAMD_QuickASI_CarrierCode.sendKeys("ZZ");Thread.sleep(500);
		   }
		   catch (Exception E)
		   {
			   System.out.println("Carrier code available");Thread.sleep(500);
		   }
		   Export.AdaniAMD_QuickASI_FlightNo.sendKeys(cm.RandomNo(4));Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_AssignCHASelect.click();Thread.sleep(500);
		   wm.JavascriptExecutorClick(driver, Export.AdaniAMD_QuickASI_AssignCHAKrishna_Jeena);Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_SaveAWB.click();Thread.sleep(20000);
		   wm.JavascriptExecutorClick(driver, Export.AdaniAMD_QuickASI_MessageAlertOK);Thread.sleep(6000);
	}
	
	@Then("User Should Search MAWB number2 {string} for further process")
	public void User_Should_Search_MAWB_number2_for_further_process(String MAWBNo02) throws InterruptedException 
	{
		Export.AdaniAMD_FilterMAWBNo.sendKeys(AdaniAMDExport2);Thread.sleep(2000);
		Export.AdaniAMD_FilterOperator.click();Thread.sleep(3000);
		Export.AdaniAMD_FilterContains.click();Thread.sleep(5000);
		
	}
	
	@Then("^User should logout application$")
	public void User_should_logout_application() throws InterruptedException 
	{
		Thread.sleep(8000);
		wm.driver.get("https://acsadaniuat.kalelogistics.com/ACS_AMD_UAT/UI/UpliftLogin.aspx");
		Thread.sleep(5000);		
	}
	
	@Then("^User should select bussiness line as customs broker$")
	public void User_should_select_bussiness_line_as_customs_broker() throws InterruptedException 
	{
		driver.navigate().refresh();Thread.sleep(6000);	
		Export.CustomsBroker();	
	}
	
	
	@Then("^User should add Shipping Bill with multiple SB for kale GHA1 CTO$")
	public void User_should_add_Shipping_Bill_with_multiple_SB_for_kale_GHA1_CTO() throws InterruptedException 
	{
		Export.AdaniAMD_AddSBMileStone.click();Thread.sleep(500);
		wm.isElementTextMatch(driver, Export.AdaniAMD_AddSBDetailsScreen, "Shipping Bill Details");Thread.sleep(1000);
		
		
		Export.AdaniAMD_AddSBNumber1.sendKeys(cm.RandomNo(7));Thread.sleep(1000);
		Export.AdaniAMD_AddSBDate1.click();Thread.sleep(1000);
		Export.CurrentDate();Thread.sleep(1000);
		
		Select SelectSBTypeManual1 = new Select(Export.AdaniAMD_AddSBType1);Thread.sleep(500);
		SelectSBTypeManual1.selectByVisibleText("Manual");Thread.sleep(1500);
		
		Export.AdaniAMD_AddSBNOP1.sendKeys("15");Thread.sleep(500);
		Export.AdaniAMD_AddSBGrossWt1.sendKeys("150");Thread.sleep(500);
		Export.AddSB();Thread.sleep(500);
		//-----------
		Export.AdaniAMD_AddSBAddRow1.click();
		
		Export.AdaniAMD_AddSBNumber2.sendKeys(cm.RandomNo(7));Thread.sleep(1000);
		Export.AdaniAMD_AddSBDate2.click();Thread.sleep(1000);
		Export.CurrentDate();Thread.sleep(1000);
		
		Select SelectSBTypeManual2 = new Select(Export.AdaniAMD_AddSBType2);Thread.sleep(500);
		SelectSBTypeManual2.selectByVisibleText("Manual");Thread.sleep(1500);
		
		Export.AdaniAMD_AddSBNOP2.sendKeys("15");Thread.sleep(500);
		Export.AdaniAMD_AddSBGrossWt2.sendKeys("150");Thread.sleep(500);
		Export.AddSB2();Thread.sleep(500);
		Thread.sleep(25000);
		Export.AdaniAMD_AddSBSave.click();Thread.sleep(8000);
		wm.JavascriptExecutorClick(driver, Export.AdaniAMD_AddSBSaveOk);Thread.sleep(8000);
		
		
	}
	
	@Then("^User should process TSP Payment without generate for kale GHA1 CTO$")
	public void User_should_process_TSP_Payment_without_generate_for_kale_GHA1_CTO() throws InterruptedException 
	{
		Thread.sleep(15000);
		Export.AdaniAMD_TSPMileStone.click();Thread.sleep(2000);
		
		try
		{
			Export.AdaniAMD_TSPPaymentMethodProceed.click();Thread.sleep(1000);
		}
		catch (Exception E)
		{
			System.out.println("Method proceed pop up not showing");
		}
		
		try
		{
			Export.AdaniAMD_TSPPaymentMethodProceed1.click();Thread.sleep(1000);
		}
		catch (Exception E)
		{
			System.out.println("Method proceed pop up not showing");
		}
		
		wm.isElementTextMatch(driver, Export.AdaniAMD_TSPPaymentScreen, "TSP Payment");Thread.sleep(2000);
		Export.TSPPayment();Thread.sleep(2000);
		Export.AdaniAMD_TSPPayNowButton1.click();Thread.sleep(5000);
		Export.AdaniAMD_TSPPayNowOKButton.click();Thread.sleep(7000);
		Export.AdaniAMD_TSPPayNowNoButton.click();Thread.sleep(6000);
	
	}
	
	@Then("^User should generate vechile token$")
	public void User_should_generate_vechile_token() throws InterruptedException 
	{
		Export.AdaniAMD_GenerateTokenCheckBox.click();Thread.sleep(500);
		Export.AdaniAMD_GenerateTokenButton.click();Thread.sleep(500);
		Export.GenerateToken();
		Thread.sleep(1500);
	}
	
	@Then("^User should be verify vechicle token no and AWB no$")
	public void User_should_be_verify_vechicle_token_no_and_AWB_no() throws InterruptedException 
	{
		Export.VerifyVTandAWB();Thread.sleep(500);
		
	
	}
	//----------------- End @AdaniAMDExport_02 --------------------
	
	@Then("User should create shipment with quick ASI {string} and {string} CTO-Kale GHA1, Direct, Bonded, Same CHA")
	public void User_should_create_shipment_with_quick_ASI_and_CTO_Kale_GHA1_Direct_Bonded_Same_CHA(String MAWBNo03, String CTO) throws InterruptedException 
	{
		
		   Select SelectCTO = new Select(Export.AdaniAMD_QuickASI_SelectCTODropdown);
		   SelectCTO.selectByVisibleText(CTO);Thread.sleep(500);
		   
		   Select SelectShipmentType = new Select(Export.AdaniAMD_QuickASI_ShipmentTypeDropdown);
		   SelectShipmentType.selectByVisibleText("Bonded");Thread.sleep(500);
		   
		   
		   Export.AdaniAMD_QuickASI_MAWBPrefix.sendKeys("999");Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_MAWBNumber.sendKeys(AdaniAMDExport3);Thread.sleep(500);
		   System.out.println("AdaniAMDExport_03 AWB No:" +AdaniAMDExport3);
		   Export.QuickASI();Thread.sleep(500);
		   try
		   {
			   Export.AdaniAMD_QuickASI_CarrierCode.sendKeys("ZZ");Thread.sleep(500);
		   }
		   catch (Exception E)
		   {
			   System.out.println("Carrier code available");Thread.sleep(500);
		   }
		   Export.AdaniAMD_QuickASI_FlightNo.sendKeys(cm.RandomNo(4));Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_AssignCHASelect.click();Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_AssignCHAName.click();Thread.sleep(500);
		   
		   Select SelectBondedTrucker = new Select(Export.AdaniAMD_QuickASI_BondedTruckerDropdown);
		   SelectBondedTrucker.selectByVisibleText("Surya_Bonded");Thread.sleep(500);
		   
		   Export.AdaniAMD_QuickASI_SaveAWB.click();Thread.sleep(15000);
		   wm.JavascriptExecutorClick(driver,Export.AdaniAMD_QuickASI_MessageAlertOK);Thread.sleep(7000);
	}
	
	@Then("User Should Search MAWB number3 {string} for further process")
	public void User_Should_Search_MAWB_number3_for_further_process(String MAWBNo03) throws InterruptedException 
	{
		Export.AdaniAMD_FilterMAWBNo.sendKeys(AdaniAMDExport3);Thread.sleep(2000);
		Export.AdaniAMD_FilterOperator.click();Thread.sleep(3000);
		Export.AdaniAMD_FilterContains.click();Thread.sleep(5000);
		
	}
	
	@Then("User should goto track and trace tab for verify AdaniAMDExport_03 {string}")
	public void User_should_goto_track_and_trace_tab_for_verify_AdaniAMDExport_03(String MAWBNo03) throws InterruptedException 
	{
		Export.AdaniAMD_TrackAndTraceTab.click();Thread.sleep(15000);
		wm.isElementTextMatch(driver, Export.AdaniAMD_TrackAndTraceTabScreen, "Track and Trace at AMD Airport");Thread.sleep(3000);
		Export.AdaniAMD_TrackAndTraceFilterAWB.sendKeys(AdaniAMDExport3);Thread.sleep(2000);
		Export.AdaniAMD_TrackAndTraceOperator.click();Thread.sleep(3000);
		Export.AdaniAMD_FilterContains.click();Thread.sleep(5000);
	
	}
	
	//------------------------- End @AdaniAMDExport_03 --------------------------
	
	@Then("User should create shipment with quick ASI {string} and {string} CTO-Kale GHA1, Direct, Bonded, Different CHA")
	public void User_should_create_shipment_with_quick_ASI_and_CTO_Kale_GHA1_Direct_Bonded_Different_CHA(String MAWBNo04, String CTO) throws InterruptedException 
	{
		
		   Select SelectCTO = new Select(Export.AdaniAMD_QuickASI_SelectCTODropdown);
		   SelectCTO.selectByVisibleText(CTO);Thread.sleep(500);
		   
		   Select SelectShipmentType = new Select(Export.AdaniAMD_QuickASI_ShipmentTypeDropdown);
		   SelectShipmentType.selectByVisibleText("Bonded");Thread.sleep(500);
		   
		   
		   Export.AdaniAMD_QuickASI_MAWBPrefix.sendKeys("999");Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_MAWBNumber.sendKeys(AdaniAMDExport4);Thread.sleep(500);
		   System.out.println("AdaniAMDExport_04 AWB No:" +AdaniAMDExport4);
		   Export.QuickASI();Thread.sleep(500);
		   try
		   {
			   Export.AdaniAMD_QuickASI_CarrierCode.sendKeys("ZZ");Thread.sleep(500);
		   }
		   catch (Exception E)
		   {
			   System.out.println("Carrier code available");Thread.sleep(500);
		   }
		   Export.AdaniAMD_QuickASI_FlightNo.sendKeys(cm.RandomNo(4));Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_AssignCHASelect.click();Thread.sleep(500);
		   wm.JavascriptExecutorClick(driver, Export.AdaniAMD_QuickASI_AssignCHASurya);Thread.sleep(500);
		   
		   Select SelectBondedTrucker = new Select(Export.AdaniAMD_QuickASI_BondedTruckerDropdown);
		   SelectBondedTrucker.selectByVisibleText("Surya_Bonded");Thread.sleep(500);
		   
		   Export.AdaniAMD_QuickASI_SaveAWB.click();Thread.sleep(15000);
		   wm.JavascriptExecutorClick(driver,Export.AdaniAMD_QuickASI_MessageAlertOK);Thread.sleep(7000);
	}
	
	@Then("User Should Search MAWB number4 {string} for further process")
	public void User_Should_Search_MAWB_number4_for_further_process(String MAWBNo04) throws InterruptedException 
	{
		Export.AdaniAMD_FilterMAWBNo.sendKeys(AdaniAMDExport4);Thread.sleep(2000);
		Export.AdaniAMD_FilterOperator.click();Thread.sleep(3000);
		Export.AdaniAMD_FilterContains.click();Thread.sleep(5000);
		
	}
	
	//------------------------ End @AdaniAMDExport_04 --------------------------
	
	
	@Then("User should create shipment with quick ASI {string} and {string} CTO-Kale_GHA1, Consol, Non-Bonded, Same CHA")
	public void User_should_create_shipment_with_quick_ASI_CTO_Kale_GHA1_Consol_Non_Bonded_Same_CHA(String MAWBNo05, String CTO) throws InterruptedException 
	{
		
		   Select SelectCTO = new Select(Export.AdaniAMD_QuickASI_SelectCTODropdown);
		   SelectCTO.selectByVisibleText(CTO);Thread.sleep(500);
		   
		   Export.AdaniAMD_QuickASI_ConsolAWB.click();Thread.sleep(500);
		   
		   Export.AdaniAMD_QuickASI_MAWBPrefix.sendKeys("999");Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_MAWBNumber.sendKeys(AdaniAMDExport5);Thread.sleep(500);
		   System.out.println("AdaniAMDExport_05 AWB No:" +AdaniAMDExport5);
		   Export.QuickASI();Thread.sleep(500);
		   try
		   {
			   Export.AdaniAMD_QuickASI_CarrierCode.sendKeys("ZZ");Thread.sleep(500);
		   }
		   catch (Exception E)
		   {
			   System.out.println("Carrier code available");Thread.sleep(500);
		   }
		   Export.AdaniAMD_QuickASI_FlightNo.sendKeys(cm.RandomNo(4));Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_AssignCHASelect.click();Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_AssignCHAName.click();Thread.sleep(500);
		   
		   Export.AdaniAMD_QuickASI_SaveAWB.click();Thread.sleep(12000);
		   wm.JavascriptExecutorClick(driver,Export.AdaniAMD_QuickASI_MessageAlertOK);Thread.sleep(7000);
	}
	
	@Then("^User should click on Add HAWB button for adding multile houses$")
	public void User_should_click_on_Add_HAWB_button_for_adding_multile_houses() throws InterruptedException 
	{
		 Export.AdaniAMD_QuickASI_AddHAWB.click();Thread.sleep(2000);
		 Export.AddHAWB1WithoutOriDesti();
		 Export.AdaniAMD_QuickASI_HAWBAddRow.click();Thread.sleep(2000);
		 Export.AddHAWB2WithoutOriDesti();
		 Export.AdaniAMD_QuickASI_HAWBAddRow.click();Thread.sleep(2000);
		 Export.AddHAWB3WithoutOriDesti();
		 Export.AdaniAMD_QuickASI_HAWBSave.click();Thread.sleep(15000);
		  wm.JavascriptExecutorClick(driver,Export.AdaniAMD_QuickASI_MessageAlertOK);Thread.sleep(7000);		
	}
	
	@Then("^User Should Check Delete Action button for HAWB function$")
	public void User_Should_Check_Delete_Action_button_for_HAWB_function() throws InterruptedException 
	{
		 Export.AdaniAMD_AddHAWB_Milestone.click();Thread.sleep(2000);
		 Export.AdaniAMD_QuickASI_HAWBAddRow.click();Thread.sleep(2000);
		 Export.AdaniAMD_QuickASI_HAWBDelete.click();Thread.sleep(2000);
		 Export.AdaniAMD_ActionMilestoneDeleteYesButton.click();Thread.sleep(2000);
		 Export.AdaniAMD_QuickASI_HAWBDeleteOK.click();Thread.sleep(15000);
		 Export.AdaniAMD_ViewHAWBBack.click();Thread.sleep(8000);		
		 
		
	}
	
	@Then("User Should Search MAWB number5 {string} for further process")
	public void User_Should_Search_MAWB_number5_for_further_process(String MAWBNo05) throws InterruptedException 
	{
		Export.AdaniAMD_FilterMAWBNo.sendKeys(AdaniAMDExport5);Thread.sleep(2000);
		Export.AdaniAMD_FilterOperator.click();Thread.sleep(3000);
		Export.AdaniAMD_FilterContains.click();Thread.sleep(5000);
		
	}
	
	
	@Then("^User should add Shipping Bill with Multiple SB for Multiple HAWB for kale GHA1 CTO$")
	public void User_should_add_Shipping_Bill_with_Multiple_SB_for_Multiple_HAWB_for_kale_GHA1_CTO() throws InterruptedException 
	{
		Export.AdaniAMD_AddSBMileStone.click();Thread.sleep(500);
		wm.isElementTextMatch(driver, Export.AdaniAMD_AddSBDetailsScreen, "Shipping Bill Details");Thread.sleep(1000);
		
		
		Export.AdaniAMD_AddSBNumber1.sendKeys(cm.RandomNo(7));Thread.sleep(1000);
		Export.AdaniAMD_AddSBDate1.click();Thread.sleep(1000);
		Export.CurrentDate();Thread.sleep(1000);
		
		Select SelectSBTypeManual1 = new Select(Export.AdaniAMD_AddSBType1);Thread.sleep(500);
		SelectSBTypeManual1.selectByVisibleText("Manual");Thread.sleep(1500);
		
		Export.AdaniAMD_AddSBHAWB1.click();Thread.sleep(500);
		Select SelectSBHAWB1= new Select(Export.AdaniAMD_AddSBHAWBDrpodown1);Thread.sleep(500);
		SelectSBHAWB1.selectByVisibleText("H1");Thread.sleep(2500);
		Export.AdaniAMD_AddSBNOP1.click();Thread.sleep(1000);
		
		Export.AddSB();Thread.sleep(500);
		//-----------
		Export.AdaniAMD_AddSBAddRow1.click();Thread.sleep(2000);
		
		Export.AdaniAMD_AddSBNumber2.sendKeys(cm.RandomNo(7));Thread.sleep(1000);
		Export.AdaniAMD_AddSBDate2.click();Thread.sleep(1000);
		Export.CurrentDate();Thread.sleep(1000);
		
		Select SelectSBTypeManual2 = new Select(Export.AdaniAMD_AddSBType2);Thread.sleep(500);
		SelectSBTypeManual2.selectByVisibleText("Manual");Thread.sleep(1500);
		
		Export.AdaniAMD_AddSBHAWB2.click();
		Select SelectSBHAWB2= new Select(Export.AdaniAMD_AddSBHAWBDrpodown2);Thread.sleep(500);
		SelectSBHAWB2.selectByVisibleText("H2");Thread.sleep(1500);
		
		Export.AddSB2();Thread.sleep(500);
		//-----------
		Export.AdaniAMD_AddSBAddRow1.click();Thread.sleep(2000);
		
		Export.AdaniAMD_AddSBNumber3.sendKeys(cm.RandomNo(7));Thread.sleep(1000);
		Export.AdaniAMD_AddSBDate3.click();Thread.sleep(1000);
		Export.CurrentDate();Thread.sleep(1000);
		
		Select SelectSBTypeManual3 = new Select(Export.AdaniAMD_AddSBType3);Thread.sleep(500);
		SelectSBTypeManual3.selectByVisibleText("Manual");Thread.sleep(1500);
		
		Export.AdaniAMD_AddSBHAWB3.click();
		Select SelectSBHAWB3= new Select(Export.AdaniAMD_AddSBHAWBDrpodown3);Thread.sleep(500);
		SelectSBHAWB3.selectByVisibleText("H3");Thread.sleep(1500);
		
		Export.AddSB3();Thread.sleep(500);
		Thread.sleep(25000);
		Export.AdaniAMD_AddSBSave.click();Thread.sleep(6000);
		Export.AdaniAMD_AddSBSaveOk.click();Thread.sleep(7000);
		
	}
	
	@Then("User should goto track and trace tab for verify AdaniAMDExport_05 {string}")
	public void User_should_goto_track_and_trace_tab_for_verify_AdaniAMDExport_05(String MAWBNo05) throws InterruptedException 
	{
		Export.AdaniAMD_TrackAndTraceTab.click();Thread.sleep(15000);
		wm.isElementTextMatch(driver, Export.AdaniAMD_TrackAndTraceTabScreen, "Track and Trace at AMD Airport");Thread.sleep(3000);
		Export.AdaniAMD_TrackAndTraceFilterAWB.sendKeys(AdaniAMDExport5);Thread.sleep(2000);
		Export.AdaniAMD_TrackAndTraceOperator.click();Thread.sleep(3000);
		Export.AdaniAMD_FilterContains.click();Thread.sleep(5000);
	
	}
	
	//------------ End @AdaniAMDExport_05 ----------------------
	
	
	@Then("User should create shipment with quick ASI {string} and {string} CTO-Kale_GHA1, Consol, Non-Bonded, Different CHA")
	public void User_should_create_shipment_with_quick_ASI_and_CTO_Kale_GHA1_Consol_Non_Bonded_Different_CHA(String MAWBNo06, String CTO) throws InterruptedException 
	{
		
		   Select SelectCTO = new Select(Export.AdaniAMD_QuickASI_SelectCTODropdown);
		   SelectCTO.selectByVisibleText(CTO);Thread.sleep(500);
		   
		   Export.AdaniAMD_QuickASI_ConsolAWB.click();Thread.sleep(500);
		   
		   Export.AdaniAMD_QuickASI_MAWBPrefix.sendKeys("999");Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_MAWBNumber.sendKeys(AdaniAMDExport6);Thread.sleep(500);
		   System.out.println("AdaniAMDExport_06 AWB No:" +AdaniAMDExport6);
		   Export.QuickASI();Thread.sleep(500);
		   try
		   {
			   Export.AdaniAMD_QuickASI_CarrierCode.sendKeys("ZZ");Thread.sleep(500);
		   }
		   catch (Exception E)
		   {
			   System.out.println("Carrier code available");Thread.sleep(500);
		   }
		   Export.AdaniAMD_QuickASI_FlightNo.sendKeys(cm.RandomNo(4));Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_AssignCHASelect.click();Thread.sleep(500);
		   wm.JavascriptExecutorClick(driver, Export.AdaniAMD_QuickASI_AssignCHAKrishna_Jeena);Thread.sleep(500);
		   
		   Export.AdaniAMD_QuickASI_SaveAWB.click();Thread.sleep(15000);
		   wm.JavascriptExecutorClick(driver,Export.AdaniAMD_QuickASI_MessageAlertOK);Thread.sleep(7000);
	}
	
	@Then("User Should Search MAWB number6 {string} for further process")
	public void User_Should_Search_MAWB_number6_for_further_process(String MAWBNo06) throws InterruptedException 
	{
		Export.AdaniAMD_FilterMAWBNo.sendKeys(AdaniAMDExport6);Thread.sleep(2000);
		Export.AdaniAMD_FilterOperator.click();Thread.sleep(3000);
		Export.AdaniAMD_FilterContains.click();Thread.sleep(5000);
		
	}
	
	//------------------------- @AdaniAMDExport_06 -----------------------------
	
	@Then("User should create shipment with quick ASI {string} and {string} CTO-Kale_GHA1, Consol, Bonded, Same CHA")
	public void User_should_create_shipment_with_quick_ASI_CTO_Kale_GHA1_Consol_Bonded_Same_CHA(String MAWBNo07, String CTO) throws InterruptedException 
	{
		
		   Select SelectCTO = new Select(Export.AdaniAMD_QuickASI_SelectCTODropdown);
		   SelectCTO.selectByVisibleText(CTO);Thread.sleep(500);
		   
		   Export.AdaniAMD_QuickASI_ConsolAWB.click();Thread.sleep(500);
		   
		   Select SelectShipmentType = new Select(Export.AdaniAMD_QuickASI_ShipmentTypeDropdown);
		   SelectShipmentType.selectByVisibleText("Bonded");Thread.sleep(500);
		   
		   Export.AdaniAMD_QuickASI_MAWBPrefix.sendKeys("999");Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_MAWBNumber.sendKeys(AdaniAMDExport7);Thread.sleep(500);
		   System.out.println("AdaniAMDExport_07 AWB No:" +AdaniAMDExport7);
		   Export.QuickASI();Thread.sleep(500);
		   try
		   {
			   Export.AdaniAMD_QuickASI_CarrierCode.sendKeys("ZZ");Thread.sleep(500);
		   }
		   catch (Exception E)
		   {
			   System.out.println("Carrier code available");Thread.sleep(500);
		   }
		   Export.AdaniAMD_QuickASI_FlightNo.sendKeys(cm.RandomNo(4));Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_AssignCHASelect.click();Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_AssignCHAName.click();Thread.sleep(500);
		   
		   Select SelectBondedTrucker = new Select(Export.AdaniAMD_QuickASI_BondedTruckerDropdown);
		   SelectBondedTrucker.selectByVisibleText("Surya_Bonded");Thread.sleep(500);
		   
		   
		   
		   Export.AdaniAMD_QuickASI_SaveAWB.click();Thread.sleep(15000);
		   wm.JavascriptExecutorClick(driver,Export.AdaniAMD_QuickASI_MessageAlertOK);Thread.sleep(7000);
	}
	
	@Then("^User should click on Add HAWB button for adding single house$")
	public void User_should_click_on_Add_HAWB_button_for_adding_single_house() throws InterruptedException 
	{
		 Export.AdaniAMD_QuickASI_AddHAWB.click();Thread.sleep(1000);
		 Export.AddHAWBSingle();
		
		 Export.AdaniAMD_QuickASI_HAWBSave.click();Thread.sleep(18000);
		 Export.AdaniAMD_QuickASI_MessageAlertOK.click();Thread.sleep(6000);	
		 
		
	}
	
	@Then("User Should Search MAWB number7 {string} for further process")
	public void User_Should_Search_MAWB_number7_for_further_process(String MAWBNo07) throws InterruptedException 
	{
		Export.AdaniAMD_FilterMAWBNo.sendKeys(AdaniAMDExport7);Thread.sleep(2000);
		Export.AdaniAMD_FilterOperator.click();Thread.sleep(3000);
		Export.AdaniAMD_FilterContains.click();Thread.sleep(5000);
		
	}
	
	@Then("^User should add Shipping Bill with Multiple SB for Single HAWB for kale GHA1 CTO$")
	public void User_should_add_Shipping_Bill_with_Multiple_SB_for_Single_HAWB_for_kale_GHA1_CTO() throws InterruptedException 
	{
		Thread.sleep(3000);
		Export.AdaniAMD_AddSBMileStone.click();Thread.sleep(500);
		wm.isElementTextMatch(driver, Export.AdaniAMD_AddSBDetailsScreen, "Shipping Bill Details");Thread.sleep(1000);
		
		
		Export.AdaniAMD_AddSBNumber1.sendKeys(cm.RandomNo(7));Thread.sleep(1000);
		Export.AdaniAMD_AddSBDate1.click();Thread.sleep(1000);
		Export.CurrentDate();Thread.sleep(1000);
		
		Select SelectSBTypeManual1 = new Select(Export.AdaniAMD_AddSBType1);Thread.sleep(500);
		SelectSBTypeManual1.selectByVisibleText("Manual");Thread.sleep(1500);
		
		Export.AdaniAMD_AddSBHAWB1.click();Thread.sleep(500);
		Select SelectSBHAWB1= new Select(Export.AdaniAMD_AddSBHAWBDrpodown1);Thread.sleep(500);
		SelectSBHAWB1.selectByVisibleText("H1");Thread.sleep(500);
		
		Export.AddSB();Thread.sleep(500);
		//-----------
		
		Thread.sleep(25000);
		Export.AdaniAMD_AddSBSave.click();Thread.sleep(5000);
		Export.AdaniAMD_AddSBSaveOk.click();Thread.sleep(7000);
		
	}
	//------------------------ End @AdaniAMDExport_07 ----------------------------
	
	
	@Then("User should create shipment with quick ASI {string} and {string} CTO-Kale_GHA1, Consol, Bonded, Different CHA")
	public void User_should_create_shipment_with_quick_ASI_CTO_Kale_GHA1_Consol_Bonded_Different_CHA(String MAWBNo08, String CTO) throws InterruptedException 
	{
		
		   Select SelectCTO = new Select(Export.AdaniAMD_QuickASI_SelectCTODropdown);
		   SelectCTO.selectByVisibleText(CTO);Thread.sleep(500);
		   
		   Export.AdaniAMD_QuickASI_ConsolAWB.click();Thread.sleep(500);
		   
		   Select SelectShipmentType = new Select(Export.AdaniAMD_QuickASI_ShipmentTypeDropdown);
		   SelectShipmentType.selectByVisibleText("Bonded");Thread.sleep(500);
		   
		   Export.AdaniAMD_QuickASI_MAWBPrefix.sendKeys("999");Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_MAWBNumber.sendKeys(AdaniAMDExport8);Thread.sleep(500);
		   System.out.println("AdaniAMDExport_08 AWB No:" +AdaniAMDExport8);
		   Export.QuickASI();Thread.sleep(500);
		   try
		   {
			   Export.AdaniAMD_QuickASI_CarrierCode.sendKeys("ZZ");Thread.sleep(500);
		   }
		   catch (Exception E)
		   {
			   System.out.println("Carrier code available");Thread.sleep(500);
		   }
		   Export.AdaniAMD_QuickASI_FlightNo.sendKeys(cm.RandomNo(4));Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_AssignCHASelect.click();Thread.sleep(500);
		   wm.JavascriptExecutorClick(driver, Export.AdaniAMD_QuickASI_AssignCHASurya);Thread.sleep(500);
		   
		   Select SelectBondedTrucker = new Select(Export.AdaniAMD_QuickASI_BondedTruckerDropdown);
		   SelectBondedTrucker.selectByVisibleText("Surya_Bonded");Thread.sleep(500);
		   
		   
		   
		   Export.AdaniAMD_QuickASI_SaveAWB.click();Thread.sleep(15000);
		   wm.JavascriptExecutorClick(driver,Export.AdaniAMD_QuickASI_MessageAlertOK);Thread.sleep(7000);
	}
	
	
	@Then("User Should Search MAWB number8 {string} for further process")
	public void User_Should_Search_MAWB_number8_for_further_process(String MAWBNo08) throws InterruptedException 
	{
		Export.AdaniAMD_FilterMAWBNo.sendKeys(AdaniAMDExport8);Thread.sleep(2000);
		Export.AdaniAMD_FilterOperator.click();Thread.sleep(3000);
		Export.AdaniAMD_FilterContains.click();Thread.sleep(5000);
		
	}
	
	//---------------------------End @AdaniAMDExport_08 -----------------------------
	
	@Then("User Should create Shipment with quick ASI {string} and {string} CTO-Kale GHA2, Direct, Non-Bonded, Same and Single CHA")
	public void User_Should_create_Shipment_with_quick_ASI_and_CTO_Kale_GHA2_Direct_Non_Bonded_Same_and_Single_CHA(String MAWBNO09, String CTO) throws InterruptedException 
	{
		
		   Select SelectCTO = new Select(Export.AdaniAMD_QuickASI_SelectCTODropdown);
		   SelectCTO.selectByVisibleText(CTO);Thread.sleep(500);
		   
		 
		   Export.AdaniAMD_QuickASI_MAWBPrefix.sendKeys("999");Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_MAWBNumber.sendKeys(AdaniAMDExport9);Thread.sleep(500);
		   System.out.println("AdaniAMDExport_09 AWB No:" +AdaniAMDExport9);
		   Export.QuickASI();Thread.sleep(500);
		   try
		   {
			   Export.AdaniAMD_QuickASI_CarrierCode.sendKeys("ZZ");Thread.sleep(500);
		   }
		   catch (Exception E)
		   {
			   System.out.println("Carrier code available");Thread.sleep(500);
		   }
		   Export.AdaniAMD_QuickASI_FlightNo.sendKeys(cm.RandomNo(4));Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_AssignCHASelect.click();Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_AssignCHAName.click();Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_SaveAWB.click();Thread.sleep(15000);
		   wm.JavascriptExecutorClick(driver,Export.AdaniAMD_QuickASI_MessageAlertOK);Thread.sleep(7000);
	}
	@Given("User Should Search MAWB number09 {string} for further process")
	public void User_Should_Search_MAWB_number09_for_further_process(String MAWBNO09) throws InterruptedException 
	{
		Export.AdaniAMD_FilterMAWBNo.sendKeys(AdaniAMDExport9);Thread.sleep(2000);
		Export.AdaniAMD_FilterOperator.click();Thread.sleep(3000);
		Export.AdaniAMD_FilterContains.click();Thread.sleep(5000);
		
	}
	
	@Then("^User Should Edit Airway Bill Details using Action Milestone$")
	public void User_Should_Edit_Airway_Bill_Details_using_Action_Milestone() throws InterruptedException 
	{
		Export.AdaniAMD_ActionMilestoneEditButton.click();Thread.sleep(1500);
		Export.AdaniAMD_QuickASI_FlightNo.clear();Thread.sleep(500);
		Export.AdaniAMD_QuickASI_FlightNo.sendKeys(cm.RandomNo(4));Thread.sleep(500);
		Export.AdaniAMD_QuickASI_SaveAWB.click();Thread.sleep(15000);
		  wm.JavascriptExecutorClick(driver,Export.AdaniAMD_QuickASI_MessageAlertOK);Thread.sleep(7000);
	}
	
	@Then("^User Should Copy Airway Bill Details using Action Milestone$")
	public void User_Should_Copy_Airway_Bill_Details_using_Action_Milestone() throws InterruptedException 
	{
		Export.AdaniAMD_ActionMilestoneCopyButton.click();Thread.sleep(1500);
		Export.AdaniAMD_ActionMilestoneCopyYesButton.click();Thread.sleep(1500);
		Export.AdaniAMD_ActionMilestoneBackButton.click();Thread.sleep(1500);
	}
	
	@Then("^User Should Delete Airway Bill Details using Action Milestone$")
	public void User_Should_Delete_Airway_Bill_Details_using_Action_Milestone() throws InterruptedException 
	{
		Export.AdaniAMD_ActionMilestoneDeleteButton.click();Thread.sleep(4000);
		wm.JavascriptExecutorClick(driver, Export.AdaniAMD_ActionMilestoneDeleteYesButton);Thread.sleep(5000);
		wm.JavascriptExecutorClick(driver, Export.AdaniAMD_ActionMilestoneDeleteOkButton);Thread.sleep(5000);
		//Export.AdaniAMD_ActionMilestoneDeleteOkButton.click();Thread.sleep(5000);
	}
	
	@Then("^User should cancel generated Token$")
	public void User_should_cancel_generated_Token() throws InterruptedException 
	{
		Export.AdaniAMD_VechicleTokenMileStone.click();Thread.sleep(2000);
		Export.CancelToken();
	
	}
	
	@Then("^User should process vechicle token using TSP milestone with Add Shipment Function$")
	public void User_should_process_vechicle_token_using_TSP_milestone_with_Add_Shipment_Function() throws InterruptedException 
	{
		Thread.sleep(2000);
		Export.AdaniAMD_TSPCompletedMileStone.click();Thread.sleep(4000);
		Export.AdaniAMD_TSPMileStone.click();Thread.sleep(000);
		wm.isElementTextMatch(driver, Export.AdaniAMD_TSPPaymentScreen, "TSP Payment");Thread.sleep(1000);
		Export.AddShipment();Thread.sleep(2000);
		Export.GenerateToken();Thread.sleep(2000);
	
	}
	
	@Then("^User should verify dimenssion action button$")
	public void User_should_verify_dimenssion_action_button() throws InterruptedException 
	{
		Export.AdaniAMD_AddSBMilestone.click();
		Export.AdaniAMD_AddSBAddRow1.click();
		Export.AdaniAMD_AddSBDimenssionIcon2.click();Thread.sleep(2000);
		Export.AddDimension1Repeat();
		Export.AdaniAMD_DimensionAddRow.click();Thread.sleep(2000);
		Export.AdaniAMD_DimensionDeleteRow.click();Thread.sleep(2000);
		Export.AdaniAMD_DimensionCancel.click();Thread.sleep(2000);
		Export.AdaniAMD_SBScreenBackButton.click();Thread.sleep(2000);
	}
	
	
	
	@Then("User should goto track and trace tab for verify AdaniAMDExport_09 {string}")
	public void User_should_goto_track_and_trace_tab_for_verify_AdaniAMDExport_09(String MAWBNO09) throws InterruptedException 
	{
		Export.AdaniAMD_TrackAndTraceTab.click();Thread.sleep(15000);
		 wm.isElementTextMatch(driver, Export.AdaniAMD_TrackAndTraceTabScreen, "Track and Trace at AMD Airport");Thread.sleep(1000);
		Export.AdaniAMD_TrackAndTraceFilterAWB.sendKeys(AdaniAMDExport9);Thread.sleep(2000);
		Export.AdaniAMD_TrackAndTraceOperator.click();Thread.sleep(3000);
		Export.AdaniAMD_FilterContains.click();Thread.sleep(5000);
	
	}
	
	
	// ---------------------------- -End @AdaniAMDExport_09 -------------------------------
	
	@Then("User Should create Shipment with quick ASI {string} and {string} CTO-Kale GHA2, Direct, Non-Bonded, Different and Single  CHA")
	public void User_Should_create_Shipment_with_quick_ASI_CTO_Kale_GHA2_Direct_Non_Bonded_Different_and_Single_CHA(String MAWBNO10, String CTO) throws InterruptedException 
	{
		
		   Select SelectCTO = new Select(Export.AdaniAMD_QuickASI_SelectCTODropdown);
		   SelectCTO.selectByVisibleText(CTO);Thread.sleep(500);
		   
		 
		   Export.AdaniAMD_QuickASI_MAWBPrefix.sendKeys("999");Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_MAWBNumber.sendKeys(AdaniAMDExport10);Thread.sleep(500);
		   System.out.println("AdaniAMDExport_10 AWB No:" +AdaniAMDExport10);
		   Export.QuickASI();Thread.sleep(500);
		   try
		   {
			   Export.AdaniAMD_QuickASI_CarrierCode.sendKeys("ZZ");Thread.sleep(500);
		   }
		   catch (Exception E)
		   {
			   System.out.println("Carrier code available");Thread.sleep(500);
		   }
		   Export.AdaniAMD_QuickASI_FlightNo.sendKeys(cm.RandomNo(4));Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_AssignCHASelect.click();Thread.sleep(500);
		   wm.JavascriptExecutorClick(driver, Export.AdaniAMD_QuickASI_AssignCHAKrishna_Jeena);
		   Export.AdaniAMD_QuickASI_SaveAWB.click();Thread.sleep(15000);
		   wm.JavascriptExecutorClick(driver,Export.AdaniAMD_QuickASI_MessageAlertOK);Thread.sleep(7000);
	}
	@Given("User Should Search MAWB number10 {string} for further process")
	public void User_Should_Search_MAWB_number10_for_further_process(String AdaniAMDExport_10) throws InterruptedException 
	{
		Export.AdaniAMD_FilterMAWBNo.sendKeys(AdaniAMDExport10);Thread.sleep(2000);
		Export.AdaniAMD_FilterOperator.click();Thread.sleep(3000);
		Export.AdaniAMD_FilterContains.click();Thread.sleep(5000);
		
	}
	
	@Then("^User should process TSP Payment with Vechicle token for kale GHA2 CTO in CB login$")
	public void User_should_process_TSP_Payment_with_Vechicle_token_for_kale_GHA2_CTO_in_CB_login() throws InterruptedException 
	{
		Thread.sleep(12000);
		Export.AdaniAMD_TSPMileStone.click();Thread.sleep(2000);
		try
		{
			Export.AdaniAMD_TSPPaymentMethodProceed.click();Thread.sleep(5000);
		}
		catch (Exception E)
		{
			System.out.println("Method proceed pop up not showing");
		}
		
		try
		{
			Export.AdaniAMD_TSPPaymentMethodProceed1.click();Thread.sleep(5000);
		}
		catch (Exception E)
		{
			System.out.println("Method proceed pop up not showing");
		}
		
		
		try
		{
			Export.AdaniAMD_TSPMileStone.click();Thread.sleep(2000);
		}
		catch (Exception E)
		{
			System.out.println("Done");
		}
		
		try
		{
			Export.AdaniAMD_TSPPaymentMethodProceed.click();Thread.sleep(5000);
		}
		catch (Exception E)
		{
			System.out.println("Method proceed pop up not showing");
		}
		
		try
		{
			Export.AdaniAMD_TSPPaymentMethodProceed1.click();Thread.sleep(5000);
		}
		catch (Exception E)
		{
			System.out.println("Method proceed pop up not showing");
		}
		
		wm.isElementTextMatch(driver, Export.AdaniAMD_TSPPaymentScreen, "TSP Payment");Thread.sleep(1000);
		Export.TSPPayment();Thread.sleep(5000);
		try
		{
			Export.AdaniAMD_TSPPayNowButton1.click();Thread.sleep(7000);
		}
		catch (Exception E)
		{
			Export.AdaniAMD_TSPPayNowButton.click();Thread.sleep(7000);
		}
		
		Export.AdaniAMD_TSPPayNowOKButton.click();Thread.sleep(12000);
		wm.JavascriptExecutorClick(driver, Export.AdaniAMD_TSPPayNowNoButton);Thread.sleep(8000);
		Export.AdaniAMD_TSPMileStone.click();Thread.sleep(4000);
		Export.GenerateToken();Thread.sleep(6000);
	
	}
	
	
	@Then("User should goto track and trace tab for verify AdaniAMDExport_10 {string}")
	public void User_should_goto_track_and_trace_tab_for_verify_AdaniAMDExport_10(String MAWBNO10) throws InterruptedException 
	{
		Export.AdaniAMD_TrackAndTraceTab.click();Thread.sleep(15000);
		 wm.isElementTextMatch(driver, Export.AdaniAMD_TrackAndTraceTabScreen, "Track and Trace at AMD Airport");Thread.sleep(1000);
		Export.AdaniAMD_TrackAndTraceFilterAWB.sendKeys(AdaniAMDExport10);Thread.sleep(2000);
		Export.AdaniAMD_TrackAndTraceOperator.click();Thread.sleep(3000);
		Export.AdaniAMD_FilterContains.click();Thread.sleep(5000);
	
	}
	
	//----------------------- End @AdaniAMDExport_10 ---------------------
	
	@Then("User Should create Shipment with quick ASI {string} and {string} CTO-Kale GHA2, Direct, Non-Bonded, Multiple CHA")
	public void User_Should_create_Shipment_with_quick_ASI_and_CTO_Kale_GHA2_Direct_Non_Bonded_Multiple_CHA(String MAWBNO11, String CTO) throws InterruptedException 
	{
		
		   Select SelectCTO = new Select(Export.AdaniAMD_QuickASI_SelectCTODropdown);
		   SelectCTO.selectByVisibleText(CTO);Thread.sleep(500);
		   
		 
		   Export.AdaniAMD_QuickASI_MAWBPrefix.sendKeys("999");Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_MAWBNumber.sendKeys(AdaniAMDExport11);Thread.sleep(500);
		   System.out.println("AdaniAMDExport_11 AWB No:" +AdaniAMDExport11);
		   Export.QuickASI();Thread.sleep(500);
		   try
		   {
			   Export.AdaniAMD_QuickASI_CarrierCode.sendKeys("ZZ");Thread.sleep(500);
		   }
		   catch (Exception E)
		   {
			   System.out.println("Carrier code available");Thread.sleep(500);
		   }
		   Export.AdaniAMD_QuickASI_FlightNo.sendKeys(cm.RandomNo(4));Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_AssignCHASelect.click();Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_AssignCHAName.click();Thread.sleep(500);
		   wm.JavascriptExecutorClick(driver, Export.AdaniAMD_QuickASI_AssignCHAKrishna_Jeena);Thread.sleep(1000);
		   Export.AdaniAMD_QuickASI_SaveAWB.click();Thread.sleep(15000);
		   wm.JavascriptExecutorClick(driver,Export.AdaniAMD_QuickASI_MessageAlertOK);Thread.sleep(7000);
	}
	@Given("User Should Search MAWB number11 {string} for further process")
	public void User_Should_Search_MAWB_number11_for_further_process(String MAWBNO11) throws InterruptedException 
	{
		Export.AdaniAMD_FilterMAWBNo.sendKeys(AdaniAMDExport11);Thread.sleep(2000);
		Export.AdaniAMD_FilterOperator.click();Thread.sleep(3000);
		Export.AdaniAMD_FilterContains.click();Thread.sleep(5000);
		
	}
	
	@Then("^User should process ASI submission for kale GHA2 CTO$")
	public void User_should_process_ASI_submission_for_kale_GHA2_CTO() throws InterruptedException 
	{
		Thread.sleep(5000);
		 Export.AdaniAMD_ASIMileStone.click();Thread.sleep(7000);
		 wm.isElementTextMatch(driver, Export.AdaniAMD_ASISubmissionScreen, "ASI Submission");Thread.sleep(6000);
		 Export.AdaniAMD_ASIProceedButton.click();Thread.sleep(10000);
		 Export.AdaniAMD_ASIProceedButtonYes.click();Thread.sleep(20000);
		 
		 try
		 {
			 wm.JavascriptExecutorClick(driver, Export.AdaniAMD_ASIProceedButtonOk);Thread.sleep(9000);
		 }
		 catch (Exception E)
		 {
			 System.out.println("done");
		 }
		 Thread.sleep(5000);
	}
	
	@Then("^User should add Shipping Bill with single SB and dimenssion for kale GHA2 CTO$")
	public void User_should_add_Shipping_Bill_with_single_SB_and_dimenssion_for_kale_GHA2_CTO() throws InterruptedException 
	{
		Thread.sleep(5000);
		Export.AdaniAMD_AddSBMileStone.click();Thread.sleep(500);
		wm.isElementTextMatch(driver, Export.AdaniAMD_AddSBDetailsScreen, "Shipping Bill Details");Thread.sleep(1000);
		
		
		Export.AdaniAMD_AddSBNumber1.sendKeys(cm.RandomNo(7));Thread.sleep(1000);
		Export.AdaniAMD_AddSBDate1.click();Thread.sleep(1000);
		Export.CurrentDate();Thread.sleep(1000);
		
		Select SelectSBTypeManual1 = new Select(Export.AdaniAMD_AddSBType1);Thread.sleep(500);
		SelectSBTypeManual1.selectByVisibleText("Manual");Thread.sleep(1500);
		
		Export.AdaniAMD_AddSBNOP1.sendKeys("30");Thread.sleep(1000);
		Export.AdaniAMD_AddSBNOP1.clear();Thread.sleep(1000);
		Export.AdaniAMD_AddSBNOP1.sendKeys("30");Thread.sleep(1000);
		
		Export.AdaniAMD_AddSBGrossWt1.sendKeys("300");Thread.sleep(500);
		Export.AdaniAMD_AddSBGrossWt1.clear();Thread.sleep(1000);
		Export.AdaniAMD_AddSBGrossWt1.sendKeys("300");Thread.sleep(500);
		Export.AdaniAMD_AddSBDimenssionIcon1.click();Thread.sleep(500);
		Export.AdaniAMD_AddSBDimNOP1.sendKeys("30");Thread.sleep(500);
		Export.AddDimension1();Thread.sleep(500);
		Export.AddSB();Thread.sleep(1500);
		Thread.sleep(25000);
		Export.AdaniAMD_AddSBSave.click();Thread.sleep(8000);
		wm.JavascriptExecutorClick(driver, Export.AdaniAMD_AddSBSaveOk);Thread.sleep(7000);
		
	}
	
	@Then("^User should process TSP Payment with Vechicle token for kale GHA2 CTO$")
	public void User_should_process_TSP_Payment_with_Vechicle_token_for_kale_GHA2_CTO() throws InterruptedException 
	{
		Export.AdaniAMD_TSPMileStone.click();Thread.sleep(2000);
		try
		{
			Export.AdaniAMD_TSPPaymentMethodProceed.click();Thread.sleep(5000);
		}
		catch (Exception E)
		{
			System.out.println("Method proceed pop up not showing");
		}
		
		try
		{
			Export.AdaniAMD_TSPPaymentMethodProceed1.click();Thread.sleep(5000);
		}
		catch (Exception E)
		{
			System.out.println("Method proceed pop up not showing");
		}
		
		try
		{
			Export.AdaniAMD_TSPMileStone.click();Thread.sleep(5000);
		}
		catch(Exception E)
		{
			System.out.println("TSP milestone not available");
		}
		//Export.AdaniAMD_TSPPaymentMethodProceed.click();Thread.sleep(1000);
		wm.isElementTextMatch(driver, Export.AdaniAMD_TSPPaymentScreen, "TSP Payment");Thread.sleep(1000);
		Export.TSPPaymentwithVechicleTokenKaleGHA2();Thread.sleep(3000);
		Export.AdaniAMD_TSPPayNowButton1.click();Thread.sleep(4000);
		Export.AdaniAMD_TSPPayNowOKButtonbulk.click();Thread.sleep(8000);
		Export.AdaniAMD_TSPPayNowNoButton.click();Thread.sleep(10000);
		
		Export.AdaniAMD_TSPMileStone.click();Thread.sleep(5000);
		Export.GenerateToken();Thread.sleep(7000);
	
	}
	
	@Then("^User should process TSP Payment with Vechicle token for kale GHA2 CTO for Multiple vechicle single shipment$")
	public void User_should_process_TSP_Payment_with_Vechicle_token_for_kale_GHA2_CTO_for_Multiple_vechicle_single_shipment() throws InterruptedException 
	{
		Export.AdaniAMD_TSPMileStone.click();Thread.sleep(2000);
		//Export.AdaniAMD_TSPPaymentMethodProceed.click();Thread.sleep(1000);
		wm.isElementTextMatch(driver, Export.AdaniAMD_TSPPaymentScreen, "TSP Payment");Thread.sleep(1000);
		Export.TSPPaymentwithVechicleTokenKaleGHA2();Thread.sleep(3000);
		Export.AdaniAMD_TSPPayNowButton1.click();Thread.sleep(8000);
		Export.AdaniAMD_TSPPayNowOKButtonbulk.click();Thread.sleep(12000);
		wm.JavascriptExecutorClick(driver, Export.AdaniAMD_TSPPayNowNoButton);Thread.sleep(10000);
		Export.AdaniAMD_TSPMileStone.click();Thread.sleep(3000);
		Export.AddShipment();Thread.sleep(3000);
		Export.AdaniAMD_DeleteShipmentButton.click();Thread.sleep(3000);
		Export.AdaniAMD_DeleteShipmentPopup.click();Thread.sleep(3000);
		Export.GenerateTokenEdit1();Thread.sleep(5000);
		
		
		//This will scroll the page till the element is found  
		  JavascriptExecutor js1 = (JavascriptExecutor) driver;
	       js1.executeScript("arguments[0].scrollIntoView();",Export.AdaniAMD_GenerateTokenButton);Thread.sleep(1000);
		wm.JavascriptExecutorClick(driver, Export.AdaniAMD_AddSBAddRow1);
		
		
		Export.GenerateTokenEdit2();Thread.sleep(5000);
		
       
		wm.JavascriptExecutorClick(driver, Export.AdaniAMD_GenerateTokenButton);Thread.sleep(4000);
		wm.JavascriptExecutorClick(driver, Export.AdaniAMD_GenerateTokenButtonOk);Thread.sleep(6000);
	
	}
	
	@Then("User should goto track and trace tab for verify AdaniAMDExport_11 {string}")
	public void User_should_goto_track_and_trace_tab_for_verify_AdaniAMDExport_11(String MAWBNO11) throws InterruptedException 
	{
		Export.AdaniAMD_TrackAndTraceTab.click();Thread.sleep(15000);
		 wm.isElementTextMatch(driver, Export.AdaniAMD_TrackAndTraceTabScreen, "Track and Trace at AMD Airport");Thread.sleep(1000);
		Export.AdaniAMD_TrackAndTraceFilterAWB.sendKeys(AdaniAMDExport11);Thread.sleep(2000);
		Export.AdaniAMD_TrackAndTraceOperator.click();Thread.sleep(3000);
		Export.AdaniAMD_FilterContains.click();Thread.sleep(5000);
	
	}
	//--------------------------- End @AdaniAMDExport_11 ----------------------------
	
	@Then("User Should create Shipment with quick ASI {string} and {string} CTO-Kale GHA2, Direct, Bonded, Same and Single CHA")
	public void User_Should_create_Shipment_with_quick_ASI_and_CTO_Kale_GHA2_Direct_Bonded_Same_and_Single_CHA(String MAWBNO12, String CTO) throws InterruptedException 
	{
		
		   Select SelectCTO = new Select(Export.AdaniAMD_QuickASI_SelectCTODropdown);
		   SelectCTO.selectByVisibleText(CTO);Thread.sleep(500);
		   
		   Select SelectShipmentType = new Select(Export.AdaniAMD_QuickASI_ShipmentTypeDropdown);
		   SelectShipmentType.selectByVisibleText("Bonded");Thread.sleep(500);
		 
		   Export.AdaniAMD_QuickASI_MAWBPrefix.sendKeys("999");Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_MAWBNumber.sendKeys(AdaniAMDExport12);Thread.sleep(500);
		   System.out.println("AdaniAMDExport_12 AWB No:" +AdaniAMDExport12);
		   Export.QuickASI();Thread.sleep(500);
		   try
		   {
			   Export.AdaniAMD_QuickASI_CarrierCode.sendKeys("ZZ");Thread.sleep(500);
		   }
		   catch (Exception E)
		   {
			   System.out.println("Carrier code available");Thread.sleep(500);
		   }
		   Export.AdaniAMD_QuickASI_FlightNo.sendKeys(cm.RandomNo(4));Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_AssignCHASelect.click();Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_AssignCHAName.click();Thread.sleep(500);
		   
		   Select SelectBondedTrucker = new Select(Export.AdaniAMD_QuickASI_BondedTruckerDropdown);
		   SelectBondedTrucker.selectByVisibleText("Surya_Bonded");Thread.sleep(500);
		   
		   Export.AdaniAMD_QuickASI_SaveAWB.click();Thread.sleep(15000);
		   wm.JavascriptExecutorClick(driver,Export.AdaniAMD_QuickASI_MessageAlertOK);Thread.sleep(7000);
	}
	@Given("User Should Search MAWB number12 {string} for further process")
	public void User_Should_Search_MAWB_number12_for_further_process(String MAWBNO12) throws InterruptedException 
	{
		Export.AdaniAMD_FilterMAWBNo.sendKeys(AdaniAMDExport12);Thread.sleep(2000);
		Export.AdaniAMD_FilterOperator.click();Thread.sleep(3000);
		Export.AdaniAMD_FilterContains.click();Thread.sleep(5000);
		
	}
	
	@Then("^User should process TSP Payment without Vechicle token for kale GHA2 CTO$")
	public void User_should_process_TSP_Payment_without_Vechicle_token_for_kale_GHA2_CTO() throws InterruptedException 
	{
		Export.AdaniAMD_TSPMileStone.click();Thread.sleep(2000);
		//Export.AdaniAMD_TSPMileStone.click();Thread.sleep(2000);
		//wm.isElementTextMatch(driver, Export.AdaniAMD_TSPPaymentScreen, "TSP Payment");Thread.sleep(1000);
		Export.TSPPaymentwithVechicleTokenKaleGHA2();Thread.sleep(1000);
		Export.AdaniAMD_TSPPayNowButton1.click();Thread.sleep(5000);
		Export.AdaniAMD_TSPPayNowOKButtonbulk.click();Thread.sleep(10000);
		wm.JavascriptExecutorClick(driver, Export.AdaniAMD_TSPPayNowNoButton);Thread.sleep(5000);
		Export.AdaniAMD_TSPBackButton.click();Thread.sleep(4000);
	
	}
	
	@Then("^User should process vechicle token using TSP milestone$")
	public void User_should_process_vechicle_token_using_TSP_milestone() throws InterruptedException 
	{
		Thread.sleep(2000);
		Export.AdaniAMD_TSPCompletedMileStone.click();Thread.sleep(4000);
		Export.AdaniAMD_TSPMileStone.click();Thread.sleep(000);
		wm.isElementTextMatch(driver, Export.AdaniAMD_TSPPaymentScreen, "TSP Payment");Thread.sleep(1000);
		Export.GenerateToken();Thread.sleep(2000);
	
	}
	
	@Then("^User should process vechicle token using TSP milestone for multiple shipment single vechicle$")
	public void User_should_process_vechicle_token_using_TSP_milestone_for_multiple_shipment_single_vechicle() throws InterruptedException 
	{
		Thread.sleep(2000);
		Export.AdaniAMD_TSPCompletedMileStone.click();Thread.sleep(4000);
		Export.AdaniAMD_TSPMileStone.click();Thread.sleep(000);
		wm.isElementTextMatch(driver, Export.AdaniAMD_TSPPaymentScreen, "TSP Payment");Thread.sleep(1000);
		Export.AddShipment();Thread.sleep(2000);
		Export.GenerateToken();Thread.sleep(2000);
	
	}
	
	@Then("User should goto track and trace tab for verify AdaniAMDExport_12 {string}")
	public void User_should_goto_track_and_trace_tab_for_verify_AdaniAMDExport_12(String MAWBNO12) throws InterruptedException 
	{
		Export.AdaniAMD_TrackAndTraceTab.click();Thread.sleep(15000);
		 wm.isElementTextMatch(driver, Export.AdaniAMD_TrackAndTraceTabScreen, "Track and Trace at AMD Airport");Thread.sleep(1000);
		Export.AdaniAMD_TrackAndTraceFilterAWB.sendKeys(AdaniAMDExport12);Thread.sleep(2000);
		Export.AdaniAMD_TrackAndTraceOperator.click();Thread.sleep(3000);
		Export.AdaniAMD_FilterContains.click();Thread.sleep(5000);
	
	}
	 //----------------------------- End @AdaniAMDExport_12 ---------------------
	
	@Then("User Should create Shipment with quick ASI {string} and {string} CTO-Kale GHA2, Direct, Bonded, Different and Single CHA")
	public void User_Should_create_Shipment_with_quick_ASI_and_CTO_Kale_GHA2_Direct_Bonded_Different_and_Single_CHA(String MAWBNO13, String CTO) throws InterruptedException 
	{
		
		   Select SelectCTO = new Select(Export.AdaniAMD_QuickASI_SelectCTODropdown);
		   SelectCTO.selectByVisibleText(CTO);Thread.sleep(500);
		   
		   Select SelectShipmentType = new Select(Export.AdaniAMD_QuickASI_ShipmentTypeDropdown);
		   SelectShipmentType.selectByVisibleText("Bonded");Thread.sleep(500);
		 
		   Export.AdaniAMD_QuickASI_MAWBPrefix.sendKeys("999");Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_MAWBNumber.sendKeys(AdaniAMDExport13);Thread.sleep(500);
		   System.out.println("AdaniAMDExport_13 AWB No:" +AdaniAMDExport13);
		   Export.QuickASI();Thread.sleep(500);
		   try
		   {
			   Export.AdaniAMD_QuickASI_CarrierCode.sendKeys("ZZ");Thread.sleep(500);
		   }
		   catch (Exception E)
		   {
			   System.out.println("Carrier code available");Thread.sleep(500);
		   }
		   Export.AdaniAMD_QuickASI_FlightNo.sendKeys(cm.RandomNo(4));Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_AssignCHASelect.click();Thread.sleep(500);
		   
		   wm.JavascriptExecutorClick(driver, Export.AdaniAMD_QuickASI_AssignCHASurya);Thread.sleep(1000);
		   
		   Select SelectBondedTrucker = new Select(Export.AdaniAMD_QuickASI_BondedTruckerDropdown);
		   SelectBondedTrucker.selectByVisibleText("Surya_Bonded");Thread.sleep(500);
		   
		   Export.AdaniAMD_QuickASI_SaveAWB.click();Thread.sleep(15000);
		   wm.JavascriptExecutorClick(driver,Export.AdaniAMD_QuickASI_MessageAlertOK);Thread.sleep(7000);
	}
	
	@Then("User Should Search MAWB number13 {string} for further process")
	public void User_Should_Search_MAWB_number13_for_further_process(String MAWBNO13) throws InterruptedException 
	{
		Export.AdaniAMD_FilterMAWBNo.sendKeys(AdaniAMDExport13);Thread.sleep(2000);
		Export.AdaniAMD_FilterOperator.click();Thread.sleep(3000);
		Export.AdaniAMD_FilterContains.click();Thread.sleep(5000);
		
	}
	
	@Then("^User should process TSP Payment without generate Vechicle token for kale GHA2 CTO$")
	public void User_should_process_TSP_Payment_without_generate_Vechicle_token_for_kale_GHA2_CTO() throws InterruptedException 
	{
		Export.AdaniAMD_TSPMileStone.click();Thread.sleep(2000);
		Export.AdaniAMD_TSPMileStone.click();Thread.sleep(2000);
		
		try
		{
			Export.AdaniAMD_TSPPaymentMethodProceed.click();Thread.sleep(5000);
		}
		catch (Exception E)
		{
			System.out.println("Method proceed pop up not showing");
		}
		
		try
		{
			Export.AdaniAMD_TSPPaymentMethodProceed1.click();Thread.sleep(5000);
		}
		catch (Exception E)
		{
			System.out.println("Method proceed pop up not showing");
		}
		
		
		wm.isElementTextMatch(driver, Export.AdaniAMD_TSPPaymentScreen, "TSP Payment");Thread.sleep(1000);
		Export.TSPPayment();
		try
		{
			Export.AdaniAMD_TSPPayNowButton.click();Thread.sleep(4000);
		}
		catch (Exception E)
		{
			Export.AdaniAMD_TSPPayNowButton1.click();Thread.sleep(4000);
		}
		
		Export.AdaniAMD_TSPPayNowOKButton.click();Thread.sleep(8000);
		wm.JavascriptExecutorClick(driver, Export.AdaniAMD_TSPPayNowNoButton);Thread.sleep(7000);
		Export.AdaniAMD_TSPBackButton.click();Thread.sleep(5000);
	
	}
	
	//--------------------- End @AdaniAMDExport_13 ----------------
	
	@Then("User Should create Shipment with quick ASI {string} and {string} CTO-Kale GHA2, Direct, Bonded, Multiple CHA")
	public void User_Should_create_Shipment_with_quick_ASI_CTO_Kale_GHA2_Direct_Bonded_Multiple_CHA(String MAWBNO14, String CTO) throws InterruptedException 
	{
		
		   Select SelectCTO = new Select(Export.AdaniAMD_QuickASI_SelectCTODropdown);
		   SelectCTO.selectByVisibleText(CTO);Thread.sleep(500);
		   
		   Select SelectShipmentType = new Select(Export.AdaniAMD_QuickASI_ShipmentTypeDropdown);
		   SelectShipmentType.selectByVisibleText("Bonded");Thread.sleep(500);
		 
		   Export.AdaniAMD_QuickASI_MAWBPrefix.sendKeys("999");Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_MAWBNumber.sendKeys(AdaniAMDExport14);Thread.sleep(500);
		   System.out.println("AdaniAMDExport_14 AWB No:" +AdaniAMDExport14);
		   Export.QuickASI();Thread.sleep(500);
		   try
		   {
			   Export.AdaniAMD_QuickASI_CarrierCode.sendKeys("ZZ");Thread.sleep(500);
		   }
		   catch (Exception E)
		   {
			   System.out.println("Carrier code available");Thread.sleep(500);
		   }
		   Export.AdaniAMD_QuickASI_FlightNo.sendKeys(cm.RandomNo(4));Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_AssignCHASelect.click();Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_AssignCHAName.click();Thread.sleep(500);
		   wm.JavascriptExecutorClick(driver, Export.AdaniAMD_QuickASI_AssignCHASurya);Thread.sleep(1000);		   

		   Select SelectBondedTrucker = new Select(Export.AdaniAMD_QuickASI_BondedTruckerDropdown);
		   SelectBondedTrucker.selectByVisibleText("Surya_Bonded");Thread.sleep(500);
		   
		   Export.AdaniAMD_QuickASI_SaveAWB.click();Thread.sleep(15000);
		   wm.JavascriptExecutorClick(driver,Export.AdaniAMD_QuickASI_MessageAlertOK);Thread.sleep(7000);
	}
	
	@Then("User Should Search MAWB number14 {string} for further process")
	public void User_Should_Search_MAWB_number14_for_further_process(String MAWBNO14) throws InterruptedException 
	{
		Export.AdaniAMD_FilterMAWBNo.sendKeys(AdaniAMDExport14);Thread.sleep(2000);
		Export.AdaniAMD_FilterOperator.click();Thread.sleep(3000);
		Export.AdaniAMD_FilterContains.click();Thread.sleep(5000);
		
	}
	
	@Then("^User should add Shipping Bill with multiple SB and dimenssion for kale GHA2 CTO$")
	public void User_should_add_Shipping_Bill_with_multiple_SB_and_dimenssion_for_kale_GHA2_CTO() throws InterruptedException 
	{
		Export.AdaniAMD_AddSBMileStone.click();Thread.sleep(500);
		wm.isElementTextMatch(driver, Export.AdaniAMD_AddSBDetailsScreen, "Shipping Bill Details");Thread.sleep(1000);
		
		
		Export.AdaniAMD_AddSBNumber1.sendKeys(cm.RandomNo(7));Thread.sleep(1000);
		Export.AdaniAMD_AddSBDate1.click();Thread.sleep(1000);
		Export.CurrentDate();Thread.sleep(1000);
		
		Select SelectSBTypeManual1 = new Select(Export.AdaniAMD_AddSBType1);Thread.sleep(500);
		SelectSBTypeManual1.selectByVisibleText("Manual");Thread.sleep(1500);
		
		Export.AdaniAMD_AddSBNOP1.sendKeys("15");Thread.sleep(500);
		Export.AdaniAMD_AddSBGrossWt1.sendKeys("150");Thread.sleep(500);
		Export.AdaniAMD_AddSBDimenssionIcon1.click();Thread.sleep(500);
		Export.AdaniAMD_AddSBDimNOP1.sendKeys("15");Thread.sleep(500);
		Export.AddDimension1();Thread.sleep(500);
		
		Export.AddSB();Thread.sleep(500);
		
		Export.AdaniAMD_AddSBAddRow1.click();Thread.sleep(500);
		
		Export.AdaniAMD_AddSBNumber2.sendKeys(cm.RandomNo(7));Thread.sleep(1000);
		Export.AdaniAMD_AddSBDate2.click();Thread.sleep(1000);
		Export.CurrentDate();Thread.sleep(1000);
		
		Select SelectSBTypeManual2 = new Select(Export.AdaniAMD_AddSBType2);Thread.sleep(500);
		SelectSBTypeManual2.selectByVisibleText("Manual");Thread.sleep(1500);
		
		Export.AdaniAMD_AddSBNOP2.sendKeys("15");Thread.sleep(500);
		Export.AdaniAMD_AddSBGrossWt2.sendKeys("150");Thread.sleep(500);
		Export.AdaniAMD_AddSBDimenssionIcon2.click();Thread.sleep(500);
		Export.AdaniAMD_AddSBDimNOP1.sendKeys("15");Thread.sleep(500);
		Export.AddDimension1();Thread.sleep(500);
		Export.AddSB2();Thread.sleep(1500);		
		Thread.sleep(25000);
		Export.AdaniAMD_AddSBSave.click();Thread.sleep(9000);
		wm.JavascriptExecutorClick(driver, Export.AdaniAMD_AddSBSaveOk);Thread.sleep(8000);
		
	}
	@Then("^User should process TSP Payment with Vechicle token for first SB for kale GHA2 CTO$")
	public void User_should_process_TSP_Payment_with_Vechicle_token_for_first_SB_for_kale_GHA2_CTO() throws InterruptedException 
	{
		Export.AdaniAMD_TSPMileStone.click();Thread.sleep(2000);
		wm.isElementTextMatch(driver, Export.AdaniAMD_TSPPaymentScreen, "TSP Payment");Thread.sleep(1000);
		Export.TSPPaymentwithVechicleTokenKaleGHA2();Thread.sleep(1000);
		try
		{
			Export.AdaniAMD_TSPPayNowButton.click();Thread.sleep(4000);
		}
		catch (Exception E)
		{
			Export.AdaniAMD_TSPPayNowButton1.click();Thread.sleep(4000);
		}
		Export.AdaniAMD_TSPPayNowOKButtonbulk.click();Thread.sleep(8000);
		wm.JavascriptExecutorClick(driver, Export.AdaniAMD_TSPPayNowNoButton);Thread.sleep(7000);
		
		Export.AdaniAMD_TSPMileStone.click();Thread.sleep(500);
		Export.GenerateToken();Thread.sleep(2000);
	
	}
	
	@Then("^User should process TSP Payment with Vechicle token for second SB for kale GHA2 CTO$")
	public void User_should_process_TSP_Payment_with_Vechicle_token_for_second_SB_for_kale_GHA2_CTO() throws InterruptedException 
	{
		Export.AdaniAMD_VechicleTokenMileStone.click();Thread.sleep(2000);
		Export.AdaniAMD_TSPMileStone.click();Thread.sleep(2000);
		try
		{
			Export.AdaniAMD_TSPPaymentMethodProceed.click();Thread.sleep(1000);
		}
		catch (Exception E)
		{
			System.out.println("Method proceed pop up not showing");
		}
		
		try
		{
			Export.AdaniAMD_TSPPaymentMethodProceed1.click();Thread.sleep(1000);
		}
		catch (Exception E)
		{
			System.out.println("Method proceed pop up not showing");
		}
		
		//Export.AdaniAMD_TSPMileStone.click();Thread.sleep(500);
		Export.TSPPayment();Thread.sleep(2000);
		Export.AdaniAMD_TSPPayNowButton.click();Thread.sleep(4000);
		Export.AdaniAMD_TSPPayNowOKButton.click();Thread.sleep(6000);
		Export.AdaniAMD_TSPPayNowYesButton.click();Thread.sleep(5000);
		Export.GenerateToken();Thread.sleep(2000);
	}	
		
	
	@Then("User should goto track and trace tab for verify AdaniAMDExport_14 {string}")
	public void User_should_goto_track_and_trace_tab_for_verify_AdaniAMDExport_14(String MAWBNO14) throws InterruptedException 
	{
		Export.AdaniAMD_TrackAndTraceTab.click();Thread.sleep(15000);
		 wm.isElementTextMatch(driver, Export.AdaniAMD_TrackAndTraceTabScreen, "Track and Trace at AMD Airport");Thread.sleep(1000);
		Export.AdaniAMD_TrackAndTraceFilterAWB.sendKeys(AdaniAMDExport14);Thread.sleep(2000);
		Export.AdaniAMD_TrackAndTraceOperator.click();Thread.sleep(3000);
		Export.AdaniAMD_FilterContains.click();Thread.sleep(5000);
	
	}
	
	//------------------------ End @AdaniAMDExport_14 ------------------------------
	
	@Then("User Should create Shipment with quick ASI {string} and {string} CTO-Kale GHA2, Consol, Non-Bonded, Same and Bulk CHA")
	public void User_Should_create_Shipment_with_quick_ASI_and_CTO_Kale_GHA2_Consol_Non_Bonded_Same_and_Bulk_CHA(String MAWBNO15, String CTO) throws InterruptedException 
	{
		
		   Select SelectCTO = new Select(Export.AdaniAMD_QuickASI_SelectCTODropdown);
		   SelectCTO.selectByVisibleText(CTO);Thread.sleep(500);
		   
		   Export.AdaniAMD_QuickASI_ConsolAWB.click();Thread.sleep(500);
		 
		   Export.AdaniAMD_QuickASI_MAWBPrefix.sendKeys("999");Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_MAWBNumber.sendKeys(AdaniAMDExport15);Thread.sleep(500);
		   System.out.println("AdaniAMDExport_15 AWB No:" +AdaniAMDExport15);
		   Export.QuickASI();Thread.sleep(500);
		   try
		   {
			   Export.AdaniAMD_QuickASI_CarrierCode.sendKeys("ZZ");Thread.sleep(500);
		   }
		   catch (Exception E)
		   {
			   System.out.println("Carrier code available");Thread.sleep(500);
		   }
		   Export.AdaniAMD_QuickASI_FlightNo.sendKeys(cm.RandomNo(4));Thread.sleep(500);
		   
		   Export.AdaniAMD_QuickASI_SaveAWB.click();Thread.sleep(15000);
		   wm.JavascriptExecutorClick(driver,Export.AdaniAMD_QuickASI_MessageAlertOK);Thread.sleep(7000);
	}
	
	@Then("^User should Add HAWB With same Bulk CHA$")
	public void User_should_Add_HAWB_With_same_Bulk_CHA() throws InterruptedException 
	{
		Export.AdaniAMD_QuickASI_AddHAWB.click();Thread.sleep(1000);
		Export.AddHAWB1WithoutOriDesti();Thread.sleep(1000);
		
		   Select SelectAssighCHAAeroprime = new Select(Export.AdaniAMD_QuickASI_HAWBAssighCHADropdown1);
		   SelectAssighCHAAeroprime.selectByVisibleText("AEROPRIME Cargo Pvt Ltd.");Thread.sleep(500);
		   
		   Export.AdaniAMD_QuickASI_HAWBAddRow.click();Thread.sleep(1500);
		   Export.AddHAWB2WithoutOriDesti();Thread.sleep(1000);
		   
		   Export.AdaniAMD_QuickASI_HAWBAddRow.click();Thread.sleep(1500);
		   Export.AddHAWB3WithoutOriDesti();Thread.sleep(1000);
		   
          Export.AdaniAMD_QuickASI_HAWBBulkCHAAssignmentButton.click();Thread.sleep(8000);
		   
		   wm.isElementTextMatch(driver, Export.AdaniAMD_QuickASI_HAWBBulkCHAAssignmentScreen, "Bulk CHA Assignment");Thread.sleep(5000);
		   driver.switchTo().frame(0);
		   
		   Export.AdaniAMD_QuickASI_HAWBBulkCHAAssignmentCheckBox.click();Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_HAWBBulkCHAAssignmentCheckBox1.click();Thread.sleep(500);
		   
		   Select SelectBulkCHADropdownAeroprime = new Select(Export.AdaniAMD_QuickASI_HAWBBulkCHADropdown);
		   SelectBulkCHADropdownAeroprime.selectByVisibleText("AEROPRIME Cargo Pvt Ltd.");Thread.sleep(500);
		   
		   Export.AdaniAMD_QuickASI_HAWBBulkAssignCHAButton.click();Thread.sleep(1000);
		   Export.AdaniAMD_QuickASI_HAWBBulkAssignCHAOK.click();Thread.sleep(500);
		  
		   driver.switchTo().defaultContent();Thread.sleep(500);
		   
		   Export.AdaniAMD_QuickASI_HAWBBulkAssignCHAClose.click();Thread.sleep(2000);
		   Export.AdaniAMD_QuickASI_HAWBSave.click();Thread.sleep(15000);
		   wm.JavascriptExecutorClick(driver,Export.AdaniAMD_QuickASI_MessageAlertOK);Thread.sleep(7000); 
		
	}
	
	@Then("User Should Search MAWB number15 {string} for further process")
	public void User_Should_Search_MAWB_number15_for_further_process(String MAWBNO15) throws InterruptedException 
	{
		Export.AdaniAMD_FilterMAWBNo.sendKeys(AdaniAMDExport15);Thread.sleep(2000);
		Export.AdaniAMD_FilterOperator.click();Thread.sleep(3000);
		Export.AdaniAMD_FilterContains.click();Thread.sleep(5000);
		
	}
	
	@Then("^User should view HAWB using View HAWB Milestone$")
	public void User_should_view_HAWB_using_View_HAWB_Milestone() throws InterruptedException 
	{
		
		Export.AdaniAMD_ViewHAWBMilestone.click();Thread.sleep(2000);
		Export.AdaniAMD_ViewHAWBBack.click();Thread.sleep(3000);
		
	}
	
	
	@Then("^User should add Shipping Bill for bulk HAWB for kale GHA2 CTO$")
	public void User_should_add_Shipping_Bill_for_bulk_HAWB_for_kale_GHA2_CTO() throws InterruptedException 
	{
		Export.AdaniAMD_AddSBMileStone.click();Thread.sleep(500);
		wm.isElementTextMatch(driver, Export.AdaniAMD_AddSBDetailsScreen, "Shipping Bill Details");Thread.sleep(1000);
		
		Export.CommonSB1();
		
		Export.AdaniAMD_AddSBHAWB1.click();
		
		Select SelectHAWBH1 = new Select(Export.AdaniAMD_AddSBHAWBDrpodown1);Thread.sleep(500);
		SelectHAWBH1.selectByVisibleText("H1");Thread.sleep(1500);
		
		Export.AddSB();Thread.sleep(500);
		//-----------
		Export.AdaniAMD_AddSBAddRow1.click();Thread.sleep(1000);
		
		Export.CommonSB2();Thread.sleep(1000);
		
		Export.AdaniAMD_AddSBHAWB2.click();Thread.sleep(1000);
		
		Select SelectHAWBH2 = new Select(Export.AdaniAMD_AddSBHAWBDrpodown2);Thread.sleep(1500);
		SelectHAWBH2.selectByVisibleText("H2");Thread.sleep(1500);
		
		Export.AddSB2();Thread.sleep(500);
		//------------------
		
		Export.AdaniAMD_AddSBAddRow1.click();Thread.sleep(1000);
		
		Export.CommonSB3();Thread.sleep(1000);
		
		Export.AdaniAMD_AddSBHAWB3.click();Thread.sleep(1000);
		
		Select SelectHAWBH3 = new Select(Export.AdaniAMD_AddSBHAWBDrpodown3);Thread.sleep(500);
		SelectHAWBH3.selectByVisibleText("H3");Thread.sleep(1500);
		
		Export.AddSB3();Thread.sleep(2000);
		Thread.sleep(25000);
		Export.AdaniAMD_AddSBSave.click();Thread.sleep(8000);
		Export.AdaniAMD_AddSBSaveOk.click();Thread.sleep(12000);
		
		
	}
	
	@Then("^User should process TSP Payment without Vechicle token for bulk HAWB for kale GHA2 CTO$")
	public void User_should_process_TSP_Payment_with_Vechicle_token_for_bulk_HAWB_for_kale_GHA2_CTO() throws InterruptedException 
	{
		Export.AdaniAMD_TSPMileStone.click();Thread.sleep(2000);
		wm.isElementTextMatch(driver, Export.AdaniAMD_TSPPaymentScreen, "TSP Payment");Thread.sleep(3000);
		Export.TSPPaymentBulkHAWB();
		Export.AdaniAMD_TSPPayNowButton1.click();Thread.sleep(8000);
		Export.AdaniAMD_TSPPayNowOKButtonbulk.click();Thread.sleep(12000);
		Export.AdaniAMD_TSPPayNowNoButton.click();Thread.sleep(12000);
		Export.AdaniAMD_TSPBackButton.click();Thread.sleep(8000);
		
	}
	
	@Then("^User should process Vechicle token for second SB for kale GHA2 CTO$")
	public void User_should_process_Vechicle_token_for_second_SB_for_kale_GHA2_CTO() throws InterruptedException 
	{
		Export.AdaniAMD_VechicleTokenMileStone.click();Thread.sleep(2000);
		Export.AdaniAMD_TSPMileStone.click();Thread.sleep(2000);
	
		Export.GenerateToken();Thread.sleep(2000);

    }
	@Then("^User should process TSP Payment with Vechicle token for third SB for kale GHA2 CTO$")
	public void User_should_process_TSP_Payment_with_Vechicle_token_for_third_SB_for_kale_GHA2_CTO() throws InterruptedException 
	{
		Export.AdaniAMD_VechicleTokenMileStone.click();Thread.sleep(2000);
		Export.AdaniAMD_TSPMileStone.click();Thread.sleep(2000);
		//Export.AdaniAMD_TSPMileStone.click();Thread.sleep(500);
		Export.GenerateToken();Thread.sleep(3000);
	
	}
	
	@Then("User should goto track and trace tab for verify AdaniAMDExport_15 {string}")
	public void User_should_goto_track_and_trace_tab_for_verify_AdaniAMDExport_15(String MAWBNO15) throws InterruptedException 
	{
		Export.AdaniAMD_TrackAndTraceTab.click();Thread.sleep(15000);
		 wm.isElementTextMatch(driver, Export.AdaniAMD_TrackAndTraceTabScreen, "Track and Trace at AMD Airport");Thread.sleep(1000);
		Export.AdaniAMD_TrackAndTraceFilterAWB.sendKeys(AdaniAMDExport15);Thread.sleep(2000);
		Export.AdaniAMD_TrackAndTraceOperator.click();Thread.sleep(3000);
		Export.AdaniAMD_FilterContains.click();Thread.sleep(5000);
	
	}
	
	//--------------------- End @AdaniAMDExport_15 ----------------------
	
	@Then("User Should create Shipment with quick ASI {string} and {string} CTO-Kale GHA2, Consol, Non-Bonded, Different and Bulk CHA")
	public void User_Should_create_Shipment_with_quick_ASI_and_CTO_Kale_GHA2_Consol_Non_Bonded_Different_and_Bulk_CHA(String MAWBNo16, String CTO) throws InterruptedException 
	{
		
		   Select SelectCTO = new Select(Export.AdaniAMD_QuickASI_SelectCTODropdown);
		   SelectCTO.selectByVisibleText(CTO);Thread.sleep(500);
		   
		   Export.AdaniAMD_QuickASI_ConsolAWB.click();Thread.sleep(500);
		 
		   Export.AdaniAMD_QuickASI_MAWBPrefix.sendKeys("999");Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_MAWBNumber.sendKeys(AdaniAMDExport16);Thread.sleep(500);
		   System.out.println("AdaniAMDExport_16 AWB No:" +AdaniAMDExport16);
		   Export.QuickASI();Thread.sleep(500);
		   try
		   {
			   Export.AdaniAMD_QuickASI_CarrierCode.sendKeys("ZZ");Thread.sleep(500);
		   }
		   catch (Exception E)
		   {
			   System.out.println("Carrier code available");Thread.sleep(500);
		   }
		   Export.AdaniAMD_QuickASI_FlightNo.sendKeys(cm.RandomNo(4));Thread.sleep(500);
		   
		   Export.AdaniAMD_QuickASI_SaveAWB.click();Thread.sleep(15000);
		   wm.JavascriptExecutorClick(driver,Export.AdaniAMD_QuickASI_MessageAlertOK);Thread.sleep(7000);
	}
	
	@Then("^User should Add HAWB With Different Bulk CHA for Non-Bonded$")
	public void User_should_Add_HAWB_With_Different_Bulk_CHA_for_Non_Bonded() throws InterruptedException 
	{
		Export.AdaniAMD_QuickASI_AddHAWB.click();Thread.sleep(1000);
		Export.AddHAWB1WithoutOriDesti();Thread.sleep(1000);
		
		 Select SelectAssighCHAAeroprime = new Select(Export.AdaniAMD_QuickASI_HAWBAssighCHADropdown1);
		   SelectAssighCHAAeroprime.selectByVisibleText("JEENA & COMPANY");Thread.sleep(500);
		   
		   Export.AdaniAMD_QuickASI_HAWBAddRow.click();Thread.sleep(1500);
		   Export.AddHAWB2WithoutOriDesti();Thread.sleep(1000);
		   
		   Export.AdaniAMD_QuickASI_HAWBAddRow.click();Thread.sleep(1500);
		   Export.AddHAWB3WithoutOriDesti();Thread.sleep(1000);
		   
          Export.AdaniAMD_QuickASI_HAWBBulkCHAAssignmentButton.click();Thread.sleep(8000);
		   
		   wm.isElementTextMatch(driver, Export.AdaniAMD_QuickASI_HAWBBulkCHAAssignmentScreen, "Bulk CHA Assignment");Thread.sleep(5000);
		   driver.switchTo().frame(0);
		   
		   Export.AdaniAMD_QuickASI_HAWBBulkCHAAssignmentCheckBox.click();Thread.sleep(500);
		   Export.AdaniAMD_QuickASI_HAWBBulkCHAAssignmentCheckBox1.click();Thread.sleep(500);
		   

		   Select SelectBulkCHADropdownAeroprime = new Select(Export.AdaniAMD_QuickASI_HAWBBulkCHADropdown);
		   SelectBulkCHADropdownAeroprime.selectByVisibleText("JEENA & COMPANY");Thread.sleep(500);
		   
		   Export.AdaniAMD_QuickASI_HAWBBulkAssignCHAButton.click();Thread.sleep(1000);
		   Export.AdaniAMD_QuickASI_HAWBBulkAssignCHAOK.click();Thread.sleep(500);
		  
		   driver.switchTo().defaultContent();Thread.sleep(500);
		   
		   Export.AdaniAMD_QuickASI_HAWBBulkAssignCHAClose.click();Thread.sleep(3000);
		   Export.AdaniAMD_QuickASI_HAWBSave.click();Thread.sleep(15000);
		   Export.AdaniAMD_QuickASI_MessageAlertOK.click();Thread.sleep(6000);	 
		
	}
	
	@Then("User Should Search MAWB number16 {string} for further process")
	public void User_Should_Search_MAWB_number16_for_further_process(String MAWBNo16) throws InterruptedException 
	{
		Export.AdaniAMD_FilterMAWBNo.sendKeys(AdaniAMDExport16);Thread.sleep(2000);
		Export.AdaniAMD_FilterOperator.click();Thread.sleep(3000);
		Export.AdaniAMD_FilterContains.click();Thread.sleep(5000);
		
	}
	
	@Then("User should goto track and trace tab for verify AdaniAMDExport_16 {string}")
	public void User_should_goto_track_and_trace_tab_for_verify_AdaniAMDExport_16(String MAWBNo16) throws InterruptedException 
	{
		Export.AdaniAMD_TrackAndTraceTab.click();Thread.sleep(15000);
		 wm.isElementTextMatch(driver, Export.AdaniAMD_TrackAndTraceTabScreen, "Track and Trace at AMD Airport");Thread.sleep(1000);
		Export.AdaniAMD_TrackAndTraceFilterAWB.sendKeys(AdaniAMDExport16);Thread.sleep(2000);
		Export.AdaniAMD_TrackAndTraceOperator.click();Thread.sleep(3000);
		Export.AdaniAMD_FilterContains.click();Thread.sleep(5000);
	
	}
	
	//--------------------- End @AdaniAMDExport_16 ----------------------
	
		@Then("User Should create Shipment with quick ASI {string} and {string} CTO-Kale GHA2, Consol, Non-Bonded, Multiple and Bulk CHA")
		public void User_Should_create_Shipment_with_quick_ASI_and_CTO_Kale_GHA2_Consol_Non_Bonded_Multiple_and_Bulk_CHA(String MAWBNO17, String CTO) throws InterruptedException 
		{
			
			   Select SelectCTO = new Select(Export.AdaniAMD_QuickASI_SelectCTODropdown);
			   SelectCTO.selectByVisibleText(CTO);Thread.sleep(500);
			   
			   Export.AdaniAMD_QuickASI_ConsolAWB.click();Thread.sleep(500);
			 
			   Export.AdaniAMD_QuickASI_MAWBPrefix.sendKeys("999");Thread.sleep(500);
			   Export.AdaniAMD_QuickASI_MAWBNumber.sendKeys(AdaniAMDExport17);Thread.sleep(500);
			   System.out.println("AdaniAMDExport_17 AWB No:" +AdaniAMDExport17);
			   Export.QuickASI();Thread.sleep(500);
			   try
			   {
				   Export.AdaniAMD_QuickASI_CarrierCode.sendKeys("ZZ");Thread.sleep(500);
			   }
			   catch (Exception E)
			   {
				   System.out.println("Carrier code available");Thread.sleep(500);
			   }
			   Export.AdaniAMD_QuickASI_FlightNo.sendKeys(cm.RandomNo(4));Thread.sleep(500);
			   
			   Export.AdaniAMD_QuickASI_SaveAWB.click();Thread.sleep(15000);
			   wm.JavascriptExecutorClick(driver,Export.AdaniAMD_QuickASI_MessageAlertOK);Thread.sleep(7000);
		}
		
		@Then("^User should Add HAWB With Multiple Bulk CHA for Non-Bonded$")
		public void User_should_Add_HAWB_With_Multiple_Bulk_CHA_for_Non_Bonded() throws InterruptedException 
		{
			Export.AdaniAMD_QuickASI_AddHAWB.click();Thread.sleep(1000);
			Export.AddHAWB1WithoutOriDesti();Thread.sleep(1000);
			
			 Select SelectAssighCHAAeroprime = new Select(Export.AdaniAMD_QuickASI_HAWBAssighCHADropdown1);
			 SelectAssighCHAAeroprime.selectByVisibleText("AEROPRIME Cargo Pvt Ltd.");Thread.sleep(500);
			   
			   Export.AdaniAMD_QuickASI_HAWBAddRow.click();Thread.sleep(1500);
			   Export.AddHAWB2WithoutOriDesti();Thread.sleep(1000);
			   
			   Export.AdaniAMD_QuickASI_HAWBAddRow.click();Thread.sleep(1500);
			   Export.AddHAWB3WithoutOriDesti();;Thread.sleep(1000);
			   
	          Export.AdaniAMD_QuickASI_HAWBBulkCHAAssignmentButton.click();Thread.sleep(8000);
			   
			   wm.isElementTextMatch(driver, Export.AdaniAMD_QuickASI_HAWBBulkCHAAssignmentScreen, "Bulk CHA Assignment");Thread.sleep(5000);
			   driver.switchTo().frame(0);
			   
			   Export.AdaniAMD_QuickASI_HAWBBulkCHAAssignmentCheckBox.click();Thread.sleep(500);
			   Export.AdaniAMD_QuickASI_HAWBBulkCHAAssignmentCheckBox1.click();Thread.sleep(500);
			   

			   Select SelectBulkCHADropdownKrishna = new Select(Export.AdaniAMD_QuickASI_HAWBBulkCHADropdown);
			   SelectBulkCHADropdownKrishna.selectByVisibleText("JEENA & COMPANY");Thread.sleep(500);
			   
			   Export.AdaniAMD_QuickASI_HAWBBulkAssignCHAButton.click();Thread.sleep(1000);
			   Export.AdaniAMD_QuickASI_HAWBBulkAssignCHAOK.click();Thread.sleep(500);
			  
			   driver.switchTo().defaultContent();Thread.sleep(500);
			   
			   Export.AdaniAMD_QuickASI_HAWBBulkAssignCHAClose.click();Thread.sleep(3000);
			   Export.AdaniAMD_QuickASI_HAWBSave.click();Thread.sleep(15000);
			   wm.JavascriptExecutorClick(driver,Export.AdaniAMD_QuickASI_MessageAlertOK);Thread.sleep(7000);
			
		}
		
		@Then("User Should Search MAWB number17 {string} for further process")
		public void User_Should_Search_MAWB_number17_for_further_process(String MAWBNO17) throws InterruptedException 
		{
			Export.AdaniAMD_FilterMAWBNo.sendKeys(AdaniAMDExport17);Thread.sleep(2000);
			Export.AdaniAMD_FilterOperator.click();Thread.sleep(3000);
			Export.AdaniAMD_FilterContains.click();Thread.sleep(5000);
			
		}
		
		//--------------------- End @AdaniAMDExport_17 ----------------------
		
		@Then("User Should create Shipment with quick ASI {string} and {string} CTO-Kale GHA2, Consol, Bonded, Same and Bulk CHA")
		public void User_Should_create_Shipment_with_quick_ASI_and_CTO_Kale_GHA2_Consol_Bonded_Same_and_Bulk_CHA(String MAWBNo18, String CTO) throws InterruptedException 
		{
			
			   Select SelectCTO = new Select(Export.AdaniAMD_QuickASI_SelectCTODropdown);
			   SelectCTO.selectByVisibleText(CTO);Thread.sleep(500);
			   
			   Export.AdaniAMD_QuickASI_ConsolAWB.click();Thread.sleep(500);
			   
			   Select SelectShipmentType = new Select(Export.AdaniAMD_QuickASI_ShipmentTypeDropdown);
			   SelectShipmentType.selectByVisibleText("Bonded");Thread.sleep(500);
			 
			   Export.AdaniAMD_QuickASI_MAWBPrefix.sendKeys("999");Thread.sleep(500);
			   Export.AdaniAMD_QuickASI_MAWBNumber.sendKeys(AdaniAMDExport18);Thread.sleep(500);
			   System.out.println("AdaniAMDExport_18 AWB No:" +AdaniAMDExport18);
			   Export.QuickASI();Thread.sleep(500);
			   try
			   {
				   Export.AdaniAMD_QuickASI_CarrierCode.sendKeys("ZZ");Thread.sleep(500);
			   }
			   catch (Exception E)
			   {
				   System.out.println("Carrier code available");Thread.sleep(500);
			   }
			   Export.AdaniAMD_QuickASI_FlightNo.sendKeys(cm.RandomNo(4));Thread.sleep(500);
			   
			   Select SelectBondedTrucker = new Select(Export.AdaniAMD_QuickASI_BondedTruckerDropdown);
			   SelectBondedTrucker.selectByVisibleText("Surya_Bonded");Thread.sleep(500);
			   
			   Export.AdaniAMD_QuickASI_SaveAWB.click();Thread.sleep(15000);
			   wm.JavascriptExecutorClick(driver,Export.AdaniAMD_QuickASI_MessageAlertOK);Thread.sleep(7000);
		}
		
		@Then("User Should Search MAWB number18 {string} for further process")
		public void User_Should_Search_MAWB_number18_for_further_process(String MAWBNo18) throws InterruptedException 
		{
			Export.AdaniAMD_FilterMAWBNo.sendKeys(AdaniAMDExport18);Thread.sleep(2000);
			Export.AdaniAMD_FilterOperator.click();Thread.sleep(3000);
			Export.AdaniAMD_FilterContains.click();Thread.sleep(5000);
			
		}
		
	//--------------------- End @AdaniAMDExport_18 ----------------------
		
		@Then("User Should create Shipment with quick ASI {string} and {string} CTO-Kale GHA2, Consol, Bonded, Different and Bulk CHA")
		public void User_Should_create_Shipment_with_quick_ASI_and_CTO_Kale_GHA2_Consol_Bonded_Different_and_Bulk_CHA(String MAWBNO19, String CTO) throws InterruptedException 
		{
			
			   Select SelectCTO = new Select(Export.AdaniAMD_QuickASI_SelectCTODropdown);
			   SelectCTO.selectByVisibleText(CTO);Thread.sleep(500);
			   
			   Export.AdaniAMD_QuickASI_ConsolAWB.click();Thread.sleep(500);
			   
			   Select SelectShipmentType = new Select(Export.AdaniAMD_QuickASI_ShipmentTypeDropdown);
			   SelectShipmentType.selectByVisibleText("Bonded");Thread.sleep(500);
			 
			   Export.AdaniAMD_QuickASI_MAWBPrefix.sendKeys("999");Thread.sleep(500);
			   Export.AdaniAMD_QuickASI_MAWBNumber.sendKeys(AdaniAMDExport19);Thread.sleep(500);
			   System.out.println("AdaniAMDExport_19 AWB No:" +AdaniAMDExport19);
			   Export.QuickASI();Thread.sleep(500);
			   try
			   {
				   Export.AdaniAMD_QuickASI_CarrierCode.sendKeys("ZZ");Thread.sleep(500);
			   }
			   catch (Exception E)
			   {
				   System.out.println("Carrier code available");Thread.sleep(500);
			   }
			   Export.AdaniAMD_QuickASI_FlightNo.sendKeys(cm.RandomNo(4));Thread.sleep(500);
			   
			   Select SelectBondedTrucker = new Select(Export.AdaniAMD_QuickASI_BondedTruckerDropdown);
			   SelectBondedTrucker.selectByVisibleText("Surya_Bonded");Thread.sleep(500);
			   
			   Export.AdaniAMD_QuickASI_SaveAWB.click();Thread.sleep(15000);
			   wm.JavascriptExecutorClick(driver,Export.AdaniAMD_QuickASI_MessageAlertOK);Thread.sleep(7000);
		}
		
		@Then("^User should Add HAWB With Different Bulk CHA for Bonded$")
		public void  User_should_Add_HAWB_With_Different_Bulk_CHA_for_Bonded() throws InterruptedException 
		{
			Export.AdaniAMD_QuickASI_AddHAWB.click();Thread.sleep(1000);
			Export.AddHAWB1WithoutOriDesti();Thread.sleep(1000);
			
			   Select SelectAssighCHAAeroprime = new Select(Export.AdaniAMD_QuickASI_HAWBAssighCHADropdown1);
			   SelectAssighCHAAeroprime.selectByVisibleText("Surya_Bonded");Thread.sleep(500);
			   
			   Export.AdaniAMD_QuickASI_HAWBAddRow.click();Thread.sleep(1500);
			   Export.AddHAWB2WithoutOriDesti();Thread.sleep(1000);
			   
			   Export.AdaniAMD_QuickASI_HAWBAddRow.click();Thread.sleep(1500);
			   Export.AddHAWB3WithoutOriDesti();Thread.sleep(1000);
			   
	          Export.AdaniAMD_QuickASI_HAWBBulkCHAAssignmentButton.click();Thread.sleep(8000);
			   
			   wm.isElementTextMatch(driver, Export.AdaniAMD_QuickASI_HAWBBulkCHAAssignmentScreen, "Bulk CHA Assignment");Thread.sleep(5000);
			   driver.switchTo().frame(0);
			   
			   Export.AdaniAMD_QuickASI_HAWBBulkCHAAssignmentCheckBox.click();Thread.sleep(500);
			   Export.AdaniAMD_QuickASI_HAWBBulkCHAAssignmentCheckBox1.click();Thread.sleep(500);
			   
			   Select SelectBulkCHADropdownAeroprime = new Select(Export.AdaniAMD_QuickASI_HAWBBulkCHADropdown);
			   SelectBulkCHADropdownAeroprime.selectByVisibleText("Surya_Bonded");Thread.sleep(500);
			   
			   Export.AdaniAMD_QuickASI_HAWBBulkAssignCHAButton.click();Thread.sleep(1000);
			   Export.AdaniAMD_QuickASI_HAWBBulkAssignCHAOK.click();Thread.sleep(500);
			  
			   driver.switchTo().defaultContent();Thread.sleep(500);
			   
			   Export.AdaniAMD_QuickASI_HAWBBulkAssignCHAClose.click();Thread.sleep(2000);
			   Export.AdaniAMD_QuickASI_HAWBSave.click();Thread.sleep(15000);
			   wm.JavascriptExecutorClick(driver,Export.AdaniAMD_QuickASI_MessageAlertOK);Thread.sleep(7000);
		}
		
		
		@Then("User Should Search MAWB number19 {string} for further process")
		public void User_Should_Search_MAWB_number19_for_further_process(String MAWBNO19) throws InterruptedException 
		{
			Export.AdaniAMD_FilterMAWBNo.sendKeys(AdaniAMDExport19);Thread.sleep(2000);
			Export.AdaniAMD_FilterOperator.click();Thread.sleep(3000);
			Export.AdaniAMD_FilterContains.click();Thread.sleep(5000);
			
		}
		@Then("^User should add Shipping Bill with multiple SB and dimenssion for kale GHA2 CTO for different CHA$")
		public void User_should_add_Shipping_Bill_with_multiple_SB_and_dimenssion_for_kale_GHA2_CTO_for_different_CHA() throws InterruptedException 
		{
			Export.AdaniAMD_AddSBMileStone.click();Thread.sleep(500);
			wm.isElementTextMatch(driver, Export.AdaniAMD_AddSBDetailsScreen, "Shipping Bill Details");Thread.sleep(1000);
			
			
			Export.AdaniAMD_AddSBNumber1.sendKeys(cm.RandomNo(7));Thread.sleep(1000);
			Export.AdaniAMD_AddSBDate1.click();Thread.sleep(1000);
			Export.CurrentDate();Thread.sleep(1000);
			
			Select SelectSBTypeManual1 = new Select(Export.AdaniAMD_AddSBType1);Thread.sleep(500);
			SelectSBTypeManual1.selectByVisibleText("Manual");Thread.sleep(1500);
			
			Export.AdaniAMD_AddSBHAWB1.click();
			
			Select SelectHAWBH1 = new Select(Export.AdaniAMD_AddSBHAWBDrpodown1);Thread.sleep(500);
			SelectHAWBH1.selectByVisibleText("H1");Thread.sleep(1500);
			
			
			Export.AddSB();Thread.sleep(500);
			
			Export.AdaniAMD_AddSBAddRow1.click();Thread.sleep(500);
			
			Export.AdaniAMD_AddSBNumber2.sendKeys(cm.RandomNo(7));Thread.sleep(1000);
			Export.AdaniAMD_AddSBDate2.click();Thread.sleep(1000);
			Export.CurrentDate();Thread.sleep(1000);
			
			Select SelectSBTypeManual2 = new Select(Export.AdaniAMD_AddSBType2);Thread.sleep(500);
			SelectSBTypeManual2.selectByVisibleText("Manual");Thread.sleep(1500);
			
			Export.AdaniAMD_AddSBHAWB2.click();
			
			Select SelectHAWBH2 = new Select(Export.AdaniAMD_AddSBHAWBDrpodown2);Thread.sleep(500);
			SelectHAWBH2.selectByVisibleText("H2");Thread.sleep(1500);
			
			Export.AddSB2();Thread.sleep(1500);	
			
			Export.AdaniAMD_AddSBAddRow1.click();Thread.sleep(500);
			
			Export.AdaniAMD_AddSBNumber3.sendKeys(cm.RandomNo(7));Thread.sleep(1000);
			Export.AdaniAMD_AddSBDate3.click();Thread.sleep(1000);
			Export.CurrentDate();Thread.sleep(1000);
			
			Select SelectSBTypeManual3 = new Select(Export.AdaniAMD_AddSBType3);Thread.sleep(500);
			SelectSBTypeManual3.selectByVisibleText("Manual");Thread.sleep(1500);
			
			Export.AdaniAMD_AddSBHAWB3.click();
			
			Select SelectHAWBH3 = new Select(Export.AdaniAMD_AddSBHAWBDrpodown3);Thread.sleep(500);
			SelectHAWBH3.selectByVisibleText("H3");Thread.sleep(1500);
			
			Export.AddSB3();Thread.sleep(1500);	
			Thread.sleep(25000);
			Export.AdaniAMD_AddSBSave.click();Thread.sleep(9000);
			wm.JavascriptExecutorClick(driver, Export.AdaniAMD_AddSBSaveOk);Thread.sleep(8000);
			
		}
		
		@Then("^User should process vechicle token using Partially Completed TSP milestone$")
		public void User_should_process_vechicle_token_using_Partially_Completed_TSP_milestone() throws InterruptedException 
		{
			Export.AdaniAMD_TSPartiallyPCompletedMileStone.click();Thread.sleep(2000);			
			Export.AdaniAMD_TSPMileStone.click();Thread.sleep(2000);
			Export.GenerateToken();Thread.sleep(2000);
		
		}
		
		@Then("^User should process TSP using Partially completed VT Milestone with generate vechicle token$")
		public void User_should_process_TSP_using_Partially_completed_VT_Milestone_with_generate_vechicle_token() throws InterruptedException 
		{
			Export.AdaniAMD_VechicleTokenMileStone.click();Thread.sleep(2000);
			wm.isElementTextMatch(driver, Export.AdaniAMD_TSPPaymentScreen, "TSP Payment");Thread.sleep(1000);
			Export.AdaniAMD_TSPMileStone.click();Thread.sleep(2000);
			Export.TSPPayment();
			try
			{
				Export.AdaniAMD_TSPPayNowButton.click();Thread.sleep(4000);
			}
			catch (Exception E)
			{
				Export.AdaniAMD_TSPPayNowButton1.click();Thread.sleep(4000);
			}
			
			Export.AdaniAMD_TSPPayNowOKButton.click();Thread.sleep(5000);
			Export.AdaniAMD_TSPPayNowYesButton.click();Thread.sleep(6000);
			
			Export.GenerateToken();Thread.sleep(2000);
		
		}
		
		@Then("^User should process TSP using Partially completed VT Milestone with generate vechicle token for different CHA$")
		public void User_should_process_TSP_using_Partially_completed_VT_Milestone_with_generate_vechicle_token_for_different_CHA() throws InterruptedException 
		{
			Export.AdaniAMD_VechicleTokenMileStone.click();Thread.sleep(2000);
			wm.isElementTextMatch(driver, Export.AdaniAMD_TSPPaymentScreen, "TSP Payment");Thread.sleep(1000);
			Export.AdaniAMD_TSPMileStone.click();Thread.sleep(2000);
			
			try
			{
				Export.AdaniAMD_TSPPaymentMethodProceed.click();Thread.sleep(5000);
			}
			catch (Exception E)
			{
				System.out.println("Method proceed pop up not showing");
			}
			
			try
			{
				Export.AdaniAMD_TSPPaymentMethodProceed1.click();Thread.sleep(5000);
			}
			catch (Exception E)
			{
				System.out.println("Method proceed pop up not showing");
			}
			
			Export.TSPPayment();
			try
			{
				Export.AdaniAMD_TSPPayNowButton.click();Thread.sleep(4000);
			}
			catch (Exception E)
			{
				Export.AdaniAMD_TSPPayNowButton1.click();Thread.sleep(4000);
			}
			
			Export.AdaniAMD_TSPPayNowOKButton.click();Thread.sleep(5000);
			Export.AdaniAMD_TSPPayNowYesButton.click();Thread.sleep(6000);
			
			Export.GenerateToken();Thread.sleep(2000);
			
			Export.AdaniAMD_VechicleTokenMileStone.click();Thread.sleep(2000);
			wm.isElementTextMatch(driver, Export.AdaniAMD_TSPPaymentScreen, "TSP Payment");Thread.sleep(1000);
			Export.AdaniAMD_TSPMileStone.click();Thread.sleep(2000);
			
			try
			{
				Export.AdaniAMD_TSPPaymentMethodProceed.click();Thread.sleep(5000);
			}
			catch (Exception E)
			{
				System.out.println("Method proceed pop up not showing");
			}
			
			try
			{
				Export.AdaniAMD_TSPPaymentMethodProceed1.click();Thread.sleep(5000);
			}
			catch (Exception E)
			{
				System.out.println("Method proceed pop up not showing");
			}
			
			Export.TSPPayment();
			try
			{
				Export.AdaniAMD_TSPPayNowButton.click();Thread.sleep(4000);
			}
			catch (Exception E)
			{
				Export.AdaniAMD_TSPPayNowButton1.click();Thread.sleep(4000);
			}
			
			Export.AdaniAMD_TSPPayNowOKButton.click();Thread.sleep(5000);
			Export.AdaniAMD_TSPPayNowYesButton.click();Thread.sleep(6000);
			
			Export.GenerateToken();Thread.sleep(2000);
		
		}
		//--------------------- End @AdaniAMDExport_19 ----------------------
		
				@Then("User Should create Shipment with quick ASI {string} and {string} CTO-Kale GHA2, Consol, Bonded, Multiple and Bulk CHA")
				public void User_Should_create_Shipment_with_quick_ASI_and_CTO_Kale_GHA2_Consol_Bonded_Multiple_and_Bulk_CHA(String MAWBNO20, String CTO) throws InterruptedException 
				{
					
					   Select SelectCTO = new Select(Export.AdaniAMD_QuickASI_SelectCTODropdown);
					   SelectCTO.selectByVisibleText(CTO);Thread.sleep(500);
					   
					   Export.AdaniAMD_QuickASI_ConsolAWB.click();Thread.sleep(500);
					   
					   Select SelectShipmentType = new Select(Export.AdaniAMD_QuickASI_ShipmentTypeDropdown);
					   SelectShipmentType.selectByVisibleText("Bonded");Thread.sleep(500);
					 
					   Export.AdaniAMD_QuickASI_MAWBPrefix.sendKeys("999");Thread.sleep(500);
					   Export.AdaniAMD_QuickASI_MAWBNumber.sendKeys(AdaniAMDExport20);Thread.sleep(500);
					   System.out.println("AdaniAMDExport_20 AWB No:" +AdaniAMDExport20);
					   Export.QuickASI();Thread.sleep(500);
					   try
					   {
						   Export.AdaniAMD_QuickASI_CarrierCode.sendKeys("ZZ");Thread.sleep(500);
					   }
					   catch (Exception E)
					   {
						   System.out.println("Carrier code available");Thread.sleep(500);
					   }
					   Export.AdaniAMD_QuickASI_FlightNo.sendKeys(cm.RandomNo(4));Thread.sleep(500);
					   
					   Select SelectBondedTrucker = new Select(Export.AdaniAMD_QuickASI_BondedTruckerDropdown);
					   SelectBondedTrucker.selectByVisibleText("Surya_Bonded");Thread.sleep(500);
					   
					   Export.AdaniAMD_QuickASI_SaveAWB.click();Thread.sleep(15000);
					   wm.JavascriptExecutorClick(driver,Export.AdaniAMD_QuickASI_MessageAlertOK);Thread.sleep(7000);		   
					  
				}
				
				@Then("^User should Add HAWB With Multiple Bulk CHA for Bonded$")
				public void  User_should_Add_HAWB_With_Multiple_Bulk_CHA_for_Bonded() throws InterruptedException 
				{
					Export.AdaniAMD_QuickASI_AddHAWB.click();Thread.sleep(1000);
					Export.AddHAWB1WithoutOriDesti();Thread.sleep(1000);
					
					   Select SelectAssighCHAAeroprime = new Select(Export.AdaniAMD_QuickASI_HAWBAssighCHADropdown1);
					   SelectAssighCHAAeroprime.selectByVisibleText("AEROPRIME Cargo Pvt Ltd.");Thread.sleep(500);
					   
					   Export.AdaniAMD_QuickASI_HAWBAddRow.click();Thread.sleep(1500);
					   Export.AddHAWB2WithoutOriDesti();Thread.sleep(1000);
					   
					   Export.AdaniAMD_QuickASI_HAWBAddRow.click();Thread.sleep(1500);
					   Export.AddHAWB3WithoutOriDesti();Thread.sleep(1000);
					   
			          Export.AdaniAMD_QuickASI_HAWBBulkCHAAssignmentButton.click();Thread.sleep(8000);
					   
					   wm.isElementTextMatch(driver, Export.AdaniAMD_QuickASI_HAWBBulkCHAAssignmentScreen, "Bulk CHA Assignment");Thread.sleep(5000);
					   driver.switchTo().frame(0);
					   
					   Export.AdaniAMD_QuickASI_HAWBBulkCHAAssignmentCheckBox.click();Thread.sleep(500);
					   Export.AdaniAMD_QuickASI_HAWBBulkCHAAssignmentCheckBox1.click();Thread.sleep(500);
					   
					   Select SelectBulkCHADropdownAeroprime = new Select(Export.AdaniAMD_QuickASI_HAWBBulkCHADropdown);
					   SelectBulkCHADropdownAeroprime.selectByVisibleText("Surya_Bonded");Thread.sleep(500);
					   
					   Export.AdaniAMD_QuickASI_HAWBBulkAssignCHAButton.click();Thread.sleep(1000);
					   Export.AdaniAMD_QuickASI_HAWBBulkAssignCHAOK.click();Thread.sleep(500);
					  
					   driver.switchTo().defaultContent();Thread.sleep(500);
					   
					   Export.AdaniAMD_QuickASI_HAWBBulkAssignCHAClose.click();Thread.sleep(2000);
					   Export.AdaniAMD_QuickASI_HAWBSave.click();Thread.sleep(15000);
					   wm.JavascriptExecutorClick(driver,Export.AdaniAMD_QuickASI_MessageAlertOK);Thread.sleep(7000);
				}
				
				
				@Then("User Should Search MAWB number20 {string} for further process")
				public void User_Should_Search_MAWB_number20_for_further_process(String MAWBNO20) throws InterruptedException 
				{
					Export.AdaniAMD_FilterMAWBNo.sendKeys(AdaniAMDExport20);Thread.sleep(2000);
					Export.AdaniAMD_FilterOperator.click();Thread.sleep(3000);
					Export.AdaniAMD_FilterContains.click();Thread.sleep(5000);
					
				}
				
				@Then("^User should add Shipping Bill for bulk HAWB for kale GHA2 CTO for Aeroprime$")
				public void User_should_add_Shipping_Bill_for_bulk_HAWB_for_kale_GHA2_CTO_for_Aeroprime() throws InterruptedException 
				{
					Export.AdaniAMD_AddSBMileStone.click();Thread.sleep(500);
					wm.isElementTextMatch(driver, Export.AdaniAMD_AddSBDetailsScreen, "Shipping Bill Details");Thread.sleep(1000);
					
					Export.CommonSB1();
					
					Export.AdaniAMD_AddSBHAWB1.click();
					
					Select SelectHAWBH1 = new Select(Export.AdaniAMD_AddSBHAWBDrpodown1);Thread.sleep(500);
					SelectHAWBH1.selectByVisibleText("H1");Thread.sleep(1500);
					
					Export.AddSB();Thread.sleep(500);
					//-----------
				
					Thread.sleep(25000);
					Export.AdaniAMD_AddSBSave.click();Thread.sleep(8000);
					Export.AdaniAMD_AddSBSaveOk.click();Thread.sleep(12000);
					
					
				}
				
				@Then("^User should process TSP Payment without Vechicle token for bulk HAWB for kale GHA2 CTO for Aeroprime$")
				public void User_should_process_TSP_Payment_with_Vechicle_token_for_bulk_HAWB_for_kale_GHA2_CTO_for_Aeroprime() throws InterruptedException 
				{
					Export.AdaniAMD_TSPMileStone.click();Thread.sleep(2000);
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
					 Thread.sleep(3000);
					 Export.AdaniAMD_SBDetailsCheckBox.click();Thread.sleep(3000);
					 Export.AdaniAMD_TSPTransactionPassword1.sendKeys("Kale@JUN2425");Thread.sleep(4000);
					Export.AdaniAMD_TSPPayNowButton1.click();Thread.sleep(8000);
					Export.AdaniAMD_TSPPayNowOKButtonbulk.click();Thread.sleep(12000);
					Export.AdaniAMD_TSPPayNowNoButton.click();Thread.sleep(12000);
					Export.AdaniAMD_TSPBackButton.click();Thread.sleep(8000);
					
				}
				
				@Then("^User should be verify vechicle token no and AWB no using vechicle token milestone$")
				public void User_should_be_verify_vechicle_token_no_and_AWB_no_using_vechicle_token_milestone() throws InterruptedException 
				{
					//Export.VerifyVTandAWB1();Thread.sleep(500);
					
				
				}
				
				@Then("User should goto track and trace tab for verify AdaniAMDExport_20 {string}")
				public void User_should_goto_track_and_trace_tab_for_verify_AdaniAMDExport_20(String MAWBNO20) throws InterruptedException 
				{
					Export.AdaniAMD_TrackAndTraceTab.click();Thread.sleep(15000);
					 wm.isElementTextMatch(driver, Export.AdaniAMD_TrackAndTraceTabScreen, "Track and Trace at AMD Airport");Thread.sleep(1000);
					Export.AdaniAMD_TrackAndTraceFilterAWB.sendKeys(AdaniAMDExport20);Thread.sleep(2000);
					Export.AdaniAMD_TrackAndTraceOperator.click();Thread.sleep(3000);
					Export.AdaniAMD_FilterContains.click();Thread.sleep(5000);
				
				}
				
				@Then("^User should add Shipping Bill for bulk HAWB for kale GHA2 CTO for different CHA$")
				public void User_should_add_Shipping_Bill_for_bulk_HAWB_for_kale_GHA2_CTO_for_different_CHA() throws InterruptedException 
				{
					Export.AdaniAMD_SBPartiallyPCompletedMileStone.click();Thread.sleep(500);
					wm.isElementTextMatch(driver, Export.AdaniAMD_AddSBDetailsScreen, "Shipping Bill Details");Thread.sleep(1000);
					
					Export.CommonSB1();
					
					Export.AdaniAMD_AddSBHAWB1.click();
					
					Select SelectHAWBH2 = new Select(Export.AdaniAMD_AddSBHAWBDrpodown1);Thread.sleep(500);
					SelectHAWBH2.selectByVisibleText("H2");Thread.sleep(1500);
					
					Export.AddSB();Thread.sleep(500);
					//-----------
					
					Export.AdaniAMD_AddSBAddRow1.click();
					
					Export.CommonSB2();
					
					Export.AdaniAMD_AddSBHAWB2.click();
					
					Select SelectHAWBH3 = new Select(Export.AdaniAMD_AddSBHAWBDrpodown2);Thread.sleep(500);
					SelectHAWBH3.selectByVisibleText("H3");Thread.sleep(1500);
					
					Export.AddSB2();Thread.sleep(500);
				
					Thread.sleep(25000);
					Export.AdaniAMD_AddSBSave.click();Thread.sleep(8000);
					Export.AdaniAMD_AddSBSaveOk.click();Thread.sleep(12000);
					
					
				}
				
				@Then("^User should process TSP Payment without Vechicle token for bulk HAWB for kale GHA2 CTO for different CHA$")
				public void User_should_process_TSP_Payment_with_Vechicle_token_for_bulk_HAWB_for_kale_GHA2_CTO_for_different_CHA() throws InterruptedException 
				{
					Export.AdaniAMD_TSPartiallyPCompletedMileStone.click();Thread.sleep(2000);
					Export.AdaniAMD_TSPMileStone.click();Thread.sleep(2000);
					Thread.sleep(1500);
					
					try
					{
						Export.AdaniAMD_TSPPaymentMethodProceed.click();Thread.sleep(1000);
					}
					catch (Exception E)
					{
						System.out.println("Method proceed pop up not showing");
					}
					
					try
					{
						Export.AdaniAMD_TSPPaymentMethodProceed1.click();Thread.sleep(1000);
					}
					catch (Exception E)
					{
						System.out.println("Method proceed pop up not showing");
					}
					
					Thread.sleep(5000);
					Export.TSPPayment();Thread.sleep(3000);
					try
					{
						Export.AdaniAMD_TSPPayNowButton1.click();Thread.sleep(7000);
					}
					catch (Exception E)
					{
						Export.AdaniAMD_TSPPayNowButton.click();Thread.sleep(7000);
					}
					
					Export.AdaniAMD_TSPPayNowOKButton.click();Thread.sleep(6000);
					wm.JavascriptExecutorClick(driver,Export.AdaniAMD_TSPPayNowYesButton);Thread.sleep(8000);
					Export.GenerateToken();Thread.sleep(4000);
				
					
				}
				
				//--------------------- End @AdaniAMDExport_20 ----------------------
/*				
 @Then("User Should create Shipment with quick ASI {string} {string} CTO-Adani and CSC, Direct, Non-Bonded, Same CHA")
 public void User_Should_create_Shipment_with_quick_ASI_CTO_Adani_and_CSC_Direct_Non_Bonded_Same_CHA(String MAWBNO, String CTO) throws InterruptedException 
 {
	 
	Select SelectCTO = new Select(Export.AdaniAMD_QuickASI_SelectCTODropdown);
	SelectCTO.selectByVisibleText(CTO);Thread.sleep(500);
					   
					 
    Export.AdaniAMD_QuickASI_MAWBPrefix.sendKeys("125");Thread.sleep(500);
	Export.AdaniAMD_QuickASI_MAWBNumber.sendKeys(MAWBNO);Thread.sleep(1500);
    Export.QuickASI();Thread.sleep(500);
	Export.AdaniAMD_QuickASI_FlightNo.sendKeys(cm.RandomNo(4));Thread.sleep(500);
	Export.AdaniAMD_QuickASI_AssignCHASelect.click();Thread.sleep(500);
	Export.AdaniAMD_QuickASI_AssignCHAName.click();Thread.sleep(500);
	Export.AdaniAMD_QuickASI_SaveAWB.click();Thread.sleep(15000);
	Export.AdaniAMD_QuickASI_MessageAlertOK.click();Thread.sleep(6000);
				
 }
	    @Given("User Should Search {string} for further process")
		public void User_Should_Search_for_further_process(String MAWBNO) throws InterruptedException 
		{
			Export.AdaniAMD_FilterMAWBNo.sendKeys(MAWBNO);Thread.sleep(2000);
			Export.AdaniAMD_FilterOperator.click();Thread.sleep(3000);
			Export.AdaniAMD_FilterContains.click();Thread.sleep(5000);
			
					
		}
	    
	    @Then("^User should wait upto update ack file for carting order$")
		public void User_should_wait_upto_update_ack_file_for_carting_order() throws InterruptedException 
		{
	    	Thread.sleep(90000);
	    	driver.navigate().refresh();
	    	System.out.println("CO 1");
	    	
	    	Thread.sleep(90000);
	    	driver.navigate().refresh();
	    	System.out.println("CO 2");
	    	
	    	Thread.sleep(90000);
	    	driver.navigate().refresh();
	    	System.out.println("CO 3");
	    	
	    	
		}
	    
	    @Then("^User should wait upto update ack file for SB order$")
		public void User_should_wait_upto_update_ack_file_for_SB_order() throws InterruptedException 
		{
	    	Thread.sleep(90000);
	    	driver.navigate().refresh();
	    	System.out.println("SB 1");
	    	
	    	Thread.sleep(90000);
	    	driver.navigate().refresh();
	    	System.out.println("SB 2");
	    	
	    	Thread.sleep(90000);
	    	driver.navigate().refresh();
	    	System.out.println("SB 3");
	    	
	    	Thread.sleep(90000);
	    	driver.navigate().refresh();
	    	System.out.println("SB 4");
	    	
	    	Thread.sleep(90000);
	    	driver.navigate().refresh();
	    	System.out.println("SB 5");
	    	
	    	Thread.sleep(90000);
	    	driver.navigate().refresh();
	    	System.out.println("SB 6");
	    	
	    	Thread.sleep(90000);
	    	driver.navigate().refresh();
	    	System.out.println("SB 7");
	    	
	    	Thread.sleep(90000);
	    	driver.navigate().refresh();
	    	System.out.println("SB 8");
	    	
	    	Thread.sleep(90000);
	    	driver.navigate().refresh();
	    	System.out.println("SB 9");
	    	
	    	Thread.sleep(90000);
	    	driver.navigate().refresh();
	    	System.out.println("SB 10");
	    	
	    	Thread.sleep(90000);
	    	driver.navigate().refresh();
	    	System.out.println("SB 11");

	    	Thread.sleep(90000);
	    	driver.navigate().refresh();
	    	System.out.println("SB 12");
	    	
		}
				
				
	@Then("User should goto track and trace tab for verify {string}")
	public void User_should_goto_track_and_trace_tab_for_verify(String MAWBNO) throws InterruptedException 
	{
				Export.AdaniAMD_TrackAndTraceTab.click();Thread.sleep(15000);
				wm.isElementTextMatch(driver, Export.AdaniAMD_TrackAndTraceTabScreen, "Track and Trace at AMD Airport");Thread.sleep(1000);
				Export.AdaniAMD_TrackAndTraceFilterAWB.sendKeys(MAWBNO);Thread.sleep(2000);
				Export.AdaniAMD_TrackAndTraceOperator.click();Thread.sleep(3000);
				Export.AdaniAMD_FilterContains.click();Thread.sleep(5000);
				
	}
				//------------------------ End @AdaniAMDExport_21 and @AdaniAMDExport_29--------------------------
								
		
		@Then("User Should create Shipment with quick ASI {string} CTO-GSEC, Direct, Non-Bonded, Same and Single CHA")
		public void User_Should_create_Shipment_with_quick_ASI_CTO_GSEC_Direct_Non_Bonded_Same_and_Single_CHA(String MAWBNO37_22) throws InterruptedException 
		{
			
			   Select SelectCTO = new Select(Export.AdaniAMD_QuickASI_SelectCTODropdown);
			   SelectCTO.selectByVisibleText("GSEC");Thread.sleep(500);
			   
			 
			   Export.AdaniAMD_QuickASI_MAWBPrefix.sendKeys("125");Thread.sleep(500);
			   Export.AdaniAMD_QuickASI_MAWBNumber.sendKeys(AdaniAMDExport);Thread.sleep(500);
			   System.out.println("AdaniAMDExport_22 AWB No:" +AdaniAMDExport);
			   Export.QuickASI();Thread.sleep(500);
			   Export.AdaniAMD_QuickASI_FlightNo.sendKeys(cm.RandomNo(4));Thread.sleep(500);
			   Export.AdaniAMD_QuickASI_AssignCHASelect.click();Thread.sleep(500);
			   Export.AdaniAMD_QuickASI_AssignCHAName.click();Thread.sleep(500);
			   Export.AdaniAMD_QuickASI_SaveAWB.click();Thread.sleep(15000);
			   Export.AdaniAMD_QuickASI_MessageAlertOK.click();Thread.sleep(6000);
		}
		@Given("User Should Search MAWB number37_22 {string} for further process")
		public void User_Should_Search_MAWB_number37_for_further_process(String MAWBNO37_22) throws InterruptedException 
		{
			Export.AdaniAMD_FilterMAWBNo.sendKeys(AdaniAMDExport);Thread.sleep(2000);
			Export.AdaniAMD_FilterOperator.click();Thread.sleep(3000);
			Export.AdaniAMD_FilterContains.click();Thread.sleep(5000);
			
		}
		
		// ---------------------------- -End @AdaniAMDExport_37 -------------------------------
		
		*/
	
}	
		