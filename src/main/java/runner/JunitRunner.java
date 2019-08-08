package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", 
glue = { "scripts" },
dryRun=true,
monochrome = true,
plugin= {"preety" , "html:test-output"}

)
public class JunitRunner {

}
