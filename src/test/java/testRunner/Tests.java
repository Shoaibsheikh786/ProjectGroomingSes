package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


//important 

@RunWith(Cucumber.class)
@CucumberOptions(
		features="./Features",
		glue="stepDefinations",
		tags= "@dataDriven",
		dryRun=true,
	    plugin = {"json:target/cucumber.json",
	    		  "html:target/cucumberHtmlRep.html"}
		
		)

public class Tests {

}
