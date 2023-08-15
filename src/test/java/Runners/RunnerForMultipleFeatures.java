package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions (
        features = {"src/test/java/FeatureFiles/Login.feature",
                    "src/test/java/FeatureFiles/Country.feature",
                    "src/test/java/FeatureFiles/FeeFunctionality.feature"},

        glue = "StepDefinitions",
        dryRun = true // default value is false. It runs the features regularly
                     // true ; it only checks if all required step definitions for the feature are exists.
)
public class RunnerForMultipleFeatures extends AbstractTestNGCucumberTests{

}
