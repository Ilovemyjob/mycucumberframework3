package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "html:target/default-cucumber3-reports",
                "json:target/json-reports/cucumber3.json",
                "junit:target/xml-report/cucumber3.xml"
        },
        //Path of the feature folder
        features = "src\\test\\resources\\features",
        //Path of the step definition folder
        //  tags = "@flowersearch",
        tags = "~@smoke",
        glue="stepdefinitions",
        dryRun = false
)

public class SmokeTestRunner {
}
