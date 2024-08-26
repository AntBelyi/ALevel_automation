package aqa_hw_18;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductPageTests extends BaseTest{

    @Test
    public void verifyProductDetailTitle() {
        String wordToSearch = "iPhone";
        int navigateToProduct = 3;

        HomePage homePage = new HomePage(getDriver());

        homePage.typeSearchInput(wordToSearch);
        homePage.clickSearchButton();

        SearchResultPage searchPage = new SearchResultPage(getDriver());

        String productName = searchPage.getProductName(navigateToProduct);
        searchPage.navigateToProductPdP(navigateToProduct);

        ProductDetailPage productDetailPage = new ProductDetailPage(getDriver());

        Assert.assertEquals(productName, productDetailPage.getPageTitle());
    }
}
