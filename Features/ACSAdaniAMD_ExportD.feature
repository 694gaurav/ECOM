# Stack Holder Payal Baviskar
#FF Login ACSAMD_AAG   12345678

@AdaniAMDExport_ASI1 @AdaniAMDExport
Feature: ACS-Adani AMD Export feature 
  Background: Launch the ACS AdaniAMD Export application and login the application
     When I login with "FF Login" user given in "Login" sheet for Export module Export


 @AdaniAMDExport_01  @AdaniAMDExport_KaleGHA_CTO  
   Scenario Outline: ACS adani AMD Export End to End flow quick ASI Shipment Details: CTO - Kale GHA1, Direct, Non-Bonded, Same CHA and check send manifest abd ACS receipt
     Given To verify whether the user is able to see Airport name as per selection from login page Export
 		 Then User should go to e-AWB tab for creating Quick ASI Export
 		 Then User Should create Shipment with quick ASI "<MAWBNo_01>" and "<CTO>" CTO-Kale GHA1, Direct, Non-Bonded, Same CHA Export
 		 Then User Should Search MAWB number1 "<MAWBNo_01>" for further process Export
 		 Then User should process ASI submission Export
 		 Then User Should verify carting order Export
 		 Then User should add Shipping Bill with single SB for kale GHA1 CTO Export
 		 Then User should process TSP Payment with generate token for kale GHA1 CTO Export
 		 #Then User should Send Manifest request
 		 #Then User Should check ACS Receipt
 		 #Then User should print Token from Vechicle token milestone
 		 ##Then User should goto track and trace tab for verify AdaniAMDExport_01
 		 
 		  Examples: 
      | MAWBNo_01       | CTO        |
      | 11111074        | Kale_GHA1  |		   
			#07
 		 
 		 
  @AdaniAMDExport_02 @AdaniAMDExport_KaleGHA_CTO
   Scenario Outline: ACS adani AMD Export End to End flow quick ASI Shipment Details: CTO - Kale_GHA1, Direct, Non-Bonded, Different CHA
     Given To verify whether the user is able to see Airport name as per selection from login page Export
 		 Then User should go to e-AWB tab for creating Quick ASI Export
 		 Then User should create shipment with quick ASI "<MAWBNo_02>" and "<CTO>" CTO-Kale_GHA1, Direct, Non-Bonded, Different CHA Export
 		 Then User Should Search MAWB number2 "<MAWBNo_02>" for further process Export
 		 Then User should process ASI submission Export
 		 Then User Should verify carting order Export
 		 Then User should logout application Export
 		 When I login with "CB Login" user given in "Login" sheet for Export module Export
 		 Then User should select bussiness line as customs broker Export
 		 Then User Should Search MAWB number2 "<MAWBNo_02>" for further process Export
 		 Then User should add Shipping Bill with multiple SB for kale GHA1 CTO Export
 		 Then User should process TSP Payment without generate for kale GHA1 CTO Export
 		 Then User should generate vechile token Export
 		 Then User should be verify vechicle token no and AWB no Export
 		 
 		  Examples: 
      | MAWBNo_02       | CTO        |
      | 22222023        | Kale_GHA1  |		   
			#02
		 
 	@AdaniAMDExport_03 @AdaniAMDExport_KaleGHA_CTO
    Scenario Outline: ACS adani AMD Export End to End flow quick ASI Shipment Details: CTO - Kale_GHA1, Direct, Bonded, Same CHA
     Given To verify whether the user is able to see Airport name as per selection from login page Export
 		 Then User should go to e-AWB tab for creating Quick ASI Export
 		 Then User should create shipment with quick ASI "<MAWBNo_03>" and "<CTO>" CTO-Kale GHA1, Direct, Bonded, Same CHA Export
 		 Then User Should Search MAWB number3 "<MAWBNo_03>" for further process Export
 		 Then User should process ASI submission Export
 		 Then User Should verify carting order Export
 		 Then User should add Shipping Bill with single SB for kale GHA1 CTO Export
 		 Then User should process TSP Payment without generate for kale GHA1 CTO Export
 		 Then User should generate vechile token Export
 		 Then User should be verify vechicle token no and AWB no Export
 		 Then User should goto track and trace tab for verify AdaniAMDExport_03 "<MAWBNo_03>" Export
 		 
 		  Examples: 
      | MAWBNo_03       | CTO        |
      | 33333020        | Kale_GHA1  |		   
			#02
 	
	
 	#adding House action button 
 	@AdaniAMDExport_05 @AdaniAMDExport_KaleGHA_CTO  
    Scenario Outline: ACS adani AMD Export End to End flow quick ASI Shipment Details: CTO - Kale_GHA1, Consol, Non-Bonded, Same CHA
     Given To verify whether the user is able to see Airport name as per selection from login page Export
 		 Then User should go to e-AWB tab for creating Quick ASI Export
 		 Then User should create shipment with quick ASI "<MAWBNo_05>" and "<CTO>" CTO-Kale_GHA1, Consol, Non-Bonded, Same CHA Export
 		 Then User should click on Add HAWB button for adding multile houses Export
 		 Then User Should Search MAWB number5 "<MAWBNo_05>" for further process Export
 		 Then User Should Check Delete Action button for HAWB function Export
 		 Then User should process ASI submission Export
 		 Then User Should verify carting order Export
 		 Then User should add Shipping Bill with Multiple SB for Multiple HAWB for kale GHA1 CTO Export
 		 Then User should process TSP Payment without generate for kale GHA1 CTO Export
 		 Then User should generate vechile token Export
 		 Then User should be verify vechicle token no and AWB no Export
 		 ##Then User should goto track and trace tab for verify AdaniAMDExport_05 "<MAWBNo_05>"
 		 
 		  Examples: 
      | MAWBNo_05       | CTO        |
      #| 55555032        | Kale_GHA1  |		   
			#03
 	

  

  		 
  @AdaniAMDExport_07 @AdaniAMDExport_KaleGHA_CTO 
    Scenario Outline: ACS adani AMD Export End to End flow quick ASI Shipment Details: CTO - Kale_GHA1, Consol, Bonded, Same CHA
     Given To verify whether the user is able to see Airport name as per selection from login page Export
 		 Then User should go to e-AWB tab for creating Quick ASI Export
 		 Then User should create shipment with quick ASI "<MAWBNo_07>" and "<CTO>" CTO-Kale_GHA1, Consol, Bonded, Same CHA Export
 		 Then User should click on Add HAWB button for adding single house Export
 		 Then User Should Search MAWB number7 "<MAWBNo_07>" for further process Export
 		 Then User should process ASI submission Export
 		 Then User Should verify carting order Export
 		 Then User should add Shipping Bill with Multiple SB for Single HAWB for kale GHA1 CTO Export
 		 Then User should process TSP Payment without generate for kale GHA1 CTO Export
 		 Then User should generate vechile token Export
 		 Then User should be verify vechicle token no and AWB no Export
 		 
 		 Examples: 
      | MAWBNo_07       | CTO        |
     # | 77777022        | Kale_GHA1  |		   
			#02
 	


 	
  
 	#dimension action verification, Add Shipment
 @AdaniAMDExport_09 @AdaniAMDExport_KaleGHA_CTO  
   Scenario Outline: ACS adani AMD Export End to End flow quick ASI Shipment Details: CTO - Kale GHA2, Direct, Non-Bonded, Same and Single CHA
     Given To verify whether the user is able to see Airport name as per selection from login page Export
 		 Then User should go to e-AWB tab for creating Quick ASI Export
 		 Then User Should create Shipment with quick ASI "<MAWBNo_09>" and "<CTO>" CTO-Kale GHA2, Direct, Non-Bonded, Same and Single CHA Export
 		 Then User Should Search MAWB number09 "<MAWBNo_09>" for further process Export
 		 Then User Should Edit Airway Bill Details using Action Milestone Export
 		 Then User Should Copy Airway Bill Details using Action Milestone Export
 		 Then User Should Delete Airway Bill Details using Action Milestone Export
 		 Then User should go to e-AWB tab for creating Quick ASI Export
 		 Then User Should create Shipment with quick ASI "<MAWBNo_09>" and "<CTO>" CTO-Kale GHA2, Direct, Non-Bonded, Same and Single CHA Export
 		 Then User Should Search MAWB number09 "<MAWBNo_09>" for further process Export
 		 Then User should process ASI submission for kale GHA2 CTO Export
 		 Then User Should verify carting order Export
 		 Then User should add Shipping Bill with single SB and dimenssion for kale GHA2 CTO Export
 		 Then User should verify dimenssion action button Export
 		 Then User should process TSP Payment with Vechicle token for kale GHA2 CTO Export
 		 Then User should cancel generated Token Export
 		 Then User should process vechicle token using TSP milestone with Add Shipment Function Export
 		 Then User should be verify vechicle token no and AWB no using vechicle token milestone Export
 		 Then User should goto track and trace tab for verify AdaniAMDExport_09 "<MAWBNo_09>" Export
 		 
 		 Examples: 
      | MAWBNo_09       | CTO        |
      | 99999104        | Kale_GHA2  |		   
			#10
	
	
 		

  @AdaniAMDExport_10 @AdaniAMDExport_KaleGHA_CTO 
   Scenario Outline: ACS adani AMD Export End to End flow quick ASI Shipment Details: CTO - Kale GHA2, Direct, Non-Bonded, Different and Single CHA
     Given To verify whether the user is able to see Airport name as per selection from login page Export
 		 Then User should go to e-AWB tab for creating Quick ASI Export
 		 Then User Should create Shipment with quick ASI "<MAWBNo_10>" and "<CTO>" CTO-Kale GHA2, Direct, Non-Bonded, Different and Single  CHA Export
 		 #Then User Should Search MAWB number10 "<MAWBNo_10>" for further process
 		 Then User should process ASI submission for kale GHA2 CTO Export
 		 Then User Should verify carting order Export
 		 ##Then User should goto track and trace tab for verify AdaniAMDExport_10	"<MAWBNo_10>" 
 		 Then User should logout application Export
 		 When I login with "CB Login" user given in "Login" sheet for Export module Export
 		 Then User should select bussiness line as customs broker Export
 		 Then User Should Search MAWB number10 "<MAWBNo_10>" for further process Export
 		 Then User should add Shipping Bill with single SB and dimenssion for kale GHA2 CTO Export
 		 Then User should process TSP Payment with Vechicle token for kale GHA2 CTO in CB login Export
 		 #Then User should process TSP Payment without generate Vechicle token for kale GHA2 CTO
 		 #Then User should process vechicle token using TSP milestone
 		 #Then User should be verify vechicle token no and AWB no
 		 
 		  Examples: 
      | MAWBNo_10       | CTO        |
      | 01010030        | Kale_GHA2  |		   
			#03
 
 		 
 		 #Multiple vechicle single shipment
  @AdaniAMDExport_11 @AdaniAMDExport_KaleGHA_CTO  
    Scenario Outline: ACS adani AMD Export End to End flow quick ASI Shipment Details: CTO - Kale GHA2, Direct, Non-Bonded, Multiple CHA
     Given To verify whether the user is able to see Airport name as per selection from login page Export
 		 Then User should go to e-AWB tab for creating Quick ASI Export
 		 Then User Should create Shipment with quick ASI "<MAWBNo_11>" and "<CTO>" CTO-Kale GHA2, Direct, Non-Bonded, Multiple CHA Export
 		 Then User Should Search MAWB number11 "<MAWBNo_11>" for further process Export
 		 Then User should process ASI submission for kale GHA2 CTO Export
 		 Then User Should verify carting order Export
 		 Then User should add Shipping Bill with single SB and dimenssion for kale GHA2 CTO Export
 		 Then User should process TSP Payment with Vechicle token for kale GHA2 CTO for Multiple vechicle single shipment Export
 		 Then User should be verify vechicle token no and AWB no using vechicle token milestone Export
 		 Then User should goto track and trace tab for verify AdaniAMDExport_11 "<MAWBNo_11>" Export
 		 #Then User should logout application 
 		 #When I login with "CB Login" user given in "Login" sheet for Export module
 		 #Then User should select bussiness line as customs broker
 		 #Then User Should Search MAWB number11 "<MAWBNo_11>" for further process
 		 		 
 		  Examples: 
      | MAWBNo_11       | CTO        |
      | 01111025        | Kale_GHA2  |		   
			#02

 
#multiple shipment single vechicle
  @AdaniAMDExport_12 @AdaniAMDExport_KaleGHA_CTO 
   Scenario Outline: ACS adani AMD Export End to End flow quick ASI Shipment Details: CTO - Kale GHA2, Direct, Bonded, Same and Single CHA
     Given To verify whether the user is able to see Airport name as per selection from login page Export
 		 Then User should go to e-AWB tab for creating Quick ASI Export
 		 Then User Should create Shipment with quick ASI "<MAWBNo_12>" and "<CTO>" CTO-Kale GHA2, Direct, Bonded, Same and Single CHA Export
 		 Then User Should Search MAWB number12 "<MAWBNo_12>" for further process Export
 		 Then User should process ASI submission for kale GHA2 CTO Export
 		 Then User Should verify carting order Export
 		 Then User should add Shipping Bill with single SB and dimenssion for kale GHA2 CTO Export
 		 Then User should process TSP Payment without Vechicle token for kale GHA2 CTO Export
 		 Then User should process vechicle token using TSP milestone for multiple shipment single vechicle Export
 		 Then User should be verify vechicle token no and AWB no using vechicle token milestone Export
 		 Then User should goto track and trace tab for verify AdaniAMDExport_12 "<MAWBNo_12>" Export
 		 
 		 Examples: 
      | MAWBNo_12       | CTO        |
      | 01212024        | Kale_GHA2  |		   
			#02

 
 	@AdaniAMDExport_14 @AdaniAMDExport_KaleGHA_CTO  
    Scenario Outline: ACS adani AMD Export End to End flow quick ASI Shipment Details: CTO - Kale GHA2, Direct, Bonded, Multiple CHA
     Given To verify whether the user is able to see Airport name as per selection from login page Export
 		 Then User should go to e-AWB tab for creating Quick ASI Export
 		 Then User Should create Shipment with quick ASI "<MAWBNo_14>" and "<CTO>" CTO-Kale GHA2, Direct, Bonded, Multiple CHA Export
 		 #Then User Should Search MAWB number14 "<MAWBNo_14>" for further process
 		 Then User should process ASI submission for kale GHA2 CTO
 		 Then User Should verify carting order Export
 		 Then User should add Shipping Bill with multiple SB and dimenssion for kale GHA2 CTO Export
 		 Then User should process TSP Payment with Vechicle token for first SB for kale GHA2 CTO Export
 		 Then User should process TSP Payment with Vechicle token for second SB for kale GHA2 CTO Export
 		 Then User should be verify vechicle token no and AWB no using vechicle token milestone Export
 		 Then User should goto track and trace tab for verify AdaniAMDExport_14 "<MAWBNo_14>" Export 
 		
 		 Examples: 
      | MAWBNo_14       | CTO        |
      | 01414044        | Kale_GHA2  |		   
      #04
 	
 	
 @AdaniAMDExport_15 @AdaniAMDExport_KaleGHA_CTO 
   Scenario Outline: ACS adani AMD Export End to End flow quick ASI Shipment Details: CTO - Kale GHA2, Consol, Non-Bonded, Same and Bulk CHA
     Given To verify whether the user is able to see Airport name as per selection from login page Export
 		 Then User should go to e-AWB tab for creating Quick ASI Export
 		 Then User Should create Shipment with quick ASI "<MAWBNo_15>" and "<CTO>" CTO-Kale GHA2, Consol, Non-Bonded, Same and Bulk CHA Export
 		 Then User should Add HAWB With same Bulk CHA Export
 		 #Then User Should Search MAWB number15 "<MAWBNo_15>" for further process
 		 Then User should view HAWB using View HAWB Milestone Export
 		 Then User should process ASI submission for kale GHA2 CTO Export
 		 Then User Should verify carting order Export
 		 Then User should add Shipping Bill for bulk HAWB for kale GHA2 CTO Export
 		 Then User should process TSP Payment without Vechicle token for bulk HAWB for kale GHA2 CTO Export
 		 Then User should process vechicle token using TSP milestone Export
 		 Then User should process Vechicle token for second SB for kale GHA2 CTO Export
 		 Then User should process TSP Payment with Vechicle token for third SB for kale GHA2 CTO Export 
 		 Then User should be verify vechicle token no and AWB no using vechicle token milestone Export
 		 Then User should goto track and trace tab for verify AdaniAMDExport_15 "<MAWBNo_15>" Export
 		 
 		 Examples: 
      | MAWBNo_15       | CTO        |
      | 01515021        | Kale_GHA2  |		   
      #02
 

 	@AdaniAMDExport_16 @AdaniAMDExport_KaleGHA_CTO 
   Scenario Outline: ACS adani AMD Export End to End flow quick ASI Shipment Details: CTO - Kale GHA2, Consol, Non-Bonded, Different and Bulk CHA
     Given To verify whether the user is able to see Airport name as per selection from login page Export
 		 Then User should go to e-AWB tab for creating Quick ASI Export
 		 Then User Should create Shipment with quick ASI "<MAWBNo_16>" and "<CTO>" CTO-Kale GHA2, Consol, Non-Bonded, Different and Bulk CHA Export
 		 Then User should Add HAWB With Different Bulk CHA for Non-Bonded Export
 		 #Then User Should Search MAWB number16 "<MAWBNo_16>" for further process
 		 Then User should process ASI submission for kale GHA2 CTO Export
 		 Then User Should verify carting order Export
 		 Then User should logout application Export
 		 When I login with "CB Login" user given in "Login" sheet for Export module Export
 		 Then User should select bussiness line as customs broker Export
 		 #Then User Should Search MAWB number16 "<MAWBNo_16>" for further process
 		 Then User should add Shipping Bill with multiple SB and dimenssion for kale GHA2 CTO for different CHA Export
 		 Then User should process TSP Payment without generate Vechicle token for kale GHA2 CTO Export
 		 Then User should process vechicle token using Partially Completed TSP milestone Export
 		 Then User should process TSP using Partially completed VT Milestone with generate vechicle token for different CHA Export
 		 Then User should be verify vechicle token no and AWB no using vechicle token milestone Export
 		 
 		 
 		 Examples: 
      | MAWBNo_16       | CTO        | 
      | 01616086        | Kale_GHA2  |		   
      #08
 	
 	
 @AdaniAMDExport_17 @AdaniAMDExport_KaleGHA_CTO 
   Scenario Outline: ACS adani AMD Export End to End flow quick ASI Shipment Details: CTO - Kale GHA2, Consol, Non-Bonded, Multiple and Bulk CHA
     Given To verify whether the user is able to see Airport name as per selection from login page Export
 		 Then User should go to e-AWB tab for creating Quick ASI Export
 		 Then User Should create Shipment with quick ASI "<MAWBNo_17>" and "<CTO>" CTO-Kale GHA2, Consol, Non-Bonded, Multiple and Bulk CHA Export
 		 Then User should Add HAWB With Multiple Bulk CHA for Non-Bonded Export
 		 #Then User Should Search MAWB number17 "<MAWBNo_17>" for further process
 		 Then User should process ASI submission for kale GHA2 CTO Export
 		 Then User Should verify carting order Export
 		 Then User should add Shipping Bill for bulk HAWB for kale GHA2 CTO for Aeroprime Export
 		 Then User should process TSP Payment without Vechicle token for bulk HAWB for kale GHA2 CTO for Aeroprime Export
 		 Then User should process vechicle token using TSP milestone Export
 		 Then User should logout application Export
 		 When I login with "CB Login" user given in "Login" sheet for Export module Export
 		 Then User should select bussiness line as customs broker Export
 		 Then User should add Shipping Bill for bulk HAWB for kale GHA2 CTO for different CHA Export
 		 Then User should process TSP Payment without Vechicle token for bulk HAWB for kale GHA2 CTO for different CHA Export
 		 #Then User Should Search MAWB number17 "<MAWBNo_17>" for further process
 		 
 		 
 		 Examples: 
      | MAWBNo_17       | CTO        |
      | 01717030        | Kale_GHA2  |		   
      #03


 @AdaniAMDExport_18 @AdaniAMDExport_KaleGHA_CTO   
   Scenario Outline: ACS adani AMD Export End to End flow quick ASI Shipment Details: CTO - Kale GHA2, Consol, Bonded, Same and Bulk CHA
     Given To verify whether the user is able to see Airport name as per selection from login page Export
 		 Then User should go to e-AWB tab for creating Quick ASI Export
 		 Then User Should create Shipment with quick ASI "<MAWBNo_18>" and "<CTO>" CTO-Kale GHA2, Consol, Bonded, Same and Bulk CHA Export
 		 Then User should Add HAWB With same Bulk CHA Export
 		 Then User Should Search MAWB number18 "<MAWBNo_18>" for further process Export
 		 Then User should process ASI submission for kale GHA2 CTO Export
 		 Then User Should verify carting order Export
 		 Then User should add Shipping Bill for bulk HAWB for kale GHA2 CTO Export
 		 Then User should process TSP Payment without Vechicle token for bulk HAWB for kale GHA2 CTO Export
 		 Then User should process vechicle token using TSP milestone Export
 		 Then User should process Vechicle token for second SB for kale GHA2 CTO Export
 		 Then User should process TSP Payment with Vechicle token for third SB for kale GHA2 CTO Export
 		 Then User should be verify vechicle token no and AWB no using vechicle token milestone Export
 		 
 		 Examples: 
      | MAWBNo_18       | CTO        |
      | 01818073        | Kale_GHA2  |		   
      #07

