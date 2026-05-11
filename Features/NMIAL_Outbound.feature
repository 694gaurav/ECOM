@NMIAL_Outbound
Feature: NMIAL Outbound feature 
  Background: Launch the NMIAL Outbound application and login the application
     
     
 #Admin_TC_01, Finance TC
  @AdaniNMIAL_01
   Scenario: To verify Non-UNK AWB GHA approval created with Warehouse Acceptance for user

   When I login with "NMIAL Agent" ACS Agent user given in "Login" sheet for Export module
  #When launch browser for GHA application and login with "GHA" ACS GHA user given in "Login" sheet for Export module
  #When I login with "GHA" ACS GHA credentials
   When select CTO popup screen Ok button of Export
   When click on 1 Copy Master AWB icon of Export
   When click on Yes button of Copy AWB Confirmation button of Export
   When enter "312" AWB Pfx and AWB No of Export
   When enter "123" Flight No and select Flight Date of Export
   When click on AWB Save button of Export
   When click on AWB Saved Ok button of Export
   When click on AWB ASI icon of Export
   When click on Proceed button and click on Yes Confirmation button of Export
   When click on CO icon and click on Yes button in CO Request popup screen of Export
   When click on Logout button of ACS Agent of Export
   When I login with "NMIAL Airline" ACS Airline user given in "Login" sheet for Export module
   When click on Action icon to approve or reject submitted CTO for Export
   When click on Approve button for Export
   When click on Logout button of ACS Agent of Export
   When I login with "NMIAL Agent" ACS Agent user given in "Login" sheet for Export module
   When select CTO popup screen Ok button of Export
   #TSP
   When click on TSP icon, enter details and click on Pay Now button of Export
   When click on Yes and Ok button for TSP in Export 
   When launch browser for GHA application and login with "GHA" ACS GHA user given in "Login" sheet for Export module
  ## When launch browser for GHA application and login with "GHA" ACS GHA user given in "Login" sheet for Export module
  ## When launch browser for GHA application and login with "Galaxy BIAL" Galaxy Bial user given in "Login" sheet for Export module
   When capture generated AWB details for Export
   When click on Exports>> AWB Detail and enter generated AWB in AWB fields for search in Export GHA
   Then verify CO as Approved in Export GHA
   #When click on TSP icon of Export
   #When enter details and click on Pay Now button of Export
   #When click on Yes button for TSP generated popup screen of Export
   #When click on Book Slot icon after TSP generated of Export
   #When click on Available slot and enter Vehicle details of Export
   #When click on Save Book Slot button of Export
   #When click on Slot Booked icon of Export
   #Print VT, Send Manifest, ACS Receipt
   #When click on Logout button of ACS Agent of Export
   #eDocket
   #Parking In tps
   #When I login with "NMIAL TPS" TPS user given in "Login" sheet for Export module
   #When select Cargo Type of Export
   #When click on Parking In icon of Outbound Vehicle and click on Refresh button of Export
   #When click on Parking Out icon of Outbound Vehicle and click on Refresh button of Export
   #When click on Logout button of ACS Agent of Export
   When click on VCT>> VCT Generation in GHA
   Then verify display of Park In and Park Out date time in GHA
   When click on VCT>> VCT Acceptance in GHA
   Then verify Gate In and Dock In of AWB in GHA
   When enter GroupId, NOP with dimensions and click Accept Cargo button in GHA
   When launch browser for GHA application and login with "Galaxy BIAL" Galaxy Bial user given in "Login" sheet for Export module
   When click on More>> Tracing Unit for UNK shipment and click on Change AWB tab in Bial
   When enter "312" old and new "" AWB in Bial
   When click on Complete button in GHA
   When click on More>> Tracing Unit in GHA
   #Galaxy Bial link for complete acceptance of UNK and change AWB
   When click on VCT>> VCT Acceptance of GHA in Export
   Then verify complete Acceptance validation of UNK number of Export
   When I login with "NMIAL Agent" ACS Agent user given in "Login" sheet for Export module
   #When capture generated AWB details in excel sheet for Export
   When click on Outbound>> Track and Trace tab for Export
   Then verify Parking, Dock and Warehouse Acceptance icons of GHA in Nmial Export
   
   @AdaniNMIAL_02
   Scenario: To verify Reject of AWB
   When I login with "NMIAL Agent" ACS Agent user given in "Login" sheet for Export module
  #When launch browser for GHA application and login with "GHA" ACS GHA user given in "Login" sheet for Export module
  #When I login with "GHA" ACS GHA credentials
   When select CTO popup screen Ok button of Export
   When click on 1 Copy Master AWB icon of Export
   When click on Yes button of Copy AWB Confirmation button of Export
   When enter "312" AWB Pfx and AWB No of Export
   When enter "123" Flight No and select Flight Date of Export
   When click on AWB Save button of Export
   When click on AWB Saved Ok button of Export
   When click on AWB ASI icon of Export
   When click on Proceed button and click on Yes Confirmation button of Export
   When click on CO icon and click on Yes button in CO Request popup screen of Export
   When click on Logout button of ACS Agent of Export
   When I login with "NMIAL Airline" ACS Airline user given in "Login" sheet for Export module
   When click on Action icon to approve or reject submitted CTO for Export
   When click on Reject button for Export
   
   @BookSlot_1.1
   Scenario: To verify Book slot with Single VT Single shipment
   When I login with "NMIAL Agent" ACS Agent user given in "Login" sheet for Export module
  #When launch browser for GHA application and login with "GHA" ACS GHA user given in "Login" sheet for Export module
  #When I login with "GHA" ACS GHA credentials
   When select CTO popup screen Ok button of Export
   When click on 1 Copy Master AWB icon of Export
   When click on Yes button of Copy AWB Confirmation button of Export
   When enter "312" AWB Pfx and AWB No of Export
   When enter "123" Flight No and select Flight Date of Export
   When click on AWB Save button of Export
   When click on AWB Saved Ok button of Export
   When click on AWB ASI icon of Export
   When click on Proceed button and click on Yes Confirmation button of Export
   When click on CO icon and click on Yes button in CO Request popup screen of Export
   When click on Logout button of ACS Agent of Export
   When I login with "NMIAL Airline" ACS Airline user given in "Login" sheet for Export module
   When click on Action icon to approve or reject submitted CTO for Export
   When click on Approve button for Export
   When click on Logout button of ACS Agent of Export
   When I login with "NMIAL Agent" ACS Agent user given in "Login" sheet for Export module
   When select CTO popup screen Ok button of Export
   When click on TSP icon, enter details and click on Pay Now button of Export
   When click on Yes and Ok button for TSP in Export 
   ##Book Slot
   When click on Book Slot icon after TSP generated of Export
   When click on Available slot and enter Vehicle details of Export
   When click on Save Book Slot button of Export
   When click on Slot Booked icon of Export
   When select slot and click on Print VT button of Export 
   When click on Update slot button, select slot and clicked on Update button of Export
   
   @BookSlot_1.2
   Scenario: To verify Book slot with Single VT Multiple Shipment
   When I login with "NMIAL Agent" ACS Agent user given in "Login" sheet for Export module
  #When launch browser for GHA application and login with "GHA" ACS GHA user given in "Login" sheet for Export module
  #When I login with "GHA" ACS GHA credentials
   When select CTO popup screen Ok button of Export
   When click on 1 Copy Master AWB icon of Export
   When click on Yes button of Copy AWB Confirmation button of Export
   When enter "312" AWB Pfx and AWB No of Export
   When enter "123" Flight No and select Flight Date of Export
   When click on AWB Save button of Export
   When click on AWB Saved Ok button of Export
   When click on AWB ASI icon of Export
   When click on Proceed button and click on Yes Confirmation button of Export
   When click on CO icon and click on Yes button in CO Request popup screen of Export
   When click on Logout button of ACS Agent of Export
   When I login with "NMIAL Airline" ACS Airline user given in "Login" sheet for Export module
   When click on Action icon to approve or reject submitted CTO for Export
   When click on Approve button for Export
   When click on Logout button of ACS Agent of Export
   When I login with "NMIAL Agent" ACS Agent user given in "Login" sheet for Export module
   When select CTO popup screen Ok button of Export
   When click on TSP icon, enter details and click on Pay Now button of Export
   When click on Yes and Ok button for TSP in Export 
   ##Book Slot
   When click on Book Slot icon after TSP generated of Export
   When click on Available slot and select 3 Unassigned shipments of Export
   When enter "2" NOP for shipment of Outbound
   When click on Proceed button of booked slot of Export
   When click on Save Assign button of Outbound
   When enter Vehicle details of Outbound
   When click on Save Book Slot button of Export
   When click on Slot Booked icon of Export
   
   @BookSlot_1.3
   Scenario: To verify Book slot with Multiple VT Single Shipment
   When I login with "NMIAL Agent" ACS Agent user given in "Login" sheet for Export module
  #When launch browser for GHA application and login with "GHA" ACS GHA user given in "Login" sheet for Export module
  #When I login with "GHA" ACS GHA credentials
   When select CTO popup screen Ok button of Export
   When click on 1 Copy Master AWB icon of Export
   When click on Yes button of Copy AWB Confirmation button of Export
   When enter "312" AWB Pfx and AWB No of Export
   When enter "123" Flight No and select Flight Date of Export
   When click on AWB Save button of Export
   When click on AWB Saved Ok button of Export
   When click on AWB ASI icon of Export
   When click on Proceed button and click on Yes Confirmation button of Export
   When click on CO icon and click on Yes button in CO Request popup screen of Export
   When click on Logout button of ACS Agent of Export
   When I login with "NMIAL Airline" ACS Airline user given in "Login" sheet for Export module
   When click on Action icon to approve or reject submitted CTO for Export
   When click on Approve button for Export
   When click on Logout button of ACS Agent of Export
   When I login with "NMIAL Agent" ACS Agent user given in "Login" sheet for Export module
   When select CTO popup screen Ok button of Export
   When click on TSP icon, enter details and click on Pay Now button of Export
   When click on Yes and Ok button for TSP in Export 
   ##Book Slot
   When click on Book Slot icon after TSP generated of Export
   When enter "3" No of vehicles of Outbound
   When select all displayed slots for Vehicle detail of Outbound
   When enter Vehicle1 detail,select shipment with "1" NOP and click View Shipment Proceed Save button of Outbound 
   When enter Vehicle2 detail and select shipment with "2" NOP and click View Shipment Proceed Save button of Outbound 
   When enter Vehicle3 detail and select shipment with "2" NOP and click View Shipment Proceed Save button   of Outbound    
   
   
   @ParkingIn
   Scenario: To verify Parking In
   When I login with "NMIAL TPS" TPS user given in "Login" sheet for Export module
   When select Cargo Type of Export
   When click on Parking In icon of Outbound Vehicle and click on Refresh button of Export
   When click on Parking Out icon of Outbound Vehicle and click on Refresh button of Export
   When click on Terminal Gate In icon of Outbound Vehicle of Export
   When click on Logout button of ACS Agent of Export
   When launch browser for GHA application and login with "GHA" ACS GHA user given in "Login" sheet for Export module
   When click on VCT>> VCT Generation in GHA
   Then verify display of Park In and Park Out date time in GHA
   When click on VCT>> VCT Acceptance in GHA
   Then verify Gate In and Dock In of AWB in GHA
   When enter GroupId, NOP with dimensions and click Accept Cargo button in GHA

   @AcsReceipt_SendManifest
   Scenario: To verify Acs Receipt and Send Manifest
   When I login with "NMIAL Agent" ACS Agent user given in "Login" sheet for Export module
   #When click on ACS Receipt icon of Export
   When select CTO popup screen Ok button of Export
   When click on Send Manifest icon of Export
   When enter "Ameya.Nadkarni@kalelogistics.com" email and click on Send Email button of Export
   
   
   @CargoAcceptance
   Scenario: To verify security Acceptance of shipment
   #When I login with "NMIAL Agent" ACS Agent user given in "Login" sheet for Export module
   When launch browser for GHA application and login with "ACS GHA" ACS GHA user given in "Login" sheet for Export module
   When click on VCT> VCT Generation and click on Outbound VCT> VCT Acceptance for Export
   When enter Dock In time and clicked on Dock In button for Export
   When select 1 AWB, enter NOP, Length, Width, Height and click on Accept Cargo button for Export
   Then verify display of Accepted cargo list for Export
   When click on Exports> Security Acceptance and search accepted AWB for Export
   When click on Save Final Submit button for Export
   #When click on Export> Build Manifest for Export
   
   @BuildManifest
   Scenario: To verify Build Manifest shipment
   #When I login with "NMIAL Agent" ACS Agent user given in "Login" sheet for Export module
   When launch browser for GHA application and login with "ACS GHA" ACS GHA user given in "Login" sheet for Export module
   #When launch browser for GHA application and login with "QA GHA" ACS GHA user given in "Login" sheet for Flight create
   When click on Exports> Build Manifest 
   When select Flight and add "AKE" ULD of Export
   When select ULD and click on Add Shipment button of Export
   When enter "" and search Shipment on hand and Add shipment for Export
   
   @OffloadULD
   Scenario: To verify Offload Uld
   When launch browser for GHA application and login with "ACS GHA" ACS GHA user given in "Login" sheet for Flight create
   When click on Exports> Build Manifest 
   When select Flight and add "AKE" ULD of Export
   When select ULD Offload of Export
   When clicked on Print Manifest icon and click on Proceed for Export
   When clicked on Offload ULD button of Export
   
   
   @CloseULD
   Scenario: To verify Close uld in Build Manifest shipment
   #When launch browser for GHA application and login with "QA GHA" ACS GHA user given in "Login" sheet for Export module
   When launch browser for GHA application and login with "QA GHA" ACS GHA user given in "Login" sheet for Flight create
   When click on Exports> Build Manifest 
   When select Flight of Build Manifest Export
   When click on Close ULD and select Close Rdb and "100" Save Scale Weight button for Export
   
   @Gatepass1.1
   Scenario: To verify Gatepass for Build Manifest shipment
   #When I login with "NMIAL Agent" ACS Agent user given in "Login" sheet for Export module
   When launch browser for GHA application and login with "ACS GHA" ACS GHA user given in "Login" sheet for Export module
   When click on Exports> Build Manifest 
   When select flight for Gatepass of closed ULD
   When select ULD, click on Generate Gatepass and click on Cancel of Export

   @Gatepass1.2
   Scenario: To verify flight builtup and departure for Build Manifest shipment
   When launch browser for GHA application and login with "ACS GHA" ACS GHA user given in "Login" sheet for Export module
   When click on Exports> Gatepass and select "999" flight for Gatepass, select ULD and click on Release button
   When click on Build Manifest , clicked on Print Manifest icon and click on Proceed for Export
   When click on Build Manifest and enter "1704" Record ATD and clicked on Finalize Flight button 

   
   @CreateUNK_Shipment
   Scenario: To verify create UNK shipment
   When I login with "NMIAL Agent" ACS Agent user given in "Login" sheet for Export module
   #When launch browser for GHA application and login with "GHA" ACS GHA user given in "Login" sheet for Export module
   #When I login with "GHA" ACS GHA credentials
   When select CTO popup screen Ok button of Export
   When click on 3 Copy Master AWB icon of Export
   When click on Yes button of Copy AWB Confirmation button of Export
   When enter "" Flight No and select Flight Date of Export
   When click on AWB Save button of Export
   When click on AWB Saved Ok button of Export
   When click on AWB ASI icon of Export
   When click on Proceed button and click on Yes Confirmation button of Export
   #When click on CO icon and click on Yes button in CO Request popup screen of Export
   #When click on Logout button of ACS Agent of Export
   #When I login with "NMIAL Airline" ACS Airline user given in "Login" sheet for Export module
   #When click on Action icon to approve or reject submitted CTO for Export
   #When click on Approve button for Export
   #When click on Logout button of ACS Agent of Export
   #When I login with "NMIAL Agent" ACS Agent user given in "Login" sheet for Export module
   
   
   @CompleteAcceptance
   Scenario: To verify change AWB Complete Acceptance in Bial 
   When I login with "NMIAL Agent" ACS Agent user given in "Login" sheet for Export module
   When capture UNK shipment details for BIAL
   When launch browser for GHA application and login with "Galaxy BIAL" Galaxy Bial user given in "Login" sheet and capture generated details for Export module
   #When launch browser for GHA application and login with "GHA" ACS GHA user given in "Login" sheet for Bial GHA
   When click on More>> Tracing Unit for UNK shipment and click on Change AWB tab in Bial
   When enter "UNK" old and new "" AWB in Bial
   When click on Save icon for Change AWB in Bial
   When click on Complete button in GHA
   When click on More>> Tracing Unit in GHA
   When click on Save icon for Change AWB in Bial
   #Galaxy Bial link for complete acceptance of UNK and change AWB
   When click on VCT>> VCT Acceptance of GHA in Export
   Then verify complete Acceptance validation of UNK number of Export


   @eDocket
   Scenario: To verify eDocket file
   When I login with "NMIAL Agent" ACS Agent user given in "Login" sheet for Export module
   When select CTO popup screen Ok button of Export
   When click on eDocket icon of Export
   When select and upload documents of Export
   When click on eDocket Submit button and Ok button of Export
   When click on Logout button of ACS Agent of Export

   
   @EditCancel_Awb
   Scenario: To verify Edit and Cancel of AWB
   When I login with "NMIAL Agent" ACS Agent user given in "Login" sheet for Export module
  #When launch browser for GHA application and login with "GHA" ACS GHA user given in "Login" sheet for Export module
  #When I login with "GHA" ACS GHA credentials
   When select CTO popup screen Ok button of Export
   When click on 1 Copy Master AWB icon of Export
   When click on Yes button of Copy AWB Confirmation button of Export
   When enter "312" AWB Pfx and AWB No of Export
   When enter "" Flight No and select Flight Date of Export
   When click on AWB Save button of Export
   When click on AWB Saved Ok button of Export
   When click on Edit icon of created AWB of Export
   When enter NOP and select "Perishable" Cargo Type of Export
   When click on AWB Save button of Export
   When click on Cancel icon of displayed record of Export   
   
   @Billing1.1
   Scenario: To verify Outbound Customer Invoice with Credit Note of AWB
   When I login with "NMIAL Agent" ACS Agent user given in "Login" sheet for Export module
  #When launch browser for GHA application and login with "GHA" ACS GHA user given in "Login" sheet for Export module
  #When I login with "GHA" ACS GHA credentials
   When select CTO popup screen Ok button of Export
   When click on 1 Copy Master AWB icon of Export
   When click on Yes button of Copy AWB Confirmation button of Export
   When enter "312" AWB Pfx and AWB No of Export
   When enter "123" Flight No and select Flight Date of Export
   When click on AWB Save button of Export
   When click on AWB Saved Ok button of Export
   When click on AWB ASI icon of Export
   When click on Proceed button and click on Yes Confirmation button of Export   
   When launch browser for GHA application and login with "GHA" ACS GHA user given in "Login" sheet for Export module
   When capture generated AWB details for Billing Export
   ##When launch browser for GHA application and login with "ACS GHA" ACS GHA user given in "Login" sheet for Export module
   #When click on Billing> Customer Invoice for Outbound 
   #When enter "312-13459423" AWB and click on Search button for Outbound
   When click on Calculate Charge button for Outbound  
   When select "" Mode of Payment and clicked on Pay Proceed button for Outbound
   When click on Billing> Credit Note for Outbound
   When enter "" generated Invoice No and click on Search button for Outbound
   When click on Invoice hyperlink for Outbound
   When enter "5" Credit percentage and clicked on Pay Proceed button for Outbound
   
   @Billing1.2
   Scenario: To verify Inbound Customer Invoice with Credit Note of AWB
   When launch browser for GHA application and login with "ACS GHA" ACS GHA user given in "Login" sheet for Export module
   When click on Billing> Customer Invoice for Outbound 
   When enter "312-16086840" AWB, "Import Invoice" Document Type and click on Search button for Outbound
   When click on Calculate Charge button for Outbound  
   When select "" Mode of Payment and clicked on Pay Proceed button for Outbound
   When click on Billing> Credit Note for Outbound
   When enter "" generated Invoice No and click on Search button for Outbound
   When click on Invoice hyperlink for Outbound
   When enter "5" Credit percentage and clicked on Pay Proceed button for Outbound
   
   @CreditBilling
   Scenario: To verify Credit Billing with Airline 
   When launch browser for GHA application and login with "ACS GHA" ACS GHA user given in "Login" sheet for Export module
   When click on Billing> Credit Billing for Airline
   When select "Airline" Debit Party Name, "6E" Airline GSA and "Fortnightly" Frequency for Airline
   When select From and To date for Airline
   When click on Calculate Charge for Airline
   When click on View icon, select Charge, click on Confirm and Generate Invoice button for Airline
   
   @Commodity_1.1
   Scenario Outline: To verify Book slot with HUM Single VT Single shipment
   When I login with "NMIAL Agent" ACS Agent user given in "Login" sheet for Export module
  #When launch browser for GHA application and login with "GHA" ACS GHA user given in "Login" sheet for Export module
  #When I login with "GHA" ACS GHA credentials
   When select CTO popup screen Ok button of Export
   When click on 1 Copy Master AWB icon of Export
   When click on Yes button of Copy AWB Confirmation button of Export
   When enter "312" AWB Pfx and AWB No of Export
   When enter "123" Flight No, "<Cargo>" for Commodity and select Flight Date of Export
   When click on AWB Save button of Export
   When click on AWB Saved Ok button of Export
   When click on AWB ASI icon of Export
   When click on Proceed button and click on Yes Confirmation button of Export
   When click on CO icon and click on Yes button in CO Request popup screen of Export
   When click on Logout button of ACS Agent of Export
   When I login with "NMIAL Airline" ACS Airline user given in "Login" sheet for Export module
   When click on Action icon to approve or reject submitted CTO for Export
   When click on Approve button for Export
   When click on Logout button of ACS Agent of Export
   When I login with "NMIAL Agent" ACS Agent user given in "Login" sheet for Export module
   When select CTO popup screen Ok button of Export
   #When click on TSP icon, enter details and click on Pay Now button of Export
   When click on Yes and Ok button for TSP in Export 
   ##Book Slot
   When click on Book Slot icon after TSP generated of Export
   When click on Available slot and enter Vehicle details of Export
   When click on Save Book Slot button of Export
   When click on Slot Booked icon of Export

   Examples:
     | Cargo         |
     | Human Remains |

   
   @Commodity_1.2
   Scenario Outline: To verify Book slot with Commodity Types Single VT Single shipment
   When I login with "NMIAL Agent" ACS Agent user given in "Login" sheet for Export module
  #When launch browser for GHA application and login with "GHA" ACS GHA user given in "Login" sheet for Export module
  #When I login with "GHA" ACS GHA credentials
   When select CTO popup screen Ok button of Export
   When click on 1 Copy Master AWB icon of Export
   When click on Yes button of Copy AWB Confirmation button of Export
   When enter "312" AWB Pfx and AWB No of Export
   When enter "123" Flight No, "<Cargo>" for Commodity and select Flight Date of Export
   When click on AWB Save button of Export
   When click on AWB Saved Ok button of Export
   When click on AWB ASI icon of Export
   When click on Proceed button and click on Yes Confirmation button of Export
   When click on CO icon and click on Yes button in CO Request popup screen of Export
   When click on Logout button of ACS Agent of Export
   When I login with "NMIAL Airline" ACS Airline user given in "Login" sheet for Export module
   When click on Action icon to approve or reject submitted CTO for Export
   When click on Approve button for Export
   When click on Logout button of ACS Agent of Export
   When I login with "NMIAL Agent" ACS Agent user given in "Login" sheet for Export module
   When select CTO popup screen Ok button of Export
   When click on TSP icon, enter details and click on Pay Now button of Export
   When click on Yes and Ok button for TSP in Export 
   ##Book Slot
   When click on Book Slot icon after TSP generated of Export
   When click on Available slot and enter Vehicle details of Export
   When click on Save Book Slot button of Export
   When click on Slot Booked icon of Export

   Examples:
     | Cargo         |
     | General Cargo |
     | Perishable    |
   
   @CreateUNK_Shipment1.1
   Scenario Outline: To verify create UNK shipment with HUM Cargo type
   When I login with "NMIAL Agent" ACS Agent user given in "Login" sheet for Export module
   #When launch browser for GHA application and login with "GHA" ACS GHA user given in "Login" sheet for Export module
   #When I login with "GHA" ACS GHA credentials
   When select CTO popup screen Ok button of Export
   When click on 3 Copy Master AWB icon of Export
   When click on Yes button of Copy AWB Confirmation button of Export
   ##When enter "312" AWB Pfx and AWB No of Export
   When enter "123" Flight No, "<Cargo>" for Commodity and select Flight Date of Export
   When click on AWB Save button of Export
   When click on AWB Saved Ok button of Export
   When click on AWB ASI icon of Export
   When click on Proceed button and click on Yes Confirmation button of Export
   
   Examples:
     | Cargo         |
     | Human Remains |


   @CreateUNK_Shipment1.2
   Scenario Outline: To verify create UNK shipment with Cargo type
   When I login with "NMIAL Agent" ACS Agent user given in "Login" sheet for Export module
   #When launch browser for GHA application and login with "GHA" ACS GHA user given in "Login" sheet for Export module
   #When I login with "GHA" ACS GHA credentials
   When select CTO popup screen Ok button of Export
   When click on 3 Copy Master AWB icon of Export
   When click on Yes button of Copy AWB Confirmation button of Export
   ##When enter "312" AWB Pfx and AWB No of Export
   When enter "123" Flight No, "<Cargo>" for Commodity and select Flight Date of Export
   When click on AWB Save button of Export
   When click on AWB Saved Ok button of Export
   When click on AWB ASI icon of Export
   When click on Proceed button and click on Yes Confirmation button of Export
   
   Examples:
     | Cargo         |
     | General Cargo |
     | Perishable    |
   
   
   
      
