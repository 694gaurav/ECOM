package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ECOM_Outbound extends Pages.BasePage {
	public ECOM_Outbound(WebDriver driver) {
		super(driver);
	
	}
	
	@FindBy(xpath="//a[@id='clsPop']/i")
	public WebElement ECOM_Popup;
	@FindBy(xpath="//input[@id='ctl00_hldPage_btnCTOYes']")
	public WebElement CTO_PopupBtn;
	@FindBy(xpath="//a[contains(text(),'e-AWB')]")
	public WebElement eAWB_Tab;
	@FindBy(xpath="//a[@id='ctl00_siteWide_topmenucontainer_ctl03_Repeater1_ctl02_HyperLink2']")
	public WebElement CreateAWB_Hyperlink;	
	@FindBy(xpath="//input[@id='ctl00_hldPage_txtDestAirport']")
	public WebElement Dest_Tb;	
	@FindBy(xpath="//input[@id='ctl00_hldPage_txtCarrier1']")
	public WebElement FlightPfx_Tb;	
	@FindBy(xpath="//input[@id='ctl00_hldPage_txtflightno1']")
	public WebElement Flight_Tb;	
	@FindBy(xpath="//input[@id='ctl00_hldPage_txtConsigneeDOM']")
	public WebElement Consignee_Tb;	
	@FindBy(xpath="//img[@id='AddConsigneebtnDOM_1']")
	public WebElement AddConsignee_Icon;	

	@FindBy(xpath="//a[@id='ctl00_hldPage_grdMAWB_ctl02_hrefCopyMAWB']/img")
	public WebElement CopyAWB_Icon;
	@FindBy(xpath="//input[@id='ctl00_hldPage_btnYesCopyAWB']")
	public WebElement CopyYes_Btn;
	@FindBy(xpath="//input[@id='ctl00_hldPage_txtAWBPrefix']")
	public WebElement CopyAwbPfx_Tb;
	@FindBy(xpath="//input[@id='ctl00_hldPage_txtAWBNo']")
	public WebElement CopyAwb_Tb;
	@FindBy(xpath="//input[@id='ctl00_hldPage_txtMasterNoOfPkg']")
	public WebElement AwbNOP_Tb;
	@FindBy(xpath="//input[@id='ctl00_hldPage_chkEcommerce']")
	public WebElement Ecom_Cb;
	@FindBy(xpath="//input[@id='ctl00_hldPage_txtMasterNoOfPkg']")
	public WebElement EcomNOP_Tb;
	@FindBy(xpath="//input[@id='ctl00_hldPage_txtMasterGrossWeight']")
	public WebElement EcomGrWt_Tb;
	@FindBy(xpath="(//img[@id='addDimensions_1'])[1]")
	public WebElement EcomBagDimension_Icon;
	@FindBy(xpath="(//button[contains(text(),'Ok')])[5]")
	public WebElement OkDimension_PopupBtn;
	@FindBy(xpath="//select[@id='ctl00_hldPage_ddlCargoTypeDOM']")
	public WebElement CargoType_DD;
	@FindBy(xpath="//select[@id='ctl00_hldPage_ddlCommodityTypeDOM']")
	public WebElement CommodityType_DD;
	@FindBy(xpath="//input[@id='ctl00_hldPage_btnSaveAwb']")
	public WebElement SaveAWB_Btn;
	@FindBy(xpath="//input[@id='ctl00_hldPage_btnCHANo']")
	public WebElement OkSavedAWB_Btn;
	
	@FindBy(xpath="(//img[@class='ui-datepicker-trigger'])[1]")
	public WebElement FlightDate_Icon;
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']/tbody//tr[1]/td/a")
	public List<WebElement> FlightDate_Calendar;

	@FindBy(xpath="//img[@id='addrow_1']")
	public WebElement AddBag_Icon;
	@FindBy(xpath="(//button[@type='button'][contains(text(),'Yes')])[1]")
	public WebElement ProceedAddBag_Btn;

	@FindBy(xpath="//input[@id='txtNoPcs_1']")
	public WebElement DimensionNOP1_Tb;
	@FindBy(xpath="//input[@id='txtNoPcs_2']")
	public WebElement DimensionNOP2_Tb;
	
	@FindBy(xpath="//input[@id='txtLength_2']")
	public WebElement Length1_Tb;
	@FindBy(xpath="//input[@id='txtWidth_2']")
	public WebElement Width1_Tb;
	@FindBy(xpath="//input[@id='txtHeight_2']")
	public WebElement Height1_Tb;
	
	
	@FindBy(xpath="//input[@id='txtLength_1']")
	public WebElement Length2_Tb;
	@FindBy(xpath="//input[@id='txtWidth_1']")
	public WebElement Width2_Tb;
	@FindBy(xpath="//input[@id='txtHeight_1']")
	public WebElement Height2_Tb;
	
	@FindBy(xpath="//input[@id='txtBagNo_1']")
	public WebElement BagPiece1_Tb;
	@FindBy(xpath="//input[@id='txtGrosswt_1']")
	public WebElement BagWeight1_Tb;

	@FindBy(xpath="//input[@id='txtBagNo_2']")
	public WebElement BagPiece2_Tb;
	@FindBy(xpath="//input[@id='txtGrosswt_2']")
	public WebElement BagWeight2_Tb;

	@FindBy(xpath="//input[@id='txtBagNo_3']")
	public WebElement BagPiece3_Tb;
	@FindBy(xpath="//input[@id='txtGrosswt_3']")
	public WebElement BagWeight3_Tb;
	@FindBy(xpath="(//button[@type='button'][contains(text(),'Ok')])[5]")
	public WebElement DimensionOK_Btn;

	//AWB ASI
	@FindBy(xpath="//input[@id='ctl00_hldPage_grdMAWB_ctl02_lnkASI']")
	public WebElement AWB_ASI_Icon;	
	@FindBy(xpath="//input[@id='btnASIProceedNew']")
	public WebElement ProceedAWB_Btn;	
	@FindBy(xpath="//input[@id='ctl00_hldPage_btnASIYesNew']")
	public WebElement YesASI_Confirmation_Btn;	
	@FindBy(xpath="//input[@id='ctl00_hldPage_Button4'][@value='Ok']")
	public WebElement SentASI_Ok_Btn;
	@FindBy(xpath="//input[@id='ctl00_hldPage_grdMAWB_ctl02_hreApprovedCO']")
	public WebElement ApprovedCO_Icon;
	@FindBy(xpath="//input[@id='ctl00_hldPage_btnASIProceed']")
	public WebElement ProceedWdoAWB_Btn;
	@FindBy(xpath="//input[@id='ctl00_hldPage_btnASIOK']")
	public WebElement OkAsiWdo_Btn;

	
	//CO
	@FindBy(xpath="(//h5[contains(text(),'Carting Order (CO) Request')])[2]")
	public WebElement CO_Request_Popup;	
	@FindBy(xpath="//input[@id='ctl00_hldPage_btnRequestCartingOrder']")
	public WebElement YesCO_Request_Btn;	
	@FindBy(xpath="//input[@id='ctl00_hldPage_btnCORreq']")
	public WebElement OkCO_Request_Btn;
	@FindBy(xpath="//input[@id='ctl00_hldPage_btnCHANo']")
	public WebElement OkResubmitASI_Btn;

	
	//Airline
	@FindBy(xpath="(//a[contains(text(),'CO Approval')])[1]")
	public WebElement COapproval_Tab;
	@FindBy(xpath="//input[@id='ctl00_hldPage_txtAWBNo']")
	public WebElement ApproveAWBsearch_Tb;
	@FindBy(xpath="//input[@id='ctl00_hldPage_btnSearch']")
	public WebElement ApproveAWBsearch_Btn;
	
	@FindBy(xpath="//img[@id='ctl00_hldPage_AirLineHome_ctl02_imgAction']")
	public WebElement COapprove_Icon;
	@FindBy(xpath="//input[@id='ctl00_hldPage_txtFlightNo']")
	public WebElement ApproveFlightNo_Tb;

	@FindBy(xpath="//input[@id='ctl00_hldPage_btnSubmit']")
	public WebElement COapprove_Btn;
	@FindBy(xpath="//input[@id='ctl00_hldPage_btnYesCO']")
	public WebElement Yesapprove_Btn;
	@FindBy(xpath="//input[@id='ctl00_hldPage_Button1']")
	public WebElement Okapprove_Btn;
	@FindBy(xpath="(//a[contains(text(),'Reports')])[1]")
	public WebElement Reports_Tab;
	@FindBy(xpath="//a[@id='ctl00_siteWide_topmenucontainer_ctl07_Repeater1_ctl03_HyperLink2'][contains(text(),'IDG Report')]")
	public WebElement IdgReport_Hyperlink;
	@FindBy(xpath="//input[@id='ctl00_hldPage_Button1']")
	public WebElement ExportIDG_Btn;
	
	@FindBy(xpath="//input[@id='ctl00_hldPage_grdMAWB_ctl02_hrefCreateBIALTSP']")
	public WebElement TSP_Icon;
	@FindBy(xpath="//input[@id='ctl00_hldPage_txtHSNCode']")
	public WebElement TspHSN_Code_Tb;
	@FindBy(xpath="//input[@id='ctl00_hldPage_txtTransPassword']")
	public WebElement TspTransactionPwd_Tb;
	@FindBy(xpath="//input[@id='ctl00_hldPage_btnPayNow']")
	public WebElement TspPayNow_Btn;
	@FindBy(xpath="//input[@id='ctl00_hldPage_btnTSPConfirm']")
	public WebElement YesTsp_Btn;
	@FindBy(xpath="//input[@id='ctl00_hldPage_btnGenerateTokenFromTSPConfirm']")
	public WebElement TspToken_Btn;
	
	@FindBy(xpath="//input[@id='ctl00_hldPage_grdMAWB_ctl01_txtFilter3']")
	public WebElement AWB_Filter;
	@FindBy(xpath="//input[@id='ctl00_hldPage_grdMAWB_ctl01_imgFilterOperator3']")
	public WebElement AwbFilter_Icon;
	@FindBy(xpath="//a[@id='filterMenucontains']/img")
	public WebElement AwbFilterContains_Hyperlink;

	@FindBy(xpath="//a[@id='ctl00_hldPage_grdMAWB_ctl02_hrfEditQuickASI']/img")
	public WebElement EditAWB1_Icon;
	@FindBy(xpath="//table[@id='ctl00_hldPage_grdMAWB']//tr/td[22]/a[1]")
	public List<WebElement> EditAWB_Icon;

	@FindBy(xpath="//img[@id='AddShipperbtnDOM_1']")
	public WebElement AddShipper_Icon;
	@FindBy(xpath="//div[@id='divBusinessDetails']/table[2]//input[@id='ctl00_hldPage_txtCompanyName'][@class='createbol-txtbox']")
	public WebElement ShipperName_Tb;
    @FindBy(xpath="//input[@id='ctl00_hldPage_btnSaveShipConsignee']")
	public WebElement SaveShipper_Btn;
    @FindBy(xpath="(//button[@type='button'][contains(text(),'Ok')])[4]")
	public WebElement OkShipper_Btn;
    
    @FindBy(xpath="//input[@id='ctl00_hldPage_grdMAWB_ctl02_lnkVTNoMAWBWise']")
	public WebElement VehicleToken_Icon;
    @FindBy(xpath="//input[@id='txtVehNo']")
	public WebElement VehicleNo_Tb;
    @FindBy(xpath="//input[@id='txtDriverLicNo']")
	public WebElement DriverLicenseNo_Tb;
    @FindBy(xpath="//input[@id='txtDriverName']")
	public WebElement DriverName_Tb;
    @FindBy(xpath="//input[@id='txtDriverMobNo']")
	public WebElement DriverMobileno_Tb;
    @FindBy(xpath="//input[@id='txtAgentMobNo']")
	public WebElement AgentMobileno_Tb;
    @FindBy(xpath="//input[@id='txtRemarks']")
	public WebElement TokenRemarks_Tb;
    @FindBy(xpath="//table[@id='tblVehicleTokenDetails']//tbody/tr[1]//input[@id='txtNOP']")
   	public WebElement NOP1_Tb;
    @FindBy(xpath="//table[@id='tblVehicleTokenDetails']//tbody/tr[1]//input[@id='txtGrossWt']")
   	public WebElement GrossWeight1_Tb;
       
    @FindBy(xpath="//input[@id='ctl00_hldPage_btnSaveAwb']")
	public WebElement GenerateToken_Btn;
    @FindBy(xpath="//input[@value='Ok']")
	public WebElement GenerateTokenOk_Btn;

    @FindBy(xpath="//table[@id='ctl00_hldPage_grdMAWBWiseShipments']//tr/td[1]/input[1]")
    public List<WebElement> AddShipment_Cb;
    @FindBy(xpath="//input[@id='AddShipment']")
   	public WebElement AddTokenShipment_Btn;
    @FindBy(xpath="//input[@id='ctl00_hldPage_btnAssign']")
   	public WebElement AddSelectedShipment_Btn;

    @FindBy(xpath="//img[@id='AddRow']")
	public WebElement AddToken_Icon;
    @FindBy(xpath="//table[@id='tblVehicleTokenDetails']//tbody/tr[2]//input[@id='txtVehNo']")
	public WebElement VehicleNo2_Tb;
    @FindBy(xpath="//table[@id='tblVehicleTokenDetails']//tbody/tr[2]//input[@id='txtDriverLicNo']")
	public WebElement DriverLicenseNo2_Tb;
    @FindBy(xpath="//table[@id='tblVehicleTokenDetails']//tbody/tr[2]//input[@id='txtDriverName']")
	public WebElement DriverName2_Tb;
    @FindBy(xpath="//table[@id='tblVehicleTokenDetails']//tbody/tr[2]//input[@id='txtDriverMobNo']")
	public WebElement DriverMobileno2_Tb;
    @FindBy(xpath="//table[@id='tblVehicleTokenDetails']//tbody/tr[2]//input[@id='txtAgentMobNo']")
	public WebElement AgentMobileno2_Tb;
    @FindBy(xpath="//span[@id='txtTotalSBNOP']")
	public WebElement AWBnop_Tb;
    @FindBy(xpath="//table[@id='tblVehicleTokenDetails']//tbody/tr[2]//input[@id='txtNOP']")
	public WebElement NOP2_Tb;
    @FindBy(xpath="//table[@id='tblVehicleTokenDetails']//tbody/tr[2]//input[@id='txtGrossWt']")
	public WebElement GrossWeight2_Tb;
    @FindBy(xpath="//table[@id='tblVehicleTokenDetails']//tbody/tr[2]//input[@id='txtRemarks']")
	public WebElement TokenRemarks2_Tb;

    @FindBy(xpath="//input[@id='ctl00_hldPage_grdMAWB_ctl02_ImgAWBQRCodeGen']")
	public WebElement PrintAWB_Icon;
    @FindBy(xpath="//input[@id='ctl00_hldPage_rdRollPaper']")
	public WebElement RollPaper_Rdb;
    @FindBy(xpath="//input[@id='ctl00_hldPage_chkOptionalInfo']")
	public WebElement IncludeInfo_Cb;

    @FindBy(xpath="//input[@id='ctl00_hldPage_txtNoofLabel']")
	public WebElement LabelCopies_Tb;
    @FindBy(xpath="//input[@id='ctl00_hldPage_txtFromPieces']")
	public WebElement LabelFrom_Tb;
    @FindBy(xpath="//input[@id='ctl00_hldPage_txtToPieces']")
	public WebElement LabelTo_Tb;
    @FindBy(xpath="//input[@id='ctl00_hldPage_btnPrint']")
	public WebElement PrintAWB_Btn;
    
    @FindBy(xpath="//input[@name='ctl00$hldPage$AWBcargo$fuctlLoadFilePath']")
	public WebElement UploadBagPieces_Btn;
    @FindBy(xpath="//input[@id='ctl00_hldPage_AWBcargo_btnuploadBag']")
	public WebElement UploadPieces_Btn;
    @FindBy(xpath="//button[@class='GreenBGTheme blue-butn'][contains(text(),'Ok')]")
	public WebElement BagUploadOk_Btn;

    //eDocket
    @FindBy(xpath="//iframe[@id='IframEdocket1']")
    public WebElement iframe;
    @FindBy(xpath="//iframe[@id='IframAddShipmentsonVT']")
    public WebElement Shipment_iframe;
    @FindBy(xpath="//iframe[@id='IframConsignee']")
    public WebElement Consignee_iframe;
    @FindBy(xpath="//div[@id='ctl00_containerfluidDivid2']//div[@id='ctl00_hldPage_uplShipCons']//input[@id='ctl00_hldPage_btnSaveShipConsignee']")
    public WebElement SaveConsignee_Btn;
    @FindBy(xpath="//td[@id='ctl00_hldPage_idconsignee']//table//tr//td[2]//input[@id='ctl00_hldPage_txtSearchConsigneeName'][@class='createbol-txtbox']")
    public WebElement ConsigneeName_Tb;
    @FindBy(xpath="//li[@class='ui-menu-item']/div")
    public WebElement ConsigneeName_List;

    @FindBy(xpath="//div[@aria-describedby='addConsignee'][2]/div[3]//button[1]")
    public WebElement ConsigneeOk_Btn;


    @FindBy(xpath="//input[@id='ctl00_hldPage_grdMAWB_ctl02_imgDocket']")
	public WebElement eDocket_Icon;
    @FindBy(xpath="//select[@id='ctl00_hldPage_ddlistDocTemplates']")
	public WebElement SelectDocument1_DD;    
    @FindBy(xpath="//input[@id='ctl00_hldPage_fuctlUploadDocs']")
	public WebElement ChooseFile1_Btn;
    @FindBy(xpath="//select[@id='ctl00_hldPage_ddlistDocTemplates1']")
	public WebElement SelectDocument2_DD;
    @FindBy(xpath="//input[@id='ctl00_hldPage_fuctlUploadDocs1']")
	public WebElement ChooseFile2_Btn;    
    @FindBy(xpath="//input[@id='ctl00_hldPage_btnUploadSave']")
	public WebElement eDocketUpload_Btn;
    @FindBy(xpath="//input[@id='ctl00_hldPage_btnSubmit']")
	public WebElement eDocketSubmit_Btn;
    @FindBy(xpath="//input[@id='ctl00_hldPage_rptCSDUploadedDocument_ctl00_chkRecordAll']")
	public WebElement eDocketRecord_Cb;
    @FindBy(xpath="//div[@id='ctl00_divLeftPan']//div[@id='divSuccessAlert']//input[@class='GreenBGTheme blue-butn']")
	public WebElement eDocketOk_Btn;
    @FindBy(xpath="//input[@id='ctl00_hldPage_rblCTO_2']")
	public WebElement CTO_Rdb;
    @FindBy(xpath="//select[@id='ctl00_hldPage_ddlCustodianName']")
	public WebElement CTO_DD;

    @FindBy(xpath="//img[@id='ibtnDel_2']")
	public WebElement DeleteDimension_Icon;

	//Logout
	@FindBy(xpath="//span[@class='caret red']")
	public WebElement Logout_Icon;
	@FindBy(xpath="//a[@id='ctl00_LinkButton6']")
	public WebElement Logout_Hyperlink;
	@FindBy(xpath="//a[@id='customerHeader1_uxlnkbtnlogout']")
	public WebElement GalaxyLogout_Icon;

	
	//VCT 
	@FindBy(xpath="//input[@id='ctl00_cp_txtVCTNo']")
	public WebElement VCT_Tb;
	
	
	@FindBy(xpath="//input[@id='ctl00_cp_uxbtnDockIn']")
	public WebElement DockIn_Btn;
	@FindBy(xpath="//table[@id='ctl00_cp_uxGrdVCTShipments']//tr//input[1][@type='checkbox']")
	public List<WebElement> CargoVCT_Cb;
	@FindBy(xpath="//table[@id='ctl00_cp_tc_tab1_ctl00_grdVCTList']//tr[3]/td[1]")
	public WebElement VCTno_List;
	@FindBy(xpath="//span[@id='__tab_ctl00_cp_tc_tab2']")
	public WebElement Details_Tab;
	@FindBy(xpath="//a[contains(text(),'VCT')]")
	public WebElement VCT_Tab;
	@FindBy(xpath="//span[contains(text(),'VCT Generation')]")
	public WebElement VctGeneration_Tab;

	@FindBy(xpath="//span[contains(text(),'VCT Acceptance')]")
	public WebElement VctAccpt_Tab;
	@FindBy(xpath="//select[@id='ctl00_cp_ddlDoor_fmsGenericDropDownList']")
	public WebElement Door_DD;
	@FindBy(xpath="//input[@id='ctl00_cp_uxSTDT_uxTime']")
	public WebElement DockIn_Tb;
	@FindBy(xpath="//input[@id='ctl00_cp_uxbtnSubmit']")
	public WebElement AcceptCargo_Btn;
	@FindBy(xpath="//input[@id='ctl00_cp_uxbtnComplete']")
	public WebElement CompleteAccpt_Btn;
	@FindBy(xpath="//table[@id='ctl00_cp_uxGrdVCTShipments']//tr[2]/td[5]")
	public WebElement RemainingNOP_Lbl;
	@FindBy(xpath="//input[@id='ctl00_cp_rptPopVol_ctl01_txtNOP']")
	public WebElement AwbNOP1_Tb;
	@FindBy(xpath="//input[@id='ctl00_cp_rptPopVol_ctl01_txtLength']")
	public WebElement AwbLength1_Tb;
	@FindBy(xpath="//input[@id='ctl00_cp_rptPopVol_ctl01_txtWidth']")
	public WebElement AwbWidth1_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_rptPopVol_ctl01_txtHeight']")
	public WebElement AwbHeight1_Tb;

    @FindBy(xpath="//input[@id='ctl00_hldPage_grdMAWB_ctl02_imgbtnSIR']")
	public WebElement SIR_Icon;
    @FindBy(xpath="//a[contains(text(),'Exports')]")
	public WebElement Exports_Tab;
    @FindBy(xpath="//div[@id='4as']/ul[@class='menulink']//span[contains(text(),'Export AWB Amendment')]")
	public WebElement ExportAwbAmendment_Tab;
    @FindBy(xpath="//input[@id='ctl00_cp_TabContainer1_tp1_ctl00_tc_tpAWBDeatils_ctl00_FMStxtRef1']")
    public WebElement AwbAmendment_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_TabContainer1_tp1_ctl00_tc_tpAWBDeatils_ctl00_uxbtnSearch']")
    public WebElement SearchAwbAmendment_Tb;
    @FindBy(xpath="//input[@value='Bag Details']")
    public WebElement BagDetails_Btn;
    @FindBy(xpath="//table[@id='ctl00_cp_gvbagdetail']//tr/td[8]/input")
    public List<WebElement> AddAmendBag_Icon;
    @FindBy(xpath="//input[@id='ctl00_cp_gvbagdetail_ctl05_uxBagNo']")
    public WebElement BagNo4_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gvbagdetail_ctl05_uxGrossWt']")
    public WebElement BagGrWt4_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxBtnSave']")
    public WebElement SaveAmendBag_Btn;
    @FindBy(xpath="//input[@id='ctl00_cp_TabContainer1_tp1_ctl00_tc_tpAWBDeatils_ctl00_gvCommodityDetails_ctl02_gC_Number']")
    public WebElement ChWtBag_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_TabContainer1_tp1_ctl00_tc_tpAWBDeatils_ctl00_btnSubmit']")
    public WebElement SaveChWt_Btn;
    @FindBy(xpath="//span[contains(text(),'Security Acceptance')]")
    public WebElement SecurityAccpt_Tab;
    @FindBy(xpath="//span[@id='__tab_ctl00_cp_tc_tp2']")
    public WebElement AccptDetails_Tab;
    @FindBy(xpath="//div[@id='4as']//a[@id='Submenu_more']/img")
    public WebElement ExportMore_Icon;
    @FindBy(xpath="//div[@id='4as']/ul[@class='menulink']//span[contains(text(),'Back To Town')]")
    public WebElement BackToTown_Hyperlink;
    
    //MLM
    @FindBy(xpath="//span[@id='ctl00_cp_uxGrdShipment_ctl02_lblAWBNo']")
    public WebElement MlmAwb_Lbl;
    @FindBy(xpath="//span[contains(text(),'Associate AWB')]")
    public WebElement AssociateAwb_Hyperlink;
    @FindBy(xpath="//input[@id='ctl00_cp_uxAWB_FMSAWBPrefixSelected']")
    public WebElement MlmAwbPfx_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxAWB_FMSAWBNoSelected']")
    public WebElement MlmAwb_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_grdNewDetails_ctl02_NewAWBNo']")
    public WebElement MlmAwbNo_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_btnSearchShipments']")
    public WebElement SearchMLM_Btn;
    @FindBy(xpath="//input[@id='ctl00_cp_grdNewDetails_ctl02_NewPrefix_FMSAirlineSelected']")
    public WebElement AssociateAwbPfx_Tb;

    @FindBy(xpath="//input[@id='ctl00_cp_grdNewDetails_ctl02_NewHouseNo']")
    public WebElement MlmHawb_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_btnSaveAssociate']")
    public WebElement SaveAssociateMlm_Btn;


    @FindBy(xpath="//input[@id='ctl00_cp_tc_tp2_ctl00_uxAWBS_FMSAWBPrefixSelected']")
    public WebElement AccptPfx_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_tc_tp2_ctl00_uxAWBS_FMSAWBNoSelected']")
    public WebElement AccptAWB_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_tc_tp2_ctl00_uxSearch']")
    public WebElement AccptSearch_Btn;
    @FindBy(xpath="//select[@id='ctl00_cp_tc_tp2_ctl00_uxddlMachine_fmsGenericDropDownList']")
    public WebElement MachineNo_DD;
    @FindBy(xpath="//input[@id='ctl00_cp_tc_tp2_ctl00_btnPrint']")
    public WebElement PrintSticker_Icon;
    @FindBy(xpath="//input[@id='ctl00_cp_uxBack']")
    public WebElement CancelAccpt_Btn;

    @FindBy(xpath="//input[@id='ctl00_cp_tc_tp2_ctl00_uxSave']")
    public WebElement SaveAccpt_Btn;
    @FindBy(xpath="//input[@id='ctl00_cp_tc_tp2_ctl00_uxRejection']")
    public WebElement Rejection_Btn;
    @FindBy(xpath="//input[@id='ctl00_cp_FMSRejectionGrid_ctl02_chkscreenList']")
    public WebElement Reject_Cb1;
    @FindBy(xpath="//input[@id='ctl00_cp_FMSRejectionGrid_ctl03_chkscreenList']")
    public WebElement Reject_Cb2;
    @FindBy(xpath="//textarea[@id='ctl00_cp_FMSTxtRemark']")
    public WebElement RemarkReject_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_FMSRejectionSave']")
    public WebElement Reject_Btn;
    @FindBy(xpath="//input[@id='ctl00_cp_uxAWB_FMSAWBPrefixSelected']")
    public WebElement BttAwbPfx_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxAWB_FMSAWBNoSelected']")
    public WebElement BttAwb_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_btnSearchShipments']")
    public WebElement BttSearch_Btn;
    @FindBy(xpath="//input[@id='ctl00_cp_uxtxtBTTNOP']")
    public WebElement BttPkg_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxReasonBTT_FMSReferenceDataSelected']")
    public WebElement BttReason_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxtxtCustRefNo']")
    public WebElement BttCustomRefNo_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_grdBTTHouse_ctl02_uxtxtBBTpcs']")
    public WebElement Btt1_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_grdBTTHouse_ctl03_uxtxtBBTpcs']")
    public WebElement Btt2_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxbtnBTT']")
    public WebElement RecordBTT_Btn;
    @FindBy(xpath="//input[@id='ctl00_cp_grdBTTHistory_ctl02_chkSelect']")
    public WebElement BttDocument_Cb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxbtnPendingCharges']")
    public WebElement CollectCharge_Btn;
    @FindBy(xpath="//iframe[@id='pageContainer']")
    public WebElement PageFrame;

    @FindBy(xpath="//input[@id='ctl00_cp_uxbtnGenerateGP']")
    public WebElement GenerateGP_Btn;
    @FindBy(xpath="//input[@id='ctl00_cp_uxbtnRelease']")
    public WebElement ReleaseGP_Btn;

    @FindBy(xpath="//img[@id='ctl00_cp_uxAWB_showpopup']")
    public WebElement AddShipment_Icon;
    @FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_uxAddShipment']")
    public WebElement AddShip_Btn;
    @FindBy(xpath="//input[@value='Add Shipment']")
    public WebElement AddShipment_Btn;
    @FindBy(xpath="//input[@id='ctl00_cp_gS_ctl02_uxSelect']")
    public WebElement ShipmentOnHand_Cb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxSave']")
    public WebElement CloseSaveULD_Btn;

    @FindBy(xpath="//input[@id='ctl00_cp_uxGrdFlightBuiltUp_ctl02_uxSelect']")
    public WebElement Gatepass_Cb;
    
    //Inbound
    @FindBy(xpath="//a[@id='ctl00_btnInBound']")
    public WebElement Inbound_Tab;
    @FindBy(xpath="//table[@id='ctl00_hldPage_grdADO']//tr/td[1]/input[1]")
    public List<WebElement> Inbound_Cb;
    @FindBy(xpath="//input[@id='ctl00_hldPage_grdADO_ctl02_txtChargeWt']")
    public WebElement ChWt_Tb;
    
    @FindBy(xpath="//input[@id='ctl00_hldPage_grdADO_ctl03_txtChargeWt']")
    public WebElement ChWt_Tb2;
    
    @FindBy(xpath="//input[@id='ctl00_hldPage_grdADO_ctl04_txtChargeWt']")
    public WebElement ChWt_Tb3;
    
    @FindBy(xpath="//input[@id='ctl00_hldPage_grdADO_ctl05_txtChargeWt']")
    public WebElement ChWt_Tb4;
    
    @FindBy(xpath="//input[@id='ctl00_hldPage_grdADO_ctl06_txtChargeWt']")
    public WebElement ChWt_Tb5;
    
    
    
    @FindBy(xpath="//input[@id='ctl00_hldPage_btnApprovedADO']")
    public WebElement ApproveDeliveryOrder_Btn;
    @FindBy(xpath="//input[@id='ctl00_hldPage_Button6']")
    public WebElement YesADO_Btn;
    @FindBy(xpath="//input[@id='ctl00_hldPage_btnSuccessDO']")
    public WebElement ReleasedADO_Btn;
    @FindBy(xpath="//table[@id='ctl00_hldPage_grdMAWB']//tr/td[13]/input[@title='Submit']")
    public List<WebElement> AsiADO_Icon;
    @FindBy(xpath="//table[@id='ctl00_hldPage_grdMAWB']//tr/td[14]/input[@type='image']")
    public List<WebElement> TspADO_Icon;
    
    @FindBy(xpath="//*[@name='ctl00$hldPage$grdMAWB$ctl02$imgbTSPBOE']")
    public WebElement TSP1;
    @FindBy(xpath="//*[@name='ctl00$hldPage$grdMAWB$ctl03$imgbTSPBOE']")
    public WebElement TSP2;
    @FindBy(xpath="//*[@name='ctl00$hldPage$grdMAWB$ctl04$imgbTSPBOE']")
    public WebElement TSP3;
    @FindBy(xpath="//*[@name='ctl00$hldPage$grdMAWB$ctl05$imgbTSPBOE']")
    public WebElement TSP4;
    @FindBy(xpath="//*[@name='ctl00$hldPage$grdMAWB$ctl06$imgbTSPBOE']")
    public WebElement TSP5;
    
    @FindBy(xpath="//input[@id='ctl00_hldPage_txtTSPPassword']")
    public WebElement TspAdoTransaction_Tb;
    @FindBy(xpath="//input[@id='ctl00_hldPage_btnTSPPay']")
    public WebElement TspAdoPayNow_Btn;
    @FindBy(xpath="//input[@id='ctl00_hldPage_btnTSPConfirm']")
    public WebElement TspAdoYes_Btn;
    @FindBy(xpath="//input[@id='ctl00_hldPage_btnGenerateTokenFromTSPConfirm']")
    public WebElement TspGenerateToken_Btn;
    @FindBy(xpath="//table[@id='ctl00_hldPage_grdMAWB']//tr/td[4]/span")
    public List<WebElement> AwbWDO_Lbl;
    @FindBy(xpath="//input[@id='ctl00_cp_btnSearchShipments']")
    public WebElement WHsearch_Btn;
    //NMIAL Outbound WH_AwbSearch_Btn
    
    @FindBy(xpath="//span[contains(text(),'Warehouse Delivery Order')]")
    public WebElement WDO_Hyperlink;
    @FindBy(xpath="//input[@id='ctl00_cp_uxAWB_FMSAWBPrefixSelected']")
    public WebElement WDOpfx_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxAWB_FMSAWBNoSelected']")
    public WebElement WDOawb_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_btnSearch']")
    public WebElement WDOsearch_Btn;
    @FindBy(xpath="//input[@id='ctl00_cp_grdWDO_ctl02_txtCustomsRefNo']")
    public WebElement WDOcustomRef_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_grdWDO_ctl02_uxULDSelect']")
    public WebElement WDO_Cb;
    @FindBy(xpath="//input[@id='ctl00_cp_btnGenerateWDO']")
    public WebElement GenerateWDO_Btn;
    @FindBy(xpath="//input[@id='ctl00_cp_btnReleased']")
    public WebElement ReleasedWDO_Btn;

    @FindBy(xpath="//a[@id='ctl00_siteWide_topmenucontainer_ctl01_HyperLink1']")
    public WebElement TrackTrace_Tab;
    @FindBy(xpath="//table[@id='ctl00_hldPage_grdAWB']//tr/td[2]/a/span")
    public List<WebElement> AwbTrackTrace_Hyperlink;
    @FindBy(xpath="//div[@class='custom-dropdown-wrapper']")
    public WebElement BagNo_DD;
    @FindBy(xpath="//ul[@id='ulOptions']/li")
    public List<WebElement> BagDD_List;
    @FindBy(xpath="//input[@id='ctl00_hldPage_btnGo']")
    public WebElement BagGo_Btn;

    @FindBy(xpath = "//*[@name='ctl00$hldPage$grdMAWB$ctl02$imgASISBStatus']")
	public WebElement ASIStatus_Icon1;
    
    @FindBy(xpath = "//*[@name='ctl00$hldPage$grdMAWB$ctl03$imgASISBStatus']")
   	public WebElement ASIStatus_Icon2;
    
    @FindBy(xpath = "//*[@name='ctl00$hldPage$grdMAWB$ctl04$imgASISBStatus']")
   	public WebElement ASIStatus_Icon3;
    
    @FindBy(xpath = "//*[@name='ctl00$hldPage$grdMAWB$ctl05$imgASISBStatus']")
   	public WebElement ASIStatus_Icon4;
    
    @FindBy(xpath = "//*[@name='ctl00$hldPage$grdMAWB$ctl06$imgASISBStatus']")
   	public WebElement ASIStatus_Icon5;
    
   
	@FindBy(xpath = "")
	public WebElement A2;
	
	@FindBy(xpath = "")
	public WebElement A3;
	
	@FindBy(xpath = "")
	public WebElement A4;
	
	@FindBy(xpath = "")
	public WebElement A5;
	
	@FindBy(xpath = "")
	public WebElement A6;
	
	@FindBy(xpath = "")
	public WebElement A7;
	
	@FindBy(xpath = "")
	public WebElement A8;
	
	@FindBy(xpath = "")
	public WebElement A9;
	
	@FindBy(xpath = "")
	public WebElement A11;
	
	@FindBy(xpath = "")
	public WebElement A21;
	
	@FindBy(xpath = "")
	public WebElement A31;
	
	@FindBy(xpath = "")
	public WebElement A41;
	
	@FindBy(xpath = "")
	public WebElement A51;
	
	@FindBy(xpath = "")
	public WebElement A61;
	
	@FindBy(xpath = "")
	public WebElement A71;
	
	@FindBy(xpath = "")
	public WebElement A8q1;
	
	@FindBy(xpath = "")
	public WebElement A91;
	
	@FindBy(xpath = "")
	public WebElement A12;
	
	@FindBy(xpath = "")
	public WebElement A22;
	
	@FindBy(xpath = "")
	public WebElement A33;
	
	@FindBy(xpath = "")
	public WebElement A44;
	
	@FindBy(xpath = "")
	public WebElement A55;
	
	@FindBy(xpath = "")
	public WebElement A696;
	
	@FindBy(xpath = "")
	public WebElement A717;
	
	@FindBy(xpath = "")
	public WebElement A828;
	
	@FindBy(xpath = "")
	public WebElement A969;

    

    
    
    
}
