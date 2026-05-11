package Pages;

import static Helper.BaseObjects.Export;
import static Helper.BaseObjects.Tiffa;
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

public class TiffaCreateAWB_XPath extends Pages.BasePage {

	public TiffaCreateAWB_XPath(WebDriver driver) {
		super(driver);
	
	}
	

	@FindBy(xpath = "(//*[@title='AWB Service'])/parent::div/a")
	public WebElement TiffaAWBServiceLink;
	
	@FindBy(xpath = "(//a[@href='/ACSTIFFA_UAT/UI/AWBCreateService.aspx?mode=create&prefix=&mawbno=#'])")
	public WebElement TiffaCreateMAWBLink;
	
	@FindBy(xpath = "(//a[@href='/PINGOCR_UAT/UI/AWBCreateService.aspx?mode=create&prefix=&mawbno=#'])")
	public WebElement PingCreateMAWBLink;
	
	@FindBy(xpath = "(//input[@id='ctl00_hldPage_txtAWBPrefix'])")
	public WebElement TiffaCreateMAWB_AWBPrefix;
	
	@FindBy(xpath = "(//input[@id='ctl00_hldPage_txtAWBNo'])")
	public WebElement TiffaCreateMAWB_AWBNumber;
	
	@FindBy(xpath = "(//*[@id='btnshipperadd'])")
	public WebElement TiffaCreateMAWB_AddShipperIcon;
	
	@FindBy(xpath = "(//input[@id='ctl00_hldPage_txtCompanyName'])")
	public WebElement TiffaCreateMAWB_ShipperName;
	
	@FindBy(xpath = "(//input[@id='ctl00_hldPage_uclOrgAddressInformation_txtAddressLine1'])")
	public WebElement TiffaCreateMAWB_ShipperAddress;
	
	@FindBy(xpath = "(//input[@id='ctl00_hldPage_uclOrgAddressInformation_GenericAutoFillCountry_txtCode'])")
	public WebElement TiffaCreateMAWB_ShipperCountry;
	
	@FindBy(xpath = "(//input[@id='ctl00_hldPage_uclOrgAddressInformation_GenericAutoFillCity_txtCode'])")
	public WebElement TiffaCreateMAWB_ShipperCity;
	
	@FindBy(xpath = "(//input[@id='ctl00_hldPage_uclOrgAddressInformation_txtPinCode'])")
	public WebElement TiffaCreateMAWB_ShipperPincode;
	
	@FindBy(xpath = "(//*[@id='btnOk'])[1]/span")
	public WebElement TiffaCreateMAWB_ShipperDetailsOKButton;
	
	@FindBy(xpath = "(//*[@id='btnOk'])[2]/span")
	public WebElement TiffaCreateMAWB_ShipperDetailsOKButton1;
	
	@FindBy(xpath = "(//*[@id='imgbtnConsignee'])")
	public WebElement TiffaCreateMAWB_ConsigneeIcon;
	
	@FindBy(xpath = "(//input[@id='ctl00_hldPage_txtConName'])")
	public WebElement TiffaCreateMAWB_ConsigneeName;
	
	@FindBy(xpath = "(//input[@id='ctl00_hldPage_uclConsAddressInfo_txtAddressLine1'])")
	public WebElement TiffaCreateMAWB_ConsigneeAddress;
	
	@FindBy(xpath = "(//input[@id='ctl00_hldPage_uclConsAddressInfo_GenericAutoFillCountry_txtCode'])")
	public WebElement TiffaCreateMAWB_ConsigneeCountry;
	
	@FindBy(xpath = "(//input[@id='ctl00_hldPage_uclConsAddressInfo_GenericAutoFillCity_txtCode'])")
	public WebElement TiffaCreateMAWB_ConsigneeCity;
	
	@FindBy(xpath = "(//input[@id='ctl00_hldPage_uclConsAddressInfo_txtPinCode'])")
	public WebElement TiffaCreateMAWB_ConsigneePincode;
	
	@FindBy(xpath = "(//*[@id='btnOk'])[2]/span")
	public WebElement TiffaCreateMAWB_ConsigneeDetailsOKButton;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtAgentSelect'])")
	public WebElement TiffaCreateMAWB_IssueCarrierAgentName;
	
	@FindBy(xpath = "(//*[@title='Routing Information'])")
	public WebElement TiffaCreateMAWB_RoutingInfoIcon;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_GenericAutoFillOriginAirport_txtCode'])")
	public WebElement TiffaCreateMAWB_RoutingInfoOrigin;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_GenericAutoFillDestAirport_txtCode'])")
	public WebElement TiffaCreateMAWB_RoutingInfoDestination;
	
	@FindBy(xpath = "(//button[@id='btnOk'])[3]/span")
	public WebElement TiffaCreateMAWB_RoutingInfoOkButton;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_ddlChargeCode'])")
	public WebElement TiffaCreateMAWB_ChargeCode;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtCarrier1'])")
	public WebElement TiffaCreateMAWB_FlightCarrierPrefix;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtCarrier2'])")
	public WebElement TiffaCreateMAWB_FlightCarrierPrefix2;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtflightno1'])")
	public WebElement TiffaCreateMAWB_FlightCarrierNumber;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtflightno2'])")
	public WebElement TiffaCreateMAWB_FlightCarrierNumber2;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtflightdate1'])/parent::td/img")
	public WebElement TiffaCreateMAWB_CalenderIcon;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtflightdate2'])/parent::td/img")
	public WebElement TiffaCreateMAWB_CalenderIcon2;
	
	@FindBy(css = "#ui-datepicker-div > table > tbody > tr:nth-child(1) > td.ui-datepicker-today")
	public WebElement TiffaCreateMAWB_CalenderTodayDate1;
	
	@FindBy(css = "#ui-datepicker-div > table > tbody > tr:nth-child(2) > td.ui-datepicker-today")
	public WebElement TiffaCreateMAWB_CalenderTodayDate2;
	
	@FindBy(css = "#ui-datepicker-div > table > tbody > tr:nth-child(3) > td.ui-datepicker-today")
	public WebElement TiffaCreateMAWB_CalenderTodayDate3;
	
	@FindBy(css = "#ui-datepicker-div > table > tbody > tr:nth-child(4) > td.ui-datepicker-today")
	public WebElement TiffaCreateMAWB_CalenderTodayDate4;
	
	@FindBy(css = "#ui-datepicker-div > table > tbody > tr:nth-child(5) > td.ui-datepicker-today")
	public WebElement TiffaCreateMAWB_CalenderTodayDate5;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_Chkisaggreed'])")
	public WebElement TiffaCreateMAWB_RateAgreeCheckBox;
	
	@FindBy(xpath = "(//*[@id='addDimensions_1'])")
	public WebElement TiffaCreateMAWB_AddDimenssionIcon1;
	
	@FindBy(xpath = "(//*[@id='txtNoPcs_1'])")
	public WebElement TiffaCreateMAWB_DimmensionNoofPics1;
	
	@FindBy(xpath = "(//*[@id='txtLength_1'])")
	public WebElement TiffaCreateMAWB_DimmensionLength1;
	
	@FindBy(xpath = "(//*[@id='txtWidth_1'])")
	public WebElement TiffaCreateMAWB_DimmensionWidth1;
	
	@FindBy(xpath = "(//*[@id='txtHeight_1'])")
	public WebElement TiffaCreateMAWB_DimmensionHeight1;
	
	@FindBy(xpath = "(//*[@id='txtDmnSlac_1'])")
	public WebElement TiffaCreateMAWB_DimmensionSLAC1;
	
	@FindBy(xpath = "(//*[text()='Dimensions'])/parent::div/parent::div/div[11]/button[1]/span")
	public WebElement TiffaCreateMAWB_DimmensionOkButton;
	
	@FindBy(xpath = "(//*[@id='txtCgGrWt_1'])")
	public WebElement TiffaCreateMAWB_DimmensionGrossWeight;
	
	@FindBy(xpath = "(//*[@id='selRateClass_1'])")
	public WebElement TiffaCreateMAWB_DimmensionRateClass;
	
	@FindBy(xpath = "(//*[@id='txtCgChargWt_1'])")
	public WebElement TiffaCreateMAWB_DimmensionChargableWeight;
	
	@FindBy(xpath = "(//*[@id='txtCgDesc_1'])")
	public WebElement TiffaCreateMAWB_DimmensionNatureofGoods;
	
	@FindBy(xpath = "(//*[@id='HSCode_1'])")
	public WebElement TiffaCreateMAWB_HSCodeIcon;
	
	@FindBy(xpath = "(//*[@id='txtHSCode_1'])")
	public WebElement TiffaCreateMAWB_HSCodeText;
	
	@FindBy(xpath = "(//*[text()='HS Code Detail'])/parent::div/parent::div/div[11]/button[1]/span")
	public WebElement TiffaCreateMAWB_HSCodeOkButton;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnSaveAwb'])")
	public WebElement TiffaCreateMAWB_SaveShipmentButton;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnCHANo'])")
	public WebElement TiffaCreateMAWB_SaveShipmentOKPopup;
	
	@FindBy(xpath = "(//*[@id='ctl00_divLeftPan'])/div/div/div/div/h2/a")
	public WebElement TiffaCreateMAWB_QuickSearchLink;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_qsearch_rptSearch_ctl01_ddlSearchField'])")
	public WebElement TiffaCreateMAWB_QuickSearchFieldDropdown;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_qsearch_rptSearch_ctl01_txtSearchValue'])")
	public WebElement TiffaCreateMAWB_QuickSearchAWBNumber;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_qsearch_btnSearch'])")
	public WebElement TiffaCreateMAWB_QuickSearchButton;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdMAWB_ctl02_lnkSendFWB'])")
	public WebElement TiffaCreateMAWB_EDILink;
	
	@FindBy(xpath = "(//*[text()='EDI'])[2]/parent::div/parent::div/div[3]/button/span")
	public WebElement TiffaCreateMAWB_EDIOkPopup;
	
	@FindBy(xpath = "(//*[@name='loginfmt'])")
	public WebElement TiffaOutlookID;
	
	@FindBy(xpath = "(//*[@type='submit'])")
	public WebElement TiffaOutlookIDNextButton;
	
	@FindBy(xpath = "(//*[@type='password'])")
	public WebElement TiffaOutlookPasswordField;
	
	@FindBy(xpath = "(//*[@type='submit'])")
	public WebElement TiffaOutlookSignInButton;
	
	@FindBy(xpath = "(//*[@title='edi@upliftindia.com'])[1]")
	public WebElement TiffaOutlookEDIMail;
	
	@FindBy(xpath = "(//*[@class='PlainText'])")
	public WebElement TiffaOutlookNHNumber;
	
	@FindBy(xpath = "(//*[@aria-label='Reply all'])[3]")
	public WebElement TiffaOutlookScroll;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_ViaRoute1_txtCode'])")
	public WebElement TiffaCreateMAWB_RoutingInfoVia;
	
	//------------------------ End Direct --------------------------
	
	@FindBy(xpath = "(//input[@id='ctl00_hldPage_rdoConsol'])")
	public WebElement TiffaCreateMAWBColson_ConsolRadiButton;
	
	@FindBy(xpath = "(//input[@id='ctl00_hldPage_rdoLive'])")
	public WebElement TiffaCreateMAWBColson_LiveRadioButton;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnYes'])")
	public WebElement TiffaCreateMAWBConsol_HouseJobPopupYes;
	
	@FindBy(xpath = "(//input[@id='ctl00_hldPageHeader_txtAgentSelect'])")
	public WebElement TiffaCreateMAWBConsol_IssueCarrier;
	
	@FindBy(xpath = "(//input[@id='ctl00_hldPageHeader_rptHouse_ctl01_txtHAWBNo'])")
	public WebElement TiffaCreateMAWBConsol_HAWBNumber1;
	
	@FindBy(xpath = "(//input[@id='ctl00_hldPageHeader_rptHouse_ctl02_txtHAWBNo'])")
	public WebElement TiffaCreateMAWBConsol_HAWBNumber2;
	
	@FindBy(xpath = "(//img[@id='AddShipperbtn_1'])[1]")
	public WebElement TiffaCreateMAWBConsol_AddShipperIcon1;
	
	@FindBy(xpath = "(//img[@id='AddShipperbtn_1'])[2]")
	public WebElement TiffaCreateMAWBConsol_AddShipperIcon2;
	
	@FindBy(xpath = "(//input[@id='ctl00_hldPage_btnSaveShipConsignee'])")
	public WebElement TiffaCreateMAWBConsol_AddShipperSaveButton;

	@FindBy(xpath = "/html/body/form/div[8]/div[11]/button[1]")
	public WebElement TiffaCreateMAWBConsol_AddShipperOKButton;
	
	@FindBy(xpath = "(//span[@class='ui-button-text' and contains(text(),'Close')])[1]")
	public WebElement TiffaCreateMAWBConsol_HAWBCloseButton;
	
	@FindBy(xpath = "(//img[@id='AddConsigneebtn_1'])[1]")
	public WebElement TiffaCreateMAWBConsol_AddConsigneeIcon1;
	
	@FindBy(xpath = "(//input[@id='ctl00_hldPageHeader_rptHouse_ctl01_txtOriginPortCode'])")
	public WebElement TiffaCreateMAWBConsol_Origin1;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_rptHouse_ctl01_txtDestinationPortCode'])")
	public WebElement TiffaCreateMAWBConsol_Destination1;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_rptHouse_ctl01_txtPkgs'])")
	public WebElement TiffaCreateMAWBConsol_HAWBPkgs1;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_rptHouse_ctl01_txtWt'])")
	public WebElement TiffaCreateMAWBConsol_HAWBGrossWt1;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_rptHouse_ctl01_ddlCurrencyCode'])")
	public WebElement TiffaCreateMAWBConsol_HAWBCurrency1;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_rptHouse_ctl01_ddlChargeCode'])")
	public WebElement TiffaCreateMAWBConsol_ChargeCode1;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_rptHouse_ctl01_txtCargoDesc'])")
	public WebElement TiffaCreateMAWBConsol_HAWBCargoDesc1;
	
	@FindBy(xpath = "(//*[@id='OCI_1'])[1]")
	public WebElement TiffaCreateMAWBConsol_HAWBOCIIcon1;
	
	@FindBy(xpath = "(//select[@id='selInfidenfier_1'])[1]")
	public WebElement TiffaCreateMAWBConsol_HAWBInoIdentifier1;
	
	@FindBy(xpath = "(//select[@id='selociOperator_1'])[1]")
	public WebElement TiffaCreateMAWBConsol_HAWBITradeCode1;
	
	@FindBy(xpath = "(//*[@id='txtocicode_1'])[1]")
	public WebElement TiffaCreateMAWBConsol_HAWBITradeText1;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_AWBOci_UpdatePanelOCI'])/parent::div/parent::div/div[11]/button/span")
	public WebElement TiffaCreateMAWBConsol_HAWBTradeIdentiCodeOkButton1;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_rptHouse_ctl01_txtcvd'])")
	public WebElement TiffaCreateMAWBConsol_HAWBCVD1;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_rptHouse_ctl01_txtDVC'])")
	public WebElement TiffaCreateMAWBConsol_HAWBDVC1;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_rptHouse_ctl01_txtSLAC'])")
	public WebElement TiffaCreateMAWBConsol_HAWBSLAC1;
	
	@FindBy(xpath = "(//*[@id='HSCode_1'])[1]")
	public WebElement TiffaCreateMAWBConsol_HAWBHSCodeIcon1;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPageHeader_btnSave'])")
	public WebElement TiffaCreateMAWBConsol_HouseSaveButton;
	
	
	
	
	public void TodayDate() throws InterruptedException
    {
    	try
    	{
    		TiffaCreateMAWB_CalenderTodayDate1.click();Thread.sleep(1000);
    	}
    	catch (Exception E)
    	{
    		System.out.println("This is not first week");
    	}
    	
    	try
    	{
    		TiffaCreateMAWB_CalenderTodayDate2.click();Thread.sleep(1000);
    	}
    	catch (Exception E)
    	{
    		System.out.println("This is not Second week");
    	}
    	
    	try
    	{
    		TiffaCreateMAWB_CalenderTodayDate3.click();Thread.sleep(1000);
    	}
    	catch (Exception E)
    	{
    		System.out.println("This is not Third week");
    	}
    	
    	try
    	{
    		TiffaCreateMAWB_CalenderTodayDate4.click();Thread.sleep(1000);
    	}
    	catch (Exception E)
    	{
    		System.out.println("This is not Forth week");
    	}
    	
    	try
    	{
    		TiffaCreateMAWB_CalenderTodayDate5.click();Thread.sleep(1000);
    	}
    	catch (Exception E)
    	{
    		System.out.println("This is not Fifth week");
    	}
    }
			
	
	
}


