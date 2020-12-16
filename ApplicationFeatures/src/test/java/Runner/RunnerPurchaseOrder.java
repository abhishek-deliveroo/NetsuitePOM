package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\Admin1\\eclipse-workspace\\ApplicationFeatures\\src\\test\\java\\Netsuite\\ApplicationFeatures\\PurchaseOrder.feature"
 ,glue="stepDefinition",format ={"html:target/cucumber-html-report", "json:target/cucumber-json-report.json" })

public class RunnerPurchaseOrder 
{
}
