package tb_olx_project;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;


import static org.testng.Assert.assertTrue;

public class HomePageTests extends BaseTest {

    @Test(priority = 2)
    @Description("Verify that the product category is correctly displayed after clicking on the 'Home' and 'Kitchen' category links.")
    @Feature("Home Page")
    public void verifyProductCategoryShowing() {
        HomePage homePage = new HomePage();
        homePage.clickHomeCategoryLink();
        homePage.clickKitchenCategoryLink();

        ProductsPage productsPage = new ProductsPage();
        assertTrue(productsPage.checkProductSearchTitle());

        ElementsCollection searchResult = productsPage.getProductsItems();
        searchResult.forEach(element -> Assert.assertTrue(element.isDisplayed()));
    }

    @Test(priority = 1)
    @Description("Verify that clicking the 'Рус' language link changes the color of the 'Укр' language link to white, indicating a successful language switch.")
    @Feature("Home Page")
    public void verifyLanguageChange() {
        String whiteColor = "rgba(255, 255, 255, 1)";
        HomePage homePage = new HomePage();
        homePage.clickRusLanguageLink();
        Assert.assertTrue(homePage.getUkrLinkColor().contains(whiteColor));
    }

    @Test(priority = 3)
    @Description("Verify that typing text in the search field and then clicking the clear button empties the search field.")
    @Feature("Home Page")
    public void verifySearchFilterClear() {
        String textForSearchType = "Test text";
        HomePage homePage = new HomePage();
        homePage.typeSearchText(textForSearchType);
        homePage.clickClearButton();
        Assert.assertTrue(homePage.getSearchText().isEmpty());
    }

    @Test(priority = 3)
    @Description("Verify that the search clear button appears after typing text into the search field.")
    @Feature("Home Page")
    public void verifySearchFilterCloseButtonAppear() {
        String textForSearchType = "Test text";
        HomePage homePage = new HomePage();
        Assert.assertFalse(homePage.isSearchClearButtonVisible());
        homePage.typeSearchText(textForSearchType);
        Assert.assertTrue(homePage.isSearchClearButtonVisible());
    }
}
