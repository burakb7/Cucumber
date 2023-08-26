package StepDefinitions;

import Utilities.BaseDriver;
import Utilities.ExcelUtilities;
import io.cucumber.java.*;

import java.time.Duration;
import java.time.LocalDateTime;

public class Hooks {
    LocalDateTime startTime;
    LocalDateTime endTime;

    @Before // runs before each scenario in the future files
    public void beforeScenario() {
        startTime = LocalDateTime.now();
        System.out.println("Before Scenario runs");

    }

    @After // runs after each scenario in the future files
    public void afterScenario(Scenario scenario) {
        endTime = LocalDateTime.now();
        Duration duration = Duration.between(startTime,endTime);
        ExcelUtilities.writeInExcel("src/test/java/ApachePOI/Resources/CampusScenarioResults.xlsx", scenario,startTime, endTime,duration);
        BaseDriver.quitDriver();
    }



    /*

    @BeforeStep //  runs before each step in a scenario in the future files
    public void beforeStep(){
        System.out.println("Before Step runs");
    }

    @AfterStep // runs after each step in a scenario in the future files
    public void afterStep(){
        System.out.println("After Step runs");
    }
*/

}