package Runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features",
        glue = "stepdefinition",
        
        tags = "@NonEShipment_1.1",
        
        monochrome = true,
        plugin = {
                "pretty",
                "html:target/cucumber-report.html"
        }
)



public class TestRunner2 {

}
