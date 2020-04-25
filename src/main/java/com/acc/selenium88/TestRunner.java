package com.acc.selenium88;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber.json" },
		features = "Feature99"
		,glue={"step_definition"}
		)
public class TestRunner {

}
