package aqa_hw_10.step_definitions;

import aqa_hw_10.PackageTrackPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class PackageTrackPageStepDefinition {

    final String SEARCH_ERROR_MESSAGE = "За номером %s посилку не знайдено. Можливо, вона ще не передана для відправлення або номер некоректний.";
    String packageNumber = "7777";

    private PackageTrackPage packageTrackPage = new PackageTrackPage();

    @When("User enters an invalid package number")
    public void enterAnInvalidPackageNumber() {
        packageTrackPage.typePackageNumberInput(packageNumber);
    }

    @When("User clicks the track button")
    public void clickTheTrackButton() {
        packageTrackPage.clickPackageTrackButton();
    }

    @Then("User should see an error message")
    public void shouldSeeAnErrorMessage() {
        String actualMessage = packageTrackPage.getValidationMessage();
        Assert.assertEquals(String.format(SEARCH_ERROR_MESSAGE, packageNumber), actualMessage);
    }
}