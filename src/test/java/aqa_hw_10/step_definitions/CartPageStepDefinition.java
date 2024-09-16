package aqa_hw_10.step_definitions;

import aqa_hw_10.CartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CartPageStepDefinition {

    final String EMPTY_CART_TEXT = "Кошик порожній";

    private CartPage cartPage = new CartPage();

    @Then("User should see a page with title containing 'Кошик порожній'")
    public void shouldSeePageWithTitleContaining() {
        Assert.assertTrue(cartPage.getPageTitle().contains(EMPTY_CART_TEXT));
    }

    @And("User should see an image on the cart page")
    public void shouldSeeAnImageOnTheCartPage() {
        Assert.assertTrue(cartPage.imageIsPresent());
    }
}