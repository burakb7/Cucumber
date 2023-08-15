package StepDefinitions;

import Pages.DialogContent;
import Utilities.BaseDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    DialogContent dc = new DialogContent();

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        BaseDriver.getDriver().get("https://test.mersys.io/");
    }

    @When("Enter username and password")
    public void enter_username_and_password() {
        dc.username.sendKeys("turkeyts");
        dc.password.sendKeys("TechnoStudy123");
    }

    @When("Click on Login Button")
    public void click_on_login_button() {
        dc.loginButton.click();
    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {
       dc.assertText(dc.dashBoard,"Dashboard");

    }
}