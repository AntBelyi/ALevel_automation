package search_tests;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.HomePage;
import page_objects.SearchResultPage;

public class SearchResultPageTests extends BaseTest {

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Feature("Search result page feature")
    @Description("Verify search result page title is displayed and coorect")
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
