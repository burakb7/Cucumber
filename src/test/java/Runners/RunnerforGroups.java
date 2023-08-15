package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (

        features = "src/test/java/FeatureFiles",
        tags = "@Smoke or Regression" ,
        glue = "StepDefinitions"

)

public class RunnerforGroups extends AbstractTestNGCucumberTests{

}
