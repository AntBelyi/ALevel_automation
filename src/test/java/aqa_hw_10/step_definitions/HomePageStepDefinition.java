package aqa_hw_10.step_definitions;

import aqa_hw_10.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomePageStepDefinition {

    private HomePage homePage = new HomePage();

    @Given("User is on the Home Page")
    public void openHomepage() {
        homePage.openHomePage();
    }

    @When("User clicks on the Help Center link")
    public void clickHelpCenterLink() {
        homePage.clickHelpCenterLink();
    }

    @When("User clicks on the cart icon")
    public void clickOnTheCartIcon() {
        homePage.clickCartIcon();
    }

    @When("User navigates to the package tracking page")
    public void navigateToPackageTrackingPage() {
        homePage.clickPackageTrackLink();
    }
}