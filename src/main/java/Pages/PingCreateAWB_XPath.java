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

public class PingCreateAWB_XPath extends Pages.BasePage {

	public PingCreateAWB_XPath(WebDriver driver) {
		super(driver);
	
	}
	


	@FindBy(xpath = "(//a[@href='/PINGOCR_UAT/UI/AWBCreateService.aspx?mode=create&prefix=&mawbno=#'])")
	public WebElement PingCreateMAWBLink;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_UpdatePanel13'])/img")
	public WebElement PingCreateMAWB_CalenderIcon;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_UpdatePanel14'])/img")
	public WebElement PingCreateMAWB_CalenderIcon2;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_ddlCurrency'])")
	public WebElement PingCreateMAWB_CurrencyCode;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtSCICode'])")
	public WebElement PingCreateMAWB_SCI;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_GenericAutoFillCity_txtCode'])")
	public WebElement PingCreateMAWB_AWIIssueCity;
	
	
	
}


