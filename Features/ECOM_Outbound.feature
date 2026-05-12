#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes

   @AdaniNMIAL_001
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
