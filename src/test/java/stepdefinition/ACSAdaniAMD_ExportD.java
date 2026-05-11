package stepdefinition;


import static Helper.BaseObjects.driver;
import static Helper.BaseObjects.loginScreen;
import static Helper.BaseObjects.wm;
import static Helper.BaseObjects.cm;
import static Helper.BaseObjects.Export;
import static Helper.BaseVariables.Entity;
import static Helper.BaseVariables.Password;
import static Helper.BaseVariables.Username;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.graphbuilder.math.Expression;

import Methods.CommonMethods;
import Methods.WebDriverMethod;
import Methods.WebdriverMethods;
import TestDataOperations.TestDataReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ACSAdaniAMD_ExportD 
{

	
	@When("I login with {string} user given in {string} sheet for Export module Export")
	public void i_login_with_user_given_in_sheet_for_export_module_export(String string, String string2) throws InterruptedException
	{
		Thread.sleep(1000);
	    
	}
	@Given("To verify whether the user is able to see Airport name as per selection from login page Export")
	public void to_verify_whether_the_user_is_able_to_see_airport_name_as_per_selection_from_login_page_export() throws InterruptedException
	{
		Thread.sleep(1000);
	    
	}
	@Then("User should go to e-AWB tab for creating Quick ASI Export")
	public void user_should_go_to_e_awb_tab_for_creating_quick_asi_export() throws InterruptedException
	{
		Thread.sleep(1000);
	   
	    
	}
	@Then("User should create shipment with quick ASI {string} and {string} CTO-Kale GHA1, Direct, Bonded, Same CHA Export")
	public void user_should_create_shipment_with_quick_asi_and_cto_kale_gha1_direct_bonded_same_cha_export(String string, String string2) {
	   
	    
	}
	@Then("User Should Search MAWB number3 {string} for further process Export")
	public void user_should_search_mawb_number3_for_further_process_export(String string) {
	   
	    
	}
	@Then("User should process ASI submission Export")
	public void user_should_process_asi_submission_export() throws InterruptedException
	{
		Thread.sleep(1000);
	   
	    
	}
	@Then("User Should verify carting order Export")
	public void user_should_verify_carting_order_export() throws InterruptedException
	{
		Thread.sleep(1000);
	   
	    
	}
	@Then("User should add Shipping Bill with single SB for kale GHA1 CTO Export")
	public void user_should_add_shipping_bill_with_single_sb_for_kale_gha1_cto_export() throws InterruptedException 
	{
		Thread.sleep(1000);
	   
	    
	}
	@Then("User should process TSP Payment without generate for kale GHA1 CTO Export")
	public void user_should_process_tsp_payment_without_generate_for_kale_gha1_cto_export() throws InterruptedException 
	{
		Thread.sleep(1000);
	   
	    
	}
	@Then("User should generate vechile token Export")
	public void user_should_generate_vechile_token_export() throws InterruptedException 
	{
		Thread.sleep(1000);
	   
	    
	}
	@Then("User should be verify vechicle token no and AWB no Export")
	public void user_should_be_verify_vechicle_token_no_and_awb_no_export() throws InterruptedException
	{
		Thread.sleep(1000);
	   
	    
	}
	@Then("User should goto track and trace tab for verify AdaniAMDExport_{int} {string} Export")
	public void user_should_goto_track_and_trace_tab_for_verify_adani_amd_export_export(Integer int1, String string) {
	   
	    
	}

	@Then("User Should create Shipment with quick ASI {string} and {string} CTO-Kale GHA1, Direct, Non-Bonded, Same CHA Export")
	public void user_should_create_shipment_with_quick_asi_and_cto_kale_gha1_direct_non_bonded_same_cha_export(String string, String string2) {
	    
	   
	}
	@Then("User Should Search MAWB number1 {string} for further process Export")
	public void user_should_search_mawb_number1_for_further_process_export(String string) {
	    
	   
	}
	@Then("User should process TSP Payment with generate token for kale GHA1 CTO Export")
	public void user_should_process_tsp_payment_with_generate_token_for_kale_gha1_cto_export() throws InterruptedException
	{
		Thread.sleep(1000);
	    
	   
	}

	@Then("User should create shipment with quick ASI {string} and {string} CTO-Kale_GHA1, Direct, Non-Bonded, Different CHA Export")
	public void user_should_create_shipment_with_quick_asi_and_cto_kale_gha1_direct_non_bonded_different_cha_export(String string, String string2) {
	    
	   
	}
	@Then("User Should Search MAWB number2 {string} for further process Export")
	public void user_should_search_mawb_number2_for_further_process_export(String string) {
	    
	   
	}
	@Then("User should logout application Export")
	public void user_should_logout_application_export() throws InterruptedException 
	{
		Thread.sleep(1000);
	    
	   
	}
	@Then("User should select bussiness line as customs broker Export")
	public void user_should_select_bussiness_line_as_customs_broker_export() throws InterruptedException 
	{
		Thread.sleep(1000);
	    
	   
	}
	@Then("User should add Shipping Bill with multiple SB for kale GHA1 CTO Export")
	public void user_should_add_shipping_bill_with_multiple_sb_for_kale_gha1_cto_export() throws InterruptedException
	{
		Thread.sleep(1000);
	    
	   
	}

	
	@Then("User should create shipment with quick ASI {string} and {string} CTO-Kale_GHA1, Consol, Non-Bonded, Same CHA Export")
	public void user_should_create_shipment_with_quick_asi_and_cto_kale_gha1_consol_non_bonded_same_cha_export(String string, String string2) {
	    
	    
	}
	@Then("User should click on Add HAWB button for adding multile houses Export")
	public void user_should_click_on_add_hawb_button_for_adding_multile_houses_export() throws InterruptedException 
	{
		Thread.sleep(1000);
	    
	    
	}
	@Then("User Should Search MAWB number5 {string} for further process Export")
	public void user_should_search_mawb_number5_for_further_process_export(String string) {
	    
	    
	}
	@Then("User Should Check Delete Action button for HAWB function Export")
	public void user_should_check_delete_action_button_for_hawb_function_export() throws InterruptedException
	{
		Thread.sleep(1000);
	    
	    
	}
	@Then("User should add Shipping Bill with Multiple SB for Multiple HAWB for kale GHA1 CTO Export")
	public void user_should_add_shipping_bill_with_multiple_sb_for_multiple_hawb_for_kale_gha1_cto_export() throws InterruptedException
	{
		Thread.sleep(1000);
	    
	    
	}


	@Then("User Should create Shipment with quick ASI {string} and {string} CTO-Kale GHA2, Direct, Non-Bonded, Same and Single CHA Export")
	public void user_should_create_shipment_with_quick_asi_and_cto_kale_gha2_direct_non_bonded_same_and_single_cha_export(String string, String string2) {
	    
	    
	}
	@Then("User Should Search MAWB number09 {string} for further process Export")
	public void user_should_search_mawb_number09_for_further_process_export(String string) {
	    
	    
	}
	@Then("User Should Edit Airway Bill Details using Action Milestone Export")
	public void user_should_edit_airway_bill_details_using_action_milestone_export() throws InterruptedException
	{
		Thread.sleep(1000);
	    
	    
	}
	@Then("User Should Copy Airway Bill Details using Action Milestone Export")
	public void user_should_copy_airway_bill_details_using_action_milestone_export() throws InterruptedException 
	{
		Thread.sleep(1000);
	    
	    
	}
	@Then("User Should Delete Airway Bill Details using Action Milestone Export")
	public void user_should_delete_airway_bill_details_using_action_milestone_export() throws InterruptedException 
	{
		Thread.sleep(1000);
	    
	    
	}
	@Then("User should process ASI submission for kale GHA2 CTO Export")
	public void user_should_process_asi_submission_for_kale_gha2_cto_export() throws InterruptedException 
	{
		Thread.sleep(1000);
	    
	    
	}
	@Then("User should add Shipping Bill with single SB and dimenssion for kale GHA2 CTO Export")
	public void user_should_add_shipping_bill_with_single_sb_and_dimenssion_for_kale_gha2_cto_export() throws InterruptedException 
	{
		Thread.sleep(1000);
	    
	    
	}
	@Then("User should verify dimenssion action button Export")
	public void user_should_verify_dimenssion_action_button_export() throws InterruptedException 
	{
		Thread.sleep(1000);
	    
	    
	}
	@Then("User should process TSP Payment with Vechicle token for kale GHA2 CTO Export")
	public void user_should_process_tsp_payment_with_vechicle_token_for_kale_gha2_cto_export() throws InterruptedException
	{
		Thread.sleep(1000);
	    
	    
	}
	@Then("User should cancel generated Token Export")
	public void user_should_cancel_generated_token_export() throws InterruptedException
	{
		Thread.sleep(1000);
	    
	    
	}
	@Then("User should process vechicle token using TSP milestone with Add Shipment Function Export")
	public void user_should_process_vechicle_token_using_tsp_milestone_with_add_shipment_function_export() throws InterruptedException
	{
		Thread.sleep(1000);
	    
	    
	}
	@Then("User should be verify vechicle token no and AWB no using vechicle token milestone Export")
	public void user_should_be_verify_vechicle_token_no_and_awb_no_using_vechicle_token_milestone_export() throws InterruptedException
	{
		Thread.sleep(1000);
	    
	    
	}


	@Then("User Should create Shipment with quick ASI {string} and {string} CTO-Kale GHA2, Direct, Non-Bonded, Different and Single  CHA Export")
	public void user_should_create_shipment_with_quick_asi_and_cto_kale_gha2_direct_non_bonded_different_and_single_cha_export(String string, String string2) {
	  
	   
	}
	@Then("User Should Search MAWB number10 {string} for further process Export")
	public void user_should_search_mawb_number10_for_further_process_export(String string) {
	  
	   
	}
	@Then("User should process TSP Payment with Vechicle token for kale GHA2 CTO in CB login Export")
	public void user_should_process_tsp_payment_with_vechicle_token_for_kale_gha2_cto_in_cb_login_export() throws InterruptedException
	{
		Thread.sleep(1000);
	  
	   
	}


	@Then("User Should create Shipment with quick ASI {string} and {string} CTO-Kale GHA2, Direct, Bonded, Same and Single CHA Export")
	public void user_should_create_shipment_with_quick_asi_and_cto_kale_gha2_direct_bonded_same_and_single_cha_export(String string, String string2) {
	   
	   
	}
	@Then("User Should Search MAWB number12 {string} for further process Export")
	public void user_should_search_mawb_number12_for_further_process_export(String string) {
	   
	   
	}
	@Then("User should process TSP Payment without Vechicle token for kale GHA2 CTO Export")
	public void user_should_process_tsp_payment_without_vechicle_token_for_kale_gha2_cto_export() throws InterruptedException
	{
		Thread.sleep(1000);
	   
	   
	}
	@Then("User should process vechicle token using TSP milestone for multiple shipment single vechicle Export")
	public void user_should_process_vechicle_token_using_tsp_milestone_for_multiple_shipment_single_vechicle_export() throws InterruptedException
	{
		Thread.sleep(1000);
	   
	   
	}



	@Then("User Should create Shipment with quick ASI {string} and {string} CTO-Kale GHA2, Consol, Non-Bonded, Same and Bulk CHA Export")
	public void user_should_create_shipment_with_quick_asi_and_cto_kale_gha2_consol_non_bonded_same_and_bulk_cha_export(String string, String string2) {
	   
	   
	}
	@Then("User should Add HAWB With same Bulk CHA Export")
	public void user_should_add_hawb_with_same_bulk_cha_export() throws InterruptedException
	{
		Thread.sleep(1000);
	   
	   
	}
	@Then("User should view HAWB using View HAWB Milestone Export")
	public void user_should_view_hawb_using_view_hawb_milestone_export() throws InterruptedException 
	{
		Thread.sleep(1000);
	   
	   
	}
	@Then("User should add Shipping Bill for bulk HAWB for kale GHA2 CTO Export")
	public void user_should_add_shipping_bill_for_bulk_hawb_for_kale_gha2_cto_export() throws InterruptedException 
	{
		Thread.sleep(1000);
	   
	   
	}
	@Then("User should process TSP Payment without Vechicle token for bulk HAWB for kale GHA2 CTO Export")
	public void user_should_process_tsp_payment_without_vechicle_token_for_bulk_hawb_for_kale_gha2_cto_export() throws InterruptedException 
	{
		Thread.sleep(1000);
	   
	   
	}
	@Then("User should process vechicle token using TSP milestone Export")
	public void user_should_process_vechicle_token_using_tsp_milestone_export() throws InterruptedException 
	{
		Thread.sleep(1000);
	   
	   
	}
	@Then("User should process Vechicle token for second SB for kale GHA2 CTO Export")
	public void user_should_process_vechicle_token_for_second_sb_for_kale_gha2_cto_export() throws InterruptedException 
	{
		Thread.sleep(1000);
	   
	   
	}
	@Then("User should process TSP Payment with Vechicle token for third SB for kale GHA2 CTO Export")
	public void user_should_process_tsp_payment_with_vechicle_token_for_third_sb_for_kale_gha2_cto_export() throws InterruptedException 
	{
		Thread.sleep(1000);
	   
	   
	}





	@Then("User Should create Shipment with quick ASI {string} and {string} CTO-Kale GHA2, Consol, Non-Bonded, Different and Bulk CHA Export")
	public void user_should_create_shipment_with_quick_asi_and_cto_kale_gha2_consol_non_bonded_different_and_bulk_cha_export(String string, String string2) {
	   
	   
	}
	@Then("User should Add HAWB With Different Bulk CHA for Non-Bonded Export")
	public void user_should_add_hawb_with_different_bulk_cha_for_non_bonded_export() throws InterruptedException 
	{
		Thread.sleep(1000);
	   
	   
	}
	@Then("User should add Shipping Bill with multiple SB and dimenssion for kale GHA2 CTO for different CHA Export")
	public void user_should_add_shipping_bill_with_multiple_sb_and_dimenssion_for_kale_gha2_cto_for_different_cha_export() throws InterruptedException 
	{
		Thread.sleep(1000);
	   
	   
	}
	@Then("User should process TSP Payment without generate Vechicle token for kale GHA2 CTO Export")
	public void user_should_process_tsp_payment_without_generate_vechicle_token_for_kale_gha2_cto_export() throws InterruptedException
	{
		Thread.sleep(1000);
	   
	   
	}
	@Then("User should process vechicle token using Partially Completed TSP milestone Export")
	public void user_should_process_vechicle_token_using_partially_completed_tsp_milestone_export() throws InterruptedException
	{
		Thread.sleep(1000);
	   
	   
	}
	@Then("User should process TSP using Partially completed VT Milestone with generate vechicle token for different CHA Export")
	public void user_should_process_tsp_using_partially_completed_vt_milestone_with_generate_vechicle_token_for_different_cha_export() throws InterruptedException
	{
		Thread.sleep(1000);
	   
	   
	}
	@Then("User Should create Shipment with quick ASI {string} and {string} CTO-Kale GHA2, Consol, Non-Bonded, Multiple and Bulk CHA Export")
	public void user_should_create_shipment_with_quick_asi_and_cto_kale_gha2_consol_non_bonded_multiple_and_bulk_cha_export(String string, String string2) {
	   
	   
	}
	@Then("User should Add HAWB With Multiple Bulk CHA for Non-Bonded Export")
	public void user_should_add_hawb_with_multiple_bulk_cha_for_non_bonded_export() throws InterruptedException 
	{
		Thread.sleep(1000);
	   
	   
	}
	@Then("User should add Shipping Bill for bulk HAWB for kale GHA2 CTO for Aeroprime Export")
	public void user_should_add_shipping_bill_for_bulk_hawb_for_kale_gha2_cto_for_aeroprime_export() throws InterruptedException 
	{
		Thread.sleep(1000);
	   
	   
	}
	@Then("User should process TSP Payment without Vechicle token for bulk HAWB for kale GHA2 CTO for Aeroprime Export")
	public void user_should_process_tsp_payment_without_vechicle_token_for_bulk_hawb_for_kale_gha2_cto_for_aeroprime_export() throws InterruptedException
	{
		Thread.sleep(1000);
	   
	   
	}
	@Then("User should add Shipping Bill for bulk HAWB for kale GHA2 CTO for different CHA Export")
	public void user_should_add_shipping_bill_for_bulk_hawb_for_kale_gha2_cto_for_different_cha_export() throws InterruptedException
	{
		Thread.sleep(1000);
	   
	   
	}
	@Then("User should process TSP Payment without Vechicle token for bulk HAWB for kale GHA2 CTO for different CHA Export")
	public void user_should_process_tsp_payment_without_vechicle_token_for_bulk_hawb_for_kale_gha2_cto_for_different_cha_export() throws InterruptedException
	{
		Thread.sleep(1000);
	   
	   
	}

	
	@Then("User Should create Shipment with quick ASI {string} and {string} CTO-Kale GHA2, Consol, Bonded, Same and Bulk CHA Export")
	public void user_should_create_shipment_with_quick_asi_and_cto_kale_gha2_consol_bonded_same_and_bulk_cha_export(String string, String string2) {
	   
	   
	}
	@Then("User Should Search MAWB number18 {string} for further process Export")
	public void user_should_search_mawb_number18_for_further_process_export(String string) {
	   
	   
	}


	

	@Then("User Should create Shipment with quick ASI {string} and {string} CTO-Kale GHA2, Direct, Bonded, Multiple CHA Export")
	public void user_should_create_shipment_with_quick_asi_and_cto_kale_gha2_direct_bonded_multiple_cha_export(String string, String string2) {
	    
	    
	}
	@Then("User should add Shipping Bill with multiple SB and dimenssion for kale GHA2 CTO Export")
	public void user_should_add_shipping_bill_with_multiple_sb_and_dimenssion_for_kale_gha2_cto_export() throws InterruptedException 
	{
		Thread.sleep(1000);
	    
	    
	}
	@Then("User should process TSP Payment with Vechicle token for first SB for kale GHA2 CTO Export")
	public void user_should_process_tsp_payment_with_vechicle_token_for_first_sb_for_kale_gha2_cto_export() throws InterruptedException 
	{
		Thread.sleep(1000);
	    
	    
	}
	@Then("User should process TSP Payment with Vechicle token for second SB for kale GHA2 CTO Export")
	public void user_should_process_tsp_payment_with_vechicle_token_for_second_sb_for_kale_gha2_cto_export() throws InterruptedException 
	{
		Thread.sleep(1000);
	    
	    
	}

	@Then("User Should create Shipment with quick ASI {string} and {string} CTO-Kale GHA2, Direct, Non-Bonded, Multiple CHA Export")
	public void user_should_create_shipment_with_quick_asi_and_cto_kale_gha2_direct_non_bonded_multiple_cha_export(String string, String string2) {
	    
	    
	}
	@Then("User Should Search MAWB number11 {string} for further process Export")
	public void user_should_search_mawb_number11_for_further_process_export(String string) {
	    
	    
	}
	@Then("User should process TSP Payment with Vechicle token for kale GHA2 CTO for Multiple vechicle single shipment Export")
	public void user_should_process_tsp_payment_with_vechicle_token_for_kale_gha2_cto_for_multiple_vechicle_single_shipment_export() throws InterruptedException 
	{ 
		Thread.sleep(1000);
	    
	    
	}

















	
}	
		