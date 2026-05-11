package TestDataOperations;

import static Helper.BaseObjects.prop;
import static Helper.BaseVariables.BrowserName;
import static Helper.BaseVariables.FilePath;
import static Helper.Constants.ConfigKeysFile;

import Methods.PropertyFileUtils;
public class ConfigFileHandler {

	
	

	public static void initConfigFileHandler() {
		prop = new PropertyFileUtils(ConfigKeysFile);
	}
	
	public static void getBrowserName() {
		BrowserName = prop.getConfigKey("browser.name");
	}
	
	public static String getScreenshotPath()
	{
		FilePath= prop.getConfigKey("driverPath");
		return FilePath;
	}
	
	
}
