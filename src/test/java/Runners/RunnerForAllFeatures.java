package Runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (

        features = "src/test/java/FeatureFiles",
        glue = "StepDefinitions",
        dryRun=false

)

public class RunnerForAllFeatures extends AbstractTestNGCucumberTests{

}
