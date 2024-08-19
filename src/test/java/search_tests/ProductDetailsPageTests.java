package search_tests;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.HomePage;
import page_objects.ProductDetailsPage;
import page_objects.SearchResultPage;

public class ProductDetailsPageTests extends BaseTest {

    @Test()
    @Severity(SeverityLevel.BLOCKER)
    @Feature("Product details page")
    @Description("Verify that product details page title is correct")
    public void verifyProductDetailsPageTitleIsCorrect() {
        String wordToSearch = "iPhone";
        int indexProductToNavigate = 2;

        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(getDriver());

        homePage.typeTextIntoSearchField(wordToSearch);
        homePage.clickOnSearchButton();

        String navigatedProductName = searchResultPage.getProductName(indexProductToNavigate);
        searchResultPage.navigateToProductPdp(indexProductToNavigate);

        String actualProductName = productDetailsPage.getProductName();

        Assert.assertTrue(actualProductName.contains(wordToSearch));
    }

}
