@NMIAL_INTL
Feature: NMIAL INTLfeature 
  Background: Launch the NMIAL Outbound application and login the application
     
 @FlightINTL_1.1
 Scenario: To verify Flight create for Nmial INTL 
 When launch browser for GHA application and login with "INTL GHA" INTL GHA user given in "Login" sheet for Export module
 When click on Masters>> More>> Flight> Details in GHA
 When click on Add button and enter "6e" Flight No, select "" Aircraft Type in Flight Details of GHA
 When click on Routing details and enter "SAN" Origin, "NMI" Destination Airport details and click on Save button of GHA
 
@IGM_Shipment
Scenario: To verify Consol and Direct Shipment with Warehouse Location
When launch browser for GHA application and login with "INTL GHA" INTL GHA user given in "Login" sheet for Export module
When click on Imports>> Import Manifest and enter created "1232" Flight of INTL GHA 
##When enter "AAF" with "6e" and add Flight ULD details
When enter "AKE" with "6e" and add Flight ULD details
When click on ULD and add Consol and Direct shipment AWB details in INTL GHA

@IGM_ATA
Scenario: To verify ATA Match shipment
When launch browser for GHA application and login with "INTL GHA" INTL GHA user given in "Login" sheet for Export module
When click on Imports>> Import Manifest and enter created "1232" Flight of INTL GHA 
When enter "" with "6e" Flight of INTL GHA
When enter Custom IGM, enter "1000" ATA date time of INTL
When enter "" ATA date time and save "10" DocReceive, "10" Breakdown details of GHA


@IGM_HAWB
Scenario: To verify HAWB Consol and Direct Shipment IGM and ATA Match shipment Warehouse Location
When launch browser for GHA application and login with "INTL GHA" INTL GHA user given in "Login" sheet for Export module
When click on Imports>> Import Manifest and enter created "1232" Flight of INTL GHA 
##When enter "AAF" with "6e" and add Flight ULD details
##When enter "" with "6e" Flight of INTL GHA
##When enter Custom IGM, enter "1000" ATA date time of INTL
##When enter "" ATA date time and save "10" DocReceive, "10" Breakdown details of GHA
When select all ULD shipment and click on Match button of GHA
Then verify display of matched  shipment of GHA
When clicked on Consol shipment icon of INTL GHA
When enter HAWB details of INTL GHA

@IGM_HAWB10
Scenario: To verify create 10 HAWB Consol Shipment 
When launch browser for GHA application and login with "INTL GHA" INTL GHA user given in "Login" sheet for Export module
When click on Imports>> Import Manifest and enter created "1232" Flight of INTL GHA 
When select all ULD shipment and click on Match button of GHA
Then verify display of matched  shipment of GHA
When clicked on Consol shipment icon of INTL GHA
When enter 10 HAWB details of INTL GHA



@AirlineApproval
Scenario: To verify Airline Approval for Delivery Order
When I login with "INTL NMIAL Airline" ACS Agent user given in "Login" sheet for Export module
When click on Inbound tab of NMIAL INTL
When enter "" IGM No for INTL Airline
When enter "6e6845" Flight and click on Search button for NMIAL
When enter Chargeable Weight for displayed AWB filter of INTL Airline
When click on Approve Delivery Order of Airline
When click on Logout button of ACS Agent of Export
When I login with "INTL NMIAL UAT" ACS Airline user given in "Login" sheet for Export module
When click on Inbound>> Shipments of NMIAL
When enter "6e-6845" Flight and click on Search button for NMIAL
When click on Submit Weight Verification icon of INTL NMIAL
When upload HAWB details of INTL NMIAL

@LocationHAWB_1.1
Scenario Outline: To verify assign of location to HAWB
When launch browser for GHA application and login with "INTL GHA" INTL GHA user given in "Login" sheet for Export module
When click on VCT Generation for Imports>> Warehouse Location  for "<AWB>" AWB with "<HAWB>" HAWB in GHA
When click on Save button for Location in GHA

Examples:
 | AWB       | HAWB |
 | 12103431  | H101 |
 | 12103431  | H102 |
 
@LocationHAWB_1.2
Scenario Outline: To verify assign of location to AWB
When launch browser for GHA application and login with "INTL GHA" INTL GHA user given in "Login" sheet for Export module
When click on VCT Generation for Imports>> Warehouse Location  for "<AWB>" AWB in GHA INTL
When click on Save button for Location in GHA

Examples:
 | AWB       | 
 | 13796753  | 
 
@HAWB_FlightFinalize
Scenario: To verify Flight Finalize of HAWB shipment
When launch browser for GHA application and login with "INTL GHA" INTL GHA user given in "Login" sheet for Export module
When click on Imports>> Import Manifest and enter created "6845" Flight of INTL GHA 
Then verify display of matched  shipment of GHA
When click on Flight Finalize button of GHA 

@WeightVerification
Scenario: To verify weight verification upload
When I login with "INTL NMIAL UAT" ACS Agent user given in "Login" sheet for Export module
When click on Inbound tab of NMIAL INTL
When clicked on Submit button of Weight Verification of INTL NMIAL
When click on Charge Weight and Document Upload button of INTL NMIAL

@SubmitWeightVerification
Scenario: To verify Submit in weight verification 
When I login with "INTL NMIAL UAT" ACS Agent user given in "Login" sheet for Export module
When click on Inbound tab of NMIAL INTL
When clicked on Submit button of Weight Verification of INTL NMIAL
When enter "45" Chargeable weight and clicked on Submit button for Weight Verification in INTL NMIAL

@ApproveWeightVerification
Scenario: To verify accept/reject Weight Verification from GHA
When launch browser for INTL GHA application and login with "INTL GHA UAT" ACS GHA user given in "Login" sheet for Export module
When clicked on More> Dashboard of GHA INTL
When click on ACS Request tab of GHA INTL
When click on Accept icon of submitted record of GHA INTL

@RejectWeightVerification
Scenario: To verify reject Weight Verification from GHA
When launch browser for INTL GHA application and login with "INTL GHA UAT" ACS GHA user given in "Login" sheet for Export module
When clicked on More> Dashboard of GHA INTL
When click on ACS Request tab of GHA INTL
When click on Reject icon of other record of GHA INTL

@ConsolDO
Scenario: To verify Consol DO
When I login with "INTL NMIAL UAT" ACS Agent user given in "Login" sheet for Export module
When click on Inbound tab of NMIAL INTL
When enter "1263" Flight No filter of INTL NMIAL UAT
When click on Consol DO icon of INTL NMIAL UAT
When select Custom Broker and clicked on Submit button of INTL NMIAL UAT

@BOE
Scenario: To verify BOE 
When I login with "INTL NMIAL UAT" ACS Agent user given in "Login" sheet for Export module
When click on Inbound tab of NMIAL INTL
When enter "1263" Flight No filter of INTL NMIAL UAT
When click on BOE icon of NMIAL INTL
When enter BoE No, select "" BoE Type and enter "4" CAV, "" NOP of NMIAL INTL
When upload BoE file and click on Save BoE button of NMIAL INTL

@ApproveBOE
Scenario: To verify approve BOE from GHA
When launch browser for INTL GHA application and login with "INTL GHA UAT" ACS GHA user given in "Login" sheet for Export module
When clicked on More> Dashboard of GHA INTL
When click on ACS Request tab of GHA INTL
When click on 1 Accept icon of submitted record of GHA INTL

@BoE_ASI
Scenario: To verify BOE ASI 
When I login with "INTL NMIAL UAT" ACS Agent user given in "Login" sheet for Export module
When click on Inbound tab of NMIAL INTL
When enter "1263" Flight No filter of INTL NMIAL UAT
When click on BOE ASI icon of NMIAL INTL
When click on Proceed BoE ASI button of NMIAL INTL

@BoE_ACS_Receipt
Scenario: To verify BOE ACS Receipt 
When I login with "INTL NMIAL UAT" ACS Agent user given in "Login" sheet for Export module
When click on Inbound tab of NMIAL INTL
When enter "1263" Flight No filter of INTL NMIAL UAT
When click on BOE ACS Receipt icon of NMIAL INTL

@BoE_TSP
Scenario: To verify BOE TSP 
When I login with "INTL NMIAL UAT" ACS Agent user given in "Login" sheet for Export module
When click on Inbound tab of NMIAL INTL
When enter "1263" Flight No filter of INTL NMIAL UAT
When click on BOE TSP icon of INTL NMIAL UAT
When clicked on Pay Now button for BOE TSP

@PickOrder
Scenario: To verify Pick Order pieces
When I login with "INTL NMIAL UAT" ACS Agent user given in "Login" sheet for Export module
When click on Inbound tab of NMIAL INTL
When enter "1263" Flight No filter of INTL NMIAL UAT
When click on Pick Order icon of INTL NMIAL
When enter "0" Pieces for examination of INTL NMIAL
When click on Save Pick Order button of INTL NMIAL
When enter "2" Pieces for examination of INTL NMIAL
When click on Save Pick Order button of INTL NMIAL
Then verify Request status for pieces of INTL NMIAL

@PickOrder_ForwardForExamination
Scenario: To verify forward for examination pieces
When launch browser for INTL GHA application and login with "INTL GHA UAT" ACS GHA user given in "Login" sheet for Export module
When clicked on Imports> More>> Customs Actions of GHA INTL
When enter "13223781" AWB, "H102" HAWB and click on Search button of GHA INTL
When click on Examination button, enter Custom Ref No and date,select Exam location and enter "2" Exam Pieces of GHA INTL
When click on Forward for Examination button of GHA INTL

@OOC
Scenario: To verify OOC
When I login with "INTL NMIAL UAT" ACS Agent user given in "Login" sheet for Export module
When click on Inbound tab of NMIAL INTL
When enter "1263" Flight No filter of INTL NMIAL UAT
When click on OOC icon of INTL NMIAL
When enter OOC number, select OOC Type and upload OOC file of INTL NMIAL
When click on Save OOC button of INTL NMIAL

@ApproveOOC
Scenario: To verify Approval of OOC
When launch browser for INTL GHA application and login with "INTL GHA UAT" ACS GHA user given in "Login" sheet for Export module
When clicked on More> Dashboard of GHA INTL
When click on ACS Request tab of GHA INTL
When click on 1 Accept icon of submitted record of GHA INTL

@Gatepass
Scenario: To verify Gatepass of OOC
When I login with "INTL NMIAL UAT" ACS Agent user given in "Login" sheet for Export module
When click on Inbound tab of NMIAL INTL
When enter "1263" Flight No filter of INTL NMIAL UAT
When click on Gatepass icon of INTL NMIAL
When enter Notify MobileNo and cli










