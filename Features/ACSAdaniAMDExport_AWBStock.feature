#covered E-Docket, View Password and E-Booking function


# Stack Holder Payal Baviskar
#FF Login ACSAMD_AAG   12345678

 @AdaniAMDExport_AWBStock 
Feature: ACS-Adani AMD Export AWB Stock feature 
  Background: Launch the ACS AdaniAMD Export application and login the application
     When I login ACS Adani with "FF Login" user given in "Login" sheet for Export module
	
@AdaniAMDExport_AWBStockRequestAndApprovedForAWBStock  
   Scenario: ACS Adani AMD Export To verify user is able to send request of AWB stock to airline login and To verify user is able to approve the AWB Stock Request from Airline
     Given To verify whether the user is able to see AMD Airport name as per selection from login page
     Then User should go to AWB Stock tab for sub menu Request for AWB Stock
     Then User should Select Airline from Select drop down
     Then User should enter quantity
     Then User should Enter Remark
     Then User should Select Document Type from drop down and Upload Document
     Then User should Send request to Airline
     Then User should logout application
 		 When I login ACS Adani with "Kale Airline" user given in "Login" sheet for Export module 
 		 Then User should go to AWB Stock tab for sub menu Request Status
 		 Then User should Click on Approve button against the Requested AWB Stock record
 		 Then User should Select Manual button in Approve Request dialogue box
 		 Then User should Click on Submit button in Approve Request dialogue box
 		 Then User should enter issued quantity
 		 Then User should enter MAWB number and click on issue button
 		 Then User should logout application
 		 When I login ACS Adani with "FF Login" user given in "Login" sheet for Export module 
 		 Then User should go to AWB Stock tab for sub menu Request status
 		 Then User can verify upload document
 		 Then User can verify AWB number and status
 		 
 		 
 	@AdaniAMDExport_AWBStockAWBStockInventory   @AdaniAMDExport_KaleGHA_CTO_Rerun
   Scenario: ACS Adani AMD Export To verify whether the user is able to  assign AWB from Assign to Sub-Agent from AWB Stock Inventory
     Given To verify whether the user is able to see AMD Airport name as per selection from login page
     Then User should go to AWB Stock tab for sub menu AWB Stock Inventory
     Then User should click on Assign hyperlink
     Then User should select SubAgent from SubAgent Name drop down
     Then User should enter Issued Quantity
     Then User should select AWB checkbox
     Then User should click on Issue button
     Then User should go to AWB Stock tab for sub menu sub agent issue inventory
 		 
 @AdaniAMDExport_AWBStockAWBStatus  
   Scenario: ACS Adani AMD Export To verify AWB status screen 
     Given To verify whether the user is able to see AMD Airport name as per selection from login page
     Then User should go to AWB Stock tab for sub menu AWB Status
     Then User should enter AWB no with prefix and click on search button
     Then User should verify clear button
     Then User should verify available status
     Then User should verify used status
     Then User should verify withdrawn status
     Then User should verify export to excel
     
  @AdaniAMDExport_AWBStockSubAgentIssueInventory
   Scenario: ACS Adani AMD Export To verify  sub agent issue inventory screen
     Given To verify whether the user is able to see AMD Airport name as per selection from login page
     Then User should go to AWB Stock tab for sub menu sub agent issue inventory
     Then User should Select From Date and To Date from the calendar
     Then User should click on Search button and details grid sould be displayed
     Then User should click on Clear button and entered field should be reset
     
  @AdaniAMDExport_AWBStockSubAgentReceivedInventory
   Scenario: ACS Adani AMD Export To verify  sub agent received inventory screen
     Given To verify whether the user is able to see AMD Airport name as per selection from login page
     Then User should go to AWB Stock tab for sub menu sub agent received inventory
     Then User should Select From Date and To Date from the calendar
     Then User should click on Search button and details grid sould be displayed
     Then User should click on Clear button and entered field should be reset
         
  @AdaniAMDExport_AWBStockSubAgentAWBStatus
   Scenario: ACS Adani AMD Export To verify AWB status screen 
     Given To verify whether the user is able to see AMD Airport name as per selection from login page
     Then User should go to AWB Stock tab for sub menu Subagent AWB status
     Then User should enter AWB no with prefix and click on search button
     Then User should verify clear button
     Then User should verify available status
     Then User should verify used status
     Then User should verify withdrawn status
     Then User should verify export to excel 
     
     
     
     
     

     
    
 	
  
     
    