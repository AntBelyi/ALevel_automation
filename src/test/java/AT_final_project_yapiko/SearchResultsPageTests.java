package AT_final_project_yapiko;

import AT_final_project_yapiko.data_provider.SearchWordsData;
import AT_final_project_yapiko.listeners.MyCustomListener;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyCustomListener.class)
public class SearchResultsPageTests extends BaseTest {
    @Test(dataProvider = "getSearchWords", dataProviderClass = SearchWordsData.class)
    @Description("Verify that the search Result Page opened correctly and its title contains word we search and all good contain this word.")
    @Feature("Search Result Page")
    public void verifyPageIsOpenedCorrectlyByKeyWord(String wordToFind, String expectedWord) {
        HomePage homePage = new HomePage();
        SearchResultsPage searchResultsPage = new SearchResultsPage();

        homePage.searchForWord(wordToFind);

        Assert.assertTrue(searchResultsPage.isSearchResultPageTitleCorrect(expectedWord), "The title does not contain the word " + wordToFind);

        Assert.assertTrue(searchResultsPage.areAllProductsContainSearchWord(wordToFind), "Not all products contain the word " + wordToFind);
    }
    @Test
    @Description("Negative Test: Verify that when user enter wrong word in to search field search Result Page contains a message stating that no products were found.")
    @Feature("Search Result Page")
    public void verifyPageIsOpenedCorrectlyByWrongKey() {
        String wordToFind = "iphone";
        String searchResultPageMistakeMessageText = "На Ваш запит нічого не знайдено.";

        HomePage homePage = new HomePage();
        SearchResultsPage searchResultsPage = new SearchResultsPage();

        homePage.searchForWord(wordToFind);

        Assert.assertTrue(searchResultsPage.isSearchResultPageTitleCorrect(wordToFind), "The title does not contain the word " + wordToFind);

        Assert.assertTrue(searchResultsPage.isMistakeMessageDisplayed(searchResultPageMistakeMessageText), "The message about the absence of the product was not displayed.");
    }

}
