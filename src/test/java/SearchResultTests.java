import hw_at_18_rozetka_page_objects.HomePage;
import hw_at_18_rozetka_page_objects.SearchResultPage;
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

