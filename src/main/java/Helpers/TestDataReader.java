package Helpers;

import static Helpers.Constants.*;
import Methods.ReadExcelMethods;
import static Helpers.BaseVariables.*;
import static Helpers.BaseObject.*;

public class TestDataReader 
{
	public TestDataReader() throws Exception
	{
		read = new ReadExcelMethods(TestDataFile);
	}
	
	public void ReadLoginDetails(String user) throws Exception
	{
		int noOfRow = read.GetNoOfRow(LoginSheet);
		for (int i = 0; i < noOfRow; i++) {
			if (read.GetCellDataX(LoginSheet, "User", i).contains(user))
			{
				System.out.println("rows= "+noOfRow);
				Username = read.GetCellDataX(LoginSheet, "Username", i);
				Password = read.GetCellDataX(LoginSheet, "Password", i);
				break;
			}
			else
			{
				Username = null; 
				Password = null;
				System.out.println("User login details not found!!");
			}
		}		
	}
	
	public void ReadCustomerDetails(String customer) throws Exception
	{
		int noOfRow = read.GetNoOfRow(CustomerSheet);
		for (int i = 0; i < noOfRow; i++) {
			if (read.GetCellDataX(CustomerSheet, "Customer", i).contains(customer))
			{
				System.out.println("rows= "+noOfRow);
				CustomerName= read.GetCellDataX(CustomerSheet, "Customername", i);
				break;
			}
			else
			{
				CustomerName = null; 
				System.out.println("Customer details not found!!");
			}
		}	
	}
	
	
	
	
	
	
	
	
		
}
