import hwa_18.HomePage;
import hwa_18.SearchResultPage;
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

