package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import Methods.CommonMethods;
import Methods.WebDriverMethod;

public class Login_Screen extends BasePage {

	public Login_Screen(WebDriver driver)
	{
		super(driver);
		
	}
	
	public Login_Screen(WebDriver driver, WebDriverMethod wm) 
	{
		super(driver);
	}
	
	Actions a= new Actions(driver);
	@FindBy(xpath="/html/body/form/div[4]/div[3]")
	public WebElement LoginScreenpage;
	
	//login email path
    @FindBy(xpath="//*[@id='txtUsrName']")
    public WebElement fillemail;
  

//login password path
	@FindBy(xpath="//*[@id='txtPswd']")
    public WebElement fillpassword;

	
//login button path
	@FindBy(xpath="//*[@name='btnLogin']")
	
	public WebElement loginbutton;
	
	//Nmial login
	@FindBy(xpath="//input[@id='txtUsrName']")
    public WebElement Username_Tb;
	
	@FindBy(xpath="//input[@id='txtPswd']")
    public WebElement Pwd_Tb;
	
	@FindBy(xpath="//input[@id='btnLogin']")
    public WebElement nmialLogin_Btn;
	
	@FindBy(xpath="//input[@id='btnClose']")
	public WebElement Authentication_Popup;
	
	@FindBy(xpath="//input[@id='txtCAPCHANew']")
	public WebElement NmialCaptcha_Tb;

	
	//GHA login
	@FindBy(xpath = "//input[@id='textfield']")
	public WebElement GHAusername_Tb;

	@FindBy(xpath="//input[@id='textfield2']")
	public WebElement GHApassword_Tb;
	
	@FindBy(xpath="//input[@id='txtOTP']")
	public WebElement RandomOTP_Tb;

	@FindBy(xpath="//input[@id='txtCaptcha']")
	public WebElement Captcha_Tb;
	
	@FindBy(xpath="//input[@id='imgButton']")
	public WebElement GHAlogin_Btn;

	@FindBy(xpath="//input[@id='btnOtp']")
	public WebElement GHA_SendOTP_Btn;
	
	//Bial login
	@FindBy(xpath="//input[@id='textfield']")
	public WebElement BIALusername_Tb;
	@FindBy(xpath="//input[@id='textfield2']")
	public WebElement BIALpassword_Tb;
	
	@FindBy(xpath="//input[@id='imgButton']")
	public WebElement BIALlogin_Btn;
	
	//ECOM Login
	@FindBy(xpath="//input[@id='txtUsrName']")
	public WebElement ECOMusrname_Tb;
    @FindBy(xpath="//input[@id='txtPswd']")
	public WebElement ECOMpwd_Tb;
    @FindBy(xpath="//input[@id='btnLogin']")
	public WebElement ECOMlogin_Btn;

	
	
	public void isLoginScreenDisplayed() throws InterruptedException
	{
		verify= WebDriverMethod.isElementPresent(driver, LoginScreenpage);
		Thread.sleep(1000);
		CommonMethods.Verify(verify, true);
	}
	public void Login(String entity, String usr, String pwd) throws Throwable
	{		
		Thread.sleep(500);
		fillemail.sendKeys(usr);
		fillpassword.sendKeys(pwd);
		Thread.sleep(1000);
		loginbutton.click();
		Thread.sleep(20000);
		
	} 
	
	public void Nmial_Login(String entity, String usr, String pwd) throws Throwable
	{		
		Thread.sleep(1000);
		Username_Tb.sendKeys(usr, Keys.TAB);
		Pwd_Tb.sendKeys(pwd, Keys.TAB);
		Thread.sleep(3000);
	//	NmialCaptcha_Tb.click();
		Thread.sleep(3000);

		a.moveToElement(nmialLogin_Btn).click(nmialLogin_Btn).build().perform();
		
//		nmialLogin_Btn.click();
		Thread.sleep(20000);
		
	} 
	

	public void GHA_Login(String entity, String usr, String pwd) throws Throwable
	{		
		Thread.sleep(500);
		GHAusername_Tb.sendKeys(usr, Keys.TAB);
		GHApassword_Tb.sendKeys(pwd, Keys.TAB);
//		RandomOTP_Tb.sendKeys("1234", Keys.END);
//		Thread.sleep(20000);
//		GHA_SendOTP_Btn.click();
//		Thread.sleep(50000);

		GHAlogin_Btn.click();
		Thread.sleep(20000);		
		
	} 
	
	public void Bial_Login(String entity, String usr, String pwd) throws Throwable
	{		
		Thread.sleep(500);
		BIALusername_Tb.sendKeys(usr, Keys.TAB);
		BIALpassword_Tb.sendKeys(pwd, Keys.TAB);
		Thread.sleep(5000);

		BIALlogin_Btn.click();
		Thread.sleep(5000);		
		
	} 

	public void ECOM_Login(String entity, String usr, String pwd) throws Throwable
	{		
		Thread.sleep(500);
		ECOMusrname_Tb.sendKeys(usr, Keys.TAB);
		ECOMpwd_Tb.sendKeys(pwd, Keys.TAB);
		Thread.sleep(5000);

		ECOMlogin_Btn.click();
		Thread.sleep(5000);		
		
	} 

}
