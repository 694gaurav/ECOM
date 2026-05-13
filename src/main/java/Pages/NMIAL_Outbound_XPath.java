package Pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NMIAL_Outbound_XPath extends Pages.BasePage {
	public NMIAL_Outbound_XPath(WebDriver driver) {
		super(driver);
	
	}
	
	@FindBy(xpath="//input[@id='btnClose']")
	public WebElement Authentication_Popup;

	@FindBy(xpath = "//table[@id='ctl00_hldPage_grdMAWB']//tr[2]/td/a[@id='ctl00_hldPage_grdMAWB_ctl02_hrefCopyMAWB']")
	public WebElement CopyAWB_Icon;
	
	@FindBy(xpath="//input[@id='ctl00_hldPage_btnCTOYes']")
	public WebElement OkSelectCTO_Btn;

	@FindBy(xpath="(//*[contains(text(),'Copy AWB Confirmation')])[2]")
	public WebElement ConfirmationCopyAWB_Popup;
	
	@FindBy(xpath="//input[@id='ctl00_hldPage_btnYesCopyAWB']")
	public WebElement YesCopyAWB_Btn;	
	
	@FindBy(xpath="//input[@id='ctl00_hldPage_txtAWBPrefix']")
	public WebElement CopyAWB_Pfx_Tb;
	
	@FindBy(xpath="//input[@id='ctl00_hldPage_txtAWBNo']")
	public WebElement CopyAWB_Tb;
	
	@FindBy(xpath="(//img[@class='ui-datepicker-trigger'])[1]")
	public WebElement FlightDate_Icon;
	
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']//tr[5]/td/a")
	public WebElement NmialCalendar_Grid;
	@FindBy(xpath="//span[contains(text(),'Next')]")
	public WebElement NmialCalendarNext_Icon;
	
	@FindBy(xpath="//select[@id='ctl00_hldPage_ddlCustodianName']")
	public WebElement SelectCTO_DD;


	@FindBy(xpath="//input[@id='ctl00_hldPage_txtOriginAirport']")
	public WebElement Origin_Tb;
	
	@FindBy(xpath="//input[@id='ctl00_hldPage_txtDestAirport']")
	public WebElement Destination_Tb;

	@FindBy(xpath="//input[@id='ctl00_hldPage_txtflightno1']")
	public WebElement AwbFlightNo_Tb;
	
	@FindBy(xpath="//input[@id='ctl00_hldPage_btnSaveAwb']")
	public WebElement SaveAWB_Btn;
	
	@FindBy(xpath="//input[@id='ctl00_hldPage_btnCHANo']")
	public WebElement OkSavedAWB_Btn;
	
	@FindBy(xpath="//a[@id='ctl00_hldPage_grdMAWB_ctl02_hrefViewMAWB']")
    public WebElement GeneratedAWB_Grid;
	
	@FindBy(xpath="//span[@id='ctl00_hldPage_grdMAWB_ctl02_lblAWBJOBID']")
    public WebElement UnkShipment_Grid;
	@FindBy(xpath="//a[@id='ctl00_hldPage_grdMAWB_ctl02_hrefViewMAWB']")
    public WebElement AwbShipment_Grid;
	@FindBy(xpath="//a[@id='ctl00_hldPage_grdMAWB_ctl02_lblhreApprovedCO']")
    public WebElement AwbFlight_Grid;


	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_uxOffloadULD']")
    public WebElement OffloadULD_Btn;
	
	@FindBy(xpath="//input[@id='ctl00_cp_uxRdoWarehouse']")
    public WebElement OffloadULD_Rdb;
	@FindBy(xpath="//img[@id='ctl00_cp_uxLocation_showpopup']")
    public WebElement LocationSearch_Icon;
	@FindBy(xpath="//img[@id='ctl00_cp_uxReason_showpopup']")
    public WebElement OffloadReason_Icon;
	@FindBy(xpath="//input[@id='ctl00_cp_uxok']")
    public WebElement SaveOffload_Btn;

	//AWB ASI
	@FindBy(xpath="//input[@id='ctl00_hldPage_grdMAWB_ctl02_lnkASI']")
	public WebElement AWB_ASI_Icon;
	
	@FindBy(xpath="//input[@id='btnASIProceedNew']")
	public WebElement ProceedAWB_Btn;
	
	@FindBy(xpath="//input[@id='ctl00_hldPage_btnASIYesNew']")
	public WebElement YesASI_Confirmation_Btn;
	
	@FindBy(xpath="//input[@id='ctl00_hldPage_Button4']")
	public WebElement SentASI_Ok_Btn;
	
	//CO
	@FindBy(xpath="//input[@id='ctl00_hldPage_grdMAWB_ctl02_hreApprovedCO']")
	public WebElement CO_Icon;

	@FindBy(xpath="(//h5[contains(text(),'Carting Order (CO) Request')])[2]")
	public WebElement CO_Request_Popup;
	
	@FindBy(xpath="//input[@id='ctl00_hldPage_btnRequestCartingOrder']")
	public WebElement YesCO_Request_Btn;
	
	@FindBy(xpath="//input[@id='ctl00_hldPage_btnCORreq']")
	public WebElement OkCO_Request_Btn;
	
	@FindBy(xpath="//input[@id='ctl00_hldPage_grdMAWB_ctl02_hreApprovedCO']")
	public WebElement ApprovedCO_Icon;
	
	//Logout
	@FindBy(xpath="//div[@class='menu']/span")
	public WebElement Logout_Menu;
	
	@FindBy(xpath="//*[@id='ctl00_LinkButton6']")
	public WebElement Logout_Icon;
	
	@FindBy(xpath="//input[@id='ctl00_hldPage_grdMAWB_ctl02_hrefCreateBIALTSP']")
	public WebElement TSP_Icon;
	
	@FindBy(xpath="//input[@id='ctl00_hldPage_txtTransPassword']")
	public WebElement TransactionPwd_TSP_Tb;
	@FindBy(xpath="//input[@id='ctl00_hldPage_txtTSPPassword']")
	public WebElement TransactionPwd_Inbound_Tb;
	@FindBy(xpath="//input[@id='ctl00_hldPage_btnPayNow']")
	public WebElement PayNow_Btn;
	@FindBy(xpath="//input[@name='ctl00$hldPage$btnTSPConfirm']")
	public WebElement YesPayNow_Popup_Btn;
	@FindBy(xpath="//input[@name='ctl00$hldPage$btnGenerateTokenFromTSPConfirm']")
	public WebElement OkTspGenerated_Btn;
	
	@FindBy(xpath="//input[@id='ctl00_hldPage_grdMAWB_ctl02_ImgBookSlot']")
	public WebElement Inbound_BookSlot_Icon;


	@FindBy(xpath="//input[@id='ctl00_hldPage_grdMAWB_ctl02_lnkVTNoMAWBWise']")
	public WebElement BookSlot_Icon;
	
	@FindBy(xpath="//div[@id='rowvehicleDetails146558']//li/button[@class='btn btn-white dateButton']")
	public List<WebElement> AvailableSlot_Btn;
	
	@FindBy(xpath="//input[@id='txtVehicleNo']")
	public WebElement VehicleNo_Tb;
	
	@FindBy(xpath="//input[@id='txtDriverName']")
	public WebElement DriverName_Tb;
	@FindBy(xpath="//input[@id='txtDriverMobile']")
	public WebElement DriverMobileNo_Tb;
	@FindBy(xpath="//input[@id='txtDriverLicense']")
	public WebElement DriverLicenseNo_Tb;
	
	@FindBy(xpath="//button[@id='ctl00_hldPage_btnSaveImportBookSlot']")
	public WebElement InboundSaveSlot_Btn;
	@FindBy(xpath="(//button[contains(text(),'OK')])[1]")
	public WebElement Inbound_OkSlotBooked_Btn;

	@FindBy(xpath="//input[@id='ctl00_hldPage_btnSaveAwb']")
	public WebElement SaveSlot_Btn;
    @FindBy(xpath="(//button[contains(text(),'Ok')])[2]")
	public WebElement OkSlotBooked_Btn;
    
    @FindBy(xpath="//input[@id='chkVehicle']")
	public WebElement SelectSlot_Cb;
    @FindBy(xpath="//input[@id='ctl00_hldPage_btnPrintvst']")
	public WebElement PrintVT_Btn;
    @FindBy(xpath="//input[@id='ctl00_hldPage_btnEdit']")
	public WebElement EditSlot_Btn;
    @FindBy(xpath="//button[contains(text(),'Choose Different Slot')]")
	public WebElement ChooseSlot_Btn;
    @FindBy(xpath="//*[contains(text(),'Available slots')]")
	public WebElement AvailableSlots_Popup;
    @FindBy(xpath="//input[@id='ctl00_hldPage_inputok']")
	public WebElement OkAvailableSlots_Btn;
    @FindBy(xpath="//input[@id='ctl00_hldPage_inputcancel']")
	public WebElement CancelAvailableSlots_Btn;
    @FindBy(xpath="//input[@id='ctl00_hldPage_btnSaveAwb']")
	public WebElement SlotUpdate_Btn;
    
    @FindBy(xpath="//input[@id='ctl00_hldPage_grdMAWB_ctl02_lnkVTNoMAWBWise']")
	public WebElement SlotBooked_Icon;
    @FindBy(xpath="//input[@id='ctl00_hldPage_grdMAWB_ctl02_imgmanifets']")
	public WebElement SendManifest_Icon;
    @FindBy(xpath="//textarea[@id='txtSendMail']")
	public WebElement SendManifestEmail_Tb;
    @FindBy(xpath="//input[@id='btnSendMail']")
	public WebElement SendMail_Btn;
    @FindBy(xpath="//input[@id='btnCancel'][@class='green-button-white-text']")
	public WebElement CloseMail_Btn;
    @FindBy(xpath="//input[@id='ctl00_hldPage_grdMAWB_ctl02_imgbtnReceiptMAWBEnable']")
	public WebElement AcsReceipt_Icon;
    
    @FindBy(xpath="//input[@id='ctl00_hldPage_grdMAWB_ctl02_imgDocket']")
	public WebElement eDocket_Icon;
    @FindBy(xpath="(//*[contains(text(),'e-Docket')])[3]")
	public WebElement eDocket_Popup;
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
    
    @FindBy(xpath="//input[@id='ctl00_hldPage_rptCSDUploadedDocument_ctl00_chkRecordAll']")
	public WebElement SelectAll_Cb;
    
    @FindBy(xpath="//input[@id='ctl00_hldPage_btnSubmit']")
	public WebElement eDocketSubmit_Btn;
    @FindBy(xpath="//input[@value='Ok'][@class='GreenBGTheme blue-butn'][@onclick='javascript: CloseAllBSPop(); window.top.location.reload();']")
	public WebElement OkeDocket_Btn;

    //TPS- Parking In
    @FindBy(xpath="//input[@type='search']")
	public WebElement SearchParking_Tb;

    @FindBy(xpath="//select[@id='ctl00_hldPage_ddlCargoTypeDOM']")
	public WebElement CargoType_DD;
    @FindBy(xpath="//select[@id='ctl00_hldPage_ddlCommodityTypeDOM']")
    public WebElement CommodityType_DD;

    @FindBy(xpath="//table[@id='tblQueue']//tr/td[11]/img[@class='clsParkIn']")
	public List<WebElement> ParkingIn_Icon;
    @FindBy(xpath="//input[@class='btn-blue']")
	public WebElement OkParkingIn_Btn;
    
    @FindBy(xpath="//button[@class='btn btn-default btn-sm m-r-l-27 blue-butn-no-border']/span")
	public WebElement Refresh_Btn;
    
    @FindBy(xpath="//table[@id='tblQueue']//tr/td[12]/img[@class='clsParkOut']")
    public List<WebElement> ParkingOut_Icon;
    
    @FindBy(xpath="//table[@id='tblQueue']//tr/td//img[@class='clsYardCheckIn']")
    public List<WebElement> TerminalGateIn_Icon;
    
    @FindBy(xpath="(//img[@class='clsYardCheckOut'])[1]")
	public WebElement TerminalGateOut_Icon;

    @FindBy(xpath="(//a[contains(text(),'Track and Trace')])[1]")
	public WebElement TrackAndTrace_Tab;
    
    @FindBy(xpath="(//table[@id='ctl00_hldPage_grdAWB']//tr[2])[1]")
	public WebElement WarehouseAcceptance_Grid;

	
	//Airline
	@FindBy(xpath="//img[@id='ctl00_hldPage_AirLineHome_ctl02_imgAction']")
    public WebElement AirlineAction_Icon;
	
	@FindBy(xpath="//input[@id='ctl00_hldPage_btnReject']")
    public WebElement AirlineReject_Btn;
	@FindBy(xpath="//*[@id='ctl00_hldPage_txtReason']")
    public WebElement RejectReason_Tb;
	@FindBy(xpath="//input[@id='ctl00_hldPage_btnResSave']")
    public WebElement RejectSubmit_Btn;

	@FindBy(xpath="(//input[@class='createbol-txtbox text-right'])[3]")
    public WebElement FlightNo_Tb;

	@FindBy(xpath="//input[@id='ctl00_hldPage_btnSubmit']")
    public WebElement ApproveCO_Btn;
	
	@FindBy(xpath="//input[@id='ctl00_hldPage_btnYesCO']")
    public WebElement YesProceedCO_Btn;
	
	@FindBy(xpath="//input[@id='ctl00_hldPage_Button1']")
    public WebElement CO_Approved_Btn;
	
	//ACS GHA
	@FindBy(xpath="//a[contains(text(),'Exports')]")
    public WebElement Exports_Tab;
	
	@FindBy(xpath="//iframe[@id='pageContainer']")
    public WebElement PageFrame;

	@FindBy(xpath="(//span[contains(text(),'AWB Detail')])[1]")
    public WebElement AwbDetail_Tab;
    @FindBy(xpath="//input[@id='uxAWB_FMSAWBPrefixSelected']")
    public WebElement AwbPrefix_Tb;
    @FindBy(xpath="//input[@id='uxAWB_FMSAWBNoSelected']")
    public WebElement Awb_Tb;
    
    @FindBy(xpath="//ul[@class='menulink1']/li[1]/a[1]")
    public WebElement VCT_Tab;
    @FindBy(xpath="//div[@id='CustomerVerticleMenu1_ra_submenu']//span[contains(text(),'VCT Generation')]")
    public WebElement VctGeneration_Tab;
    @FindBy(xpath="//div[@id='ctl00_cp_tc_body']//div[@class='row']//table[@class='GridviewMaster']//tr[2]")
    public WebElement OutboundGateIn_Record;
    @FindBy(xpath="//table[@id='ctl00_cp_tc_tab1_ctl00_grdVCTList']//tr[5]/td[1]")
    public WebElement VCTnoOutbound_Record;
    
    //Security Acceptance
    @FindBy(xpath="//div[@id='4as']/ul/li[5]/a/span")
    public WebElement SecurityAcceptance_Tab;

    
    @FindBy(xpath="(//table[@class='GridviewMaster']//tr[2]/td[1])[1]")
    public WebElement VCTnoOutbound_Lbl;


    @FindBy(xpath="//span[contains(text(),'VCT Acceptance')]")
    public WebElement VctAcceptance_Tab;
    @FindBy(xpath="//input[@id='ctl00_cp_uxbtnSearch']")
    public WebElement SearchVctAcceptance_Btn;
    @FindBy(xpath="//table[@id='ctl00_cp_uxGrdVCTShipments']//tr/td[1]/input[1]")
    public List<WebElement> CargoAWB_Cb;

    @FindBy(xpath="//input[@id='ctl00_cp_uxGateDate_txtDateField']")
    public WebElement GateInDate_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxGateSTDT_uxTime']")
    public WebElement GateInTime_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxbtnGateIn']")
    public WebElement GateIn_Btn;
    
    @FindBy(xpath="//input[@id='ctl00_cp_uxSTDT_uxTime']")
    public WebElement DockInTime_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxbtnDockIn']")
    public WebElement DockIn_Btn;
    @FindBy(xpath="//table[@id='ctl00_cp_uxGrdVCTShipments']//tr[2]/td[3]")
    public WebElement CargoNOP_Lbl;
    
    @FindBy(xpath="//input[@id='ctl00_cp_uxbtnSubmit']")
    public WebElement AcceptCargo_Btn;
    @FindBy(xpath="//span[@id='ctl00_cp_uxGrdVCTShipments_ctl03_lblDocumentNo']")
    public WebElement CargoAWB_Lbl;
    @FindBy(xpath="//table[@id='tblAcceptedCargoList']//tr[2]")
    public WebElement AcceptCargo_Grid;
    @FindBy(xpath="//input[@id='ctl00_cp_tc_tp1_ctl00_grdEcsd_ctl01_txtFilter1']")
    public WebElement VctAwbFilter_Tb;
    @FindBy(xpath="//table[@id='ctl00_cp_tc_tp1_ctl00_grdEcsd']//tr[2]/td[2]")
    public WebElement VctAwbDetail_Hyperlink;
    @FindBy(xpath="//select[@id='ctl00_cp_tc_tp2_ctl00_uxddlMachine_fmsGenericDropDownList']")
    public WebElement MachineNo_DD;
    @FindBy(xpath="//input[@id='ctl00_cp_tc_tp2_ctl00_uxSave']")
    public WebElement SaveAcceptance_Btn;
    
    @FindBy(xpath="//input[@id='ctl00_cp_uxGrdVCTShipments_ctl02_uxSelect']")
    public WebElement AwbCargo_Cb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxtxtGroupId']")
    public WebElement GroupId_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_rptPopVol_ctl01_txtNOP']")
    public WebElement NOP_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_rptPopVol_ctl01_txtLength']")
    public WebElement Length_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_rptPopVol_ctl01_txtWidth']")
    public WebElement Width_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_rptPopVol_ctl01_txtHeight']")
    public WebElement Height_Tb;
    
    //Build Manifest
    @FindBy(xpath="//div[@id='4as']/ul[@class='menulink']/li[6]//span[contains(text(),'Build Manifest')]")
    public WebElement BuildManifest_Tab;
    @FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_uxFlightBox_AirNo']")
    public WebElement FlightPfxBuildManifest_Tb;
    @FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_uxFlightBox_FltNo']")
    public WebElement FlightNoBuildManifest_Tb;
    @FindBy(xpath="//img[@id='ctl00_ContentPlaceHolder1_uxFlightBox_showpopup']")
    public WebElement SearchBuildManifest_Icon;
    //ULD
    @FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_uxULD_FMSULDType']")
    public WebElement UldPfxBuildManifest_Tb;
    @FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_uxULD_FMSULDNumber']")
    public WebElement UldNoBuildManifest_Tb;
    @FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_uxULD_FMSULDOwner']")
    public WebElement UldFlightBuildManifest_Tb;
    @FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_uxdrpAircraftPosition_fmsGenericDropDownList']")
    public WebElement UldPositionBuildManifest_DD;
    @FindBy(xpath="//input[@value='Add ULD']")
    public WebElement AddUldBuildManifest_Btn;
    @FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_uxgrdMan_ctl03_uxSelect']")
    public WebElement ULD_Cb;
    @FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_uxAddShipment']")
    public WebElement AddUldShipment_Btn;
    @FindBy(xpath="//input[@id='ctl00_cp_uxAWB_FMSAWBPrefixSelected']")
    public WebElement UldShipmentPfx_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxAWB_FMSAWBNoSelected']")
    public WebElement UldShipment_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxSearch']")
    public WebElement SearchUldShipment_Btn;
    @FindBy(xpath="//input[@id='ctl00_cp_gS_ctl02_uxSelect']")
    public WebElement UldShipment_Cb;
    @FindBy(xpath="//input[@id='ctl00_cp_gS_ctl02_uxNPR']")
    public WebElement UldNOP_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxOk']")
    public WebElement AddShipment_Btn;
    @FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_uxgrdMan_ctl03_imgUndo']")
    public WebElement CloseULD_Icon;
    @FindBy(xpath="//input[@id='ctl00_cp_uxClose']")
    public WebElement CloseULD_Rdb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxScaleWt_Number']")
    public WebElement ScaleWeight_Tb;
    @FindBy(xpath="//select[@id='ctl00_cp_uxddlMachineNo_fmsGenericDropDownList']")
    public WebElement WeighingScaleNumber_DD;
    @FindBy(xpath="//input[@id='ctl00_cp_uxSaveETV']")
    public WebElement SaveScaleWeight_Btn;
    @FindBy(xpath="//input[@id='ctl00_cp_uxSave']")
    public WebElement CloseULD_Btn;
    
    @FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_uxActualDepartureDate_txtDateField']")
    public WebElement AtdDate_Tb;
    @FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_uxATDT_uxTime']")
    public WebElement AtdTime_Tb;
    @FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_uxFlightBuiltUp']")
    public WebElement FlightBuiltUp_Btn;
    @FindBy(xpath="//input[@id='ctl00_cp_uxGrdFlightBuiltUp_ctl02_uxSelect']")
    public WebElement UldFlightBuiltUp_Cb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxbtnGP']")
    public WebElement GenerateGatepass_Btn;
      
    @FindBy(xpath="//span[contains(text(),'Gatepass')]")
    public WebElement Gatepass_Tab;
    @FindBy(xpath="//input[@id='ctl00_cp_uxFlightBox_AirNo']")
    public WebElement GatepassPfx_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxFlightBox_FltNo']")
    public WebElement GatepassFlight_Tb;
    @FindBy(xpath="//img[@id='ctl00_cp_uxFlightBox_showpopup']")
    public WebElement GatepassSearch_Icon;
    @FindBy(xpath="//a[@id='ctl00_cp_uxGridGP_ctl02_lnkGatepass']")
    public WebElement Gatepass_Hyperlink;
    @FindBy(xpath="//input[@id='ctl00_cp_uxGrdULD_ctl02_uxSelect']")
    public WebElement GatepassUld_Cb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxRelease']")
    public WebElement GatepassRelease_Btn;
    
    @FindBy(xpath="//input[@id='ctl00_Toolbar2_btnPrint']")
    public WebElement PrintManifest_Icon;
    @FindBy(xpath="//table[@id='ctl00_ContentPlaceHolder1_uxconfirm']//tr/td/input")
    public List<WebElement> FlightManifest_Rdb;
    @FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_uxbtnConfirm']")
    public WebElement ProceedManifest_Btn;

    @FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_uxRecordFlightDeparture']")
    public WebElement RecordATD_Btn; 
    @FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_uxFinaliseFlightdirect']")
    public WebElement FinalizeFlightATD_Btn; 

    //GHA- Flight
    @FindBy(xpath="//a[contains(text(),'Masters')]")
    public WebElement Masters_Tab;

    @FindBy(xpath="(//img[@id='expand'])[4]")
    public WebElement FlightMore_Icon;
    @FindBy(xpath="(//a[@class='Submenu']/span[contains(text(),'Flight')])[5]")
    public WebElement Flight_Hyperlink;
    @FindBy(xpath="(//ul[@class='ulnav1']//span[contains(text(),'Flight')])[3]")
    public WebElement FlightECOM_Hyperlink;
    @FindBy(xpath="(//ul[@id='ulnav1']//span[contains(text(),'Flight')])[4]")
    public WebElement FlightInbound_Tab;

    @FindBy(xpath="//div[@id='ctl00_cp_tc_header']/span[2]//span[contains(text(),'Details')]")
    public WebElement FlightDetails_Tab;
    @FindBy(xpath="//input[@id='ctl00_Toolbar2_btnNew']")
    public WebElement AddFlightDetails_Icon;
    
    @FindBy(xpath="//input[@id='ctl00_cp_tc_tp2_ctl00_uxFlightNo']")
    public WebElement Flight_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_tc_tp2_ctl00_uxAircraftType_FMSReferenceDataSelected']")
    public WebElement AircraftType_Tb;
    @FindBy(xpath="//div[@id='ctl00_cp_tc_header']/span[3]//span[contains(text(),'Details')]")
    public WebElement RoutingDetails_Tab;
    
    @FindBy(xpath="//input[@id='ctl00_cp_tc_tp3_ctl00_uxgrdRoutingDetails_ctl02_uxAirport_FMSAirportSelected']")
    public WebElement AirportCity_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_tc_tp3_ctl00_uxgrdRoutingDetails_ctl02_uxDepartureDate_txtDateField']")
    public WebElement DepartureDate_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_tc_tp3_ctl00_uxgrdRoutingDetails_ctl02_txtDepartureTimeDummy']")
    public WebElement DepartureTimeHH_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_tc_tp3_ctl00_uxgrdRoutingDetails_ctl02_txtDepartureTimeDummyMin']")
    public WebElement DepartureTimeMM_Tb;
    
    @FindBy(xpath="//input[@id='ctl00_cp_tc_tp3_ctl00_uxgrdRoutingDetails_ctl03_uxAirport_FMSAirportSelected']")
    public WebElement DestinationCity_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_tc_tp3_ctl00_uxgrdRoutingDetails_ctl03_uxArrivalDate_txtDateField']")
    public WebElement ArrivalDate_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_tc_tp3_ctl00_uxgrdRoutingDetails_ctl03_txtArrivalTimeDummy']")
    public WebElement ArrivalTimeHH_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_tc_tp3_ctl00_uxgrdRoutingDetails_ctl03_txtArrivalTimeDummyMin']")
    public WebElement ArrivalTimeMM_Tb;
    @FindBy(xpath="//input[@id='ctl00_Toolbar2_btnSave']")
    public WebElement SaveFlight_Icon;
    
    @FindBy(xpath="//a[contains(text(),'Imports')]")
    public WebElement Imports_Tab;
    @FindBy(xpath="//span[contains(text(),'Import Manifest')]")
    public WebElement ImportManifest_Tab;
    @FindBy(xpath="//input[@id='ctl00_cp_uxFlightBox_AirNo']")
    public WebElement FlightPfx_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxFlightBox_FltNo']")
    public WebElement CreatedFlightNo_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxSTA_txtDateField']")
    public WebElement STA_Date_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxAircraftType_FMSReferenceDataSelected']")
    public WebElement AC_Type_Tb;
    @FindBy(xpath="//img[@id='ctl00_cp_uxFlightBox_showpopup']")
    public WebElement FlightPopup_Icon;
    @FindBy(xpath="//table[@id='ctl00_cp_GrdSearch']//tr/td[1]/span")
    public List<WebElement> FlightsPopup_Hyperlink;


    @FindBy(xpath="//input[@id='ctl00_cp_uxULD_FMSULDType']")
    public WebElement ULD_Pfx_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxULD_FMSULDNumber']")
    public WebElement ULD_No_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxULD_FMSULDOwner']")
    public WebElement ULD_FlightPfx_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxULDCreate']")
    public WebElement AddULD_Btn;
    
    @FindBy(xpath="//table[@id='ctl00_cp_uxGrdULD']/tbody/tr[3]/td[5]")
    public WebElement UldNo_Hyperlink;
    
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl02_gPrefix_FMSAirlineSelected']")
    public WebElement Pfx1_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl02_gAwbNo']")
    public WebElement Awb1_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl02_gO_FMSAirportSelected']")
    public WebElement Origin1_Tb;
    @FindBy(xpath="//input[@id='//input[@id='ctl00_cp_gH_ctl02_gDT_FMSAirportSelected']']")
    public WebElement Destination1_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl02_gCTN_FMSCommSearchCode']")
    public WebElement CommodityCode1_Tb;
    @FindBy(xpath="//span[@id='ctl00_cp_gH_ctl02_gCTN_FMSCommName']")
    public WebElement Commodity1_Hyperlink;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl02_gD']")
    public WebElement NatureOfGoods1_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl02_gX']")
    public WebElement ManifestedNPX1_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl02_gW_Number']")
    public WebElement ManifestedWtExp1_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl02_gCW_Number']")
    public WebElement DeclaredChWt1_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl02_uxCN_FMSShortCode']")
    public WebElement ConsigneeCode1_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl02_btnAdd']")
    public WebElement AddAwb2_Icon;
    
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl03_gPrefix_FMSAirlineSelected']")
    public WebElement Pfx2_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl03_gAwbNo']")
    public WebElement Awb2_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl03_gO_FMSAirportSelected']")
    public WebElement Origin2_Tb;
    
    @FindBy(xpath="//input[@id='//input[@id='ctl00_cp_gH_ctl03_gDT_FMSAirportSelected']']")
    public WebElement Destination2_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl03_gCTN_FMSCommSearchCode']")
    public WebElement CommodityCode2_Tb;
    @FindBy(xpath="//span[@id='ctl00_cp_gH_ctl03_gCTN_FMSCommName']")
    public WebElement Commodity2_Hyperlink;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl03_gD']")
    public WebElement NatureOfGoods2_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl03_gX']")
    public WebElement ManifestedNPX2_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl03_gW_Number']")
    public WebElement ManifestedWtExp2_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl03_gCW_Number']")
    public WebElement DeclaredChWt2_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl03_uxCN_FMSShortCode']")
    public WebElement ConsigneeCode2_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl03_btnAdd']")
    public WebElement AddAwb3_Icon;

    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl04_gPrefix_FMSAirlineSelected']")
    public WebElement Pfx3_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl04_gAwbNo']")
    public WebElement Awb3_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl04_gO_FMSAirportSelected']")
    public WebElement Origin3_Tb;
    @FindBy(xpath="//input[@id='//input[@id='ctl00_cp_gH_ctl04_gDT_FMSAirportSelected']']")
    public WebElement Destination3_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl04_gCTN_FMSCommSearchCode']")
    public WebElement CommodityCode3_Tb;
    @FindBy(xpath="//span[@id='ctl00_cp_gH_ctl04_gCTN_FMSCommName']")
    public WebElement Commodity3_Hyperlink;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl04_gD']")
    public WebElement NatureOfGoods3_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl04_gX']")
    public WebElement ManifestedNPX3_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl04_gW_Number']")
    public WebElement ManifestedWtExp3_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl04_gCW_Number']")
    public WebElement DeclaredChWt3_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl04_uxCN_FMSShortCode']")
    public WebElement ConsigneeCode3_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl04_btnAdd']")
    public WebElement AddAwb4_Icon;
    
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl05_gPrefix_FMSAirlineSelected']")
    public WebElement Pfx4_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl05_gAwbNo']")
    public WebElement Awb4_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl05_gO_FMSAirportSelected']")
    public WebElement Origin4_Tb;
    @FindBy(xpath="//input[@id='//input[@id='ctl00_cp_gH_ctl05_gDT_FMSAirportSelected']']")
    public WebElement Destination4_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl05_gCTN_FMSCommSearchCode']")
    public WebElement CommodityCode4_Tb;
    @FindBy(xpath="//span[@id='ctl00_cp_gH_ctl05_gCTN_FMSCommName']")
    public WebElement Commodity4_Hyperlink;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl05_gD']")
    public WebElement NatureOfGoods4_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl05_gX']")
    public WebElement ManifestedNPX4_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl05_gW_Number']")
    public WebElement ManifestedWtExp4_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl05_gCW_Number']")
    public WebElement DeclaredChWt4_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl05_uxCN_FMSShortCode']")
    public WebElement ConsigneeCode4_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl05_btnAdd']")
    public WebElement AddAwb5_Icon;
    
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl06_gPrefix_FMSAirlineSelected']")
    public WebElement Pfx5_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl06_gAwbNo']")
    public WebElement Awb5_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl06_gO_FMSAirportSelected']")
    public WebElement Origin5_Tb;
    @FindBy(xpath="//input[@id='//input[@id='ctl00_cp_gH_ctl06_gDT_FMSAirportSelected']']")
    public WebElement Destination5_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl06_gCTN_FMSCommSearchCode']")
    public WebElement CommodityCode5_Tb;
    @FindBy(xpath="//span[@id='ctl00_cp_gH_ctl06_gCTN_FMSCommName']")
    public WebElement Commodity5_Hyperlink;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl06_gD']")
    public WebElement NatureOfGoods5_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl06_gX']")
    public WebElement ManifestedNPX5_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl06_gW_Number']")
    public WebElement ManifestedWtExp5_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl06_gTW_Number']")
    public WebElement DeclaredNPX5_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl06_gTW_Number']")
    public WebElement AwbWt5_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl06_gCW_Number']")
    public WebElement DeclaredChWt5_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl06_uxCN_FMSShortCode']")
    public WebElement ConsigneeCode5_Tb;
    
    @FindBy(xpath="//input[@id='ctl00_cp_btnSaveClose']")
    public WebElement AwbSaveClose_Btn;
    @FindBy(xpath="//input[@id='ctl00_cp_btnClose']")
    public WebElement Close_Btn;

    @FindBy(xpath="//input[@id='ctl00_cp_uxATA_txtDateField']")
    public WebElement ATA_Date_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxATAT_uxTime']")
    public WebElement ATA_Time_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxRecordFlight']")
    public WebElement RecordATA_Btn;
    
    @FindBy(xpath="//input[@id='ctl00_cp_uxFlightBreakDown']")
    public WebElement Breakdown_Btn;
    @FindBy(xpath="//input[@id='ctl00_cp_uxDateFlightReceiveTime_txtDateField']")
    public WebElement DocReceiveDate_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxFlightReceiveTime_uxTime']")
    public WebElement DocReceiveTime_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxDateFlightBreakDownStart_txtDateField']")
    public WebElement BreakdownStartDate_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxFlightBreakDownStart_uxTime']")
    public WebElement BreakdownStartTime_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxDateFlightBreakDownEnd_txtDateField']")
    public WebElement BreakdownEndDate_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxFlightBreakDownEnd_uxTime']")
    public WebElement BreakdownEndTime_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxGrdFlightBreakDown_ctl03_uxULDBulkIntact']")
    public WebElement BreakdownUld_Cb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxBtnSave']")
    public WebElement SaveBreakdown_Btn;
    @FindBy(xpath="//input[@id='ctl00_cp_uxBtnCancel']")
    public WebElement CancelBreakdown_Btn;

    @FindBy(xpath="//input[@id='ctl00_cp_uxGrdShipment_ctl01_uxCheckAllshipments']")
    public WebElement SelectAllAwb_Cb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxMatch']")
    public WebElement MatchShipment_Btn;
    @FindBy(xpath="//input[@value='Ok']")
    public WebElement OkMatchShipment_Btn;
    
    @FindBy(xpath="//table[@id='ctl00_cp_uxGrdShipment']/tbody/tr/td/input[@Type='checkbox']")
    public List<WebElement> MatchedShipment_Cb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxDiscrepancy']")
    public WebElement Discrepancy_Btn;
    @FindBy(xpath="//input[@id='ctl00_cp_grdDesc_ctl02_uxtxtNPR']")
    public WebElement DiscrepancyNPR_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxSave']")
    public WebElement SaveDiscrepancy_Btn;
    
    @FindBy(xpath="//input[@id='ctl00_cp_uxDamage']")
    public WebElement Damage_Btn;
    @FindBy(xpath="//input[@id='ctl00_cp_uxtxtTActualPcs']")
    public WebElement DamagePieces_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxtxtTActualValue_Number']")
    public WebElement DamageWeight_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxtxtIDamageDoc_Number']")
    public WebElement DocumentWeight_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxtxtIDamageAct_Number']")
    public WebElement ActualWeight_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_RepeaterDContents_ctl05_chkContent']")
    public WebElement Damaged_Cb;
    @FindBy(xpath="//input[@id='ctl00_cp_RepeaterDContents_ctl05_txtPieces']")
    public WebElement Damaged_Tb;
    @FindBy(xpath="//*[@id='ctl00_cp_uxtxtRemarks_txtData']")
    public WebElement DamagedRemarks_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxtxtGHARep']")
    public WebElement GHA_Rep_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxtxtAirlineRep']")
    public WebElement Airline_Rep_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxtxtSecurityRep']")
    public WebElement Customs_Rep_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxbtnSave']")
    public WebElement SaveDamageDetails_Btn;
    @FindBy(xpath="//input[@id='ctl00_cp_uxbtnCancel']")
    public WebElement CancelDamage_Btn;

    //Inbound
    @FindBy(xpath="//input[@id='ctl00_cp_uxFinaliseFlight']")
    public WebElement FlightFinalize_Btn;

    @FindBy(xpath="//a[@id='ctl00_btnInBound']")
    public WebElement Inbound_Tab;
    @FindBy(xpath="")
    public WebElement InboundShipment_Tab;

    @FindBy(xpath="//input[@id='ctl00_hldPage_grdADO_ctl02_chkSelectADO']")
    public WebElement SelectFlight_Cb;
    @FindBy(xpath="//input[@id='ctl00_hldPage_grdADO_ctl02_txtChargeWt']")
    public WebElement ChargeableWeight_Tb;
    @FindBy(xpath="//input[@id='ctl00_hldPage_btnApprovedADO']")
    public WebElement ApproveDeliveryOrder_Btn;
    @FindBy(xpath="//input[@id='ctl00_hldPage_Button6']")
    public WebElement UpdatedADO_Btn;
    @FindBy(xpath="//input[@id='ctl00_hldPage_Button2']")
    public WebElement ApprovedAsDO_Btn;
      
    @FindBy(xpath="//input[@id='ctl00_hldPage_grdMAWB_ctl01_txtFilter6']")
    public WebElement FlightNoFilter_Tb;
    @FindBy(xpath="//input[@id='ctl00_hldPage_grdMAWB_ctl01_imgFilterOperator6']")
    public WebElement ApplyFilter_Icon;


    @FindBy(xpath="//input[@id='ctl00_hldPage_txtFlightNo']")
    public WebElement AdoFlight_Tb;
    @FindBy(xpath="//input[@id='ctl00_hldPage_btnSearch']")
    public WebElement SearchADO_Btn;
    @FindBy(xpath="//input[@id='ctl00_hldPage_grdADO_ctl01_chkSelectAllADOs']")
    public WebElement SelectAllADO_Cb;
    @FindBy(xpath="//table[@id='ctl00_hldPage_grdMAWB']//tr[2]/td[12]/input")
    public WebElement ReadyForDelivery_Icon;
    @FindBy(xpath="//input[@id='ctl00_hldPage_grdMAWB_ctl02_imgASISBStatus']")
    public WebElement InboundASI_Icon;
    @FindBy(xpath="//input[@id='ctl00_hldPage_btnASIProceed']")
    public WebElement ProceedInboundASI_Btn;
    @FindBy(xpath="//input[@id='ctl00_hldPage_btnASIOK']")
    public WebElement OkInboundASI_Btn;
    @FindBy(xpath="//input[@id='ctl00_hldPage_grdMAWB_ctl02_imgbTSPBOE']")
    public WebElement InboundTSP_Icon;
    @FindBy(xpath="//input[@id='ctl00_hldPage_txtTSPPassword']")
    public WebElement InboundTSP_Pwd_Tb;
    @FindBy(xpath="//input[@id='ctl00_hldPage_btnTSPPay']")
    public WebElement InboundTSP_PayNow_Btn;    

    @FindBy(xpath="//img[@alt='Select Branch']")
    public WebElement DockBranch_Icon;
    @FindBy(xpath="//a[@id='ctl00_rptUserBranchList_ctl01_lnkBranchNames'][contains(text(),'NMIAL DOM')]")
    public WebElement Branch_List;
    @FindBy(xpath="//select[@id='ctl00_hldPage_ddlMode']")
    public WebElement DockMode_DD;
    
    @FindBy(xpath="//span[@id='ctl00_hldPage_grdMAWB_ctl02_lblMAWBNo']")
    public WebElement InboundAWB1_Lbl;
    @FindBy(xpath="//span[@id='ctl00_hldPage_grdMAWB_ctl03_lblMAWBNo']")
    public WebElement InboundAWB2_Lbl;
    @FindBy(xpath="//span[@id='ctl00_hldPage_grdMAWB_ctl04_lblMAWBNo']")
    public WebElement InboundAWB3_Lbl;


    @FindBy(xpath="//a[contains(text(),'Imports')]")
    public WebElement ImportsGHA_Tab;
    @FindBy(xpath="(//a/span[contains(text(),'Warehouse Location')])[2]")
    public WebElement WarehouseLocation_Tab;
    @FindBy(xpath="//input[@id='ctl00_cp_uxAWB_FMSAWBPrefixSelected']")
    public WebElement WH_AwbPfx_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxAWB_FMSAWBNoSelected']")
    public WebElement WH_Awb_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxAWB_FMSHAWNoSelected']")
    public WebElement HawbWH_Tb;

    @FindBy(xpath="//img[@id='ctl00_cp_uxAWB_showpopup']")
    public WebElement WH_AwbSearch_Btn;
    @FindBy(xpath="//table[@id='ctl00_cp_GrdSearch']//tr/td[1]/span")
    public List<WebElement> AwbWH_Hyperlink;
    @FindBy(xpath="//input[@id='ctl00_cp_grdSplitLoc_ctl02_uxGroupId']")
    public WebElement GroupIdWH_Tb;
    @FindBy(xpath="//img[@id='ctl00_cp_grdSplitLoc_ctl02_uxWHLoc_showpopup']")
    public WebElement LocationWH_Icon;
    @FindBy(xpath="//table[@id='ctl00_cp_GrdLocPopUp']//tr/td[1]/span")
    public List<WebElement> LocationWH_Hyperlink;
    @FindBy(xpath="//input[@id='ctl00_cp_btnLocSave']")
    public WebElement SaveLocationWH_Btn;
    
    @FindBy(xpath="//span[contains(text(),'Warehouse Delivery Order')]")
    public WebElement WDO_Tab;
    @FindBy(xpath="//select[@id='ddlSearch']")
    public WebElement SearchBy_DD;
    @FindBy(xpath="//input[@id='ctl00_cp_uxAWB_FMSAWBPrefixSelected']")
    public WebElement WdoAwbPfx_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxAWB_FMSAWBNoSelected']")
    public WebElement WdoAwb_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_btnSearch']")
    public WebElement WdoSearch_Btn;
    @FindBy(xpath="//input[@id='ctl00_cp_grdWDO_ctl02_uxULDSelect']")
    public WebElement WDO_Cb;
    @FindBy(xpath="//input[@id='ctl00_cp_btnGenerateWDO']")
    public WebElement GenerateWDO_Btn;
    @FindBy(xpath="//input[@id='ctl00_cp_btnReleased']")
    public WebElement ReleaseWDO_Btn;
    

    //Reports
    @FindBy(xpath="(//img[@id='expand'])[3]")
    public WebElement ImportMore_Hyperlink;

    @FindBy(xpath="(//ul[@id='ulnav1'])[2]/li[3]//span[contains(text(),'Imports Operation Reports')]")
    public WebElement ImportReports_Hyperlink;
    @FindBy(xpath="//select[@id='ctl00_cp_ddlReport']")
    public WebElement SelectReport_DD;
    @FindBy(xpath="(//img[@class='ui-datepicker-trigger'])[1]")
    public WebElement FromDate_Icon;
    @FindBy(xpath="(//img[@class='ui-datepicker-trigger'])[2]")
    public WebElement ToDate_Icon;
    @FindBy(xpath="//table[@class='ui-datepicker-calendar']//tr/td")
    public List<WebElement> Calendar_Grid;
    @FindBy(xpath="//input[@id='ctl00_cp_rv_ctl04_ctl00']")
    public WebElement ViewReport_Btn;


    //Bial
    @FindBy(xpath="(//img[@id='expand'])[1]")
    public WebElement More_Icon;
    @FindBy(xpath="//a[contains(text(),'Tracing Unit')]")
    public WebElement TracingUnit_Hyperlink;
    
    @FindBy(xpath="//span[contains(text(),'Change AWB No.')]")
    public WebElement ChangeAwb_Tab;
    
    @FindBy(xpath="//input[@id='ctl00_cp_uxAWBNo_FMSAWBPrefixSelected']")
    public WebElement OldAwbPfx_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxAWBNo_FMSAWBNoSelected']")
    public WebElement OldAwb_Tb;
    
    @FindBy(xpath="//input[@id='ctl00_cp_uxAWBNoNew_FMSAWBPrefixSelected']")
    public WebElement NewAwbPfx_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxAWBNoNew_FMSAWBNoSelected']")
    public WebElement NewAwb_Tb;
    
    @FindBy(xpath="//input[@id='ctl00_Toolbar2_btnSave']")
    public WebElement SaveChangedAwb_Icon;

    //Edit Cancel Awb
    @FindBy(xpath="//a[@id='ctl00_hldPage_grdMAWB_ctl02_hrfEditQuickASI']/img")
    public WebElement EditAwb_Icon;
    
    @FindBy(xpath="//input[@id='ctl00_hldPage_txtMasterNoOfPkg']")
    public WebElement EditNOP_Tb;
    @FindBy(xpath="//select[@id='ctl00_hldPage_ddlCargoTypeDOM']")
    public WebElement EditCargoType_DD;
    
   	@FindBy(xpath="//input[@id='ctl00_hldPage_Button9']")
    public WebElement Back_Btn;
	
	@FindBy(xpath="//input[@id='ctl00_hldPage_btnUpdateBack']")
    public WebElement BackSlot_Btn;

	@FindBy(xpath="//input[@id='ctl00_hldPage_grdMAWB_ctl02_lnkAWBDeleteAWB']")
    public WebElement CancelAwb_Icon;
	@FindBy(xpath="(//input[@class='GreenBGTheme blue-butn'])[15]")
    public WebElement OkDelete_Btn;
	
	@FindBy(xpath="//input[@id='ctl00_hldPage_grdAWB_ctl01_txtFilter1']")
    public WebElement AwbFilter_Tb;
	
	@FindBy(xpath="//*[@id='ctl00_hldPage_grdAWB_ctl01_imgFilterOperator1']")
    public WebElement AwbFilter_Icon;
	@FindBy(xpath="//a[@id='filterMenucontains']/img")
    public WebElement ContainsFilter_Icon;
	
	@FindBy(xpath="//img[@id='imgViewSummary']")
    public WebElement AddSlot_Icon;
	@FindBy(xpath="//a[contains(text(),'Unassigned Shipments')]")
    public WebElement UnassignedShipment_Tab;
	
	@FindBy(xpath="//*[@id='tblBodyUshipment']//tr/td[@class='chkAwb chkAwb']/input")
    public List<WebElement> UnassignedShipment_Cb;
	
	@FindBy(xpath="//*[@id='tblBodyUshipment']//tr[2]/td[11]/input[@type='textBox']")
    public WebElement AllocatedNOP_Tb;

	@FindBy(xpath="//span[contains(text(),'Proceed')]")
    public WebElement ProceedShipment_Btn;
	@FindBy(xpath="//span[@id='ctl00_hldPage_lblSave']")
    public WebElement SaveShipment_Btn;

	//Multiple VT Single Shipment
	@FindBy(xpath="//input[@id='ctl00_hldPage_txtnoofvehicle']")
    public WebElement NoOfVehicle_Tb;
	
	@FindBy(xpath="//table[@class='table table-responsive terminaltable']/tbody/tr//input[@type='checkbox']")
    public List<WebElement> MultipleSlot_Cb;

	@FindBy(xpath="//table[@class='table table-responsive terminaltable']//tbody/tr[2]/td[3]/input")
    public WebElement VehicleNo2_Tb;
    @FindBy(xpath="//table[@class='table table-responsive terminaltable']//tbody/tr[2]/td[4]/input")
    public WebElement DriverName2_Tb;
    @FindBy(xpath="//table[@class='table table-responsive terminaltable']//tbody/tr[2]/td[5]/input[1]")
    public WebElement DriverMobileNo2_Tb;
    @FindBy(xpath="//table[@class='table table-responsive terminaltable']//tbody/tr[2]/td[7]/input[1]")
    public WebElement DriverLicenseNo2_Tb;
    @FindBy(xpath="//table[@class='table table-responsive terminaltable']/tbody/tr[2]/td/button[2]/img")
    public WebElement ViewSummary2_Icon;
    
    @FindBy(xpath="//*[@id='tblBodyUshipment']//tr[1]/td[11]/input[@type='textBox']")
    public WebElement AllocateNOP1_Tb;

	@FindBy(xpath="//table[@class='table table-responsive terminaltable']//tbody/tr[3]/td[3]/input")
    public WebElement VehicleNo3_Tb;
    @FindBy(xpath="//table[@class='table table-responsive terminaltable']//tbody/tr[3]/td[4]/input")
    public WebElement DriverName3_Tb;
    @FindBy(xpath="//table[@class='table table-responsive terminaltable']//tbody/tr[3]/td[5]/input[1]")
    public WebElement DriverMobileNo3_Tb;
    @FindBy(xpath="//table[@class='table table-responsive terminaltable']//tbody/tr[3]/td[7]/input[1]")
    public WebElement DriverLicenseNo3_Tb;
    @FindBy(xpath="//table[@class='table table-responsive terminaltable']/tbody/tr[3]/td/button[2]/img")
    public WebElement ViewSummary3_Icon;

	@FindBy(xpath="//button[@id='ctl00_MstOk1']")
    public WebElement OkShipmentAssign_Btn;
	
	@FindBy(xpath="//img[@title='Move']")
    public WebElement Move_Icon;
	
	//Billing Invoice
	@FindBy(xpath="//a[contains(text(),'Billing')]")
    public WebElement Billing_Tab;
	@FindBy(xpath="//ul[@class='menulink']/li[4]/a/span[contains(text(),'Customer Invoice')]")
    public WebElement CustomerInvoice_Tab;
	@FindBy(xpath="//ul[@class='menulink']/li[3]/a/span[contains(text(),'Customer Invoice')]")
    public WebElement TspCustomerInvoice_Tab;

	@FindBy(xpath="//select[@id='ctl00_cp_uxddlDocType']")
    public WebElement DocumentType_DD;

	@FindBy(xpath="//input[@id='ctl00_cp_FMStxtRef1']")
    public WebElement DocumentID_Tb;
	@FindBy(xpath="//input[@id='ctl00_cp_uxbtnSearch']")
	public WebElement SearchInvoice_Btn;
	@FindBy(xpath="//input[@id='ctl00_cp_uxbtnCalCharges']")
	public WebElement CalculateCharges_Btn;

	@FindBy(xpath="//input[@id='ctl00_cp_tcPayment_tpPayment_ctl00_uxbtnPayProceed']")
	public WebElement PayProceed_Btn;

	@FindBy(xpath="//span[@id='ctl00_cp_tc_tp2_ctl00_uxGridInvoiceHistory_ctl02_lblReceiptNo']")
	public WebElement GeneratedOutboundInvoice_Lbl;

	@FindBy(xpath="//ul[@class='menulink']/li[5]/a/span[contains(text(),'Credit Note')]")
    public WebElement CreditNote_Tab;
	@FindBy(xpath="//input[@id='ctl00_cp_txtInvoiceNo']")
    public WebElement InvoiceCreditNote_Tb;
	@FindBy(xpath="//input[@id='ctl00_cp_btnSearch']")
    public WebElement SearchInvoiceCN_Btn;
	@FindBy(xpath="//a[@id='ctl00_cp_uxGrdInfo_ctl02_lnkInvoiceCredit']")
    public WebElement InvoiceNoCN_Hyperlink;
	@FindBy(xpath="//a[@id='ctl00_cp_uxGrdInfo_ctl03_lnkInvoiceCredit']")
    public WebElement InvoiceNoCN1_Hyperlink;

	@FindBy(xpath="//input[@id='ctl00_cp_rdPercentage']")
    public WebElement PercentageCN_Rdb;
	@FindBy(xpath="//input[@id='ctl00_cp_grdChargeDetails_ctl01_txtCreditAmt']")
    public WebElement PercentageCN_Tb;
	@FindBy(xpath="//*[@id='ctl00_cp_txtCreditNoteRemark']")
    public WebElement RemarksCN_Tb;
	@FindBy(xpath="//input[@id='ctl00_cp_btnConfirm']")
    public WebElement ProceedCN_Btn;

	//Credit Billing Airline
	@FindBy(xpath="//span[contains(text(),'Credit Billing')]")
    public WebElement CreditBilling_Tab;
	@FindBy(xpath="//select[@id='ctl00_cp_uxddlDebitPartyType']")
    public WebElement DebitParty_DD;
	@FindBy(xpath="//input[@id='ctl00_cp_txtDebitParty']")
    public WebElement Airline_Tb;
	@FindBy(xpath="//select[@id='ctl00_cp_ddlAirlineGSA']")
    public WebElement AirlineGSA_DD;
	@FindBy(xpath="//select[@id='ctl00_cp_ddlBillingFrequency_fmsGenericDropDownList']")
    public WebElement Frequency_DD;
	@FindBy(xpath="//input[@id='ctl00_cp_uxStartDate_imgbtn']")
    public WebElement AirlineFromDate_Icon;
	@FindBy(xpath="(//div[@class='calendar']/table)[3]//tr[1][@class='daysrow']/td[@class='day'][1]")
    public WebElement AirlineFromDate_Grid;

	@FindBy(xpath="//input[@id='ctl00_cp_uxEndDate_imgbtn']")
    public WebElement AirlineToDate_Icon;
	@FindBy(xpath="//div[@class='calendar'][2]//table//tr[@class='daysrow']/td[6]")
    public List<WebElement> AirlineToDate_Grid;

	@FindBy(xpath="//input[@id='ctl00_cp_uxCalculateCharge']")
    public WebElement AirlineCalculateCharge_Btn;
	@FindBy(xpath="//input[@id='btnView']")
    public WebElement ViewCharge_Btn;
	@FindBy(xpath="//input[@id='chkChargeSelect']")
    public WebElement SelectCharge_Cb;
	@FindBy(xpath="//input[@id='ctl00_cp_uxChargeConfirm']")
    public WebElement ConfirmCharge_Btn;
	@FindBy(xpath="//input[@id='ctl00_cp_uxFinalInvoice']")
    public WebElement ConfirmGenerateInvoice_Btn;

    //Demurrage Charge
	@FindBy(xpath="//input[@id='CustomerVerticleMenu1_imgGotoPE']")
    public WebElement PE_Icon;
	@FindBy(xpath="//div[@id='MainMenuSideBar']//ul/li[4]//i[2]")
    public WebElement Tariff_Icon;
	@FindBy(xpath="//div[@id='TariffMenu']/ul/li[1]//a[contains(text(),'Tariff Configurator')]")
    public WebElement TariffConfigurator_Icon;

    @FindBy(xpath="//a[@id='customerHeader1_uxlnkbtnlogout']")
    public WebElement GhaLogout_Icon;

    //INTL GHA
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl02_gMaster']")
    public WebElement ConsolShipment_Cb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxCustomRef']")
    public WebElement CustomIGM_Tb;
    @FindBy(xpath="//*[@title='Create HAWB Details']")
    public WebElement ConsolShipment_Icon;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl02_gNo']")
    public WebElement HAWB1_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl03_gNo']")
    public WebElement HAWB2_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl02_gDT_FMSAirportSelected']")
    public WebElement Dest1_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl03_gDT_FMSAirportSelected']")
    public WebElement Dest2_Tb;
    
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl02_gfX']")
    public WebElement HawbManifestedNPX1_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl02_gfW_Number']")
    public WebElement HawbManifestedWtExp1_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl02_gC_Number']")
    public WebElement HawbDeclaredChWt1_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl02_uxCN_FMSShortCode']")
    public WebElement Hawb_ConsigneeCode1_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl02_btnAdd']")
    public WebElement HawbAddAwb2_Icon;
    
    
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl03_gfX']")
    public WebElement HawbManifestedNPX2_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl03_gfW_Number']")
    public WebElement HawbManifestedWtExp2_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl03_gC_Number']")
    public WebElement HawbDeclaredChWt2_Tb;
    
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl02_uxchkmultiple']")
    public WebElement SelectHawb1_Cb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl03_uxchkmultiple']")
    public WebElement SelectHawb2_Cb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl04_uxchkmultiple']")
    public WebElement SelectHawb3_Cb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl05_uxchkmultiple']")
    public WebElement SelectHawb4_Cb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl06_uxchkmultiple']")
    public WebElement SelectHawb5_Cb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl07_uxchkmultiple']")
    public WebElement SelectHawb6_Cb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl07_uxchkmultiple']")
    public WebElement SelectHawb7_Cb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl09_uxchkmultiple']")
    public WebElement SelectHawb8_Cb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl10_uxchkmultiple']")
    public WebElement SelectHawb9_Cb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl11_uxchkmultiple']")
    public WebElement SelectHawb10_Cb;
//    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl03_uxCN_FMSShortCode']")
//    public WebElement ConsigneeCode2_Tb;
    
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl04_gNo']")
    public WebElement HAWB3_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl04_gO_FMSAirportSelected']")
    public WebElement Orgn3_Tb;    
    @FindBy(xpath="//input[@id='//input[@id='ctl00_cp_gH_ctl04_gDT_FMSAirportSelected']']")
    public WebElement Destn3_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl04_gCTN_FMSCommSearchCode']")
    public WebElement Consol_CommodityCode3_Tb;
    @FindBy(xpath="//span[@id='ctl00_cp_gH_ctl04_gCTN_FMSCommName']")
    public WebElement Consol_Commodity3_Hyperlink;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl04_gD']")
    public WebElement Consol_NatureOfGoods3_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl04_gX']")
    public WebElement Consol_ManifestedNPX3_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl04_gW_Number']")
    public WebElement Consol_ManifestedWtExp3_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl04_gCW_Number']")
    public WebElement Consol_DeclaredChWt3_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl04_uxCN_FMSShortCode']")
    public WebElement Consol_ConsigneeCode3_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl05_btnAdd']")
    public WebElement Consol_AddAwb4_Icon;

    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl05_gNo']")
    public WebElement HAWB4_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl05_gO_FMSAirportSelected']")
    public WebElement Orgn4_Tb;    
    @FindBy(xpath="//input[@id='//input[@id='ctl00_cp_gH_ctl05_gDT_FMSAirportSelected']']")
    public WebElement Destn4_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl05_gCTN_FMSCommSearchCode']")
    public WebElement Consol_CommodityCode4_Tb;
    @FindBy(xpath="//span[@id='ctl00_cp_gH_ctl05_gCTN_FMSCommName']")
    public WebElement Consol_Commodity4_Hyperlink;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl05_gD']")
    public WebElement Consol_NatureOfGoods4_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl05_gX']")
    public WebElement Consol_ManifestedNPX4_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl05_gW_Number']")
    public WebElement Consol_ManifestedWtExp4_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl05_gCW_Number']")
    public WebElement Consol_DeclaredChWt4_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl05_uxCN_FMSShortCode']")
    public WebElement Consol_ConsigneeCode4_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl06_btnAdd']")
    public WebElement Consol_AddAwb5_Icon;

    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl06_gNo']")
    public WebElement HAWB5_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl06_gO_FMSAirportSelected']")
    public WebElement Orgn5_Tb;    
    @FindBy(xpath="//input[@id='//input[@id='ctl00_cp_gH_ctl06_gDT_FMSAirportSelected']']")
    public WebElement Destn5_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl06_gCTN_FMSCommSearchCode']")
    public WebElement Consol_CommodityCode5_Tb;
    @FindBy(xpath="//span[@id='ctl00_cp_gH_ctl06_gCTN_FMSCommName']")
    public WebElement Consol_Commodity5_Hyperlink;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl06_gD']")
    public WebElement Consol_NatureOfGoods5_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl06_gX']")
    public WebElement Consol_ManifestedNPX5_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl06_gW_Number']")
    public WebElement Consol_ManifestedWtExp5_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl06_gCW_Number']")
    public WebElement Consol_DeclaredChWt5_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl06_uxCN_FMSShortCode']")
    public WebElement Consol_ConsigneeCode5_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl07_btnAdd']")
    public WebElement Consol_AddAwb6_Icon;

    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl07_gNo']")
    public WebElement HAWB6_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl07_gO_FMSAirportSelected']")
    public WebElement Orgn6_Tb;    
    @FindBy(xpath="//input[@id='//input[@id='ctl00_cp_gH_ctl07_gDT_FMSAirportSelected']']")
    public WebElement Destn6_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl07_gCTN_FMSCommSearchCode']")
    public WebElement Consol_CommodityCode6_Tb;
    @FindBy(xpath="//span[@id='ctl00_cp_gH_ctl07_gCTN_FMSCommName']")
    public WebElement Consol_Commodity6_Hyperlink;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl07_gD']")
    public WebElement Consol_NatureOfGoods6_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl07_gX']")
    public WebElement Consol_ManifestedNPX6_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl07_gW_Number']")
    public WebElement Consol_ManifestedWtExp6_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl07_gCW_Number']")
    public WebElement Consol_DeclaredChWt6_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl07_uxCN_FMSShortCode']")
    public WebElement Consol_ConsigneeCode6_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl08_btnAdd']")
    public WebElement Consol_AddAwb7_Icon;

    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl08_gNo']")
    public WebElement HAWB7_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl08_gO_FMSAirportSelected']")
    public WebElement Orgn7_Tb;    
    @FindBy(xpath="//input[@id='//input[@id='ctl00_cp_gH_ctl08_gDT_FMSAirportSelected']']")
    public WebElement Destn7_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl08_gCTN_FMSCommSearchCode']")
    public WebElement Consol_CommodityCode7_Tb;
    @FindBy(xpath="//span[@id='ctl00_cp_gH_ctl08_gCTN_FMSCommName']")
    public WebElement Consol_Commodity7_Hyperlink;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl08_gD']")
    public WebElement Consol_NatureOfGoods7_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl08_gX']")
    public WebElement Consol_ManifestedNPX7_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl08_gW_Number']")
    public WebElement Consol_ManifestedWtExp7_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl08_gCW_Number']")
    public WebElement Consol_DeclaredChWt7_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl08_uxCN_FMSShortCode']")
    public WebElement Consol_ConsigneeCode7_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl09_btnAdd']")
    public WebElement Consol_AddAwb8_Icon;
    
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl09_gNo']")
    public WebElement HAWB8_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl09_gO_FMSAirportSelected']")
    public WebElement Orgn8_Tb;    
    @FindBy(xpath="//input[@id='//input[@id='ctl00_cp_gH_ctl09_gDT_FMSAirportSelected']']")
    public WebElement Destn8_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl09_gCTN_FMSCommSearchCode']")
    public WebElement Consol_CommodityCode8_Tb;
    @FindBy(xpath="//span[@id='ctl00_cp_gH_ctl09_gCTN_FMSCommName']")
    public WebElement Consol_Commodity8_Hyperlink;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl09_gD']")
    public WebElement Consol_NatureOfGoods8_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl09_gX']")
    public WebElement Consol_ManifestedNPX8_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl09_gW_Number']")
    public WebElement Consol_ManifestedWtExp8_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl09_gCW_Number']")
    public WebElement Consol_DeclaredChWt8_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl09_uxCN_FMSShortCode']")
    public WebElement Consol_ConsigneeCode8_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl10_btnAdd']")
    public WebElement Consol_AddAwb9_Icon;
    
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl10_gNo']")
    public WebElement HAWB9_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl10_gO_FMSAirportSelected']")
    public WebElement Orgn9_Tb;    
    @FindBy(xpath="//input[@id='//input[@id='ctl00_cp_gH_ctl10_gDT_FMSAirportSelected']']")
    public WebElement Destn9_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl10_gCTN_FMSCommSearchCode']")
    public WebElement Consol_CommodityCode9_Tb;
    @FindBy(xpath="//span[@id='ctl00_cp_gH_ctl10_gCTN_FMSCommName']")
    public WebElement Consol_Commodity9_Hyperlink;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl10_gD']")
    public WebElement Consol_NatureOfGoods9_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl10_gX']")
    public WebElement Consol_ManifestedNPX9_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl10_gW_Number']")
    public WebElement Consol_ManifestedWtExp9_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl10_gCW_Number']")
    public WebElement Consol_DeclaredChWt9_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl10_uxCN_FMSShortCode']")
    public WebElement Consol_ConsigneeCode9_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl11_btnAdd']")
    public WebElement Consol_AddAwb10_Icon;
    
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl11_gNo']")
    public WebElement HAWB10_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl11_gO_FMSAirportSelected']")
    public WebElement Orgn10_Tb;    
    @FindBy(xpath="//input[@id='//input[@id='ctl00_cp_gH_ctl11_gDT_FMSAirportSelected']']")
    public WebElement Destn10_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl11_gCTN_FMSCommSearchCode']")
    public WebElement Consol_CommodityCode10_Tb;
    @FindBy(xpath="//span[@id='ctl00_cp_gH_ctl11_gCTN_FMSCommName']")
    public WebElement Consol_Commodity10_Hyperlink;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl11_gD']")
    public WebElement Consol_NatureOfGoods10_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl11_gX']")
    public WebElement Consol_ManifestedNPX10_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl11_gW_Number']")
    public WebElement Consol_ManifestedWtExp10_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl11_gCW_Number']")
    public WebElement Consol_DeclaredChWt10_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl11_uxCN_FMSShortCode']")
    public WebElement Consol_ConsigneeCode10_Tb;
//    @FindBy(xpath="//input[@id='ctl00_cp_gH_ctl10_btnAdd']")
//    public WebElement Consol_AddAwb9_Icon;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    //INTL Airline
    @FindBy(xpath="//a[@id='ctl00_btnimp']")
    public WebElement ImportsINTL_Tab;
    @FindBy(xpath="//input[@id='ctl00_hldPage_txtIGM']")
    public WebElement IgmNo_Tb;

    @FindBy(xpath="//input[@id='ctl00_hldPage_grdMAWB_ctl03_btnwtVerification']")
    public WebElement SubmitWeightVerification_Icon;
    @FindBy(xpath="//input[@id='ctl00_hldPage_btnChrgWtExcepUpload']")
    public WebElement ChargeWeightUpload_Btn;
    @FindBy(xpath="(//input[@type='file'])[4]")
    public WebElement ChooseWeightUpload_Btn;
    @FindBy(xpath="//input[@id='ctl00_hldPage_btnExcelUpload']")
    public WebElement HawbUpload_Btn;
    @FindBy(xpath="//input[@id='ctl00_hldPage_btnUploadDocument']")
    public WebElement UploadOther_Btn;

    @FindBy(xpath="//input[@id='ctl00_hldPage_GridMAWBFILE_ctl02_fuctlUploadDocs']")
    public WebElement MawbUpload_Btn;
    @FindBy(xpath="//input[@id='ctl00_hldPage_GrdUploadConsolfile_ctl02_fuctlUploadDocs2']")
    public WebElement ConsolUpload_Btn;
    @FindBy(xpath="//input[@id='ctl00_hldPage_btnUploadfile']")
    public WebElement DocumentUpload_Btn;
    @FindBy(xpath="//input[@id='ctl00_hldPage_grdWTVerificationDetails_ctl03_lblHAWBchargeableWT']")
    public WebElement ChargeableWt_Tb;
    @FindBy(xpath="//input[@id='ctl00_hldPage_btnwtSubmit']")
    public WebElement SubmitWt_Btn;

    
    //INTL GHA
    @FindBy(xpath="//a[@id='btnAcceptRequest_1']/img")
    public WebElement AcceptWeightVerification_Icon;
    @FindBy(xpath="//a[@id='btnRejectRequest_0']/img")
    public WebElement RejectWeightVerification_Icon;
    @FindBy(xpath="//input[@id='ctl00_cp_btnSearchShipments']")
    public WebElement SearchAwbINTL_Btn;
    @FindBy(xpath="//a[@id='menu_more']")
    public WebElement MoreINTL_Icon;
    @FindBy(xpath="//a[contains(text(),'Dashboard')]")
    public WebElement Dashboard_Hyperlink;
    @FindBy(xpath="//div[@id='1264as']/ul/li[2]/a")
    public WebElement ApproveRejectACS_Hyperlink;
    
    @FindBy(xpath="//input[@id='ctl00_hldPage_grdMAWB_ctl01_txtFilter6']")
    public WebElement FilterFlightNo_Tb;
    @FindBy(xpath="//input[@id='ctl00_hldPage_grdMAWB_ctl02_btnConsolDO']")
    public WebElement ConsolDO_Icon;
    @FindBy(xpath="//select[@id='ctl00_hldPage_ddlCHA']")
    public WebElement CustomBroker_DD;
    @FindBy(xpath="//input[@id='ctl00_hldPage_btnDOSubmit']")
    public WebElement SubmitConsolDO_Btn;

    @FindBy(xpath="//input[@id='ctl00_hldPage_grdMAWB_ctl02_HyperLinkSB']")
    public WebElement BOE_Icon;
    @FindBy(xpath="//input[@id='txtSBNumber']")
    public WebElement BoeNo_Tb;
    @FindBy(xpath="//select[@id='drpSBType']")
    public WebElement BoeType_DD;
    @FindBy(xpath="//input[@id='txtCAV']")
    public WebElement CAV_Tb;
    @FindBy(xpath="//input[@id='txtNOP']")
    public WebElement BoeNOP_Tb;
    @FindBy(xpath="(//img[@title='Upload BoE'])[1]")
    public WebElement UploadBOE_Icon;
    @FindBy(xpath="//input[@id='ctl00_hldPage_fuctlUploadDocs']")
    public WebElement ChooseBOE_Btn;
    @FindBy(xpath="//input[@id='ctl00_hldPage_btnUploadSave']")
    public WebElement UploadBOE_Btn;

    @FindBy(xpath="(//button[contains(text(),'Close')])[6]")
    public WebElement CloseBOE_Btn;
    @FindBy(xpath="//button[@id='btnSaveAWB']")
    public WebElement SaveBOE_Btn;
    @FindBy(xpath="//table[@id='tblRequestList']//tr/td[1]/a/img")
    public List<WebElement> ApproveBOE_Icon;
    
    @FindBy(xpath="//input[@id='ctl00_hldPage_grdMAWB_ctl02_imgASISBStatus']")
    public WebElement BoE_ASI_Icon;
    @FindBy(xpath="//input[@id='ctl00_hldPage_btnASIProceed']")
    public WebElement BoE_Proceed_Btn;
    @FindBy(xpath="//input[@id='ctl00_hldPage_grdMAWB_ctl02_imgbtnReceipt']")
    public WebElement BoE_ACS_Icon;
    
    @FindBy(xpath="//input[@id='ctl00_hldPage_grdMAWB_ctl02_imgbTSPBOE']")
    public WebElement TspBoe_Icon;
    @FindBy(xpath="//input[@id='ctl00_hldPage_txtTSPPassword']")
    public WebElement TspTransaction_Tb;
    @FindBy(xpath="//input[@id='ctl00_hldPage_btnTSPPay']")
    public WebElement BoePayNow_Btn;
    @FindBy(xpath="//input[@id='ctl00_hldPage_btnTSPConfirm']")
    public WebElement YesBoePayNow_Btn;

    @FindBy(xpath="//input[@id='ctl00_hldPage_grdMAWB_ctl02_btnPickOrder2_NMIAL']")
    public WebElement PickOrder_Icon;
    @FindBy(xpath="//input[@id='ctl00_hldPage_txtPieceforExam']")
    public WebElement POE_Tb;
    @FindBy(xpath="//input[@id='ctl00_hldPage_txtRemarks']")
    public WebElement RemarksPOE_Tb;
    @FindBy(xpath="//button[@class='GreenBGTheme blue-butn'][contains(text(),'Ok')]")
    public WebElement OkPOE_Btn;
    @FindBy(xpath="//input[@id='ctl00_hldPage_btnBack']")
    public WebElement SavePOE_Btn;
    
    @FindBy(xpath="//div[@id='3as']//a[@id='Submenu_more']/img[@id='expand']")
    public WebElement MoreCustomActions_Icon;
    @FindBy(xpath="(//span[contains(text(),'Custom Actions')])[2]")
    public WebElement CustomActions_Hyperlink;
    @FindBy(xpath="//input[@id='ctl00_cp_btnSearchShipments']")
    public WebElement SearchFFE_Btn;
    @FindBy(xpath="//input[@id='ctl00_cp_grdLoc_ctl02_uxLocSelect']")
    public WebElement LocationCustomAction_Cb;
    @FindBy(xpath="//input[@id='ctl00_cp_btnExaminiation']")
    public WebElement Examination_Btn;
    @FindBy(xpath="//input[@id='ctl00_cp_FMSReqPieces']")
    public WebElement ExamPieces_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_txtCustomRefNo']")
    public WebElement CustomRefNo_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_uxCustRefDate_txtDateField']")
    public WebElement CustomRefDate_Tb;
    @FindBy(xpath="//img[@id='ctl00_cp_uxWHLoc_showpopup']")
    public WebElement ExamLocation_Icon;
    @FindBy(xpath="//input[@id='ctl00_cp_grdLoc_ctl02_uxLocSelect']")
    public WebElement FFE_Cb;
    @FindBy(xpath="//input[@id='ctl00_cp_grdLoc_ctl02_uxtxtExamPieces']")
    public WebElement ExamPiecesGrid_Tb;
    @FindBy(xpath="//input[@id='ctl00_cp_btnForwordForExamination']")
    public WebElement FFE_Btn;	
    
    @FindBy(xpath="//input[@id='ctl00_hldPage_grdMAWB_ctl02_HyperLinkbtnOoC_ADANI']")
    public WebElement OOC_Icon;	
    @FindBy(xpath="//input[@id='txtOoCNumber']")
    public WebElement OOCno_Tb;	
    @FindBy(xpath="//select[@id='drpSBType']")
    public WebElement OOC_Type_DD;	
    @FindBy(xpath="//a[@id='ctl00_hldPage_ShippingBill_HyperLinkSB']/img")
    public WebElement UploadOoc_Icon;	
    @FindBy(xpath="//input[@id='ctl00_hldPage_btnUploadSave']")
    public WebElement UploadOoc_Btn;	
    @FindBy(xpath="(//button[contains(text(),'Close')])[6]")
    public WebElement CloseOoc_Btn;	
    @FindBy(xpath="//button[@id='btnSaveAWB']")
    public WebElement SaveOoc_Btn;	
    
    @FindBy(xpath="//input[@id='ctl00_hldPage_grdMAWB_ctl02_imgGatePass']")
    public WebElement Gatepass_Icon;	
    @FindBy(xpath="//input[@id='ctl00_hldPage_txtMobileNo']")
    public WebElement NotifyMobileNo_Tb;	
    @FindBy(xpath="//input[@id='ctl00_hldPage_btnCreateGP']")
    public WebElement CreateGatepass_Btn;	
    
    //INTL Exports
    @FindBy(xpath="//a[@id='ctl00_siteWide_topmenucontainer_ctl06_HyperLink1'][contains(text(),'e-AWB')]")
    public WebElement eAWB_Tab;	
    @FindBy(xpath="//a[@id='ctl00_siteWide_topmenucontainer_ctl06_Repeater1_ctl18_HyperLink2'][contains(text(),'Create AWB')]")
    public WebElement CreateAWB_Hyperlink;
    @FindBy(xpath="//select[@id='ctl00_hldPage_ddlCustodianName']")
    public WebElement SelectExportCTO_DD;
    @FindBy(xpath="//input[@id='ctl00_hldPage_txtAWBPrefix']")
    public WebElement ExportAWBpfx_Tb;
    @FindBy(xpath="//input[@id='ctl00_hldPage_txtAWBNo']")
    public WebElement ExportAWB_Tb;
    @FindBy(xpath="//input[@id='ctl00_hldPage_txtOrgName1']")
    public WebElement ExportShipper_Tb;
    @FindBy(xpath="//input[@id='ctl00_hldPage_txtSearchConsigneeName1']")
    public WebElement ExportConsignee_Tb;
    @FindBy(xpath="(//img[@id='imgairport'])[1]")
    public WebElement AirportOfDeparture_Icon;
    @FindBy(xpath="//input[@id='ctl00_hldPage_GenericAutoFillDestAirport_txtCode']")
    public WebElement DestnPortPfx_Tb;
    @FindBy(xpath="//input[@id='ctl00_hldPage_GenericAutoFillDestAirport_txtName']")
    public WebElement DestnPort_Tb;
    @FindBy(xpath="(//button[@type='button'])[contains(text(),'Ok')][5]")
    public WebElement RoutingOk_Btn;
    @FindBy(xpath="//input[@id='ctl00_hldPage_txtflightno1']")
    public WebElement RequestedFlightNo_Tb;
    @FindBy(xpath="//img[@id='addDimensions_1']")
    public WebElement Dimensions_Icon;
    @FindBy(xpath="//input[@id='txtNoPcs_1']")
    public WebElement NoPcs_Tb;
    @FindBy(xpath="//input[@id='txtLength_1']")
    public WebElement ExportLength_Tb;
    @FindBy(xpath="//input[@id='txtWidth_1']")
    public WebElement ExportWidth_Tb;
    @FindBy(xpath="//input[@id='txtHeight_1']")
    public WebElement ExportHeight_Tb;
    
    @FindBy(xpath="(//button[@type='button'][contains(text(),'Ok')])[6]")
    public WebElement DimensionOk_Btn;
    @FindBy(xpath="//input[@id='txtCgGrWt_1']")
    public WebElement NopGrWt_Tb;
    @FindBy(xpath="//select[@id='selRateClass_1']")
    public WebElement RateClass_DD;
    @FindBy(xpath="//input[@id='txtCgChargWt_1']")
    public WebElement ChargeableWtDimension_Tb;
    @FindBy(xpath="//input[@id='txtCgDesc_1']")
    public WebElement NatureOfGoods_Tb;
    @FindBy(xpath="//input[@id='ctl00_hldPage_datalstHandlingCode_ctl00_txtHandlingCode']")
    public WebElement HandlingInformation_Tb;
    @FindBy(xpath="//input[@id='ctl00_hldPage_txtCarrier1']")
    public WebElement RequestedFlightPfx_Tb;
    @FindBy(xpath="//input[@id='ctl00_hldPage_txtflightno1']")
    public WebElement RequestedFlight_Tb;

    @FindBy(xpath="//input[@id='ctl00_hldPage_mltSlctCHA_1'][@type='checkbox']")
    public WebElement EDS_Cb;

    
    @FindBy(xpath="//div[@id='ctl00_hldPage_divCB']")
    public WebElement SelectCustomBroker_DD;
    @FindBy(xpath="//input[@id='ctl00_hldPage_Chkisaggreed']")
    public WebElement RatesAgreed_Cb;
    @FindBy(xpath="//select[@id='ctl00_hldPage_ddlChargeCode']")
    public WebElement ChargeCode_DD;

    @FindBy(xpath="//input[@id='txtCgRate_1']")
    public WebElement RateCharge_Tb;
    @FindBy(xpath="//input[@id='ctl00_hldPage_dlsDueAgent_ctl00_txtDueAgentchargelist']")
    public WebElement DueAgent_Tb;
    @FindBy(xpath="//input[@id='ctl00_hldPage_dlsDueAgent_ctl00_txtDueAgentchargeAmount']")
    public WebElement ChargeDueAgent_Tb;

    @FindBy(xpath="//input[@id='ctl00_hldPage_dlsDueCarrier_ctl00_txtDueCarrierchargelist']")
    public WebElement DueCarrier_Tb;
    @FindBy(xpath="//input[@id='ctl00_hldPage_dlsDueCarrier_ctl00_txtDueCarrierchargeAmount']")
    public WebElement ChargeDueCarrier_Tb;
    @FindBy(xpath="//input[@name='ctl00$hldPage$btnSaveAwb']")
    public WebElement SaveExportAwb_Btn;




private static String waitForNewWindowAndSwitch(WebDriver driver, WebDriverWait wait, String currentHandle) {
        // Wait until the window count > 1
        wait.until(d -> driver.getWindowHandles().size() > 1);

        Set<String> handles = driver.getWindowHandles();
        
        for (String h : handles) {
            if (h.equals(currentHandle)) {
                driver.switchTo().window(h);
                return h;
            }
        }
        throw new RuntimeException("No new window found to switch to.");
    }


    public void OpenWindow() {

       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
       String mainWindow = driver.getWindowHandle();
       String popupWindow = waitForNewWindowAndSwitch(driver, wait, mainWindow);


    }
	
	public void CloseWindow() {
		Object[] windowHandles= driver.getWindowHandles().toArray();
    	driver.switchTo().window((String) windowHandles[0]);
    	driver.switchTo().defaultContent();

	}



    public static String switchToWindowByUrlOrTitle(WebDriver driver, WebDriverWait wait,
                                             String urlFragment, String titleFragment) {
        return wait.until(d -> {
            for (String h : d.getWindowHandles()) {
                d.switchTo().window(h);
                boolean urlMatch = (urlFragment != null) && d.getCurrentUrl().contains(urlFragment);
                boolean titleMatch = (titleFragment != null) && Optional.ofNullable(d.getTitle()).orElse("").contains(titleFragment);
                if (urlMatch || titleMatch) return h;
            }
            return null;
        });
    }

    
    public static String switchToNthWindow(WebDriver driver, int index) {
        List<String> handles = new ArrayList<>(driver.getWindowHandles());
        if (index < 0 || index >= handles.size()) {
            throw new NoSuchElementException("Window index out of range: " + index);
        }
        String handle = handles.get(index);
        driver.switchTo().window(handle);
        return handle;
        // NOTE: Selenium usually returns a LinkedHashSet preserving insertion order, but don't rely on it blindly.
        // Prefer URL/title-based selection for reliability.
    }


     public static String getNewHandle(WebDriver driver, Set<String> before) {
        Set<String> after = driver.getWindowHandles();
        for (String h : after) {
            if (!before.contains(h)) return h;
        }
        throw new NoSuchElementException("No new window handle detected.");
    }

	
}
