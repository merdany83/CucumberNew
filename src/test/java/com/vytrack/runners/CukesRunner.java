package com.vytrack.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


 @RunWith(Cucumber.class)
 @CucumberOptions(
         features = {"src/test/recources/features"},
         glue = {"com/vytrack/step_definitions/LoginStepDefinitions.java"},
         dryRun = true
 )
 public class CukesRunner {
}
