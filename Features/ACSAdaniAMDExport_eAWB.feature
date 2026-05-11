#covered E-Docket, View Password and E-Booking function

# Stack Holder Payal Baviskar
#FF Login ACSAMD_AAG   12345678

 @AdaniAMDExport @AdaniAMDExport_eAWB
Feature: ACS-Adani AMD Export eAWB feature  
  Background: Launch the ACS AdaniAMD Export application and login the application
     When I login ACS Adani with "FF Login" user given in "Login" sheet for Export module
	
@AdaniAMDExport_eAWBSave1   @AdaniAMDExport_eAWB_Return
   Scenario: ACS Adani AMD Reports To verify Create AWB for direct shipment and Kale GHA1 CTO
     Given To verify whether the user is able to see AMD Airport name as per selection from login page
     Then User should go to e-AWB tab for sub menu Create AWB
     Then User should Select Kale GHA1 CTO from dropdown
     Then User should Select Direct shipment Type 
     Then User should enter AWB No with prefix
     Then User should add Shipper details and save
     Then User Should add Consignee details and save 
     Then User Should put other information
     Then User should save AWB job
     Then User Should Search AWB number21 for further process
 		 Then User should process ASI submission
 		 Then User Should verify carting order
 		 Then User should add Shipping Bill with single SB for kale GHA1 CTO
 		 Then User should process TSP Payment with generate token for kale GHA1 CTO
 		 
 		 @AdaniAMDExport_eAWBSave2  @AdaniAMDExport_eAWB_Return
   Scenario: ACS Adani AMD Reports To verify Create AWB for consol shipment and Kale GHA2 CTO
     Given To verify whether the user is able to see AMD Airport name as per selection from login page
     Then User should go to e-AWB tab for sub menu Create AWB
     Then User should Select Kale GHA2 CTO from dropdown
     Then User should Select Consol shipment Type 
     Then User should enter AWB No with prefix
     Then User should add House Job
     ##Then User should add Shipper details and save
     Then User Should add Consignee details and save 
     Then User Should put other information for consol job
     Then User should save AWB job
     Then User Should Search AWB number21 for further process
 		 Then User should process ASI submission
 		 ##Then User Should verify carting order
 		 Then User should add Shipping Bill with single SB for kale GHA2 CTO for consol job
 		 Then User should process TSP Payment with Vechicle token for consol shipment
      
      
  @AdaniAMDExport_eAWBSaveAsTemplete   @AdaniAMDExport_eAWB_Return
   Scenario: ACS Adani AMD Reports To verify Create AWB for direct shipment and Kale GHA1 CTO
     Given To verify whether the user is able to see AMD Airport name as per selection from login page
     Then User should go to e-AWB tab for sub menu Create AWB
     Then User should Select Kale GHA1 CTO from dropdown
     Then User should Select Direct shipment Type 
     Then User should enter AWB No with prefix
     Then User should add Shipper details and save
     Then User Should add Consignee details and save 
     Then User Should put other information
     Then User should save as template AWB job
     Then User should go to e-AWB tab for sub menu Templates
     
 #@AdaniAMDExport_EDIDashboard  
   #Scenario: ACS Adani AMD Reports To verify Create AWB for direct shipment and Kale GHA1 CTO
     #Given To verify whether the user is able to see AMD Airport name as per selection from login page
     #Then User should go to e-AWB tab for sub menu EDI Dashboard
     #Then User should verify EDI Dashboard page
     #Then User should verify Clear Button
     #Then User should verify valid AWB number
     #Then User should verify invalid AWB number
     
  
  @AdaniAMDExport_HAWBList  
   Scenario: ACS Adani AMD Reports To verify Create AWB for direct shipment and Kale GHA1 CTO
     Given To verify whether the user is able to see AMD Airport name as per selection from login page
     Then User should go to e-AWB tab for sub menu HAWB List
     Then User should verify HAWB List page
 		 Then User should check HAWB no using view icon
 		 
 	@AdaniAMDExport_HouseManifestAndAttachMAWBtoHAWB  @AdaniAMDExport_eAWB_Return
   Scenario: ACS Adani AMD Reports To verify Create AWB for direct shipment and Kale GHA1 CTO
     Given To verify whether the user is able to see AMD Airport name as per selection from login page
     Then User should go to e-AWB tab for sub menu House Manifest 
     Then User should create HAWB using house manifest menu then create shipment
     Then User should go to e-AWB tab for sub menu Attach MAWB to HAWB 
     Then User should verify attach MAWB to HAWB page
     Then User should put MAWB no with prefix for adding house
     Then User should select HAWB no from available HAWB and click on attach button
     Then User Should Search AWB number22 for further process
     Then User should process ASI submission
     Then User should add Shipping Bill with single SB for kale GHA2 CTO for consol job
 		 Then User should process TSP Payment with generate token for kale GHA1 CTO
 		 
 	 @AdaniAMDExport_HAWBDetailUpload_DownloadSampleFile 
   Scenario: ACS Adani AMD Reports To verify whether User is able to view HAWB Details Upload Tab in e-AWB sub module and Download Sample file
     Given To verify whether the user is able to see AMD Airport name as per selection from login page
     Then User should go to e-AWB tab for sub menu HAWB detail upload
     Then User should verify HAWB detail upload page
     Then User should verify is able to click on Download Sample Excel File Link
     
  @AdaniAMDExport_HAWBDetailUpload_UploadIncorrectFile 
   Scenario: ACS Adani AMD Reports To verify whether User is able to view HAWB Details Upload Tab in e-AWB sub module and Download Sample file
     Given To verify whether the user is able to see AMD Airport name as per selection from login page
     Then User should go to e-AWB tab for sub menu HAWB detail upload
     Then User should verify HAWB detail upload page
     Then User should upload incorrect HAWB file format document
     
   @AdaniAMDExport_HAWBDetailUpload_UploadCorrectFile  
   Scenario: ACS Adani AMD Reports To verify whether User is able to view HAWB Details Upload Tab in e-AWB sub module and Download Sample file
     Given To verify whether the user is able to see AMD Airport name as per selection from login page
     Then User should go to e-AWB tab for sub menu HAWB detail upload
     Then User should verify HAWB detail upload page
     Then User should upload correct HAWB file format document
     Then User should go to e-AWB tab for sub menu MAWB List
     Then User Should Search AWB number from excel for further process
     Then User should click on edit shipment for other details
     Then User should update shipment details
     Then User should save AWB job
 		 Then User should process ASI submission
 		 ##Then User Should verify carting order
 		 Then User should add Shipping Bill with single SB for kale GHA2 CTO for consol job
 		 Then User should process TSP Payment with generate token for kale GHA1 CTO
     	 
     
 

     
    
     
  
     
    