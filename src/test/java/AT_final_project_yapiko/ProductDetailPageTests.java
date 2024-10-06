package AT_final_project_yapiko;

import AT_final_project_yapiko.listeners.MyCustomListener;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyCustomListener.class)
public class ProductDetailPageTests extends BaseTestPizzaPage {
    @Test
    @Description("Verify that the can go to the product page and add this product in to the cart.")
    @Feature("Product Detail Page")
    public void verifyPDPOpenedCorrectly() {
        HomePage homePage = new HomePage();
        ProductDetailPage productDetailPage = new ProductDetailPage();
        BasketPage basketPage = new BasketPage();

        String productAltText = homePage.goToProductDetailPage(1);

        String pdpTitleName = productDetailPage.getProductTitle();
        Assert.assertTrue(productAltText.contains(pdpTitleName), "The product name on the PDP does not correspond to the product name on the search page.");

        productDetailPage.addToCart();

        homePage.goToCart();

        String productNameInCart = basketPage.getProductNameInCart();
        Assert.assertTrue(productNameInCart.contains(pdpTitleName), "The product name in Cart does not correspond to the product name on the PDP.");
    }
}