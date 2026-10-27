package Stepdefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="CucumberFeatures" , glue= {"Stepdefinations/Test_Pract"})
public class runner {
	
	
	
}
