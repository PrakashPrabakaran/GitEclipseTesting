package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFiles/OpenGoogle.feature", glue= "stepdefinitions")
public class RunnerClass {
	// it should combine the feature file and step definitions
	// Runner define

}
