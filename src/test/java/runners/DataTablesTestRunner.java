package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "html:target/default-cucumber1-reports",
                "json:target/json-reports/cucumber1.json",
                "junit:target/xml-report/cucumber1.xml"
        },
        //Path of the feature folder
        features = "src\\test\\resources\\features",
        //Path of the step definition folder
        //  tags = "@flowersearch",
        tags = "@datatable",
        glue="stepdefinitions",
        dryRun = false
)

public class DataTablesTestRunner {
}
