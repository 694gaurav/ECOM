@BIAL_ECOM
Feature: BIAL Ecom feature 
 Background: Launch the BIAL Ecom application and login the application
 
 @NonEShipment_1.1  
 Scenario Outline: To verify create AWB shipment without bags with single VCT for Ecom BIAL 
 When launch browser for BIAL Ecom application and login with "BIAL ECOM UAT" BIAL user given in "Login" sheet for Outbound
 When I login with "BIAL ECOM UAT" BIAL Ecom Agent user given in "Login" sheet for Outbound
 When click on CTO popup button for Outbound
 When click eAWB> Create AWB button for Outbound
 When select "<CTO>" CTO for ECOM Outbound
 When enter "" NOP and "10" Gross Weight for NonEShipmentOutbound
 When enter "<Pfx>" Awb Pfx details and enter AWB cargo details for Outbound
 When deselect eComm shipment checkbox for Outbound
 When click on bag Dimension icon for Outbound
 When enter Dimension pieces for NonEShipment
 When click on Save AWB button for Outbound
 When enter "" AWB filter for Outbound
 When click on ASI icon of AWB for Outbound
 When click on ASI Proceed button and Export
 When click on CO icon of AWB for Outbound
 When upload eDocket files for Outbound
 When click on logout icon of Outbound
 When I login with "BIAL ECOM Approver" BIAL Ecom Approver user given in "Login" sheet for Outbound
 When search "<Pfx>" pfx "" AWB for Approval
 Then verify eDocket files are uploaded in Approver
 When approve submitted ASI for Outbound
 When approve "" Flight No in Airline
 When click on logout icon of Outbound
 When launch browser for BIAL Ecom application and login with "BIAL ECOM UAT" BIAL user given in "Login" sheet for Outbound
 When I login with "BIAL ECOM UAT" BIAL Ecom Agent user given in "Login" sheet for Outbound
 When click on CTO popup button for Outbound
 When enter "" AWB filter for Outbound
 When click on TSP icon and click on Pay Now button for Outbound
 When click on Add Shipment and select shipment for Outbound
 When enter Vehicle details and click on Generate Token for Add NonEShipment Outbound
   
 Examples:
   | Pfx | CTO   |
   | 312 | MABPL |
 
 
 @NonEShipment_1.2  
 Scenario Outline: To verify create AWB shipment without bags with eDocket for Ecom BIAL 
 When launch browser for BIAL Ecom application and login with "BIAL ECOM UAT" BIAL user given in "Login" sheet for Outbound
 When I login with "BIAL ECOM UAT" BIAL Ecom Agent user given in "Login" sheet for Outbound
 When click on CTO popup button for Outbound
 When click eAWB> Create AWB button for Outbound
 When select "<CTO>" CTO for ECOM Outbound
 When enter "" NOP and "10" Gross Weight for NonEShipmentOutbound
 When enter "<Pfx>" Awb Pfx details and enter AWB cargo details for Outbound
 When deselect eComm shipment checkbox for Outbound
 When click on bag Dimension icon for Outbound
 When enter Dimension pieces for NonEShipment
 When click on Save AWB button for Outbound
 When enter "" AWB filter for Outbound
 When click on ASI icon of AWB for Outbound
 When click on ASI Proceed button and Export
 When click on CO icon of AWB for Outbound
 When upload eDocket files for Outbound
 When click on logout icon of Outbound
 When I login with "BIAL ECOM Approver" BIAL Ecom Approver user given in "Login" sheet for Outbound
 When search "<Pfx>" pfx "" AWB for Approval
 Then verify eDocket files are uploaded in Approver
 When approve submitted ASI for Outbound
 When approve "" Flight No in Airline
 When click on logout icon of Outbound
 When launch browser for BIAL Ecom application and login with "BIAL ECOM UAT" BIAL user given in "Login" sheet for Outbound
 When I login with "BIAL ECOM UAT" BIAL Ecom Agent user given in "Login" sheet for Outbound
 When click on CTO popup button for Outbound
 When enter "" AWB filter for Outbound
 When click on TSP icon and click on Pay Now button for Outbound
 When enter Vehicle details and click on Add Token for NonEShipment Outbound
 When enter 2 Vehicle details and click on Generate Token for NonEShipment Outbound
   
 Examples:
   | Pfx | CTO   |
   | 312 | MABPL |
 
 
 @NonEShipment_1.3
 Scenario Outline: To verify Create with copy shipment without bags with eDocket for Ecom BIAL 
 When launch browser for BIAL Ecom application and login with "BIAL ECOM UAT" BIAL user given in "Login" sheet for Outbound
 When I login with "BIAL ECOM UAT" BIAL Ecom Agent user given in "Login" sheet for Outbound
 When click on CTO popup button for Outbound
 When click on Copy icon for Outbound
 When enter "<Pfx>" Awb Pfx details for Outbound
 When deselect eComm shipment checkbox for Outbound
 When enter "" NOP and "10" Gross Weight for NonEShipmentOutbound
 When click on bag Dimension icon for Outbound
 When enter Dimension pieces for NonEShipment
 When click on Save AWB button for Outbound
 When enter "" AWB filter for Outbound
 When click on ASI icon of AWB for Outbound
 When click on ASI Proceed button and Export
 When click on CO icon of AWB for Outbound
 When upload eDocket files for Outbound
 When click on logout icon of Outbound
 When I login with "BIAL ECOM Approver" BIAL Ecom Approver user given in "Login" sheet for Outbound
 When search "<Pfx>" pfx "" AWB for Approval
 Then verify eDocket files are uploaded in Approver
 When approve submitted ASI for Outbound
 When approve "" Flight No in Airline
 When click on logout icon of Outbound
 When launch browser for BIAL Ecom application and login with "BIAL ECOM UAT" BIAL user given in "Login" sheet for Outbound
 When I login with "BIAL ECOM UAT" BIAL Ecom Agent user given in "Login" sheet for Outbound
 When click on CTO popup button for Outbound
 When enter "" AWB filter for Outbound
 When click on TSP icon and click on Pay Now button for Outbound
 When enter Vehicle details and click on Add Token for NonEShipment Outbound
 When enter 2 Vehicle details and click on Generate Token for NonEShipment Outbound

 Examples:
   | Pfx | CTO   |
   | 312 | MABPL |
   
   
 @SIR_EShipment
  Scenario Outline: To verify SIR with EShipment
  #When launch browser for BIAL Ecom application and login with "BIAL ECOM UAT" BIAL user given in "Login" sheet for Outbound
  When I login with "BIAL ECOM UAT" BIAL Ecom Agent user given in "Login" sheet for Outbound
  When click on CTO popup button for Outbound
  When click eAWB> Create AWB button for Outbound
  When select "<CTO>" CTO for ECOM Outbound
  When select eComm shipment checkbox for Outbound
  When enter "" NOP and "10" Gross Weight for NonEShipmentOutbound
  When enter "<Pfx>" Awb Pfx details and enter AWB cargo details for Outbound
  #When enter "3" NOP and "30" Gross Weight for Outbound
  When click on bag Dimension icon for Outbound
  When click on Add dimension of entered bags and update pieces for Outbound
  #When click on bag Dimension icon for Outbound
  ##When upload file of Bag pieces for Outbound
  When click on Save AWB button for Outbound
  When enter "" AWB filter for Outbound
  When click on ASI icon of AWB for Outbound
  When click on ASI Proceed button and Export
  #When click on CO icon of AWB for Outbound
  When upload eDocket files for Outbound
  When click on logout icon of Outbound
  ##CO
  #When I login with "BIAL ECOM Approver" BIAL Ecom Approver user given in "Login" sheet for Outbound
  #When search "<Pfx>" pfx "" AWB for Approval
  #Then verify eDocket files are uploaded in Approver
  #When approve submitted ASI for Outbound
  #When approve "" Flight No in Airline
  #When click on logout icon of Outbound
 ##When launch browser for BIAL Ecom application and login with "BIAL ECOM UAT" BIAL user given in "Login" sheet for Outbound
 When I login with "BIAL ECOM UAT" BIAL Ecom Agent user given in "Login" sheet for Outbound
 When click on CTO popup button for Outbound
 When enter "" AWB filter for Outbound
 When click on TSP icon and click on Pay Now button for Outbound
 When click on logout icon of Outbound
 When I login with "BIAL ECOM UAT" BIAL Ecom Agent user given in "Login" sheet for Outbound
 When click on CTO popup button for Outbound
 When enter "" AWB filter for Outbound
 When click on Vehicle Token icon for Outbound
 When enter Vehicle details and click on Add Token for Outbound
 When enter 2 Vehicle details and click on Generate Token for Outbound
 When click on logout icon of Outbound
  When I login with "BIAL ECOM UAT" BIAL Ecom Agent user given in "Login" sheet for Outbound
  When click on CTO popup button for Outbound

  ##When launch browser for Ecom GHA application and login with "ECOM GHA user" ECOM GHA user given in "Login" sheet for Outbound
  ##When click on VCT> VCT Generation and click on VCT no for ECOM Outbound
  ##When click on VCT> VCT Acceptance, select 1 Bag level shipment  select Door and "" click on Dock In button for ECOM Outbound
  ##When click on Accept button for ECOM Outbound
  ##When select 2 Bag level shipment  select Door and "" click on Dock In button for ECOM Outbound
  #When click on Accept button for ECOM Outbound
  ##When click on Accept button and click on Complete Accept button for ECOM Outbound
  ##When select 1 AWB level shipment for ECOM Outbound
  ##When click on Accept button for ECOM Outbound
  ##When click on Complete Accept button for ECOM Outbound
  #When I login with "BIAL ECOM UAT" BIAL Ecom Agent user given in "Login" sheet for Outbound
  ##When click on SIR icon of created AWB for ECOM Outbound 
  When launch browser for Ecom GHA application and login with "ECOM GHA user" ECOM GHA user given in "Login" sheet for Outbound
  When click on VCT> VCT Generation and click on VCT no for ECOM Outbound
  When click on VCT> VCT Acceptance, select 1 Bag level shipment  select Door and "" click on Dock In button for ECOM Outbound
  When click on Accept button for ECOM Outbound
  When enter "" AWB filter for Outbound
  When click on SIR icon of created AWB for ECOM Outbound 

  
  
  Examples:
   | Pfx | CTO   |
   | 312 | MABPL |

  @SIR
  Scenario Outline: To verify SIR AWB
 When I login with "BIAL ECOM UAT" BIAL Ecom Agent user given in "Login" sheet for Outbound
  When click on CTO popup button for Outbound
  When launch browser for Ecom GHA application and login with "ECOM GHA user" ECOM GHA user given in "Login" sheet for Outbound
  When click on VCT> VCT Generation and click on VCT no for ECOM Outbound
  When click on VCT> VCT Acceptance, select 1 Bag level shipment  select Door and "" click on Dock In button for ECOM Outbound
  When click on Accept button for ECOM Outbound
  ##When select 2 Bag level shipment  select Door and "" click on Dock In button for ECOM Outbound
  #When click on Accept button for ECOM Outbound
  ##When click on Accept button and click on Complete Accept button for ECOM Outbound
  ##When select 1 AWB level shipment for ECOM Outbound
  ##When click on Accept button for ECOM Outbound
  ##When click on Complete Accept button for ECOM Outbound
  #When I login with "BIAL ECOM UAT" BIAL Ecom Agent user given in "Login" sheet for Outbound
  When click on SIR icon of created AWB for ECOM Outbound 
  
  
  Examples:
   | Pfx | CTO   |
   | 312 | MABPL |

  @AWB_BTT
  Scenario: To verify BTT with SIR AWB
  When I login with "BIAL ECOM UAT" BIAL Ecom Agent user given in "Login" sheet for Outbound
  When click on CTO popup button for Outbound
  When launch browser for Ecom GHA application and login with "ECOM GHA user" ECOM GHA user given in "Login" sheet for Outbound
  ##When click on VCT> VCT Generation and click on VCT no for ECOM Outbound
  ###When click on VCT> VCT Acceptance, select 2 Bag level shipment  select Door and "" click on Dock In button for ECOM Outbound
  ###When click on Accept button for ECOM Outbound
  ###When select 2 Bag level shipment  select Door and "" click on Dock In button for ECOM Outbound
  ###When click on Accept button for ECOM Outbound
  ###When click on Accept button and click on Complete Accept button for ECOM Outbound

  ##When select 1 AWB level shipment for ECOM Outbound
  ##When click on Accept button for ECOM Outbound
  ##When click on Complete Accept button for ECOM Outbound
  ##When click on Logout button for Galaxy ECOM

  #When I login with "BIAL ECOM UAT" BIAL Ecom Agent user given in "Login" sheet for Outbound
  ##When click on SIR icon of created AWB for ECOM Outbound 
  
  ##When click on CTO popup button for Outbound
  ##When launch browser for Ecom GHA application and login with "ECOM GHA user" ECOM GHA user given in "Login" sheet for Outbound
  When click on Exports> Export AWB Amendment for Outbound
  When enter "" AWB and click on Search button for AWB Amendment ECOM Outbound
  When click on Bag Details button and add Bag for Outbound
  When enter Chargeable Weight
  When click on Exports> Security Acceptance for Outbound and click on search button for AWB 
  When click on Print sticker icon, click on Save button and click on Rejection button for Outbound
  When select AWB to reject, enter Remarks and click on Reject button for Outbound
  When click on More> Back To Town and search AWB for Outbound 
  When enter BTT details with Reason, enter Bag BTT details and click on Record BTT button for Outbound  
  When select BTT Document and click on Collect Charges button for Outbound
  When click on Calculate Charges and Pay Proceed button for Outbound 
  When click on More> Back To Town and search AWB for Outbound 
  When select BTT Document and click on Generate Gatepass button for Outbound
  When select BTT Document and click on Release Gatepass button for Outbound
  
  @BTT_Gatepass
  Scenario: To verify Gatepass

  When I login with "BIAL ECOM UAT" BIAL Ecom Agent user given in "Login" sheet for Outbound
  When click on CTO popup button for Outbound
  When launch browser for Ecom GHA application and login with "ECOM GHA user" ECOM GHA user given in "Login" sheet for Outbound
  When click on Masters>> More>> Flight> Details in ECOM GHA
  When click on Add button and enter "6e" Flight No, select "1634" Aircraft Type in Flight Details of ECOM GHA
  When click on Routing details and enter "BLR" Origin, "HYD" Destination Airport details and click on Save button of ECOM GHA
  When click on Export>> Build Manifest in ECOM GHA
  When enter "6e" and search flight and click on Add ULD details in ECOM GHA
  When select ULD and click on Add Ship button in ECOM GHA
  When select shipment and click on Add Shipment button in ECOM GHA
  When click on Close ULD, click on Flight Builtup button and clicked on Generate Gatepass button in ECOM GHA
  When click on Exports>> More>> Gatepass and click on Release Gatepass button in ECOM GHA 
  When click on Exports>> Security Acceptance and clicked on Final Submit button in ECOM GHA
  
  @TrackandTrace
  Scenario: To verify Track and Trace for rejected bags 
  When I login with "BIAL ECOM UAT" BIAL Ecom Agent user given in "Login" sheet for Outbound
  When click on CTO popup button for Outbound
  When click on Track and Trace tab of ECOM
  When clicked on AWB, select 3 Bag and click on Go button of ECOM
  Then verify Flight shipment departure as updated 
  
  
  @Inbound_WDO
  Scenario: To verify Inbound WDO and create Flight 
  When I login with "BIAL ECOM Approver" BIAL Ecom Agent user given in "Login" sheet for Outbound
  When launch browser for Ecom GHA application and login with "ECOM GHA user" ECOM GHA user given in "Login" sheet for Inbound
  When click on Masters>> More>> Flight> Details in ECOM GHA
  When click on Add button and enter "6e" Flight No, select "1634" Aircraft Type in Flight Details of ECOM GHA
  When click on Routing details and enter "HYD" Origin, "BLR" Destination Airport details and click on Save button of ECOM GHA
  When click on Imports>> Import Manifest and enter created "" Flight of ECOM GHA 
  When enter "AAF" with "6e" and add Flight ULD details
  When click on ULD and add AWB details in ECOM GHA
  When enter "1000" ATA date time and save "10" DocReceive, "10" Breakdown details of ECOM GHA
  When select all ULD shipment and click on Match button of ECOM GHA
  Then verify display of matched  shipment of ECOM GHA
  When select 4 shipment for Damaged Shipment and click on Discrepancy of ECOM GHA
  When enter Damage pieces details of ECOM GHA
  Then verify display of matched  shipment of ECOM GHA
  When select 2 shipment for Excess Shipment and click on Discrepancy of ECOM GHA
  When enter "15" Excess received NOP of GHA
  When click on Save Discrepancy button of ECOM GHA
  Then verify display of matched  shipment of ECOM GHA
  When select 3 shipment for Part Shipment and click on Discrepancy of ECOM GHA
  When enter "1" Short landed received NOP of ECOM GHA
  When click on Save Discrepancy button of ECOM GHA    
  When click on Flight Finalize button of ECOM GHA
  When launch BIAL ECOM application
  When I login with "BIAL ECOM Approver" BIAL Ecom Agent user given in "Login" sheet for Outbound
  When click on CTO popup button for Outbound
  When click on Inbound tab, select flight and enter Chargeable Weight and click on Approve Delivery Order of ECOM
  When click on logout icon of Outbound
  When I login with "BIAL ECOM UAT" BIAL Ecom Agent user given in "Login" sheet for Outbound
  When click on CTO popup button for Outbound
  ##When launch browser for Ecom GHA application and login with "ECOM GHA user" ECOM GHA user given in "Login" sheet for Inbound
  When click on Inbound tab, select flight for ASI, TSP and generate token for ECOM GHA
  When click on Imports> Warehouse Location and save AWB details for ECOM GHA
  When click on Imports> More> Warehouse Delivery Order, search AWB, click on Generate WDO and Release button for ECOM GHA 
  
  @InboundWDO_1.2
  Scenario: To verify create Inbound WDO shipment 
  When I login with "BIAL ECOM Approver" BIAL Ecom Agent user given in "Login" sheet for Outbound
  #When click on CTO popup button for Outbound
  When click on Inbound tab, select flight and enter Chargeable Weight and click on Approve Delivery Order of ECOM
  When click on logout icon of Outbound
  When I login with "BIAL ECOM UAT" BIAL Ecom Agent user given in "Login" sheet for Outbound
  #When click on CTO popup button for Outbound
  ##When launch browser for Ecom GHA application and login with "ECOM GHA user" ECOM GHA user given in "Login" sheet for Inbound
  When click on Inbound tab, select flight for ASI, TSP and generate token for ECOM GHA
  When click on Imports> Warehouse Location and save AWB details for ECOM GHA
  When click on Imports> More> Warehouse Delivery Order, search AWB, click on Generate WDO and Release button for ECOM GHA 


    ##When clicked on logout button for GHA
  @MLM
  Scenario: To verify create MLM shipment 
  When I login with "BIAL ECOM Approver" BIAL Ecom Agent user given in "Login" sheet for Outbound
  When launch browser for Ecom GHA application and login with "ECOM GHA user" ECOM GHA user given in "Login" sheet for Inbound
  When click on Masters>> More>> Flight> Details in ECOM GHA
  When click on Add button and enter "6e" Flight No, select "1634" Aircraft Type in Flight Details of ECOM GHA
  When click on Routing details and enter "HYD" Origin, "BLR" Destination Airport details and click on Save button of ECOM GHA
  When click on Imports>> Import Manifest and enter created "" Flight of ECOM GHA 
  When enter "AAF" with "6e" and add Flight ULD details
  #When enter and add ULD details of ECOM GHA
  When click on created ULD, enter and save MLM shipment details of ECOM GHA
  When enter "1000" ATA date time, select shipment and click on Match button of ECOM GHA
  When select shipment and click on Discrepancy button to enter details of ECOM GHA
  When click on Import> More> Associate AWB and of ECOM GHA 
  When select "New Shipment" Action dropdown,enter and save AWB details as part shipment NOP and Gross Weight 
  

   
 @EShipmentBags_1.1
 Scenario Outline: To verify create with Copy shipment Bag pieces with EShipment TSP and eDocket 

 When launch browser for BIAL Ecom application and login with "BIAL ECOM UAT" BIAL user given in "Login" sheet for Outbound
 When I login with "BIAL ECOM UAT" BIAL Ecom Agent user given in "Login" sheet for Outbound
 When click on CTO popup button for Outbound
 When click on Copy icon for Outbound
 When select "<CTO>" CTO for ECOM Outbound
 When enter "<Pfx>" Awb Pfx details for Outbound
 When select eComm shipment checkbox for Outbound
 #When enter "3" NOP and "30" Gross Weight for Outbound
 When click on bag Dimension icon for Outbound
 When click on Add dimension of entered bags and update pieces for Copy Outbound
 #When click on bag Dimension icon for Outbound
 ##When upload file of Bag pieces for Outbound
 When click on Save AWB button for Outbound
 When enter "" AWB filter for Outbound
 When click on ASI icon of AWB for Outbound
 When click on ASI Proceed button and Export
 When click on CO icon of AWB for Outbound
 When upload eDocket files for Outbound
 When launch browser for BIAL Ecom application and login with "BIAL ECOM UAT" BIAL user given in "Login" sheet for Outbound
 When I login with "BIAL ECOM Approver" BIAL Ecom Approver user given in "Login" sheet for Outbound
 When search "<Pfx>" pfx "" AWB for Approval
 Then verify eDocket files are uploaded in Approver
 When approve submitted ASI for Outbound
 When approve "" Flight No in Airline
 When click on logout icon of Outbound
 When launch browser for BIAL Ecom application and login with "BIAL ECOM UAT" BIAL user given in "Login" sheet for Outbound
 When I login with "BIAL ECOM UAT" BIAL Ecom Agent user given in "Login" sheet for Outbound
 When click on CTO popup button for Outbound
 When enter "" AWB filter for Outbound
 When click on TSP icon and click on Pay Now button for Outbound
 When click on logout icon of Outbound
 When I login with "BIAL ECOM UAT" BIAL Ecom Agent user given in "Login" sheet for Outbound
 When click on CTO popup button for Outbound
 When enter "" AWB filter for Outbound
 When click on Vehicle Token icon for Outbound
 When enter Vehicle details and click on Generate Token for Outbound
 
 Examples:
   | Pfx | CTO       |
   | 312 | MABPL     |
  #| 312 | Kale_GHA1 |
   
 @ResubmitASI_CO 
 Scenario Outline: To verify Resubmit ASI CO with EShipment
 When launch browser for BIAL Ecom application and login with "BIAL ECOM UAT" BIAL user given in "Login" sheet for Outbound
 When I login with "BIAL ECOM UAT" BIAL Ecom Agent user given in "Login" sheet for Outbound
 When click on CTO popup button for Outbound
 When click on Copy icon for Outbound
 When select "<CTO>" CTO for ECOM Outbound
 When enter "312" Awb Pfx details for Outbound
 When click on bag Dimension icon for Outbound
 When click on Add dimension of entered bags and update pieces for Outbound
 When click on Save AWB button for Outbound
 When enter "" AWB filter for Outbound
 When click on ASI icon of AWB for Outbound
 When click on ASI Proceed button and Export
 When click on 2 Edit icon of EShipment for Outbound
 When select Cargo and Commodity type of EShipment for Outbound
 When click on Save AWB button for Outbound
 When click on Ok button of Resubmit popup
 When click on CO icon of AWB for Outbound
 When click on logout icon of Outbound
 When I login with "BIAL ECOM Approver" BIAL Ecom Approver user given in "Login" sheet for Outbound
 When search "<Pfx>" pfx "" AWB for Approval
 Then verify eDocket files are uploaded in Approver
 When approve submitted ASI for Outbound
 When approve "" Flight No in Airline
 When click on logout icon of Outbound

 
 Examples:
   | Pfx | CTO       |
   | 999 | Kale_GHA1 |
 
 
 @BagUpload_ResubmitASI
 Scenario: To verify upload for Bag pieces with EShipment for Ecom BIAL 
 When launch browser for BIAL Ecom application and login with "BIAL ECOM UAT" BIAL user given in "Login" sheet for Outbound
 When I login with "BIAL ECOM UAT" BIAL Ecom Agent user given in "Login" sheet for Outbound
 When click on CTO popup button for Outbound
 When click on Copy icon for Outbound
 When enter "312" Awb Pfx details for Outbound
 #When select eComm shipment checkbox for Outbound
 #When enter "3" NOP and "30" Gross Weight for Outbound
 When click on bag Dimension icon for Outbound
 #When click on Add dimension of entered bags and update pieces for Outbound
 When upload file of Bag pieces for Outbound
 When click on Save AWB button for Outbound
 When enter "" AWB filter for Outbound
 When click on Edit icon with Cargo type and Shipper Consignee details for Outbound
 When click on Save AWB button for Outbound
 
 @TSP_ASI
 Scenario: To verify TSP from Galaxy for AWB ASI 
 When launch browser for BIAL Ecom application and login with "BIAL ECOM UAT" BIAL user given in "Login" sheet for Outbound
 When I login with "BIAL ECOM UAT" BIAL Ecom Agent user given in "Login" sheet for Outbound
 When click on CTO popup button for Outbound
 When click on Copy icon for Outbound
 When enter "312" Awb Pfx details for Outbound
 #When select eComm shipment checkbox for Outbound
 #When enter "3" NOP and "30" Gross Weight for Outbound
 When click on bag Dimension icon for Outbound
 When click on Add dimension of entered bags and update pieces for Outbound
 #When click on bag Dimension icon for Outbound
 ##When upload file of Bag pieces for Outbound
 When click on Save AWB button for Outbound
 When enter "" AWB filter for Outbound
 When click on ASI icon of AWB for Outbound
 When click on ASI Proceed button and Export
  When click on CO icon of AWB for Outbound
 When upload eDocket files for Outbound
 When launch browser for BIAL Ecom application and login with "BIAL ECOM UAT" BIAL user given in "Login" sheet for Outbound
 When I login with "BIAL ECOM Approver" BIAL Ecom Approver user given in "Login" sheet for Outbound
 When search "<Pfx>" pfx "" AWB for Approval
 Then verify eDocket files are uploaded in Approver
 When approve submitted ASI for Outbound
 When approve "" Flight No in Airline
 When click on logout icon of Outbound
 When I login with "BIAL ECOM UAT" BIAL Ecom Agent user given in "Login" sheet for Outbound
 When click on CTO popup button for Outbound
 When launch browser for Galaxy application and login with "ACS GHA" ACS GHA user given in "Login" sheet for ECOM TSP
 When click on Billing>> Customer Invoice for TSP
 When select "Export Invoice" Document Type, enter AWB, click on Search button with click on Calc Charges and Pay Proceed button
 
 #When launch browser for BIAL Ecom application and login with "BIAL ECOM UAT" BIAL user given in "Login" sheet for Outbound
 When I login with "BIAL ECOM UAT" BIAL Ecom Agent user given in "Login" sheet for Outbound
 When click on CTO popup button for Outbound
 When click on Copy icon for Outbound
 When enter "312" Awb Pfx details for Outbound
 #When select eComm shipment checkbox for Outbound
 #When enter "3" NOP and "30" Gross Weight for Outbound
 When click on bag Dimension icon for Outbound
 When click on Add dimension of entered bags and update pieces for Outbound
 #When click on bag Dimension icon for Outbound
 ##When upload file of Bag pieces for Outbound
 When click on Save AWB button for Outbound
 When enter "" AWB filter for Outbound
 When click on ASI icon of AWB for Outbound
 When click on ASI Proceed button and Export
 When launch browser for Galaxy application and login with "GHA" ACS GHA user given in "Login" sheet for ECOM TSP
 When click on Billing>> Customer Invoice for TSP
 When select "Export Invoice" Document Type, enter AWB, click on Search button with click on Calc Charges and Pay Proceed button
  
 @EcomBags_1.1
 Scenario: To verify Bag pieces without EShipment for Ecom BIAL 
 When launch browser for BIAL Ecom application and login with "BIAL ECOM UAT" BIAL user given in "Login" sheet for Outbound
 When I login with "BIAL ECOM UAT" BIAL Ecom Agent user given in "Login" sheet for Outbound
 When click on CTO popup button for Outbound
 When click on Copy icon for Outbound
 When enter "312" Awb Pfx details for Outbound
 When deselect eComm shipment checkbox for Outbound
 When enter "2" NOP and "20" Gross Weight for Outbound
 When click on bag Dimension icon for Outbound
 When click on Save AWB button for Outbound
 
 @EcomBags_1.2
 Scenario: To verify Bag pieces with EShipment for Ecom BIAL 
 When launch browser for BIAL Ecom application and login with "BIAL ECOM UAT" BIAL user given in "Login" sheet for Outbound
 When I login with "BIAL ECOM UAT" BIAL Ecom Agent user given in "Login" sheet for Outbound
 When click on CTO popup button for Outbound
 When click on Copy icon for Outbound
 When enter "312" Awb Pfx details for Outbound
 When select eComm shipment checkbox for Outbound
 When enter "3" NOP and "30" Gross Weight for Outbound
 When click on bag Dimension icon for Outbound
 When click on Add dimension of entered bags and update pieces for Outbound
 When click on Save AWB button for Outbound
 
 @ASI
 Scenario Outline: To verify IDG Report and ASI with TSP EShipment for Ecom BIAL 
 When launch browser for BIAL Ecom application and login with "BIAL ECOM UAT" BIAL user given in "Login" sheet for Outbound
 When I login with "BIAL ECOM UAT" BIAL Ecom Agent user given in "Login" sheet for Outbound
 When click on CTO popup button for Outbound
 When enter "<AWB>" AWB filter for Outbound
 When click on ASI icon of AWB for Outbound
 When click on Proceed button and click on Yes Confirmation button of Export
 
 Examples:
  | AWB     |
  | 11496306|
 
 
 @CO
 Scenario Outline: To verify IDG Report and CO with TSP EShipment for Ecom BIAL 
 When launch browser for BIAL Ecom application and login with "BIAL ECOM UAT" BIAL user given in "Login" sheet for Outbound
 When I login with "BIAL ECOM UAT" BIAL Ecom Agent user given in "Login" sheet for Outbound
 When click on CTO popup button for Outbound
 When enter "<AWB>" AWB filter for Outbound
 When click on CO icon of AWB for Outbound
 When click on logout icon of Outbound
 Examples:
  | AWB     |
  | 11496306|
 
 @CO_Approval
 Scenario Outline: To verify IDG Report and CO with TSP EShipment for Ecom BIAL 
 When I login with "BIAL ECOM Approver" BIAL Ecom Approver user given in "Login" sheet for Outbound
 When search "312" pfx "<AWB>" AWB for Approval
 When approve submitted ASI for Outbound
 When approve "" Flight No in Airline
 When click on logout icon of Outbound
 When click on Reports> IDG Report for Outbound
 When click on IDG Export to Excel button for Outbound
 Then verify record is displayed as Approved
 
  Examples:
  | AWB     |
  | 11496306|

 
 @TSP
 Scenario Outline: To verify IDG Report and CO with TSP EShipment for Ecom BIAL 
 When launch browser for BIAL Ecom application and login with "BIAL ECOM UAT" BIAL user given in "Login" sheet for Outbound
 When I login with "BIAL ECOM UAT" BIAL Ecom Agent user given in "Login" sheet for Outbound
 When click on CTO popup button for Outbound
 When enter "<AWB>" AWB filter for Outbound
 When click on TSP icon and click on Pay Now button for Outbound
 When click on logout icon of Outbound
 When I login with "BIAL ECOM Approver" BIAL Ecom Approver user given in "Login" sheet for Outbound
 
 Examples:
  | AWB     |
  | 11496306|
 
 @BagUpload
 Scenario: To verify upload for Bag pieces with EShipment for Ecom BIAL 
 When launch browser for BIAL Ecom application and login with "BIAL ECOM UAT" BIAL user given in "Login" sheet for Outbound
 When I login with "BIAL ECOM UAT" BIAL Ecom Agent user given in "Login" sheet for Outbound
 When click on CTO popup button for Outbound
 When click on Copy icon for Outbound
 When enter "312" Awb Pfx details for Outbound
 When select eComm shipment checkbox for Outbound
 When enter "3" NOP and "30" Gross Weight for Outbound
 When click on bag Dimension icon for Outbound
 #When click on Add dimension of entered bags and update pieces for Outbound
 When upload file of Bag pieces for Outbound

 
 @Ecom_eDocket
 Scenario: To verify eDocket Approval for Ecom BIAL 
 When launch browser for BIAL Ecom application and login with "BIAL ECOM UAT" BIAL user given in "Login" sheet for Outbound
 When I login with "BIAL ECOM UAT" BIAL Ecom Agent user given in "Login" sheet for Outbound
 When click on CTO popup button for Outbound
 When upload eDocket files for Outbound
 When click on logout icon of Outbound
 When I login with "BIAL ECOM Approver" BIAL Ecom Approver user given in "Login" sheet for Outbound
 Then verify eDocket files are uploaded in Approver
 
 @ResubmitASI
 Scenario: To verify Resubmit ASI
 When launch browser for BIAL Ecom application and login with "BIAL ECOM UAT" BIAL user given in "Login" sheet for Outbound
 When I login with "BIAL ECOM UAT" BIAL Ecom Agent user given in "Login" sheet for Outbound
 When click on CTO popup button for Outbound
 When enter "" AWB filter for Outbound
 When click on Edit icon with Cargo type and Shipper Consignee details for Outbound
 When click on Save AWB button for Outbound
 
 @GenerateToken
 Scenario: To verify Generate Token
 When launch browser for BIAL Ecom application and login with "BIAL ECOM UAT" BIAL user given in "Login" sheet for Outbound
 When I login with "BIAL ECOM UAT" BIAL Ecom Agent user given in "Login" sheet for Outbound
 When click on CTO popup button for Outbound
 When enter "11496306" AWB filter for Outbound
 When click on Vehicle Token icon for Outbound
 When enter Vehicle details and click on Generate Token for Outbound

 @RegenerateToken
 Scenario: To verify regenerate Token
 When launch browser for BIAL Ecom application and login with "BIAL ECOM UAT" BIAL user given in "Login" sheet for Outbound
 When I login with "BIAL ECOM UAT" BIAL Ecom Agent user given in "Login" sheet for Outbound
 When click on CTO popup button for Outbound
 #When enter "18268876" AWB filter for Outbound
 When click on Vehicle Token icon for Outbound
 #When enter Vehicle details and click on Add Token for Outbound
 #When enter 2 Vehicle details and click on Generate Token for Outbound
 When enter Vehicle details and click on Add Token for NonEShipment Outbound
 When enter 2 Vehicle details and click on Generate Token for NonEShipment Outbound

 @AWBprint
 Scenario: To verify print of approved AWB
 When launch browser for BIAL Ecom application and login with "BIAL ECOM UAT" BIAL user given in "Login" sheet for Outbound
 When I login with "BIAL ECOM UAT" BIAL Ecom Agent user given in "Login" sheet for Outbound
 When click on CTO popup button for Outbound
 When enter "34345452" AWB filter for Outbound
 When click on Print icon for AWB Outbound
 When click on Roll paper radiobutton for Outbound
 When enter label information for Outbound
 When click on Print button for Outbound
 
