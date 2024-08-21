import hw_at_18_rozetka_page_objects.*;
import junit.framework.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class CartTests extends BaseTest {

    @Test
    public void verifyEmptyCart() {

        final String EMPTY_CART_TEXT = "Кошик порожній";

        HomePage homePage = new HomePage(getDriver());

        homePage.clickCartIcon();

        CartPage cartPage = new CartPage(getDriver());

        Assert.assertTrue(cartPage.getPageTitle().contains(EMPTY_CART_TEXT) && cartPage.imageIsPresent());

    }

    @Test
    public void verifyProductToCar() throws InterruptedException {
        String wordToSearch = "iPhone";
        int navigateToProduct = 4;

        HomePage homePage = new HomePage(getDriver());

        homePage.typeSearchInput(wordToSearch);
        homePage.clickSearchButton();

        SearchResultPage searchPage = new SearchResultPage(getDriver());

        String productName = searchPage.getProductName(navigateToProduct);

        searchPage.addToCart(navigateToProduct);

        searchPage.clickCartIcon();

        CartPage cartPage = new CartPage(getDriver());

        Assert.assertEquals(productName, cartPage.getProductTitle());
    }

    @Test
    public void verifyProductToCartFromPdP(){
        String wordToSearch = "iPhone";
        int navigateToProduct = 4;

        HomePage homePage = new HomePage(getDriver());

        homePage.typeSearchInput(wordToSearch);
        homePage.clickSearchButton();

        SearchResultPage searchPage = new SearchResultPage(getDriver());

        String productName = searchPage.getProductName(navigateToProduct);
        searchPage.navigateToProductPdP(navigateToProduct);

        ProductDetailPage productDetailPage = new ProductDetailPage(getDriver());

        Assert.assertEquals(productName, productDetailPage.getPageTitle());

        productDetailPage.addProductToCart();

        CartPage cartPage = new CartPage(getDriver());

        Assert.assertTrue(cartPage.cartIsOpened());
    }
}
