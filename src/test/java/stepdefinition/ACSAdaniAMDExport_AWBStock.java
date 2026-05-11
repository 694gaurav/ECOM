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

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.graphbuilder.math.Expression;

import Methods.CommonMethods;
import Methods.WebDriverMethod;
import Methods.WebdriverMethods;
import TestDataOperations.TestDataReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ACSAdaniAMDExport_AWBStock {
	
	//String AdaniAMDExport = cm.Random_AWBNo();	
	
	
	public boolean verify;

	
	@Then("^User should go to AWB Stock tab for sub menu Request for AWB Stock$")
	public void User_should_go_to_AWB_Stock_tab_for_sub_menu_Request_for_AWB_Stock() throws InterruptedException, AWTException 
	{		
		Actions ebookingaction = new Actions(driver);
		ebookingaction.moveToElement(Export.AdaniAMD_AWBStockTab).perform();Thread.sleep(500);
		Export.AdaniAMD_AWBStockRequestForAWBStock.click();Thread.sleep(1000);		
	}
	
	@Then("^User should Select Airline from Select drop down$")
	public void User_should_Select_Airline_from_Select_drop_down() throws InterruptedException, AWTException 
	{		
		
		Export.AdaniAMD_AWBStockRequestForAWBStockSelectAirlineDropdown.click();Thread.sleep(1000);		
		Robot airlinedropdown = new Robot();
		airlinedropdown.keyPress(KeyEvent.VK_DOWN);
		airlinedropdown.keyPress(KeyEvent.VK_ENTER);Thread.sleep(1000);
	}
	
	@Then("^User should enter quantity$")
	public void User_should_enter_quantity() throws InterruptedException, AWTException 
	{		
		Export.AdaniAMD_AWBStockRequestForAWBStockQuantity.sendKeys("1");Thread.sleep(1000);
	}
	
	@Then("^User should Enter Remark$")
	public void User_should_Enter_Remark() throws InterruptedException, AWTException 
	{		
		Export.AdaniAMD_AWBStockRequestForAWBStockRemark.sendKeys("Test");Thread.sleep(1000);
	}
	
	@Then("^User should Select Document Type from drop down and Upload Document$")
	public void User_should_Select_Document_Type_from_drop_down_and_Upload_Document() throws InterruptedException, AWTException 
	{		
		Export.AdaniAMD_AWBStockRequestForAWBStockUploadDocDropdown.click();Thread.sleep(1000);		
		Robot docdropdown = new Robot();
		docdropdown.keyPress(KeyEvent.VK_DOWN);
		docdropdown.keyPress(KeyEvent.VK_ENTER);Thread.sleep(1000);
		
		Actions a = new Actions(driver);
	      a.moveToElement(driver.findElement(By.id(("ctl00_hldPage_fileUpload")))).click().
	      build().perform();Thread.sleep(5000);
	      
		Robot rb1 = new Robot();
		rb1.delay(2000);
		StringSelection ss1 = new StringSelection("C:\\Users\\priyanka.sikchi\\OneDrive - Kale Logistics Solutions Private Limited\\Priyanka\\Kale Workspace\\ACS-Adani\\GitHub\\ACS-Adani\\AdaniAMD\\dummy documents\\pdf1.pdf");  rb1.delay(2000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);rb1.keyPress(KeyEvent.VK_CONTROL); rb1.delay(2000);
		rb1.keyPress(KeyEvent.VK_V); 
		rb1.delay(2000);
		rb1.keyPress(KeyEvent.VK_ENTER); rb1.delay(500);
		rb1.keyPress(KeyEvent.VK_ENTER);
		
		rb1.delay(2000);
		Export.AdaniAMD_AWBStockRequestForAWBStockUploadButton.click();Thread.sleep(10000);
	}
	
	@Then("^User should Send request to Airline$")
	public void User_should_Send_request_to_Airline() throws InterruptedException, AWTException 
	{		
		Export.AdaniAMD_AWBStockRequestForAWBStockSendButton.click();Thread.sleep(5000);
		Export.AdaniAMD_AWBStockRequestForAWBStockSendButtonPopupOk.click();Thread.sleep(5000);
	}
	
	@Then("^User should go to AWB Stock tab for sub menu Request Status$")
	public void User_should_go_to_AWB_Stock_tab_for_sub_menu_Request_Status() throws InterruptedException, AWTException 
	{		
		Actions ebookingaction = new Actions(driver);
		ebookingaction.moveToElement(Export.AdaniAMD_AWBStockTab).perform();Thread.sleep(500);
		Export.AdaniAMD_AWBStockRequestStatus.click();Thread.sleep(1000);		
	}
	
	@Then("^User should Click on Approve button against the Requested AWB Stock record$")
	public void User_should_Click_on_Approve_button_against_the_Requested_AWB_Stock_record() throws InterruptedException, AWTException 
	{		
		
		Export.AdaniAMD_AWBStockRequestForAWBStockAirlineApproveButton.click();Thread.sleep(3000);		
	}
	
	@Then("^User should Select Manual button in Approve Request dialogue box$")
	public void User_should_Select_Manual_button_in_Approve_Request_dialogue_box() throws InterruptedException, AWTException 
	{		
		
		Export.AdaniAMD_AWBStockRequestForAWBStockAirlineManualReq.click();Thread.sleep(2000);		
	}
	
	@Then("^User should Click on Submit button in Approve Request dialogue box$")
	public void User_should_Click_on_Submit_button_in_Approve_Request_dialogue_box() throws InterruptedException, AWTException 
	{		
		
		Export.AdaniAMD_AWBStockRequestForAWBStocAirlineManualSubmitButton.click();Thread.sleep(3000);		
	}
	
	@Then("^User should enter issued quantity$")
	public void User_should_enter_issued_quantity() throws InterruptedException, AWTException 
	{		
		
		Export.AdaniAMD_AWBStockRequestForAWBStocAirlineIssuedQty.sendKeys("1");Thread.sleep(1000);		
	}
	
	@Then("^User should enter MAWB number and click on issue button$")
	public void User_should_enter_MAWB_number_and_click_on_issue_button() throws InterruptedException, AWTException 
	
	{		
		
		 Export.AdaniAMD_AWBStockRequestForAWBStocAirlineFromAWBNo.sendKeys(ACSAdaniAMD_Export.AdaniAMDExport);Thread.sleep(500);
		 Export.AdaniAMD_AWBStockRequestForAWBStocAirlineToAWBNo.sendKeys(ACSAdaniAMD_Export.AdaniAMDExport);Thread.sleep(500);
		 Export.AdaniAMD_AWBStockRequestForAWBStocAirlineToQty.click();Thread.sleep(1000);
		 Export.AdaniAMD_AWBStockRequestForAWBStocAirlineIssueButton.click();Thread.sleep(3000);
		 //driver.switchTo().alert().dismiss();
		 driver.switchTo().alert().accept();
		 driver.switchTo().alert().accept();
		 Thread.sleep(3000);
		 wm.JavascriptExecutorClick(driver, Export.AdaniAMD_AWBStockRequestForAWBStocAirlineIssueButtonPopupOk); Thread.sleep(3000);
		 
	}
	
	@Then("^User should go to AWB Stock tab for sub menu Request status$")
	public void User_should_go_to_AWB_Stock_tab_for_sub_menu_Request_status() throws InterruptedException, AWTException 
	{		
		Actions ebookingaction = new Actions(driver);
		ebookingaction.moveToElement(Export.AdaniAMD_AWBStockTab).perform();Thread.sleep(500);
		Export.AdaniAMD_AWBStockRequestStatus1.click();Thread.sleep(1000);		
	}
	
	@Then("^User can verify upload document$")
	public void User_can_verify_upload_document() throws InterruptedException, AWTException 
	{
		
		 Export.AdaniAMD_AWBStockRequestForAWBStocReqStstusUploadDocIcon.click();Thread.sleep(2000);
		 Export.AdaniAMD_AWBStockRequestForAWBStocReqPDFDownloadIcon.click();Thread.sleep(2000);
		 Export.AdaniAMD_AWBStockRequestForAWBStocReqViewDocClosePopup.click();Thread.sleep(2000);
	}
	
	@Then("^User can verify AWB number and status$")
	public void User_can_verify_AWB_number_and_status() throws InterruptedException, AWTException 
	
	{		
		
		 Export.AdaniAMD_AWBStockRequestForAWBStocReqStatusAWBListIcon.click();Thread.sleep(3000);
		 Export.AdaniAMD_AWBStockRequestForAWBStocReqStatusAWBListPopupClose.click();Thread.sleep(3000);
	}
 //------------------- End AdaniAMDExport_AWBStockRequestAndApprovedForAWBStock ---------------------
	
	@Then("^User should go to AWB Stock tab for sub menu AWB Stock Inventory$")
	public void User_should_go_to_AWB_Stock_tab_for_sub_menu_AWB_Stock_Inventory() throws InterruptedException, AWTException 
	{		
		Actions ebookingaction = new Actions(driver);
		ebookingaction.moveToElement(Export.AdaniAMD_AWBStockTab).perform();Thread.sleep(500);
		Export.AdaniAMD_AWBStockAWBStockInventory.click();Thread.sleep(1000);		
	}
	
	@Then("^User should click on Assign hyperlink$")
	public void User_should_click_on_Assign_hyperlink() throws InterruptedException, AWTException 
	{		
		
		Export.AdaniAMD_AWBStockAWBStockInventoryAssignLink.click();Thread.sleep(2000);	
	}
	
	@Then("^User should select SubAgent from SubAgent Name drop down$")
	public void User_should_select_SubAgent_from_SubAgent_Name_drop_down() throws InterruptedException, AWTException 
	{		
		Select SelectSubAgentName = new Select(Export.AdaniAMD_AWBStockAWBStockInventorySubAgentDropdown);Thread.sleep(1000);		
		SelectSubAgentName.selectByVisibleText("JEENA & COMPANY");Thread.sleep(1000);		
	}
	
	@Then("^User should enter Issued Quantity$")
	public void User_should_enter_Issued_Quantity() throws InterruptedException, AWTException 
	{		
		Export.AdaniAMD_AWBStockAWBStockInventoryQty.sendKeys("1");Thread.sleep(1000);	
			
	}
	
	@Then("^User should select AWB checkbox$")
	public void User_should_select_AWB_checkbox() throws InterruptedException, AWTException 
	{		
		
		Export.AdaniAMD_AWBStockAWBStockInventoryAWBCheckBox.click();Thread.sleep(2000);	
	}
	
	@Then("^User should click on Issue button$")
	public void User_should_click_on_Issue_button() throws InterruptedException, AWTException 
	{		
		Export.AdaniAMD_AWBStockAWBStockInventoryIssueButton.click();Thread.sleep(3000);	
		wm.JavascriptExecutorClick(driver, Export.AdaniAMD_AWBStockAWBStockInventoryIssueButtonOkPopup);Thread.sleep(3000);	
	}
	

	
	 //-------------------------- End AdaniAMDExport_AWBStockAWBStockInventory ----------------------
	
	@Then("^User should go to AWB Stock tab for sub menu AWB Status$")
	public void User_should_go_to_AWB_Stock_tab_for_sub_menu_AWB_Status() throws InterruptedException, AWTException 
	{		
		Actions ebookingaction = new Actions(driver);
		ebookingaction.moveToElement(Export.AdaniAMD_AWBStockTab).perform();Thread.sleep(500);
		Export.AdaniAMD_AWBStockAWBStatus.click();Thread.sleep(1000);		
	}
	
	@Then("^User should enter AWB no with prefix and click on search button$")
	public void User_should_enter_AWB_no_with_prefix_and_click_on_search_button() throws InterruptedException, AWTException 
	{		
		Export.AdaniAMD_AWBStockAWBStatusPrefix.sendKeys("999");Thread.sleep(1000);	
		Export.AdaniAMD_AWBStockAWBStatusAWBNuber.sendKeys("38340433");Thread.sleep(1000);	
		Export.AdaniAMD_AWBStockAWBStatusSearchButton.click();Thread.sleep(2000);	
	}
	
	@Then("^User should verify clear button$")
	public void User_should_verify_clear_button() throws InterruptedException, AWTException 
	{		
		Export.AdaniAMD_AWBStockAWBStatusClearButton.click();Thread.sleep(2000);	
	}
	
	@Then("^User should verify available status$")
	public void User_should_verify_available_status() throws InterruptedException, AWTException 
	{		
		Export.AdaniAMD_AWBStockAWBStatusAvailableStatusButton.click();Thread.sleep(2000);	
	}
	
	@Then("^User should verify used status$")
	public void User_should_verify_used_status() throws InterruptedException, AWTException 
	{		
		Export.AdaniAMD_AWBStockAWBStatusUsedStatusButton.click();Thread.sleep(2000);	
	}
	
	@Then("^User should verify withdrawn status$")
	public void User_should_verify_withdrawn_status() throws InterruptedException, AWTException 
	{		
		Export.AdaniAMD_AWBStockAWBStatusWithdrawnStatusButton.click();Thread.sleep(2000);	
	}
	
	@Then("^User should verify export to excel$")
	public void User_should_verify_export_to_excel() throws InterruptedException, AWTException 
	{		
		Export.AdaniAMD_AWBStockAWBStatusExportToExcelButton.click();Thread.sleep(2000);	
	}
	
	 //-------------------------- End AdaniAMDExport_AWBStockAWBStatus ----------------------
	
	@Then("^User should go to AWB Stock tab for sub menu sub agent issue inventory$")
	public void User_should_go_to_AWB_Stock_tab_for_sub_menu_sub_agent_issue_inventory() throws InterruptedException, AWTException 
	{		
		Actions ebookingaction = new Actions(driver);
		ebookingaction.moveToElement(Export.AdaniAMD_AWBStockTab).perform();Thread.sleep(500);
		Export.AdaniAMD_AWBStockAubAgentIssueInventory.click();Thread.sleep(1000);		
	}
	
	@Then("^User should Select From Date and To Date from the calendar$")
	public void User_should_Select_From_Date_and_To_Date_from_the_calendar() throws InterruptedException, AWTException 
	{		
		//Export.AdaniAMD_AWBStockAWBSubAgentIssueInventoryFromDate.sendKeys("01 Sep 2023");Thread.sleep(1000);		
		//Export.AdaniAMD_AWBStockAWBSubAgentIssueInventoryToDate.sendKeys("30 Sep 2023");Thread.sleep(1000);		
	}
	
	@Then("^User should click on Search button and details grid sould be displayed$")
	public void User_should_click_on_Search_button_and_details_grid_sould_be_displayed() throws InterruptedException, AWTException 
	{		
	
		Export.AdaniAMD_AWBStockAWBSubAgentIssueInventorySearchButton.click();Thread.sleep(1000);		
	}
	
	@Then("^User should click on Clear button and entered field should be reset$")
	public void User_should_click_on_Clear_button_and_entered_field_should_be_reset() throws InterruptedException, AWTException 
	{	
		Export.AdaniAMD_AWBStockAWBSubAgentIssueInventoryClearButton.click();Thread.sleep(2000);		
	}
	//-------------------------- End AdaniAMDExport_AWBStockSubAgentIssueInventory -----------
	
	@Then("^User should go to AWB Stock tab for sub menu sub agent received inventory$")
	public void User_should_go_to_AWB_Stock_tab_for_sub_menu_sub_agent_received_inventory() throws InterruptedException, AWTException 
	{		
		Actions ebookingaction = new Actions(driver);
		ebookingaction.moveToElement(Export.AdaniAMD_AWBStockTab).perform();Thread.sleep(500);
		Export.AdaniAMD_AWBStockAubAgentReceivedInventory.click();Thread.sleep(1000);		
	}
	//---------------------- End AdaniAMDExport_AWBStockSubAgentReceivedInventory ---------------------
	
	@Then("^User should go to AWB Stock tab for sub menu Subagent AWB status$")
	public void User_should_go_to_AWB_Stock_tab_for_sub_menu_Subagent_AWB_status() throws InterruptedException, AWTException 
	{		
		Actions ebookingaction = new Actions(driver);
		ebookingaction.moveToElement(Export.AdaniAMD_AWBStockTab).perform();Thread.sleep(500);
		Export.AdaniAMD_AWBStockSubAgentAWBStatus.click();Thread.sleep(1000);		
	}
	 // -----------------End AdaniAMDExport_AWBStockSubAgentAWBStatus ---------------
}	

		