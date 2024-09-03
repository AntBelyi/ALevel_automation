package page_object_tests;

import aqa_hw_4.CartPage;
import aqa_hw_4.HomePage;
import aqa_hw_4.ProductDetailPage;
import aqa_hw_4.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTests extends BaseTest {

    @Test
    public void verifyEmptyCart() {

        final String EMPTY_CART_TEXT = "Кошик порожній";

        HomePage homePage = new HomePage(getDriver());
        homePage.clickCartIcon();

        CartPage cartPage = new CartPage(getDriver());

        Assert.assertTrue(cartPage.getPageTitle().contains(EMPTY_CART_TEXT));
        Assert.assertTrue(cartPage.imageIsPresent());
    }

    @Test
    public void verifyAddProductToCart() {
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
    public void verifyAddProductToCartFromPdP(){
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
