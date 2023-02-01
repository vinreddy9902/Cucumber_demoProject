package myTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="Features",
	     plugin= {"pretty","html:test_output","json:json_output/cucumber.json","junit:junit_output/cucumber.xml"},
		glue="stepDefinations",
		//dryRun= true, // it will check the mapping is proper between feature and step definitions file
		monochrome=true  // it will display console output in proper readable format 
		)

public class TestRunner {

}
