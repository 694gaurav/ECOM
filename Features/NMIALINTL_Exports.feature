@Exports_INTL
Feature: NMIAL INTL feature 
  Background: Launch the NMIAL Outbound application and login the application
     
 @ExportAWB_1.1
 Scenario: To verify create AWB for Export INTL 
 When I login with "INTL NMIAL UAT" ACS Agent user given in "Login" sheet for Export module
 When click on e-AWB>> Create AWB hyperlink for Export INTL
 When select "NMIAL" CTO and enter "125" AWB number for Export INTL 
 When select "ACS" ACS Shipper and "ACS Consignee" ACS Consignee for Export INTL
 When click on Airport of Departure icon,select "DXB" Destination Port and enter "" Requested flight for Export INTL
 When enter "5" NOP Dimensions with "" Due Agent, "" Due Carrier details for Export INTL
 When click on Save Exports button for Export INTL
 