package Runner;
import static Helper.BaseObjects.Admin;

import org.junit.runner.RunWith;

import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(features = {"Features/NMIAL_Outbound.feature"}, 
	                 glue = "stepdefinition",
	                 monochrome = true,
	                 plugin = { "json:target/cucumber.json",
	                		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
	                		 "rerun:Rerun/rerun1.txt" } ,
	                 	
	                 tags ="AdaniNMIAL_01"
	                 )
	
public class TestRunner {

}
	//04 bug
	//6 rerun pending