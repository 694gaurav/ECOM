package Helper;

import org.openqa.selenium.WebDriver;

import Methods.API_Methods;
import Methods.CommonMethods;
import Methods.PropertyFileUtils;
import Methods.ReadExcelMethod;
import Methods.ScreenShotMethod;
import Methods.WebDriverMethod;
import Pages.ACS_AdaniAMD_Export_XPath;
import Pages.ACS_AdaniAMD_Import_XPath;
import Pages.ACS_AdaniAMD_Admin_XPath;
import Pages.Login_Screen;
import Pages.NMIAL_Outbound_XPath;
import Pages.ACS_GHA_XPath;
import Pages.ECOM_Outbound;
import Pages.TiffaCreateAWB_XPath;
import Pages.PingCreateAWB_XPath;
import TestDataOperations.POJO;
import TestDataOperations.TestDataReader;

public class BaseObjects {

	
	public static WebDriver driver;
	public static ReadExcelMethod read;
	public static POJO pojo;
	public static PropertyFileUtils prop;
	public static ScreenShotMethod ss;
	
	public static WebDriverMethod wm;	
	public static CommonMethods cm;
	

	public static ACS_AdaniAMD_Export_XPath Export;
	public static ACS_AdaniAMD_Import_XPath Import;
	public static ACS_AdaniAMD_Admin_XPath Admin;
	public static TiffaCreateAWB_XPath Tiffa;
	
	public static NMIAL_Outbound_XPath Nmial_Outbound;
	public static ACS_GHA_XPath ACS_GHA;
	public static PingCreateAWB_XPath Ping;
	
	public static ECOM_Outbound ECOM_Outbound;

	
public static Login_Screen loginScreen;
//	public static Home_Screen homeScreen;
//	public static ExportsPage exportsScreen;
//	public static ImportsPage importscreen;
	
	public static TestDataReader testData;
	
	
	

}
