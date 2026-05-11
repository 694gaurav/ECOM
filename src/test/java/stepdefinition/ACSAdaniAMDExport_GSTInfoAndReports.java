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

public class ACSAdaniAMDExport_GSTInfoAndReports {
	
	//String AdaniAMDExport = cm.Random_AWBNo();	
	
	
	public boolean verify;

	
	@Then("^User should go to GST Info tab$")
	public void User_should_go_to_GST_Info_tab() throws InterruptedException, AWTException 
	{		
		Export.AdaniAMD_GSTInfoTab.click();Thread.sleep(1000);		
	}
	
	@Then("^User should be able to Click on Add New and GST Details page should be display$")
	public void User_should_be_able_to_Click_on_Add_New_and_GST_Details_page_should_be_display() throws InterruptedException, AWTException 
	{		
		Export.AdaniAMD_GSTInfoAddNewButton.click();Thread.sleep(6000);		
		cm.Verify(verify, Export.AdaniAMD_GSTInfoPageVerify);
	}
	
	@Then("^User should be able to Enter all details$")
	public void User_should_be_able_to_Enter_all_details() throws InterruptedException, AWTException 
	{		
		Export.AdaniAMD_GSTInfoBranch.click();Thread.sleep(2000);	
		Robot AdaniAMD_GSTInfoBranch = new Robot();
		AdaniAMD_GSTInfoBranch.keyPress(KeyEvent.VK_DOWN);Thread.sleep(1000);
		AdaniAMD_GSTInfoBranch.keyPress(KeyEvent.VK_DOWN);Thread.sleep(1000);
		AdaniAMD_GSTInfoBranch.keyPress(KeyEvent.VK_ENTER);Thread.sleep(1000);
		
		Select SelectAdaniAMD_GSTInfoConstitutionOfBusiness = new Select(Export.AdaniAMD_GSTInfoConstitutionOfBusiness);Thread.sleep(500);
		SelectAdaniAMD_GSTInfoConstitutionOfBusiness.selectByVisibleText("Private Limited Company");Thread.sleep(500);
		
		Export.AdaniAMD_GSTInfoPAN.sendKeys("ASDFG"+cm.RandomNo(4)+"K");Thread.sleep(500);
		
		Select SelectAdaniAMD_GSTInfoPageTypeOfParty = new Select(Export.AdaniAMD_GSTInfoPageTypeOfParty);Thread.sleep(500);
		SelectAdaniAMD_GSTInfoPageTypeOfParty.selectByVisibleText("General");Thread.sleep(500);
		
		Export.AdaniAMD_GSTInfoPageGSTNO.sendKeys(cm.RandomNo(6));Thread.sleep(500);
		
	}
	
	@Then("^User should be click on save button$")
	public void User_should_be_click_on_save_button() throws InterruptedException, AWTException 
	{		
		Export.AdaniAMD_GSTInfoPageSaveInfo.click();Thread.sleep(50000);		
		
		
		//Export.AdaniAMD_GSTInfoPageSaveInfoPopUP.click();Thread.sleep(2000);	
	}
	
	@Then("^User Should display New GST Details on GST Information page$")
	public void User_Should_display_New_GST_Details_on_GST_Information_page() throws InterruptedException, AWTException 
	{		
		wm.isElementTextMatch(driver, Export.AdaniAMD_GSTInfoPage, "GST Information");
	}
	
	@Then("^User should able to edit GST Details$")
	public void User_should_able_to_edit_GST_Details() throws InterruptedException, AWTException 
	{		
		Export.AdaniAMD_GSTInfoPageeEditcon.click();Thread.sleep(1000);
		
		Export.AdaniAMD_GSTInfoPAN.clear();Thread.sleep(1000);
        Export.AdaniAMD_GSTInfoPAN.sendKeys("LKJHF"+cm.RandomNo(4)+"S");Thread.sleep(500);	
        
        Export.AdaniAMD_GSTInfoPageGSTNO.clear();Thread.sleep(1000);
		Export.AdaniAMD_GSTInfoPageGSTNO.sendKeys(cm.RandomNo(6));Thread.sleep(500);
	}
	
	@Then("^User should be able to click on delete icon and GST Information Deleted Successfully$")
	public void User_should_be_able_to_click_on_delete_icon_and_GST_Information_Deleted_Successfully() throws InterruptedException, AWTException 
	{		
		Export.AdaniAMD_GSTInfoPageDeleteIcon.click();Thread.sleep(1000);
		Export.AdaniAMD_GSTInfoPageDeleteOkPopUp.click();Thread.sleep(1000);
	}
	
	// --------------------- End AdaniAMDExport_AddEditDeleteNewGSTInfo -------------------
		
		@Then("^User should go to reports tab for sub menu Transaction Report$")
		public void User_should_go_to_reports_tab_for_sub_menu_Transaction_Report() throws InterruptedException, AWTException 
		{
			
			Actions ebookingaction = new Actions(driver);
			ebookingaction.moveToElement(Export.AdaniAMD_ReportsTab).perform();Thread.sleep(500);
			Export.AdaniAMD_ReportsSubMenuTranscationReport.click();Thread.sleep(1000);
			Thread.sleep(3000);
		
		}
		

		@Then("^User should Select CTO from dropdown for Transcation Report$")
		public void User_should_Select_CTO_from_dropdown_for_Transcation_Report() throws InterruptedException, AWTException 
		{
			
			Select SelectCTO = new Select(Export.AdaniAMD_ReportsSubMenuTranscationReportCTODropDown);Thread.sleep(500);
			SelectCTO.selectByVisibleText("Kale_GHA1");Thread.sleep(500);
			
		}
		
		@Then("^User should Select From Date from calendar or change by arrow keys from keyboard$")
		public void User_should_Select_From_Date_from_calendar_or_change_by_arrow_keys_from_keyboard() throws InterruptedException, AWTException 
		{
			Export.AdaniAMD_ReportsSubMenuTranscationReportFromDate.clear();Thread.sleep(1000);
			Export.AdaniAMD_ReportsSubMenuTranscationReportFromDate.sendKeys("01 Aug 2023");Thread.sleep(1000);
			
		}
		
		@Then("^User should Select To Date from calendar or change by arrow keys from keyboard$")
		public void User_should_Select_To_Date_from_calendar_or_change_by_arrow_keys_from_keyboard() throws InterruptedException, AWTException 
		{
			Export.AdaniAMD_ReportsSubMenuTranscationReportToDate.clear();Thread.sleep(1000);
			Export.AdaniAMD_ReportsSubMenuTranscationReportToDate.sendKeys("01 Sep 2023");Thread.sleep(1000);
			
		}
		
		@Then("^User should Click on Export to Excel button$")
		public void User_should_Click_on_Export_to_Excel_button() throws InterruptedException, AWTException 
		{
			wm.JavascriptExecutorClick(driver, Export.AdaniAMD_ReportsSubMenuTranscationReportExcelToExportButton);
			Thread.sleep(1000);
			
		}

	
		//---------------------------- End AdaniAMDExport_TranscationReport ------------------------------------
		
		@Then("^User should go to reports tab for sub menu Dwell Time Report$")
		public void User_should_go_to_reports_tab_for_sub_menu_Dwell_Time_Report() throws InterruptedException, AWTException 
		{
			Actions ebookingaction = new Actions(driver);
			ebookingaction.moveToElement(Export.AdaniAMD_ReportsTab).perform();Thread.sleep(500);
			Export.AdaniAMD_ReportsSubMenuDwellTimeReport.click();Thread.sleep(1000);
			
		}
		
		@Then("^User should Select Mode from dropdown$")
		public void User_should_Select_Mode_from_dropdown() throws InterruptedException, AWTException 
		{
			
			Select SelectMode = new Select(Export.AdaniAMD_ReportsSubMenDwellTimeReportMode);Thread.sleep(500);
			SelectMode.selectByVisibleText("Export");Thread.sleep(500);
			
		}
		
		@Then("^User should Select CTO from dropdown for Dwell Time Report$")
		public void User_should_Select_CTO_from_dropdown_for_Dwell_Time_Report() throws InterruptedException, AWTException 
		{
			
			Select SelectCTO = new Select(Export.AdaniAMD_ReportsSubMenuDwellTimeReportCTODropDown);Thread.sleep(500);
			SelectCTO.selectByVisibleText("Kale_GHA2");Thread.sleep(500);
			
		}
		
		@Then("^User should be able to Select the Dwell Time for Vehical$")
		public void User_should_be_able_to_Select_the_Dwell_Time_for_Vehical() throws InterruptedException, AWTException 
		{
			
			// By default it is selected
			
		}
	
    //------------------------- End AdaniAMDExport_DwellTimeReportVechicle ------------------------
		
		@Then("^User should be able to Select the Dwell Time for shipment$")
		public void User_should_be_able_to_Select_the_Dwell_Time_for_shipment() throws InterruptedException, AWTException 
		{
			
			Export.AdaniAMD_ReportsSubMenuDwellTimeReportShipment.click();Thread.sleep(500);
			
		}
		//-------------------------------- End AdaniAMDExport_DwellTimeReportShipment -------------------
		
		@Then("^User should Select Mode from dropdown for Tonnage Report$")
		public void User_should_Select_Mode_from_dropdown_for_Tonnage_Report() throws InterruptedException, AWTException 
		{
			
			Select SelectMode = new Select(Export.AdaniAMD_ReportsSubMenuTonnageReportMode);Thread.sleep(500);
			SelectMode.selectByVisibleText("Exports");Thread.sleep(500);
			
		}
		
		@Then("^User should go to reports tab for sub menu Tonnage Report$")
		public void User_should_go_to_reports_tab_for_sub_menu_Tonnage_Report() throws InterruptedException, AWTException 
		{
			Actions ebookingaction = new Actions(driver);
			ebookingaction.moveToElement(Export.AdaniAMD_ReportsTab).perform();Thread.sleep(500);
			Export.AdaniAMD_ReportsSubMenuTonnageReport.click();Thread.sleep(1000);
			
		}
		
		@Then("^User should Select CTO from dropdown for Tonnage Report$")
		public void User_should_Select_CTO_from_dropdown_for_Tonnage_Report() throws InterruptedException, AWTException 
		{
			
			Select SelectCTO = new Select(Export.AdaniAMD_ReportsSubMenuTonnageReportCTODropDown);Thread.sleep(500);
			SelectCTO.selectByVisibleText("Kale_GHA1");Thread.sleep(500);
			
		}
		
		@Then("^User should be able to select the Shipment Type From Dropdown$")
		public void User_should_be_able_to_select_the_Shipment_Type_From_Dropdown() throws InterruptedException, AWTException 
		{
			
			Select SelectCTO = new Select(Export.AdaniAMD_ReportsSubMenuTonnageReportShipmentType);Thread.sleep(500);
			SelectCTO.selectByVisibleText("Direct");Thread.sleep(500);
			
		}
		
		@Then("^User should be able to select the Commodity Type From Dropdown$")
		public void User_should_be_able_to_select_the_Commodity_Type_From_Dropdown() throws InterruptedException, AWTException 
		{
			
			Select SelectCTO = new Select(Export.AdaniAMD_ReportsSubMenuTonnageReportCommodityType);Thread.sleep(500);
			SelectCTO.selectByVisibleText("General Cargo");Thread.sleep(500);
			
		}
		
		@Then("^User should be able to select the Airline From Dropdown$")
		public void User_should_be_able_to_select_the_Airline_From_Dropdown() throws InterruptedException, AWTException 
		{
			
			Select SelectCTO = new Select(Export.AdaniAMD_ReportsSubMenuTonnageReportAirline);Thread.sleep(500);
			SelectCTO.selectByVisibleText("Emirates");Thread.sleep(500);
			
		}
		
		@Then("^User should be able to enter Airport code in Airport field$")
		public void User_should_be_able_to_enter_Airport_code_in_Airport_field() throws InterruptedException, AWTException 
		{
			
		Export.AdaniAMD_ReportsSubMenuTonnageReportAirport.sendKeys("AMD");;Thread.sleep(500);
			
			
		}
		// ------------------------ End AdaniAMDExport_TonnageReport ------------------------
}	
		