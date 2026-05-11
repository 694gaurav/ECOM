package Pages;

import static Helper.BaseObjects.Admin;
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

public class ACS_AdaniAMD_Admin_XPath extends Pages.BasePage {

	public ACS_AdaniAMD_Admin_XPath(WebDriver driver) {
		super(driver);
	
	}
	
	@FindBy(xpath = "(//*[@class='menu'])")
	public WebElement AdminAroprimeMenu;	
	
	@FindBy(xpath = "(//*[text()='Log Out'])")
	public WebElement AdminAroprimeLogout;	

	@FindBy(xpath = "(//*[text()='Admin'][@id='ctl00_btnadmin'])")
	public WebElement AdaniAdminModule;	
	
	@FindBy(xpath = "(//*[text()='Account Credit Request'])")
	public WebElement AdaniAdminDetailsPage;
	
	@FindBy(xpath = "(//*[text()='Account Management'])")
	public WebElement AdaniAdminAccountManagmentTab;
	
	@FindBy(xpath = "(//*[text()='Account'])")
	public WebElement AdaniAdminAccountTab;
	
	@FindBy(xpath = "(//*[text()='Status Update'])")
	public WebElement AdminAccountStatusUpdate;
	
	@FindBy(xpath = "(//*[text()='Credit Update'])")
	public WebElement AdaniAdminAccountManagmentTabCreditUpdae;
	
	@FindBy(xpath = "(//*[text()='Account Ledger'])")
	public WebElement AdaniAdminAccountManagmentTabAccountLedger;
	
	@FindBy(xpath = "(//*[text()='CTO Ledger'])")
	public WebElement AdaniAdminAccountManagmentTabCTOLedger;
	
	@FindBy(xpath = "(//*[text()='Advance Receipts'])")
	public WebElement AdaniAdminAccountManagmentTabAdvanceReceipts;
	
	@FindBy(xpath = "(//*[text()='Refund Receipts'])")
	public WebElement AdaniAdminAccountManagmentTabRefundReceipts;
	
	@FindBy(xpath = "(//*[text()='ACS Receipt Download'])")
	public WebElement AdaniAdminAccountManagmentTabACSReceiptDownload;
	
	@FindBy(xpath = "(//*[text()='User Mgmt'])[1]")
	public WebElement AdaniAdminUserMgmtTab;
	
	@FindBy(xpath = "(//*[text()='User Mgmt'])[2]")
	public WebElement AdaniAdminUserMgmtMenu;
	
	@FindBy(xpath = "(//*[text()='Org. Profile'])")
	public WebElement AdaniAdminOrgProfileTab;
	
	@FindBy(xpath = "(//*[text()='Trade Partner'])[1]")
	public WebElement AdaniAdminTradePartnerTab;
	
	@FindBy(xpath = "(//*[text()='Configuration'])[1]")
	public WebElement AdaniAdminConfigurationTab;
	
	@FindBy(xpath = "(//*[text()='Organisation'])[1]")
	public WebElement AdaniAdminConfigurationTabOrganisationMenu;
	
	@FindBy(xpath = "(//*[text()='AWB Stock'])[1]")
	public WebElement AdaniAdminAWBStockTab;
	
	@FindBy(xpath = "(//*[text()='Threshold'])[1]")
	public WebElement AdaniAdminThresholdTabAWBStockMenu;
	
	@FindBy(xpath = "(//*[text()='PDA Mapping'])[1]")
	public WebElement AdaniAdminPDAMappingTab;

	
// ----------------------- End All Tabs -------------------------------	
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_drpCreditType'])")
	public WebElement AdminCreditRequestCreditTypeDropdown;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtBankName'])")
	public WebElement AdminCreditRequestBankName;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtBranchName'])")
	public WebElement AdminCreditRequestBranchName;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtRefNo'])")
	public WebElement AdminCreditRequestCheckNumber;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtAmount'])")
	public WebElement AdminCreditRequestAmount;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnSubmit'])")
	public WebElement AdminCreditRequestSubmitButton;
	
	@FindBy(xpath = "(//input[@class='blue-butn'])[last()]")
	public WebElement AdminCreditRequestSubmitButtonOkPopup;
	
	// ------------------- End Account credit request --------------------
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_ddlStatus'])")
	public WebElement FinancePDStatus;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdData_ctl02_ddlStatus'])")
	public WebElement FinancePDGridStatus;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnSave'])")
	public WebElement FinancePDGridStatusSaveButton;
	
	// -- -------------------- End Finance ---------------
	
	
	@FindBy(xpath = "(//*[text()=' PD Acc. Report'])")
	public WebElement AdaniAdminAccountLedgerScreenVerify;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_drppda'])")
	public WebElement AdaniAdminAccountLedgerSelectModeDropdown;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtFromDate'])")
	public WebElement AdaniAdminAccountLedgerFromDate;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtToDate'])")
	public WebElement AdaniAdminAccountLedgerToDate;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnViewAccDtls'])")
	public WebElement AdaniAdminAccountLedgerViewButton;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnExcel'])")
	public WebElement AdaniAdminAccountLedgerExportToExcelButton;
	
	@FindBy(xpath = "(//*[@value='Export to PDF'])")
	public WebElement AdaniAdminAccountLedgerExportToPDFButton;
	
	//------------------------- End Account Ledger ---------------------
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_drpReceiptType'])")
	public WebElement AdaniAdminACSReceitTpyeDropdown;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_drppda'])")
	public WebElement AdaniAdminCTOLedgerCTODropdown;
	
	
	// ------------------------- End CTO Ledger -------------------
	
	@FindBy(xpath = "(//*[text()='Advance Receipts'])[2]")
	public WebElement AdaniAdminAdvanceReceiptsPageVerify;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtFromDate'])/parent::td/img")
	public WebElement AdaniAdminAdvanceReceiptFromDate;
	
	@FindBy(xpath = "(//*[@title='Prev'])")
	public WebElement AdaniAdminAdvanceReceiptFromDatePrev;
	
	@FindBy(css = "#ui-datepicker-div > table > tbody > tr:nth-child(4) > td:nth-child(5) > a")
	public WebElement AdaniAdminAdvanceReceiptFromDateSelect1;
	
	@FindBy(css = "#ui-datepicker-div > table > tbody > tr:nth-child(5) > td:nth-child(2) > a")
	public WebElement AdaniAdminAdvanceReceiptFromDateSelect;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_drpCreditType'])")
	public WebElement AdaniAdminAdvanceReceiptCreditTypeDropdown;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnsearch'])")
	public WebElement AdaniAdminAdvanceReceiptSearchButton;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdData_ctl02_lnkViewReceipt'])")
	public WebElement AdaniAdminAdvanceReceiptViewReceiptLink;
	
	//------------------------- End Advance Receipts ----------------------
	
	@FindBy(xpath = "(//*[text()='Refund Receipts'])[2]")
	public WebElement AdaniAdminRefundReceiptPageVerify;
	
	
	// ------------------------- End Refund Receipt --------------------
	
	@FindBy(xpath = "(//*[text()='ACS Receipt Download'])[2]")
	public WebElement AdaniAdminACSReceiptDownloadPageVerify;
	
	@FindBy(xpath = "(//*[text()='Bulk Receipt Download'])")
	public WebElement AdaniAdminACSReceitDownloadModeDropdown;
	
	@FindBy(xpath = "(//*[@value='Download Bulk Receipt'])")
	public WebElement AdaniAdminACSReceitDownloadButton;
	
	@FindBy(xpath = "(//*[@class='GreenBGTheme blue-butn'])")
	public WebElement AdaniAdminACSReceitDateOkPopup;
	
	
	// ------------------------- End ACS Receipt Download -------------------
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnCreateUser'])")
	public WebElement AdminUserMgmtCreateUserButton;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtLoginUserName'])")
	public WebElement AdminUserMgmtUserName;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtContactPersonFirstName'])")
	public WebElement AdminUserMgmtFirstName;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtContactPersonLastName'])")
	public WebElement AdminUserMgmtLastName;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtBusinessEmail'])")
	public WebElement AdminUserMgmtEmailID;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtPhone1'])")
	public WebElement AdminUserMgmtContactNumber;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_ddlBranch'])")
	public WebElement AdminUserMgmtBranchDropdown;
	
	@FindBy(xpath = "(//*[@id='AssignRole'])")
	public WebElement AdminUserMgmtAssignRoleIcon;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_checkAll'])")
	public WebElement AdminUserMgmtSelectAllCheckbox;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_assign'])")
	public WebElement AdminUserMgmtAssignButton;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_ddlBranchAddress'])")
	public WebElement AdminUserMgmtAddressDropdown;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnCreate'])")
	public WebElement AdminUserMgmtSavebutton;
	
	@FindBy(xpath = "(//*[@class='blue-butn' and contains(text(),'Ok')])")
	public WebElement AdminUserMgmtSavebuttonOkPopup;
	
	@FindBy(xpath = "(//*[@title='Reset Password'])[last()]")
	public WebElement AdminUserMgmtResetPassIcon;
	
	@FindBy(xpath = "(//*[text()='Manual Reset'])")
	public WebElement AdminUserMgmtManualReset;
	
	@FindBy(xpath = "(//*[@id='txtResetPassword'])")
	public WebElement AdminUserMgmtManualResetPassTextBox;
	
	@FindBy(xpath = "(//*[@class='blue-butn load' and contains(text(),'Save')])")
	public WebElement AdminUserMgmtManualResetSaveButton;
	
	@FindBy(xpath = "(//*[@class='blue-butn-no-border' and contains(text(),'Cancel')])")
	public WebElement AdminUserMgmtManualResetCancelButton;
	
	@FindBy(xpath = "(//*[@class='btn btn-primary btn-xs toggle-on' and contains(text(),'Active')])[last()]")
	public WebElement AdminUserMgmtManualUserStatusActive;
	
	@FindBy(xpath = "(//*[@class='btn btn-default btn-xs active toggle-off' and contains(text(),'Inactive')])[last()]")
	public WebElement AdminUserMgmtManualUserStatusInactive;
	
	@FindBy(xpath = "(//*[@class='blue-butn' and contains(text(),'Yes')])[last()]")
	public WebElement AdminUserMgmtManualUserStatusPopop;
	
	@FindBy(xpath = "(//*[@class='blue-butn load' and contains(text(),'Ok')])")
	public WebElement AdminUserMgmtManualUserStatusPopopOk;
	
	// --------------------- End User Management -----------------------
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_lblViewOrganizationProfile'])")
	public WebElement AdminOrgProfilePage;
	
	@FindBy(xpath = "(//*[@id='AddRow'])")
	public WebElement AdminOrgProfileAddButton;
	
	@FindBy(xpath = "(//*[@id='txtBranchName'])")
	public WebElement AdminOrgProfileBranchName;
	
	@FindBy(xpath = "(//*[@id='txtBranchCode'])")
	public WebElement AdminOrgProfileBranchCode;
	
	@FindBy(xpath = "(//*[@id='txtBusinessEmailID'])")
	public WebElement AdminOrgProfileEmailID;
	
	@FindBy(xpath = "(//*[@id='txtBusinessContactNo'])")
	public WebElement AdminOrgProfileContactNumber;
	
	@FindBy(xpath = "(//*[@id='lnkAddBranch'])")
	public WebElement AdminOrgProfileAddAddressLink;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtStreetAddress1'])")
	public WebElement AdminOrgProfileAddressStreet1;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtZip'])")
	public WebElement AdminOrgProfileAddressZipCode;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_GenericAutoFillCountry_txtCode'])")
	public WebElement AdminOrgProfileAddressCountryCode;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_GenericAutoFillState_txtCode'])")
	public WebElement AdminOrgProfileAddressStateCode;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_GenericAutoFillCity_txtCode'])")
	public WebElement AdminOrgProfileAddressCityCode;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_lblSub'])")
	public WebElement AdminOrgProfileAddressSubmit;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_lblSaveCreate'])")
	public WebElement AdminOrgProfileSaveButton;
	
	@FindBy(xpath = "(//*[@class='GreenBGTheme blue-butn'])[last()]")
	public WebElement AdminOrgProfileSaveButtonOkPopup;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_lblEdit'])")
	public WebElement AdminOrgProfileEditButton;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtOrgZip'])")
	public WebElement AdminOrgProfileZipCodeUpdate;
	
	@FindBy(xpath = "(//*[@id='txtBranchNameEdit'])[last()]")
	public WebElement AdminOrgProfileBranchNameUpdate;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_lblSave'])")
	public WebElement AdminOrgProfileSaveUpdate;
	
	// -------------------  End Org Profile ----------------- 
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_lbltradepartner'])")
	public WebElement AdminTradePartnerPage;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_lbladdrow'])")
	public WebElement AdminTradePartnerAddButton;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_ddlRelationType'])[2]")
	public WebElement AdminTradePartnerRelationship;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_ddlOrganizationType'])[2]")
	public WebElement AdminTradePartnerOrgType;
	
	@FindBy(xpath = "(//*[@name='ctl00$hldPage$ctl00' and contains (@class,'txtOrg input-txt-box')])[2]")
	public WebElement AdminTradePartnerOrgName;
	
	@FindBy(xpath = "(//*[@src='../Images/ACS_Icon/ACS_Icon_SaveEnabled.png'])")
	public WebElement AdminTradePartnerSaveIcon;
	
	@FindBy(xpath = "(//*[@src='../Images/BIAL_Icon/icon_edit.png'])[position()=1]")
	public WebElement AdminTradePartnerEditIcon;
	
	@FindBy(xpath = "(//*[@src='../Images/BIAL_Icon/icon_delete.png'])[position()=1]")
	public WebElement AdminTradePartnerDeleteIcon;
	
	@FindBy(xpath = "(//*[@class='blue-butn' and contains(text(),'Delete')])")
	public WebElement AdminTradePartnerDeletePopup;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_lblok'])")
	public WebElement AdminTradePartnerSaveOkPopup;
	
	// -------------------- End Trade Partner -------------------
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_lblconfiguration'])")
	public WebElement AdaniAdminConfigurationPage;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtInterval'])")
	public WebElement AdaniAdminConfigurationPasswordExperyTextBox;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnSaveChanges'])")
	public WebElement AdaniAdminConfigurationSaveButton;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnCloseDialog'])")
	public WebElement AdaniAdminConfigurationSaveButtonOk;
	
	//----------------------- End Organization ---------------------
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_lblstock'])")
	public WebElement AdaniAdminThresholdPage;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grvStockBranchMappings_ctl02_txtThreshold'])")
	public WebElement AdaniAdminThresholdQtyTextBox;
	
	// --------------- AWB Stock -----------------
	
	@FindBy(xpath = "(//*[@id='hprISTEmailRegistration'])")
	public WebElement AdaniNewRegHyperLink;
	
	@FindBy(xpath = "(//*[@for='ctl00_hldPageHeader_ChkBxLstBusinessLines_1'])")
	public WebElement AdaniNewRegBussLineFF;
	
	@FindBy(xpath = "(//*[@for='ctl00_hldPageHeader_ChkBxLstBusinessLines_4'])")
	public WebElement AdaniNewRegBussLineCB;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_txtCompanyName'])")
	public WebElement AdaniNewRegOrgName;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_txtBusinessEmail'])")
	public WebElement AdaniNewRegBussID;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_txtPhone1'])")
	public WebElement AdaniNewRegCntNumber;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_txtAddressLine1'])")
	public WebElement AdaniNewRegAddress;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_txtPinCode'])")
	public WebElement AdaniNewRegPinCode;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_GenericAutoFillCountry_txtCode'])")
	public WebElement AdaniNewRegCountryCode;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_GenericAutoFillCity_txtCode'])")
	public WebElement AdaniNewRegCityCode;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_txtContactPersonUserName'])")
	public WebElement AdaniNewRegUserName;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_txtContactPersonFirstName'])")
	public WebElement AdaniNewRegFirstName;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_txtContactPersonLastName'])")
	public WebElement AdaniNewRegLastName;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_txtContactPersonEmailId'])")
	public WebElement AdaniNewRegEmailID;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_txtMobileNo'])")
	public WebElement AdaniNewRegMobNumber;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_ddlGSTRegStatus'])")
	public WebElement AdaniNewRegStatus;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_GenericAutoFillStateGst_txtCode'])")
	public WebElement AdaniNewRegStateCode;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_txtGSTNID'])")
	public WebElement AdaniNewRegGSTNNumber;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_txtForwarderAcctDetIATAReg'])")
	public WebElement AdaniNewRegIATANumber;
	
	@FindBy(xpath = "(//*[@src='../Images/BIAL_Icon/icon_calendar.png'])[1]")
	public WebElement AdaniNewRegIATARegDate;
	
	@FindBy(css = "#ui-datepicker-div > table > tbody > tr:nth-child(1) > td.ui-datepicker-days-cell-over.ui-datepicker-today > a")
	public WebElement AdaniNewRegTodayDate1;
	
	@FindBy(css = "#ui-datepicker-div > table > tbody > tr:nth-child(2) > td.ui-datepicker-days-cell-over.ui-datepicker-today > a")
	public WebElement AdaniNewRegTodayDate2;
	
	@FindBy(css = "#ui-datepicker-div > table > tbody > tr:nth-child(3) > td.ui-datepicker-days-cell-over.ui-datepicker-today > a")
	public WebElement AdaniNewRegTodayDate3;
	
	@FindBy(css = "#ui-datepicker-div > table > tbody > tr:nth-child(4) > td.ui-datepicker-days-cell-over.ui-datepicker-today > a")
	public WebElement AdaniNewRegTodayDate4;
	
	@FindBy(css = "#ui-datepicker-div > table > tbody > tr:nth-child(5) > td.ui-datepicker-days-cell-over.ui-datepicker-today > a")
	public WebElement AdaniNewRegTodayDate5;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_txtCHAAccDetCustLicNo'])")
	public WebElement AdaniNewRegPANNumber;
	
	@FindBy(xpath = "(//*[@src='../Images/BIAL_Icon/icon_calendar.png'])[2]")
	public WebElement AdaniNewRegLicExpiryDate;
	
	@FindBy(xpath = "(//*[text()='Next'])")
	public WebElement AdaniNewRegLicExpiryDateNext;
	
	@FindBy(css = "#ui-datepicker-div > table > tbody > tr:nth-child(1) > td:nth-child(4) > a")
	public WebElement AdaniNewRegExpiryDate1;
	
	@FindBy(css = "#ui-datepicker-div > table > tbody > tr:nth-child(2) > td:nth-child(4) > a")
	public WebElement AdaniNewRegExpiryDate2;
	
	@FindBy(css = "#ui-datepicker-div > table > tbody > tr:nth-child(3) > td:nth-child(4) > a")
	public WebElement AdaniNewRegExpiryDate3;
	
	@FindBy(css = "#ui-datepicker-div > table > tbody > tr:nth-child(4) > td:nth-child(4) > a")
	public WebElement AdaniNewRegExpiryDate4;
	
	@FindBy(css = "#ui-datepicker-div > table > tbody > tr:nth-child(5) > td:nth-child(4) > a")
	public WebElement AdaniNewRegExpiryDate5;
	
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_chkAgree'])")
	public WebElement AdaniNewRegCheckBox;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_btnNext'])")
	public WebElement AdaniNewRegSubmitButton;
	
	
	
	// ------------------- New Registration -------------
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdReceivedRequest_ctl02_LnkOrgID'])")
	public WebElement AdaniAdminOrgName;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnApprove'])")
	public WebElement AdaniAdminApproveButton;
	
	// ---------------- Admin Login -----------------
	
	@FindBy(xpath = "(//button[text()='Add PDA Account'])")
	public WebElement AdminPDAMappingAddButton;
	
	@FindBy(xpath = "(//*[@src='../Images/BIAL_Icon/icon_upload.png'])[last()]")
	public WebElement AdminPDAMappingeDocketIcon;
	
	@FindBy(xpath = "(//*[@src='../Images/BIAL_Icon/icon_edocket.png'])")
	public WebElement AdminPDAMappingeDocketIcon1;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_fuctlUploadDocs'])")
	public WebElement AdminPDAMappingBrowseButton;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnClear'])")
	public WebElement AdminPDAMappingClearButton;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnUploadSave'])")
	public WebElement AdminPDAMappingUploadButton;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnuploadsave1'])")
	public WebElement AdminPDAMappingSavepoup;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_rptUploadedDocument_ctl01_lnkDoc'])")
	public WebElement AdminPDAMappingDownloadButton;
	
	@FindBy(xpath = "(//button[@class='ui-button ui-corner-all ui-widget' and contains(text(),'Close')])")
	public WebElement AdminPDAMappingUploadButtonClosePopup;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_divCB'])[2]/div/div[1]")
	public WebElement AdminPDAMappingCTO;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_divCB'])[2]/div[2]/input")
	public WebElement AdminPDAMappingCTOSearch;
	
	@FindBy(xpath = "(//*[text()='Kale_GHA1'])[2]/parent::span/input")
	public WebElement AdminPDAMappingCTOKaleGHA1;
	
	@FindBy(xpath = "(//*[text()='Kale_GHA2'])[2]/parent::span/input")
	public WebElement AdminPDAMappingCTOKaleGHA2;
	
	@FindBy(xpath = "(//input[@class='input-txt-box'])[2]")
	public WebElement AdminPDAMappingOrgSearch;
	
	@FindBy(xpath = "(//button[@id='btnSubmit'])")
	public WebElement AdminPDAMappingSubmitButton;
	
	@FindBy(xpath = "(//*[@src='../Images/BIAL_Icon/icon_delete.png'])[2]")
	public WebElement AdminPDAMappingDeleteIcon;
	
	@FindBy(xpath = "(//button[@id='btnCancel'])")
	public WebElement AdminPDAMappingCancelButton;
	
	//--------------- End PDA Mapping -------------------
	
	@FindBy(xpath = "(//input[@value='Cancel'])[6]")
	public WebElement AdminTSPCancelButton1;
	
	@FindBy(xpath = "(//input[@value='Cancel'])[7]")
	public WebElement AdminTSPCancelButton2;
	
	@FindBy(xpath = "(//input[@id='ctl00_hldPage_btnBack'])")
	public WebElement AdminTSPBackButton;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_ddlTSPPayMethodPDA'])")
	public WebElement AdminTSPMethodPopup;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_ddlTSPPayMethodPDAAgents'])")
	public WebElement AdminTSPMethodTradePartner;
	
	@FindBy(xpath = "(//a[@id='ctl00_hldPage_grdMAWB_ctl02_lnkMAWBTSPAmount'])")
	public WebElement AdminTSPMilestoneLink;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_ibtnPrint'])")
	public WebElement AdminTSPMilestonePrintButton;
	
	// ------------------------------
	
	public void CurrentDate() throws InterruptedException
	{
		try
		{
			AdaniNewRegTodayDate1.click();Thread.sleep(1000);
		}
		catch (Exception E)
		{
			System.out.println("Not 1st Week");
		}
		
		try
		{
			AdaniNewRegTodayDate2.click();Thread.sleep(1000);
		}
		catch (Exception E)
		{
			System.out.println("Not 2nd Week");
		}
		
		try
		{
			AdaniNewRegTodayDate3.click();Thread.sleep(1000);
		}
		catch (Exception E)
		{
			System.out.println("Not 3rd Week");
		}
		
		try
		{
			AdaniNewRegTodayDate4.click();Thread.sleep(1000);
		}
		catch (Exception E)
		{
			System.out.println("Not 4th Week");
		}
		
		try
		{
			AdaniNewRegTodayDate5.click();Thread.sleep(1000);
		}
		catch (Exception E)
		{
			System.out.println("Not 5th Week");
		}
	}
	

	public void ExpiryDate() throws InterruptedException
	{
		try
		{
			AdaniNewRegExpiryDate1.click();Thread.sleep(1000);
		}
		catch (Exception E)
		{
			System.out.println("Not 1st Week");
		}
		
		try
		{
			AdaniNewRegExpiryDate2.click();Thread.sleep(1000);
		}
		catch (Exception E)
		{
			System.out.println("Not 2nd Week");
		}
		
		try
		{
			AdaniNewRegExpiryDate3.click();Thread.sleep(1000);
		}
		catch (Exception E)
		{
			System.out.println("Not 3rd Week");
		}
		
		try
		{
			AdaniNewRegExpiryDate4.click();Thread.sleep(1000);
		}
		catch (Exception E)
		{
			System.out.println("Not 4th Week");
		}
		
		try
		{
			AdaniNewRegExpiryDate5.click();Thread.sleep(1000);
		}
		catch (Exception E)
		{
			System.out.println("Not 5th Week");
		}
	}
}