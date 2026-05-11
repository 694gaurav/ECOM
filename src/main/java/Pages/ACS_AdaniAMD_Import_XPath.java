package Pages;

import static Helper.BaseObjects.Import;
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

public class ACS_AdaniAMD_Import_XPath extends Pages.BasePage {

	public ACS_AdaniAMD_Import_XPath(WebDriver driver) {
		super(driver);
	
	}
	

	@FindBy(xpath = "(//*[text()='Imports'][@id='ctl00_btnimp'])")
	public WebElement AdaniImportsModule;
	
	@FindBy(xpath = "(//*[text()='Track and Trace'])")
	public WebElement AdaniImportsTrackAndTrace;
	
	@FindBy(xpath = "(//*[text()=' Shipment Details'])")
	public WebElement AdaniImportsShipmentDetailsPage;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_divhidegrid'])")
	public WebElement AdaniImportsShipmentDetailsPageScrollBar;
	
	@FindBy(xpath = "(//*[@title='Add MAWB/HAWB'])")
	public WebElement AdaniImportsAddMAWB_HAWBButton;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtAirlinePrefix'])")
	public WebElement AdaniImportsMAWBPrefixNumber;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtMAWBNumber'])")
	public WebElement AdaniImportsMAWBNumber;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtMAWBDate'])/parent::td/img")
	public WebElement AdaniImportsMAWBDateIcon;
	
	@FindBy(css = "#ui-datepicker-div > table > tbody > tr:nth-child(1) > td.ui-datepicker-days-cell-over.ui-datepicker-today > a")
	public WebElement AdaniImportsMAWBTodayDate1;
	
	@FindBy(css = "#ui-datepicker-div > table > tbody > tr:nth-child(2) > td.ui-datepicker-days-cell-over.ui-datepicker-today > a")
	public WebElement AdaniImportsMAWBTodayDate2;
	
	@FindBy(css = "#ui-datepicker-div > table > tbody > tr:nth-child(3) > td.ui-datepicker-days-cell-over.ui-datepicker-today > a")
	public WebElement AdaniImportsMAWBTodayDate3;
	
	@FindBy(css = "#ui-datepicker-div > table > tbody > tr:nth-child(4) > td.ui-datepicker-days-cell-over.ui-datepicker-today > a")
	public WebElement AdaniImportsMAWBTodayDate4;
	
	@FindBy(css = "#ui-datepicker-div > table > tbody > tr:nth-child(5) > td.ui-datepicker-days-cell-over.ui-datepicker-today > a")
	public WebElement AdaniImportsMAWBTodayDate5;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_GenericAutoFillCityDeparture_txtCode'])")
	public WebElement AdaniImportsMAWBOriginAirportCode;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtAirline'])")
	public WebElement AdaniImportsMAWBAirlinetName;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtCarriarCode'])")
	public WebElement AdaniImportsMAWBFlightCarrierCode;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtFlightNo'])")
	public WebElement AdaniImportsMAWBFlightNumber;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtFlightDate'])/parent::td/img")
	public WebElement AdaniImportsMAWBFlightDateIcon;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtIGMNo'])")
	public WebElement AdaniImportsMAWBIGMNumber;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtIGMDate'])/parent::td/img")
	public WebElement AdaniImportsMAWBIGMDate;

	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtNumberOfPackages'])")
	public WebElement AdaniImportsMAWBNoofPkgs;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtGrossWeight'])")
	public WebElement AdaniImportsMAWBGrossWeight;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtChargeableWeight'])")
	public WebElement AdaniImportsMAWBChargeableWeight;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnSaveMAWB'])")
	public WebElement AdaniImportsMAWBSaveButton;
	
	@FindBy(xpath = "(//*[text()='Shipment details saved successfully.'])/parent::div/parent::div/div[3]/input")
	public WebElement AdaniImportsMAWBSaveButtonOkPupup;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHAWB_ctl01_txtHAWBNumber'])")
	public WebElement AdaniImportsHAWBNumber1;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHAWB_ctl01_txtHAWBDate'])/parent::td/img")
	public WebElement AdaniImportsHAWBDate1;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHAWB_ctl01_txtOrigin'])")
	public WebElement AdaniImportsHAWBOrigin1;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHAWB_ctl01_txtHAWBNumberOfPackages'])")
	public WebElement AdaniImportsHAWBPackage1;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHAWB_ctl01_txtHAWBGrossWeight'])")
	public WebElement AdaniImportsHAWBGrossWeight1;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHAWB_ctl01_txtHAWBChargeableWeight'])")
	public WebElement AdaniImportsHAWBChargeWeight1;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHAWB_ctl01_txtRcvdHAWBNumberOfPackages'])")
	public WebElement AdaniImportsHAWRevdPackage1;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHAWB_ctl01_txtRcvdHAWBGrossWeight'])")
	public WebElement AdaniImportsHAWBRcvdGrossWeight1;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHAWB_ctl01_txtRcvdHAWBChargeableWeight'])")
	public WebElement AdaniImportsHAWBRcvdChargeWeight1;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHAWB_ctl01_txtHAWBDescription'])")
	public WebElement AdaniImportsHAWBDiscription1;
	
	// -----------------------------
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHAWB_ctl02_txtHAWBNumber'])")
	public WebElement AdaniImportsHAWBNumber2;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHAWB_ctl02_txtHAWBDate'])/parent::td/img")
	public WebElement AdaniImportsHAWBDate2;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHAWB_ctl02_txtOrigin'])")
	public WebElement AdaniImportsHAWBOrigin2;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHAWB_ctl02_txtHAWBNumberOfPackages'])")
	public WebElement AdaniImportsHAWBPackage2;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHAWB_ctl02_txtHAWBGrossWeight'])")
	public WebElement AdaniImportsHAWBGrossWeight2;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHAWB_ctl02_txtHAWBChargeableWeight'])")
	public WebElement AdaniImportsHAWBChargeWeight2;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHAWB_ctl02_txtRcvdHAWBNumberOfPackages'])")
	public WebElement AdaniImportsHAWRevdPackage2;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHAWB_ctl02_txtRcvdHAWBGrossWeight'])")
	public WebElement AdaniImportsHAWBRcvdGrossWeight2;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHAWB_ctl02_txtRcvdHAWBChargeableWeight'])")
	public WebElement AdaniImportsHAWBRcvdChargeWeight2;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptHAWB_ctl02_txtHAWBDescription'])")
	public WebElement AdaniImportsHAWBDiscription2;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdMAWB_ctl01_txtFilter8'])")
	public WebElement AdaniImportsHAWBDFilterMAWBNumber;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdMAWB_ctl01_imgFilterOperator8'])")
	public WebElement AdaniImportsHAWBDFilterOperator;
	
	@FindBy(xpath = "(//*[text()=' Contains'])")
	public WebElement AdaniImportsHAWBDFilterContains;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdAWB_ctl01_txtFilter0'])")
	public WebElement AdaniImportsHAWBDFilterMAWBNumberTrackAndTrace;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdAWB_ctl01_imgFilterOperator0'])")
	public WebElement AdaniImportsHAWBDFilterOperatorTrackAndTrace;
	
	
	// ---------------------- Airline Login --------------------
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtAWBNo'])")
	public WebElement AdaniImportsAirlineMAWBNumber;
	
	@FindBy(xpath = "(//*[@title='Search'])")
	public WebElement AdaniImportsAirlineMAWBSearchButton;
	
	@FindBy(xpath = "(//*[@title='Pending ADO'])")
	public WebElement AdaniImportsAirlineActionPendingDOIcon;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnDOSubmit'])")
	public WebElement AdaniImportsAirlineActionPendingDOSubmitButton;
	
	@FindBy(xpath = "(//*[text()='Airline DO approved successfully.'])/parent::div/parent::div/div[3]/input")
	public WebElement AdaniImportsAirlineActionPendingDOSubmitButtonOKPopup;
	
	//------------------------- Weight verification -----------------------
	
	@FindBy(xpath = "(//*[@title='Weight Verification'])[1]")
	public WebElement AdaniImportsWeightVerificationMilestone;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnUploadDocument'])")
	public WebElement AdaniImportsWeightVerificationDocumentUploadButton;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_GridMAWBFILE_ctl02_fuctlUploadDocs'])")
	public WebElement AdaniImportsWeightVerificationMAWBNumberFileButton;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_GrdUploadConsolfile_ctl02_fuctlUploadDocs2'])")
	public WebElement AdaniImportsWeightVerificationConsolManifestFileButton;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnUploadfile'])")
	public WebElement AdaniImportsWeightVerificationFileUploadButton;
	
	@FindBy(xpath = "(//*[text()='Documents uploaded successfully.'])/parent::div/parent::div/div[3]/input")
	public WebElement AdaniImportsWeightVerificationFileUploadButtonOkPopup;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnwtSubmit'])")
	public WebElement AdaniImportsWeightVerificationSubmitButton;
	
	@FindBy(xpath = "(//*[text()='Weight verification submitted successfully'])/parent::div/parent::div/div[3]/input")
	public WebElement AdaniImportsWeightVerificationSubmitButtonOKPopup;
	
	//------------------------- Consol DO -----------------------
	
	@FindBy(xpath = "(//*[@title='Consol DO'])[1]")
	public WebElement AdaniImportsConsolDOMilestone;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_ddlCHA'])")
	public WebElement AdaniImportsConsolDOCHADropdown;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtDONo'])")
	public WebElement AdaniImportsConsolDONumber;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnDOSubmit'])")
	public WebElement AdaniImportsConsolDOSubmitButton;
	
	@FindBy(xpath = "(//*[text()='Consol DO submitted successfully.'])/parent::div/parent::div/div[3]/input")
	public WebElement AdaniImportsConsolDOSubmitOkPopup;
	
// --------------------  BoE ----------------------------------
	
	@FindBy(xpath = "(//*[@title='Bill of Entry'])[1]")
	public WebElement AdaniImportsBoEMilestone;
	
	@FindBy(xpath = "(//*[@id='txtSBNumber'])")
	public WebElement AdaniImportsBoENumber;
	
	@FindBy(xpath = "(//*[@id='txtSBDate'])/parent::td/img")
	public WebElement AdaniImportsBoEDate;
	
	@FindBy(xpath = "(//*[@id='drpSBType'])")
	public WebElement AdaniImportsBoETypeDrpodown;
	
	@FindBy(xpath = "(//*[@id='txtCAV'])")
	public WebElement AdaniImportsBoECAVValue;
	
	@FindBy(xpath = "(//*[@id='txtNOP'])")
	public WebElement AdaniImportsBoENOP;
	
	@FindBy(xpath = "(//*[@id='txtCHACode'])")
	public WebElement AdaniImportsBoECBC;
	
	@FindBy(xpath = "(//*[@title='Upload BoE'])")
	public WebElement AdaniImportsBoEUploadIcon;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_fuctlUploadDocs'])")
	public WebElement AdaniImportsBoEUploadFile;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnUploadSave'])")
	public WebElement AdaniImportsBoEUploadFileButton;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptUploadedDocument_ctl01_lnkDoc'])")
	public WebElement AdaniImportsBoEUploadedDocumentDownload;
	
	@FindBy(xpath = "(//*[text()='Upload BoE'])[1]/parent::div/parent::div/div[3]/div/button")
	public WebElement AdaniImportsBoEUploadfilePopupClose;
	
	@FindBy(xpath = "(//*[@id='btnSaveAWB'])")
	public WebElement AdaniImportsBoESaveButton;
	
	@FindBy(xpath = "(//*[text()='Bill of Entry details saved successfully.'])/parent::div/parent::div/div[3]/input")
	public WebElement AdaniImportsBoESaveButtonOkPopup;
	
	// ------------------------- TSP MileStone -------------------
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdMAWB_ctl02_imgbTSPBOE'])")
	public WebElement AdaniImportsTSPMilestone;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnProceedTP'])")
	public WebElement AdaniImportsTSPMilestoneSelfPaymentProceedButton;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_ddlTSPCommodityGroup'])")
	public WebElement AdaniImportsTSPPaymentCargoTypeDropdown;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_ddlComodityTypeName'])")
	public WebElement AdaniImportsTSPPaymentComodityDropdown;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtTSPPassword'])")
	public WebElement AdaniImportsTSPPaymentPassword;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnTSPPay'])")
	public WebElement AdaniImportsTSPPaymentPayNowButton;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnTSPConfirm'])")
	public WebElement AdaniImportsTSPPaymentPayNowButtonYesPopup;
	
	@FindBy(xpath = "(//*[text()='TSP generated successfully.'])/parent::td/parent::tr/parent::tbody/tr[2]/td[3]/input")
	public WebElement AdaniImportsTSPPaymentPayNowButtonOkPopup;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdMAWB_ctl02_lbTSPBOE'])")
	public WebElement AdaniImportsTSPAmountHyperlink;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnTSPPrint'])")
	public WebElement AdaniImportsTSPPrint;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnTSPPrintSSRS'])")
	public WebElement AdaniImportsTSPPrint1;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_ddlTSPPayMethod'])")
	public WebElement AdaniImportsTSPTrarePartnerDropdown;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_ddlAssignedTP'])")
	public WebElement AdaniImportsTSPTradePartnerConsineeDropDown;
	
	@FindBy(xpath = "(//*[text()='Shipment Information assigned successfully to respective Trade Partner.'])/parent::div/parent::div/div[3]/input")
	public WebElement AdaniImportsTSPTradePartnerConsineeOkPopup;
	
	
	// -------------------------- OOC Milestone ----------------------------
	
	@FindBy(xpath = "(//*[@title='OoC'])[1]")
	public WebElement AdaniImportsOOCMilestone;
	
	@FindBy(xpath = "(//*[@id='txtOoCNumber'])")
	public WebElement AdaniImportsOOCNumber;
	
	@FindBy(xpath = "(//*[@id='txtOoCDate'])/parent::td/img")
	public WebElement AdaniImportsOOCDate;
	
	@FindBy(xpath = "(//*[@title='Upload OOC'])")
	public WebElement AdaniImportsOOCUploadIcon;
	
	@FindBy(xpath = "(//*[text()='Upload OoC'])[1]/parent::div/parent::div/div[3]/div/button")
	public WebElement AdaniImportsOOCUploadfilePopupClose;
	
	@FindBy(xpath = "(//*[text()='Out of Charge saved successfully.'])/parent::div/parent::div/div[3]/input")
	public WebElement AdaniImportsOOCSaveButtonOkPopup;
	
	// ------------------------------ Vechicle Token -------------------------------------
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdMAWB_ctl02_chkTokenSelect'])")
	public WebElement AdaniImportsVTCheckbox;
	
	@FindBy(xpath = "(//*[@title='Generate Token'])")
	public WebElement AdaniImportsVTGenerateTokenButton;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rblCTOTokenList_3'])")
	public WebElement AdaniImportsVTGenerateTokenKaleGHA1RadioButton;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnCTOTokenProceed'])")
	public WebElement AdaniImportsVTGenerateTokenProceedButton;
	
	@FindBy(xpath = "(//*[@id='txtVehNo'])")
	public WebElement AdaniImportsVTGenerateTokenVechicleNumber;
	
	@FindBy(xpath = "(//*[@id='txtDriverLicNo'])")
	public WebElement AdaniImportsVTGenerateTokenDriverLicNumber;
	
	@FindBy(xpath = "(//*[@id='txtDriverName'])")
	public WebElement AdaniImportsVTGenerateTokenDriverName;
	
	@FindBy(xpath = "(//*[@id='txtDriverMobNo'])")
	public WebElement AdaniImportsVTGenerateTokenDriverMobNumber;
	
	@FindBy(xpath = "(//*[@id='txtAgentMobNo'])")
	public WebElement AdaniImportsVTGenerateTokenAgentMobNumber;
	
	@FindBy(xpath = "(//*[@id='txtNOP'])")
	public WebElement AdaniImportsVTGenerateTokenNoP;
	
	@FindBy(xpath = "(//*[@id='txtGrossWt'])")
	public WebElement AdaniImportsVTGenerateTokenGrossWeight;
	
	@FindBy(xpath = "(//*[@id='AddRow'])")
	public WebElement AdaniImportsVTGenerateTokenVechiclePlusButton;
	
	@FindBy(xpath = "(//*[@id='txtVehNo'])[2]")
	public WebElement AdaniImportsVTGenerateTokenVechicleNumber1;
	
	@FindBy(xpath = "(//*[@id='txtDriverLicNo'])[2]")
	public WebElement AdaniImportsVTGenerateTokenDriverLicNumber1;
	
	@FindBy(xpath = "(//*[@id='txtDriverName'])[2]")
	public WebElement AdaniImportsVTGenerateTokenDriverName1;
	
	@FindBy(xpath = "(//*[@id='txtDriverMobNo'])[2]")
	public WebElement AdaniImportsVTGenerateTokenDriverMobNumber1;
	
	@FindBy(xpath = "(//*[@id='txtAgentMobNo'])[2]")
	public WebElement AdaniImportsVTGenerateTokenAgentMobNumber1;
	
	@FindBy(xpath = "(//*[@id='txtNOP'])[2]")
	public WebElement AdaniImportsVTGenerateTokenNoP1;
	
	@FindBy(xpath = "(//*[@id='txtGrossWt'])[2]")
	public WebElement AdaniImportsVTGenerateTokenGrossWeight1;
		
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnSaveAwb'])")
	public WebElement AdaniImportsVTGenerateTokenbutton;
	
	@FindBy(xpath = "(//*[text()='Vehicle Token generated successfully.'])/parent::div/parent::div/div[3]/input")
	public WebElement AdaniImportsVTGenerateTokenbuttonOkPopup;
	
	@FindBy(xpath = "(//*[@value='Add Shipments'])")
	public WebElement AdaniImportsVTGenerateTokenAddShipmentsButton;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdSBWiseShipments_ctl02_chkRecord'])")
	public WebElement AdaniImportsVTGenerateTokenAddShipmentsBoERowCheckbox;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnAssign'])")
	public WebElement AdaniImportsVTGenerateTokenAddShipmentsAddButton;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdMAWB_ctl02_lnkVTNo'])")
	public WebElement AdaniImportsVTCompleteMilestone;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnEdit'])")
	public WebElement AdaniImportsVTEditTokenButton;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnSave'])")
	public WebElement AdaniImportsVTEditTokenSaveButton;
	
	@FindBy(xpath = "(//*[text()='Vehicle details updated successfully.'])/parent::div/parent::div/div[3]/input")
	public WebElement AdaniImportsVTEditButtonOkPopup;
	
	@FindBy(xpath = "(//*[@id='btnPrintAllToken'])")
	public WebElement AdaniImportsVTPrintAllButton;
	
	@FindBy(xpath = "(//*[text()='Only VT'])")
	public WebElement AdaniImportsVTPrintOnlyVTCheckbox;
	
	@FindBy(xpath = "(//*[text()='TSP & VT'])")
	public WebElement AdaniImportsVTPrintTSTAndVTCheckbox;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnPrintAll'])")
	public WebElement AdaniImportsVTPrintButton;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnCancelToken'])")
	public WebElement AdaniImportsVTCancelTokenButton;
	
	@FindBy(xpath = "(//*[text()='Token cancelled successfully.'])/parent::div/parent::div/div[3]/input")
	public WebElement AdaniImportsVTCancelTokenButtonOkPopup;

	// ------------------------------ Revoke Process -------------------------------------
	
		@FindBy(xpath = "(//*[text()='Revoke'])")
		public WebElement AdaniImportsRevokeHyperlink;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtRevokeRemarksNew'])")
		public WebElement AdaniImportsRevokeConfirmationMsg;
		
		@FindBy(xpath = "(//*[@value='Revoke'])")
		public WebElement AdaniImportsRevokeButton;
		
		@FindBy(xpath = "(//*[text()='Airline DO revoked successfully.'])/parent::div/parent::div/div[3]/input")
		public WebElement AdaniImportsRevokeButtonOkPopup;
		
		// ----------------------------------- Reports -----------------------------
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_drMode'])")
		public WebElement AdaniImports_ReportsSubMenDwellTimeReportMode;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_drppda'])")
		public WebElement AdaniImports_ReportsSubMenuDwellTimeReportCTODropDown;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_ddlModes'])")
		public WebElement AdaniImport_ReportsSubMenuTonnageReportMode;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_ddlCTO'])")
		public WebElement AdaniImport_ReportsSubMenuTonnageReportCTODropDown;
		
		
	// ----------------------------------- Search Token -----------------------------
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnSearchToken'])")
		public WebElement AdaniImports_SearchTokenButton;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtSearchToken'])")
		public WebElement AdaniImports_SearchTokenTextBox;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnSearchToken'])")
		public WebElement AdaniImports_SearchTokenSearchButton;
		
	// --------------- Release and Revoke DO ------------------------------
		
		@FindBy(xpath = "(//*[@title='Release and Revoke DO'])")
		public WebElement AdaniImports_ReleaseRevokeDOButton;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdCDO_ctl02_chkRecord'])")
		public WebElement AdaniImports_ReleaseDOCheckbox1;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdCDO_ctl03_chkRecord'])")
		public WebElement AdaniImports_ReleaseDOCheckBox2;
		
		@FindBy(xpath = "(//*[text()='Consol DO submitted successfully.'])/parent::div/parent::div/div[3]/button")
		public WebElement AdaniImports_ReleaseDOSubmitOkPopup;
		
		@FindBy(xpath = "(//*[text()='Revoke DO'])")
		public WebElement AdaniImports_RevokeDOTab;
		
		@FindBy(xpath = "(//*[@value='Revoke DO'])")
		public WebElement AdaniImports_RevokeDOButton;
		
		@FindBy(xpath = "(//*[text()='Consol DO revoked successfully.'])/parent::div/parent::div/div[3]/button")
		public WebElement AdaniImports_RevokeDOSubmitOkPopup;
		
		@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnConsolDOCancel'])")
		public WebElement AdaniImports_ReleaseRevokeDOCancelButton;
		
		
		//-----------------------------------------------------------	
		
	
	public void CurrentDate() throws InterruptedException
	{
		try
		{
			AdaniImportsMAWBTodayDate1.click();Thread.sleep(500);
		}
		catch (Exception E)
		{
			System.out.println("Its not a First Week");
		}
		
		try
		{
			AdaniImportsMAWBTodayDate2.click();Thread.sleep(500);
		}
		catch (Exception E)
		{
			System.out.println("Its not a Second Week");
		}
		
		try
		{
			AdaniImportsMAWBTodayDate3.click();Thread.sleep(500);
		}
		catch (Exception E)
		{
			System.out.println("Its not a Third Week");
		}
		
		try
		{
			AdaniImportsMAWBTodayDate4.click();Thread.sleep(500);
		}
		catch (Exception E)
		{
			System.out.println("Its not a Forth Week");
		}
		
		try
		{
			AdaniImportsMAWBTodayDate5.click();Thread.sleep(500);
		}
		catch (Exception E)
		{
			System.out.println("Its not a Fifth Week");
		}
	}
	public void MAWBDeatils() throws InterruptedException
	{
		Thread.sleep(5000);
		AdaniImportsMAWBDateIcon.click();Thread.sleep(500);
		CurrentDate();
		
		AdaniImportsMAWBAirlinetName.sendKeys("Kale Airline");Thread.sleep(500);
		AdaniImportsMAWBOriginAirportCode.sendKeys("DXB");Thread.sleep(500);
		AdaniImportsMAWBFlightCarrierCode.sendKeys("ZZ");Thread.sleep(500);
		AdaniImportsMAWBFlightNumber.sendKeys(cm.RandomNo(4));Thread.sleep(500);
		AdaniImportsMAWBFlightDateIcon.click();Thread.sleep(500);
		CurrentDate();Thread.sleep(500);
		AdaniImportsMAWBIGMNumber.sendKeys(cm.RandomNo(7));Thread.sleep(500);
		AdaniImportsMAWBIGMDate.click();Thread.sleep(500);
		CurrentDate();Thread.sleep(500);
		AdaniImportsMAWBNoofPkgs.sendKeys("20");Thread.sleep(500);
		AdaniImportsMAWBGrossWeight.sendKeys("200");Thread.sleep(500);
		AdaniImportsMAWBChargeableWeight.sendKeys("200");Thread.sleep(500);
	}
	
	public void HAWBDetailsSingle() throws InterruptedException
	{
		AdaniImportsHAWBNumber1.sendKeys("H1");Thread.sleep(500);
		AdaniImportsHAWBDate1.click();Thread.sleep(500);
		CurrentDate();Thread.sleep(500);
		AdaniImportsHAWBOrigin1.sendKeys("DXB");Thread.sleep(500);
		AdaniImportsHAWBPackage1.sendKeys("20");Thread.sleep(500);
		AdaniImportsHAWBGrossWeight1.sendKeys("200");Thread.sleep(500);
		AdaniImportsHAWBChargeWeight1.click();Thread.sleep(500);
		AdaniImportsHAWRevdPackage1.sendKeys("20");Thread.sleep(500);
		AdaniImportsHAWBRcvdGrossWeight1.sendKeys("200");Thread.sleep(500);
		AdaniImportsHAWBRcvdChargeWeight1.click();Thread.sleep(500);
		AdaniImportsHAWBDiscription1.sendKeys("H1 Consol");Thread.sleep(500);
	}
	
	public void HAWBDetails1() throws InterruptedException
	{
		AdaniImportsHAWBNumber1.sendKeys("H1");Thread.sleep(500);
		AdaniImportsHAWBDate1.click();Thread.sleep(500);
		CurrentDate();Thread.sleep(500);
		AdaniImportsHAWBOrigin1.sendKeys("DXB");Thread.sleep(500);
		AdaniImportsHAWBPackage1.sendKeys("10");Thread.sleep(500);
		AdaniImportsHAWBGrossWeight1.sendKeys("100");Thread.sleep(500);
		AdaniImportsHAWBChargeWeight1.click();Thread.sleep(500);
		AdaniImportsHAWRevdPackage1.sendKeys("10");Thread.sleep(500);
		AdaniImportsHAWBRcvdGrossWeight1.sendKeys("100");Thread.sleep(500);
		AdaniImportsHAWBRcvdChargeWeight1.click();Thread.sleep(500);
		AdaniImportsHAWBDiscription1.sendKeys("H1 Consol");Thread.sleep(500);
	}
	
	public void HAWBDetails2() throws InterruptedException
	{
		AdaniImportsHAWBNumber2.sendKeys("H2");Thread.sleep(500);
		AdaniImportsHAWBDate2.click();Thread.sleep(500);
		CurrentDate();Thread.sleep(500);
		AdaniImportsHAWBOrigin2.sendKeys("DXB");Thread.sleep(500);
		AdaniImportsHAWBPackage2.sendKeys("10");Thread.sleep(500);
		AdaniImportsHAWBGrossWeight2.sendKeys("100");Thread.sleep(500);
		AdaniImportsHAWBChargeWeight2.click();Thread.sleep(500);
		AdaniImportsHAWRevdPackage2.sendKeys("10");Thread.sleep(500);
		AdaniImportsHAWBRcvdGrossWeight2.sendKeys("100");Thread.sleep(500);
		AdaniImportsHAWBRcvdChargeWeight2.click();Thread.sleep(500);
		AdaniImportsHAWBDiscription2.sendKeys("H2 Consol");Thread.sleep(500);
	}
		
}