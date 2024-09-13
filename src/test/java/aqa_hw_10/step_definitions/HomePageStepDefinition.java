package aqa_hw_10.step_definitions;

import aqa_hw_10.CartPage;
import aqa_hw_10.HomePage;
import aqa_hw_10.HelpCenterPage;
import aqa_hw_10.PackageTrackPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomePageStepDefinition {

    final String HELP_PAGE_TEXT = "Найактуальніше";
    final String EMPTY_CART_TEXT = "Кошик порожній";
    final String SEARCH_ERROR_MESSAGE = "За номером %s посилку не знайдено. Можливо, вона ще не передана для відправлення або номер некоректний.";
    String packageNumber = "7777";


    private HomePage homePage = new HomePage();
    private HelpCenterPage helpCenterPage = new HelpCenterPage();
    private CartPage cartPage = new CartPage();
    private PackageTrackPage packageTrackPage = new PackageTrackPage();

    @Given("I am on the Home Page")
    public void openHomepage() {
        homePage.openHomePage();
    }

    @When("I click on the Help Center link")
    public void clickHelpCenterLink() {
        homePage.clickHelpCenterLink();
    }

    @Then("I am navigated to the Help Center page")
    public void verifyHelpCenterPage() {
        Assert.assertTrue(helpCenterPage.isOnHelpCenterPage(), "Not on Help Center page");
    }

    @And("the page title should be 'Найактуальніше'")
    public void verifyPageTitle() {
        Assert.assertEquals(helpCenterPage.getPageTitle(), HELP_PAGE_TEXT, "Page title does not match");
    }

    @When("I click on the cart icon")
    public void iClickOnTheCartIcon() {
        homePage.clickCartIcon();
    }

    @Then("I should see a page with title containing 'Кошик порожній'")
    public void iShouldSeePageWithTitleContaining() {
        Assert.assertTrue(cartPage.getPageTitle().contains(EMPTY_CART_TEXT));
    }

    @And("I should see an image on the cart page")
    public void iShouldSeeAnImageOnTheCartPage() {
        Assert.assertTrue(cartPage.imageIsPresent());
    }

    @When("I navigate to the package tracking page")
    public void iNavigateToPackageTrackingPage() {
        homePage.clickPackageTrackLink();
    }

    @And("I enter an invalid package number")
    public void iEnterAnInvalidPackageNumber() {
        packageTrackPage.typePackageNumberInput(packageNumber);
    }

    @And("I click the track button")
    public void iClickTheTrackButton() {
        packageTrackPage.clickPackageTrackButton();
    }

    @Then("I should see an error message")
    public void iShouldSeeAnErrorMessage() {
        String actualMessage = packageTrackPage.getValidationMessage();
        Assert.assertEquals(String.format(SEARCH_ERROR_MESSAGE, packageNumber), actualMessage);
    }
}