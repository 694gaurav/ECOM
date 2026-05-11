package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.masterthought.cucumber.json.Row;

import static Helper.BaseObjects.*;
import static Helper.BaseVariables.BrowserName;
import static Helper.BaseVariables.Entity;
import static Helper.BaseVariables.Password;
import static Helper.BaseVariables.Username;
import static Helper.Constants.*;
import static Helper.Constants.URL_GHA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.*;


import Pages.ACS_GHA_XPath;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.Table.Cell;

import Pages.ACS_GHA_XPath;
import TestDataOperations.TestDataReader;
import Utils.BrowserUtils;




import io.cucumber.java.en.When;

public class Test_IntlExports {


	@When("click on e-AWB>> Create AWB hyperlink for Export INTL")
	public void click_on_e_awb_create_awb_hyperlink_for_export_intl() throws Throwable {
		Actions a= new Actions(driver);
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.eAWB_Tab, 30);
	    Thread.sleep(1000);
	    Nmial_Outbound.eAWB_Tab.click();
	    Thread.sleep(3000);
	    a.moveToElement(Nmial_Outbound.CreateAWB_Hyperlink).build().perform();
	    Thread.sleep(3000);
	    Nmial_Outbound.CreateAWB_Hyperlink.click();
	    Thread.sleep(3000);
	    wm.VisibilityOfElementExplicityWait(driver, Nmial_Outbound.ExportAWB_Tb, 30);

	}
	
	@When("select {string} CTO and enter {string} AWB number for Export INTL")
	public void select_cto_and_enter_awb_number_for_export_intl(String value1, String value2) throws Throwable {
	   Select exportCTO= new Select(Nmial_Outbound.SelectExportCTO_DD);
	   exportCTO.selectByIndex(2);
	    Thread.sleep(3000);

	   Nmial_Outbound.ExportAWBpfx_Tb.sendKeys(value1, Keys.END);
	    Thread.sleep(3000);

	   Nmial_Outbound.ExportAWB_Tb.sendKeys(wm.Random_awbNo(), Keys.END);
	    Thread.sleep(3000);

	}
	
	@When("select {string} ACS Shipper and {string} ACS Consignee for Export INTL")
	public void select_acs_shipper_and_acs_consignee_for_export_intl(String value1, String value2) throws Throwable {
		Actions a= new Actions(driver);
		Nmial_Outbound.ExportShipper_Tb.sendKeys(value1, Keys.END);
	    Thread.sleep(3000);
	    Nmial_Outbound.ExportShipper_Tb.sendKeys(" shipper", Keys.END);
	    Thread.sleep(3000);
        a.sendKeys(Keys.SHIFT);	    Thread.sleep(3000);  
        a.sendKeys(Keys.ARROW_DOWN);	    Thread.sleep(3000);       
        a.sendKeys(Keys.ENTER);

    // Press ENTER to select the highlighted option
	    Thread.sleep(3000);

		Nmial_Outbound.ExportConsignee_Tb.sendKeys(value1, Keys.END);
	    Thread.sleep(3000);
	    Nmial_Outbound.ExportConsignee_Tb.sendKeys(" consignee", Keys.END);
	    Thread.sleep(3000);
        a.sendKeys(Keys.SHIFT);	    Thread.sleep(3000);  
        a.sendKeys(Keys.ARROW_DOWN);	    Thread.sleep(3000);       
        a.sendKeys(Keys.ENTER);
        
        wm.scrollTillElement(driver, Nmial_Outbound.AirportOfDeparture_Icon);
	    Thread.sleep(3000);


	}
	
	@When("click on Airport of Departure icon,select {string} Destination Port and enter {string} Requested flight for Export INTL")
	public void click_on_airport_of_departure_icon_select_destination_port_and_enter_requested_flight_for_export_intl(String value1, String value2) throws Throwable {
		Nmial_Outbound.AirportOfDeparture_Icon.click();
	    Thread.sleep(3000);
	    Nmial_Outbound.DestnPortPfx_Tb.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
	    Nmial_Outbound.DestnPortPfx_Tb.sendKeys(value1, Keys.TAB);
	    Thread.sleep(3000);
	    
	    Nmial_Outbound.RoutingOk_Btn.click();
	    Thread.sleep(3000);
	    
	    Select chargeCodeDD= new Select(Nmial_Outbound.ChargeCode_DD);
	    chargeCodeDD.selectByVisibleText("CC");
	    Thread.sleep(3000);

	    wm.scrollTillElement(driver, Nmial_Outbound.RequestedFlight_Tb);
//	    Nmial_Outbound.RequestedFlightPfx_Tb.sendKeys("BA", Keys.END);
	    Nmial_Outbound.RequestedFlight_Tb.sendKeys(wm.RandomNo(4), Keys.END);
	    Thread.sleep(3000);
	    
        wm.scrollTillElement(driver, Nmial_Outbound.HandlingInformation_Tb);
        Nmial_Outbound.HandlingInformation_Tb.sendKeys("AOG", Keys.END);
	    Thread.sleep(3000);
	    wm.scrollTillElement(driver, Nmial_Outbound.RatesAgreed_Cb);
//	    Nmial_Outbound.RatesAgreed_Cb.click();
	    Thread.sleep(3000);

        wm.scrollTillElement(driver, Nmial_Outbound.Dimensions_Icon);
        Nmial_Outbound.Dimensions_Icon.click();
	    Thread.sleep(3000);
        
    }
	
	@When("enter {string} NOP Dimensions with {string} Due Agent, {string} Due Carrier details for Export INTL")
	public void enter_nop_dimensions_with_due_agent_due_carrier_details_for_export_intl(String string, String string2, String string3) throws Throwable {
	    Nmial_Outbound.NoPcs_Tb.sendKeys("5", Keys.END);	    Thread.sleep(3000);
	    Nmial_Outbound.ExportLength_Tb.sendKeys("30", Keys.END);	Thread.sleep(1000);
	    Nmial_Outbound.ExportWidth_Tb.sendKeys("20", Keys.END);	    Thread.sleep(1000);
	    Nmial_Outbound.ExportHeight_Tb.sendKeys("20", Keys.END);	    Thread.sleep(3000);
//	    Nmial_Outbound.DimensionOk_Btn.click();	    
	    Thread.sleep(8000);
//        wm.scrollTillElement(driver, Nmial_Outbound.NopGrWt_Tb);
	    Nmial_Outbound.NopGrWt_Tb.sendKeys("1000", Keys.END);
	    Thread.sleep(3000);

	    Select rateDD= new Select(Nmial_Outbound.RateClass_DD);
	    rateDD.selectByVisibleText("Q");
	    Thread.sleep(3000);

	    Nmial_Outbound.ChargeableWtDimension_Tb.sendKeys("3000", Keys.TAB);
	    Thread.sleep(3000);

//	    Nmial_Outbound.RateCharge_Tb.sendKeys("5", Keys.TAB);
//	    Thread.sleep(5000);

//	    Nmial_Outbound.RateCharge_Tb.click();
//	    Thread.sleep(3000);
//	    Nmial_Outbound.NatureOfGoods_Tb.sendKeys("Perishable", Keys.END);
//	    Thread.sleep(8000);
	    Nmial_Outbound.SelectCustomBroker_DD.click();	    Thread.sleep(3000);
	    Nmial_Outbound.EDS_Cb.click();	    Thread.sleep(3000);


	    wm.scrollTillElement(driver, Nmial_Outbound.DueAgent_Tb);
	    Thread.sleep(20000);
	    Nmial_Outbound.DueAgent_Tb.sendKeys("MYA", Keys.END);	    Thread.sleep(3000);
	    Nmial_Outbound.ChargeDueAgent_Tb.sendKeys("20", Keys.END);	    Thread.sleep(3000);
	    Nmial_Outbound.DueCarrier_Tb.sendKeys("MYC", Keys.END);	    Thread.sleep(3000);
	    Nmial_Outbound.ChargeDueCarrier_Tb.sendKeys("20", Keys.END);	    Thread.sleep(3000);
	    Thread.sleep(3000);
	    wm.scrollTillElement(driver, Nmial_Outbound.RatesAgreed_Cb);
	    Thread.sleep(3000);
	    Nmial_Outbound.RatesAgreed_Cb.click();	    Thread.sleep(3000);

	    wm.scrollTillElement(driver, Nmial_Outbound.SaveExportAwb_Btn);
	    Thread.sleep(3000);

	}
	
	
	@When("click on Save Exports button for Export INTL")
	public void click_on_save_exports_button_for_export_intl() throws Throwable {
		Nmial_Outbound.SaveExportAwb_Btn.click();
	    Thread.sleep(3000);

	}


}
