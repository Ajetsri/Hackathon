package testScenarios;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( 
		features= {".//featureFiles/UrbanLadder.feature"},
		glue="stepDefinition",
		plugin= {"pretty",
				"html:reports/myreportCucumber.html",
				"rerun:target/rerun.txt",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				},
		tags="@sanity",
		
		//actual execution not done if dry run is true
		//dryRun=false,//to check every methods in feature file is implemented in  step definition
		//monochrome = true,//remove junk characters from console output
		publish=true//share report to team gives url of report on console
		
		//tags="@sanity"//this will execute scenarios tagged with sanity in feature files

		)
public class TestRunnerFile{
	

}