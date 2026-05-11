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

public class ACSAdaniAMDExport_eBookingPassword {
	
	//String AdaniAMDExport = cm.Random_AWBNo();	
	
	
	public boolean verify;

	@When("I login ACS Adani with {string} user given in {string} sheet for Export module")
	public void i_login_ACS_Adani_with_user_given_in_sheet_for_for_Export_module(String entity, String sheetName) throws Throwable {
		Entity = entity;
		TestDataReader.ReadLoginDetails(Entity);
		Thread.sleep(500);
		System.out.println("usr= " + Username);
		System.out.println("pwd= " + Password);
		// loginScreen.isLoginScreenDisplayed();
		loginScreen.Login(Entity, Username, Password);
		Thread.sleep(8000);

	}

	@Given("^To verify whether the user is able to see AMD Airport name as per selection from login page$")
	public void To_verify_whether_the_user_is_able_to_see_AMD_Airport_name_as_per_selection_from_login_page() throws InterruptedException 
	{
		 wm.isElementTextMatch(driver, Export.AdaniExportModule, "Exports");Thread.sleep(1000);
		 wm.isElementTextMatch(driver, Export.AirportNameAMD, "Ahmedabad");Thread.sleep(1000);
		
	}
	
	
	@Then("^User should logout Adani application$")
	public void User_should_logout_Adani_application() throws InterruptedException 
	{
		Thread.sleep(8000);
		wm.driver.get("https://acsadaniuat.kalelogistics.com/ACS_AMD_UAT/UI/UpliftLogin.aspx");
		Thread.sleep(5000);		
	}
	
	
	@Then("^User should goto e-AWB tab for creating Quick ASI$")
	public void User_should_goto_e_AWB_tab_for_creating_Quick_ASI() throws InterruptedException 
	{
		 Export.AdaniAMD_eAWBTab.click();Thread.sleep(500);
		 Export.AdaniAMD_QuickASI.click();Thread.sleep(1000);
		
	}
	
	

	@Then("^User should process Advance Shipment Info ASI submission$")
	public void User_should_process_Advance_Shipment_Info_ASI_submission() throws InterruptedException 
	{
		Thread.sleep(6000);
		wm.JavascriptExecutorClick(driver,Export.AdaniAMD_ASIMileStone);Thread.sleep(6000);
		 //Export.AdaniAMD_ASIMileStone.click();Thread.sleep(6000);
		 wm.isElementTextMatch(driver, Export.AdaniAMD_ASISubmissionScreen, "ASI Submission");Thread.sleep(8000);
		 Export.AdaniAMD_ASIProceedButton.click();Thread.sleep(15000);
		 Export.AdaniAMD_ASIProceedButtonYes.click();Thread.sleep(18000);
		 try
		 {
			 Export.AdaniAMD_ASIProceedButtonOk.click();Thread.sleep(12000);
		 }
		 catch (Exception E)
		 {
			 System.out.println("done");
		 }
		 
		 
	}
	
	@Then("^User should add Shipping Bill for single SB for kale GHA1 CTO$")
	public void User_should_add_Shipping_Bill_for_single_SB_for_kale_GHA1_CTO() throws InterruptedException 
	{
		Thread.sleep(8000);
		wm.JavascriptExecutorClick(driver, Export.AdaniAMD_AddSBMileStone);Thread.sleep(500);
		//Export.AdaniAMD_AddSBMileStone.click();Thread.sleep(500);
		wm.isElementTextMatch(driver, Export.AdaniAMD_AddSBDetailsScreen, "Shipping Bill Details");Thread.sleep(1000);
		
		
		Export.AdaniAMD_AddSBNumber1.sendKeys(cm.RandomNo(7));Thread.sleep(1000);
		Export.AdaniAMD_AddSBDate1.click();Thread.sleep(1000);
		Export.CurrentDate();Thread.sleep(1000);
		
		Select SelectSBTypeManual1 = new Select(Export.AdaniAMD_AddSBType1);Thread.sleep(500);
		SelectSBTypeManual1.selectByVisibleText("Manual");Thread.sleep(500);
		
		Export.AdaniAMD_AddSBNOP1.sendKeys("30");Thread.sleep(500);
		Export.AdaniAMD_AddSBGrossWt1.sendKeys("300");Thread.sleep(500);
		Export.AddSB();Thread.sleep(500);
		Thread.sleep(25000);
		Export.AdaniAMD_AddSBSave.click();Thread.sleep(7000);
		wm.JavascriptExecutorClick(driver, Export.AdaniAMD_AddSBSaveOk);Thread.sleep(8000);
		
	}
	
	
	//--------------------------------------------------------------------

		
		
		@Then("User should create shipment for E-Docket with quick ASI {string} CTO-Kale GHA1, Direct, Bonded, Same CHA")
		public void User_should_create_shipment_for_E_Docket_with_quick_ASI_and_CTO_Kale_GHA1_Direct_Bonded_Same_CHA(String CTO) throws InterruptedException 
		{
			
			   Select SelectCTO = new Select(Export.AdaniAMD_QuickASI_SelectCTODropdown);
			   SelectCTO.selectByVisibleText(CTO);Thread.sleep(500);
			   
			   Select SelectShipmentType = new Select(Export.AdaniAMD_QuickASI_ShipmentTypeDropdown);
			   SelectShipmentType.selectByVisibleText("Bonded");Thread.sleep(500);
			   
			   
			   Export.AdaniAMD_QuickASI_MAWBPrefix.sendKeys("999");Thread.sleep(500);
			   
			   Export.AdaniAMD_QuickASI_MAWBNumber.sendKeys(ACSAdaniAMD_Export.AdaniAMDExport23);Thread.sleep(500);
			   System.out.println("E Docket AWB No:" +ACSAdaniAMD_Export.AdaniAMDExport23);
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
			   wm.JavascriptExecutorClick(driver, Export.AdaniAMD_QuickASI_MessageAlertOK);Thread.sleep(8000);
			   
		}
		
		@Then("User Should Search E-Docket MAWB number {string} for further process")
		public void User_Should_Search_E_Docket_MAWB_number_for_further_process(String MAWBNo_EDocket) throws InterruptedException 
		{
			Export.AdaniAMD_FilterMAWBNo.sendKeys(ACSAdaniAMD_Export.AdaniAMDExport23);Thread.sleep(2000);
			Export.AdaniAMD_FilterOperator.click();Thread.sleep(3000);
			Export.AdaniAMD_FilterContains.click();Thread.sleep(8000);
			
		}
		
	
		@Then("^User should click on e-Docket milestone$")
		public void User_should_click_on_e_Docket_milestone() throws InterruptedException, AWTException 
		{
			Thread.sleep(15000);
			try
			{
				Export.AdaniAMD_eDockeUploadDocumentMilestone.click();Thread.sleep(2000);
			}
			catch (Exception E)
			{
				wm.JavascriptExecutorClick(driver, Export.AdaniAMD_eDockeViewDocumentMilestone);
				//Export.AdaniAMD_eDockeUploadDocumentMilestone.click();Thread.sleep(2000);
			}
			
			Thread.sleep(6000);
		}
		

		@Then("^User sholud check wrong type and size of document$")
		public void  User_sholud_check_wrong_type_and_size_of_document() throws InterruptedException, AWTException 
		{
			Thread.sleep(10000);
			 driver.switchTo().frame(0);
			  
			  // First doc
			
			 wm.JavascriptExecutorClick(driver, Export.AdaniAMD_eDockeSelectDocTypeDropdown);Thread.sleep(2000);
			   Select SelectDocType = new Select(Export.AdaniAMD_eDockeSelectDocTypeDropdown);
			   SelectDocType.selectByVisibleText("AWB Copy");Thread.sleep(500);
			   
			   Export.AdaniAMD_eDocketActionClearButton.click();Thread.sleep(2000);
			   
			 
				
			   wm.JavascriptExecutorClick(driver, Export.AdaniAMD_eDockeSelectDocTypeDropdown);Thread.sleep(2000);
				   Select SelectDocType3 = new Select(Export.AdaniAMD_eDockeSelectDocTypeDropdown);
				   SelectDocType3.selectByVisibleText("AWB Copy");Thread.sleep(500);
				   wm.JavascriptExecutorClick(driver, Export.AdaniAMD_eDockeBrowseButton);Thread.sleep(2000);
				   /*Actions a = new Actions(driver);
				      a.moveToElement(driver.findElement(By.id(("ctl00_hldPage_fuctlUploadDocs")))).click().
				      build().perform();*/
				   
					Robot rb3 = new Robot();
					rb3.delay(2000);
					StringSelection ss3 = new StringSelection("C:\\Users\\priyanka.sikchi\\OneDrive - Kale Logistics Solutions Private Limited\\Priyanka\\Kale Workspace\\ACS-Adani\\GitHub\\ACS-Adani\\AdaniAMD\\dummy documents\\doc1.docx");  rb3.delay(2000);
					Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss3, null);rb3.keyPress(KeyEvent.VK_CONTROL); rb3.delay(2000);
					rb3.keyPress(KeyEvent.VK_V); 
					rb3.delay(2000);
					rb3.keyPress(KeyEvent.VK_ENTER); rb3.delay(500);
					rb3.keyPress(KeyEvent.VK_ENTER);
					
					rb3.delay(2000);	
				
					//Export.AdaniAMD_eDockeUploadButton.click();Thread.sleep(2000);
				
			   //AdaniAMD_eDockeSubmitButton.click();Thread.sleep(3000);
			   //wm.JavascriptExecutorClick(driver, Export.AdaniAMD_eDocketOkButtonPopup);Thread.sleep(2000);
			   //wm.JavascriptExecutorClick(driver, Export.AdaniAMD_eDocketActionClearButton);Thread.sleep(2000);
			
			   driver.switchTo().defaultContent();Thread.sleep(500);
		}
	//-----------------------------AdaniAMDExport_EDocket1 --------------------------
		
		@Then("User should create shipment for E-Docket1 with quick ASI {string} CTO-Kale GHA1, Direct, Bonded, Same CHA")
		public void User_should_create_shipment_for_E_Docket1_with_quick_ASI_and_CTO_Kale_GHA1_Direct_Bonded_Same_CHA(String CTO) throws InterruptedException 
		{
			
			   Select SelectCTO = new Select(Export.AdaniAMD_QuickASI_SelectCTODropdown);
			   SelectCTO.selectByVisibleText(CTO);Thread.sleep(500);
			   
			   Select SelectShipmentType = new Select(Export.AdaniAMD_QuickASI_ShipmentTypeDropdown);
			   SelectShipmentType.selectByVisibleText("Bonded");Thread.sleep(500);
			   
			   
			   Export.AdaniAMD_QuickASI_MAWBPrefix.sendKeys("999");Thread.sleep(500);
			   Export.AdaniAMD_QuickASI_MAWBNumber.sendKeys(ACSAdaniAMD_Export.AdaniAMDExport24);Thread.sleep(500);
			   System.out.println("E Docket AWB No:" +ACSAdaniAMD_Export.AdaniAMDExport24);
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
			   wm.JavascriptExecutorClick(driver, Export.AdaniAMD_QuickASI_MessageAlertOK);Thread.sleep(6000);
			 //  Export.AdaniAMD_QuickASI_MessageAlertOK.click();Thread.sleep(6000);
		}
		
		@Then("^User should upload e-docket document in aeroprime login$")
		public void User_should_upload_e_docket_document_in_aeroprime_login() throws InterruptedException, AWTException 
		{
			 Export.eDocket1();Thread.sleep(2000);
		}
		
		@Then("^User Should Clear Uploaded Document$")
		public void User_Should_Clear_Uploaded_Document() throws InterruptedException, AWTException 
		{
			try
			{
				Export.AdaniAMD_eDockeViewDocumentMilestone.click();Thread.sleep(2000);
			}
			catch (Exception E)
			{
				wm.JavascriptExecutorClick(driver, Export.AdaniAMD_eDockeUploadDocumentMilestone);
				//Export.AdaniAMD_eDockeUploadDocumentMilestone.click();Thread.sleep(2000);
			}
			Export.ClearDocket();Thread.sleep(2000);
			
			
			
		}
		
		@Then("^User should goto CO Approval Screen$")
		public void User_should_goto_CO_Approval_Screen() throws InterruptedException, AWTException 
		{
			Export.AdaniAMD_COApprovalTab.click();Thread.sleep(2000);
		}
		
		@Then("^User should search MAWB Number$")
		public void User_should_search_MAWB_Number() throws InterruptedException, AWTException 
		{
			Export.AdaniAMD_COApprovalMAWBSearchText.sendKeys("999"+ACSAdaniAMD_Export.AdaniAMDExport24);Thread.sleep(2000);
			Export.AdaniAMD_COApprovalMAWBSearchButton.click();Thread.sleep(2000);
		}
		
		@Then("^User should verify uploaded document in CO-Approval screen$")
		public void User_should_verify_uploaded_document_in_CO_Approval_screen() throws InterruptedException, AWTException 
		{
			Thread.sleep(5000);	
			Export.AdaniAMD_COApprovalEDocketButton.click();Thread.sleep(12000);
			
		}
		
		@Then("^User should Download uploaded document in CO-Approval screen$")
		public void User_should_Download_uploaded_document_in_CO_Approval_screen() throws InterruptedException, AWTException 
		{
			
			
			driver.switchTo().frame(0);Thread.sleep(500);
			Export.AdaniAMD_COApprovalEDocketUploadedDoc.click();Thread.sleep(5000);
			driver.switchTo().defaultContent();Thread.sleep(500);
			Export.AdaniAMD_COApprovalEDocketPopUpClose.click();Thread.sleep(5000);
		}
		
		
		//------------------------- End @AdaniAMDExport_EDocke2 --------------------------
		
		@Then("^User should goto change password screen$")
		public void User_should_goto_change_password_screen() throws InterruptedException, AWTException 
		{
			
			Export.AdaniAMD_UserDropdown.click();Thread.sleep(2000);
			Export.AdaniAMD_ChangePassword.click();Thread.sleep(2000);
			
		}
		
		@Then("^User should check view password using view icon for login password$")
		public void User_should_check_view_password_using_view_icon_for_login_password() throws InterruptedException, AWTException 
		{
			driver.switchTo().frame(0);
			
			Export.AdaniAMD_OldPasswordText.sendKeys("Kale@JUN2425");Thread.sleep(1000);
			Export.AdaniAMD_OldPasswordViewIcon.click();Thread.sleep(1000);
			
			Export.AdaniAMD_NewPasswordText.sendKeys("Kale@123");Thread.sleep(1000);
			Export.AdaniAMD_NewPasswordViewIcon.click();Thread.sleep(1000);
			
			Export.AdaniAMD_ConfirmPasswordText.sendKeys("Kale@123");Thread.sleep(1000);
			Export.AdaniAMD_ConfirmPasswordViewIcon.click();Thread.sleep(1000);
			
			 driver.switchTo().defaultContent();Thread.sleep(500);
		}
		
		@Then("^User should check view password using view icon for transaction password$")
		public void User_should_check_view_password_using_view_icon_for_transaction_password() throws InterruptedException, AWTException 
		{
			
			driver.switchTo().frame(0);
			
			  Select SelectPasswordType = new Select(Export.AdaniAMD_ChangePasswordDropdown);
			  SelectPasswordType.selectByVisibleText("Transaction Password");Thread.sleep(500);
			
			Export.AdaniAMD_TransOldPasswordText.sendKeys("Kale@JUN2425");Thread.sleep(1000);
			Export.AdaniAMD_TransOldPasswordViewIcon.click();Thread.sleep(1000);
			
			Export.AdaniAMD_TransNewPasswordText.sendKeys("Kale@123");Thread.sleep(1000);
			Export.AdaniAMD_TransNewPasswordViewIcon.click();Thread.sleep(1000);
			
			Export.AdaniAMD_TransConfirmPasswordText.sendKeys("Kale@123");Thread.sleep(1000);
			Export.AdaniAMD_TransConfirmPasswordViewIcon.click();Thread.sleep(1000);
			
			 driver.switchTo().defaultContent();Thread.sleep(500);
			
		}
		
		@Then("^User should submit the password and need to login with new password but now we are cancel the change password screen$")
		public void User_should_submit_the_password_and_need_to_login_with_new_password_but_now_we_are_cancel_the_change_password_screen() throws InterruptedException, AWTException 
		{
			
			driver.switchTo().frame(0);
			Export.AdaniAMD_ChangePasswordCancelButton.click();Thread.sleep(2000);
			driver.switchTo().defaultContent();Thread.sleep(500);
			
		}
		
		
		
		@Then("User should create shipment for view password with quick ASI {string} CTO-Kale GHA1, Direct, Bonded, Same CHA")
		public void User_should_create_shipment_for_view_password_with_quick_ASI_and_CTO_Kale_GHA1_Direct_Bonded_Same_CHA(String CTO) throws InterruptedException 
		{
			
			   Select SelectCTO = new Select(Export.AdaniAMD_QuickASI_SelectCTODropdown);
			   SelectCTO.selectByVisibleText(CTO);Thread.sleep(500);
			   
			   Select SelectShipmentType = new Select(Export.AdaniAMD_QuickASI_ShipmentTypeDropdown);
			   SelectShipmentType.selectByVisibleText("Bonded");Thread.sleep(500);
			   
			   
			   Export.AdaniAMD_QuickASI_MAWBPrefix.sendKeys("999");Thread.sleep(500);
			   Export.AdaniAMD_QuickASI_MAWBNumber.sendKeys(ACSAdaniAMD_Export.AdaniAMDExport25);Thread.sleep(500);
			   System.out.println("E Docket AWB No:" +ACSAdaniAMD_Export.AdaniAMDExport25);
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
			   
			   Export.AdaniAMD_QuickASI_SaveAWB.click();Thread.sleep(16000);
			   wm.JavascriptExecutorClick(driver, Export.AdaniAMD_QuickASI_MessageAlertOK);Thread.sleep(6000);
		}
		
		@Then("User Should search View Password MAWB number {string} for further process")
		public void User_Should_search_View_Password_MAWB_number_for_further_process(String MAWBNo_ViewPassword) throws InterruptedException 
		{
			Export.AdaniAMD_FilterMAWBNo.sendKeys(ACSAdaniAMD_Export.AdaniAMDExport25);Thread.sleep(2000);
			Export.AdaniAMD_FilterOperator.click();Thread.sleep(3000);
			Export.AdaniAMD_FilterContains.click();Thread.sleep(5000);
			
		}
		
		@Then("^User should process TSP Payment for checking view password$")
		public void User_should_process_TSP_Payment_fo_checking_view_password() throws InterruptedException 
		{
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
			Thread.sleep(5000);
			wm.isElementTextMatch(driver, Export.AdaniAMD_TSPPaymentScreen, "TSP Payment");Thread.sleep(5000);
			Thread.sleep(5000);
			 Select TSPCargoType = new Select(Export.AdaniAMD_TSPCargoTypeDropdown);Thread.sleep(5000);
			 TSPCargoType.selectByVisibleText("General Cargo");Thread.sleep(3000);
			 Select TSPComodityName = new Select(Export.AdaniAMD_TSPComodityName);Thread.sleep(2000);
			 
			 try 
			 {
				 
				 TSPComodityName.selectByVisibleText("ANTENNAS : GEN");Thread.sleep(3000);
			 }
			 catch (Exception E)
			 {
				 
				 TSPComodityName.selectByVisibleText("MISC ITEMS : GEN");Thread.sleep(3000);
			 }
			 
			 Thread.sleep(9000);
			 Export.AdaniAMD_TSPHSNCode.sendKeys(cm.RandomNo(5));Thread.sleep(6000);
			 Export.AdaniAMD_TSPTransactionPassword.sendKeys("Kale@JUN2425");Thread.sleep(1000);
			 Export.AdaniAMD_TSPTransactionPasswordViewIcon.click();Thread.sleep(1000);
			 
			
		}		
		
		
		//------------------------- End @AdaniAMDExport_ViewPasswordNewCR --------------------------
		
		
		@Then("^User should go to e-booking tab for subtab create$")
		public void User_should_go_to_e_booking_tab_for_subtab_create() throws InterruptedException, AWTException 
		{
			Actions ebookingaction = new Actions(driver);
			ebookingaction.moveToElement(Export.AdaniAMD_EBookigTab).perform();Thread.sleep(500);
			Export.AdaniAMD_EBookigCreate.click();Thread.sleep(1000);
			
		}
		
		@Then("^User should verify e-booking create page$")
		public void User_should_verify_e_booking_create_page() throws InterruptedException, AWTException 
		{
			wm.isElementTextMatch(driver, Export.AdaniAMD_EBookigCreatePageVerify, "Create");Thread.sleep(2000);
			
		}
		
		@Then("^User should click on plus icon for add shipper details$")
		public void User_should_click_on_plus_icon_for_add_shipper_details() throws InterruptedException, AWTException 
		{
			
			Export.AdaniAMD_EBookigCreateShipperDetailPlusIcon.click();Thread.sleep(2000);
			wm.isElementTextMatch(driver, Export.AdaniAMD_EBookigCreateShipperVerify, "Add Shipper");Thread.sleep(2000);
			
		}
		
		@Then("^User should fill required shipper details$")
		public void User_should_fill_required_shipper_details() throws InterruptedException, AWTException 
		{
			Export.EBookingAddShipper();Thread.sleep(4000);
			
		}
		
		@Then("^User should click on plus icon for add consignee details$")
		public void User_should_click_on_plus_icon_for_add_consignee_details() throws InterruptedException, AWTException 
		{
			Thread.sleep(5000);
			Export.AdaniAMD_EBookigCreateConsigneeDetailPlusIcon.click();Thread.sleep(2000);
			wm.isElementTextMatch(driver, Export.AdaniAMD_EBookigCreateConsigneeVerify, "Add Consignee");Thread.sleep(2000);
		}
		
		@Then("^User should fill required consignee details$")
		public void User_should_fill_required_consignee_details() throws InterruptedException, AWTException 
		{
			Export.EBookingAddConsignee();Thread.sleep(2000);
		}
		
		@Then("^User should select destination$")
		public void User_should_select_destination() throws InterruptedException, AWTException 
		{
			Export.AdaniAMD_EBookingDestination.sendKeys("DXB");Thread.sleep(2000);
			
		}
		
		@Then("^User Should Add Dimension Details$")
		public void User_Should_Add_Dimension_Details() throws InterruptedException, AWTException 
		{
			
			  JavascriptExecutor js = (JavascriptExecutor) driver;
		      js.executeScript("arguments[0].scrollIntoView();",Export.AdaniAMD_EBookigSaveAsTemplete);Thread.sleep(1000);
		
			Export.AdaniAMD_EBookigAddDimensionIcon1.click();Thread.sleep(1000);
			Export.AdaniAMD_AddSBDimNOP1.sendKeys("15");Thread.sleep(1000);
			Export.AddDimension1();Thread.sleep(1000);
			Export.AdaniAMD_EBookingGrossWt1.sendKeys("150");Thread.sleep(1000);
			Export.AdaniAMD_EBookingCargoDescription1.sendKeys("PAPER");Thread.sleep(1000);
			
			Export.AdaniAMD_EBookigAddDimensionActionPlusButton1.click();Thread.sleep(1000);
			Export.AdaniAMD_EBookigAddDimensionIco2.click();Thread.sleep(1000);
			Export.AdaniAMD_AddSBDimNOP1.sendKeys("15");Thread.sleep(1000);
			Export.AddDimension1();Thread.sleep(1000);
			Export.AdaniAMD_EBookingGrossWt2.sendKeys("150");Thread.sleep(1000);
			Export.AdaniAMD_EBookingCargoDescription2.sendKeys("PAPER");
			
			
		}
		
		@Then("^User Should select customs broker as Aeroprime$")
		public void User_Should_select_customs_broker_as_Aeroprime() throws InterruptedException, AWTException 
		{
			
			Export.AdaniAMD_EBookingCustomBrokerCheckBox.click();
			Select SelectCustomBrokerAeroprime = new Select(Export.AdaniAMD_EBookingCustomBrokerDropDown);Thread.sleep(500);
			SelectCustomBrokerAeroprime.selectByVisibleText("AEROPRIME Cargo Pvt Ltd.");Thread.sleep(500);
			
		}
		
		@Then("^User should save e-booking as save$")
		public void User_should_save_e_booking_as_save() throws InterruptedException, AWTException 
		{
			Thread.sleep(3000);
			 JavascriptExecutor js = (JavascriptExecutor) driver;
		     js.executeScript("arguments[0].scrollIntoView();",Export.AdaniAMD_EBookigSaveAsTemplete);Thread.sleep(1000);
			wm.JavascriptExecutorClick(driver, Export.AdaniAMD_EBookigSave);Thread.sleep(4000);
			Export.AdaniAMD_EBookigSaveCopyPopUpNo.click();Thread.sleep(3000);
			
		}
		
		//---------------------------- End AdaniAMDExport_eBookingCreate  -----------------------
		
		@Then("^User Should select customs broker as Jeena and Company$")
		public void User_Should_select_customs_broker_as_Jeena_and_Company() throws InterruptedException, AWTException 
		{
			
			Export.AdaniAMD_EBookingCustomBrokerCheckBox.click();
			Select SelectCustomBrokerAeroprime = new Select(Export.AdaniAMD_EBookingCustomBrokerDropDown);Thread.sleep(500);
			SelectCustomBrokerAeroprime.selectByVisibleText("JEENA & COMPANY");Thread.sleep(500);
			
		}
		
		@Then("^User should save e-booking and click on create another job$")
		public void User_should_save_e_booking_and_click_on_create_another_job() throws InterruptedException, AWTException 
		{
			 JavascriptExecutor js = (JavascriptExecutor) driver;
		     js.executeScript("arguments[0].scrollIntoView();",Export.AdaniAMD_EBookigSaveAsTemplete);Thread.sleep(1000);
			wm.JavascriptExecutorClick(driver, Export.AdaniAMD_EBookigSave);Thread.sleep(5000);
			wm.JavascriptExecutorClick(driver, Export.AdaniAMD_EBookigCreateAnotherJobButton);Thread.sleep(5000);
			
		}
		
		//------------------------------ End AdaniAMDExport_eBookingCreateAnotherJob ------------------------
		
		@Then("^User should save e-booking for save as templete$")
		public void User_should_save_e_booking_for_save_as_templete() throws InterruptedException, AWTException 
		{
			 JavascriptExecutor js = (JavascriptExecutor) driver;
		     js.executeScript("arguments[0].scrollIntoView();",Export.AdaniAMD_EBookigSaveAsTemplete);Thread.sleep(1000);
			wm.JavascriptExecutorClick(driver, Export.AdaniAMD_EBookigSaveAsTempleteButton);Thread.sleep(3000);
			Export.AdaniAMD_EBookigTempleteNameText.sendKeys("Templete" +cm.RandomNo(3));
			Export.AdaniAMD_EBookigTempleteNameOk.click();Thread.sleep(1000);
			Export.AdaniAMD_EBookigPopupBookingStatusOk.click();Thread.sleep(1000);
			
		}
		
		@Then("^User should verify templete listing page$")
		public void User_should_verify_templete_listing_page() throws InterruptedException, AWTException 
		{
			cm.Verify(verify, Export.AdaniAMD_EBookigTempleteListningPage);
			
		}
		
		//------------------------- End AdaniAMDExport_eBookingCreateSaveAsTemplete -----------------------
		
		@Then("^User should save e-booking for save as draft$")
		public void User_should_save_e_booking_for_save_as_draft() throws InterruptedException, AWTException 
		{
			 JavascriptExecutor js = (JavascriptExecutor) driver;
		     js.executeScript("arguments[0].scrollIntoView();",Export.AdaniAMD_EBookigSaveAsTemplete);Thread.sleep(1000);
			wm.JavascriptExecutorClick(driver, Export.AdaniAMD_EBookigSaveAsDraftButton);Thread.sleep(3000);
			Export.AdaniAMD_EBookigDraftNameText.sendKeys("Draft" +cm.RandomNo(3));
			Export.AdaniAMD_EBookigDraftNameOk.click();Thread.sleep(1000);
			Export.AdaniAMD_EBookigPopupBookingStatusOk.click();Thread.sleep(1000);
			
		}
		
		
		@Then("^User should verify draft listing page$")
		public void User_should_verify_draft_listing_page() throws InterruptedException, AWTException 
		{
			cm.Verify(verify, Export.AdaniAMD_EBookigDraftListningPage);
			
		}
		
		//------------------- End AdaniAMDExport_eBookingCreateSaveAsDraft --------------------------
		
		@Then("^User should Click on Receive from sub-menu of e-Booking$")
		public void User_should_Click_on_Receive_from_sub_menu_of_e_Booking() throws InterruptedException, AWTException 
		{
			Actions ebookingaction = new Actions(driver);
			ebookingaction.moveToElement(Export.AdaniAMD_EBookigTab).perform();Thread.sleep(500);
			Export.AdaniAMD_EBookigSubMenuSave.click();Thread.sleep(1000);
			
		}
		
		@Then("^User should Select a checkbox and click on Forward to Airline button$")
		public void User_should_Select_a_checkbox_and_click_on_Forward_to_Airline_button() throws InterruptedException, AWTException 
		{
			Export.AdaniAMD_EBookigSaveSelectCheckBox.click();Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView();",Export.AdaniAMD_EBookigSaveForwardToAirlineButton);Thread.sleep(1000);
			Export.AdaniAMD_EBookigSaveForwardToAirlineButton.click();Thread.sleep(1000);
			
		}
		
		@Then("^User should display Shipment Type dialogue box Click on NO and click on Submit button$")
		public void User_should_display_Shipment_Type_dialogue_box_Click_on_NO_and_click_on_Submit_button() throws InterruptedException, AWTException 
		{
			 wm.isElementTextMatch(driver, Export.AdaniAMD_EBookigSaveShipmentTypePopup, "Shipment Type");Thread.sleep(1000);
			Export.AdaniAMD_EBookigSaveShipmentTypeSubmitButton.click();Thread.sleep(1000);
			
		}
		
		@Then("^User Should Select Schedule Date from the calendar icon$")
		public void User_Should_Select_Schedule_Date_from_the_calendar_icon() throws InterruptedException, AWTException 
		{
			Export.AdaniAMD_EBookigSaveSeheduleforCalenderIcon.click();Thread.sleep(1000);
			Export.AdaniAMD_EBookigSaveScheduleCurrentDate.click();Thread.sleep(1000);
			
		}
		
		@Then("^User should Click on Get Schedule button$")
		public void User_should_Click_on_Get_Schedule_button() throws InterruptedException, AWTException 
		{
			
			Export.AdaniAMD_EBookigSaveGetScheduleButton.click();Thread.sleep(35000);
			
		}
		
		@Then("^User should Enter all the Filght details$")
		public void User_should_Enter_all_the_Filght_details() throws InterruptedException, AWTException 
		{
			
			Export.AdaniAMD_EBookigSaveFlightDetailCheckBox.click();Thread.sleep(1000);
			Export.AdaniAMD_EBookigSaveFlightDetailAirwayBillFrefix.sendKeys("999"); Thread.sleep(1000);
			Export.AdaniAMD_EBookigSaveFlightDetailAirWayBillNo.clear();Thread.sleep(1000); 
			Export.AdaniAMD_EBookigSaveFlightDetailAirWayBillNo.sendKeys(ACSAdaniAMD_Export.AdaniAMDExport); Thread.sleep(1000);
			Export.AdaniAMD_EBookigSaveFlightDetailAirWayBillNo.sendKeys(ACSAdaniAMD_Export.AdaniAMDExport); Thread.sleep(1000);
			Export.AdaniAMD_EBookigSaveFlightDetailFlightNo.sendKeys(cm.RandomNo(4)); Thread.sleep(1000);
			
			
		}
		
		@Then("^User should click on submit Filght details button$")
		public void User_should_click_on_submit_Filght_details_button() throws InterruptedException, AWTException 
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView();",Export.AdaniAMD_EBookigSaveSubmitFlightDetailsButton);Thread.sleep(1000);
			Export.AdaniAMD_EBookigSaveSubmitFlightDetailsButton.click();Thread.sleep(15000);
			Export.AdaniAMD_EBookigSaveSubmitFlightDetailsPopupYes.click();Thread.sleep(3000);
			
		}
		
		@Then("^User should display booking status popup select no for MAWB createtion$")
		public void User_should_display_booking_status_popup_select_no_for_MAWB_createtion() throws InterruptedException, AWTException 
		{
			
			Export.AdaniAMD_EBookigSaveSubmitFlightDetailsBookingStatuPopUpNo.click();Thread.sleep(5000);
			System.out.println("Sent Job page displayed");
			
		}
		
		@Then("^User should Click on Booking Request Tab$")
		public void User_should_Click_on_Booking_Request_Tab() throws InterruptedException, AWTException 
		{
			
			Export.AdaniAMD_AirlineLoginBookingRequestTab.click();Thread.sleep(5000);
			
			
		}
		
		@Then("^User should be verify Booking request$")
		public void User_should_be_verify_Booking_request() throws InterruptedException, AWTException 
		{
			
			wm.isElementTextMatch(driver, Export.AdaniAMD_AirlineLoginBookingRequestVerify, "Sent Bookings");
			
		}
		//-------------------------- End AdaniAMDExport_eBookingForwardJobToAirline -----------------------
		
		@Then("^User should Click on Sent from sub-menu of e-Booking$")
		public void User_should_Click_on_Send_from_sub_menu_of_e_Booking() throws InterruptedException, AWTException 
		{
			Actions ebookingaction = new Actions(driver);
			ebookingaction.moveToElement(Export.AdaniAMD_EBookigTab).perform();Thread.sleep(500);
			Export.AdaniAMD_EBookigSubMenuSent.click();Thread.sleep(1000);
			
		}
		
		@Then("^User should Click on Create MAWB from the drop down of Select Action from Action column$")
		public void User_should_Click_on_Create_MAWB_from_the_drop_down_of_Select_Action_from_Action_column() throws InterruptedException, AWTException 
		{
			
			Select SelectActionCreateMAWB = new Select(Export.AdaniAMD_EBookingSentActionDropdown);Thread.sleep(500);
			SelectActionCreateMAWB.selectByVisibleText(" Create MAWB");Thread.sleep(500);Thread.sleep(2000);
		}
		
		
		@Then("^User should be able to enter all create AWB details$")
		public void User_should_be_able_to_enter_all_create_AWB_details() throws InterruptedException, AWTException 
		{
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView();",Export.AdaniAMD_EBookingCreateAWBRateAsAgreedCheckBox);Thread.sleep(1000);
		    
		    Select SelectCreateMAWBChargeCode = new Select(Export.AdaniAMD_EBookingCreateAWBChargeCode);Thread.sleep(500);
		    SelectCreateMAWBChargeCode.selectByVisibleText("CA");Thread.sleep(500);Thread.sleep(1000);
			
		    Export.AdaniAMD_EBookingCreateAWBCustomeBrokerDropdown.click();Thread.sleep(500);
		    wm.JavascriptExecutorClick(driver, Export.AdaniAMD_EBookingCreateAWBCustomeBrokerAeroprime);Thread.sleep(500);
		    
			
			
			  JavascriptExecutor js1 = (JavascriptExecutor) driver;
			  js1.executeScript("arguments[0].scrollIntoView();",Export.AdaniAMD_EBookingCreateAWBSaveButton);Thread.sleep(1000);
			  
			  Export.AdaniAMD_EBookingCreateAWBRateAsAgreedCheckBox.click();Thread.sleep(500);Thread.sleep(1000);
			Select SelectCreateMAWBRateClass1 = new Select(Export.AdaniAMD_EBookingCreateAWBRateClass1);Thread.sleep(500);
			SelectCreateMAWBRateClass1.selectByVisibleText("C");Thread.sleep(500);Thread.sleep(1000);
			
			Export.AdaniAMD_EBookingCreateAWBCommodityItem1.sendKeys(cm.RandomNo(5));
			Export.AdaniAMD_EBookingCreateAWBChargableWt1.sendKeys("150");Thread.sleep(500);
			
			
			Select SelectCreateMAWBRateClass2 = new Select(Export.AdaniAMD_EBookingCreateAWBRateClass2);Thread.sleep(500);
			SelectCreateMAWBRateClass2.selectByVisibleText("B");Thread.sleep(500);Thread.sleep(1000);
			
			Export.AdaniAMD_EBookingCreateAWBCommodityItem2.sendKeys(cm.RandomNo(5));
			Export.AdaniAMD_EBookingCreateAWBChargableWt2.sendKeys("150");Thread.sleep(500);
			
			  JavascriptExecutor js2 = (JavascriptExecutor) driver;
			  js2.executeScript("arguments[0].scrollIntoView();",Export.AdaniAMD_EBookingCreateAWBSaveButton);Thread.sleep(1000);
		
			wm.JavascriptExecutorClick(driver, Export.AdaniAMD_EBookingCreateAWBSaveButton);Thread.sleep(1000);
		}
		//---------------------------- End AdaniAMDExport_eBookingSentJobToAirline -----------------------
		
		@Then("^User should Click on Draft from sub-menu of e-Booking$")
		public void User_should_Click_on_Draft_from_sub_menu_of_e_Booking() throws InterruptedException, AWTException 
		{
			Actions ebookingaction = new Actions(driver);
			ebookingaction.moveToElement(Export.AdaniAMD_EBookigTab).perform();Thread.sleep(500);
			Export.AdaniAMD_EBookigSubMenuDrafts.click();Thread.sleep(1000);
			
		}
		
		@Then("^User should display Booking Drafts page and save drafts list$")
		public void User_should_display_Booking_Drafts_page_and_save_drafts_list() throws InterruptedException , AWTException 
		{
			 wm.isElementTextMatch(driver, Export.AdaniAMD_EBookigDraftListningPage1, "Draft No.");Thread.sleep(1000);
			System.out.println("Draft listning page display");
		}
		
		@Then("^User should be able to click on Draft No in the Draft No column$")
		public void User_should_be_able_to_click_on_Draft_No_in_the_Draft_No_column() throws InterruptedException, AWTException 
		{
			Export.AdaniAMD_EBookigDraftNo.click();Thread.sleep(1000);	
		}
		
		@Then("^User should be able to click on Create Job button$")
		public void User_should_be_able_to_click_on_Create_Job_button() throws InterruptedException, AWTException 
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView();",Export.AdaniAMD_EBookigDraftCreateJobButton);Thread.sleep(1000);
			Export.AdaniAMD_EBookigDraftCreateJobButton.click();Thread.sleep(15000);	
			Export.AdaniAMD_EBookigSaveCopyPopUpNo.click();Thread.sleep(3000);
			
		}
		//---------------------------- End AdaniAMDExport_eBookingSeeAndCreatDraftJob ------------------------------------
		
		@Then("^User should be able to edit job$")
		public void User_should_be_able_to_edit_job() throws InterruptedException, AWTException 
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView();",Export.AdaniAMD_EBookigDraftCreateJobButton);Thread.sleep(1000);
			Export.AdaniAMD_EBookingCargoDescription1.clear();Thread.sleep(1000);	
			Export.AdaniAMD_EBookingCargoDescription1.sendKeys("Glass");Thread.sleep(1000);
			
		}
		
		@Then("^User should be able to click on Save Changes button$")
		public void User_should_be_able_to_click_on_Save_Changes_button() throws InterruptedException, AWTException 
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView();",Export.AdaniAMD_EBookigDraftSaveChanges);Thread.sleep(1000);
			Export.AdaniAMD_EBookigDraftSaveChanges.click();Thread.sleep(3000);	
			wm.JavascriptExecutorClick(driver, Export.AdaniAMD_EBookigPopupBookingStatusOk);Thread.sleep(3000);
			
		}
	
		// ------------------------ End AdaniAMDExport_eBookingEditDraftJob -----------------------------
		
		@Then("^User should be able to click on delete icon for draft$")
		public void User_should_be_able_to_click_on_delete_icon_for_draft() throws InterruptedException, AWTException 
		{
			Export.AdaniAMD_EBookigDraftDeleteIcon.click();Thread.sleep(1000);
			wm.JavascriptExecutorClick(driver, Export.AdaniAMD_EBookigDraftDeletePopup);Thread.sleep(3000);
			wm.JavascriptExecutorClick(driver, Export.AdaniAMD_EBookigDraftDeletePopupOk);Thread.sleep(3000);
			
		}
	
		// ------------------------ End AdaniAMDExport_eBookingDeleteDraftJob -----------------------------
		
		@Then("^User should Click on Templete from sub-menu of e-Booking$")
		public void User_should_Click_on_Templete_from_sub_menu_of_e_Booking() throws InterruptedException, AWTException 
		{
			Actions ebookingaction = new Actions(driver);
			ebookingaction.moveToElement(Export.AdaniAMD_EBookigTab).perform();Thread.sleep(500);
			Export.AdaniAMD_EBookigSubMenuTemplete.click();Thread.sleep(1000);
			
		}
		
		@Then("^User should display Booking Templete page and save Templete list$")
		public void User_should_display_Booking_Templete_page_and_save_Templete_list() throws InterruptedException , AWTException 
		{
			 wm.isElementTextMatch(driver, Export.AdaniAMD_EBookingTempleteListningPage1, "Template Name");Thread.sleep(1000);
			System.out.println("Templete listning page display");
		}
		
		@Then("^User should be able to click on Templete No in the Templete Name column$")
		public void User_should_be_able_to_click_on_Templete_No_in_the_Templete_Name_column() throws InterruptedException, AWTException 
		{
			Export.AdaniAMD_EBookingTempleteName.click();Thread.sleep(1000);	
		}
		
		
		//---------------------------- End AdaniAMDExport_eBookingSeeAndCreatTempleteJob ------------------------------------
		
		@Then("^User should be able to edit templete job$")
		public void User_should_be_able_to_edit_templete_job() throws InterruptedException, AWTException 
		{
			Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView();",Export.AdaniAMD_EBookigSaveAsTemplete);Thread.sleep(1000);
			Export.AdaniAMD_EBookingCargoDescription1.clear();Thread.sleep(1000);	
			Export.AdaniAMD_EBookingCargoDescription1.sendKeys("Glass");Thread.sleep(1000);
			
		}
		
		@Then("^User should be able to click on Templete No in the Templete Name column for edit$")
		public void User_should_be_able_to_click_on_Templete_No_in_the_Templete_Name_column_for_edit() throws InterruptedException, AWTException 
		{
			Export.AdaniAMD_EBookingTempleteNameEdit.click();Thread.sleep(1000);	
		}
		
		
		//---------------------------- End AdaniAMDExport_eBookingEditTempleteJob ------------------------------------
		
		@Then("^User should be able to click on delete icon for templete$")
		public void User_should_be_able_to_click_on_delete_icon_for_templete() throws InterruptedException, AWTException 
		{
			Export.AdaniAMD_EBookigTempleteDeleteIcon.click();Thread.sleep(1000);
			wm.JavascriptExecutorClick(driver, Export.AdaniAMD_EBookigTempleteDeletePopup);Thread.sleep(3000);
			wm.JavascriptExecutorClick(driver, Export.AdaniAMD_EBookigTempleteDeletePopupOk);Thread.sleep(3000);
			
		}
	
		// ------------------------ End AdaniAMDExport_eBookingDeleteTempleteJob -----------------------------
		
		
		@Then("^User should Click on e-Docket from sub-menu of e-Booking$")
		public void User_should_Click_on_e_Docket_from_sub_menu_of_e_Booking() throws InterruptedException, AWTException 
		{
			Actions ebookingaction = new Actions(driver);
			ebookingaction.moveToElement(Export.AdaniAMD_EBookigTab).perform();Thread.sleep(500);
			Export.AdaniAMD_EBookigSubMenuEDocket.click();Thread.sleep(1000);
			
		}
		
		@Then("^User should display e-Docket page$")
		public void User_should_display_e_Docket_page() throws InterruptedException , AWTException 
		{
			 wm.isElementTextMatch(driver, Export.AdaniAMD_EBookigEDocketListningPage, "e-Docket");Thread.sleep(1000);
			System.out.println("E-Docket page display");Thread.sleep(1000);
		}
		
		@Then("^User should be able to click on Booking from drop down of Job Type and Job Id from drop down of Job Id$")
		public void User_should_be_able_to_click_on_Booking_from_drop_down_of_Job_Type_and_Job_Id_from_drop_down_of_Job_Id() throws InterruptedException, AWTException 
		{
			Select SelectEDocketJobType = new Select(Export.AdaniAMD_EBookigEDocketJobTypeDropdown);Thread.sleep(500);
			SelectEDocketJobType.selectByVisibleText("Booking");Thread.sleep(500);Thread.sleep(1000);
			
			Select SelectEDocketJobID = new Select(Export.AdaniAMD_EBookigEDocketJobIDDropdown);Thread.sleep(500);
			SelectEDocketJobID.selectByIndex(4);Thread.sleep(1000);
		}
		
		@Then("^User should be displayed Job Details in the Job Details setion$")
		public void User_should_be_displayed_Job_Details_in_the_Job_Details_setion() throws InterruptedException, AWTException 
		{
			wm.isElementTextMatch(driver, Export.AdaniAMD_EBookigEDocketJobDetails, "Job Details:"); Thread.sleep(1000);
			
		}
		@Then("^User should de displayed Uploaded e-Docket document in the Associated Document section$")
		public void User_should_de_displayed_Uploaded_e_Docket_document_in_the_Associated_Document_section() throws InterruptedException, AWTException 
		{
			wm.isElementTextMatch(driver, Export.AdaniAMD_EBookigEDocketAssociatedDocuments, "Associated Documents");Thread.sleep(1000);
			
		}
		//---------------------------- End AdaniAMDExport_eBooking_eDocket ------------------------------------
}	
		