import PageObjects.HomePage;
import PageObjects.SearchResultPage;
import junit.framework.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

@Test
public class SearchResultTests extends BaseTest {

    public void verifySearchResultPageTitle() throws InterruptedException {

        String wordToSearch = "iPhone";

        HomePage homePage = new HomePage(getDriver());

        homePage.typeSearchInput(wordToSearch);
        homePage.clickSearchButton();

        SearchResultPage searchPage = new SearchResultPage(getDriver());

        Assert.assertTrue(searchPage.getSearchResultPageTitle().contains(wordToSearch));

    }
}

