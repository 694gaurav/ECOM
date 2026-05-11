package Methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertyFileUtils {

	File file;
    InputStream fis;
    OutputStream fos;
    Properties pf;
	String keywordValue = null;
	
	public PropertyFileUtils(String proertiesFilePath) {
		file = new File(proertiesFilePath);
	}
	
	/**
     * To get the config key from properties files
     * @author $@ndy
     * @since 04-Nov-2021
     * @param {@link String} keywordName
     * @return {@link String} keywordValue
     */
    public String getConfigKey(String keywordName) {
		try {
			fis = new FileInputStream(file);
			pf = new Properties();
			pf.load(fis);
			keywordValue = pf.getProperty(keywordName);
			fis.close();
		} catch (Exception e) {
			keywordValue = null;
			System.err.println("get config key fail");
		}
        return keywordValue;
	}
	
    /**
     * @author $@ndy
     * @since 04-Nov-2021
     * @param {@link String} keywordName
     * @param {@link String} setValue
     */
	public void setConfigKey(String keywordName, String setValue) {
		try {
			fis = new FileInputStream(file);
			fos = new FileOutputStream(file);
			pf = new Properties();
			pf.load(fis);
			pf.setProperty(keywordName, setValue);
			pf.store(fos, "");
			fis.close();
			fos.close();
		} catch (Exception e) {
			System.err.println("set config key fail");
		}
	}


}
