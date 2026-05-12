package Runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features/ECOM_Outbound.feature",
        glue = "stepdefinition",
        tags = "@AdaniNMIAL_001",
        monochrome = true,
        plugin = {
                "pretty",
                "html:target/cucumber-report.html"
        }
)



public class TestRunner2 {

}
