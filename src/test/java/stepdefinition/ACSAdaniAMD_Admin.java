package stepdefinition;


import static Helper.BaseObjects.driver;
import static Helper.BaseObjects.loginScreen;
import static Helper.BaseObjects.wm;
import static Helper.BaseObjects.cm;
import static Helper.BaseObjects.Admin;
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
import com.sun.xml.bind.v2.schemagen.xmlschema.Import;

import Methods.CommonMethods;
import Methods.WebDriverMethod;
import Methods.WebdriverMethods;
import TestDataOperations.TestDataReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ACSAdaniAMD_Admin {
	
	 String AdaniAMDImport1 = cm.Random_AWBNo();
	
	
	public boolean verify;

	@When("I login with {string} user given in {string} sheet for Admin module")
	public void i_login_with_user_given_in_sheet_for_for_Admin_module(String entity, String sheetName) throws Throwable {
		Entity = entity;
		TestDataReader.ReadLoginDetails(Entity);
		Thread.sleep(500);
		System.out.println("usr= " + Username);
		System.out.println("pwd= " + Password);
		// loginScreen.isLoginScreenDisplayed();
		loginScreen.Login(Entity, Username, Password);
		Thread.sleep(8000);

	}
	
	@When("^User should be able to click on Admin mode$")
	public void User_should_be_able_to_click_on_Admin_mode() throws Throwable 
	{
		Admin.AdaniAdminModule.click();Thread.sleep(10000);

	}
	
	//-------------------------------
	
	@Then("^User should go to Account Managment tab for sub credit update$")
	public void User_should_go_to_Account_Managment_tab_for_sub_credit_update() throws Throwable 
	{
		/*Actions ebookingaction = new Actions(driver);
		ebookingaction.moveToElement(Admin.AdaniAdminAccountManagmentTab).perform();Thread.sleep(500);
		Admin.AdaniAdminAccountManagmentTabCreditUpdae.click();Thread.sleep(500);*/
	} 
	
	@Then("^User should verify account credit update page should be displayed$")
	public void User_should_verify_account_credit_update_page_should_be_displayed() throws Throwable 
	{
		wm.isElementTextMatch(driver, Admin.AdaniAdminDetailsPage, "Account Credit Request");Thread.sleep(500);
		
	}
	
	@Then("^User should fill credit request details$")
	public void User_should_fill_credit_request_details() throws Throwable 
	{
		Thread.sleep(500);
		Select CreditTypeDropdown = new Select(Admin.AdminCreditRequestCreditTypeDropdown);Thread.sleep(1000);		
		CreditTypeDropdown.selectByVisibleText("Cheque/DD/PO");Thread.sleep(500);
		Admin.AdminCreditRequestBankName.sendKeys("ICICI Bank");Thread.sleep(500);
		Admin.AdminCreditRequestBranchName.sendKeys("Kale Logistics Solutions Pvt. Ltd.");Thread.sleep(500);
		Admin.AdminCreditRequestCheckNumber.sendKeys("UAT"+cm.RandomNo(4));Thread.sleep(500);
		Admin.AdminCreditRequestAmount.sendKeys("1500");Thread.sleep(500);
	}
	
	@Then("^User should click on submit button after fill credit request details$")
	public void User_should_click_on_submit_button_after_fill_credit_request_details() throws Throwable 
	{
		
		Thread.sleep(15000);
		Admin.AdminCreditRequestSubmitButton.click();Thread.sleep(3000);	
		Admin.AdminCreditRequestSubmitButtonOkPopup.click();Thread.sleep(2000);	
	}
	
	@Then("^User should logout adani application$")
	public void User_should_logout_adani_application() throws Throwable 
	{
		Thread.sleep(8000);
		wm.driver.get("https://acsadaniuat.kalelogistics.com/ACS_AMD_UAT/UI/UpliftLogin.aspx");
		Thread.sleep(5000);		
	}
	

	@Then("^User should logout adani application with logout function$")
	public void User_should_logout_adani_application_with_logout_function() throws Throwable 
	{
		Thread.sleep(8000);
		Admin.AdminAroprimeMenu.click();
		Admin.AdminAroprimeLogout.click();
		Thread.sleep(5000);		
	}
	
	@Then("^User should go to Account tab for sub menu PD status update$")
	public void User_should_go_to_Account_tab_for_sub_menu_PD_status_update() throws Throwable 
	{
		
		Thread.sleep(1000);
		Actions AdminAccountTab = new Actions(driver);
		AdminAccountTab.moveToElement(Admin.AdaniAdminAccountTab).perform();Thread.sleep(500);
		Admin.AdminAccountStatusUpdate.click();Thread.sleep(1000);		

	}
	
	@Then("^User should verify PD status update page should be displayed$")
	public void User_should_verify_PD_status_update_page_should_be_displayed() throws Throwable 
	{
		
	}
	
	@Then("^User should select credit type from dropdown$")
	public void User_should_select_credit_type_from_dropdown() throws Throwable 
	{
		Select CreditTypeDropdown = new Select(Admin.AdminCreditRequestCreditTypeDropdown);Thread.sleep(1000);		
		CreditTypeDropdown.selectByVisibleText("Cheque/DD/PO");Thread.sleep(1500);
	}
	
	@Then("^User should select status from dropdown$")
	public void User_should_select_status_from_dropdown() throws Throwable 
	{
		Select FinancePDStatus = new Select(Admin.FinancePDStatus);Thread.sleep(1000);		
		FinancePDStatus.selectByVisibleText("Created");Thread.sleep(1500);
	}
	
	@Then("^User should click on search button for PD update status$")
	public void User_should_click_on_search_button_for_PD_update_status() throws Throwable 
	{
		Admin.AdaniAdminAdvanceReceiptSearchButton.click();Thread.sleep(2500);
	}
	
	@Then("^User should change status as cleared from grid$")
	public void User_should_change_status_as_cleared_from_grid() throws Throwable 
	{
		Select FinancePDGridStatus = new Select(Admin.FinancePDGridStatus);Thread.sleep(1000);		
		FinancePDGridStatus.selectByVisibleText("Cleared");Thread.sleep(1500);
	}
	
	@Then("^User should Save status change$")
	public void User_should_Save_status_change() throws Throwable 
	{
		 JavascriptExecutor js1 = (JavascriptExecutor) driver;
	       js1.executeScript("arguments[0].scrollIntoView();",Admin.FinancePDGridStatusSaveButton);Thread.sleep(1000);
	       
	       Admin.FinancePDGridStatusSaveButton.click();Thread.sleep(2500);
	       Admin.AdminCreditRequestSubmitButtonOkPopup.click();Thread.sleep(2500);
	}
	
	@Then("^User Should verify PD status as cleared$")
	public void User_Should_verify_PD_status_as_cleared() throws Throwable 
	{
		Select CreditTypeDropdown = new Select(Admin.FinancePDStatus);Thread.sleep(1000);		
		CreditTypeDropdown.selectByVisibleText("Cleared");Thread.sleep(1500);
	}
	
	//---------------- End AdaniAMDAdmin_01 --------------------
	
	
	@Then("^User should check Admin Details page should be displayed$")
	public void User_should_check_Admin_Details_page_should_be_displayed() throws Throwable 
	{
		wm.isElementTextMatch(driver, Admin.AdaniAdminDetailsPage, "Account Credit Request");Thread.sleep(1000);

	}
	
	//--------------------------------------
	
	@Then("^User should go to Account Managment tab for sub menu Account Ledger$")
	public void User_should_go_to_Account_Managment_tab_for_sub_menu_Account_Ledger() throws Throwable 
	{
		Actions ebookingaction = new Actions(driver);
		ebookingaction.moveToElement(Admin.AdaniAdminAccountManagmentTab).perform();Thread.sleep(500);
		Admin.AdaniAdminAccountManagmentTabAccountLedger.click();Thread.sleep(1000);		

	}
	
	@Then("^User should verify PD Acc Report page should be displayed$")
	public void User_should_verify_PD_Acc_Report_page_should_be_displayed() throws Throwable 
	{
		wm.isElementTextMatch(driver, Admin.AdaniAdminAccountLedgerScreenVerify, "PD Acc. Report");Thread.sleep(1000);
	}

	@Then("^User should select mode for generating report$")
	public void User_should_select_mode_for_generating_report() throws Throwable 
	{
		Select SelectMode = new Select(Admin.AdaniAdminAccountLedgerSelectModeDropdown);Thread.sleep(1000);		
		SelectMode.selectByVisibleText("Both");Thread.sleep(1000);		
	}
	
	@Then("^User should select From and To date$")
	public void User_should_select_From_and_To_date() throws Throwable 
	{
		//Admin.AdaniAdminAccountLedgerFromDate.clear();Thread.sleep(1000);
		//Admin.AdaniAdminAccountLedgerFromDate.sendKeys("01 Oct 2024");	Thread.sleep(1000);
		
		//wm.JavascriptExecutorClick(driver, Admin.AdaniAdminAdvanceReceiptFromDate);Thread.sleep(1000);
		//wm.JavascriptExecutorClick(driver, Admin.AdaniAdminAdvanceReceiptFromDatePrev);Thread.sleep(1000);
		//Admin.AdaniAdminAdvanceReceiptFromDateSelect.click();Thread.sleep(1000);
	}
	
	@Then("^User should be able to click on View button All the credits and debits for each AWB no should be displayed$")
	public void User_should_be_able_to_click_on_View_button_All_the_credits_and_debits_for_each_AWB_no_should_be_displayed() throws Throwable 
	{
		Admin.AdaniAdminAccountLedgerViewButton.click();	Thread.sleep(6000);
	}
	
	@Then("^User should be able to click on Export to Excel button Excel file should be download$")
	public void User_should_be_able_to_click_on_Export_to_Excel_button_Excel_file_should_be_download() throws Throwable 
	{
		Admin.AdaniAdminAccountLedgerExportToExcelButton.click();	Thread.sleep(3500);
	}
	
	@Then("^User should be able to click on Export to PDF button PDF file should be download$")
	public void User_should_be_able_to_click_on_Export_to_PDF_button_PDF_file_should_be_download() throws Throwable 
	{
		Admin.AdaniAdminAccountLedgerExportToPDFButton.click();	Thread.sleep(3500);
	}
	
	@Then("^User should go to Account Managment tab for sub menu CTO Ledger$")
	public void User_should_go_to_Account_Managment_tab_for_sub_menu_CTO_Ledger() throws Throwable 
	{
		Actions ebookingaction = new Actions(driver);
		ebookingaction.moveToElement(Admin.AdaniAdminAccountManagmentTab).perform();Thread.sleep(500);
		Admin.AdaniAdminAccountManagmentTabCTOLedger.click();Thread.sleep(1000);		

	}
	
	@Then("^User should select CTO from dropdown$")
	public void User_should_select_CTO_from_dropdown() throws Throwable 
	{
		Select SelectMode = new Select(Admin.AdaniAdminCTOLedgerCTODropdown);Thread.sleep(1000);		
		SelectMode.selectByVisibleText("Adani");Thread.sleep(1000);	

	}
	
	
	@Then("^User should go to Account Managment tab for sub menu Advance Receipt$")
	public void User_should_go_to_Account_Managment_tab_for_sub_menu_Advance_Receipt() throws Throwable 
	{
		
		Thread.sleep(3000);		
		Actions ebookingaction = new Actions(driver);
		ebookingaction.moveToElement(Admin.AdaniAdminAccountManagmentTab).perform();Thread.sleep(500);
		Admin.AdaniAdminAccountManagmentTabAdvanceReceipts.click();Thread.sleep(1000);		

	}
	
	@Then("^User should verify Advance Receipts page should be displayed$")
	public void User_should_verify_Advance_Receipts_page_should_be_displayed() throws Throwable 
	{
		wm.isElementTextMatch(driver, Admin.AdaniAdminAdvanceReceiptsPageVerify, "Advance Receipts");Thread.sleep(1000);
	}
	
	@Then("^User should select From and To date for Advance Receipt$")
	public void User_should_select_From_and_To_date_for_Advance_Receipt() throws Throwable 
	{
		//--wm.JavascriptExecutorClick(driver, Admin.AdaniAdminAdvanceReceiptFromDate);Thread.sleep(1000);
		//wm.JavascriptExecutorClick(driver, Admin.AdaniAdminAdvanceReceiptFromDatePrev);Thread.sleep(1000);
		//--Admin.AdaniAdminAdvanceReceiptFromDateSelect.click();Thread.sleep(1000);
	}
	
	@Then("^User should Select Credit Type from the drop down$")
	public void User_should_Select_Credit_Type_from_the_drop_down() throws Throwable 
	{
		Select SelectMode = new Select(Admin.AdaniAdminAdvanceReceiptCreditTypeDropdown);Thread.sleep(1000);		
		SelectMode.selectByVisibleText("Cheque/DD/PO");Thread.sleep(1000);		
	}
	
	@Then("^User should click on search button$")
	public void User_should_click_on_search_button() throws Throwable 
	{
		Admin.AdaniAdminAdvanceReceiptSearchButton.click();Thread.sleep(1000);Thread.sleep(1000);
	}
	
	@Then("^User should download view receipt PDF$")
	public void User_should_download_view_receipt_PDF() throws Throwable 
	{
		/*---Thread.sleep(5000);
		wm.JavascriptExecutorClick(driver, Admin.AdaniAdminAdvanceReceiptViewReceiptLink);Thread.sleep(12000);
		
		Set<String> allwindowid = driver.getWindowHandles();Thread.sleep(3000);
		Object[] windows = allwindowid.toArray();Thread.sleep(5000);
    	String window1 = windows[0].toString();		Thread.sleep(3000);
    	driver.switchTo().window(window1);	Thread.sleep(2000);	
    	Thread.sleep(10000);*/
		
	}
	
	
	@Then("^User should go to Account Managment tab for sub menu Refund Receipt$")
	public void User_should_go_to_Account_Managment_tab_for_sub_menu_Refund_Receipt() throws Throwable 
	{
		Actions ebookingaction = new Actions(driver);
		ebookingaction.moveToElement(Admin.AdaniAdminAccountManagmentTab).perform();Thread.sleep(500);
		Admin.AdaniAdminAccountManagmentTabRefundReceipts.click();Thread.sleep(1000);		

	}
	
	@Then("^User should verify Refund Receipts page should be displayed$")
	public void User_should_verify_Refund_Receipts_page_should_be_displayed() throws Throwable 
	{
		wm.isElementTextMatch(driver, Admin.AdaniAdminRefundReceiptPageVerify, "Refund Receipts");Thread.sleep(1000);
	}
	
	@Then("^User should select from date for refund receipt$")
	public void User_should_select_from_date_for_refund_receipt() throws Throwable 
	{
		wm.JavascriptExecutorClick(driver, Admin.AdaniAdminAdvanceReceiptFromDate);Thread.sleep(1000);
		wm.JavascriptExecutorClick(driver, Admin.AdaniAdminAdvanceReceiptFromDatePrev);Thread.sleep(1000);
		Admin.AdaniAdminAdvanceReceiptFromDateSelect1.click();Thread.sleep(1000);
	}
	
	@Then("^User should go to Account Managment tab for sub menu ACS Receipt Download$")
	public void User_should_go_to_Account_Managment_tab_for_sub_menu_ACS_Receipt_Download() throws Throwable 
	{
		Actions ebookingaction = new Actions(driver);
		ebookingaction.moveToElement(Admin.AdaniAdminAccountManagmentTab).perform();Thread.sleep(500);
		Admin.AdaniAdminAccountManagmentTabACSReceiptDownload.click();Thread.sleep(1000);		

	}
	
	@Then("^User should verify ACS Receipt Download page should be displayed$")
	public void User_should_verify_ACS_Receipt_Download_page_should_be_displayed() throws Throwable 
	{
		wm.isElementTextMatch(driver, Admin.AdaniAdminACSReceitDownloadModeDropdown, "Bulk Receipt Download");Thread.sleep(1000);
	}
	
	@Then("^User should select Receipt type as ACS Receipt from the dropdown$")
	public void User_should_select_Receipt_type_as_ACS_Receipt_from_the_dropdown() throws Throwable 
	{
		Select SelectMode = new Select(Admin.AdaniAdminACSReceitTpyeDropdown);Thread.sleep(1000);		
		SelectMode.selectByVisibleText("ACS Receipt");Thread.sleep(1000);	

	}
	
	@Then("^User should select Mode as Export from the dropdown$")
	public void User_should_select_Mode_as_Export_from_the_dropdown() throws Throwable 
	{
		Select SelectMode = new Select(Admin.AdaniAdminCTOLedgerCTODropdown);Thread.sleep(1000);		
		SelectMode.selectByVisibleText("Exports");Thread.sleep(1000);	

	}
	
	@Then("^User should click on Download ACS Receipt$")
	public void User_should_click_on_Download_ACS_Receipt() throws Throwable 
	{
		wm.JavascriptExecutorClick(driver, Admin.AdaniAdminACSReceitDownloadButton);Thread.sleep(15000);
		
		try
		{
			Admin.AdaniAdminACSReceitDateOkPopup.click();Thread.sleep(1000);
		}
		catch (Exception E)
		{
			System.out.println("Popup not available");
		}
	}
	
	@Then("^User should select Receipt type as Adani Receipt from the dropdown$")
	public void User_should_select_Receipt_type_as_Adani_Receipt_from_the_dropdown() throws Throwable 
	{
		Select SelectMode = new Select(Admin.AdaniAdminACSReceitTpyeDropdown);Thread.sleep(1000);		
		SelectMode.selectByVisibleText("Adani Receipt");Thread.sleep(1000);	

	}
	
	@Then("^User should select Receipt type as CSC Receipt from the dropdown$")
	public void User_should_select_Receipt_type_as_CSC_Receipt_from_the_dropdown() throws Throwable 
	{
		Select SelectMode = new Select(Admin.AdaniAdminACSReceitTpyeDropdown);Thread.sleep(1000);		
		SelectMode.selectByVisibleText("CSC Receipt");Thread.sleep(1000);	

	}
	
	@Then("^User should select Receipt type as GSEC Receipt from the dropdown$")
	public void User_should_select_Receipt_type_as_GSEC_Receipt_from_the_dropdown() throws Throwable 
	{
		Select SelectMode = new Select(Admin.AdaniAdminACSReceitTpyeDropdown);Thread.sleep(1000);		
		SelectMode.selectByVisibleText("GSEC Receipt");Thread.sleep(1000);	

	}
	
	@Then("^User should select Mode as Import from the dropdown$")
	public void User_should_select_Mode_as_Import_from_the_dropdown() throws Throwable 
	{
		Select SelectMode = new Select(Admin.AdaniAdminCTOLedgerCTODropdown);Thread.sleep(1000);		
		SelectMode.selectByVisibleText("Imports");Thread.sleep(1000);	

	}
	
	@Then("^User should edit date greate that 7 days$")
	public void User_should_edit_date_greate_that_7_days() throws Throwable 
	{
		Admin.AdaniAdminAccountLedgerFromDate.clear();Thread.sleep(1000);
		Admin.AdaniAdminAccountLedgerFromDate.sendKeys("25 Mar 2024");	Thread.sleep(1000);
		wm.JavascriptExecutorClick(driver, Admin.AdaniAdminACSReceitDownloadButton);Thread.sleep(5000);
		Admin.AdaniAdminACSReceitDateOkPopup.click();Thread.sleep(1000);
	}
	//------------------------- End AdaniAMDAdmin_02 ----------------------------
	
	@Then("^User should go to User Managment tab for sub menu User Mgmt$")
	public void User_should_go_to_User_Managment_tab_for_sub_menu_User_Mgmt() throws Throwable 
	{
		Actions UserMgmtTab = new Actions(driver);
		UserMgmtTab.moveToElement(Admin.AdaniAdminUserMgmtTab).perform();Thread.sleep(500);
		Admin.AdaniAdminUserMgmtMenu.click();Thread.sleep(500);
	} 
	
	@Then("^User should click on create user button$")
	public void User_should_click_on_create_user_button() throws Throwable 
	{
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
	       js1.executeScript("arguments[0].scrollIntoView();",Admin.AdminUserMgmtCreateUserButton);Thread.sleep(1000);
	       
		Admin.AdminUserMgmtCreateUserButton.click();Thread.sleep(3000);
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
	       js2.executeScript("arguments[0].scrollIntoView();",Admin.AdminUserMgmtCreateUserButton);Thread.sleep(1000);
		Admin.AdminUserMgmtCreateUserButton.click();Thread.sleep(3000);
	} 
	
	@Then("^User should fill details for create user$")
	public void User_should_fill_details_for_create_user() throws Throwable 
	{
		Admin.AdminUserMgmtUserName.sendKeys("Automation_"+cm.RandomNo(2));Thread.sleep(500);
		Admin.AdminUserMgmtFirstName.sendKeys("Priyanka");Thread.sleep(500);
		Admin.AdminUserMgmtLastName.sendKeys("Automation");Thread.sleep(500);
		Admin.AdminUserMgmtEmailID.sendKeys("Priyanka.Sikchi@Kalelogistics.com");Thread.sleep(500);
		Admin.AdminUserMgmtContactNumber.sendKeys("987"+cm.RandomNo(7));Thread.sleep(1500);
		
	} 
	
	@Then("^User should select branch from dropdown for user$")
	public void User_should_select_branch_from_dropdown_for_user() throws Throwable 
	{
		Thread.sleep(500);
		Select BranchDropdown = new Select(Admin.AdminUserMgmtBranchDropdown);Thread.sleep(1000);		
		BranchDropdown.selectByVisibleText("AEROPRIME Cargo Pvt Ltd.");Thread.sleep(1500);	
    } 
	
	@Then("^User should click on assign roles icon in the assign role coloumn$")
	public void User_should_click_on_assign_roles_icon_in_the_assign_role_coloumn() throws Throwable 
	{
		Admin.AdminUserMgmtAssignRoleIcon.click();	Thread.sleep(1500);	
    } 
	
	@Then("^User should select roles from checkbox$")
	public void User_should_select_roles_from_checkbox() throws Throwable 
	{
		Admin.AdminUserMgmtSelectAllCheckbox.click();Thread.sleep(1000);	
    } 
	
	@Then("^User should click on assign role button$")
	public void User_should_click_on_assign_role_button() throws Throwable 
	{
		Admin.AdminUserMgmtAssignButton.click();Thread.sleep(3000);	
		Admin.AdaniAdminACSReceitDateOkPopup.click();Thread.sleep(2000);	
    } 
	
	@Then("^User should Select business line account name from the dropdown under Address section$")
	public void User_should_Select_business_line_account_name_from_the_dropdown_under_Address_section() throws Throwable 
	{
		Thread.sleep(500);
		Select AddressDropdown = new Select(Admin.AdminUserMgmtAddressDropdown);Thread.sleep(1000);		
		AddressDropdown.selectByVisibleText("AEROPRIME Cargo Pvt Ltd.");Thread.sleep(3500);	
    } 
	
	@Then("^User should click on save button$")
	public void User_should_click_on_save_button() throws Throwable 
	{
		Thread.sleep(500);
		Admin.AdminUserMgmtSavebutton.click();Thread.sleep(8000);	
		Admin.AdminUserMgmtSavebuttonOkPopup.click();Thread.sleep(5000);
    } 
	
	@Then("^User should click on reset password icon$")
	public void User_should_click_on_reset_password_icon() throws Throwable 
	{
		Thread.sleep(500);
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
	       js1.executeScript("arguments[0].scrollIntoView();",Admin.AdminUserMgmtResetPassIcon);Thread.sleep(1000);
		Admin.AdminUserMgmtResetPassIcon.click();Thread.sleep(3000);	
		
    }
	
	@Then("^User should select manual reset option and set password and save$")
	public void User_should_select_manual_reset_option_and_set_password_and_save() throws Throwable 
	{
		Thread.sleep(500);
		Admin.AdminUserMgmtManualReset.click();Thread.sleep(2000);	
		Admin.AdminUserMgmtManualResetPassTextBox.sendKeys("Kale@"+cm.RandomNo(4));Thread.sleep(2000);
		Admin.AdminUserMgmtManualResetSaveButton.click();Thread.sleep(4000);
		Admin.AdminUserMgmtManualResetCancelButton.click();Thread.sleep(4000);
    }
	
	@Then("^User should verify whether the user is able to active inactive existing user from User Management$")
	public void User_should_verify_whether_the_user_is_able_to_active_inactive_existing_user_from_User_Management() throws Throwable 
	{
		Thread.sleep(500);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
	       js1.executeScript("arguments[0].scrollIntoView();",Admin.AdminUserMgmtManualUserStatusActive);Thread.sleep(1000);
	       
	       try
	       {
	    	   Admin.AdminUserMgmtManualUserStatusActive.click();Thread.sleep(2000);	
	   		   Admin.AdminUserMgmtManualUserStatusPopop.click();Thread.sleep(2000);
	   		   Admin.AdminUserMgmtManualUserStatusPopopOk.click();Thread.sleep(2000);
	       }
	       catch(Exception E)
	       {
	    	   Admin.AdminUserMgmtManualUserStatusInactive.click();Thread.sleep(2000);	
	   		   Admin.AdminUserMgmtManualUserStatusPopop.click();Thread.sleep(2000);
	   		   Admin.AdminUserMgmtManualUserStatusPopopOk.click();Thread.sleep(2000);
	       }
		
	       Thread.sleep(500);
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
		       js2.executeScript("arguments[0].scrollIntoView();",Admin.AdminUserMgmtManualUserStatusActive);Thread.sleep(1000);
		       
		       try
		       {
		    	   Admin.AdminUserMgmtManualUserStatusActive.click();Thread.sleep(3000);	
		   		   Admin.AdminUserMgmtManualUserStatusPopop.click();Thread.sleep(3000);
		   		   Admin.AdminUserMgmtManualUserStatusPopopOk.click();Thread.sleep(2000);
		       }
		       catch(Exception E)
		       {
		    	   Admin.AdminUserMgmtManualUserStatusInactive.click();Thread.sleep(3000);	
		   		   Admin.AdminUserMgmtManualUserStatusPopop.click();Thread.sleep(3000);
		   		  Admin.AdminUserMgmtManualUserStatusPopopOk.click();Thread.sleep(2000);
		       }
    }
	
	@Then("^User should verify whether user is able to create the user without selecting the branches and roles in User management$")
	public void User_should_verify_whether_user_is_able_to_create_the_user_without_selecting_the_branches_and_roles_in_User_management() throws Throwable 
	{
		
			Admin.AdminUserMgmtSavebutton.click();Thread.sleep(5000);	
			
    }
	
	
	//---------------- End AdaniAMDAdmin_03 --------------------
	
	@Then("^User should go to Org profile menu$")
	public void User_should_go_to_Org_profile_menu() throws Throwable 
	{
		Thread.sleep(500);
		Admin.AdaniAdminOrgProfileTab.click();Thread.sleep(2000);
		
    } 
	
	@Then("^User should display View Organization Profile page$")
	public void User_should_display_View_Organization_Profile_page() throws Throwable 
	{
		wm.isElementTextMatch(driver, Admin.AdminOrgProfilePage, "View Organization Profile");Thread.sleep(1000);
		
    } 
	
	@Then("^User should click on add button for adding branch details in org profile$")
	public void User_should_click_on_add_button_for_adding_branch_details_in_org_profile() throws Throwable 
	{
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
	       js1.executeScript("arguments[0].scrollIntoView();",Admin.AdminOrgProfileAddButton);Thread.sleep(1000);
	       
		  Admin.AdminOrgProfileAddButton.click();Thread.sleep(1000);
		
    } 
	
	@Then("^User should add details in branch details section$")
	public void User_should_add_details_in_branch_details_section() throws Throwable 
	{
		Admin.AdminOrgProfileBranchName.sendKeys("Automation"+cm.RandomNo(2));Thread.sleep(1000);
		Admin.AdminOrgProfileBranchCode.sendKeys("AUT");Thread.sleep(1000);
		Admin.AdminOrgProfileEmailID.sendKeys("Priyanka.Sikchi@Kalelogistics.com");Thread.sleep(1000);
		Admin.AdminOrgProfileContactNumber.sendKeys("879"+cm.RandomNo(7));Thread.sleep(1000);
    } 
	
	@Then("^User should click on add address link$")
	public void User_should_click_on_add_address_link() throws Throwable 
	{
		Admin.AdminOrgProfileAddAddressLink.click();Thread.sleep(3000);
		
    }
	
	@Then("^User should add address details and click on submit button$")
	public void User_should_add_address_details_and_click_on_submit_button() throws Throwable 
	{
		Admin.AdminOrgProfileAddressStreet1.sendKeys("White House");Thread.sleep(1000);
		Admin.AdminOrgProfileAddressZipCode.sendKeys(cm.RandomNo(6));Thread.sleep(1000);
		Admin.AdminOrgProfileAddressCountryCode.sendKeys("IN");Thread.sleep(1000);
		Admin.AdminOrgProfileAddressStateCode.sendKeys("MH");Thread.sleep(1000);
		Admin.AdminOrgProfileAddressCityCode.sendKeys("BOM");Thread.sleep(1000);
		Admin.AdminOrgProfileAddressSubmit.click();Thread.sleep(3000);
		
    }
	
	@Then("^User should save branch details under org profile$")
	public void User_should_save_branch_details_under_org_profile() throws Throwable 
	{
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
	       js1.executeScript("arguments[0].scrollIntoView();",Admin.AdminOrgProfileSaveButton);Thread.sleep(1000);
	       
		Admin.AdminOrgProfileSaveButton.click();Thread.sleep(3000);
		Admin.AdminOrgProfileSaveButtonOkPopup.click();Thread.sleep(3000);
		
    }
	
	@Then("^User should click on edit button for updating branch details$")
	public void User_should_click_on_edit_button_for_updating_branch_details() throws Throwable 
	{
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
	       js1.executeScript("arguments[0].scrollIntoView();",Admin.AdminOrgProfileEditButton);Thread.sleep(1000);
	       
		Admin.AdminOrgProfileEditButton.click();Thread.sleep(3000);
    }
	
	@Then("^User should update branch details and save$")
	public void User_should_update_branch_details_and_save() throws Throwable 
	{
		Admin.AdminOrgProfileZipCodeUpdate.clear();Thread.sleep(1000);
		Admin.AdminOrgProfileZipCodeUpdate.sendKeys(cm.RandomNo(6));Thread.sleep(1000);
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
	       js1.executeScript("arguments[0].scrollIntoView();",Admin.AdminOrgProfileBranchNameUpdate);Thread.sleep(1000);
	       
	       Admin.AdminOrgProfileBranchNameUpdate.clear();Thread.sleep(1000);
	       
		Admin.AdminOrgProfileBranchNameUpdate.sendKeys("Update Auto"+cm.RandomNo(2));Thread.sleep(1000);
		Admin.AdminOrgProfileSaveUpdate.click();Thread.sleep(3000);
		Admin.AdminOrgProfileSaveButtonOkPopup.click();Thread.sleep(3000);
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
	       js2.executeScript("arguments[0].scrollIntoView();",Admin.AdminOrgProfileEditButton);Thread.sleep(1000);
    }
	
	//---------------- End AdaniAMDAdmin_04 --------------------
	
	@Then("^User should go to Trade Partner menu$")
	public void User_should_go_to_Trade_Partner_menu() throws Throwable 
	{
		Thread.sleep(500);
		Admin.AdaniAdminTradePartnerTab.click();Thread.sleep(2000);
		
    } 
	
	@Then("^User should display Trade partner Profile page$")
	public void User_should_display_Trade_partner_Profile_page() throws Throwable 
	{
		wm.isElementTextMatch(driver, Admin.AdminTradePartnerPage, "Trade Partner");Thread.sleep(1000);
		
    } 
	
	@Then("^User should be able to click on Add Trade Partner button$")
	public void User_should_be_able_to_click_on_Add_Trade_Partner_button() throws Throwable 
	{
		Admin.AdminTradePartnerAddButton.click();Thread.sleep(1000);
		
    } 
	
	@Then("^User should able to add trade partner details and click on save icon$")
	public void User_should_able_to_add_trade_partner_details_and_click_on_save_icon() throws Throwable 
	{
		Select TradePartnerRelationship = new Select(Admin.AdminTradePartnerRelationship);Thread.sleep(1000);		
		TradePartnerRelationship.selectByVisibleText("Preferred");Thread.sleep(500);
		
		Select TradePartnerOrgType = new Select(Admin.AdminTradePartnerOrgType);Thread.sleep(1000);		
		TradePartnerOrgType.selectByVisibleText("Airline");Thread.sleep(500);
	
		Admin.AdminTradePartnerOrgName.sendKeys("aba");Thread.sleep(1000);	
		
		Robot airlinedropdown = new Robot();
		airlinedropdown.keyPress(KeyEvent.VK_DOWN);
		airlinedropdown.keyPress(KeyEvent.VK_ENTER);Thread.sleep(2000);
		
		Admin.AdminTradePartnerSaveIcon.click();Thread.sleep(3000);
		Admin.AdminTradePartnerSaveOkPopup.click();Thread.sleep(3000);	
		
    } 
	
	@Then("^User should click on edit icon$")
	public void User_should_click_on_edit_icon() throws Throwable 
	{
		Admin.AdminTradePartnerEditIcon.click();Thread.sleep(1000);
		
    } 
	
	@Then("^User should update trade partner details and click on save button$")
	public void User_should_update_trade_partner_details_and_click_on_save_button() throws Throwable 
	{
		Admin.AdminTradePartnerOrgName.clear();Thread.sleep(1000);
		Admin.AdminTradePartnerOrgName.sendKeys("aer");Thread.sleep(1000);
		
		Robot airlinedropdown = new Robot();
		airlinedropdown.keyPress(KeyEvent.VK_DOWN);
		airlinedropdown.keyPress(KeyEvent.VK_ENTER);Thread.sleep(1000);
		
		Admin.AdminTradePartnerSaveIcon.click();Thread.sleep(3000);
		Admin.AdminTradePartnerSaveOkPopup.click();Thread.sleep(3000);	
		
		
    } 
	
	@Then("^User should able to delete trade partner$")
	public void User_should_able_to_delete_trade_partner() throws Throwable 
	{
		
		Admin.AdminTradePartnerDeleteIcon.click();Thread.sleep(3000);
		Admin.AdminTradePartnerDeletePopup.click();Thread.sleep(3000);	
		Admin.AdminTradePartnerSaveOkPopup.click();Thread.sleep(3000);	
		
    } 
	
	@Then("^User should go to Organization menu under Configuration Tab$")
	public void User_should_go_to_Organization_menu_under_Configuration_Tab() throws Throwable 
	{
		Actions ebookingaction = new Actions(driver);
		ebookingaction.moveToElement(Admin.AdaniAdminConfigurationTab).perform();Thread.sleep(500);
		Admin.AdaniAdminConfigurationTabOrganisationMenu.click();Thread.sleep(1000);		

	}
	
	@Then("^User should display Organization Profile page$")
	public void User_should_display_Organization_Profile_page() throws Throwable 
	{
		wm.isElementTextMatch(driver, Admin.AdaniAdminConfigurationPage, "Configuration");Thread.sleep(1000);
		
    } 
	
	@Then("^User should verify whether user is able to Save the changes in Configuration for password expiry$")
	public void User_should_verify_whether_user_is_able_to_Save_the_changes_in_Configuration_for_password_expiry() throws Throwable 
	{
		Admin.AdaniAdminConfigurationPasswordExperyTextBox.clear();Thread.sleep(1000);
		Admin.AdaniAdminConfigurationPasswordExperyTextBox.sendKeys(cm.RandomNo(2));Thread.sleep(1000);
		Admin.AdaniAdminConfigurationSaveButton.click();Thread.sleep(1000);
		Admin.AdaniAdminConfigurationSaveButtonOk.click();Thread.sleep(3000);
		
    } 
	
	
	@Then("^User should go to Threshold menu under AWB Stock Tab$")
	public void User_should_go_to_Threshold_menu_under_AWB_Stock_Tab() throws Throwable 
	{
		Actions ebookingaction = new Actions(driver);
		ebookingaction.moveToElement(Admin.AdaniAdminAWBStockTab).perform();Thread.sleep(500);
		Admin.AdaniAdminThresholdTabAWBStockMenu.click();Thread.sleep(1000);		

	}
	
	@Then("^User should display stock threshold configuration Profile page$")
	public void User_should_display_stock_threshold_configuration_Profile_page() throws Throwable 
	{
		wm.isElementTextMatch(driver, Admin.AdaniAdminThresholdPage, "Stock Threshold Configuration");Thread.sleep(1000);
		
    } 
	
	@Then("^User should Verify whether user is able to save the Stock Threshold Configuration Details$")
	public void User_should_Verify_whether_user_is_able_to_save_the_Stock_Threshold_Configuration_Details() throws Throwable 
	{
		Select TradePartnerOrgType = new Select(Admin.AdminUserMgmtBranchDropdown);Thread.sleep(1000);		
		TradePartnerOrgType.selectByVisibleText("AEROPRIME Cargo Pvt Ltd.");Thread.sleep(500);
		
		Admin.AdaniAdminThresholdQtyTextBox.clear();Thread.sleep(500);
		Admin.AdaniAdminThresholdQtyTextBox.sendKeys(cm.RandomNo(2));Thread.sleep(1000);
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
	    js2.executeScript("arguments[0].scrollIntoView();",Admin.AdaniAdminConfigurationSaveButton);Thread.sleep(1000);
	       
	       Admin.AdaniAdminConfigurationSaveButton.click();Thread.sleep(2000);
	       Admin.AdminCreditRequestSubmitButtonOkPopup.click();Thread.sleep(2000);
    } 
	
	//---------------- End AdaniAMDAdmin_05 --------------------
	
	@Then("^User should click on new registration hyper link$")
	public void User_should_click_on_new_registration_hyper_link() throws Throwable 
	{
		Thread.sleep(4000);
		Admin.AdaniNewRegHyperLink.click();Thread.sleep(2000);
    } 
	
	@Then("User should fill all details {string} for new user registration")
	public void User_should_fill_all_details_for_new_user_registration(String OrgName) throws Throwable 
	{
		
		Admin.AdaniNewRegBussLineFF.click();Thread.sleep(1000);
		Admin.AdaniNewRegBussLineCB.click();Thread.sleep(1000);
		Admin.AdaniNewRegOrgName.sendKeys(OrgName);Thread.sleep(1000);
		Admin.AdaniNewRegBussID.sendKeys("Priyanka.Sikchi@Kalelogistics.com");Thread.sleep(1000);
		Admin.AdaniNewRegCntNumber.sendKeys("852"+cm.RandomNo(7));Thread.sleep(1000);
		Admin.AdaniNewRegAddress.sendKeys("ST Lane");Thread.sleep(1000);
		Admin.AdaniNewRegPinCode.sendKeys(cm.RandomNo(6));Thread.sleep(1000);
		Admin.AdaniNewRegCountryCode.sendKeys("IN");Thread.sleep(1000);
		Admin.AdaniNewRegCityCode.sendKeys("AMD");Thread.sleep(1000);
		Admin.AdaniNewRegUserName.sendKeys("AutomationUser"+cm.RandomNo(2));Thread.sleep(1000);
		Admin.AdaniNewRegFirstName.sendKeys("Priyanka");Thread.sleep(1000);
		Admin.AdaniNewRegLastName.sendKeys("Sikchi");Thread.sleep(1000);
		
		Select AdaniNewRegStatusDropdown = new Select(Admin.AdaniNewRegStatus);Thread.sleep(1000);		
		AdaniNewRegStatusDropdown.selectByVisibleText("Registered");Thread.sleep(500);
		
		Admin.AdaniNewRegStateCode.sendKeys("GJ");Thread.sleep(1000);
		
		Admin.AdaniNewRegGSTNNumber.sendKeys("29DIYAS"+cm.RandomNo(4)+"C3Z6");Thread.sleep(1000);
		
		Admin.AdaniNewRegIATANumber.sendKeys(cm.RandomNo(7));Thread.sleep(1000);
		
		Admin.AdaniNewRegIATARegDate.click();Thread.sleep(1000);
		Admin.CurrentDate();Thread.sleep(1000);
		
		Admin.AdaniNewRegPANNumber.sendKeys("DIYAS"+cm.RandomNo(4)+"C");
		
		Admin.AdaniNewRegLicExpiryDate.click();Thread.sleep(1000);
		Admin.AdaniNewRegLicExpiryDateNext.click();Thread.sleep(1000);
		Admin.ExpiryDate();Thread.sleep(1000);
		
		//Admin.AdaniNewRegEmailID.sendKeys("Priyanka.Sikchi@Kalelogistics.com");Thread.sleep(1000);
		//Admin.AdaniNewRegMobNumber.sendKeys(cm.RandomNo(10));Thread.sleep(1000);
		Admin.AdaniNewRegCheckBox.click();Thread.sleep(1000);
		Admin.AdaniNewRegSubmitButton.click();Thread.sleep(5000);
		
    } 
	
	@Then("^User should approve request from receive request page$")
	public void User_should_approve_request_from_receive_request_page() throws Throwable 
	{
		Thread.sleep(3000);
		Admin.AdaniAdminOrgName.click();Thread.sleep(3000);
		
		 JavascriptExecutor js1 = (JavascriptExecutor) driver;
	       js1.executeScript("arguments[0].scrollIntoView();",Admin.AdaniAdminApproveButton);Thread.sleep(1000);
	       
		Admin.AdaniAdminApproveButton.click();Thread.sleep(7000);
		Admin.AdaniAdminConfigurationSaveButtonOk.click();Thread.sleep(3000);
		
		
    } 
	
	@Then("^User should go to PDA Mapping menu$")
	public void User_should_go_to_PDA_Mapping_menu() throws Throwable 
	{
		Thread.sleep(500);
		Admin.AdaniAdminPDAMappingTab.click();Thread.sleep(2000);
		
    } 
	
	@Then("^User should click on add PDA account button$")
	public void User_should_click_on_add_PDA_account_button() throws Throwable 
	{
		Thread.sleep(500);
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
	       js1.executeScript("arguments[0].scrollIntoView();",Admin.AdminPDAMappingAddButton);Thread.sleep(1000);
	       
		Admin.AdminPDAMappingAddButton.click();Thread.sleep(2000);
		
    } 
	
	@Then("User should select organization type and {string} from dropdown")
	public void User_should_select_organization_type_and_from_dropdown(String OrgName) throws Throwable 
	{
		Thread.sleep(500);
		Select TradePartnerOrgType = new Select(Admin.AdminTradePartnerOrgType);Thread.sleep(1000);		
		TradePartnerOrgType.selectByVisibleText("Freight-Forwarder");Thread.sleep(500);
		
		Admin.AdminTradePartnerOrgName.sendKeys(OrgName);Thread.sleep(1500);
		
		Robot organizationnamedropdown = new Robot();
		organizationnamedropdown.keyPress(KeyEvent.VK_DOWN);
		organizationnamedropdown.keyPress(KeyEvent.VK_ENTER);Thread.sleep(2000);
		
		
    } 
	
	@Then("^User should click on e-docket icon$")
	public void User_should_click_on_e_docket_icon() throws Throwable 
	{
		Thread.sleep(500);
		try
		{
			Admin.AdminPDAMappingeDocketIcon.click();Thread.sleep(6000);
		}
		catch (Exception E)
		{
			Admin.AdminPDAMappingeDocketIcon1.click();Thread.sleep(6000);
		}
		
    } 
	
	@Then("^User should browse file in PDF format not to exceed 2 MB and download file$")
	public void User_should_browse_file_in_PDF_format_not_to_exceed_2_MB_and_download_file() throws Throwable 
	{
		Thread.sleep(500);
		driver.switchTo().frame(0);Thread.sleep(500);
		//wm.JavascriptExecutorClick(driver, Admin.AdminPDAMappingBrowseButton);Thread.sleep(5000);
		Admin.AdminPDAMappingBrowseButton.sendKeys("C:\\Users\\priyanka.sikchi\\OneDrive - Kale Logistics Solutions Private Limited\\Priyanka\\Kale Workspace July24\\ACS Adani AHMD July24\\GitHub\\ACS-Adani\\AdaniAMD\\pdf1.pdf");Thread.sleep(6000);
		Admin.AdminPDAMappingUploadButton.click();Thread.sleep(5000);
		try
		{
			Admin.AdminPDAMappingSavepoup.click();Thread.sleep(2000);
		}
		catch (Exception E)
		{
			System.out.println("Popup not available");
		}
		
		Admin.AdminPDAMappingDownloadButton.click();Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Admin.AdminPDAMappingUploadButtonClosePopup.click();Thread.sleep(2000);
    } 
	
	@Then("^User should be able to select the CTO from the dropdown$")
	public void User_should_be_able_to_select_the_CTO_from_the_dropdown() throws Throwable 
	{
		Admin.AdminPDAMappingCTO.click();Thread.sleep(2000);
		Admin.AdminPDAMappingCTOSearch.sendKeys("Kale");Thread.sleep(2000);
		Admin.AdminPDAMappingCTOKaleGHA1.click();Thread.sleep(1000);
		Admin.AdminPDAMappingCTOKaleGHA2.click();Thread.sleep(1000);
    } 
	
	@Then("^User should be able to click on save icon from action column and saved details should be displayed in newly added row$")
	public void User_should_be_able_to_click_on_save_icon_from_action_column_and_saved_details_should_be_displayed_in_newly_added_row() throws Throwable 
	{
		Admin.AdminTradePartnerSaveIcon.click();Thread.sleep(5000);
		Admin.AdminUserMgmtSavebuttonOkPopup.click();Thread.sleep(4000);
		
    } 
	
	@Then("User should search organization name {string}")
	public void User_should_search_organization_name(String OrgName) throws Throwable 
	{
		driver.navigate().refresh();Thread.sleep(8000);	
		Admin.AdminPDAMappingOrgSearch.sendKeys(OrgName);Thread.sleep(5000);	
    } 
	
	@Then("^To verify whether user is able to view the error msg when user upload different extention file in E-docket$")
	public void To_verify_whether_user_is_able_to_view_the_error_msg_when_user_upload_different_extention_file_in_E_docket() throws Throwable 
	{
		Thread.sleep(500);
		driver.switchTo().frame(0);Thread.sleep(500);
		//wm.JavascriptExecutorClick(driver, Admin.AdminPDAMappingBrowseButton);Thread.sleep(5000);
		Admin.AdminPDAMappingBrowseButton.sendKeys("C:\\Users\\priyanka.sikchi\\OneDrive - Kale Logistics Solutions Private Limited\\Priyanka\\Kale Workspace\\ACS-Adani\\GitHub\\ACS-Adani\\AdaniAMD\\dummy documents\\doc1.docx");Thread.sleep(6000);
		Admin.AdaniAdminACSReceitDateOkPopup.click();Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
    } 
	
	@Then("^To verify whether user is able to Clear the selected file on click of Clear button$")
	public void To_verify_whether_user_is_able_to_Clear_the_selected_file_on_click_of_Clear_button() throws Throwable 
	{
		Thread.sleep(500);
		driver.switchTo().frame(0);Thread.sleep(500);
		//wm.JavascriptExecutorClick(driver, Admin.AdminPDAMappingBrowseButton);Thread.sleep(5000);
		Admin.AdminPDAMappingBrowseButton.sendKeys("C:\\Users\\priyanka.sikchi\\OneDrive - Kale Logistics Solutions Private Limited\\Priyanka\\Kale Workspace\\ACS-Adani\\GitHub\\ACS-Adani\\AdaniAMD\\dummy documents\\pdf2.pdf");Thread.sleep(6000);
		Admin.AdminPDAMappingClearButton.click();Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
    } 
	
	@Then("^To verify whether user is able to delete the Uploaded e-docket document$")
	public void To_verify_whether_user_is_able_to_delete_the_Uploaded_e_docket_document() throws Throwable 
	{
		Thread.sleep(500);
		driver.switchTo().frame(0);Thread.sleep(500);
		
		Admin.AdminTradePartnerDeleteIcon.click();Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
    } 
	
	@Then("^User should submit all details$")
	public void User_should_submit_all_details() throws Throwable 
	{
		Thread.sleep(500);
		
		Admin.AdminTradePartnerEditIcon.click();Thread.sleep(5000);
		Admin.AdminPDAMappingSubmitButton.click();Thread.sleep(5000);
		Admin.AdminUserMgmtSavebuttonOkPopup.click();Thread.sleep(5000);
    } 
	
	@Then("^User should able to delete record$")
	public void User_should_able_to_delete_record() throws Throwable 
	{
		Thread.sleep(500);
		
		Admin.AdminPDAMappingDeleteIcon.click();Thread.sleep(5000);
		Admin.AdminTradePartnerDeletePopup.click();Thread.sleep(5000);
		Admin.AdminUserMgmtSavebuttonOkPopup.click();Thread.sleep(4000);
    } 
	@Then("^To verify whether user is able to navigated to back page on click of Cancel button from PDA Mapping screen$")
	public void To_verify_whether_user_is_able_to_navigated_to_back_page_on_click_of_Cancel_button_from_PDA_Mapping_screen() throws Throwable 
	{
		Thread.sleep(500);
		 JavascriptExecutor js1 = (JavascriptExecutor) driver;
	       js1.executeScript("arguments[0].scrollIntoView();",Admin.AdminPDAMappingCancelButton);Thread.sleep(1000);
	       
		Admin.AdminPDAMappingCancelButton.click();Thread.sleep(5000);
    } 
	
	//--------------------- End AdaniAMDAdmin_06 -----------------------
	
	@Then("User should be able to create the AWB {string}")
	public void User_should_be_able_to_create_the_AWB(String CTO) throws Throwable 
	{
		Thread.sleep(500);
		 Select SelectCTO = new Select(Export.AdaniAMD_QuickASI_SelectCTODropdown);
		   SelectCTO.selectByVisibleText(CTO);Thread.sleep(500);
		   
		 
		   Export.AdaniAMD_QuickASI_MAWBPrefix.sendKeys("999");Thread.sleep(500);
		   
		   
		   Export.AdaniAMD_QuickASI_MAWBNumber.sendKeys(AdaniAMDImport1);Thread.sleep(1500);
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
		   Export.AdaniAMD_QuickASI_SaveAWB.click();Thread.sleep(18000);
		   wm.JavascriptExecutorClick(driver,Export.AdaniAMD_QuickASI_MessageAlertOK);Thread.sleep(9000);
    } 
	
	@Then("^User should be able to click on TSP icon and TSP payment method pop up should display$")
	public void User_should_be_able_to_click_on_TSP_icon_and_TSP_payment_method_pop_up_should_display() throws Throwable 
	{
		/*Thread.sleep(500);
	       
			Export.AdaniAMD_TSPMileStone.click();Thread.sleep(6000);
		
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
		
		Thread.sleep(4000);
		*/
    } 
	
	@Then("^User should be fill details for TSP Payment$")
	public void User_should_be_fill_details_for_TSP_Payment() throws Throwable 
	{
		/*wm.isElementTextMatch(driver, Export.AdaniAMD_TSPPaymentScreen, "TSP Payment");Thread.sleep(2000);
		Export.TSPPayment();Thread.sleep(2000);
		Export.AdaniAMD_TSPPayNowButton1.click();Thread.sleep(5000);
		Export.AdaniAMD_TSPPayNowOKButton.click();Thread.sleep(7000);
		Export.AdaniAMD_TSPPayNowNoButton.click();Thread.sleep(6000);*/
    } 
	
	@Then("^User should be able to click on TSP cancel button and navigated to back page$")
	public void User_should_be_able_to_click_on_TSP_cancel_button_and_navigated_to_back_page() throws Throwable 
	{/*
		Export.AdaniAMD_TSPMileStone.click();Thread.sleep(7000);
		
		try
		{
			Admin.AdminTSPCancelButton2.click();Thread.sleep(4000);
		}
		catch (Exception E)
		{
			Admin.AdminTSPCancelButton1.click();Thread.sleep(4000);
		}
		*/
    } 
	
	@Then("^User should be able to click on TSP back button and system should navigated to back page$")
	public void User_should_be_able_to_click_on_TSP_back_button_and_system_should_navigated_to_back_page() throws Throwable 
	{
		
		//Admin.AdminTSPBackButton.click();Thread.sleep(5000);
    } 
	
	// ----------------------- End AdaniAMDAdmin_07 --------------
	
	@Then("User should click on TSP milestone and select trade partner {string}")
	public void User_should_click_on_TSP_milestone_and_select_trade_partner(String OrgName) throws Throwable 
	{
		Thread.sleep(7000);
		
		/*Export.AdaniAMD_TSPMileStone.click();Thread.sleep(7000);
		
		Select AdminTSPMethodPopupDropdown = new Select(Admin.AdminTSPMethodPopup);Thread.sleep(5000);		
		AdminTSPMethodPopupDropdown.selectByVisibleText("Trade Partner");Thread.sleep(1000);
		
		Select TradePartnerDropdown = new Select(Admin.AdminTSPMethodTradePartner);Thread.sleep(2000);		
		//TradePartnerDropdown.selectByVisibleText(OrgName);Thread.sleep(1000);
		
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
		
		Thread.sleep(6000);
		*/
		
    } 
	
	@Then("^User should click on Print button from TSP screen$")
	public void User_should_click_on_Print_button_from_TSP_screen() throws Throwable 
	{
		
		Admin.AdminTSPMilestoneLink.click();Thread.sleep(7000);
		Admin.AdminTSPMilestonePrintButton.click();Thread.sleep(8000);
		
		Set<String> allwindowid = driver.getWindowHandles();Thread.sleep(3000);
		Object[] windows = allwindowid.toArray();Thread.sleep(5000);
    	String window2 = windows[1].toString();		Thread.sleep(3000);
    	driver.switchTo().window(window2);	Thread.sleep(2000);	
    	Thread.sleep(10000);
    } 
	
}	


		