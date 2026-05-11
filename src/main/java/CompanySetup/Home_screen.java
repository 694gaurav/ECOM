package CompanySetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Home_screen {

	// Maintain all Home screen element locator
	// Only Parent links
	// Use Page Factory method

	public WebDriver driver;

	public Home_screen(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	
	@FindBy(how = How.XPATH, using = "//a[@href='#submenuCompanySetup']")
	public WebElement company_setup;

	@FindBy(how = How.XPATH, using = "//a[@href='#submenuLocationLibrary']")
	public WebElement location_library;

	@FindBy(how = How.XPATH, using = "//a[@href='#submenuSystemLibrary']")
	public WebElement system_library;

	@FindBy(how = How.XPATH, using = "//a[@href='#submenuOperation']")
	public WebElement operation;

	@FindBy(how = How.XPATH, using = "//a[@href='#submenuTariffContracts']")
	public WebElement tariff_contract;

	@FindBy(how = How.XPATH, using = "//a[@href='#submenuReportBuilder']")
	public WebElement report_buillder;

	@FindBy(how = How.XPATH, using = "//a[@href='#submenuUtility']")
	private WebElement utility;

	public void company_setup() throws Throwable {
		System.out.println("Link is display= " +company_setup.isDisplayed());
		company_setup.click();
		Thread.sleep(3000);
	}

	public void location_library_link() throws Throwable {
		System.out.println("Link is display= " +location_library.isDisplayed());
		location_library.click();
		Thread.sleep(3000);
	}

	public void system_library_link() throws Throwable {
		System.out.println("Link is display= " +system_library.isDisplayed());
		system_library.click();
		Thread.sleep(3000);
	}

	public void operation_link() throws Throwable {
		System.out.println("Link is display= " +operation.isDisplayed());
		operation.click();
		Thread.sleep(3000);
	}

	public void tariff_contract_link() throws Throwable {
		System.out.println("Link is display= " +tariff_contract.isDisplayed());
		tariff_contract.click();
		Thread.sleep(3000);
	}

	public void report_builder_link() throws Throwable {
		System.out.println("Link is display= " +report_buillder.isDisplayed());
		report_buillder.click();
		Thread.sleep(3000);
	}

	public void utility_link() throws Throwable {
		System.out.println("Link is display= " +utility.isDisplayed());
		utility.click();
		Thread.sleep(3000);
	}

	public void verify_sidebar_link() {

		System.out.println("Text = " + company_setup.getText());
		System.out.println("Text = " + location_library.getText());
		System.out.println("Text = " + system_library.getText());
		System.out.println("Text = " + operation.getText());
		System.out.println("Text = " + tariff_contract.getText());
		System.out.println("Text = " + report_buillder.getText());
		System.out.println("Text = " + utility.getText());
	}
}
