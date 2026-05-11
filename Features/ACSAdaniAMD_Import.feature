# Stack Holder Payal Baviskar
#FF Login ACSAMD_AAG   Kale@JAN20241

@AdaniAMDImport
Feature: ACS-Adani AMD Import feature 
  Background: Launch the ACS AdaniAMD Import application and login the application
     When I login with "FF Login" user given in "Login" sheet for Import module
  
  
#TC_42
#To verify whether user is able to print the TSP print on click Print button from TSP payment screen
 @AdaniAMDImport_01  @AdaniAMDImport_Rerun
   Scenario: To verify whether user is able to create Direct Shipment from Add MAWB/HAWB screen, self trade partner, single VT Multiple BoE
     Given User should be able to click on Imports mode
     Then User should check Shipment Details page should be displayed
     Then User should be able to click on Add MAWB/HAWB button
     Then User should be able to enter all the MAWB Details
     Then User should able to click on the Save button
     Then User should logout import module application 
     When I login with "Kale Airline" user given in "Login" sheet for Import module
     Given User should be able to click on Imports mode
     Then User should search HAWB number in airline login
     Then User should click on Pending DO icon of the new entry in the Action coloum
     Then User should click on Track and Trace link
     Then User should logout import module application
     When I login with "FF Login" user given in "Login" sheet for Import module
     Given User should be able to click on Imports mode
     Then User should search HAWB number in shipment details page
     Then User should be able to click on the BoE milestone for direct shipment
     Then User should enter valid BoE deatils
     Then User should upload document for BoE
     Then User should save BoE details
     Then User should be able to click on the TSP milestone for direct shipment self assign
     Then User should prosess TSP payment for self
     Then User should enter valid details for TSP payment and submmit
     Then To verify whether user is able to print the TSP print on click Print button from TSP payment screen
     Then To verify whether the user is able to click OOC milestone 
     Then User should fill valid details for OOC  
     Then User should upload document for OOC
     Then User should save OOC details
     Then User should select VT checkbox 
     Then User should click on generate token button 
     Then User should check if user is able to create single VT for multiple BoE using add shipment button
     Then User should enter valid vechicle details    
     Then User should click on Track and Trace link
     Then User should search HAWB number in track and trace page
     
     
### @AdaniAMDImport_02
   #Scenario: To verify whether user is able to create Consol Shipment from Add MAWB/HAWB screen, Multiple HAWB, Same CHA
     #Given User should be able to click on Imports mode
     #Then User should check Shipment Details page should be displayed
     #Then User should be able to click on Add MAWB/HAWB button
     #Then User should be able to enter all the MAWB Details
     #Then User should be able to enter multiple HAWB Details
     #Then User should able to click on the Save button
     #Then User should logout import module application 
     #When I login with "Kale Airline" user given in "Login" sheet for Import module
     #Given User should be able to click on Imports mode
     #Then User should search HAWB number in airline login
     #Then User should click on Pending DO icon of the new entry in the Action coloum
     #Then User should logout import module application
     #When I login with "FF Login" user given in "Login" sheet for Import module
     #Given User should be able to click on Imports mode
     #Then User should search HAWB number in shipment details page
     #Then User should click on Pending icon of Weight Verification
     #Then User should click on Upload Document icon against the HAWB record
     #Then User should click on MAWB Choose file button to upload the file
     #Then User should click on CONSOL Manifest Choose file button to upload the file
     #Then User should click on Upload button 
     #Then User should be able to click on Submit button
     #Then To verify whether the user is able to click Consol DO and assign the shipment as self for Consol Shipment
     #Then User should be able to click on the BoE milestone for direct shipment
     #Then User should enter valid BoE deatils for single HAWB
     #Then User should upload document for BoE
     #Then User should save BoE details
     

    @AdaniAMDImport_03  @AdaniAMDImport_Rerun
   Scenario: To verify whether user is able to create Consol Shipment from Add MAWB/HAWB screen, Single HAWB, Different CHA, single VT for single BoE 
     Given User should be able to click on Imports mode
     Then User should check Shipment Details page should be displayed
     Then User should be able to click on Add MAWB/HAWB button
     Then User should be able to enter all the MAWB Details
     Then User should be able to enter single HAWB Details
     Then User should able to click on the Save button
     Then User should logout import module application 
     When I login with "Kale Airline" user given in "Login" sheet for Import module
     Given User should be able to click on Imports mode
     Then User should search HAWB number in airline login
     Then User should click on Pending DO icon of the new entry in the Action coloum
     Then User should logout import module application
     When I login with "FF Login" user given in "Login" sheet for Import module
     Given User should be able to click on Imports mode
     Then User should search HAWB number in shipment details page
     Then User should click on Pending icon of Weight Verification
     Then User should click on Upload Document icon against the HAWB record
     Then User should click on MAWB Choose file button to upload the file
     Then User should click on CONSOL Manifest Choose file button to upload the file
     Then User should click on Upload button 
     Then User should be able to click on Submit button
     Then To verify whether the user is able to click Consol DO and assign the shipment as Jeena CHA for Consol Shipment
     Then User should logout import module application 
     When I login with "CB Login" user given in "Login" sheet for Import module
     Given User should be able to click on Imports mode
     ##Then User should search HAWB number in shipment details page
     Then User should be able to click on the BoE milestone for direct shipment
     Then User should enter valid BoE deatils with customs broker code
     Then User should upload document for BoE
     Then User should save BoE details
     Then User should be able to click on the TSP milestone for direct shipment self assign
     Then User should prosess TSP payment for self
     Then User should enter valid details for TSP payment and submmit
     Then To verify whether the user is able to click OOC milestone 
     Then User should fill valid details for OOC  
     Then User should upload document for OOC
     Then User should save OOC details
     Then User should select VT checkbox 
     Then User should click on generate token button     
     Then User should enter valid vechicle details
  

  #TC_27   
 @AdaniAMDImport_04   @AdaniAMDImport_Rerun
   Scenario: To verify whether user is able to create Direct Shipment from Add MAWB/HAWB screen, self trade partner, Multiple VT single BoE, Generate token button
     Given User should be able to click on Imports mode
     Then User should check Shipment Details page should be displayed
     Then User should be able to click on Add MAWB/HAWB button
     Then User should be able to enter all the MAWB Details
     Then User should able to click on the Save button
     Then User should logout import module application 
     When I login with "Kale Airline" user given in "Login" sheet for Import module
     Given User should be able to click on Imports mode
     Then User should search HAWB number in airline login
     Then User should click on Pending DO icon of the new entry in the Action coloum
     Then User should logout import module application
     When I login with "FF Login" user given in "Login" sheet for Import module
     Given User should be able to click on Imports mode
     Then User should search HAWB number in shipment details page
     Then User should be able to click on the BoE milestone for direct shipment
     Then User should enter valid BoE deatils
     Then User should upload document for BoE
     Then User should save BoE details
     Then User should be able to click on the TSP milestone for direct shipment self assign
     Then User should prosess TSP payment for self
     Then User should enter valid details for TSP payment and submmit
     Then To verify whether the user is able to click OOC milestone 
     Then User should fill valid details for OOC  
     Then User should upload document for OOC
     Then User should save OOC details
     Then User should click on generate token button
     Then User should check if user is able to create single VT for multiple BoE using add shipment button
     Then User should enter valid vechicle details if user is able to create multiple VT for single BoE
 
 #TC_21 , TC_25   
  @AdaniAMDImport_05
   Scenario: To verify whether user is able to Submit the BoE and TSP when ADO is Pending for Direct AWB
     Given User should be able to click on Imports mode
     Then User should check Shipment Details page should be displayed
     Then User should be able to click on Add MAWB/HAWB button
     Then User should be able to enter all the MAWB Details
     Then User should able to click on the Save button
     Then User should search HAWB number in shipment details page
     Then User should be able to click on the BoE milestone for direct shipment
     Then User should be able to click on the TSP milestone for direct shipment self assign
     
  #TC_23, TC_24
  @AdaniAMDImport_06
   Scenario: To verify whether user is able to Submit OOC and TSP when BoE is pending
      Given User should be able to click on Imports mode
     Then User should check Shipment Details page should be displayed
     Then User should be able to click on Add MAWB/HAWB button
     Then User should be able to enter all the MAWB Details
     Then User should able to click on the Save button
     Then User should logout import module application 
     When I login with "Kale Airline" user given in "Login" sheet for Import module
     Given User should be able to click on Imports mode
     Then User should search HAWB number in airline login
     Then User should click on Pending DO icon of the new entry in the Action coloum
     Then User should logout import module application
     When I login with "FF Login" user given in "Login" sheet for Import module
     Given User should be able to click on Imports mode
     Then User should search HAWB number in shipment details page
     Then To verify whether the user is able to click OOC milestone 
     
  #TC_26, TC_28
  @AdaniAMDImport_07 @AdaniAMDImport_Rerun
   Scenario: To verify whether user is able to Generate Token when TSP is pending, Revoke and Send ADO again from Airlines login
     Given User should be able to click on Imports mode
     Then User should check Shipment Details page should be displayed
     Then User should be able to click on Add MAWB/HAWB button
     Then User should be able to enter all the MAWB Details
     Then User should able to click on the Save button
     Then User should logout import module application 
     When I login with "Kale Airline" user given in "Login" sheet for Import module
     Given User should be able to click on Imports mode
     Then User should search HAWB number in airline login
     Then User should click on Pending DO icon of the new entry in the Action coloum
     Then User should click on Revoke hyperlink
     Then System should display Confirmation message popup to Revoke ADO with Revoke button
     Then User should click on Pending DO icon of the new entry in the Action coloum
     Then User should logout import module application
     When I login with "FF Login" user given in "Login" sheet for Import module
     Given User should be able to click on Imports mode
     Then User should search HAWB number in shipment details page
     Then User should be able to click on the BoE milestone for direct shipment
     Then User should enter valid BoE deatils
     Then User should upload document for BoE
     Then User should save BoE details
     Then User should select VT checkbox 
     
   
 #TC_39, TC_41 
 @AdaniAMDImport_08  
   Scenario: To verify whether user is able to Print the VT and TSP & VT print using Print Button, edit the token on click on Edit Token button
     Given User should be able to click on Imports mode
     Then User should check Shipment Details page should be displayed
     Then User should search HAWB number for completed VT 
     Then User should be able to click on completed icon of vehicle token
     Then User should be able to click on Edit token button and User should edit details
     Then User should be able to click on completed icon of vehicle token 
     Then User should be able to clcik on Print all button
     Then User should be able to select the checkbox of only VT
     Then User should be able to click on Print button
     Then User should be able to clcik on Print all button
     Then User should be able to select the checkbox of TSP and VT
     Then User should be able to click on Print button
    
#TC_40
 @AdaniAMDImport_09   @AdaniAMDImport_Rerun
   Scenario: To verify whether user is able to Cancel the token on click of Cancel Token Button from VCT screen
     Given User should be able to click on Imports mode
     Then User should check Shipment Details page should be displayed
     Then User should be able to click on Add MAWB/HAWB button
     Then User should be able to enter all the MAWB Details
     Then User should able to click on the Save button
     Then User should logout import module application 
     When I login with "Kale Airline" user given in "Login" sheet for Import module
     Given User should be able to click on Imports mode
     Then User should search HAWB number in airline login
     Then User should click on Pending DO icon of the new entry in the Action coloum
     Then User should logout import module application
     When I login with "FF Login" user given in "Login" sheet for Import module
     Given User should be able to click on Imports mode
     #Then User should search HAWB number in shipment details page
     Then User should be able to click on the BoE milestone for direct shipment
     Then User should enter valid BoE deatils
     Then User should upload document for BoE
     Then User should save BoE details
     Then User should be able to click on the TSP milestone for direct shipment self assign
     Then User should prosess TSP payment for self
     Then User should enter valid details for TSP payment and submmit
     Then To verify whether the user is able to click OOC milestone 
     Then User should fill valid details for OOC  
     Then User should upload document for OOC
     Then User should save OOC details
     Then User should select VT checkbox 
     Then User should click on generate token button     
     Then User should enter valid vechicle details
     Then User should be able to click on completed icon of vehicle token
     Then User should able to cancel token 
     Then User should select VT checkbox 
     Then User should click on generate token button     
     Then User should enter valid vechicle details
  

  #TC_12
 @AdaniAMDImport_10   @AdaniAMDImport_Rerun
   Scenario: To check if user is able to assign the shipment to Consignee to create TSP for Direct shipment  
     Given User should be able to click on Imports mode
     Then User should check Shipment Details page should be displayed
     Then User should be able to click on Add MAWB/HAWB button
     Then User should be able to enter all the MAWB Details
     Then User should able to click on the Save button
     Then User should logout import module application 
     When I login with "Kale Airline" user given in "Login" sheet for Import module
     Given User should be able to click on Imports mode
     Then User should search HAWB number in airline login
     Then User should click on Pending DO icon of the new entry in the Action coloum
     Then User should logout import module application
     When I login with "FF Login" user given in "Login" sheet for Import module
     Given User should be able to click on Imports mode
     Then User should search HAWB number in shipment details page
     Then User should be able to click on the BoE milestone for direct shipment
     Then User should enter valid BoE deatils
     Then User should upload document for BoE
     Then User should save BoE details
     Then To verify whether the user is able to click OOC milestone 
     Then User should fill valid details for OOC  
     Then User should upload document for OOC
     Then User should save OOC details
     Then User should Select Trade Partner from drop down select consignee and click on Proceed
     Then User should logout import module application
     When I login with "Consignee Login" user given in "Login" sheet for Import module
     Then User should be able to click on the TSP milestone for direct shipment self assign
     Then User should enter valid details for TSP payment and submmit
     Then User should select VT checkbox 
     Then User should click on generate token button     
     Then User should enter valid vechicle details
     


  #@AdaniAMDImport_11 @AdaniAMDImport_Rerun @AdaniAMDImport_Rerun
   #Scenario: To verify whether user is able search token and edit token
     #Given User should be able to click on Imports mode
     #Then User should check Shipment Details page should be displayed
     #Then User should click on search token button
     #Then User should search vechicle token using token number
     #Then User should be able to click on Edit token button and User should edit details
     
     
  
 #TC_45, TC_46
  @AdaniAMDImport_12 
   Scenario: To verify whether user is able to Add, edit and delete the GST Information
     Given User should be able to click on Imports mode
     Then User should check Shipment Details page should be displayed
     Then User should go to GST Info tab
     Then User should be able to Click on Add New and GST Details page should be display
     Then User should be able to Enter all details
     Then User should be click on save button
     Then User Should display New GST Details on GST Information page
     Then User should able to edit GST Details 
     Then User should be click on save button
     Then User Should display New GST Details on GST Information page
     Then User should be able to click on delete icon and GST Information Deleted Successfully
     
 #TC_47    
 @AdaniAMDImport_13
   Scenario: To verify whether user is able to View the Transaction Report From Sub-menu of Reports
     Given User should be able to click on Imports mode
     Then User should check Shipment Details page should be displayed
     Then User should go to reports tab for sub menu Transaction Report
     Then User should Select CTO from dropdown for Transcation Report
     Then User should Select From Date from calendar or change by arrow keys from keyboard
     Then User should Select To Date from calendar or change by arrow keys from keyboard
     Then User should Click on Export to Excel button
     
  #TC_48    
  @AdaniAMDImport_14
   Scenario: To verify whether user is able to View the Dwell Time Report From Sub-menu of Reports for vechicle 
     Given User should be able to click on Imports mode
     Then User should check Shipment Details page should be displayed
     Given To verify whether the user is able to see AMD Airport name as per selection from login page
     Then User should go to reports tab for sub menu Dwell Time Report
     Then User should Select From Date from calendar or change by arrow keys from keyboard
     Then User should Select To Date from calendar or change by arrow keys from keyboard
     Then User should Select Import Mode from dropdown
     Then User should Select Kale GHA1 CTO from dropdown for Dwell Time Report
     Then User should be able to Select the Dwell Time for Vehical
     Then User should Click on Export to Excel button
     
   #TC_49
 @AdaniAMDImport_15
   Scenario: To verify whether user is able to View the Dwell Time Report From Sub-menu of Reports for shipment
     Given User should be able to click on Imports mode
     Then User should check Shipment Details page should be displayed
     Then User should go to reports tab for sub menu Dwell Time Report
     Then User should Select From Date from calendar or change by arrow keys from keyboard
     Then User should Select To Date from calendar or change by arrow keys from keyboard
     Then User should Select Import Mode from dropdown
     Then User should Select Kale GHA1 CTO from dropdown for Dwell Time Report
     Then User should be able to Select the Dwell Time for shipment
     Then User should Click on Export to Excel button
  
 #TC_50   
  @AdaniAMDImport_16
   Scenario: To verify whether user is able to View the Tonnage Report
    Given User should be able to click on Imports mode
     Then User should check Shipment Details page should be displayed
     Then User should go to reports tab for sub menu Tonnage Report
     Then User should Select Import Mode from dropdown for Tonnage Report
     Then User should Select Kale GHA1 CTO from dropdown for Tonnage Report
     Then User should be able to select the Shipment Type From Dropdown
     Then User should be able to select the Commodity Type From Dropdown
     Then User should be able to select the Airline From Dropdown
     Then User should be able to enter Airport code in Airport field
     Then User should Click on Export to Excel button
     
 #TC_51 
  @AdaniAMDImport_17 
   Scenario: To verify whether user is able to release and revoke DO in bulk
     Given User should be able to click on Imports mode
     Then User should check Shipment Details page should be displayed
     Then User should be able to click on Add MAWB/HAWB button
     Then User should be able to enter all the MAWB Details
     Then User should be able to enter multiple HAWB Details
     Then User should able to click on the Save button
     Then User should logout import module application 
     When I login with "Kale Airline" user given in "Login" sheet for Import module
     Given User should be able to click on Imports mode
     Then User should search HAWB number in airline login
     Then User should click on Pending DO icon of the new entry in the Action coloum
     Then User should logout import module application
     When I login with "FF Login" user given in "Login" sheet for Import module
     Given User should be able to click on Imports mode
     Then User should search HAWB number in shipment details page
     Then User should click on Pending icon of Weight Verification
     Then User should click on Upload Document icon against the HAWB record
     Then User should click on MAWB Choose file button to upload the file
     Then User should click on CONSOL Manifest Choose file button to upload the file
     Then User should click on Upload button
     Then User should be able to click on Submit button
     Then User should be able to click on Release and Revoke button
     #Then User should be able to click on checkbox to select shipment
     #Then User should be able to select CHA from dropdown
     #Then User should be able to click on Revoke DO tab
     #Then User should be able to click on checkbox to select shipment
     #Then User should be able to click on Revoke DO button
 
     

     
     
     
     
     
 		