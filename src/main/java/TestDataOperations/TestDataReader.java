package TestDataOperations;
import static Helper.BaseVariables.*;
import static Helper.BaseObjects.read;
import static Helper.BaseVariables.Password;
import static Helper.BaseVariables.Username;
import static Helper.Constants.LoginDetailsSheetName;
import static Helper.Constants.Priyanka_EFreightPrintTerminal;
import static Helper.Constants.MasterDataSheet;

import static Helper.Constants.TestDataFile;

import Methods.ReadExcelMethod;


public class TestDataReader {
	public static void initTestDataReader() throws Exception {
		read = new ReadExcelMethod(TestDataFile);
		
	}
	
	
	
	
	public static void ReadScenarioDetails() 
	{
		
		
	}
	
	public static String AGENT_STARTPOINT(){
		String AGENT_STARTPOINT = read.GetCellDataX(LoginDetailsSheetName, "AGENT_SP", 1);
		return AGENT_STARTPOINT;
	}
	
	public static String AGENT_ENDPOINT(){
		String AGENT_ENDPOINT = read.GetCellDataX(LoginDetailsSheetName, "AGENT_EP", 1);
		return AGENT_ENDPOINT;
	}
	
	public static String GSA_STARTPOINT(){
		String AGENT_STARTPOINT = read.GetCellDataX(LoginDetailsSheetName, "AGENT_SP", 1);
		return AGENT_STARTPOINT;
	}
	
	public static String GSA_ENDPOINT(){
		String GSA_ENDPOINT = read.GetCellDataX(LoginDetailsSheetName, "GSA_EP", 1);
		return GSA_ENDPOINT;
	}
	
	public static String carriername(){
		String carriername = read.GetCellDataX(LoginDetailsSheetName, "CarrierName", 1);
		return carriername;
	}
	
	public static String carriername1(){
		String carriername1 = read.GetCellDataX(LoginDetailsSheetName, "CarrierName1", 1);
		return carriername1;
	}
	
	public static String GSAprefix(){
		String GSAprefix = read.GetCellDataX(LoginDetailsSheetName, "prefix", 1);
		return GSAprefix;
	}
	
	
	public static String carrierlocationname(){
		String carrierlocationname = read.GetCellDataX(LoginDetailsSheetName, "AirportlocationName", 1);
		return carrierlocationname;
	}
	
	public static String quantitynumber(){
		String quantitynumber = read.GetCellDataX(LoginDetailsSheetName, "quantity", 1);
		return quantitynumber;
	}
	
	public static String air_startingingpoint(){
		String air_startingingpoint = read.GetCellDataX(LoginDetailsSheetName, "air_startingingpoint", 1);
		return air_startingingpoint;
	}
	
	public static String Air_endingpoint(){
		String Air_endingpoint = read.GetCellDataX(LoginDetailsSheetName, "Air_endingpoint", 1);
		return Air_endingpoint;
	}
	
	public static String AgentStartingFrom(){
        String AgentStartingFrom = read.GetCellDataX(LoginDetailsSheetName, "AgentStartingFrom", 1);
        return AgentStartingFrom;
	}
	
	public static String AgentEndingAt(){
        String AgentEndingAt = read.GetCellDataX(LoginDetailsSheetName, "AgentEndingAt", 1);
        return AgentEndingAt;
	}
	
	public static String Remark_input(){
		String Remark_input = read.GetCellDataX(LoginDetailsSheetName, "Remark_input", 1);
		return Remark_input;
	}
	
	public static void ReadLoginDetails(String entity) throws Exception {
		int noOfRow = read.GetNoOfRow(LoginDetailsSheetName);
		for (int i = 0; i < noOfRow; i++) {
			if (read.GetCellDataX(LoginDetailsSheetName, "Entity", i).contains(entity))
			{
				System.out.println("rows= "+noOfRow);
				Username = read.GetCellDataX(LoginDetailsSheetName, "Username", i);
				Password = read.GetCellDataX(LoginDetailsSheetName, "Password", i);
				break;
			}
			else
			{
				Username = null; Password = null;
				System.out.println("Entity login details not found!!");
			}
		}	
	}

	
	

	
	public void ReadDetails(String MasterType) throws Exception
	{
		int noOfRow = read.GetNoOfRow(MasterDataSheet);
		for (int i = 0; i < noOfRow; i++) {
			if (read.GetCellDataX(MasterDataSheet, "Type", i).contains(MasterType))
			{
				System.out.println("rows= "+noOfRow);
				MasterData= read.GetCellDataX(MasterDataSheet, "LicenseNo", i);
				break;
			}
			else
			{
				MasterData = null; 
				System.out.println("Customer details not found!!");
			}
		}	
	}
	
	

	
	// ---------------------------------------------- E_Freight And Print Terminal ----------------
	
	public static String HSCListSearchECP()
	{
		String HSCListSearch = read.GetCellDataX(Priyanka_EFreightPrintTerminal, "HSC_List_Search", 1);
		return HSCListSearch;
	}
	
	public static String HSCListSearchACT()
	{
		String HSCListSearchACT = read.GetCellDataX(Priyanka_EFreightPrintTerminal, "HSC_List_Search", 2);
		return HSCListSearchACT;
	}
	
	public static String JobNameEFreight()
	{
		String JobNameEFreight = read.GetCellDataX(Priyanka_EFreightPrintTerminal, "Job_Name", 1);
		return JobNameEFreight;
	}
	
	public static String JobNameEFreightPriyanka()
	{
		String JobNameEFreightPriyanka = read.GetCellDataX(Priyanka_EFreightPrintTerminal, "Job_Name", 2);
		return JobNameEFreightPriyanka;
	}



}
