package search_tests;

import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.HomePage;
import page_objects.SearchResultPage;

public class SearchResultPageTests extends BaseTest {

    @Test
    @Feature("Search result page")
    public void verifySearchResultPageTitleIsCorrect() {
        String wordToSearch = "game";

        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());

        homePage.typeTextIntoSearchField(wordToSearch);
        homePage.clickOnSearchButton();

        String actualSearchResultPageTitle = searchResultPage.getSearchResultPageTitle();

        Assert.assertTrue(actualSearchResultPageTitle.contains(wordToSearch));
    }

}
