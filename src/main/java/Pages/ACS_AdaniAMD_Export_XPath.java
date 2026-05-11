package Pages;

import static Helper.BaseObjects.Export;
import static Helper.BaseObjects.cm;
import static Helper.BaseObjects.driver;
import static Helper.BaseObjects.wm;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Methods.WebDriverMethod;
import Methods.WebdriverMethods;
import junit.framework.Assert;

public class ACS_AdaniAMD_Export_XPath extends Pages.BasePage {

	public ACS_AdaniAMD_Export_XPath(WebDriver driver) {
		super(driver);
	
	}
	

	@FindBy(xpath = "(//*[text()='Exports'][@id='ctl00_btnexp'])")
	public WebElement AdaniExportModule;
	
	@FindBy(xpath = "(//*[text()='Ahmedabad'])")
	public WebElement AirportNameAMD;
	
	@FindBy(xpath = "(//*[text()='e-AWB'])")
	public WebElement AdaniAMD_eAWBTab;
	
	@FindBy(xpath = "(//*[text()='Quick ASI'])")
	public WebElement AdaniAMD_QuickASI;
	
	@FindBy(xpath = "(//*[text()='Select CTO'])/parent::td/select")
	public WebElement AdaniAMD_QuickASI_SelectCTODropdown;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_ddlShipmentType'])")
	public WebElement AdaniAMD_QuickASI_ShipmentTypeDropdown;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtAWBPrefix'])")
	public WebElement AdaniAMD_QuickASI_MAWBPrefix;
	
	@FindBy(xpath = "(//*[@name='ctl00$hldPage$txtAWBNo'])")
	public WebElement AdaniAMD_QuickASI_MAWBNumber;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtDestAirport'])")
	public WebElement AdaniAMD_QuickASI_Destination;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtMasterNoOfPkg'])")
	public WebElement AdaniAMD_QuickASI_NOP;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtMasterGrossWeight'])")
	public WebElement AdaniAMD_QuickASI_GrossWt;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtMasterChgWeight'])")
	public WebElement AdaniAMD_QuickASI_ChargbleWt;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtCargoDesc'])")
	public WebElement AdaniAMD_QuickASI_NatureOfGood;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtCarrier1'])")
	public WebElement AdaniAMD_QuickASI_CarrierCode;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtflightno1'])")
	public WebElement AdaniAMD_QuickASI_FlightNo;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtbyfirstcarrier'])")
	public WebElement AdaniAMD__FirstCarrier;
	
	@FindBy(xpath = "(//*[text()='Select '])")
	public WebElement AdaniAMD_QuickASI_AssignCHASelect;
	
	@FindBy(xpath = "(//*[text()='AEROPRIME Cargo Pvt Ltd.'])[3]")
	public WebElement AdaniAMD_QuickASI_AssignCHAName;
	
	@FindBy(xpath = "(//*[text()='JEENA & COMPANY'])")
	public WebElement AdaniAMD_QuickASI_AssignCHAKrishna_Jeena;
	
	@FindBy(xpath = "(//*[text()='Surya_Bonded'])")
	public WebElement AdaniAMD_QuickASI_AssignCHASurya;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_ddlBondedTruckers'])")
	public WebElement AdaniAMD_QuickASI_BondedTruckerDropdown;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnSaveAwb'])")
	public WebElement AdaniAMD_QuickASI_SaveAWB;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnCHANo'])")
	public WebElement AdaniAMD_QuickASI_MessageAlertOK;
	
	//-------------------- Consol AWB ----------------------
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rdoConsol'])")
	public WebElement AdaniAMD_QuickASI_ConsolAWB;
	
	@FindBy(xpath = "(//*[@Value='Add HAWB'])")
	public WebElement AdaniAMD_QuickASI_AddHAWB;
	

	
	//------------------- Add HAWB -------------------
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHouse_ctl01_txtHAWBNo'])")
	public WebElement AdaniAMD_QuickASI_HAWBNumber1;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHouse_ctl01_txtOriginPortCode'])")
	public WebElement AdaniAMD_QuickASI_HAWBOrign1;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHouse_ctl01_txtDestinationPortCode'])")
	public WebElement AdaniAMD_QuickASI_HAWBDestination1;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHouse_ctl01_txtPkgs'])")
	public WebElement AdaniAMD_QuickASI_HAWBNOP1;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHouse_ctl01_txtWt'])")
	public WebElement AdaniAMD_QuickASI_HAWBGrossWt1;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHouse_ctl01_mltSlctCHAForHAWB'])")
	public WebElement AdaniAMD_QuickASI_HAWBAssighCHADropdown1;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdMAWB_ctl02_HplADDHAWB'])")
	public WebElement AdaniAMD_AddHAWB_Milestone;
	
	//------------------------
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHouse_ctl02_txtHAWBNo'])")
	public WebElement AdaniAMD_QuickASI_HAWBNumber2;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHouse_ctl02_txtOriginPortCode'])")
	public WebElement AdaniAMD_QuickASI_HAWBOrign2;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHouse_ctl02_txtDestinationPortCode'])")
	public WebElement AdaniAMD_QuickASI_HAWBDestination2;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHouse_ctl02_txtPkgs'])")
	public WebElement AdaniAMD_QuickASI_HAWBNOP2;	
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHouse_ctl02_txtWt'])")
	public WebElement AdaniAMD_QuickASI_HAWBGrossWt2;
	
	//-------------------
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHouse_ctl03_txtHAWBNo'])")
	public WebElement AdaniAMD_QuickASI_HAWBNumber3;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHouse_ctl03_txtOriginPortCode'])")
	public WebElement AdaniAMD_QuickASI_HAWBOrign3;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHouse_ctl03_txtDestinationPortCode'])")
	public WebElement AdaniAMD_QuickASI_HAWBDestination3;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHouse_ctl03_txtPkgs'])")
	public WebElement AdaniAMD_QuickASI_HAWBNOP3;	
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHouse_ctl03_txtWt'])")
	public WebElement AdaniAMD_QuickASI_HAWBGrossWt3;
	
	//-----------------
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHouse_ctl04_txtHAWBNo'])")
	public WebElement AdaniAMD_QuickASI_HAWBNumber4;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHouse_ctl04_txtOriginPortCode'])")
	public WebElement AdaniAMD_QuickASI_HAWBOrign4;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHouse_ctl04_txtDestinationPortCode'])")
	public WebElement AdaniAMD_QuickASI_HAWBDestination4;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHouse_ctl04_txtPkgs'])")
	public WebElement AdaniAMD_QuickASI_HAWBNOP4;	
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHouse_ctl04_txtWt'])")
	public WebElement AdaniAMD_QuickASI_HAWBGrossWt4;
	
	//-----------------
	
	@FindBy(xpath = "(//*[@text='Add Row'])")
	public WebElement AdaniAMD_QuickASI_HAWBAddRow;
	
	
	@FindBy(xpath = "(//*[@Value='Bulk CHA Assignment'])")
	public WebElement AdaniAMD_QuickASI_HAWBBulkCHAAssignmentButton;
	
	@FindBy(xpath = "(//*[text()='Bulk CHA Assignment'])")
	public WebElement AdaniAMD_QuickASI_HAWBBulkCHAAssignmentScreen;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdHAWBCHA_ctl03_chkRecord'])")
	public WebElement AdaniAMD_QuickASI_HAWBBulkCHAAssignmentCheckBox;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdHAWBCHA_ctl04_chkRecord'])")
	public WebElement AdaniAMD_QuickASI_HAWBBulkCHAAssignmentCheckBox1;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdHAWBCHA_ctl05_chkRecord'])")
	public WebElement AdaniAMD_QuickASI_HAWBBulkCHAAssignmentCheckBox2;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_ddlCHA'])")
	public WebElement AdaniAMD_QuickASI_HAWBBulkCHADropdown;
	
	@FindBy(xpath = "(//*[@Value='Assign CHA'])")
	public WebElement AdaniAMD_QuickASI_HAWBBulkAssignCHAButton;
	
	@FindBy(xpath = "(//*[text()='CHA Assigned successfully.'])/parent::div/parent::div/div[3]/button")
	public WebElement AdaniAMD_QuickASI_HAWBBulkAssignCHAOK;
	
	@FindBy(xpath = "(//*[text()='Bulk CHA Assignment'])/parent::div/button/span")
	public WebElement AdaniAMD_QuickASI_HAWBBulkAssignCHAClose;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnSave'])")
	public WebElement AdaniAMD_QuickASI_HAWBSave;	
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHouse_ctl04_lnkHawBDeleteAWB'])")
	public WebElement AdaniAMD_QuickASI_HAWBDelete;	
	
	@FindBy(xpath = "(//*[@id='Button2'])")
	public WebElement AdaniAMD_QuickASI_HAWBDeleteOK;	
	
	//-------------- MAWB filter  ---------------------
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdMAWB_ctl01_txtFilter2'])")
	public WebElement AdaniAMD_FilterMAWBNo;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdMAWB_ctl01_imgFilterOperator2'])")
	public WebElement AdaniAMD_FilterOperator;
	
	@FindBy(xpath = "(//*[text()=' Contains'])")
	public WebElement AdaniAMD_FilterContains;
	
	//------------- ASI Submission ---------------
		
	@FindBy(xpath = "(//*[@title='Submit Advance Shipment Info'])")
	public WebElement AdaniAMD_ASIMileStone;
	
	@FindBy(xpath = "(//*[text()='ASI Submission'])[1]")
	public WebElement AdaniAMD_ASISubmissionScreen;
	
	@FindBy(xpath = "(//*[@id='btnASIProceedNew'])")
	public WebElement AdaniAMD_ASIProceedButton;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnASIYesNew'])")
	public WebElement AdaniAMD_ASIProceedButtonYes;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_Button4'])")
	public WebElement AdaniAMD_ASIProceedButtonOk;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdMAWB_ctl02_HyperLinkSB'])")
	public WebElement AdaniAMD_AddSBMilestone;
	
	// -------------------- Carting Order ----------------
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdMAWB_ctl02_lblhreApprovedCO'])")
	public WebElement AdaniAMD_COApproved;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdMAWB_ctl02_hreApprovedCO'])")
	public WebElement AdaniAMD_COResubmitMileStone;
	
	@FindBy(xpath = "(//*[@id='(//*[@id='ctl00_hldPage_btnRequestCartingOrder'])'])")
	public WebElement AdaniAMD_COResubmitYes;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnCORreq'])")
	public WebElement AdaniAMD_COResubmitPopUpOk;
	

	// ------------------------- Shipping Bill SB -----------------
	
	@FindBy(xpath = "(//*[@title='Add Shipping Bill'])[2]")
	public WebElement AdaniAMD_AddSBMileStone;
	
	@FindBy(xpath = "(//*[text()='Shipping Bill Details'])")
	public WebElement AdaniAMD_AddSBDetailsScreen;
	
	@FindBy(xpath = "(//*[@id='txtSBNumber'])")
	public WebElement AdaniAMD_AddSBNumber1;
	
	@FindBy(xpath = "(//*[@id='txtSBDate'])/parent::td/img")
	public WebElement AdaniAMD_AddSBDate1;
	
	@FindBy(css = "#ui-datepicker-div > table > tbody > tr:nth-child(1) > td.ui-datepicker-days-cell-over.ui-datepicker-today > a")
	public WebElement AdaniAMD_AddSBCurrentDate1;
	
	@FindBy(css = "#ui-datepicker-div > table > tbody > tr:nth-child(2) > td.ui-datepicker-days-cell-over.ui-datepicker-today > a")
	public WebElement AdaniAMD_AddSBCurrentDate2;
	
	@FindBy(css = "#ui-datepicker-div > table > tbody > tr:nth-child(3) > td.ui-datepicker-days-cell-over.ui-datepicker-today > a")
	public WebElement AdaniAMD_AddSBCurrentDate3;
	
	@FindBy(css = "#ui-datepicker-div > table > tbody > tr:nth-child(4) > td.ui-datepicker-days-cell-over.ui-datepicker-today > a")
	public WebElement AdaniAMD_AddSBCurrentDate4;
	
	@FindBy(css = "#ui-datepicker-div > table > tbody > tr:nth-child(5) > td.ui-datepicker-days-cell-over.ui-datepicker-today > a")
	public WebElement AdaniAMD_AddSBCurrentDate5;
	
	@FindBy(xpath = "(//*[@id='drpSBType'])")
	public WebElement AdaniAMD_AddSBType1;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_ShippingBill_dvselect'])")
	public WebElement AdaniAMD_AddSBHAWB1;
	
	@FindBy(xpath = "(//*[@title='Select House No.'])")
	public WebElement AdaniAMD_AddSBHAWBDrpodown1;
	
	@FindBy(xpath = "(//*[@id='txtNOP'])")
	public WebElement AdaniAMD_AddSBNOP1;
	
	@FindBy(xpath = "(//*[@id='txtGrossWt'])")
	public WebElement AdaniAMD_AddSBGrossWt1;
	
	@FindBy(xpath = "(//*[@id='addDimensions_1'])")
	public WebElement AdaniAMD_AddSBDimenssionIcon1;
	
	@FindBy(xpath = "(//*[@id='txtNoPcs_1'])")
	public WebElement AdaniAMD_AddSBDimNOP1;
	
	@FindBy(xpath = "(//*[@id='txtLength_1'])")
	public WebElement AdaniAMD_AddSBDimLength1;
	
	@FindBy(xpath = "(//*[@id='txtWidth_1'])")
	public WebElement AdaniAMD_AddSBDimWidth1;
	
	@FindBy(xpath = "(//*[@id='txtHeight_1'])")
	public WebElement AdaniAMD_AddSBDimHeight1;
	
	@FindBy(xpath = "(//*[@id='txtVolume_1'])")
	public WebElement AdaniAMD_AddSBDimVolume1;
	
	@FindBy(xpath = "(//*[@id='txtNoPcs_2'])")
	public WebElement AdaniAMD_AddSBDimNOP2;
	
	
	
	@FindBy(xpath = "(//*[text()='Ok'])[3]")
	public WebElement AdaniAMD_AddSBDimensionOk1;
	
	
	
	@FindBy(xpath = "(//*[@id='txtFOBValue'])")
	public WebElement AdaniAMD_AddSBFOBValue1;
	
	@FindBy(xpath = "(//*[@id='txtExporterName'])")
	public WebElement AdaniAMD_AddSBExporterName1;
	
	@FindBy(xpath = "(//*[@id='AddRow'])")
	public WebElement AdaniAMD_AddSBAddRow1;
	
	//------------------
	
	@FindBy(xpath = "(//*[@id='txtSBNumber'])[2]")
	public WebElement AdaniAMD_AddSBNumber2;
	
	@FindBy(xpath = "(//*[@id='txtSBDate2'])/parent::td/img")
	public WebElement AdaniAMD_AddSBDate2;
	
	@FindBy(xpath = "(//*[@id='drpSBType'])[2]")
	public WebElement AdaniAMD_AddSBType2;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[1]/div[3]/div/div[2]/div[1]/div[2]/div/table[2]/tbody/tr[2]/td[4]/div/div[1]")
	public WebElement AdaniAMD_AddSBHAWB2;
	
	@FindBy(xpath = "(//*[@id='lstHouseNo_2'])")
	public WebElement AdaniAMD_AddSBHAWBDrpodown2;
	
	@FindBy(xpath = "(//*[@id='addDimensions_2'])")
	public WebElement AdaniAMD_AddSBDimenssionIcon2;
	
	@FindBy(xpath = "(//*[@id='txtNOP'])[2]")
	public WebElement AdaniAMD_AddSBNOP2;
	
	@FindBy(xpath = "(//*[@id='txtGrossWt'])[2]")
	public WebElement AdaniAMD_AddSBGrossWt2;
	
	
	@FindBy(xpath = "(//*[@id='txtFOBValue'])[2]")
	public WebElement AdaniAMD_AddSBFOBValue2;
	
	@FindBy(xpath = "(//*[@id='txtExporterName'])[2]")
	public WebElement AdaniAMD_AddSBExporterName2;
	
	//--------------
	
	@FindBy(xpath = "(//*[@id='txtSBNumber'])[3]")
	public WebElement AdaniAMD_AddSBNumber3;
	
	@FindBy(xpath = "(//*[@id='txtSBDate3'])/parent::td/img")
	public WebElement AdaniAMD_AddSBDate3;
	
	@FindBy(xpath = "(//*[@id='drpSBType'])[3]")
	public WebElement AdaniAMD_AddSBType3;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[1]/div[3]/div/div[2]/div[1]/div[2]/div/table[2]/tbody/tr[3]/td[4]/div/div[1]")
	public WebElement AdaniAMD_AddSBHAWB3;
	
	@FindBy(xpath = "(//*[@id='lstHouseNo_3'])")
	public WebElement AdaniAMD_AddSBHAWBDrpodown3;

	@FindBy(xpath = "(//*[@id='txtFOBValue'])[3]")
	public WebElement AdaniAMD_AddSBFOBValue3;
	
	@FindBy(xpath = "(//*[@id='txtExporterName'])[3]")
	public WebElement AdaniAMD_AddSBExporterName3;
	
	//------------
	

	@FindBy(xpath = "(//*[@id='txtSBNumber'])[4]")
	public WebElement AdaniAMD_AddSBNumber4;
	
	@FindBy(xpath = "(//*[@id='txtSBDate4'])/parent::td/img")
	public WebElement AdaniAMD_AddSBDate4;
	
	@FindBy(xpath = "(//*[@id='drpSBType'])[4]")
	public WebElement AdaniAMD_AddSBType4;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[1]/div[3]/div/div[2]/div[1]/div[2]/div/table[2]/tbody/tr[4]/td[4]/div/div[1]")
	public WebElement AdaniAMD_AddSBHAWB4;
	
	@FindBy(xpath = "(//*[@id='lstHouseNo_4'])")
	public WebElement AdaniAMD_AddSBHAWBDrpodown4;

	@FindBy(xpath = "(//*[@id='txtFOBValue'])[4]")
	public WebElement AdaniAMD_AddSBFOBValue4;
	
	@FindBy(xpath = "(//*[@id='txtExporterName'])[4]")
	public WebElement AdaniAMD_AddSBExporterName4;
	
	//---------------
	
	@FindBy(xpath = "(//*[@id='btnSaveAWB'])")
	public WebElement AdaniAMD_AddSBSave;
	
	@FindBy(xpath = "(//*[@value='Ok'])")
	public WebElement AdaniAMD_AddSBSaveOk;
	
	@FindBy(xpath = "(//*[@title='Add'])")
	public WebElement AdaniAMD_DimensionAddRow;
	
	@FindBy(xpath = "(//*[@title='Delete'])")
	public WebElement AdaniAMD_DimensionDeleteRow;
	
	@FindBy(xpath = "(//*[text()='Cancel'])[3]")
	public WebElement AdaniAMD_DimensionCancel;
	
	@FindBy(xpath = "(//*[@id='btnCancelSaveAWB'])")
	public WebElement AdaniAMD_SBScreenBackButton;
	
	@FindBy(xpath = "(//*[@title='Partially Completed'])")
	public WebElement AdaniAMD_SBPartiallyPCompletedMileStone;
	
	//-----------TSP  ----------------
	
	@FindBy(xpath = "(//*[@title='Pending'])")
	public WebElement AdaniAMD_TSPMileStone;
	
	@FindBy(xpath = "(//*[@value='Proceed'])[6]")
	public WebElement AdaniAMD_TSPPaymentMethodProceed;
	
	@FindBy(xpath = "(//*[@value='Proceed'])[5]")
	public WebElement AdaniAMD_TSPPaymentMethodProceed1;
	
	@FindBy(xpath = "(//*[@title='Complete'])")
	public WebElement AdaniAMD_TSPCompletedMileStone;
	
	@FindBy(xpath = "(//*[@title='Partially Completed'])")
	public WebElement AdaniAMD_TSPartiallyPCompletedMileStone;
	
	@FindBy(xpath = "(//*[text()='TSP Payment '])")
	public WebElement AdaniAMD_TSPPaymentScreen	;
	
	@FindBy(xpath = "(//*[text()='SB Details'])")
	public WebElement AdaniAMD_TSPSBDetailScreen;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_ddlTypeTxt'])")
	public WebElement AdaniAMD_TSPCargoTypeDropdown;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdSBDetails_ctl02_ddlTypeTxtinGrd'])")
	public WebElement AdaniAMD_TSPCargoTypeDropdown1;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdSBDetails_ctl03_ddlTypeTxtinGrd'])")
	public WebElement AdaniAMD_TSPCargoTypeDropdown2;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdSBDetails_ctl04_ddlTypeTxtinGrd'])")
	public WebElement AdaniAMD_TSPCargoTypeDropdown3;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_ddlComodityTypeName'])")
	public WebElement AdaniAMD_TSPComodityName;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdSBDetails_ctl02_ddlComodityTypeNameinGrd'])")
	public WebElement AdaniAMD_TSPComodityName1;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdSBDetails_ctl03_ddlComodityTypeNameinGrd'])")
	public WebElement AdaniAMD_TSPComodityName2;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdSBDetails_ctl04_ddlComodityTypeNameinGrd'])")
	public WebElement AdaniAMD_TSPComodityName3;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdSBDetails_ctl01_chkRecordAll'])")
	public WebElement AdaniAMD_SBDetailsCheckBox;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtHSNCode'])")
	public WebElement AdaniAMD_TSPHSNCode;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtTransPassword'])")
	public WebElement AdaniAMD_TSPTransactionPassword;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtTransPassword'])/parent::td/i/span")
	public WebElement AdaniAMD_TSPTransactionPasswordViewIcon;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtTransPasswordinBulk'])")
	public WebElement AdaniAMD_TSPTransactionPassword1;
	
	@FindBy(xpath = "(//*[@value='Pay Now'])[2]")
	public WebElement AdaniAMD_TSPPayNowButton;
	
	@FindBy(xpath = "(//*[@value='Pay Now'])[1]")
	public WebElement AdaniAMD_TSPPayNowButton1;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnTSPConfirm'])")
	public WebElement AdaniAMD_TSPPayNowOKButton;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnPayNowinBulk'])")
	public WebElement AdaniAMD_TSPPayNowOKButtonbulk;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnGenerateTokenFromTSPConfirm'])")
	public WebElement AdaniAMD_TSPPayNowYesButton;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_Button2'])")
	public WebElement AdaniAMD_TSPPayNowNoButton;
	
	@FindBy(xpath = "(//*[text()='Back'])")
	public WebElement AdaniAMD_TSPBackButton;
	
	//------------------ Generate Token
	

	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdMAWB_ctl02_chkMawbSelectMAWBWise'])")
	public WebElement AdaniAMD_GenerateTokenCheckBox;
	
	@FindBy(xpath = "(//*[@id='txtVehNo'])")
	public WebElement AdaniAMD_GenerateTokenVechicleNo;
	
	@FindBy(xpath = "(//*[@id='txtDriverLicNo'])")
	public WebElement AdaniAMD_GenerateDriverLicNo;
	
	@FindBy(xpath = "(//*[@id='txtDriverName'])")
	public WebElement AdaniAMD_GenerateTokenDriverName;
	
	@FindBy(xpath = "(//*[@id='txtDriverMobNo'])")
	public WebElement AdaniAMD_GenerateTokenDriverMobNo;
	
	@FindBy(xpath = "(//*[@id='txtNOP'])")
	public WebElement AdaniAMD_GenerateTokenNoP;
	
	@FindBy(xpath = "(//*[@id='txtGrossWt'])")
	public WebElement AdaniAMD_GenerateTokenGrossWt;
	
	@FindBy(xpath = "(//*[@id='txtVehNo'])[2]")
	public WebElement AdaniAMD_GenerateTokenVechicleNo1;
	
	@FindBy(xpath = "(//*[@id='txtDriverLicNo'])[2]")
	public WebElement AdaniAMD_GenerateDriverLicNo1;
	
	@FindBy(xpath = "(//*[@id='txtDriverName'])[2]")
	public WebElement AdaniAMD_GenerateTokenDriverName1;
	
	@FindBy(xpath = "(//*[@id='txtDriverMobNo'])[2]")
	public WebElement AdaniAMD_GenerateTokenDriverMobNo1;
	
	@FindBy(xpath = "(//*[@id='txtNOP'])[2]")
	public WebElement AdaniAMD_GenerateTokenNoP1;
	
	@FindBy(xpath = "(//*[@id='txtGrossWt'])[2]")
	public WebElement AdaniAMD_GenerateTokenGrossWt1;
	
	@FindBy(xpath = "(//*[@value='Generate Token'])")
	public WebElement AdaniAMD_GenerateTokenButton;
	
	@FindBy(xpath = "(//*[@value='Ok'])")
	public WebElement AdaniAMD_GenerateTokenButtonOk;

	
	//------------- Track and Trace ----------------
	
	@FindBy(xpath = "(//*[text()='Track and Trace'])[1]")
	public WebElement AdaniAMD_TrackAndTraceTab;
	
	@FindBy(xpath = "(//*[text()='Track and Trace at AMD Airport'])")
	public WebElement AdaniAMD_TrackAndTraceTabScreen;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdAWB_ctl01_txtFilter0'])")
	public WebElement AdaniAMD_TrackAndTraceFilterAWB;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdAWB_ctl01_imgFilterOperator0'])")
	public WebElement AdaniAMD_TrackAndTraceOperator;
	
	//----------------Vechicle Token -------------
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdMAWB_ctl02_lnkVTNoMAWBWise'])")
	public WebElement AdaniAMD_VechicleTokenMileStone;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdSBDetails_ctl02_lnkVTNo'])")
	public WebElement AdaniAMD_VechicleTokenSBDetailScreen;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdSBDetails_ctl03_lnkVTNo'])")
	public WebElement AdaniAMD_VechicleTokenSBDetailScreen2;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdSBDetails_ctl04_lnkVTNo'])")
	public WebElement AdaniAMD_VechicleTokenSBDetailScreen3;
	
	@FindBy(xpath = "(//*[@id='btnPrintAllToken'])")
	public WebElement AdaniAMD_VechicleTokenPrintAll;
	
	@FindBy(xpath = "(//*[text()='TSP & VT'])")
	public WebElement AdaniAMD_VechicleTokenPrintTokenBoth;
	
	@FindBy(xpath = "(//*[@value='Print'])")
	public WebElement AdaniAMD_VechicleTokenPrintButton;
	
	@FindBy(xpath = "(//*[@value='Cancel Token'])")
	public WebElement AdaniAMD_VechicleTokenCancelButton;
	
	@FindBy(xpath = "(//*[@id='txtSBNo'])")
	public WebElement AdaniAMD_VechicleTokenAWBNo;
	
	@FindBy(xpath = "(//*[@id='txtMAWBNO'])")
	public WebElement AdaniAMD_VechicleTokenAWBNo1;
		
	@FindBy(xpath = "(//*[@id='txtVehTokenNo'])")
	public WebElement AdaniAMD_VechicleTokenVTENo;
	
	@FindBy(xpath = "(//*[@id='txtVehTokenNo'])[2]")
	public WebElement AdaniAMD_VechicleTokenVTENo1;
	
	
	//-------------- Business Line ------------------
	
	@FindBy(xpath = "(//*[text()='FF'])")
	public WebElement AdaniAMD_BLFF;
	
	@FindBy(xpath = "(//*[text()='Customs Broker'])")
	public WebElement AdaniAMD_BLCB;
	
	@FindBy(xpath = "(//*[text()='Bonded Trucker'])")
	public WebElement AdaniAMD_BLBT;
	
	//-------------- Send Manifest  --------
	
	@FindBy(xpath = "(//*[@title='Send Manifest Via Email'])[1]")
	public WebElement AdaniAMD_SendManifestMilestone;
	
	@FindBy(xpath = "(//*[@id='txtSendMail'])")
	public WebElement AdaniAMD_SendManifestEmailID;
	
	@FindBy(xpath = "(//*[@id='btnSendMail'])")
	public WebElement AdaniAMD_SendManifestSendMailButton;
	
	@FindBy(xpath = "(//*[@id='btnCancel'])")
	public WebElement AdaniAMD_SendManifestSendMailClose;
	
	
	//-------------- ACS Receipt --------
	
		@FindBy(xpath = "(//*[@title='View Receipt'])")
		public WebElement AdaniAMD_ACSReceiptMilestone;
		
		@FindBy(xpath = "(//*[@id='txtSendMail'])")
		public WebElement AdaniAMD_ACSReceipEmailID;
		
		@FindBy(xpath = "(//*[@id='btnSendMail'])")
		public WebElement AdaniAMD_ACSReceipSendManifestSendMailButton;
		
		@FindBy(xpath = "(//*[@id='btnCancel'])")
		public WebElement AdaniAMD_ACSReceipSendManifestSendMailClose;
		
		//-------------- e-Docket --------
		
			@FindBy(xpath = "(//*[@title='View Document'])")
			public WebElement AdaniAMD_eDockeViewDocumentMilestone;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdMAWB_ctl02_imgDocket'])")
			public WebElement AdaniAMD_eDockeUploadDocumentMilestone;
			
			@FindBy(xpath = "(//*[@title='Select document type'])")
			public WebElement AdaniAMD_eDockeSelectDocTypeDropdown;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_ddlistDocTemplates1'])")
			public WebElement AdaniAMD_eDockeSelectDocTypeDropdown2;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_fuctlUploadDocs'])")
			public WebElement AdaniAMD_eDockeBrowseButton;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_fuctlUploadDocs1'])")
			public WebElement AdaniAMD_eDockeBrowseButton2;
		
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnUploadSave'])")
			public WebElement AdaniAMD_eDockeUploadButton;
			
			@FindBy(xpath = "(//*[@value='Submit'])")
			public WebElement AdaniAMD_eDockeSubmitButton;
			
			@FindBy(xpath = "(//*[@onclick='javascript: CloseAllBSPop(); window.top.location.reload();'])")
			public WebElement AdaniAMD_eDockeOkButton;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptUploadedDocument_ctl01_lnkDelete'])")
			public WebElement AdaniAMD_eDocketActionDeletButton;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnClear'])")
			public WebElement AdaniAMD_eDocketActionClearButton;
			
			@FindBy(xpath = "(//*[text()='Ok'])[1]")
			public WebElement AdaniAMD_eDocketOkButtonPopup;
			
			
			//------------------- Action Button ------------
			
			@FindBy(xpath = "(//*[@title='Edit Master Air Waybill'])")
			public WebElement AdaniAMD_ActionMilestoneEditButton;
			
			@FindBy(xpath = "(//*[@title='Copy Master Air Waybill'])")
			public WebElement AdaniAMD_ActionMilestoneCopyButton;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnYesCopyAWB'])")
			public WebElement AdaniAMD_ActionMilestoneCopyYesButton;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_Button9'])")
			public WebElement AdaniAMD_ActionMilestoneBackButton;
			
			@FindBy(xpath = "(//*[@title='Delete Master Air WayBill'])")
			public WebElement AdaniAMD_ActionMilestoneDeleteButton;
			
			@FindBy(xpath = "(//*[text()='Yes'])")
			public WebElement AdaniAMD_ActionMilestoneDeleteYesButton;
			
			@FindBy(xpath = "(//*[@id='hdrMstDeleteAlert'])/parent::div/parent::div/div[3]/input")
			public WebElement AdaniAMD_ActionMilestoneDeleteOkButton;
			
			//------------------------ Add Shipment ---------------
			
			@FindBy(xpath = "(//*[@value='Add Shipments'])")
			public WebElement AdaniAMD_AddShipmentButton;	
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdSBWiseShipments_ctl02_chkRecord'])")
			public WebElement AdaniAMD_AddShipmentCheckBox1Button;	
			
			@FindBy(xpath = "(//*[@value='Add'])")
			public WebElement AdaniAMD_AddShipmentAddButton;	
			
			@FindBy(xpath = "(//*[@text='Delete'])[2]")
			public WebElement AdaniAMD_DeleteShipmentButton;	
			
			@FindBy(xpath = "(//*[text()='Delete'])")
			public WebElement AdaniAMD_DeleteShipmentPopup;	
			
//------------------------ View HAWB ---------------
			
			@FindBy(xpath = "(//*[@title='View House Air Waybill'])[2]")
			public WebElement AdaniAMD_ViewHAWBMilestone;	
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnBack'])")
			public WebElement AdaniAMD_ViewHAWBBack;	
			
	// ------------------------ CO Approval Screen ---------------------
			
			@FindBy(xpath = "(//*[text()='CO Approval'])")
			public WebElement AdaniAMD_COApprovalTab;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtAWBNo'])")
			public WebElement AdaniAMD_COApprovalMAWBSearchText;	
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnSearch'])")
			public WebElement AdaniAMD_COApprovalMAWBSearchButton;
			
			@FindBy(xpath = "(//*[@title='View Document'])")
			public WebElement AdaniAMD_COApprovalEDocketButton;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptUploadDocuemntforAirline_ctl01_lnkDocNew'])")
			public WebElement AdaniAMD_COApprovalEDocketUploadedDoc;
			
			@FindBy(xpath = "(//*[text()='Close'])[4]")
			public WebElement AdaniAMD_COApprovalEDocketPopUpClose;
			
			
			// ------------------------ View Password---------------------
			
						@FindBy(xpath = "(//*[@download='User Manual'])/parent::li/parent::ul/parent::div/parent::div/div[2]")
						public WebElement AdaniAMD_UserDropdown;
						
						@FindBy(xpath = "(//*[text()='Change Password'])[1]")
						public WebElement AdaniAMD_ChangePassword;	
						
						@FindBy(xpath = "(//*[@id='ctl00_hldPage_drpPWDType'])")
						public WebElement AdaniAMD_ChangePasswordDropdown;
						
						@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtOldPassword'])")
						public WebElement AdaniAMD_OldPasswordText;
						
						@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtOldPassword'])/parent::td/i/span")
						public WebElement AdaniAMD_OldPasswordViewIcon;
						
						@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtNewPassword'])")
						public WebElement AdaniAMD_NewPasswordText;
						
						@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtNewPassword'])/parent::td/i/span")
						public WebElement AdaniAMD_NewPasswordViewIcon;
						
						@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtConfirmPassword'])")
						public WebElement AdaniAMD_ConfirmPasswordText;
						
						@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtConfirmPassword'])/parent::td/i/span")
						public WebElement AdaniAMD_ConfirmPasswordViewIcon;
						
						@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtTxnoldpwd'])")
						public WebElement AdaniAMD_TransOldPasswordText;
						
						@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtTxnoldpwd'])/parent::td/i/span")
						public WebElement AdaniAMD_TransOldPasswordViewIcon;
						
						@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtTxnNewPwd'])")
						public WebElement AdaniAMD_TransNewPasswordText;
						
						@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtTxnNewPwd'])/parent::td/i/span")
						public WebElement AdaniAMD_TransNewPasswordViewIcon;
						
						@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtTxnconfmPWD'])")
						public WebElement AdaniAMD_TransConfirmPasswordText;
						
						@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtTxnconfmPWD'])/parent::td/i/span")
						public WebElement AdaniAMD_TransConfirmPasswordViewIcon;
						
						
						@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnCancel'])")
						public WebElement AdaniAMD_ChangePasswordCancelButton;
						
	// ------------------------ e-Booking --------------------------------
						
			@FindBy(xpath = "(//*[text()='e-Booking'])[1]")
			public WebElement AdaniAMD_EBookigTab;
			
			@FindBy(xpath = "(//*[text()='Create'])")
			public WebElement AdaniAMD_EBookigCreate;
			
			@FindBy(xpath = "(//*[text()='Saved'])")
			public WebElement AdaniAMD_EBookigSubMenuSave;
			
			@FindBy(xpath = "(//*[text()='Sent'])")
			public WebElement AdaniAMD_EBookigSubMenuSent;
			
			@FindBy(xpath = "(//*[text()='Drafts'])")
			public WebElement AdaniAMD_EBookigSubMenuDrafts;
			
			@FindBy(xpath = "(//*[text()='Templates'])")
			public WebElement AdaniAMD_EBookigSubMenuTemplete;
			
			@FindBy(xpath = "(//*[text()='e-Docket'])")
			public WebElement AdaniAMD_EBookigSubMenuEDocket;
			
			@FindBy(xpath = "(//*[text()='Create '])")
			public WebElement AdaniAMD_EBookigCreatePageVerify;
			
			//-------------------------------------------
			
			@FindBy(xpath = "(//*[@title='Add Shipper Details.'])")
			public WebElement AdaniAMD_EBookigCreateShipperDetailPlusIcon;
			
			@FindBy(xpath = "(//*[text()='Add Shipper'])[3]")
			public WebElement AdaniAMD_EBookigCreateShipperVerify;
			
			//-----------------------------------
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtCompanyName'])")
			public WebElement AdaniAMD_EBookigAddShipperCompanyName;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtShipperAcctDetCode'])")
			public WebElement AdaniAMD_EBookigAddShipperIECode;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtContactPersonEmailId'])")
			public WebElement AdaniAMD_EBookigAddShipperEmailID;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_branchAddressInformation_txtAddressLine1'])")
			public WebElement AdaniAMD_EBookigAddShipperAddressLine1;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_branchAddressInformation_txtPinCode'])")
			public WebElement AdaniAMD_EBookigAddShipperZipeCode;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_branchAddressInformation_GenericAutoFillCountry_txtCode'])")
			public WebElement AdaniAMD_EBookigAddShipperCountry;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_branchAddressInformation_GenericAutoFillState_txtCode'])")
			public WebElement AdaniAMD_EBookigAddShipperState;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_branchAddressInformation_GenericAutoFillCity_txtCode'])")
			public WebElement AdaniAMD_EBookigAddShipperCity;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_branchAddressInformation_txtOtherCity'])")
			public WebElement AdaniAMD_EBookigAddShipperOtherCity;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnSave'])")
			public WebElement AdaniAMD_EBookigAddShipperSaveButton;
			
			@FindBy(xpath = "(//*[text()='Ok'])[3]")
			public WebElement AdaniAMD_EBookigAddShipperOkButton;
			
			@FindBy(xpath = "(//*[text()='Cancel'])[2]")
			public WebElement AdaniAMD_EBookigAddShipperCancelButton;
			
			//------------------------------
			

			
			@FindBy(xpath = "(//*[@title='Add Consignee Details.'])")
			public WebElement AdaniAMD_EBookigCreateConsigneeDetailPlusIcon;
			
			@FindBy(xpath = "(//*[text()='Add Consignee'])[3]")
			public WebElement AdaniAMD_EBookigCreateConsigneeVerify;
			
			//-----------------------------------
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtConsigneeName'])")
			public WebElement AdaniAMD_EBookigAddConsigneeCompanyName;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtShipperAcctDetCode'])")
			public WebElement AdaniAMD_EBookigAddConsigneeIECode;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtConsigneeContactPersonEmail'])")
			public WebElement AdaniAMD_EBookigAddConsigneeEmailID;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_uclConsAddressInfo_txtAddressLine1'])")
			public WebElement AdaniAMD_EBookigAddConsigneeAddressLine1;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_uclConsAddressInfo_txtPinCode'])")
			public WebElement AdaniAMD_EBookigAddConsigneeZipeCode;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_uclConsAddressInfo_GenericAutoFillCountry_txtCode'])")
			public WebElement AdaniAMD_EBookigAddConsigneeCountry;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_uclConsAddressInfo_GenericAutoFillState_txtCode'])")
			public WebElement AdaniAMD_EBookigAddConsigneeState;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_uclConsAddressInfo_GenericAutoFillCity_txtCode'])")
			public WebElement AdaniAMD_EBookigAddConsigneeCity;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_uclConsAddressInfo_txtOtherCity'])")
			public WebElement AdaniAMD_EBookigAddConsigneeOtherCity;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnCreateBooking'])")
			public WebElement AdaniAMD_EBookigAddConsigneeSaveButton;
			
			@FindBy(xpath = "(//*[text()='Ok'])[3]")
			public WebElement AdaniAMD_EBookigAddConsigneeOkButton;
			
			@FindBy(xpath = "(//*[text()='Cancel'])[3]")
			public WebElement AdaniAMD_EBookigAddConsigneeCancelButton;
			
			
	//----------------------------- Cargo Details Dimension --------------------
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_AirlineDestinationPort_txtCode'])")
			public WebElement AdaniAMD_EBookingDestination;
		
			@FindBy(xpath = "(//*[@id='addDimensions_1'])")
			public WebElement AdaniAMD_EBookigAddDimensionIcon1;
			
			@FindBy(xpath = "(//*[@id='txtCgGrWt_1'])")
			public WebElement AdaniAMD_EBookingGrossWt1;
			
			@FindBy(xpath = "(//*[@id='txtCgDesc_1'])")
			public WebElement AdaniAMD_EBookingCargoDescription1;
			
			@FindBy(xpath = "(//*[@id='addCargo_1'])")
			public WebElement AdaniAMD_EBookigAddDimensionActionPlusButton1;
			
			@FindBy(xpath = "(//*[@id='addDimensions_2'])")
			public WebElement AdaniAMD_EBookigAddDimensionIco2;
			
			@FindBy(xpath = "(//*[@id='txtCgGrWt_2'])")
			public WebElement AdaniAMD_EBookingGrossWt2;
			
			@FindBy(xpath = "(//*[@id='txtCgDesc_2'])")
			public WebElement AdaniAMD_EBookingCargoDescription2;
			
			@FindBy(xpath = "(//*[text()='Save'])")
			public WebElement AdaniAMD_EBookigAddDimensionSave;
			
			
			
		//---------------------------------------------------------------------	
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_chkCHA'])")
			public WebElement AdaniAMD_EBookingCustomBrokerCheckBox;
					
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_drpCHAOrganization'])")
			public WebElement AdaniAMD_EBookingCustomBrokerDropDown;
			
		
			
	//--------------------------------------------------
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnSaveAsTemplate'])")
			public WebElement AdaniAMD_EBookigSaveAsTemplete;
			
			@FindBy(xpath = "(//*[@value='Save' and @id='ctl00_hldPage_btnCreateBooking'])")
			public WebElement AdaniAMD_EBookigSave;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_btn6No'])")
			public WebElement AdaniAMD_EBookigSaveCopyPopUpNo;
			
			@FindBy(xpath = "(//*[@value='Create Another Job'])")
			public WebElement AdaniAMD_EBookigCreateAnotherJobButton;
			
			@FindBy(xpath = "(//*[@value='Save as a Template'])")
			public WebElement AdaniAMD_EBookigSaveAsTempleteButton;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_TxtTemplateName'])")
			public WebElement AdaniAMD_EBookigTempleteNameText;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnSaveTemplate'])")
			public WebElement AdaniAMD_EBookigTempleteNameOk;
			
			@FindBy(xpath = "(//*[text()='Template Name'])")
			public boolean  AdaniAMD_EBookigTempleteListningPage;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnCloseDialog'])")
			public WebElement AdaniAMD_EBookigPopupBookingStatusOk;
			
			@FindBy(xpath = "(//*[@value='Save as a Draft'])")
			public WebElement AdaniAMD_EBookigSaveAsDraftButton;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_TxtDraftName'])")
			public WebElement AdaniAMD_EBookigDraftNameText;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnSaveAsDraft'])")
			public WebElement AdaniAMD_EBookigDraftNameOk;
			
			@FindBy(xpath = "(//*[text()='Draft No.'])")
			public boolean  AdaniAMD_EBookigDraftListningPage;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_GrdBookingDraft_ctl02_lnkDeleteDraft'])")
			public WebElement  AdaniAMD_EBookigDraftDeleteIcon;
			
			@FindBy(xpath = "(//*[text()='Delete'])")
			public WebElement  AdaniAMD_EBookigDraftDeletePopup;
			
			@FindBy(xpath = "(//*[text()='Booking Draft deleted successfully.'])/parent::div/parent::div/div[3]/input")
			public WebElement  AdaniAMD_EBookigDraftDeletePopupOk;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_GrdBookingSent_ctl02_ImageButton1'])")
			public WebElement  AdaniAMD_EBookigTempleteDeleteIcon;
			
			@FindBy(xpath = "(//*[text()='Delete'])")
			public WebElement  AdaniAMD_EBookigTempleteDeletePopup;
			
			@FindBy(xpath = "(//*[text()='Booking Template deleted successfully.'])/parent::div/parent::div/div[3]/input")
			public WebElement  AdaniAMD_EBookigTempleteDeletePopupOk;
			
			
			
	//------------------- E-booking Save sub menu -------------------------
			
			
			@FindBy(xpath = "(//*[@fjid='False'])[1]")
			public WebElement  AdaniAMD_EBookigSaveSelectCheckBox;
			
			@FindBy(xpath = "(//*[@value='Forward to Airline'])")
			public WebElement  AdaniAMD_EBookigSaveForwardToAirlineButton;
			
			@FindBy(xpath = "(//*[text()='Shipment Type'])")
			public WebElement  AdaniAMD_EBookigSaveShipmentTypePopup;
			
			@FindBy(xpath = "(//*[@id='btnSphCanccel'])")
			public WebElement  AdaniAMD_EBookigSaveShipmentTypeSubmitButton;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_lvGroupedCargos_ctrl0_TxtAirlineScheduleTime'])/parent::td/img")
			public WebElement  AdaniAMD_EBookigSaveSeheduleforCalenderIcon;
			
			@FindBy(css = "#ui-datepicker-div > table > tbody > tr:nth-child(1) > td.ui-datepicker-days-cell-over.ui-datepicker-today > a")
			public WebElement  AdaniAMD_EBookigSaveScheduleCurrentDate;
			
			@FindBy(xpath = "(//*[@value='Get Schedule'])")
			public WebElement  AdaniAMD_EBookigSaveGetScheduleButton;
			
			//------------------------
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_lvAirlines_ctrl0_ChkSelected'])")
			public WebElement  AdaniAMD_EBookigSaveFlightDetailCheckBox;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_lvAirlines_ctrl0_txtAirlinePrefix'])")
			public WebElement  AdaniAMD_EBookigSaveFlightDetailAirwayBillFrefix;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_lvAirlines_ctrl0_txtMawbNo'])")
			public WebElement  AdaniAMD_EBookigSaveFlightDetailAirWayBillNo;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_lvAirlines_ctrl0_txtFlightNo'])")
			public WebElement  AdaniAMD_EBookigSaveFlightDetailFlightNo;
			
			@FindBy(xpath = "(//*[@value='Submit filght details'])[2]")
			public WebElement  AdaniAMD_EBookigSaveSubmitFlightDetailsButton;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnYes'])")
			public WebElement  AdaniAMD_EBookigSaveSubmitFlightDetailsPopupYes;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnViewMAWB'])")
			public WebElement  AdaniAMD_EBookigSaveSubmitFlightDetailsBookingStatuPopUpNo;
			
			@FindBy(xpath = "(//*[text()='Booking Request'])")
			public WebElement  AdaniAMD_AirlineLoginBookingRequestTab;
			
			@FindBy(xpath = "(//h5[text()='  Sent Bookings'])")
			public WebElement  AdaniAMD_AirlineLoginBookingRequestVerify;
			
			// ------------------------- E-Booking Draft sub menu ----------------
			
			@FindBy(xpath = "(//*[text()='Draft No.'])")
			public WebElement  AdaniAMD_EBookigDraftListningPage1;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_GrdBookingDraft_ctl02_LnkBookingID'])")
			public WebElement  AdaniAMD_EBookigDraftNo;
			
			@FindBy(xpath = "(//*[@value='Create Job'])")
			public WebElement  AdaniAMD_EBookigDraftCreateJobButton;
			
			@FindBy(xpath = "(//*[@value='Save Changes'])")
			public WebElement  AdaniAMD_EBookigDraftSaveChanges;
			
			// ------------------------- E-Booking Templete sub menu ----------------
			
				@FindBy(xpath = "(//*[text()='Template Name'])")
				public WebElement  AdaniAMD_EBookingTempleteListningPage1;
						
				@FindBy(xpath = "(//*[@id='ctl00_hldPage_GrdBookingSent_ctl02_LnkBookingId'])")
				public WebElement  AdaniAMD_EBookingTempleteName;
				
				@FindBy(xpath = "(//*[@id='ctl00_hldPage_GrdBookingSent_ctl02_imgbutton'])")
				public WebElement  AdaniAMD_EBookingTempleteNameEdit;
				
			
     // --------------------------- E-Docket sub menu ------------------
			
			@FindBy(xpath = "(//*[text()='e-Docket'])")
			public WebElement  AdaniAMD_EBookigEDocketListningPage;
			
			@FindBy(xpath = "(//*[@title='Select Job Type'])")
			public WebElement  AdaniAMD_EBookigEDocketJobTypeDropdown;
			
			@FindBy(xpath = "(//*[@title='Select Job Id'])")
			public WebElement  AdaniAMD_EBookigEDocketJobIDDropdown;
			
			@FindBy(xpath = "(//*[text()='Job Details: '])")
			public WebElement  AdaniAMD_EBookigEDocketJobDetails;	
			
			@FindBy(xpath = "(//*[text()='Associated Documents '])")
			public WebElement  AdaniAMD_EBookigEDocketAssociatedDocuments;
			
	// -------------- Sent Sub menu ---------------------
			
			@FindBy(xpath = "(//*[@id='drpLinks'])[1]")
			public WebElement  AdaniAMD_EBookingSentActionDropdown;
			
	// -------------- Sent Sub menu ---------------------
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_ddlChargeCode'])")
			public WebElement  AdaniAMD_EBookingCreateAWBChargeCode;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_Chkisaggreed'])")
			public WebElement  AdaniAMD_EBookingCreateAWBRateAsAgreedCheckBox;
			
			@FindBy(xpath = "(//*[text()='Select Customs Broker'])/parent::td/parent::tr/td[2]/div/div")
			public WebElement  AdaniAMD_EBookingCreateAWBCustomeBrokerDropdown;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_mltSlctCHA_0'])")
			public WebElement  AdaniAMD_EBookingCreateAWBCustomeBrokerAeroprime;
			
			@FindBy(xpath = "(//*[@id='selRateClass_1'])")
			public WebElement  AdaniAMD_EBookingCreateAWBRateClass1;
			
			@FindBy(xpath = "(//*[@id='txtCgChargWt_1'])")
			public WebElement  AdaniAMD_EBookingCreateAWBChargableWt1;
			
			@FindBy(xpath = "(//*[@id='txtCommNo_1'])")
			public WebElement  AdaniAMD_EBookingCreateAWBCommodityItem1;
			
			@FindBy(xpath = "(//*[@id='selRateClass_2'])")
			public WebElement  AdaniAMD_EBookingCreateAWBRateClass2;
			
			@FindBy(xpath = "(//*[@id='txtCgChargWt_2'])")
			public WebElement  AdaniAMD_EBookingCreateAWBChargableWt2;
			
			@FindBy(xpath = "(//*[@id='txtCommNo_2'])")
			public WebElement  AdaniAMD_EBookingCreateAWBCommodityItem2;
			
			@FindBy(xpath = "(//*[@value='Save'])[1]")
			public WebElement  AdaniAMD_EBookingCreateAWBSaveButton;
			
			@FindBy(xpath = "(//*[@value='Save As Template'])[1]")
			public WebElement  AdaniAMD_EBookingCreateAWBSaveasTemplateButton;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnClose4'])[1]")
			public WebElement  AdaniAMD_EBookingCreateAWBSaveasTemplatePopupMsgOk;
			
	// -------------------------------- GST Info ------------------------
			
			@FindBy(xpath = "(//*[text()='GST Info'])")
			public WebElement AdaniAMD_GSTInfoTab;
			
			@FindBy(xpath = "(//*[@title='ADD New GST Details'])")
			public WebElement AdaniAMD_GSTInfoAddNewButton;
			
			@FindBy(xpath = "(//*[@id='divGSTDetails'])")
			public boolean AdaniAMD_GSTInfoPageVerify;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_ddlBranchNames'])")
			public WebElement AdaniAMD_GSTInfoBranch;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_ddlConstofBusiness'])")
			public WebElement AdaniAMD_GSTInfoConstitutionOfBusiness;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtPAN'])")
			public WebElement AdaniAMD_GSTInfoPAN;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_ddlTypeofParty'])")
			public WebElement AdaniAMD_GSTInfoPageTypeOfParty;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtProvisionalGstin1'])")
			public WebElement AdaniAMD_GSTInfoPageGSTNO;
			
			@FindBy(xpath = "(//*[@title='Save GST Details'])")
			public WebElement AdaniAMD_GSTInfoPageSaveInfo;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnCloseDialog'])")
			public WebElement AdaniAMD_GSTInfoPageSaveInfoPopUP;
			
			@FindBy(xpath = "(//h5[text()='  GST Information'])")
			public WebElement AdaniAMD_GSTInfoPage;
			
			@FindBy(xpath = "(//*[@title='Edit GST Details'])[2]")
			public WebElement AdaniAMD_GSTInfoPageeEditcon;
			
			@FindBy(xpath = "(//*[@title='Delete GST Details'])[2]")
			public WebElement AdaniAMD_GSTInfoPageDeleteIcon;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnokk'])")
			public WebElement AdaniAMD_GSTInfoPageDeleteOkPopUp;
			
	// ------------------------ Reports --------------------------------
			
		@FindBy(xpath = "(//*[text()='Reports'])[1]")
		public WebElement AdaniAMD_ReportsTab;
						
		@FindBy(xpath = "(//*[text()='Transaction Report'])")
		public WebElement AdaniAMD_ReportsSubMenuTranscationReport;
		
		@FindBy(xpath = "(//*[text()='Dwell Time Report'])")
		public WebElement AdaniAMD_ReportsSubMenuDwellTimeReport;
		
		@FindBy(xpath = "(//*[text()='Tonnage Report'])")
		public WebElement AdaniAMD_ReportsSubMenuTonnageReport;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_ddlTerminal'])")
		public WebElement AdaniAMD_ReportsSubMenuTranscationReportCTODropDown;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_drppda'])")
		public WebElement AdaniAMD_ReportsSubMenuDwellTimeReportCTODropDown;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_ddlCTO'])")
		public WebElement AdaniAMD_ReportsSubMenuTonnageReportCTODropDown;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtFromDate'])")
		public WebElement AdaniAMD_ReportsSubMenuTranscationReportFromDate;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_drMode'])")
		public WebElement AdaniAMD_ReportsSubMenDwellTimeReportMode;
		
		@FindBy(xpath = "(//*[@value='Shipment'])")
		public WebElement AdaniAMD_ReportsSubMenuDwellTimeReportShipment;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtToDate'])")
		public WebElement AdaniAMD_ReportsSubMenuTranscationReportToDate;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_ddlModes'])")
		public WebElement AdaniAMD_ReportsSubMenuDwellTimeReportMode;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_ddlModes'])")
		public WebElement AdaniAMD_ReportsSubMenuTonnageReportMode;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_ddlShipmenttypes'])")
		public WebElement AdaniAMD_ReportsSubMenuTonnageReportShipmentType;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_ddlCommodityTypes'])")
		public WebElement AdaniAMD_ReportsSubMenuTonnageReportCommodityType;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_ddlAirline'])")
		public WebElement AdaniAMD_ReportsSubMenuTonnageReportAirline;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtAirport'])")
		public WebElement AdaniAMD_ReportsSubMenuTonnageReportAirport;
		
		@FindBy(xpath = "(//*[@value='Export to Excel'])")
		public WebElement AdaniAMD_ReportsSubMenuTranscationReportExcelToExportButton;
		
		//--------------------- e-AWB -- Create AWB --------------------
		
		@FindBy(xpath = "(//*[text()='Create AWB'])")
		public WebElement AdaniAMD_eAWBCeateAWBTab;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_ddlCustodianName'])")
		public WebElement AdaniAMD_eAWBCeateAWBCTODropdown;
						
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_rdoConsol'])")
		public WebElement AdaniAMD_eAWBCeateAWBConsolShipment;	
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtAWBPrefix'])")
		public WebElement AdaniAMD_eAWBCeateAWBPrefix;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtAWBNo'])")
		public WebElement AdaniAMD_eAWBCeateAWBNumber;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtShipperaccno'])")
		public WebElement AdaniAMD_eAWBCeateAWBShipperAccNumber;
		
		// --------- House Job Details ----------------
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_rptHouse_ctl01_txtHAWBNo'])")
		public WebElement AdaniAMD_eAWBCreateAWBHouseNo;
		
		@FindBy(xpath = "(//*[@id='AddShipperbtn_1'])")
		public WebElement AdaniAMD_eAWBCreateAWBHouseAddShipperIcon;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtCompanyName'])[1]")
		public WebElement AdaniAMD_eAWBCreateAWBHouseAddShipperCompantName;
		
		@FindBy(xpath = "/html/body/form/div[11]/div[3]/div/button[1]")
		public WebElement AdaniAMD_eAWBCreateAWBHouseAddShipperSaveOk;
		
		@FindBy(xpath = "/html/body/form/div[13]/div[3]/div/button[1]")
		public WebElement AdaniAMD_eAWBCreateAWBHouseAddShipperSaveOk11;
		
		@FindBy(xpath = "/html/body/form/div[12]/div[3]/div/button[1]")
		public WebElement AdaniAMD_eAWBCreateAWBHouseAddShipperSaveOk1;
		
		@FindBy(xpath = "(//*[@id='AddConsigneebtn_1'])")
		public WebElement AdaniAMD_eAWBCreateAWBHouseAddConsigneeIcon;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_rptHouse_ctl01_txtOriginPortCode'])")
		public WebElement AdaniAMD_eAWBCreateAWBHouseOrigin;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_rptHouse_ctl01_txtDestinationPortCode'])")
		public WebElement AdaniAMD_eAWBCreateAWBHouseDestination;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_rptHouse_ctl01_txtPkgs'])")
		public WebElement AdaniAMD_eAWBCreateAWBHouseNoP;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_rptHouse_ctl01_txtWt'])")
		public WebElement AdaniAMD_eAWBCreateAWBHouseGrossWt;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_rptHouse_ctl01_ddlChargeCode'])")
		public WebElement AdaniAMD_eAWBCreateAWBHouseChargeCode;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdHAWBCHA_ctl02_chkRecord'])")
		public WebElement AdaniAMD_eAWBCreateAWBHouseBulkHouseCheckBox;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_btnSave'])")
		public WebElement AdaniAMD_eAWBCreateAWBHouseSaveButton;
		
		@FindBy(xpath = "(//*[text()='House Manifest'])[2]/parent::div/parent::div/div[3]/div/button")
		public WebElement AdaniAMD_eAWBCreateAWBHouseCloseButton;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_rptHouse_ctl01_txtCargoDesc'])")
		public WebElement AdaniAMD_eAWBCreateAWBHouseCargoDesc;
			
	 //------------- Shipper Details -----------

		@FindBy(xpath = "(//*[@id='Img2'])[1]")
		public WebElement AdaniAMD_eAWBCeateAddShipperIcon;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_uclOrgAddressInformation_txtAddressLine1'])[1]")
		public WebElement AdaniAMD_eAWBCeateAddShipperAddress1;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_uclOrgAddressInformation_txtPinCode'])[1]")
		public WebElement AdaniAMD_eAWBCeateAddShipperPinCode;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_uclOrgAddressInformation_GenericAutoFillCountry_txtCode'])[1]")
		public WebElement AdaniAMD_eAWBCeateAddShipperCountry;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_uclOrgAddressInformation_GenericAutoFillState_txtCode'])[1]")
		public WebElement AdaniAMD_eAWBCeateAddShipperState;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_uclOrgAddressInformation_GenericAutoFillCity_txtCode'])[1]")
		public WebElement AdaniAMD_eAWBCeateAddShipperCity;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_uclOrgAddressInformation_txtOtherCity'])[1]")
		public WebElement AdaniAMD_eAWBCeateAddShipperOtherCity;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnSaveShipConsignee'])[1]")
		public WebElement AdaniAMD_eAWBCeateAddShipperConsigneeSave;
		
		@FindBy(xpath = "(//*[text()='Ok'])[5]")
		public WebElement AdaniAMD_eAWBCeateAddShipperConsigneeSaveOk;
		
	// ------- Consigee Details --------------
		@FindBy(xpath = "(//*[@id='img3'])[1]")
		public WebElement AdaniAMD_eAWBCeateAddConsigeeIcon;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtConName'])[1]")
		public WebElement AdaniAMD_eAWBCeateAddConsigeeName;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_uclConsAddressInfo_txtAddressLine1'])[1]")
		public WebElement AdaniAMD_eAWBCeateAddConsigeeAddress1;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_uclConsAddressInfo_txtPinCode'])[1]")
		public WebElement AdaniAMD_eAWBCeateAddConsigeePinCode;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_uclConsAddressInfo_GenericAutoFillCountry_txtCode'])[1]")
		public WebElement AdaniAMD_eAWBCeateAddConsigeeCountry;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_uclConsAddressInfo_GenericAutoFillState_txtCode'])[1]")
		public WebElement AdaniAMD_eAWBCeateAddConsigeeState;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_uclConsAddressInfo_GenericAutoFillCity_txtCode'])[1]")
		public WebElement AdaniAMD_eAWBCeateAddConsigeeCity;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_uclConsAddressInfo_txtOtherCity'])[1]")
		public WebElement AdaniAMD_eAWBCeateAddConsigeeOtherCity;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnSaveShipConsignee'])")
		public WebElement AdaniAMD_eAWBCeateAddConsigneeSave;
		
		@FindBy(xpath = "//*[text()[normalize-space()='Ok']]")
		public WebElement AdaniAMD_eAWBCeateAddConsigneeSaveOk;
		
		
		@FindBy(xpath = "/html/body/form/div[8]/div[3]/div/button[1]")
		public WebElement AdaniAMD_eAWBCeateAddConsigneeSaveOk1;
		
		//----------------------
		@FindBy(xpath = "(//*[@title='Routing Information'])")
		public WebElement AdaniAMD_eAWBCreateRoutingInfoIcon;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_GenericAutoFillDestAirport_txtCode'])")
		public WebElement AdaniAMD_eAWBCreateRIDestiPort;
		
		@FindBy(xpath = "(//*[text()='Routing Details'])/parent::div/parent::div/div[3]/div/button[1]")
		public WebElement AdaniAMD_eAWBCreateRIOk;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtbyfirstcarrier'])")
		public WebElement AdaniAMD_eAWB__FirstCarrier;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtflightno1'])")
		public WebElement AdaniAMD_eAWBCreateFlightNo;
		
		@FindBy(xpath = "(//*[text()='Dimensions'])/parent::div/parent::div/div[11]/div/button[1]")
		public WebElement AdaniAMD_eAWBCreateDimensionPopupOk;
		
		@FindBy(xpath = "(//*[text()='Dimensions'])/parent::div/parent::div/div[3]/div/button[1]")
		public WebElement AdaniAMD_eAWBCreateDimensionPopupOk1;
		
		@FindBy(xpath = "(//*[text()='Templates'])[2]")
		public WebElement AdaniAMD_eAWBCreateTemplates;
		
	// -----------------HAWB List -------------------	
		
		
		@FindBy(xpath = "(//*[text()='HAWB List'])[1]")
		public WebElement AdaniAMD_eAWBHAWBList;
		
		@FindBy(xpath = "(//*[text()='HAWB No.'])/parent::th/parent::tr/parent::tbody/parent::table/parent::div/parent::div/parent::fieldset/parent::div/parent::div/div/div/h5")
		public WebElement AdaniAMD_eAWBHAWBListPageVerify;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdHAWB_ctl02_lnkMawbview'])")
		public WebElement AdaniAMD_eAWBHAWBListViewIcon;
		
		@FindBy(xpath = "(//*[text()='Close'])[5]")
		public WebElement AdaniAMD_eAWBHAWBListViewPopUpClose;
		
	//------------- House Manifest and Attach MAWB to HAWB----------------------------
		@FindBy(xpath = "(//*[text()='House Manifest'])[1]")
		public WebElement AdaniAMD_eAWBHouseManifest;
		
		@FindBy(xpath = "(//*[text()='Attach MAWB to HAWB'])[1]")
		public WebElement AdaniAMD_eAWBAttactMAWBtoHAWB;
		
		@FindBy(xpath = "(//*[text()='Status'])/parent::div/parent::div/div[3]/input")
		public WebElement AdaniAMD_eAWBHouseManifestSavePoppupOk;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_txtAWBPrefix'])")
		public WebElement AdaniAMD_eAWBHouseAttachMAWBPrefix;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_txtAWBNo'])")
		public WebElement AdaniAMD_eAWBHouseAttachMAWBNo;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_btnSearch'])")
		public WebElement AdaniAMD_eAWBHouseAttachMAWBNNoSearch;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_grdHAWB_ctl02_chkSelectHAWB'])")
		public WebElement AdaniAMD_eAWBHouseAttachHAWBCheckBox;
		
		@FindBy(xpath = "(//h5[text()='Message'])[1]/parent::div/parent::div/div[3]/input")
		public WebElement AdaniAMD_eAWBHouseAttachHAWBAttachPopupOk;
		
		
	//  ---------------- EDI Dashboard --------------------
		
		@FindBy(xpath = "(//*[text()='EDI Dashboard'])")
		public WebElement AdaniAMD_eAWBEDIDashboard;
		
		@FindBy(xpath = "(//*[text()='MAWB NO.'])/parent::div/parent::fieldset/parent::td/parent::tr/parent::tbody/parent::table/parent::fieldset/legend")
		public WebElement AdaniAMD_eAWBEDIDashboardPageVerify;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtAirlinePrefix'])")
		public WebElement AdaniAMD_eAWBEDIDashboardAWBPrefix;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtAWBnumber'])")
		public WebElement AdaniAMD_eAWBEDIDashboardAWBNo;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnClear'])")
		public WebElement AdaniAMD_eAWBEDIDashboardClearButton;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnSearch'])")
		public WebElement AdaniAMD_eAWBEDIDashboardSearchButton;
		
	//  ---------------- HAWB Detail Upload Page --------------------
		
			@FindBy(xpath = "(//*[text()='HAWB Details Upload'])[1]")
			public WebElement AdaniAMD_eAWBHAWBDetailUpload;
			
			@FindBy(xpath = "(//h5[text()='HAWB Details Upload'])")
			public WebElement AdaniAMD_eAWBHAWBDetailUploadPageVerify;
			
			@FindBy(xpath = "(//*[text()='Download (Sample Excel Template)'])")
			public WebElement AdaniAMD_eAWBHAWBDetailUploadSampleDownloadFile;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_fuctlLoadFilePath'])")
			public WebElement AdaniAMD_eAWBHAWBDetailUploadChooseFileButton;
			
			@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_btnFileCopyData'])")
			public WebElement AdaniAMD_eAWBHAWBDetailUploadFileUploadButton;
			
			@FindBy(xpath = "(//*[text()='MAWB List'])")
			public WebElement AdaniAMD_eAWBHAWBMAWBList;
			
			@FindBy(xpath = "(//*[@title='Edit Master Air Waybill'])")
			public WebElement AdaniAMD_eAWBHAWBMAWBListEditIcon;

			
		//  ---------------- AWB Stock --------------------
			
				@FindBy(xpath = "(//*[text()='AWB Stock'])[1]")
				public WebElement AdaniAMD_AWBStockTab;
				
				@FindBy(xpath = "(//*[text()='Request for AWB Stock'])[1]")
				public WebElement AdaniAMD_AWBStockRequestForAWBStock;
				
				@FindBy(xpath = "(//*[text()='Request Status '])[1]")
				public WebElement AdaniAMD_AWBStockRequestStatus;
				
				@FindBy(xpath = "(//*[text()='Request Status'])[1]")
				public WebElement AdaniAMD_AWBStockRequestStatus1;
				
				@FindBy(xpath = "(//*[text()='AWB Status'])")
				public WebElement AdaniAMD_AWBStockAWBStatus;
				
				@FindBy(xpath = "(//*[text()='AWB Stock Inventory'])")
				public WebElement AdaniAMD_AWBStockAWBStockInventory;
				
				@FindBy(xpath = "(//*[text()='SubAgent Issued Inventory'])")
				public WebElement AdaniAMD_AWBStockAubAgentIssueInventory;
				
				@FindBy(xpath = "(//*[text()='Sub Agent Received Inventory'])")
				public WebElement AdaniAMD_AWBStockAubAgentReceivedInventory;
				
				@FindBy(xpath = "(//*[text()='Sub Agent AWB Status'])")
				public WebElement AdaniAMD_AWBStockSubAgentAWBStatus;
				
				@FindBy(xpath = "(//*[@id='ctl00_hldPage_ddlAirline'])")
				public WebElement AdaniAMD_AWBStockRequestForAWBStockSelectAirlineDropdown;
				
				@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtQuantity'])")
				public WebElement AdaniAMD_AWBStockRequestForAWBStockQuantity;
				
				@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtRemarks'])")
				public WebElement AdaniAMD_AWBStockRequestForAWBStockRemark;
				
				@FindBy(xpath = "(//*[@id='ctl00_hldPage_drpdocumenttype'])")
				public WebElement AdaniAMD_AWBStockRequestForAWBStockUploadDocDropdown;
				
				@FindBy(xpath = "(//*[@id='ctl00_hldPage_fileUpload'])")
				public WebElement AdaniAMD_AWBStockRequestForAWBStockChooseFileButton;
				
				@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnUpload'])")
				public WebElement AdaniAMD_AWBStockRequestForAWBStockUploadButton;
				
				@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnSend'])")
				public WebElement AdaniAMD_AWBStockRequestForAWBStockSendButton;
				
				@FindBy(xpath = "(//*[text()='Request for AWB Stock sent successfully to Kale Airline 1'])/parent::div/parent::div/div[3]/input")
				public WebElement AdaniAMD_AWBStockRequestForAWBStockSendButtonPopupOk;
				
				@FindBy(xpath = "(//*[@id='ctl00_hldPage_gvStockRequestSent_ctl02_btnApprove'])")
				public WebElement AdaniAMD_AWBStockRequestForAWBStockAirlineApproveButton;
				
				@FindBy(xpath = "(//*[text()='Manual '])")
				public WebElement AdaniAMD_AWBStockRequestForAWBStockAirlineManualReq;
				
				@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnApprSubmit'])")
				public WebElement AdaniAMD_AWBStockRequestForAWBStocAirlineManualSubmitButton;
				
				@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtManualIssQty'])")
				public WebElement AdaniAMD_AWBStockRequestForAWBStocAirlineIssuedQty;
				
				@FindBy(xpath = "(//*[@id='txtManAWBFrom'])")
				public WebElement AdaniAMD_AWBStockRequestForAWBStocAirlineFromAWBNo;
				
				@FindBy(xpath = "(//*[@id='txtManAWBTo'])")
				public WebElement AdaniAMD_AWBStockRequestForAWBStocAirlineToAWBNo;
				
				@FindBy(xpath = "(//*[@id='txtTotalQty'])")
				public WebElement AdaniAMD_AWBStockRequestForAWBStocAirlineToQty;
				
				@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnManualIssuance'])")
				public WebElement AdaniAMD_AWBStockRequestForAWBStocAirlineIssueButton;
				
				@FindBy(xpath = "(//*[text()='Message'])[2]/parent::div/parent::div/div[3]/input")
				public WebElement AdaniAMD_AWBStockRequestForAWBStocAirlineIssueButtonPopupOk;
				
				@FindBy(xpath = "(//*[@title='Uploaded Document'])[1]")
				public WebElement AdaniAMD_AWBStockRequestForAWBStocReqStstusUploadDocIcon;
				
				@FindBy(xpath = "(//*[@id='tblDocDetails'])/tbody/tr/td[2]")
				public WebElement AdaniAMD_AWBStockRequestForAWBStocReqPDFDownloadIcon;
				
				@FindBy(xpath = "(//*[text()='View Document'])/parent::div/button/span")
				public WebElement AdaniAMD_AWBStockRequestForAWBStocReqViewDocClosePopup;
				
				@FindBy(xpath = "(//*[@id='ctl00_hldPage_gvStockRequestSent_ctl02_lnkViewAWBList'])[1]")
				public WebElement AdaniAMD_AWBStockRequestForAWBStocReqStatusAWBListIcon;
				
				@FindBy(xpath = "(//*[text()='View AWB List'])/parent::div/button/span")
				public WebElement AdaniAMD_AWBStockRequestForAWBStocReqStatusAWBListPopupClose;
				
				@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtAWBPrefixFrm'])")
				public WebElement AdaniAMD_AWBStockAWBStatusPrefix;
				
				@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtAWBNo'])")
				public WebElement AdaniAMD_AWBStockAWBStatusAWBNuber;
				
				@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnSearchAWBNo'])")
				public WebElement AdaniAMD_AWBStockAWBStatusSearchButton;
				
				@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnClear'])")
				public WebElement AdaniAMD_AWBStockAWBStatusClearButton;
				
				@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnAvail'])")
				public WebElement AdaniAMD_AWBStockAWBStatusAvailableStatusButton;
				
				@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnUsed'])")
				public WebElement AdaniAMD_AWBStockAWBStatusUsedStatusButton;
				
				@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnWithdraw'])")
				public WebElement AdaniAMD_AWBStockAWBStatusWithdrawnStatusButton;
				
				@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnExportExcel'])")
				public WebElement AdaniAMD_AWBStockAWBStatusExportToExcelButton;
				
				@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtFrom'])")
				public WebElement AdaniAMD_AWBStockAWBSubAgentIssueInventoryFromDate;
				
				@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtTo'])")
				public WebElement AdaniAMD_AWBStockAWBSubAgentIssueInventoryToDate;
				
				@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnSearchDate'])")
				public WebElement AdaniAMD_AWBStockAWBSubAgentIssueInventorySearchButton;
				
				@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnClearDate'])")
				public WebElement AdaniAMD_AWBStockAWBSubAgentIssueInventoryClearButton;
				
				@FindBy(xpath = "(//*[text()='Assign'])")
				public WebElement AdaniAMD_AWBStockAWBStockInventoryAssignLink;
				
				@FindBy(xpath = "(//*[@id='ctl00_hldPage_ddlSubagents'])")
				public WebElement AdaniAMD_AWBStockAWBStockInventorySubAgentDropdown;
				
				@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtIssQty'])")
				public WebElement AdaniAMD_AWBStockAWBStockInventoryQty;
				
				@FindBy(xpath = "(//*[@id='ctl00_hldPage_gvIssuedAWB_ctl02_chkSelect'])")
				public WebElement AdaniAMD_AWBStockAWBStockInventoryAWBCheckBox;
				
				@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnIssueFromStock'])")
				public WebElement AdaniAMD_AWBStockAWBStockInventoryIssueButton;
				
				@FindBy(xpath = "(//*[text()='Message'])[2]/parent::div/parent::div/div[3]/input")
				public WebElement AdaniAMD_AWBStockAWBStockInventoryIssueButtonOkPopup;
				
				
	//---------------------------------Common Functions---------------------------
			
    public void CurrentDate() throws InterruptedException
    {
    	try
    	{
    		Export.AdaniAMD_AddSBCurrentDate1.click();Thread.sleep(1000);
    	}
    	catch (Exception E)
    	{
    		System.out.println("This is not first week");
    	}
    	
    	try
    	{
    		Export.AdaniAMD_AddSBCurrentDate2.click();Thread.sleep(1000);
    	}
    	catch (Exception E)
    	{
    		System.out.println("This is not Second week");
    	}
    	
    	try
    	{
    		Export.AdaniAMD_AddSBCurrentDate3.click();Thread.sleep(1000);
    	}
    	catch (Exception E)
    	{
    		System.out.println("This is not Third week");
    	}
    	
    	try
    	{
    		Export.AdaniAMD_AddSBCurrentDate4.click();Thread.sleep(1000);
    	}
    	catch (Exception E)
    	{
    		System.out.println("This is not Forth week");
    	}
    	
    	try
    	{
    		Export.AdaniAMD_AddSBCurrentDate5.click();Thread.sleep(1000);
    	}
    	catch (Exception E)
    	{
    		System.out.println("This is not Fifth week");
    	}
    }
			
	
	public void QuickASI() throws InterruptedException
	{
		
		   AdaniAMD_QuickASI_Destination.sendKeys("DXB");Thread.sleep(1500);
		   AdaniAMD_QuickASI_Destination.sendKeys("DXB");Thread.sleep(1500);
		   AdaniAMD_QuickASI_NOP.sendKeys("30");Thread.sleep(500);
		   AdaniAMD_QuickASI_GrossWt.sendKeys("300");Thread.sleep(500);
		   AdaniAMD_QuickASI_ChargbleWt.sendKeys("300");Thread.sleep(500);
		   //AdaniAMD_QuickASI_NatureOfGood.sendKeys("good");Thread.sleep(500);
	}
	
	public void CommonSB1() throws InterruptedException
	{
		Export.AdaniAMD_AddSBNumber1.sendKeys(cm.RandomNo(7));Thread.sleep(1000);
		Export.AdaniAMD_AddSBDate1.click();Thread.sleep(1000);
		Export.CurrentDate();Thread.sleep(1000);
		
		Select SelectSBTypeManual1 = new Select(Export.AdaniAMD_AddSBType1);Thread.sleep(500);
		SelectSBTypeManual1.selectByVisibleText("Manual");Thread.sleep(500);
	}
	
	public void CommonSB2() throws InterruptedException
	{
		Export.AdaniAMD_AddSBNumber2.sendKeys(cm.RandomNo(7));Thread.sleep(1000);
		Export.AdaniAMD_AddSBDate2.click();Thread.sleep(1000);
		Export.CurrentDate();Thread.sleep(1000);
		
		Select SelectSBTypeManual2 = new Select(Export.AdaniAMD_AddSBType2);Thread.sleep(500);
		SelectSBTypeManual2.selectByVisibleText("Manual");Thread.sleep(500);
	}
	
	public void CommonSB3() throws InterruptedException
	{
		Export.AdaniAMD_AddSBNumber3.sendKeys(cm.RandomNo(7));Thread.sleep(1000);
		Export.AdaniAMD_AddSBDate3.click();Thread.sleep(1000);
		Export.CurrentDate();Thread.sleep(1000);
		
		Select SelectSBTypeManual3 = new Select(Export.AdaniAMD_AddSBType3);Thread.sleep(500);
		SelectSBTypeManual3.selectByVisibleText("Manual");Thread.sleep(500);
	}
	
	public void AddSB() throws InterruptedException
	{
		
		   AdaniAMD_AddSBFOBValue1.sendKeys(cm.RandomNo(5));Thread.sleep(500);
		   AdaniAMD_AddSBExporterName1.sendKeys("Test");Thread.sleep(500);
		  
	}
	
	public void AddSB2() throws InterruptedException
	{
		
		   AdaniAMD_AddSBFOBValue2.sendKeys(cm.RandomNo(5));Thread.sleep(500);
		   AdaniAMD_AddSBExporterName2.sendKeys("Sidhivinayak Enterprise");Thread.sleep(500);
		  
	}
	
	public void AddSB3() throws InterruptedException
	{
		
		   AdaniAMD_AddSBFOBValue3.sendKeys(cm.RandomNo(5));Thread.sleep(500);
		   AdaniAMD_AddSBExporterName3.sendKeys("Sidhivinayak Enterprise");Thread.sleep(500);
		  
	}

	
	public void TSPPayment() throws InterruptedException
	{
		Thread.sleep(5000);
		 Select TSPCargoType = new Select(Export.AdaniAMD_TSPCargoTypeDropdown);Thread.sleep(6000);
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
		 AdaniAMD_TSPHSNCode.sendKeys(cm.RandomNo(5));Thread.sleep(4000);
		 AdaniAMD_TSPTransactionPassword.sendKeys("Kale@JUN2425");Thread.sleep(1000);
		
	}
	
	public void TSPPaymentwithVechicleTokenKaleGHA2() throws InterruptedException
	{
		try 
		{ 
			
			Select TSPCargoType = new Select(Export.AdaniAMD_TSPCargoTypeDropdown1);
		    TSPCargoType.selectByVisibleText("General Cargo");Thread.sleep(1500);
		    
		    Select TSPComodityName = new Select(Export.AdaniAMD_TSPComodityName1);
		    try
			{
				 TSPComodityName.selectByVisibleText("ANTENNAS : GEN");Thread.sleep(1500);
				
			}
			catch(Exception E1)
			{
				 TSPComodityName.selectByVisibleText("FOOD ITEAM : GEN");Thread.sleep(1500);
			}
		    
		    Select TSPCargoType1 = new Select(Export.AdaniAMD_TSPCargoTypeDropdown2);Thread.sleep(1500);
		    TSPCargoType1.selectByVisibleText("General Cargo");Thread.sleep(1500);
		 
		    Select TSPComodityName1 = new Select(Export.AdaniAMD_TSPComodityName2);Thread.sleep(1500);
		    try
			{
				 TSPComodityName.selectByVisibleText("ANTENNAS : GEN");Thread.sleep(1500);
				
			}
			catch(Exception E1)
			{
				 TSPComodityName.selectByVisibleText("FOOD ITEAM : GEN");Thread.sleep(1500);
			}
			
		}
		catch (Exception E)
		{
			Select TSPCargoType = new Select(Export.AdaniAMD_TSPCargoTypeDropdown1);
		    TSPCargoType.selectByVisibleText("General Cargo");Thread.sleep(1500);
		    Select TSPComodityName = new Select(Export.AdaniAMD_TSPComodityName1);
			try
			{
				 TSPComodityName.selectByVisibleText("ANTENNAS : GEN");Thread.sleep(1500);
				
			}
			catch(Exception E1)
			{
				 TSPComodityName.selectByVisibleText("FOOD ITEAM : GEN");Thread.sleep(1500);
			}
			
		   
		}
		
		Thread.sleep(8000);
		 AdaniAMD_SBDetailsCheckBox.click();Thread.sleep(4000);
	
		 AdaniAMD_TSPTransactionPassword1.sendKeys("Kale@JUN2425");Thread.sleep(4000);
		
	}
	
	public void TSPPaymentBulkHAWB() throws InterruptedException
	{
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
			
		 
		  Select TSPCargoType2 = new Select(Export.AdaniAMD_TSPCargoTypeDropdown2);Thread.sleep(1500);
		  TSPCargoType2.selectByVisibleText("General Cargo");Thread.sleep(1500);
		 
		  Select TSPComodityName2 = new Select(Export.AdaniAMD_TSPComodityName2);Thread.sleep(1500);
		  try
			{
				 TSPComodityName2.selectByVisibleText("ANTENNAS : GEN");Thread.sleep(1500);
				
			}
			catch(Exception E1)
			{
				Thread.sleep(1500);
				 TSPComodityName2.selectByVisibleText("FOOD ITEAM : GEN");Thread.sleep(1500);
			}
			
          
          Select TSPCargoType3 = new Select(Export.AdaniAMD_TSPCargoTypeDropdown3);Thread.sleep(1500);
		  TSPCargoType3.selectByVisibleText("General Cargo");Thread.sleep(1500);
		 
		  Thread.sleep(1500);
		  Select TSPComodityName3 = new Select(Export.AdaniAMD_TSPComodityName3);
		  try
			{
				 TSPComodityName3.selectByVisibleText("ANTENNAS : GEN");Thread.sleep(1500);
				
			}
			catch(Exception E1)
			{
				 TSPComodityName3.selectByVisibleText("FOOD ITEAM : GEN");Thread.sleep(1500);
			}
			
		  Thread.sleep(1500);
          AdaniAMD_SBDetailsCheckBox.click();Thread.sleep(3000);
      	
 		 AdaniAMD_TSPTransactionPassword1.sendKeys("Kale@JUN2425");Thread.sleep(4000);
	}
	
	public void GenerateToken() throws InterruptedException
	{
		Thread.sleep(4000);
		// Add vechicle details
		AdaniAMD_GenerateTokenVechicleNo.sendKeys("MH"+cm.RandomNo(4));Thread.sleep(500);
		AdaniAMD_GenerateDriverLicNo.sendKeys("DLN"+cm.RandomNo(4));Thread.sleep(500);
		AdaniAMD_GenerateTokenDriverName.sendKeys("Jhon");Thread.sleep(500);
		AdaniAMD_GenerateTokenDriverMobNo.sendKeys(cm.RandomNo(10));Thread.sleep(500);
		
		wm.JavascriptExecutorClick(driver, AdaniAMD_GenerateTokenButton);Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, AdaniAMD_GenerateTokenButtonOk);Thread.sleep(4000);
		
	}
	
	public void GenerateTokenEdit1() throws InterruptedException
	{
		
		// Add vechicle details
		AdaniAMD_GenerateTokenVechicleNo.sendKeys("MH"+cm.RandomNo(4));Thread.sleep(500);
		AdaniAMD_GenerateDriverLicNo.sendKeys("DLN"+cm.RandomNo(4));Thread.sleep(500);
		AdaniAMD_GenerateTokenDriverName.sendKeys("Jhon");Thread.sleep(500);
		AdaniAMD_GenerateTokenDriverMobNo.sendKeys(cm.RandomNo(10));Thread.sleep(500);
		AdaniAMD_GenerateTokenNoP.clear();
		AdaniAMD_GenerateTokenNoP.sendKeys("15");Thread.sleep(500);
		AdaniAMD_GenerateTokenGrossWt.clear();
		AdaniAMD_GenerateTokenGrossWt.sendKeys("150");Thread.sleep(500);
		
		
	}
	
	public void GenerateTokenEdit2() throws InterruptedException
	{
		
		// Add vechicle details
		AdaniAMD_GenerateTokenVechicleNo1.sendKeys("MH"+cm.RandomNo(4));Thread.sleep(500);
		AdaniAMD_GenerateDriverLicNo1.sendKeys("DLN"+cm.RandomNo(4));Thread.sleep(500);
		AdaniAMD_GenerateTokenDriverName1.sendKeys("Jhon");Thread.sleep(500);
		AdaniAMD_GenerateTokenDriverMobNo1.sendKeys(cm.RandomNo(10));Thread.sleep(500);
		AdaniAMD_GenerateTokenNoP1.clear();
		AdaniAMD_GenerateTokenNoP1.sendKeys("15");Thread.sleep(500);
		AdaniAMD_GenerateTokenGrossWt1.clear();
		AdaniAMD_GenerateTokenGrossWt1.sendKeys("150");Thread.sleep(500);
		
	}
		
	
	public void CustomsBroker() throws InterruptedException
	{
		System.out.println("login changed");
		try
		{
			wm.JavascriptExecutorClick(driver, AdaniAMD_BLCB);
		}
		catch (Exception E)
		{
			
			wm.JavascriptExecutorClick(driver, AdaniAMD_BLBT);
		}
		
		wm.JavascriptExecutorClick(driver, AdaniAMD_BLCB);
		
		
	}
	
	
	public void AddHAWB1() throws InterruptedException
	{
		 AdaniAMD_QuickASI_HAWBNumber1.sendKeys("H1");Thread.sleep(500);
		 AdaniAMD_QuickASI_HAWBOrign1.sendKeys("AMD");Thread.sleep(500);
		 AdaniAMD_QuickASI_HAWBDestination1.sendKeys("DXB");Thread.sleep(500);
		 AdaniAMD_QuickASI_HAWBNOP1.sendKeys("10");Thread.sleep(500);
		 AdaniAMD_QuickASI_HAWBGrossWt1.sendKeys("100");Thread.sleep(500);	
	}
	
	public void AddHAWB2() throws InterruptedException
	{
		Thread.sleep(1500);	
		 AdaniAMD_QuickASI_HAWBNumber2.sendKeys("H2");Thread.sleep(500);
		 AdaniAMD_QuickASI_HAWBOrign2.sendKeys("AMD");Thread.sleep(500);
		 AdaniAMD_QuickASI_HAWBDestination2.sendKeys("DXB");Thread.sleep(500);
		 AdaniAMD_QuickASI_HAWBNOP2.sendKeys("10");Thread.sleep(500);
		 AdaniAMD_QuickASI_HAWBGrossWt2.sendKeys("100");Thread.sleep(500);	
	}
	
	public void AddHAWB3() throws InterruptedException
	{
		Thread.sleep(1500);	
		 AdaniAMD_QuickASI_HAWBNumber3.sendKeys("H3");Thread.sleep(500);
		 AdaniAMD_QuickASI_HAWBOrign3.sendKeys("AMD");Thread.sleep(500);
		 AdaniAMD_QuickASI_HAWBDestination3.sendKeys("DXB");Thread.sleep(500);
		 AdaniAMD_QuickASI_HAWBNOP3.sendKeys("10");Thread.sleep(500);
		 AdaniAMD_QuickASI_HAWBGrossWt3.sendKeys("100");Thread.sleep(1500);	
	}
	
	public void AddHAWB1WithoutOriDesti() throws InterruptedException
	{
		 AdaniAMD_QuickASI_HAWBNumber1.sendKeys("H1");Thread.sleep(1000);
		 AdaniAMD_QuickASI_HAWBNOP1.sendKeys("10");Thread.sleep(1000);
		 AdaniAMD_QuickASI_HAWBGrossWt1.sendKeys("100");Thread.sleep(2000);	
	}
	
	public void AddHAWB2WithoutOriDesti() throws InterruptedException
	{
		 AdaniAMD_QuickASI_HAWBNumber2.sendKeys("H2");Thread.sleep(1000);
		 AdaniAMD_QuickASI_HAWBNOP2.sendKeys("10");Thread.sleep(1000);
		 AdaniAMD_QuickASI_HAWBGrossWt2.sendKeys("100");Thread.sleep(2000);	
	}
	
	public void AddHAWB3WithoutOriDesti() throws InterruptedException
	{
		 AdaniAMD_QuickASI_HAWBNumber3.sendKeys("H3");Thread.sleep(1000);
		 AdaniAMD_QuickASI_HAWBNOP3.sendKeys("10");Thread.sleep(1000);
		 AdaniAMD_QuickASI_HAWBGrossWt3.sendKeys("100");Thread.sleep(2000);	
	}
	
	public void AddHAWBSingle() throws InterruptedException
	{
		 AdaniAMD_QuickASI_HAWBNumber1.sendKeys("H1");Thread.sleep(500);
		 try
		 {
			 AdaniAMD_QuickASI_HAWBOrign1.sendKeys("AMD");Thread.sleep(500);
		 }
		 catch (Exception E)
		 {
			 System.out.println("Disable Origin Field");
		 }
		 
		 try
		 {
			 AdaniAMD_QuickASI_HAWBDestination1.sendKeys("DXB");Thread.sleep(500);
		 }
		 catch (Exception E)
		 {
			 System.out.println("Disable Destination Field");
		 }
		 		
		 AdaniAMD_QuickASI_HAWBNOP1.sendKeys("30");Thread.sleep(500);
		 AdaniAMD_QuickASI_HAWBGrossWt1.sendKeys("300");Thread.sleep(500);	
	}
	
	
	public void AddDimension1() throws InterruptedException
	{
		
		AdaniAMD_AddSBDimLength1.sendKeys("13");Thread.sleep(500);
		AdaniAMD_AddSBDimWidth1.sendKeys("14");Thread.sleep(500);
		AdaniAMD_AddSBDimHeight1.sendKeys("15");Thread.sleep(500);
		AdaniAMD_AddSBDimVolume1.click();Thread.sleep(500);
		
		try
		{
			AdaniAMD_AddSBDimensionOk1.click();Thread.sleep(2000);
		}
		catch(Exception E)
		{
			AdaniAMD_EBookigAddDimensionSave.click();Thread.sleep(2000);
		}
		
		
	}
	
	public void AddDimension1Repeat() throws InterruptedException
	{
		AdaniAMD_AddSBDimNOP1.sendKeys("1");Thread.sleep(500);
		AdaniAMD_AddSBDimLength1.sendKeys("3");Thread.sleep(500);
		AdaniAMD_AddSBDimWidth1.sendKeys("4");Thread.sleep(500);
		AdaniAMD_AddSBDimHeight1.sendKeys("5");Thread.sleep(500);
		AdaniAMD_AddSBDimVolume1.click();Thread.sleep(500);
		
	}
	
	
	public void SendManifest() throws InterruptedException
	{
		   driver.switchTo().frame(0);
		   AdaniAMD_SendManifestEmailID.click();Thread.sleep(500);
		   AdaniAMD_SendManifestEmailID.sendKeys("Priyanka.Sikchi@Kalelogistics.com"); Thread.sleep(2000);
		   AdaniAMD_SendManifestSendMailButton.click();Thread.sleep(2000);
		   AdaniAMD_SendManifestSendMailClose.click();Thread.sleep(6000);
		   driver.switchTo().defaultContent();Thread.sleep(500);
		  
		   
	}
	
	public void PrintToken() throws InterruptedException
	{
		Thread.sleep(2000);
		   wm.JavascriptExecutorClick(driver, AdaniAMD_VechicleTokenPrintAll);Thread.sleep(500);
		   AdaniAMD_VechicleTokenPrintTokenBoth.click();Thread.sleep(3000);
		   AdaniAMD_VechicleTokenPrintButton.click();Thread.sleep(9000);
		   
	}
	
	public void CancelToken() throws InterruptedException
	{
		 		
		AdaniAMD_VechicleTokenSBDetailScreen.click();Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, AdaniAMD_VechicleTokenCancelButton);Thread.sleep(3000);
		AdaniAMD_GenerateTokenButtonOk.click();Thread.sleep(6000);
		   
	}
	
	
	public void AddShipment() throws InterruptedException
	{
		AdaniAMD_AddShipmentButton.click();	Thread.sleep(2000);
		driver.switchTo().frame(0);
		wm.JavascriptExecutorClick(driver, AdaniAMD_AddShipmentCheckBox1Button);Thread.sleep(2000);
		//AdaniAMD_AddShipmentCheckBox1Button.click();Thread.sleep(2000);
		AdaniAMD_AddShipmentAddButton.click();Thread.sleep(2000);
		 driver.switchTo().defaultContent();Thread.sleep(500);
	}
	public void eDocket1() throws InterruptedException, AWTException
	{
		  driver.switchTo().frame(0);
		  
		  // First doc
		   AdaniAMD_eDockeSelectDocTypeDropdown.click();
		   Select SelectDocType = new Select(AdaniAMD_eDockeSelectDocTypeDropdown);
		   SelectDocType.selectByVisibleText("AWB Copy");Thread.sleep(500);
		   wm.JavascriptExecutorClick(driver, AdaniAMD_eDockeBrowseButton);Thread.sleep(2000);
		   /*Actions a = new Actions(driver);
		      a.moveToElement(driver.findElement(By.id(("ctl00_hldPage_fuctlUploadDocs")))).click().
		      build().perform();*/
		   
			Robot rb1 = new Robot();
			rb1.delay(2000);
			StringSelection ss1 = new StringSelection("C:\\Users\\priyanka.sikchi\\OneDrive - Kale Logistics Solutions Private Limited\\Priyanka\\Kale Workspace\\ACS-Adani\\GitHub\\ACS-Adani\\AdaniAMD\\dummy documents\\pdf1.pdf");  rb1.delay(2000);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);rb1.keyPress(KeyEvent.VK_CONTROL); rb1.delay(2000);
			rb1.keyPress(KeyEvent.VK_V); 
			rb1.delay(2000);
			rb1.keyPress(KeyEvent.VK_ENTER); rb1.delay(500);
			rb1.keyPress(KeyEvent.VK_ENTER);
			
			rb1.delay(2000);	
			
			// Second Doc
			Thread.sleep(5000);
			AdaniAMD_eDockeSelectDocTypeDropdown2.click();
			   Select SelectDocType2 = new Select(AdaniAMD_eDockeSelectDocTypeDropdown2);
			   SelectDocType2.selectByVisibleText("CSD");Thread.sleep(500);
			   wm.JavascriptExecutorClick(driver, AdaniAMD_eDockeBrowseButton2);Thread.sleep(2000);
			   /*Actions a = new Actions(driver);
			      a.moveToElement(driver.findElement(By.id(("ctl00_hldPage_fuctlUploadDocs")))).click().
			      build().perform();*/
			   
				Robot rb2 = new Robot();
				rb2.delay(2000);
				StringSelection ss2 = new StringSelection("C:\\Users\\priyanka.sikchi\\OneDrive - Kale Logistics Solutions Private Limited\\Priyanka\\Kale Workspace\\ACS-Adani\\GitHub\\ACS-Adani\\AdaniAMD\\dummy documents\\pdf2.pdf");  rb2.delay(2000);
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2, null);rb2.keyPress(KeyEvent.VK_CONTROL); rb2.delay(2000);
				rb2.keyPress(KeyEvent.VK_V); 
				rb2.delay(2000);
				rb2.keyPress(KeyEvent.VK_ENTER); rb2.delay(2000);
				rb2.keyPress(KeyEvent.VK_ENTER);
				
				rb2.delay(2000);	
			
			AdaniAMD_eDockeUploadButton.click();Thread.sleep(2000);
			
		   //AdaniAMD_eDockeSubmitButton.click();Thread.sleep(3000);
		   wm.JavascriptExecutorClick(driver, AdaniAMD_eDockeSubmitButton);Thread.sleep(4000);
		   wm.JavascriptExecutorClick(driver, AdaniAMD_eDockeOkButton);Thread.sleep(5000);
		
		   driver.switchTo().defaultContent();Thread.sleep(500);
	}
	
	public void ClearDocket() throws InterruptedException
	{
		driver.switchTo().frame(0);
		 AdaniAMD_eDocketActionDeletButton.click();
		 wm.JavascriptExecutorClick(driver, AdaniAMD_eDockeSubmitButton);Thread.sleep(2000);
		 wm.JavascriptExecutorClick(driver, AdaniAMD_eDockeOkButton);Thread.sleep(2000);
		driver.switchTo().defaultContent();Thread.sleep(500);
		
	}
	
	public void eDocket2() throws InterruptedException, AWTException
	{
		  driver.switchTo().frame(0);
		  
		  // First doc
		   AdaniAMD_eDockeSelectDocTypeDropdown.click();
		   Select SelectDocType = new Select(AdaniAMD_eDockeSelectDocTypeDropdown);
		   SelectDocType.selectByVisibleText("AWB Copy");Thread.sleep(500);
		   
		   AdaniAMD_eDocketActionClearButton.click();Thread.sleep(2000);
		   
		 
			
			 AdaniAMD_eDockeSelectDocTypeDropdown.click();
			   Select SelectDocType3 = new Select(AdaniAMD_eDockeSelectDocTypeDropdown);
			   SelectDocType3.selectByVisibleText("AWB Copy");Thread.sleep(500);
			   wm.JavascriptExecutorClick(driver, AdaniAMD_eDockeBrowseButton);Thread.sleep(2000);
			   /*Actions a = new Actions(driver);
			      a.moveToElement(driver.findElement(By.id(("ctl00_hldPage_fuctlUploadDocs")))).click().
			      build().perform();*/
			   
				Robot rb3 = new Robot();
				rb3.delay(2000);
				StringSelection ss3 = new StringSelection("C:\\Users\\priyanka.sikchi\\OneDrive - Kale Logistics Solutions Private Limited\\Priyanka\\Kale Workspace\\ACS-Adani\\GitHub\\ACS-Adani\\AdaniAMD\\dummy documents\\pdf1.pdf");  rb3.delay(2000);
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss3, null);rb3.keyPress(KeyEvent.VK_CONTROL); rb3.delay(2000);
				rb3.keyPress(KeyEvent.VK_V); 
				rb3.delay(2000);
				rb3.keyPress(KeyEvent.VK_ENTER); rb3.delay(500);
				rb3.keyPress(KeyEvent.VK_ENTER);
				
				rb3.delay(2000);	
			
			AdaniAMD_eDockeUploadButton.click();Thread.sleep(2000);
			
		   //AdaniAMD_eDockeSubmitButton.click();Thread.sleep(3000);
		   wm.JavascriptExecutorClick(driver, AdaniAMD_eDockeSubmitButton);Thread.sleep(2000);
		   wm.JavascriptExecutorClick(driver, AdaniAMD_eDockeOkButton);Thread.sleep(2000);
		
		   driver.switchTo().defaultContent();Thread.sleep(500);
	}
	
	public void VerifyVTandAWB() throws InterruptedException
	{
		AdaniAMD_VechicleTokenMileStone.click();	Thread.sleep(2000);
		
		String AWBNumber = AdaniAMD_VechicleTokenAWBNo.getText();		
		System.out.println("AWB No: " +AWBNumber);
		
		String VTENumber = AdaniAMD_VechicleTokenVTENo.getText();
		System.out.println("VET No: " +VTENumber);
		
		wm.JavascriptExecutorClick(driver, AdaniAMD_ViewHAWBBack);Thread.sleep(2000);
		
	}
	
	public void VerifyVTandAWB1() throws InterruptedException
	{
		AdaniAMD_VechicleTokenMileStone.click();	Thread.sleep(2000);
		AdaniAMD_VechicleTokenSBDetailScreen.click();	Thread.sleep(2000);
		
		String AWBNumber1 = AdaniAMD_VechicleTokenAWBNo1.getText();		
		System.out.println("AWB No 1: " +AWBNumber1);
		
		String VTENumber1 = AdaniAMD_VechicleTokenVTENo.getText();
		System.out.println("VET No 1: " +VTENumber1);
		
		wm.JavascriptExecutorClick(driver, AdaniAMD_ViewHAWBBack);Thread.sleep(2000);
		
		AdaniAMD_VechicleTokenMileStone.click();	Thread.sleep(2000);
		
		
		
		try
		{
			AdaniAMD_VechicleTokenSBDetailScreen2.click();	Thread.sleep(2000);
			String AWBNumber2 = AdaniAMD_VechicleTokenAWBNo1.getText();		
			System.out.println("AWB No 2: " +AWBNumber2);
			
			String VTENumber2 = AdaniAMD_VechicleTokenVTENo.getText();
			System.out.println("VET No 2: " +VTENumber2);
			
			wm.JavascriptExecutorClick(driver, AdaniAMD_ViewHAWBBack);Thread.sleep(2000);
			
			try
			{
				AdaniAMD_VechicleTokenMileStone.click();	Thread.sleep(2000);
				AdaniAMD_VechicleTokenSBDetailScreen3.click();	Thread.sleep(2000);
				String AWBNumber3 = AdaniAMD_VechicleTokenAWBNo1.getText();		
				System.out.println("AWB No 3: " +AWBNumber3);
				
				String VTENumber3 = AdaniAMD_VechicleTokenVTENo.getText();
				System.out.println("VET No 3: " +VTENumber3);
				
				wm.JavascriptExecutorClick(driver, AdaniAMD_ViewHAWBBack);Thread.sleep(2000);
				
			}
			catch (Exception E1)
			{
				System.out.println("VTE no not generated");
			}
			
		}
		catch (Exception E)
		{
			System.out.println("VTE no not generated");
			
			
		}
		
		
	}
	
	
	public void EBookingAddShipper() throws InterruptedException
	{
		
		
		driver.switchTo().frame(0);
		
		AdaniAMD_EBookigAddShipperCompanyName.sendKeys("Shipper"+cm.RandomNo(3));Thread.sleep(500);
		AdaniAMD_EBookigAddShipperIECode.sendKeys(cm.RandomNo(4));Thread.sleep(500);
		AdaniAMD_EBookigAddShipperEmailID.sendKeys("Priyanka.Sikchi@Kalelogistics.com");Thread.sleep(500);
		AdaniAMD_EBookigAddShipperAddressLine1.sendKeys("White House Andheri");Thread.sleep(500);
		AdaniAMD_EBookigAddShipperZipeCode.sendKeys(cm.RandomNo(6));Thread.sleep(500);
		AdaniAMD_EBookigAddShipperCountry.sendKeys("IN");Thread.sleep(500);
		AdaniAMD_EBookigAddShipperState.sendKeys("MH");Thread.sleep(500);
		AdaniAMD_EBookigAddShipperCity.sendKeys("BOM");Thread.sleep(500);
		AdaniAMD_EBookigAddShipperOtherCity.click();Thread.sleep(500);
		AdaniAMD_EBookigAddShipperSaveButton.click();Thread.sleep(2000);
		
	    driver.switchTo().defaultContent();Thread.sleep(500);
	    AdaniAMD_EBookigAddShipperOkButton.click();Thread.sleep(2000);	    
		
	}
	
	public void EBookingAddConsignee() throws InterruptedException
	{
		
		
		driver.switchTo().frame(0);
		
		AdaniAMD_EBookigAddConsigneeCompanyName.sendKeys("Consignee"+cm.RandomNo(3));Thread.sleep(500);
		//AdaniAMD_EBookigAddConsigneeIECode.sendKeys(cm.RandomNo(4));Thread.sleep(500);
		AdaniAMD_EBookigAddConsigneeEmailID.sendKeys("Priyanka.Sikchi@Kalelogistics.com");Thread.sleep(500);
		AdaniAMD_EBookigAddConsigneeAddressLine1.sendKeys("Golden Lane Bandra");Thread.sleep(500);
		AdaniAMD_EBookigAddConsigneeZipeCode.sendKeys(cm.RandomNo(6));Thread.sleep(500);
		AdaniAMD_EBookigAddConsigneeCountry.sendKeys("AE");Thread.sleep(500);
		AdaniAMD_EBookigAddConsigneeState.sendKeys("DXB");Thread.sleep(500);
		AdaniAMD_EBookigAddConsigneeCity.sendKeys("DXB");Thread.sleep(500);
		AdaniAMD_EBookigAddConsigneeOtherCity.click();Thread.sleep(500);
		AdaniAMD_EBookigAddConsigneeSaveButton.click();Thread.sleep(2000);
		
	    driver.switchTo().defaultContent();Thread.sleep(500);
	    AdaniAMD_EBookigAddConsigneeOkButton.click();Thread.sleep(2000);
	    
		
	}
	
}