package stepdefinition;


import static Helper.BaseObjects.driver;
import static Helper.BaseObjects.loginScreen;
import static Helper.BaseObjects.wm;
import static Helper.BaseObjects.cm;
import static Helper.BaseObjects.Export;
import static Helper.BaseObjects.Tiffa;
import static Helper.BaseObjects.Ping;
import static Helper.BaseVariables.Entity;
import static Helper.BaseVariables.Password;
import static Helper.BaseVariables.Username;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.util.Assert;
import com.graphbuilder.math.Expression;

import Methods.CommonMethods;
import Methods.WebDriverMethod;
import Methods.WebdriverMethods;
import TestDataOperations.TestDataReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TiffaCreateAWB {
	
	String TiffaAWBNumber = cm.Random_AWBNo();	
	
	String[] DestinationArray = {"LNZ","GRZ","VIE","BRU","KNO","GVA","BSL","BRN","ZRH","LCA","PRG","BRE","DTM","BER","FMO","DUS","FRA","CGN",
			"HAM","NUE","HAJ","DRS","HEI","LEJ",
			"NRD","MUC","ZHZ","STR","CPH","BLL","TLL","AGP","BIO","IBZ","MAD","BCN","VIT","VLC","HEL","BOD","LYS","LIL","NTE","CDG","SXB",	
			"MRS","NCE","TLS","ATH","ZAG","BUD","DUB","MIL","FCO","BLQ","VCE","MXP","NAP","VNO","LUX","RIX","MFM","MLA","RTM","MST","AMS",
			"OSL","SVG","WAW","KTW","WRO","LIS","OPO","OTP","MMA","GOT","ARN","MMX","NRK","LJU","BTS"};

	//List<String> nameList =newArrayList(Arrays.asList(DestinationArray));
	
	List<String> list =Arrays.asList(DestinationArray);
	

	public boolean verify;

	@When("I login Tiffa with {string} user given in {string} sheet")
	public void i_login_Tiffa_with_user_given_in_sheet(String entity, String sheetName) throws Throwable {
		Entity = entity;
		TestDataReader.ReadLoginDetails(Entity);
		Thread.sleep(500);
		System.out.println("usr= " + Username);
		System.out.println("pwd= " + Password);
		// loginScreen.isLoginScreenDisplayed();
		loginScreen.Login(Entity, Username, Password);
		Thread.sleep(8000);

	}
	
	

	@Then("^User should go to AWB services link$")
	public void User_should_go_to_AWB_services_link() throws InterruptedException, AWTException 
	{	
		System.out.println("Tiffa Create AWB");
		wm.JavascriptExecutorClick(driver, Tiffa.TiffaAWBServiceLink); Thread.sleep(3000);
	}
	
	@Then("^User should click on Create MAWB link$")
	public void User_should_click_on_Create_MAWB_link() throws InterruptedException, AWTException 
	{	
		Thread.sleep(4000);
		try
		{
			wm.JavascriptExecutorClick(driver, Tiffa.TiffaCreateMAWBLink); Thread.sleep(4000);
		}
		catch (Exception E)
		{
			wm.JavascriptExecutorClick(driver, Ping.PingCreateMAWBLink); Thread.sleep(4000);
		}
		
		
	}
	
	@Then("^User should select direct shipment$")
	public void User_should_select_direct_shipment() throws InterruptedException, AWTException 
	{	
		// by default it is selected as direct radio button
	}
	
	@Then("^User should enter AWB number with prefix$")
	public void User_should_enter_AWB_number_with_prefix() throws InterruptedException, AWTException 
	{	
		Tiffa.TiffaCreateMAWB_AWBPrefix.sendKeys("777");Thread.sleep(2000);
		Tiffa.TiffaCreateMAWB_AWBNumber.sendKeys(TiffaAWBNumber);Thread.sleep(3000);
	}
	
	@Then("^User should click on add shipper icon$")
	public void User_should_click_on_add_shipper_icon() throws InterruptedException, AWTException 
	{	
		wm.JavascriptExecutorClick(driver, Tiffa.TiffaCreateMAWB_AddShipperIcon); Thread.sleep(4000);
	}
	
	@Then("User should fill all required details for adding new shipper {string} and {string} and {string} and {string} and {string} and save")
	public void User_should_fill_all_required_details_for_adding_new_shipper_and_and_and_and_and_save(String ShipperName, String ShipperAddress, String ShipperCountry, String ShipperCity, String ShipperPincode) throws InterruptedException, AWTException 
	{	
		Tiffa.TiffaCreateMAWB_ShipperName.sendKeys(ShipperName);Thread.sleep(2000);
		Tiffa.TiffaCreateMAWB_ShipperAddress.sendKeys(ShipperAddress);Thread.sleep(2000);
		Tiffa.TiffaCreateMAWB_ShipperCountry.sendKeys(ShipperCountry);Thread.sleep(4000);
		Tiffa.TiffaCreateMAWB_ShipperCity.sendKeys(ShipperCity);Thread.sleep(5000);
		try
		{
			Robot ShipperCity1 = new Robot();
			ShipperCity1.keyPress(KeyEvent.VK_DOWN); Thread.sleep(2000);
			ShipperCity1.keyPress(KeyEvent.VK_ENTER);Thread.sleep(3000);
		}
		catch (Exception E)
		{
			System.out.println("Not needed");
			
		}
	
		
		Tiffa.TiffaCreateMAWB_ShipperPincode.sendKeys(ShipperPincode);Thread.sleep(5000);
		
		try
		{
			wm.JavascriptExecutorClick(driver, Tiffa.TiffaCreateMAWB_ShipperDetailsOKButton);Thread.sleep(3000);
		}
		catch (Exception E)
		{
			wm.JavascriptExecutorClick(driver, Tiffa.TiffaCreateMAWB_ShipperDetailsOKButton1);Thread.sleep(3000);
			
		}
		
	
		//Tiffa.TiffaCreateMAWB_ShipperDetailsOKButton.click();Thread.sleep(3000);
	}
	
	@Then("^User should click on add Consignee icon$")
	public void User_should_click_on_add_Consignee_icon() throws InterruptedException, AWTException 
	{	
		wm.JavascriptExecutorClick(driver, Tiffa.TiffaCreateMAWB_ConsigneeIcon); Thread.sleep(4000);
	}
	
	@Then("User should fill all required details for adding new Consignee {string} and {string} and {string} and {string} and {string} and save")
	public void User_should_fill_all_required_details_for_adding_new_Consignee_and_and_and_and_and_save(String ConsigneeName, String ConsigneeAddress, String ConsigneeCountry, String ConsigneeCity, String ConsigneePincode) throws InterruptedException, AWTException 
	{	
		Tiffa.TiffaCreateMAWB_ConsigneeName.sendKeys(ConsigneeName);Thread.sleep(2000);
		Tiffa.TiffaCreateMAWB_ConsigneeAddress.sendKeys(ConsigneeAddress);Thread.sleep(2000);
		Tiffa.TiffaCreateMAWB_ConsigneeCountry.sendKeys(ConsigneeCountry);Thread.sleep(4000);
		Tiffa.TiffaCreateMAWB_ConsigneeCity.sendKeys(ConsigneeCity);Thread.sleep(4000);
		
		try
		{
			Robot ConsigneeCity1 = new Robot();
			ConsigneeCity1.keyPress(KeyEvent.VK_DOWN); Thread.sleep(2000);
			ConsigneeCity1.keyPress(KeyEvent.VK_ENTER);Thread.sleep(3000);
		}
		catch (Exception E)
		{
			System.out.println("Not needed");
			
		}
		
		
		Tiffa.TiffaCreateMAWB_ConsigneePincode.sendKeys(ConsigneePincode);Thread.sleep(5000);
		
		try
		{
			wm.JavascriptExecutorClick(driver, Tiffa.TiffaCreateMAWB_ShipperDetailsOKButton1);Thread.sleep(3000);
		}
		catch (Exception E)
		{
			wm.JavascriptExecutorClick(driver, Tiffa.TiffaCreateMAWB_ShipperDetailsOKButton);Thread.sleep(3000);
			
		}
	}
	
	@Then("User should enter Issuing carrier agent name in given textbox {string}")
	public void User_should_enter_Issuing_carrier_agent_name_in_given_textbox(String IssuingCarrier) throws InterruptedException, AWTException 
	{	
		Tiffa.TiffaCreateMAWB_IssueCarrierAgentName.sendKeys(IssuingCarrier);Thread.sleep(6000);
		
		Robot IssuingCarrierName = new Robot();
		IssuingCarrierName.keyPress(KeyEvent.VK_DOWN); Thread.sleep(2000);
		IssuingCarrierName.keyPress(KeyEvent.VK_ENTER);Thread.sleep(3000);
	}
	
	@Then("^User should click on routing information icon$")
	public void User_should_click_on_routing_information_icon() throws InterruptedException, AWTException 
	{	
		wm.JavascriptExecutorClick(driver, Tiffa.TiffaCreateMAWB_RoutingInfoIcon); Thread.sleep(4000);
	}
	
	@Then("User should fill routing details without via {string} and {string} and save")
	public void User_should_fill_routing_details_without_via_and_and_save(String OriginPort, String DestiPort) throws InterruptedException, AWTException 
	{	
		Tiffa.TiffaCreateMAWB_RoutingInfoOrigin.sendKeys(OriginPort);Thread.sleep(4000);
		
		
		try
		{
			Tiffa.TiffaCreateMAWB_RoutingInfoDestination.click();Thread.sleep(2000);
			driver.switchTo().alert().accept();Thread.sleep(4000);
			
		}
		catch(Exception E)
		{
			System.out.println("");
		}
		
		Tiffa.TiffaCreateMAWB_RoutingInfoDestination.sendKeys(DestiPort);Thread.sleep(4000);
		
		
		
		wm.JavascriptExecutorClick(driver, Tiffa.TiffaCreateMAWB_RoutingInfoOkButton);Thread.sleep(4000);
	}
	
	@Then("^User should select charge code from dropdown$")
	public void User_should_select_charge_code_from_dropdown() throws InterruptedException, AWTException 
	{	
		Tiffa.TiffaCreateMAWB_ChargeCode.sendKeys("PX");Thread.sleep(4000);
	}
	
	@Then("^User should select currency code from dropdown ping$")
	public void User_should_select_currency_code_from_dropdown_ping() throws InterruptedException, AWTException 
	{	
		Ping.PingCreateMAWB_CurrencyCode.sendKeys("INR");Thread.sleep(4000);
	}
	

	@Then("^User should SCI details for ping$")
	public void User_should_SCI_details_for_ping() throws InterruptedException, AWTException 
	{	
		Ping.PingCreateMAWB_SCI.sendKeys("T1");Thread.sleep(4000);
	}
	
	@Then("^User should fill all flight details$")
	public void User_should_fill_all_flight_details() throws InterruptedException, AWTException 
	{	
		Tiffa.TiffaCreateMAWB_FlightCarrierPrefix.sendKeys("ZZ");Thread.sleep(2000);
		Tiffa.TiffaCreateMAWB_FlightCarrierNumber.sendKeys(cm.RandomNo(4));Thread.sleep(3000);
		try
		{
			Tiffa.TiffaCreateMAWB_CalenderIcon.click();Thread.sleep(3000);
		}
		catch (Exception E)
		{
			Ping.PingCreateMAWB_CalenderIcon.click();Thread.sleep(3000);
		}
		
		
		
		Tiffa.TodayDate();Thread.sleep(3000);
	}
	
	@Then("^User should click on rate as agreed checkbox$")
	public void User_should_click_on_rate_as_agreed_checkbox() throws InterruptedException, AWTException 
	{	
		Tiffa.TiffaCreateMAWB_RateAgreeCheckBox.click();Thread.sleep(3000);
		
	}
	
	@Then("^User should click on dimenssion icon$")
	public void User_should_click_on_dimenssion_icon() throws InterruptedException, AWTException 
	{	
	
		Tiffa.TiffaCreateMAWB_AddDimenssionIcon1.click();Thread.sleep(4000);
	}
	
	@Then("^User should fill all dimenssion details$")
	public void User_should_fill_all_dimenssion_details() throws InterruptedException, AWTException 
	{	
		Tiffa.TiffaCreateMAWB_DimmensionNoofPics1.sendKeys("30");Thread.sleep(2000);
		Tiffa.TiffaCreateMAWB_DimmensionLength1.sendKeys("10");Thread.sleep(2000);
		Tiffa.TiffaCreateMAWB_DimmensionWidth1.sendKeys("15");Thread.sleep(2000);
		Tiffa.TiffaCreateMAWB_DimmensionHeight1.sendKeys("10");Thread.sleep(2000);
		Tiffa.TiffaCreateMAWB_DimmensionSLAC1.sendKeys("30");Thread.sleep(4000);
		Tiffa.TiffaCreateMAWB_DimmensionOkButton.click();Thread.sleep(5000);
		Tiffa.TiffaCreateMAWB_DimmensionGrossWeight.sendKeys("300");Thread.sleep(2000);
		Tiffa.TiffaCreateMAWB_DimmensionRateClass.sendKeys("Q");Thread.sleep(2000);
		////Tiffa.TiffaCreateMAWB_DimmensionChargableWeight.sendKeys("300");Thread.sleep(1000);
		Tiffa.TiffaCreateMAWB_DimmensionNatureofGoods.sendKeys("PAPER");Thread.sleep(2000);
	}
	
	@Then("^User should click on HS code icon$")
	public void User_should_click_on_HS_code_icon() throws InterruptedException, AWTException 
	{	
		
		Tiffa.TiffaCreateMAWB_HSCodeIcon.click();Thread.sleep(4000);
	}
	
	@Then("User should enter HS code and {string} save")
	public void User_should_enter_HS_code_and_save(String HSCode) throws InterruptedException, AWTException 
	{	
		Tiffa.TiffaCreateMAWB_HSCodeText.sendKeys(HSCode);Thread.sleep(3000);
		Tiffa.TiffaCreateMAWB_HSCodeOkButton.click();Thread.sleep(4000);
	}
	
	@Then("User should enter AWI issue city for ping {string}")
	public void User_should_enter_AWI_issue_city_for_ping(String ShipperCity) throws InterruptedException, AWTException 
	{	
		Ping.PingCreateMAWB_AWIIssueCity.sendKeys(ShipperCity);Thread.sleep(3000);
		
		Robot IssueCity = new Robot();
		IssueCity.keyPress(KeyEvent.VK_DOWN); Thread.sleep(2000);
		IssueCity.keyPress(KeyEvent.VK_ENTER);Thread.sleep(3000);
		
		try
		{
			driver.switchTo().alert().accept();
		}
		catch (Exception E)
		{
			System.out.println("Popup not available");
		}
		
	}
	
	
	@Then("^User should click on save button for saving shipment$")
	public void User_should_click_on_save_button_for_saving_shipment() throws InterruptedException, AWTException 
	{	
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    js1.executeScript("arguments[0].scrollIntoView();",Tiffa.TiffaCreateMAWB_SaveShipmentButton);Thread.sleep(2000);
	    
		Tiffa.TiffaCreateMAWB_SaveShipmentButton.click();Thread.sleep(15000);
		try
		{
			driver.switchTo().alert().accept();
		}
		catch (Exception E)
		{
			System.out.println("OCI not required");
		}
		Thread.sleep(12000);
		wm.JavascriptExecutorClick(driver, Tiffa.TiffaCreateMAWB_SaveShipmentOKPopup);Thread.sleep(12000);
	}
	
	@Then("^User should click on quick search for searching AWB number$")
	public void User_should_click_on_quick_search_for_searching_AWB_number() throws InterruptedException, AWTException 
	{	
		Tiffa.TiffaCreateMAWB_QuickSearchLink.click();Thread.sleep(2000);
		
		 Select SelectCTO = new Select(Tiffa.TiffaCreateMAWB_QuickSearchFieldDropdown);
		 SelectCTO.selectByVisibleText("MAWB Number");Thread.sleep(2000);
		 
		 Tiffa.TiffaCreateMAWB_QuickSearchAWBNumber.sendKeys(TiffaAWBNumber);Thread.sleep(3000);
		 Tiffa.TiffaCreateMAWB_QuickSearchButton.click();Thread.sleep(10000);
	}

	@Then("^User should send EDI mail$")
	public void User_should_send_EDI_mail() throws InterruptedException, AWTException 
	{	
		Thread.sleep(5000);
		Tiffa.TiffaCreateMAWB_EDILink.click();Thread.sleep(8000);
		 

		driver.switchTo().alert().accept();
		 //driver.switchTo().alert().accept();
		 Thread.sleep(30000);
		 wm.JavascriptExecutorClick(driver, Tiffa.TiffaCreateMAWB_EDIOkPopup);Thread.sleep(10000);
	}
	
	@Then("^User should open outlook mail$")
	public void User_should_open_outlook_mail() throws InterruptedException, AWTException 
	{	
		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.TAB);	
		Thread.sleep(3000);
		wm.driver.get("https://outlook.office.com/mail/");
		Thread.sleep(5000);	
		Tiffa.TiffaOutlookID.sendKeys("Automation.testing@Kalelogistics.com");Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, Tiffa.TiffaOutlookIDNextButton);Thread.sleep(3000);
		Tiffa.TiffaOutlookPasswordField.sendKeys("kale_123");Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, Tiffa.TiffaOutlookSignInButton);Thread.sleep(3000);
		wm.JavascriptExecutorClick(driver, Tiffa.TiffaOutlookSignInButton);Thread.sleep(15000);
		
	}

	@Then("^User should select EDI mail for direct shipment without via$")
	public void User_should_select_EDI_mail_for_direct_shipment_without_via() throws InterruptedException, AWTException 
	{	
		
		wm.JavascriptExecutorClick(driver, Tiffa.TiffaOutlookEDIMail);Thread.sleep(20000);
		
		
	}
	
	
	// ------------------------------------------------
	
	
	@Then("User should fill routing details with via {string} and {string} and {string} and save")
	public void User_should_fill_routing_details_with_via_and_and_and_save(String OriginPort, String DestiPort, String Via) throws InterruptedException, AWTException 
	{	
		Tiffa.TiffaCreateMAWB_RoutingInfoOrigin.sendKeys(OriginPort);Thread.sleep(4000);
		
		try
		{
			Tiffa.TiffaCreateMAWB_RoutingInfoDestination.click();Thread.sleep(2000);
			driver.switchTo().alert().accept();Thread.sleep(4000);
			
		}
		catch(Exception E)
		{
			System.out.println("");
		}
		
		Tiffa.TiffaCreateMAWB_RoutingInfoDestination.sendKeys(DestiPort);Thread.sleep(4000);
		Tiffa.TiffaCreateMAWB_RoutingInfoVia.sendKeys(Via);Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, Tiffa.TiffaCreateMAWB_RoutingInfoOkButton);Thread.sleep(4000);
	}
	
	@Then("^User should fill all second flight details for via$")
	public void User_should_fill_all_second_flight_details_for_via() throws InterruptedException, AWTException 
	{	
		Tiffa.TiffaCreateMAWB_FlightCarrierPrefix2.sendKeys("ZZ");Thread.sleep(2000);
		Tiffa.TiffaCreateMAWB_FlightCarrierNumber2.sendKeys(cm.RandomNo(4));Thread.sleep(3000);
		
		try
		{
			Tiffa.TiffaCreateMAWB_CalenderIcon2.click();Thread.sleep(3000);
		}
		catch (Exception E)
		{
			Ping.PingCreateMAWB_CalenderIcon2.click();Thread.sleep(3000);
		}
		Tiffa.TodayDate();Thread.sleep(3000);
	}
	
	@Then("User should enter auto generate HS code and save")
	public void User_should_enter_auto_generate_HS_code_and_save() throws InterruptedException, AWTException 
	{	
		Tiffa.TiffaCreateMAWB_HSCodeText.sendKeys(cm.RandomNo(9)+"321");Thread.sleep(3000);
		Tiffa.TiffaCreateMAWB_HSCodeOkButton.click();Thread.sleep(4000);
	}
	
	// -----------------------------------
	
	
	@Then("^User should select Consol shipment$")
	public void User_should_select_Consol_shipment() throws InterruptedException, AWTException 
	{	
		wm.JavascriptExecutorClick(driver, Tiffa.TiffaCreateMAWBColson_ConsolRadiButton); Thread.sleep(2000);
	}
	
	@Then("User should add multiple house jobs {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and save")
	public void User_should_add_multiple_house_jobs_and_and_and_and_and_and_and_and_and_save(String IssuingCarrier, String ShipperAddress, String ShipperCountry, String ShipperCity, String ShipperPincode, String ConsigneeCountry, String ConsigneeCity, String OriginPort, String DestiPort) throws InterruptedException, AWTException 
	{	
		Tiffa.TiffaCreateMAWBColson_LiveRadioButton.click(); Thread.sleep(10000);
		wm.JavascriptExecutorClick(driver, Tiffa.TiffaCreateMAWBConsol_HouseJobPopupYes);Thread.sleep(15000);
		
		driver.switchTo().frame(0);
		
		Tiffa.TiffaCreateMAWBConsol_IssueCarrier.sendKeys(IssuingCarrier);Thread.sleep(6000);
		Robot IssuingCarrierName = new Robot();
		IssuingCarrierName.keyPress(KeyEvent.VK_DOWN); Thread.sleep(2000);
		IssuingCarrierName.keyPress(KeyEvent.VK_ENTER);Thread.sleep(3000);
		
		Tiffa.TiffaCreateMAWBConsol_HAWBNumber1.sendKeys("H"+cm.RandomNo(4));Thread.sleep(1000);
		Tiffa.TiffaCreateMAWBConsol_AddShipperIcon1.click();Thread.sleep(6000);		
		
		driver.switchTo().frame(0);
		
		Tiffa.TiffaCreateMAWB_ShipperName.sendKeys("Shipper"+cm.RandomNo(2));Thread.sleep(2000);
		Tiffa.TiffaCreateMAWB_ShipperAddress.sendKeys(ShipperAddress);Thread.sleep(2000);
		Tiffa.TiffaCreateMAWB_ShipperCountry.sendKeys(ShipperCountry);Thread.sleep(4000);
		Tiffa.TiffaCreateMAWB_ShipperCity.sendKeys(ShipperCity);Thread.sleep(5000);
		
		try
		{
			Robot ShipperCity1 = new Robot();
			ShipperCity1.keyPress(KeyEvent.VK_DOWN); Thread.sleep(2000);
			ShipperCity1.keyPress(KeyEvent.VK_ENTER);Thread.sleep(3000);
		}
		catch (Exception E)
		{
			System.out.println("Not needed");
			
		}
		
		
		Tiffa.TiffaCreateMAWB_ShipperPincode.sendKeys(ShipperPincode);Thread.sleep(2000);
		Tiffa.TiffaCreateMAWBConsol_AddShipperSaveButton.click();Thread.sleep(4000);
		
		driver.switchTo().defaultContent();Thread.sleep(500);
		
		driver.switchTo().frame(0);
		Tiffa.TiffaCreateMAWBConsol_AddShipperOKButton.click();Thread.sleep(4000);
		driver.switchTo().defaultContent();Thread.sleep(500);
		
		driver.switchTo().frame(0);
		Tiffa.TiffaCreateMAWBConsol_AddConsigneeIcon1.click();Thread.sleep(8000);
		
		driver.switchTo().frame(0);
		Thread.sleep(4000);
		Tiffa.TiffaCreateMAWB_ConsigneeName.sendKeys("Consignee"+cm.RandomNo(2));Thread.sleep(2000);
		Tiffa.TiffaCreateMAWB_ConsigneeAddress.sendKeys("Golden Lane");Thread.sleep(2000);
		Tiffa.TiffaCreateMAWB_ConsigneeCountry.sendKeys(ConsigneeCountry);Thread.sleep(4000);
		Tiffa.TiffaCreateMAWB_ConsigneeCity.sendKeys(ConsigneeCity);Thread.sleep(4000);
		
		try
		{
			Robot ConsigneeCity1 = new Robot();
			ConsigneeCity1.keyPress(KeyEvent.VK_DOWN); Thread.sleep(2000);
			ConsigneeCity1.keyPress(KeyEvent.VK_ENTER);Thread.sleep(3000);
		}
		catch (Exception E)
		{
			System.out.println("Not needed");
			
		}
		
		Tiffa.TiffaCreateMAWB_ConsigneePincode.sendKeys("401107");Thread.sleep(5000);
		
		//JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    //js1.executeScript("arguments[0].scrollIntoView();",Tiffa.TiffaCreateMAWBConsol_AddShipperSaveButton);Thread.sleep(5000);
	    
		wm.JavascriptExecutorClick(driver, Tiffa.TiffaCreateMAWBConsol_AddShipperSaveButton);Thread.sleep(4000);
		//Tiffa.TiffaCreateMAWBConsol_AddShipperSaveButton.click();Thread.sleep(4000);
		
      driver.switchTo().defaultContent();Thread.sleep(500);
		
		driver.switchTo().frame(0);
		Tiffa.TiffaCreateMAWBConsol_AddShipperOKButton.click();Thread.sleep(4000);
		driver.switchTo().defaultContent();Thread.sleep(500);
		
		driver.switchTo().frame(0);
		
		Thread.sleep(2000);
		
		
		Tiffa.TiffaCreateMAWBConsol_Origin1.sendKeys(OriginPort);Thread.sleep(3000);
		
		try
		{
			driver.switchTo().alert().accept();Thread.sleep(4000);
		}
		catch (Exception c)
		{
			System.out.println("No alert");
		}
		
			
	
		
		Tiffa.TiffaCreateMAWBConsol_Destination1.sendKeys(DestiPort);Thread.sleep(2000);
		Tiffa.TiffaCreateMAWBConsol_HAWBPkgs1.sendKeys("10");Thread.sleep(2000);
		Tiffa.TiffaCreateMAWBConsol_HAWBGrossWt1.sendKeys("100");Thread.sleep(2000);
		Tiffa.TiffaCreateMAWBConsol_HAWBCurrency1.sendKeys("INR");Thread.sleep(2000);
		Tiffa.TiffaCreateMAWBConsol_ChargeCode1.sendKeys("PX");Thread.sleep(2000);
		Tiffa.TiffaCreateMAWBConsol_HAWBCargoDesc1.sendKeys("Paper");Thread.sleep(2000);
		
		Tiffa.TiffaCreateMAWBConsol_HAWBOCIIcon1.click();Thread.sleep(2000);
		Tiffa.TiffaCreateMAWBConsol_HAWBInoIdentifier1.sendKeys("AGT");Thread.sleep(2000);
		Tiffa.TiffaCreateMAWBConsol_HAWBITradeCode1.sendKeys("TRADE IDENTIFICATION");Thread.sleep(2000);
		Tiffa.TiffaCreateMAWBConsol_HAWBITradeText1.sendKeys(cm.RandomNo(11));Thread.sleep(2000);
		Tiffa.TiffaCreateMAWBConsol_HAWBTradeIdentiCodeOkButton1.click();Thread.sleep(4000);
		
		Tiffa.TiffaCreateMAWBConsol_HAWBCVD1.sendKeys("100");Thread.sleep(2000);
		try
		{
			Thread.sleep(1000);
			Tiffa.TiffaCreateMAWBConsol_HAWBDVC1.sendKeys("100");Thread.sleep(2000);
		}
		catch (Exception E)
		{
			System.out.println("DVC not available");Thread.sleep(1000);
		}
		
		Tiffa.TiffaCreateMAWBConsol_HAWBSLAC1.sendKeys("10");Thread.sleep(2000);
		Tiffa.TiffaCreateMAWBConsol_HAWBHSCodeIcon1.click();Thread.sleep(2000);
		
		Tiffa.TiffaCreateMAWB_HSCodeText.sendKeys(cm.RandomNo(9)+"9876");Thread.sleep(3000);
		Tiffa.TiffaCreateMAWB_HSCodeOkButton.click();Thread.sleep(4000);
		
		// ------------------- End first house -------------------
		
		Tiffa.TiffaCreateMAWBConsol_HouseSaveButton.click();Thread.sleep(4000);
		driver.switchTo().defaultContent();Thread.sleep(500);
		Tiffa.TiffaCreateMAWBConsol_HAWBCloseButton.click();Thread.sleep(4000);
		//driver.switchTo().defaultContent();Thread.sleep(500);
	}
	
	@Then("^User should fill all dimenssion details for house job$")
	public void User_should_fill_all_dimenssion_details_for_house_job() throws InterruptedException, AWTException 
	{	
		Tiffa.TiffaCreateMAWB_DimmensionNoofPics1.sendKeys("10");Thread.sleep(2000);
		Tiffa.TiffaCreateMAWB_DimmensionLength1.sendKeys("10");Thread.sleep(2000);
		Tiffa.TiffaCreateMAWB_DimmensionWidth1.sendKeys("15");Thread.sleep(2000);
		Tiffa.TiffaCreateMAWB_DimmensionHeight1.sendKeys("10");Thread.sleep(2000);
		Tiffa.TiffaCreateMAWB_DimmensionSLAC1.sendKeys("10");Thread.sleep(4000);
		Tiffa.TiffaCreateMAWB_DimmensionOkButton.click();Thread.sleep(5000);
		//Tiffa.TiffaCreateMAWB_DimmensionGrossWeight.sendKeys("300");Thread.sleep(2000);
		Tiffa.TiffaCreateMAWB_DimmensionRateClass.sendKeys("Q");Thread.sleep(2000);
		////Tiffa.TiffaCreateMAWB_DimmensionChargableWeight.sendKeys("300");Thread.sleep(1000);
		//Tiffa.TiffaCreateMAWB_DimmensionNatureofGoods.sendKeys("PAPER");Thread.sleep(2000);
	}

	//-------------------------------
	
	/*@Then("User should fill all required details for adding new Consignee for consol {string} and {string} and {string} and {string} and {string} and save")
	public void User_should_fill_all_required_details_for_adding_new_Consignee_for_consol_and_and_and_and_and_save(String ConsigneeName, String ConsigneeAddress, String ConsigneeCountry, String ConsigneeCity, String ConsigneePincode) throws InterruptedException, AWTException 
	{	
		Tiffa.TiffaCreateMAWB_ConsigneeName.sendKeys(ConsigneeName);Thread.sleep(2000);
		Tiffa.TiffaCreateMAWB_ConsigneeAddress.sendKeys(ConsigneeAddress);Thread.sleep(2000);
		Tiffa.TiffaCreateMAWB_ConsigneeCountry.sendKeys(ConsigneeCountry);Thread.sleep(4000);
		Tiffa.TiffaCreateMAWB_ConsigneeCity.sendKeys(ConsigneeCity);Thread.sleep(4000);
		
		try
		{
			Robot ConsigneeCity1 = new Robot();
			ConsigneeCity1.keyPress(KeyEvent.VK_DOWN); Thread.sleep(2000);
			ConsigneeCity1.keyPress(KeyEvent.VK_ENTER);Thread.sleep(3000);
		}
		catch (Exception E)
		{
			System.out.println("Not needed");
			
		}
		
		
		Tiffa.TiffaCreateMAWB_ConsigneePincode.sendKeys(ConsigneePincode);Thread.sleep(5000);
		
		try
		{
			wm.JavascriptExecutorClick(driver, Tiffa.TiffaCreateMAWB_ShipperDetailsOKButton);Thread.sleep(3000);
		}
		catch (Exception E)
		{
			wm.JavascriptExecutorClick(driver, Tiffa.TiffaCreateMAWB_ShipperDetailsOKButton1);Thread.sleep(3000);
			
		}
	}*/
	
	
	@Then("User should update shipper details for ping {string} and {string} and save")
	public void User_should_update_shipper_details_for_ping_and_and_save(String ShipperCountry, String ShipperCity ) throws InterruptedException, AWTException 
	{	
		wm.JavascriptExecutorClick(driver, Tiffa.TiffaCreateMAWB_AddShipperIcon); Thread.sleep(4000);
		Tiffa.TiffaCreateMAWB_ShipperCountry.clear();Thread.sleep(1000);
		Tiffa.TiffaCreateMAWB_ShipperCountry.sendKeys(ShipperCountry);Thread.sleep(4000);
		Tiffa.TiffaCreateMAWB_ShipperCity.clear();Thread.sleep(1000);
		Tiffa.TiffaCreateMAWB_ShipperCity.sendKeys(ShipperCity);Thread.sleep(5000);
		try
		{
			Robot ShipperCity1 = new Robot();
			ShipperCity1.keyPress(KeyEvent.VK_DOWN); Thread.sleep(2000);
			ShipperCity1.keyPress(KeyEvent.VK_ENTER);Thread.sleep(3000);
		}
		catch (Exception E)
		{
			System.out.println("Not needed");
			
		}
	
		
		
		try
		{
			wm.JavascriptExecutorClick(driver, Tiffa.TiffaCreateMAWB_ShipperDetailsOKButton);Thread.sleep(3000);
		}
		catch (Exception E)
		{
			wm.JavascriptExecutorClick(driver, Tiffa.TiffaCreateMAWB_ShipperDetailsOKButton1);Thread.sleep(3000);
			
		}
		
	
		//Tiffa.TiffaCreateMAWB_ShipperDetailsOKButton.click();Thread.sleep(3000);
	}
	
	
	
	@Then("User should verify HS Code from mail {string} and {string}")
	public void User_should_verify_HS_Code_from_mail_and(String HSCode, String DestiPort) throws InterruptedException, AWTException 
	{	
		Thread.sleep(5000);
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    js1.executeScript("arguments[0].scrollIntoView();",Tiffa.TiffaOutlookScroll);Thread.sleep(5000);
	    
		
		String OutlookNHNum = (String) Tiffa.TiffaOutlookNHNumber.getText();Thread.sleep(2000);
		
		String  OriginalHSCode = HSCode;
		
		System.out.println(OutlookNHNum);Thread.sleep(2000);
		
		String HSCodeSubstring = HSCode.substring(0,6);
		
		 String Destination = DestiPort;
			
			String[] DestiPortArray = {Destination};
			List<String> list1 =Arrays.asList(DestiPortArray);
			
			
			System.out.println("Dstination Port "+list1+ "  =  " +list.contains(list1));
			
		
		System.out.println("Original HS Number = " +OriginalHSCode);Thread.sleep(2000);
		
       
		System.out.println("First six HS Code = " +HSCodeSubstring);Thread.sleep(2000);
		
		 boolean HSLength = OutlookNHNum.contains(HSCodeSubstring);
				
		System.out.println("First six HS Code verification ");
		cm.Verify(HSLength, true);
		 
		
		
				
		
		/*if (DestinationArray.(DestiPortArray))
		{
			 System.out.println("True");Thread.sleep(2000);
		}
		else
		{
			System.out.println("False");
		}*/
		
		
	}
	 
	
}	
		