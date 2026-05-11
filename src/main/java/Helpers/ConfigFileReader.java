package Helpers;

import static Helpers.Constants.*;
import static Helpers.BaseObject.*;
import static Helpers.BaseVariables.*;
import Methods.PropertiesFileUtils;

public class ConfigFileReader
{
	
	public static void initConfigFileHandler() {
		props = new PropertiesFileUtils(ConfigKeysFile);
	}
	
	public static void getBrowserName() {
		BrowserName = props.getConfigKey("browser.name");
	}
	
	public static void getImplicitWait() {
		ImplicitWait = Integer.valueOf(props.getConfigKey("implicit.wait"));
	}
	
//	public static void getURL() {
//		URL = props.getConfigKey("URL");
//	}
	
	public static void getDownloadPath() { 
		DownloadPath = props.getConfigKey("DownloadFilePath");
	}
}
