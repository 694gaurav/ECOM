#covered E-Docket, View Password and E-Booking function

# Stack Holder Payal Baviskar
#FF Login ACSAMD_AAG   12345678

 @TiffaCreateAWB 
Feature: Tiffa Create AWB shipments
  Background: Launch the Tiffa application and login the application
  When I login Tiffa with "Ping Login" user given in "Login" sheet
	
@TiffaCreateAWBDirect   
   Scenario Outline: To verify Create AWB for direct shipment without via
     Given User should go to AWB services link
     Then User should click on Create MAWB link
     Then User should select direct shipment
     Then User should enter AWB number with prefix
     Then User should click on add shipper icon
     Then User should fill all required details for adding new shipper "<ShipperName>" and "<ShipperAddress>" and "<ShipperCountry>" and "<ShipperCity>" and "<ShipperPinCode>" and save
     
     Then User should click on add Consignee icon
     Then User should fill all required details for adding new Consignee "<ConsigneeName>" and "<ConsigneeAddress>" and "<ConsigneeCountry>" and "<ConsigneeCity>" and "<ConsigneePincode>" and save
     
     Then User should enter Issuing carrier agent name in given textbox "<IssuingCarrier>" 
     Then User should click on routing information icon
     Then User should fill routing details without via "<OriginPort>" and "<DestiPort>" and save
    
     Then User should select currency code from dropdown ping
     Then User should select charge code from dropdown
     Then User should fill all flight details
     Then User should SCI details for ping
     
     Then User should click on rate as agreed checkbox
     Then User should click on dimenssion icon
     Then User should fill all dimenssion details
     
     Then User should click on HS code icon
     Then User should enter auto generate HS code and save
     
     Then User should enter AWI issue city for ping "<ShipperCity>" 
     
     Then User should click on save button for saving shipment
     Then User should click on quick search for searching AWB number
     
     Then User should send EDI mail 
     
     #Then User should open outlook mail
     #Then User should select EDI mail for direct shipment without via
     #
     #Then User should verify HS Code from mail "<HSCode>" and "<DestiPort>" 
    #
     
     Examples:
     |ShipperName |ShipperAddress |ShipperCountry |ShipperCity |ShipperPinCode |ConsigneeName |ConsigneeAddress |ConsigneeCountry |ConsigneeCity|ConsigneePincode |IssuingCarrier         |OriginPort|DestiPort|
    
    #|Shipper00001|White House    |IN             |CCJ         |401107         |Consignee00001|Golden Lane			|AE               |DWC          |101104           | TEST FF FOR WFS       |CCJ       |DWC      |
     
     |Shipper00001|White House    |DE             |FRA         |401107         |Consignee00001|Golden Lane			|AE               |DXB          |101104           | TEST FF FOR WFS       |FRA       |DXB      |
     |Shipper00001|White House    |DE             |ZQW         |401107         |Consignee00001|Golden Lane			|AE               |SHJ          |101104           | TEST FF FOR WFS       |ZQW       |SHJ      |   
     |Shipper00001|White House    |DE             |ZQW         |401107         |Consignee00001|Golden Lane			|AE               |SHJ          |101104           | TEST FF FOR WFS       |ZQW       |SHJ      |
   
 
     
     @TiffaCreateAWBDirectVia   
   Scenario Outline: To verify Create AWB for direct shipment with via
     Given User should go to AWB services link
     Then User should click on Create MAWB link
     Then User should select direct shipment
     Then User should enter AWB number with prefix
     Then User should click on add shipper icon
     Then User should fill all required details for adding new shipper "<ShipperName>" and "<ShipperAddress>" and "<ShipperCountry>" and "<ShipperCity>" and "<ShipperPinCode>" and save
     
     Then User should click on add Consignee icon
     Then User should fill all required details for adding new Consignee "<ConsigneeName>" and "<ConsigneeAddress>" and "<ConsigneeCountry>" and "<ConsigneeCity>" and "<ConsigneePincode>" and save
     
     Then User should enter Issuing carrier agent name in given textbox "<IssuingCarrier>" 
     Then User should click on routing information icon
     Then User should fill routing details with via "<OriginPort>" and "<DestiPort>" and "<Via>" and save
     Then User should select currency code from dropdown ping
     Then User should select charge code from dropdown
     Then User should fill all flight details
     Then User should fill all second flight details for via 
     
     Then User should SCI details for ping
     
     Then User should click on rate as agreed checkbox
     Then User should click on dimenssion icon
     Then User should fill all dimenssion details
     
     Then User should click on HS code icon
     Then User should enter auto generate HS code and save
     
     Then User should enter AWI issue city for ping "<ShipperCity>" 
     
     Then User should click on save button for saving shipment
     Then User should click on quick search for searching AWB number
     
     Then User should send EDI mail 
 
     Examples:
     	   
   	 |ShipperName |ShipperAddress |ShipperCountry |ShipperCity |ShipperPinCode |ConsigneeName |ConsigneeAddress |ConsigneeCountry |ConsigneeCity|ConsigneePincode |IssuingCarrier           |OriginPort|Via      |DestiPort|
    
     |Shipper00001|White House    |IN             |MAA         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |MAA       |DXB      |SIN      |
     #|Shipper00001|White House    |IN             |MAA         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |MAA       |AUH      |SIN      |
     #|Shipper00001|White House    |IN             |MAA         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |MAA       |SHJ      |SIN      |
     #|Shipper00001|White House    |IN             |MAA         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |MAA       |DWC      |SIN      |
    #
     #|Shipper00001|White House    |IN             |CCJ         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |CCJ       |DXB      |SIN      |
     #|Shipper00001|White House    |IN             |CCJ         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |CCJ       |AUH      |SIN      |
     #|Shipper00001|White House    |IN             |CCJ         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |CCJ       |SHJ      |SIN      |
     #|Shipper00001|White House    |IN             |CCJ         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |CCJ       |DWC      |SIN      |
    #
     #|Shipper00001|White House    |IN             |PNQ         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |PNQ       |DXB      |SIN      |
     #|Shipper00001|White House    |IN             |PNQ         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |PNQ       |AUH      |SIN      |
     #|Shipper00001|White House    |IN             |PNQ         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |PNQ       |SHJ      |SIN      |
     #|Shipper00001|White House    |IN             |PNQ         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |PNQ       |DWC      |SIN      |
    #
     #
     #|Shipper00001|White House    |IN             |TRV         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |TRV       |DXB      |SIN      |
     #|Shipper00001|White House    |IN             |TRV         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |TRV       |AUH      |SIN      |
     #|Shipper00001|White House    |IN             |TRV         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |TRV       |SHJ      |SIN      |
     #|Shipper00001|White House    |IN             |TRV         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |TRV       |DWC      |SIN      |
    #
     #
     #|Shipper00001|White House    |IN             |IDR         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |IDR       |DXB      |SIN      |
     #|Shipper00001|White House    |IN             |IDR         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |IDR       |AUH      |SIN      |
     #|Shipper00001|White House    |IN             |IDR         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |IDR       |SHJ      |SIN      |
     #|Shipper00001|White House    |IN             |IDR         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |IDR       |DWC      |SIN      |
    #
     #
     #|Shipper00001|White House    |IN             |CJB         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |CJB       |DXB      |SIN      |
     #|Shipper00001|White House    |IN             |CJB         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |CJB       |AUH      |SIN      |
     #|Shipper00001|White House    |IN             |CJB         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |CJB       |SHJ      |SIN      |
     #|Shipper00001|White House    |IN             |CJB         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |CJB       |DWC      |SIN      |
    #
     #
     #|Shipper00001|White House    |IN             |COK         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |COK       |DXB      |SIN      |
     #|Shipper00001|White House    |IN             |COK         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |COK       |AUH      |SIN      |
     #|Shipper00001|White House    |IN             |COK         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |COK       |SHJ      |SIN      |
     #|Shipper00001|White House    |IN             |COK         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |COK       |DWC      |SIN      |
    #
    #
     #|Shipper00001|White House    |IN             |CCU         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |CCU       |DXB      |SIN      |
     #|Shipper00001|White House    |IN             |CCU         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |CCU       |AUH      |SIN      |
     #|Shipper00001|White House    |IN             |CCU         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |CCU       |SHJ      |SIN      |
     #|Shipper00001|White House    |IN             |CCU         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |CCU       |DWC      |SIN      |
    #
     #
     #|Shipper00001|White House    |IN             |LKO         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |LKO       |DXB      |SIN      |
     #|Shipper00001|White House    |IN             |LKO         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |LKO       |AUH      |SIN      |
     #|Shipper00001|White House    |IN             |LKO         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |LKO       |SHJ      |SIN      |
     #|Shipper00001|White House    |IN             |LKO         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |LKO       |DWC      |SIN      |
    #
     #
     #|Shipper00001|White House    |IN             |HYD         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |HYD       |DXB      |SIN      |
     #|Shipper00001|White House    |IN             |HYD         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |HYD       |AUH      |SIN      |
     #|Shipper00001|White House    |IN             |HYD         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |HYD       |SHJ      |SIN      |
     #|Shipper00001|White House    |IN             |HYD         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |HYD       |DWC      |SIN      |
    #
     #
     #|Shipper00001|White House    |IN             |BOM         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |BOM       |DXB      |SIN      |
     #|Shipper00001|White House    |IN             |BOM         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |BOM       |AUH      |SIN      |
     #|Shipper00001|White House    |IN             |BOM         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |BOM       |SHJ      |SIN      |
     #|Shipper00001|White House    |IN             |BOM         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |BOM       |DWC      |SIN      |
    #
     #
     #|Shipper00001|White House    |IN             |BLR         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |BLR       |DXB      |SIN      |
     #|Shipper00001|White House    |IN             |BLR         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |BLR       |AUH      |SIN      |
     #|Shipper00001|White House    |IN             |BLR         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |BLR       |SHJ      |SIN      |
     #|Shipper00001|White House    |IN             |BLR         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |BLR       |DWC      |SIN      |
    #
    #
   #	 
     #|Shipper00001|White House    |IN             |ISK         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |ISK       |DXB      |SIN      |
     #|Shipper00001|White House    |IN             |ISK         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |ISK       |AUH      |SIN      |
     #|Shipper00001|White House    |IN             |ISK         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |ISK       |SHJ      |SIN      |
     #|Shipper00001|White House    |IN             |ISK         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |ISK       |DWC      |SIN      |
    #
     #
     #|Shipper00001|White House    |IN             |GOI         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |GOI       |DXB      |SIN      |
     #|Shipper00001|White House    |IN             |GOI         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |GOI       |AUH      |SIN      |
     #|Shipper00001|White House    |IN             |GOI         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |GOI       |SHJ      |SIN      |
     #|Shipper00001|White House    |IN             |GOI         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |GOI       |DWC      |SIN      |
    #
     #
     #|Shipper00001|White House    |IN             |DEL         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |DEL       |DXB      |SIN      |
     #|Shipper00001|White House    |IN             |DEL         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |DEL       |AUH      |SIN      |
     #|Shipper00001|White House    |IN             |DEL         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |DEL       |SHJ      |SIN      |
     #|Shipper00001|White House    |IN             |DEL         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |DEL       |DWC      |SIN      |
    #
     #
     #|Shipper00001|White House    |IN             |JAI         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |JAI       |DXB      |SIN      |
     #|Shipper00001|White House    |IN             |JAI         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |JAI       |AUH      |SIN      |
     #|Shipper00001|White House    |IN             |JAI         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |JAI       |SHJ      |SIN      |
     #|Shipper00001|White House    |IN             |JAI         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |JAI       |DWC      |SIN      |
    #
     #
     #|Shipper00001|White House    |IN             |AMD         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |AMD       |DXB      |SIN      |
     #|Shipper00001|White House    |IN             |AMD         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |AMD       |AUH      |SIN      |
     #|Shipper00001|White House    |IN             |AMD         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |AMD       |SHJ      |SIN      |
     #|Shipper00001|White House    |IN             |AMD         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |  TEST FF FOR WFS        |AMD       |DWC      |SIN      |
    #
    #
   	 @TiffaCreateAWBConsol   
   Scenario Outline: To verify Create AWB for direct shipment with via
     Given User should go to AWB services link
     Then User should click on Create MAWB link
     Then User should select Consol shipment
     Then User should enter AWB number with prefix
     Then User should add multiple house jobs "<IssuingCarrier>" and "<ShipperAddress>" and "<ShipperCountry>" and "<ShipperCity>" and "<ShipperPinCode>" and "<ConsigneeCountry>" and "<ConsigneeCity>" and "<OriginPort>" and "<DestiPort>" and save
    
     Then User should update shipper details for ping "<ShipperCountry>" and "<ShipperCity>" and save
     Then User should click on add Consignee icon
     Then User should fill all required details for adding new Consignee "<ConsigneeName>" and "<ConsigneeAddress>" and "<ConsigneeCountry>" and "<ConsigneeCity>" and "<ConsigneePincode>" and save
     
     Then User should click on routing information icon
     Then User should fill routing details without via "<OriginPort>" and "<DestiPort>" and save
     
     Then User should select currency code from dropdown ping
     
     Then User should select charge code from dropdown
     
     Then User should fill all flight details
     
     Then User should SCI details for ping
    
     Then User should click on rate as agreed checkbox
    
     Then User should click on dimenssion icon
     Then User should fill all dimenssion details for house job
     
     Then User should click on HS code icon
     Then User should enter auto generate HS code and save
     
     Then User should enter AWI issue city for ping "<ShipperCity>" 
     
     Then User should click on save button for saving shipment
     Then User should click on quick search for searching AWB number
     
     Then User should send EDI mail 
 #
     Examples:
     |ShipperName |ShipperAddress |ShipperCountry |ShipperCity |ShipperPinCode |ConsigneeName |ConsigneeAddress |ConsigneeCountry |ConsigneeCity|ConsigneePincode |IssuingCarrier       |OriginPort|DestiPort |
   	 |Shipper00001|White House    |DE             |FRA         |401107         |Consignee00001|Golden Lane			|AE               |DXB          |101104           |TEST FF FOR WFS      |fra       |DXB       |
   	 |Shipper00001|White House    |IN             |MAA         |401107         |Consignee00001|Golden Lane			|AE               |AUH          |101104           |TEST FF FOR WFS      |MAA       |AUH       |
   	 
   	 
   	 
   	  @TiffaCreateAWBConsolVia   
   Scenario Outline: To verify Create AWB for direct shipment with via
     Given User should go to AWB services link
     Then User should click on Create MAWB link
     Then User should select Consol shipment
     Then User should enter AWB number with prefix
     Then User should add multiple house jobs "<IssuingCarrier>" and "<ShipperAddress>" and "<ShipperCountry>" and "<ShipperCity>" and "<ShipperPinCode>" and "<ConsigneeCountry>" and "<ConsigneeCity>" and "<OriginPort>" and "<DestiPort>" and save
    
     Then User should update shipper details for ping "<ShipperCountry>" and "<ShipperCity>" and save
    
     Then User should click on add Consignee icon
     Then User should fill all required details for adding new Consignee "<ConsigneeName>" and "<ConsigneeAddress>" and "<ConsigneeCountry>" and "<ConsigneeCity>" and "<ConsigneePincode>" and save
     
     Then User should click on routing information icon
     Then User should fill routing details with via "<OriginPort>" and "<DestiPort>" and "<Via>" and save
     Then User should select currency code from dropdown ping
     Then User should select charge code from dropdown
     Then User should fill all flight details
     Then User should fill all second flight details for via
     
     Then User should SCI details for ping
    
     Then User should click on rate as agreed checkbox
    
     Then User should click on dimenssion icon
     Then User should fill all dimenssion details for house job
     
     Then User should click on HS code icon
     Then User should enter auto generate HS code and save
     
     Then User should enter AWI issue city for ping "<ShipperCity>"
     
     Then User should click on save button for saving shipment
     Then User should click on quick search for searching AWB number
     
     Then User should send EDI mail 
 #
     Examples:
     |ShipperName |ShipperAddress |ShipperCountry |ShipperCity |ShipperPinCode |ConsigneeName |ConsigneeAddress |ConsigneeCountry |ConsigneeCity|ConsigneePincode |IssuingCarrier     |OriginPort|DestiPort |Via    |
   	 
   	 |Shipper00001|White House    |IN             |MAA         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |MAA       |SIN       |DXB    |
     |Shipper00001|White House    |IN             |MAA         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |MAA       |SIN       |AUH    |
     |Shipper00001|White House    |IN             |MAA         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |MAA       |SIN       |SHJ    |
     |Shipper00001|White House    |IN             |MAA         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |MAA       |SIN       |DWC    |
     
     |Shipper00001|White House    |IN             |CCJ         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |CCJ       |SIN       |DXB    |
     |Shipper00001|White House    |IN             |CCJ         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |CCJ       |SIN       |AUH    |
     |Shipper00001|White House    |IN             |CCJ         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |CCJ       |SIN       |SHJ    |
     |Shipper00001|White House    |IN             |CCJ         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |CCJ       |SIN       |DWC    |

     |Shipper00001|White House    |IN             |PNQ         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |PNQ       |SIN       |DXB    |
     |Shipper00001|White House    |IN             |PNQ         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |PNQ       |SIN       |AUH    |
     |Shipper00001|White House    |IN             |PNQ         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |PNQ       |SIN       |SHJ    |
     |Shipper00001|White House    |IN             |PNQ         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |PNQ       |SIN       |DWC    |
     
     |Shipper00001|White House    |IN             |TRV         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |TRV       |SIN       |DXB    |
     |Shipper00001|White House    |IN             |TRV         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |TRV       |SIN       |AUH    |
     |Shipper00001|White House    |IN             |TRV         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |TRV       |SIN       |SHJ    |
     |Shipper00001|White House    |IN             |TRV         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |TRV       |SIN       |DWC    |
     
     |Shipper00001|White House    |IN             |IDR         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |IDR       |SIN       |DXB    |
     |Shipper00001|White House    |IN             |IDR         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |IDR       |SIN       |AUH    |
     |Shipper00001|White House    |IN             |IDR         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |IDR       |SIN       |SHJ    |
     |Shipper00001|White House    |IN             |IDR         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |IDR       |SIN       |DWC    |
     
     |Shipper00001|White House    |IN             |CJB         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |CJB       |SIN       |DXB    |
     |Shipper00001|White House    |IN             |CJB         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |CJB       |SIN       |AUH    |
     |Shipper00001|White House    |IN             |CJB         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |CJB       |SIN       |SHJ    |
     |Shipper00001|White House    |IN             |CJB         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |CJB       |SIN       |DWC    |

     |Shipper00001|White House    |IN             |COK         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |COK       |SIN       |DXB    |
     |Shipper00001|White House    |IN             |COK         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |COK       |SIN       |AUH    |
     |Shipper00001|White House    |IN             |COK         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |COK       |SIN       |SHJ    |
     |Shipper00001|White House    |IN             |COK         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |COK       |SIN       |DWC    |
     
     |Shipper00001|White House    |IN             |CCU         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |CCU       |SIN       |DXB    |
     |Shipper00001|White House    |IN             |CCU         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |CCU       |SIN       |AUH    |
     |Shipper00001|White House    |IN             |CCU         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |CCU       |SIN       |SHJ    |
     |Shipper00001|White House    |IN             |CCU         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |CCU       |SIN       |DWC    |

     |Shipper00001|White House    |IN             |LKO         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |LKO       |SIN       |DXB    |
     |Shipper00001|White House    |IN             |LKO         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |LKO       |SIN       |AUH    |
     |Shipper00001|White House    |IN             |LKO         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |LKO       |SIN       |SHJ    |
     |Shipper00001|White House    |IN             |LKO         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |LKO       |SIN       |DWC    |
     
     |Shipper00001|White House    |IN             |HYD         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |HYD       |SIN       |DXB    |
     |Shipper00001|White House    |IN             |HYD         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |HYD       |SIN       |AUH    |
     |Shipper00001|White House    |IN             |HYD         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |HYD       |SIN       |SHJ    |
     |Shipper00001|White House    |IN             |HYD         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |HYD       |SIN       |DWC    |

     |Shipper00001|White House    |IN             |BOM         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |BOM       |SIN       |DXB    |
     |Shipper00001|White House    |IN             |BOM         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |BOM       |SIN       |AUH    |
     |Shipper00001|White House    |IN             |BOM         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |BOM       |SIN       |SHJ    |
     |Shipper00001|White House    |IN             |BOM         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |BOM       |SIN       |DWC    |
     
     |Shipper00001|White House    |IN             |BLR         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |BLR       |SIN       |DXB    |
     |Shipper00001|White House    |IN             |BLR         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |BLR       |SIN       |AUH    |
     |Shipper00001|White House    |IN             |BLR         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |BLR       |SIN       |SHJ    |
     |Shipper00001|White House    |IN             |BLR         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |BLR       |SIN       |DWC    |

     |Shipper00001|White House    |IN             |ISK         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |ISK       |SIN       |DXB    |
     |Shipper00001|White House    |IN             |ISK         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |ISK       |SIN       |AUH    |
     |Shipper00001|White House    |IN             |ISK         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |ISK       |SIN       |SHJ    |
     |Shipper00001|White House    |IN             |ISK         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |ISK       |SIN       |DWC    |
     
     |Shipper00001|White House    |IN             |GOI         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |GOI       |SIN       |DXB    |
     |Shipper00001|White House    |IN             |GOI         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |GOI       |SIN       |AUH    |
     |Shipper00001|White House    |IN             |GOI         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |GOI       |SIN       |SHJ    |
     |Shipper00001|White House    |IN             |GOI         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |GOI       |SIN       |DWC    |

     |Shipper00001|White House    |IN             |DEL         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |DEL       |SIN       |DXB    |
     |Shipper00001|White House    |IN             |DEL         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |DEL       |SIN       |AUH    |
     |Shipper00001|White House    |IN             |DEL         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |DEL       |SIN       |SHJ    |
     |Shipper00001|White House    |IN             |DEL         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |DEL       |SIN       |DWC    |
     
     |Shipper00001|White House    |IN             |JAI         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |JAI       |SIN       |DXB    |
     |Shipper00001|White House    |IN             |JAI         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |JAI       |SIN       |AUH    |
     |Shipper00001|White House    |IN             |JAI         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |JAI       |SIN       |SHJ    |
     |Shipper00001|White House    |IN             |JAI         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |JAI       |SIN       |DWC    |

     |Shipper00001|White House    |IN             |AMD         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |AMD       |SIN       |DXB    |
     |Shipper00001|White House    |IN             |AMD         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |AMD       |SIN       |AUH    |
     |Shipper00001|White House    |IN             |AMD         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |AMD       |SIN       |SHJ    |
     |Shipper00001|White House    |IN             |AMD         |401107         |Consignee00001|Golden Lane			|SG               |SIN          |101104           |TEST FF FOR WFS    |AMD       |SIN       |DWC    |
  
     
     