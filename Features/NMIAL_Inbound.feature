@NMIAL_Inbound
Feature: NMIAL Outbound feature 
  Background: Launch the NMIAL Inbound application and login the application
     
    @EndToEnd1.1
    Scenario: To verify Inbound TSP and create Flight 

    When launch browser for GHA application and login with "ACS GHA" ACS GHA user given in "Login" sheet for Flight create
    When click on Masters>> More>> Flight> Details in GHA
    When click on Add button and enter "6e" Flight No, select "1634" Aircraft Type in Flight Details of GHA
    When click on Routing details and enter "HYD" Origin, "NMI" Destination Airport details and click on Save button of GHA
    When click on Imports>> Import Manifest and enter created "" Flight of GHA 
    When enter "AAF" with "6e" and add Flight ULD details
    When click on ULD and add AWB details in GHA
    When enter "1000" ATA date time and save "10" DocReceive, "10" Breakdown details of GHA
    When select all ULD shipment and click on Match button of GHA
    Then verify display of matched  shipment of GHA
    When select 4 shipment for Damaged Shipment and click on Discrepancy of GHA
    When enter Damage pieces details of GHA
    Then verify display of matched  shipment of GHA
    When select 2 shipment for Excess Shipment and click on Discrepancy of GHA
    When enter "15" Excess received NOP of GHA
    When click on Save Discrepancy button of GHA
    Then verify display of matched  shipment of GHA
    When select 3 shipment for Part Shipment and click on Discrepancy of GHA
    When enter "1" Short landed received NOP of GHA
    When click on Save Discrepancy button of GHA    
    When click on Flight Finalize button of GHA
    When clicked on logout button for GHA
    ##Inbound
    When launch browser for ACS application and login for Inbound
    When I login with "NMIAL Agent" ACS Agent user given in "Login" sheet for Export module
    When select CTO popup screen Ok button of Export
    When click on Inbound for Airline
    When enter "" created Flight No of NMIAL
    Then verify display of Discrepancy Damage detail in NMIAL
    When click on Logout button of ACS Agent of Export
    When I login with "NMIAL Airline" ACS Airline user given in "Login" sheet for Export module
    When click on Inbound>> Shipments of NMIAL
    When enter "" Flight and click on Search button for NMIAL
    When enter Chargeable Weight for displayed AWB filter of Airline
    When click on Approve Delivery Order of Airline
   When click on Logout button of ACS Agent of Export
   When I login with "NMIAL Agent" ACS Agent user given in "Login" sheet for Export module
   When select CTO popup screen Ok button of Export
   When click on Inbound and search "" Flight filter for Airline
   #When click on Ready for Delivery icon of Export
   When clicked for ASI and TSP of Export
   When launch browser for GHA application and login with "ACS GHA" ACS GHA user given in "Login" sheet for Export module
   ##When click on Billing> Customer Invoice for Inbound 
   When enter "" AWB, "Import Invoice" Document Type and click on Search button for Import
   When click on Calculate Charge button for Outbound  
   When select "" Mode of Payment and clicked on Pay Proceed button for Outbound
   When click on Billing> Credit Note for Outbound
   When enter "" generated Invoice No and click on Search button for Outbound
   When click on Invoice hyperlink for Outbound
   When enter "5" Credit percentage and clicked on Pay Proceed button for Outbound
   ##When launch browser for ACS application and login for Inbound
   When select CTO popup screen Ok button of Export
   When click on Inbound and search "" Flight filter for Airline   
   When clicked for Book Slot of Export
   When click on Logout button of ACS Agent of Export
   When I login with "NMIAL TPS" TPS user given in "Login" sheet for Export module
   #When select Cargo Type of Export
   When click on Parking In icon of Inbound Vehicle and click on Refresh button of Export
   When click on Logout button of ACS Agent of Export
   When I login with "NMIAL Agent" ACS Agent user given in "Login" sheet for Export module
   When select CTO popup screen Ok button of Export
   When click on Inbound and search "" Flight filter for Airline
   ##Location MAWB
   When launch browser for GHA application and login with "ACS GHA" ACS GHA user given in "Login" sheet for Flight create
   When click on VCT Generation for Imports>> Warehouse Location  for "" booked AWB in GHA
   When capture AWB details for Inbound Warehouse Location in GHA
   When click on Move icon of AWB in GHA
   When select new location and click on Save button in GHA   

     
     
     
 #Admin_TC_01, Finance TC
   @Flight_1.1
   Scenario: To verify Flight create for Nmial Inbound 
   When launch browser for GHA application and login with "ACS GHA" ACS GHA user given in "Login" sheet for Flight create
   When click on Masters>> More>> Flight> Details in GHA
   When click on Add button and enter "6e" Flight No, select "" Aircraft Type in Flight Details of GHA
   When click on Routing details and enter "HYD" Origin, "NMI" Destination Airport details and click on Save button of GHA
   
   @AwbFlight
   Scenario Outline: To verify AWB create for Nmial Inbound 
   When launch browser for GHA application and login with "ACS GHA" ACS GHA user given in "Login" sheet for Flight create
   When click on Imports>> Import Manifest and enter created "<Flight>" Flight of GHA 
   When enter "AAF" with "6e" and add Flight ULD details
   When click on ULD and add AWB details in GHA
   
   Examples:
    | Flight |
    | 5457   |
    
   @ATA_Breakdown
   Scenario Outline: To verify Record ATA and Breakdown for Nmial Inbound 
   When launch browser for GHA application and login with "ACS GHA" ACS GHA user given in "Login" sheet for Flight create
   When click on Imports>> Import Manifest and enter created "<Flight>" Flight of GHA 
   ##When click on Imports>> Import Manifest and enter created Flight of GHA 
   When enter "1000" ATA date time and save "10" DocReceive, "10" Breakdown details of GHA

   Examples:
     | Flight |
     | 5457   |
  
   @MatchShipment
   Scenario Outline: To verify Match shipment  and Damage Shipment for Nmial Inbound 
   When launch browser for GHA application and login with "ACS GHA" ACS GHA user given in "Login" sheet for Flight create
   When click on Imports>> Import Manifest and enter created "<Flight>" Flight of GHA 
   When select all ULD shipment and click on Match button of GHA
   Then verify display of matched  shipment of GHA
   When select 4 shipment for Damaged Shipment and click on Discrepancy of GHA
   When enter Damage pieces details of GHA
   
   Examples:
     | Flight |
     | 5457   |
  

   @Discrepancy_1.1
   Scenario Outline: To verify Discrepancy Excess for Nmial Inbound 
   When launch browser for GHA application and login with "ACS GHA" ACS GHA user given in "Login" sheet for Flight create
   When click on Imports>> Import Manifest and enter created "<Flight>" Flight of GHA 
   Then verify display of matched  shipment of GHA
   When select 2 shipment for Excess Shipment and click on Discrepancy of GHA
   When enter "15" Excess received NOP of GHA
   When click on Save Discrepancy button of GHA
   
   Examples:
     | Flight |
     | 5457   |
  
   
   @Discrepancy_1.2
   Scenario Outline: To verify Discrepancy Short landed for Nmial Inbound 
   When launch browser for GHA application and login with "ACS GHA" ACS GHA user given in "Login" sheet for Flight create
   When click on Imports>> Import Manifest and enter created "<Flight>" Flight of GHA 
   Then verify display of matched  shipment of GHA
   When select 3 shipment for Part Shipment and click on Discrepancy of GHA
   When enter "1" Short landed received NOP of GHA
   When click on Save Discrepancy button of GHA    
   
   Examples:
     | Flight |
     | 5457   |
  

   @FlightFinalize
   Scenario Outline: To verify finalize flight for Nmial
   When launch browser for GHA application and login with "ACS GHA" ACS GHA user given in "Login" sheet for Flight create
   When click on Imports>> Import Manifest and enter created "<Flight>" Flight of GHA 
   Then verify display of matched  shipment of GHA
   When click on Flight Finalize button of GHA
   Examples:
     | Flight |
     | 5457   |
   
   @Inbound_1.1
   Scenario: To verify flight display and discrepancy detail in Nmial
   When I login with "NMIAL Agent" ACS Agent user given in "Login" sheet for Export module
   When select CTO popup screen Ok button of Export
   When click on Inbound for Airline
   When enter "4983" created Flight No of NMIAL
   Then verify display of Discrepancy Damage detail in NMIAL
   When click on Logout button of ACS Agent of Export
   When I login with "NMIAL Airline" ACS Airline user given in "Login" sheet for Export module
   When click on Inbound>> Shipments of NMIAL
   When enter "6e-4983" Flight and click on Search button for NMIAL
   When enter Chargeable Weight for displayed AWB filter of Airline
   When click on Approve Delivery Order of Airline
   When click on Logout button of ACS Agent of Export
   
   @Inbound_1.2
   Scenario: To verify flight display for Inbound Book Slot in Nmial
   #When I login with "NMIAL Airline" ACS Airline user given in "Login" sheet for Export module
   When I login with "NMIAL Agent" ACS Agent user given in "Login" sheet for Export module
   When select CTO popup screen Ok button of Export
   When click on Inbound and search "4983" Flight filter for Airline
   #When click on Ready for Delivery icon of Export
   When clicked for ASI and TSP of Export
   When clicked for Book Slot of Export
   When click on Logout button of ACS Agent of Export
   When I login with "NMIAL TPS" TPS user given in "Login" sheet for Export module
   #When select Cargo Type of Export
   When click on Parking In icon of Inbound Vehicle and click on Refresh button of Export

   
   @Inbound_1.3
   Scenario: To verify Nmial Dock and WDO Release in GHA
   When I login with "NMIAL Dock" ACS Agent user given in "Login" sheet for Export module
   When select "NMIAL DOM" Branch dropdown of Nmial Dock
   When select "NMIAL DOM" Terminal, "Domestic" Cargo Type and "Inbound" Mode
   When assign dock for VT of Book Slot
   When select Dock and clicked on Assign button
   Then verify Parking In, Parking Out and Terminal GateIn for tpsuser
   When launch browser for GHA application and login with "ACS GHA" ACS GHA user given in "Login" sheet for Flight create
   When click on VCT Generation for Imports>> Warehouse Location  for "16086840" AWB and Warehouse Delivery Order> Search AWB> Generate WDO> Released in GHA
   
   @TerminalGateOut
   Scenario: To verify Terminal GateOut in GHA
   When I login with "NMIAL TPS" ACS Agent user given in "Login" sheet for Export module
   When click on Terminal Gate Out icon of tps user
   
   @LocationMAWB
   Scenario: To verify assign of location to multiple MAWB
   When launch browser for GHA application and login with "ACS GHA" ACS GHA user given in "Login" sheet for Flight create
   When click on VCT Generation for Imports>> Warehouse Location  for "16086840" AWB in GHA
   When click on Move icon of AWB in GHA
   When select new location and click on Save button in GHA   
   
   @GenerateReports
   Scenario Outline: To verify generate Reports 
   When launch browser for GHA application and login with "ACS GHA" ACS GHA user given in "Login" sheet for Flight create
   When click on Imports>> More>> Import Operation Reports in GHA
   When select "<Report>" Type of Report in GHA Import
   
   Examples:
     | Report         |
     | Delivery Order |
     | Discrepancy Report |
     | Flight Break Down   |
     | Airline Wise Cargo Statistics | 
     | Arrival MIS Report |
     | Import WDO Generated |
     | Gatepass Details |
     | Inventory Report |
     | Inventory Generated OoC Not Received - Location Wise |
     | Undelivered Shipments Report |
     | Location Binning Report |
     
    @DemurrageCharge
    Scenario: To verify Demurrage charge
    When launch browser for GHA application and login with "ACS GHA" ACS GHA user given in "Login" sheet for Flight create
    When click on PE icon for GHA
    When clicked on Tariff> Tariff Configurator for GHA
    
    @BuildManifest_Import
    Scenario: To verify Import BuildManifest
    When launch browser for GHA application and login with "QA GHA" ACS GHA user given in "Login" sheet for Flight create
    When click on Imports> Import Manifest for Import
    When enter "" Flight and search flight for Import
    When enter "AKE" and add ULD for Import
    When add shipments for Import ULD
    
    @ImportATA_FlightFinalize
    Scenario: To verify Import Flight Finalize 
    When launch browser for GHA application and login with "QA GHA" ACS GHA user given in "Login" sheet for Flight create
    When click on Imports> Import Manifest for Import
    When click on Imports>> Import Manifest and enter created "" Flight of GHA 
    When enter "AAF" with "6e" and add Flight ULD details
    When click on ULD and add AWB details in GHA
    When clicked on Warehouse Delivery Order tab, Generate Print WDO with Demurrage Charge and Released Shipment Import 
   
       
   
   
   
   
   

   
   
   