package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavBar;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CitizenshipSteps {
    LeftNavBar lb = new LeftNavBar();
    DialogContent dc = new DialogContent();

    @And("Navigate to Citizenship page")
    public void navigateToCitizenshipPage() {
        lb.clickMethod(lb.setUpButton);
        lb.clickMethod(lb.parametersButton);
        lb.clickMethod(lb.citizenshipButton);
    }

    @Then("Enter {string} as citizenship name and {string} as short name")
    public void enterAsCitizenshipNameAndAsShortName(String citizenshipName, String citizenshipShortName){
        dc.sendKeysMethod(dc.formNameInput,citizenshipName);
        dc.sendKeysMethod(dc.formShortNameInput,citizenshipShortName);
    }

    @And("Search for the citizenship with the name {string} and shortname {string}")
    public void searchForTheCitizenshipWithTheNameAndShortname(String citizenshipName, String citizenshipShortName) {
        dc.sendKeysMethod(dc.searchNameInput,citizenshipName);
        dc.sendKeysMethod(dc.searchShortNameInput,citizenshipShortName);
        dc.clickMethod(dc.searchButton);
    }

    @When("Delete citizenship")
    public void deleteCitizenship() {
    }
}