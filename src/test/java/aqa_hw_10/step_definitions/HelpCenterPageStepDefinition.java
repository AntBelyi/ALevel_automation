package aqa_hw_10.step_definitions;

import aqa_hw_10.HelpCenterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class HelpCenterPageStepDefinition {

    final String HELP_PAGE_TEXT = "Найактуальніше";

    private HelpCenterPage helpCenterPage = new HelpCenterPage();

    @Then("Verify user is navigated to the Help Center page")
    public void verifyHelpCenterPage() {
        Assert.assertTrue(helpCenterPage.isOnHelpCenterPage(), "Not on Help Center page");
    }

    @And("Verify page title is 'Найактуальніше' on the Help Center page")
    public void verifyPageTitle() {
        Assert.assertEquals(helpCenterPage.getPageTitle(), HELP_PAGE_TEXT, "Page title does not match");
    }
}