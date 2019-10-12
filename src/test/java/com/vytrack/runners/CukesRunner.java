package com.vytrack.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


 @RunWith(Cucumber.class)
 @CucumberOptions(
         tags = {"@storemanagerLogin or @negative"},
         features = {"src/test/recources/features"},
         glue = {"com/vytrack/step_definitions"},

         dryRun = false
        )
       public class CukesRunner {
}
