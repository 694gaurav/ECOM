#covered E-Docket, View Password and E-Booking function

# Stack Holder Payal Baviskar
#FF Login ACSAMD_AAG   12345678

 @AdaniAMDExportGSTInfoAndReports 
Feature: ACS-Adani AMD Export GST Information and Reports feature 
  Background: Launch the ACS AdaniAMD Export application and login the application
     When I login ACS Adani with "FF Login" user given in "Login" sheet for Export module
	
	
	 @AdaniAMDExport_AddEditDeleteNewGSTInfo  
   Scenario: ACS Adani AMD Reports To verify whether user is able to Add, edit and delete the new GST Information
     Given To verify whether the user is able to see AMD Airport name as per selection from login page
     Then User should go to GST Info tab
     Then User should be able to Click on Add New and GST Details page should be display
     Then User should be able to Enter all details
     Then User should be click on save button
     Then User Should display New GST Details on GST Information page
     Then User should able to edit GST Details 
     Then User should be click on save button
     Then User Should display New GST Details on GST Information page
     ###Then User should be able to click on delete icon and GST Information Deleted Successfully
			
	 @AdaniAMDExport_TranscationReport  
   Scenario: ACS Adani AMD Reports To verify whether user is able to View the Transaction Report From Sub-menu of Reports
     Given To verify whether the user is able to see AMD Airport name as per selection from login page
     Then User should go to reports tab for sub menu Transaction Report
     Then User should Select CTO from dropdown for Transcation Report
     Then User should Select From Date from calendar or change by arrow keys from keyboard
     Then User should Select To Date from calendar or change by arrow keys from keyboard
     Then User should Click on Export to Excel button
     
  @AdaniAMDExport_DwellTimeReportVechicle 
   Scenario: ACS Adani AMD Reports To verify whether user is able to View the Dwell Time Report From Sub-menu of Reports for Vechicle
     Given To verify whether the user is able to see AMD Airport name as per selection from login page
     Then User should go to reports tab for sub menu Dwell Time Report
     Then User should Select From Date from calendar or change by arrow keys from keyboard
     Then User should Select To Date from calendar or change by arrow keys from keyboard
     Then User should Select Mode from dropdown
     Then User should Select CTO from dropdown for Dwell Time Report
     Then User should be able to Select the Dwell Time for Vehical
     Then User should Click on Export to Excel button
     
 @AdaniAMDExport_DwellTimeReportShipment  @AdaniAMDExportGSTInfoAndReportsRerun 
   Scenario: ACS Adani AMD Reports To verify whether user is able to View the Dwell Time Report From Sub-menu of Reports for shipment
     Given To verify whether the user is able to see AMD Airport name as per selection from login page
     Then User should go to reports tab for sub menu Dwell Time Report
     Then User should Select From Date from calendar or change by arrow keys from keyboard
     Then User should Select To Date from calendar or change by arrow keys from keyboard
     Then User should Select Mode from dropdown
     Then User should Select CTO from dropdown for Dwell Time Report
     Then User should be able to Select the Dwell Time for shipment
     Then User should Click on Export to Excel button
     
  @AdaniAMDExport_TonnageReport  @AdaniAMDExportGSTInfoAndReportsRerun
   Scenario: ACS Adani AMD Reports To verify whether user is able to View the Tonnage Report
     Given To verify whether the user is able to see AMD Airport name as per selection from login page
     Then User should go to reports tab for sub menu Tonnage Report
     #Then User should Select From Date from calendar or change by arrow keys from keyboard
     #Then User should Select To Date from calendar or change by arrow keys from keyboard
     Then User should Select Mode from dropdown for Tonnage Report
     Then User should Select CTO from dropdown for Tonnage Report
     Then User should be able to select the Shipment Type From Dropdown
     Then User should be able to select the Commodity Type From Dropdown
     Then User should be able to select the Airline From Dropdown
     Then User should be able to enter Airport code in Airport field
     Then User should Click on Export to Excel button

     
     
     
     