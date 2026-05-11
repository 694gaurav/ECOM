# Stack Holder Priyanka Sawants
#FF Login ACSAMD_AAG   Kale@APR2425

@AdaniAMDAdmin
Feature: ACS-Adani AMD Admin feature 
  Background: Launch the ACS AdaniAMD Admin application and login the application
     
     
 #Admin_TC_01, Finance TC
  @AdaniAMDAdmin_01
   Scenario: To verify whether the user is able to send the Credit Request to Kale Finance
   When I login with "FF Login" user given in "Login" sheet for Admin module
     Given User should be able to click on Admin mode
     Then User should go to Account Managment tab for sub credit update
     Then User should verify account credit update page should be displayed 
     Then User should fill credit request details  
     Then User should click on submit button after fill credit request details
     Then User should logout adani application with logout function
     When I login with "Finance" user given in "Login" sheet for Admin module
     Then User should go to Account tab for sub menu PD status update
     Then User should verify PD status update page should be displayed
     Then User should select credit type from dropdown
     Then User should select status from dropdown
     Then User should click on search button for PD update status
     Then User should change status as cleared from grid
     Then User should Save status change 
     Then User should select credit type from dropdown
     Then User Should verify PD status as cleared
     Then User should click on search button for PD update status
     Then User should logout adani application
     When I login with "FF Login" user given in "Login" sheet for Admin module
     Given User should be able to click on Admin mode
     Then User should go to Account Managment tab for sub credit update
     Then User should verify account credit update page should be displayed
 
 
 #fail    
#Admin_TC_02, TC_03, TC_04, TC_05 ,Bulk_Receipt_Admin_TC
 @AdaniAMDAdmin_02 @AdaniAMDAdmin_Rerun
   Scenario: To verify whether the user is able to view the Account Ledger, CTO Ledger, Advance Receipt, Refend Receipt
   When I login with "FF Login" user given in "Login" sheet for Admin module
     Given User should be able to click on Admin mode
     Then User should check Admin Details page should be displayed
     Then User should go to Account Managment tab for sub menu Account Ledger
     Then User should verify PD Acc Report page should be displayed
     Then User should select mode for generating report
     Then User should select From and To date
     Then User should be able to click on View button All the credits and debits for each AWB no should be displayed    
     Then User should be able to click on Export to Excel button Excel file should be download 
     Then User should be able to click on Export to PDF button PDF file should be download
     
     Then User should go to Account Managment tab for sub menu CTO Ledger 
     Then User should select CTO from dropdown
     Then User should select From and To date
     Then User should be able to click on View button All the credits and debits for each AWB no should be displayed    
     Then User should be able to click on Export to Excel button Excel file should be download 
     Then User should be able to click on Export to PDF button PDF file should be download   
     
     Then User should go to Account Managment tab for sub menu ACS Receipt Download
     Then User should verify ACS Receipt Download page should be displayed
     Then User should select Receipt type as ACS Receipt from the dropdown
     Then User should select Mode as Export from the dropdown
     Then User should click on Download ACS Receipt
     
     Then User should select Mode as Import from the dropdown
     Then User should click on Download ACS Receipt
     
     Then User should select Receipt type as Adani Receipt from the dropdown
     Then User should select Mode as Export from the dropdown
     Then User should click on Download ACS Receipt
     
     Then User should select Receipt type as CSC Receipt from the dropdown
     Then User should select Mode as Export from the dropdown
     Then User should click on Download ACS Receipt
     
     Then User should select Receipt type as GSEC Receipt from the dropdown
     Then User should select Mode as Export from the dropdown
     Then User should click on Download ACS Receipt
     
     Then User should select Mode as Import from the dropdown
     Then User should click on Download ACS Receipt
     
     Then User should edit date greate that 7 days
               
     Then User should go to Account Managment tab for sub menu Refund Receipt
     Then User should verify Refund Receipts page should be displayed
     Then User should select from date for refund receipt
     Then User should click on search button
     Then User should download view receipt PDF
     
     Then User should go to Account Managment tab for sub menu Advance Receipt
     Then User should verify Advance Receipts page should be displayed
     Then User should select From and To date for Advance Receipt
     Then User should Select Credit Type from the drop down
     Then User should click on search button
     Then User should download view receipt PDF
     
   
  #Admin_TC_06, Admin_TC_06.2, Admin_TC_06.3, Admin_TC_015
  @AdaniAMDAdmin_03  @Rerun
   Scenario: To verify whether the user is able to Create user from User Management
   When I login with "FF Login" user given in "Login" sheet for Admin module
     Given User should be able to click on Admin mode
     Then User should go to User Managment tab for sub menu User Mgmt    
     Then User should click on create user button
     Then User should fill details for create user
     Then User should select branch from dropdown for user
     Then User should click on assign roles icon in the assign role coloumn
     Then User should select roles from checkbox
     Then User should click on assign role button
     Then User should Select business line account name from the dropdown under Address section
     Then User should click on save button
     Then User should click on reset password icon
     Then User should select manual reset option and set password and save
     Then User should verify whether the user is able to active inactive existing user from User Management 
     Then User should click on create user button
     Then User should fill details for create user
     Then User should verify whether user is able to create the user without selecting the branches and roles in User management
     
   #Admin_TC_08, Admin_TC_09
  @AdaniAMDAdmin_04   @Rerun
   Scenario: To verify whether the user is able to add, Edit the Organization Profile
   When I login with "FF Login" user given in "Login" sheet for Admin module
     Given User should be able to click on Admin mode
     Then User should go to Org profile menu 
     Then User should display View Organization Profile page   
     Then User should click on add button for adding branch details in org profile
     Then User should add details in branch details section
     Then User should click on add address link 
     Then User should add address details and click on submit button
     Then User should save branch details under org profile
     Then User should click on edit button for updating branch details
     Then User should update branch details and save
     
     
   #Admin_TC_10, Admin_TC_11, Admin_TC_12, Admin_TC_13, Admin_TC_14
  @AdaniAMDAdmin_05
   Scenario: To verify whether the user is able to Add, edit and delete Trade Partner and Configuration, Threshold Configuration Function
  	 When I login with "FF Login" user given in "Login" sheet for Admin module
     Given User should be able to click on Admin mode
     Then User should go to Trade Partner menu 
     Then User should display Trade partner Profile page
     Then User should be able to click on Add Trade Partner button
     Then User should able to add trade partner details and click on save icon
     Then User should click on edit icon
     Then User should update trade partner details and click on save button
     Then User should able to delete trade partner
     
     Then User should go to Organization menu under Configuration Tab 
     Then User should display Organization Profile page
     Then User should verify whether user is able to Save the changes in Configuration for password expiry
     
     Then User should go to Threshold menu under AWB Stock Tab 
     Then User should display stock threshold configuration Profile page
     Then User should Verify whether user is able to save the Stock Threshold Configuration Details
     
   
   #Registration_TC  
  @AdaniAMDAdmin_06  @Rerun
    Scenario Outline: To verify whether the user is able to do registration
    Then User should click on new registration hyper link
    Then User should fill all details "<OrgName>" for new user registration
    Then User should logout adani application
    When I login with "Admin" user given in "Login" sheet for Admin module
    Then User should approve request from receive request page
    Then User should logout adani application
    When I login with "FF Login" user given in "Login" sheet for Admin module
    Given User should be able to click on Admin mode
    Then User should go to PDA Mapping menu
    Then User should click on add PDA account button 
    Then User should select organization type and "<OrgName>" from dropdown
    Then User should click on e-docket icon
    Then User should browse file in PDF format not to exceed 2 MB and download file
    Then User should be able to select the CTO from the dropdown 
    Then User should be able to click on save icon from action column and saved details should be displayed in newly added row
    Then User should search organization name "<OrgName>" 
    Then User should click on e-docket icon
    Then To verify whether user is able to view the error msg when user upload different extention file in E-docket
    Then To verify whether user is able to Clear the selected file on click of Clear button
    Then To verify whether user is able to delete the Uploaded e-docket document 
    Then User should browse file in PDF format not to exceed 2 MB and download file
    Then User should search organization name "<OrgName>" 
    Then User should submit all details
    Then User should search organization name "<OrgName>"
    Then User should able to delete record
    Then User should click on add PDA account button
    Then To verify whether user is able to navigated to back page on click of Cancel button from PDA Mapping screen
    
    
    Examples:
    |OrgName          |
    |AutomationOrg_012|
    
 
 #PDA_Mapping_TC19, PDA_Mapping_TC20, PDA_Mapping_TC21  
  @AdaniAMDAdmin_07 @Rerun
    Scenario Outline: To verify whether user is able to pay the TSP by self, by selecting Clearing agent- Self option from responsible party for TSP payment dropdwon, cancel and back function for TSP
    When I login with "FF Login" user given in "Login" sheet for Admin module
    Then User should go to e-AWB tab for creating Quick ASI
    Then User should be able to create the AWB "<CTO>"
    Then User should process ASI submission
    Then User Should verify carting order 
    Then User should add Shipping Bill with single SB for kale GHA1 CTO
    Then User should be able to click on TSP cancel button and navigated to back page
    Then User should be able to click on TSP icon and TSP payment method pop up should display
    Then User should be able to click on TSP back button and system should navigated to back page
    Then User should be able to click on TSP icon and TSP payment method pop up should display
    Then User should be fill details for TSP Payment
    #Then User should click on Print button from TSP screen	
    
    
      Examples: 
      | CTO        |
      | Kale_GHA1  |
      
  #PDA_Mapping_TC18,  
  @AdaniAMDAdmin_08   @Rerun
    Scenario Outline: To verify whether CHA user is able to pay the TSP payment from other shipment parties CTO PD Account from his login and charges are deducted from selected shipment party PD account
    When I login with "FF Login" user given in "Login" sheet for Admin module
    Then User should go to e-AWB tab for creating Quick ASI
    Then User should be able to create the AWB "<CTO>"
    Then User should process ASI submission
    Then User Should verify carting order 
    Then User should add Shipping Bill with single SB for kale GHA1 CTO 
    Then User should click on TSP milestone and select trade partner "<OrgName>" 
    Then User should be fill details for TSP Payment
    #Then User should click on Print button from TSP screen			
    
    
      Examples: 
      | CTO        |OrgName          |
      | Kale_GHA1  |AutomationOrg_001|				   
        
   
     

     
    


     
     
     
     
     
 		