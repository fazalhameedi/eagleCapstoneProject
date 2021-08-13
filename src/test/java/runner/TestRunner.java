package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:Features", // features tells cucumber options where feature files are located
		glue = "stepDefinitions", // glue tells cucumber options where step Definition class is located
		tags = { "@completeTest" }, 
		dryRun = false, // dry run if sets to false check if all steps in feature files has sterp
		// definition

		monochrome = true, // if set to true make the console output readable.
		strict = false, // if set to false will fail if there are pending undefined steps.
		format = { "pretty", "html:target/cucumber-reports/cucumber-pretty",
				"json:target/cucumber-reports/CucumberTestReport.json", "rerun:target/cucumber-reports/rerun.txt" }

)

public class TestRunner {

}
