package page_object_tests;

import aqa_hw_6.HomePage;
import aqa_hw_6.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class SearchResultTests extends BaseTest {

    public void verifySearchResultPageTitle() {

        String wordToSearch = "iPhone";

        HomePage homePage = new HomePage(getDriver());

        homePage.typeSearchInput(wordToSearch);
        homePage.clickSearchButton();

        SearchResultPage searchPage = new SearchResultPage(getDriver());

        Assert.assertTrue(searchPage.getSearchResultPageTitle().contains(wordToSearch));
    }
}

