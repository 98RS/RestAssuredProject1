package testRunner;

import org.junit.runner.RunWith;

import allStepDefinitions.testngreport;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
features="src/test/resources/Allfeatures",
glue="allStepDefinitions",
tags = "@tag, @smoke",
monochrome = true,
strict = true,
dryRun =true)



public class TestRunner {

}
