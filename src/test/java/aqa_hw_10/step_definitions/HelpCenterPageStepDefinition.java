package aqa_hw_10.step_definitions;

import aqa_hw_10.HelpCenterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class HelpCenterPageStepDefinition {

    private HelpCenterPage helpCenterPage = new HelpCenterPage();

    @Then("Verify user is navigated to the Help Center page")
    public void verifyHelpCenterPage() {
        Assert.assertTrue(helpCenterPage.isOnHelpCenterPage(), "Not on Help Center page");
    }

    @And("Verify page title is {string} on Help Center page")
    public void verifyPageTitle(String expectedTitle) {
        Assert.assertEquals(helpCenterPage.getPageTitle(), expectedTitle, "Page title does not match");
    }
}