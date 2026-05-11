
package Helpers;

import static Helpers.Constants.*;
import static Helpers.BaseObject.*;
import static Helpers.BaseVariables.*;

import Methods.PropertiesFileUtils;

public class API_ConfigFileReader 
{
	public static void initConfigFileHandler_API() {
		props = new PropertiesFileUtils(API_ConfigKeysFile);
	}
	
	public static void getAPI_URL() {
		API_URL = props.getConfigKey("ApiUrl");
	}
	
	public static void getAuthorization() {
		Authorization = props.getConfigKey("Authorization");
	}
	
	public static void getContentType() {
		ContentType = props.getConfigKey("ContentType");
	}
	
	public static void getUserAgent() {
		UserAgent = props.getConfigKey("UserAgent");
	}
	
	public static void getAccept() {
		Accept = props.getConfigKey("Accept");
	}
	
	public static void getHost() {
		Host = props.getConfigKey("Host");
	}
	
	public static void getConnectionName() {
		ConnectionName = props.getConfigKey("Connection");
	}
	
	public static void getContentLength() {
		ContentLength = props.getConfigKey("ContentLength");
	}
	
	public static void getSender() {
		Sender = props.getConfigKey("Sender");
	}
	
	public static void getReceiver() {
		Receiver = props.getConfigKey("Receiver");
	}
	
	public static void getCreatedBy() {
		Receiver = props.getConfigKey("CreatedBy");
	}
}
