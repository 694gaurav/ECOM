#covered E-Docket, View Password and E-Booking function

# Stack Holder Payal Baviskar
#FF Login ACSAMD_AAG   12345678

@ACSAdaniAMDExport_eBookingPassword

@AdaniAMDExport @ACSAdaniAMDExport_eBookingPassword 
Feature: ACS-Adani AMD Export  e-Booking and password feature 
  Background: Launch the ACS AdaniAMD Export application and login the application
     When I login ACS Adani with "FF Login" user given in "Login" sheet for Export module
      
  
	
#Pass
	@AdaniAMDExport_EDocket  @ACSAdaniAMDExport_eBookingPassword 
    Scenario Outline: ACS adani AMD E-Docket requirment for bonded and same CHA, check wrong type and size of document
     Given To verify whether the user is able to see AMD Airport name as per selection from login page
 		 Then User should goto e-AWB tab for creating Quick ASI
 		 Then User should create shipment for E-Docket with quick ASI "<CTO>" CTO-Kale GHA1, Direct, Bonded, Same CHA
 		 #Then User Should Search E-Docket MAWB number "<MAWBNo_EDocket>" for further process
 		 Then User should process Advance Shipment Info ASI submission
 		 Then User should click on e-Docket milestone
 		 Then User sholud check wrong type and size of document
 		 
 		 Examples: 
      | MAWBNo_EDocket       | CTO        |
      | 00000000             | Kale_GHA1  |		   
			
			
			@AdaniAMDExport_EDocket  @ACSAdaniAMDExport_eBookingPassword 
    Scenario Outline: ACS adani AMD E-Docket requirment for bonded and same CHA check for airline and bonded logins
     Given To verify whether the user is able to see AMD Airport name as per selection from login page
 		 Then User should goto e-AWB tab for creating Quick ASI
 		 Then User should create shipment for E-Docket1 with quick ASI "<CTO>" CTO-Kale GHA1, Direct, Bonded, Same CHA
 		 #Then User Should Search E-Docket MAWB number "<MAWBNo_EDocket>" for further process
 		 Then User should process Advance Shipment Info ASI submission
 		 Then User should click on e-Docket milestone
 		 Then User should upload e-docket document in aeroprime login
 		 Then User Should Clear Uploaded Document
 		 Then User should logout Adani application
 		 When I login ACS Adani with "Kale Airline" user given in "Login" sheet for Export module
 		 Then User should goto CO Approval Screen
 		 Then User should search MAWB Number
 		 Then User should verify uploaded document in CO-Approval screen
 		 Then User should Download uploaded document in CO-Approval screen
 		 Then User should logout Adani application
 		 When I login ACS Adani with "Bonded Trucker Login" user given in "Login" sheet for Export module
 		 Then User should goto CO Approval Screen
 		 Then User should search MAWB Number
 		 Then User should verify uploaded document in CO-Approval screen
 		 Then User should Download uploaded document in CO-Approval screen
 		 
 		 Examples: 
      | MAWBNo_EDocket       | CTO        |
      | 00000000             | Kale_GHA1  |		   
			
			
			
	#pass		
 @AdaniAMDExport_ViewPasswordNewCR  @ACSAdaniAMDExport_eBookingPassword 
  	Scenario Outline: ACS adani AMD View Password Function
     Given To verify whether the user is able to see AMD Airport name as per selection from login page
     Then User should goto change password screen
     Then User should check view password using view icon for login password
     Then User should check view password using view icon for transaction password
     #Then User should submit the password and need to login with new password but now we are cancel the change password screen
 #		 Then User should goto e-AWB tab for creating Quick ASI
 #		 Then User should create shipment for view password with quick ASI "<CTO>" CTO-Kale GHA1, Direct, Bonded, Same CHA
 #		 #Then User Should search View Password MAWB number "<MAWBNo_ViewPassword>" for further process
 #		 Then User should process Advance Shipment Info ASI submission
 #		 Then User should add Shipping Bill for single SB for kale GHA1 CTO
 #		 Then User should process TSP Payment for checking view password
 		 
 		 Examples: 
      | MAWBNo_ViewPassword       | CTO        |
      | 00000000                  | Kale_GHA1  |		   
			
	
			
	 @AdaniAMDExport_eBookingCreate  @ACSAdaniAMDExport_eBookingPassword 
   Scenario: ACS adani AMD E-Booking To verify whether the user is able to Create Booking from e-Booking
     Given To verify whether the user is able to see AMD Airport name as per selection from login page
     Then User should go to e-booking tab for subtab create
     Then User should verify e-booking create page
     Then User should click on plus icon for add shipper details
     Then User should fill required shipper details
     Then User should click on plus icon for add consignee details
     Then User should fill required consignee details    
     Then User should select destination
     Then User Should Add Dimension Details  
     Then User Should select customs broker as Aeroprime
     Then User should save e-booking as save   
      
    @AdaniAMDExport_eBookingCreateAnotherJob  @ACSAdaniAMDExport_eBookingPassword  
   Scenario: ACS adani AMD E-Booking To verify whether the user is able to Create another job Booking from e-Booking
     Given To verify whether the user is able to see AMD Airport name as per selection from login page
     Then User should go to e-booking tab for subtab create
     Then User should verify e-booking create page
     Then User should click on plus icon for add shipper details
     Then User should fill required shipper details
     Then User should click on plus icon for add consignee details
     Then User should fill required consignee details    
     Then User should select destination
     Then User Should Add Dimension Details  
     Then User Should select customs broker as Jeena and Company
     Then User should save e-booking and click on create another job
     Then User should click on plus icon for add shipper details
     Then User should fill required shipper details
     Then User should click on plus icon for add consignee details
     Then User should fill required consignee details    
     Then User should select destination
     Then User Should Add Dimension Details  
     Then User Should select customs broker as Jeena and Company
     Then User should save e-booking as save
 
 
 @AdaniAMDExport_eBookingCreateSaveAsTemplete @ACSAdaniAMDExport_eBookingPassword   
   Scenario: ACS adani AMD E-Booking To verify whether the user is able to Create Booking and Save as templete  from e-Booking
     Given To verify whether the user is able to see AMD Airport name as per selection from login page
     Then User should go to e-booking tab for subtab create
     Then User should verify e-booking create page
     Then User should click on plus icon for add shipper details
     Then User should fill required shipper details
     Then User should click on plus icon for add consignee details
     Then User should fill required consignee details    
     Then User should select destination
     Then User Should Add Dimension Details  
     Then User Should select customs broker as Aeroprime
     Then User should save e-booking for save as templete
     Then User should verify templete listing page
     
  @AdaniAMDExport_eBookingCreateSaveAsDraft @ACSAdaniAMDExport_eBookingPassword 
   Scenario: ACS adani AMD E-Booking To verify whether the user is able to Create Booking and Save as draft  from e-Booking
     Given To verify whether the user is able to see AMD Airport name as per selection from login page
     Then User should go to e-booking tab for subtab create
     Then User should verify e-booking create page
     Then User should click on plus icon for add shipper details
     Then User should fill required shipper details
     Then User should click on plus icon for add consignee details
     Then User should fill required consignee details    
     Then User should select destination
     Then User Should Add Dimension Details  
     Then User Should select customs broker as Aeroprime
     Then User should save e-booking for save as draft
     Then User should verify draft listing page 
     
     
  @AdaniAMDExport_eBookingForwardJobToAirline @TC_05  @ACSAdaniAMDExport_eBookingPassword 
   Scenario: ACS adani AMD E-Booking To verify whether the user is able to forward jobs to airline from Receive sub-menu of e-booking and shipment type should be no.
     Given To verify whether the user is able to see AMD Airport name as per selection from login page
     Then User should Click on Receive from sub-menu of e-Booking
     Then User should Select a checkbox and click on Forward to Airline button
     Then User should display Shipment Type dialogue box Click on NO and click on Submit button
     Then User Should Select Schedule Date from the calendar icon
     Then User should Click on Get Schedule button
		 Then User should Enter all the Filght details
		 Then User should click on submit Filght details button
		 Then User should display booking status popup select no for MAWB createtion
		 Then User should logout application
		 When I login ACS Adani with "Kale Airline" user given in "Login" sheet for Export module
		 Then User should Click on Booking Request Tab
		 Then User should be verify Booking request
		  
 #Loading Issue
 @AdaniAMDExport_eBookingSentJobToAirline @TC_06  @ACSAdaniAMDExport_eBookingPassword 
   Scenario: ACS adani AMD E-Booking To verify whether the user is able to Sent jobs sub-menu of Sent menu in E-Booking
     Given To verify whether the user is able to see AMD Airport name as per selection from login page
     Then User should Click on Sent from sub-menu of e-Booking
     Then User should Click on Create MAWB from the drop down of Select Action from Action column
     Then User should be able to enter all create AWB details      
		 
	@AdaniAMDExport_eBookingSeeAndCreatDraftJob @ACSAdaniAMDExport_eBookingPassword  
   Scenario: ACS adani AMD E-Booking To verify whether the user is able to see and use the Drafts from e-booking
     Given To verify whether the user is able to see AMD Airport name as per selection from login page
     Then User should Click on Draft from sub-menu of e-Booking
     Then User should display Booking Drafts page and save drafts list
     Then User should be able to click on Draft No in the Draft No column   
     Then User should be able to click on Create Job button  
     
  @AdaniAMDExport_eBookingEditDraftJob @ACSAdaniAMDExport_eBookingPassword  
   Scenario: ACS adani AMD E-Booking To verify whether the user is able to edit the draft from e-booking
     Given To verify whether the user is able to see AMD Airport name as per selection from login page
     Then User should Click on Draft from sub-menu of e-Booking
     Then User should display Booking Drafts page and save drafts list
     Then User should be able to click on Draft No in the Draft No column   
     Then User should be able to edit job
     Then User should be able to click on Save Changes button
     
  @AdaniAMDExport_eBookingDeleteDraftJob @ACSAdaniAMDExport_eBookingPassword  
   Scenario: ACS adani AMD E-Booking To verify whether the user is able to delete the draft from e-booking
     Given To verify whether the user is able to see AMD Airport name as per selection from login page
     Then User should Click on Draft from sub-menu of e-Booking
     Then User should display Booking Drafts page and save drafts list
     Then User should be able to click on delete icon for draft 
     
 @AdaniAMDExport_eBookingEditTempleteJob @ACSAdaniAMDExport_eBookingPassword
   Scenario: ACS adani AMD E-Booking To verify whether the user is able to edit the Templete from e-booking
     Given To verify whether the user is able to see AMD Airport name as per selection from login page
     Then User should Click on Templete from sub-menu of e-Booking
     Then User should display Booking Templete page and save Templete list
     Then User should be able to click on Templete No in the Templete Name column for edit    
     Then User should be able to edit job
     Then User should be able to click on Save Changes button
     
  @AdaniAMDExport_eBookingSeeAndCreatTempleteJob @ACSAdaniAMDExport_eBookingPassword  
   Scenario: ACS adani AMD E-Booking To verify whether the user is able to edit the Templete from e-booking
     Given To verify whether the user is able to see AMD Airport name as per selection from login page
     Then User should Click on Templete from sub-menu of e-Booking
     Then User should display Booking Templete page and save Templete list
     Then User should be able to click on Templete No in the Templete Name column   
     Then User should be able to click on Create Job button
     
 @AdaniAMDExport_eBookingDeleteTempleteJob @ACSAdaniAMDExport_eBookingPassword
   Scenario: ACS adani AMD E-Booking To verify whether the user is able to delete the draft from e-booking
     Given To verify whether the user is able to see AMD Airport name as per selection from login page
     Then User should Click on Templete from sub-menu of e-Booking
     Then User should display Booking Drafts page and save drafts list
     Then User should be able to click on delete icon for templete 
     
     
  @AdaniAMDExport_eBooking_eDocket @ACSAdaniAMDExport_eBookingPassword  
   Scenario: ACS adani AMD E-Booking To Verify whether th user is able to view the e-Docket from e-Booking.
     Given To verify whether the user is able to see AMD Airport name as per selection from login page
     Then User should Click on e-Docket from sub-menu of e-Booking
     Then User should display e-Docket page
     Then User should be able to click on Booking from drop down of Job Type and Job Id from drop down of Job Id
     Then User should be displayed Job Details in the Job Details setion
     Then User should de displayed Uploaded e-Docket document in the Associated Document section
     
           
     