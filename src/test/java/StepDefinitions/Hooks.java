package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    @Before // runs before each scenario in the future files
    public void beforeScenario() {
        System.out.println("Before Scenario");

    }

    @After // runs after each scenario in the future files
    public void afterScenario() {
        System.out.println("After Scenario");
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