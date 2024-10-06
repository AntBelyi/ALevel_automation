package AT_final_project_yapiko;

import AT_final_project_yapiko.listeners.MyCustomListener;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyCustomListener.class)
public class BasketPageTests extends BaseTestPizzaPage {
    @Test
    @Description("Verify that when user placing an order, if he select pickup, a discount is applied.")
    @Feature("Basket Page")
    public void verifyPickUpDiscountIsAppliedCorrectly() {
        HomePage homePage = new HomePage();
        BasketPage basketPage = new BasketPage();

        homePage.addToCart(4);
        homePage.goToCart();

        int initialPrice = basketPage.getOrderAmount();
        basketPage.selectPickUpDiscount();

        int discountedPrice = basketPage.getUpdatedOrderAmount();

        int expectedPriceWithDiscount = initialPrice - (initialPrice / 10);

        Assert.assertEquals(discountedPrice, expectedPriceWithDiscount, "Discount for pick-up was not applied correctly.");
    }
    @Test
    @Description("Verify that the price is calculated correctly when a product is removed from the basket.")
    @Feature("Basket Page")
    public void verifyAmountIsCorrectIfDeleteProductFromBasket() {
        HomePage homePage = new HomePage();
        BasketPage basketPage = new BasketPage();

        homePage.addToCart(0);
        homePage.addToCart(1);

        homePage.goToCart();

        int initialOrderAmount = basketPage.getOrderAmount(12);

        int secondProductPrice = basketPage.getProductPrice(9);

        basketPage.deleteProductFromBasket(1);

        int updatedOrderAmount = basketPage.getUpdatedOrderAmount(11);

        int expectedPriceAfterDelete = initialOrderAmount - secondProductPrice;

        Assert.assertEquals(updatedOrderAmount, expectedPriceAfterDelete, "Order amount has not been updated correctly after deleting the product.");
    }
}
