package Methods;

import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import static Helpers.BaseVariables.*;


import Helpers.API_ConfigFileReader;

public class API_Methods 
{
	
//	String apiUrl = null, authorization = null, contentType = null, userAgent = null;
//	String accept = null, host = null, connectionName = null, contentLength = null;
//	public WebDriver driver; 
	
//	public API_Methods(String apiUrl, String authorization, String contentType, String userAgent, 
//			String accept, String host, String connectionName, String contentLength)
//	{
//		this.apiUrl = apiUrl;
//		this.authorization = authorization;
//		this.contentType = contentType;
//		this.userAgent = userAgent;
//		this.accept = accept;
//		this.host = host;
//		this.connectionName = connectionName;
//		this.contentLength = contentLength;
//	}
	
//	public static API_ConfigFileReader API_Method;
//	API_Method = new API_ConfigFileReader();
	 
	
	public API_Methods(String apiUrl, String authorization, String contentType, String userAgent, 
			String accept, String host, String connectionName, String contentLength)
	{
		API_ConfigFileReader.initConfigFileHandler_API();
		API_ConfigFileReader.getAPI_URL();
		API_ConfigFileReader.getAuthorization();
		API_ConfigFileReader.getContentType();
		API_ConfigFileReader.getUserAgent();
		API_ConfigFileReader.getAccept();
		API_ConfigFileReader.getHost();
		API_ConfigFileReader.getConnectionName();
		API_ConfigFileReader.getContentLength();
		API_ConfigFileReader.getSender();
		API_ConfigFileReader.getReceiver();
		API_ConfigFileReader.getCreatedBy();
		
		API_URL = apiUrl;
		Authorization = authorization;
		ContentType = contentType;
		UserAgent = userAgent;
		Accept = accept;
		Host = host;
		ConnectionName = connectionName;
		ContentLength = contentLength;
	}
	
	public String Post(String requestBody) throws Throwable
	{
		API_ConfigFileReader.initConfigFileHandler_API();
		API_ConfigFileReader.getAPI_URL();
		API_ConfigFileReader.getAuthorization();
		API_ConfigFileReader.getContentType();
		API_ConfigFileReader.getUserAgent();
		API_ConfigFileReader.getAccept();
		API_ConfigFileReader.getHost();
		API_ConfigFileReader.getConnectionName();
		API_ConfigFileReader.getContentLength();
		API_ConfigFileReader.getSender();
		API_ConfigFileReader.getReceiver();
		API_ConfigFileReader.getCreatedBy();
		
		String resp = null;
		try 
		{
			URL url = new URL(API_URL);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			
			connection.setConnectTimeout(20000);
			connection.setReadTimeout(20000);
			connection.setDoOutput(true);
			connection.setUseCaches(true);
			connection.setRequestMethod("POST");
			connection.setAllowUserInteraction(true);
			
			connection.setRequestProperty("Authorization", Authorization);
			connection.setRequestProperty("Content-Type", ContentType);
			connection.setRequestProperty("User-Agent", UserAgent);
			connection.setRequestProperty("Accept", Accept);
//			connection.setRequestProperty("Postman-Token", "c8a98b81-7b59-45af-b762-113d8c6cc890");
			connection.setRequestProperty("Host", Host);
//			connection.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
			connection.setRequestProperty("Connection", ConnectionName);
			connection.setRequestProperty("Content-Length", ContentLength);
			
			DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());
			outputStream.writeBytes(requestBody);
			outputStream.flush();
			outputStream.close();
			
			int responseCode = connection.getResponseCode();
			System.out.println("Response Code: " + responseCode);
			
			InputStream inputStream = connection.getInputStream();
			byte[] res = new byte[2048];
			int i = 0;
			StringBuilder response = new StringBuilder();
			while ((i = inputStream.read(res)) != -1) {
				response.append(new String(res, 0, i));
			}
			inputStream.close();
			
			resp = response.toString();
			System.out.println("Response: " + resp);
			System.out.println("Request sucessfully sent!!!!!");
		} 
		catch (Exception e) 
		{
			System.err.println("Unable to send Request!!!!!");
			System.err.println("Exception: " + e.toString());
		}
		
		return resp;
	}
	
	public int PostResCode(String requestBody) throws Throwable
	{
		API_ConfigFileReader.initConfigFileHandler_API();
		API_ConfigFileReader.getAPI_URL();
		API_ConfigFileReader.getAuthorization();
		API_ConfigFileReader.getContentType();
		API_ConfigFileReader.getUserAgent();
		API_ConfigFileReader.getAccept();
		API_ConfigFileReader.getHost();
		API_ConfigFileReader.getConnectionName();
		API_ConfigFileReader.getContentLength();
		API_ConfigFileReader.getSender();
		API_ConfigFileReader.getReceiver();
		API_ConfigFileReader.getCreatedBy();
		
		String resp = null;
		int responseCode = 0;
		try 
		{
			URL url = new URL(API_URL);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			
			connection.setConnectTimeout(20000);
			connection.setReadTimeout(20000);
			connection.setDoOutput(true);
			connection.setUseCaches(true);
			connection.setRequestMethod("POST");
			connection.setAllowUserInteraction(true);
			
			connection.setRequestProperty("Authorization", Authorization);
			connection.setRequestProperty("Content-Type", ContentType);
			connection.setRequestProperty("User-Agent", UserAgent);
			connection.setRequestProperty("Accept", Accept);
//			connection.setRequestProperty("Postman-Token", "c8a98b81-7b59-45af-b762-113d8c6cc890");
			connection.setRequestProperty("Host", Host);
//			connection.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
			connection.setRequestProperty("Connection", ConnectionName);
			connection.setRequestProperty("Content-Length", ContentLength);
			
			DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());
			outputStream.writeBytes(requestBody);
			outputStream.flush();
			outputStream.close();
			
			responseCode = connection.getResponseCode();
			System.out.println("Response Code: " + responseCode);
			
			InputStream inputStream = connection.getInputStream();
			byte[] res = new byte[2048];
			int i = 0;
			StringBuilder response = new StringBuilder();
			while ((i = inputStream.read(res)) != -1) {
				response.append(new String(res, 0, i));
			}
			inputStream.close();
			
			resp = response.toString();
			System.out.println("Response: " + resp);
			System.out.println("Request sucessfully sent!!!!!");
		} 
		catch (Exception e) 
		{
			System.err.println("Unable to send Request!!!!!");
			System.err.println("Exception: " + e.toString());
		}
		
		return responseCode;
	}
	
	public String RequestBody_XML(String sender, String receiver, String createdBy, 
			String seqNo1, String seqNo2, 
			String event, String omsRef, String cotainerNo, 
			String timeStampDate, String timeStampTime, 
			String customerCode, String customerName, String terminal, String terminalId, 
			String size, String type, String contract, String empty, String frs, 
			String acceptanceRef, String releaseRef, String customerRef, 
			String bookedRailDate, String bookedRailTime)
	{
		String requestBody = "<TideworksDataExchange>"
				+ "<Msg>"
				+ "<HeaderData>"
				+ "<Sender>"+sender+"</Sender>"
				+ "<Receiver>"+receiver+"</Receiver>"
				+ "<CreatedBy>"+createdBy+"</CreatedBy>"
				+ "<Terminal>"+terminal+"</Terminal>"
				+ "<Message ID='5400' Type='Billing Events' Version='1.0'></Message>"
				+ "<SequenceNumber1>"+seqNo1+"</SequenceNumber1>"
				+ "<SequenceNumber2>"+seqNo2+"</SequenceNumber2>"
				+ "<TimeStamp>"+timeStampDate+"T"+timeStampTime+".45+00:00</TimeStamp>"
				+ "</HeaderData>"
				+ "<MsgData>"
				+ "<OMSReference>"+omsRef+"</OMSReference>"
				+ "<Event>"+event+"</Event>"
				+ "<EventDetails>"
				+ "<ContainerNumber>"+cotainerNo+"</ContainerNumber>"
				+ "<CustomerAccount>"+customerCode+"</CustomerAccount>"
				+ "<CustomerSuffix>00</CustomerSuffix>"
				+ "<CustomerName>"+customerName+"</CustomerName>"
				+ "<Contract>"+contract+"</Contract>"
				+ "<Size>"+size+"</Size>"
				+ "<Type>"+type+"</Type>"
				+ "<TerminalID>"+terminalId+"</TerminalID>"
				+ "<Empty>"+empty+"</Empty>"
				+ "<FRS>"+frs+"</FRS>"
				+ "<BookedRailDate>"+bookedRailDate+"T"+bookedRailTime+".45+00:00</BookedRailDate>"
				+ "<AcceptanceReference>"+acceptanceRef+"</AcceptanceReference>"
				+ "<ReleaseReference>"+releaseRef+"</ReleaseReference>"
				+ "<CustomerReference>"+customerRef+"</CustomerReference>"
				+ "</EventDetails>"
				+ "</MsgData>"
				+ "</Msg>"
				+ "</TideworksDataExchange>";
		
		System.out.println(requestBody);
		
		return requestBody;
	}
	
	public String RequestBody_XML(String sender, String receiver, String createdBy, 
			String seqNo1, String seqNo2, 
			String event, String omsRef, String cotainerNo, 
			String timeStampDate, String timeStampTime, 
			String customerCode, String customerName, String terminal, String terminalId, 
			String size, String type, String contract, String empty, String frs, 
			String acceptanceRef, String releaseRef, String customerRef)
	{
		String requestBody = "<TideworksDataExchange>"
				+ "<Msg>"
				+ "<HeaderData>"
				+ "<Sender>"+sender+"</Sender>"
				+ "<Receiver>"+receiver+"</Receiver>"
				+ "<CreatedBy>"+createdBy+"</CreatedBy>"
				+ "<Terminal>"+terminal+"</Terminal>"
				+ "<Message ID='5400' Type='Billing Events' Version='1.0'></Message>"
				+ "<SequenceNumber1>"+seqNo1+"</SequenceNumber1>"
				+ "<SequenceNumber2>"+seqNo2+"</SequenceNumber2>"
				+ "<TimeStamp>"+timeStampDate+"T"+timeStampTime+".45+00:00</TimeStamp>"
				+ "</HeaderData>"
				+ "<MsgData>"
				+ "<OMSReference>"+omsRef+"</OMSReference>"
				+ "<Event>"+event+"</Event>"
				+ "<EventDetails>"
				+ "<ContainerNumber>"+cotainerNo+"</ContainerNumber>"
				+ "<CustomerAccount>"+customerCode+"</CustomerAccount>"
				+ "<CustomerSuffix>00</CustomerSuffix>"
				+ "<CustomerName>"+customerName+"</CustomerName>"
				+ "<Contract>"+contract+"</Contract>"
				+ "<Size>"+size+"</Size>"
				+ "<Type>"+type+"</Type>"
				+ "<TerminalID>"+terminalId+"</TerminalID>"
				+ "<Empty>"+empty+"</Empty>"
				+ "<FRS>"+frs+"</FRS>"
				+ "<AcceptanceReference>"+acceptanceRef+"</AcceptanceReference>"
				+ "<ReleaseReference>"+releaseRef+"</ReleaseReference>"
				+ "<CustomerReference>"+customerRef+"</CustomerReference>"
				+ "</EventDetails>"
				+ "</MsgData>"
				+ "</Msg>"
				+ "</TideworksDataExchange>";
		
		System.out.println(requestBody);
		
		return requestBody;
	}
	
	
	
	
	
	
	
	
}
