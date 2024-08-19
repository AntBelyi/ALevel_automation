package hw_at_17;

import hw_at_17.data_provider.SearchWordsData;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SearchResultPageTests extends BaseTest {

    @Test(dataProvider = "getSearchWords", dataProviderClass = SearchWordsData.class)
    public void verifyPositiveSearchInput(String wordToSearch, String wordToVerify) {

        final String SEARCH_PRODUCT_TEXT_ADD1 = "посуд";
        final String SEARCH_PRODUCT_TEXT_ADD2 = "статуетка";

        WebElement searchInput = getDriver().findElement(By.id("search"));
        searchInput.sendKeys(wordToSearch, Keys.ENTER);

        WebElement searchResultText = getDriver().findElement(By.cssSelector("[data-testid='total-count']"));

        List<WebElement> searchResult = getDriver().findElements(By.cssSelector("[class='css-1wxaaza']"));

        for (WebElement element : searchResult) {
            //System.out.println(element.getText());
            Assert.assertTrue(element.getText().toLowerCase().contains(wordToVerify) ||
                    element.getText().toLowerCase().contains(SEARCH_PRODUCT_TEXT_ADD1) ||
                    element.getText().toLowerCase().contains(SEARCH_PRODUCT_TEXT_ADD2));
        }

        Assert.assertTrue(searchResultText.isDisplayed());

    }

    @Test
    public void verifyNotPresentSearchInput() {

        final String SEARCH_PRODUCT_TEXT = "nnnnnnn";

        WebElement searchInput = getDriver().findElement(By.id("search"));
        searchInput.sendKeys(SEARCH_PRODUCT_TEXT, Keys.ENTER);

        WebElement searchResultText = getDriver().findElement(By.cssSelector("[data-testid='total-count']"));

        Assert.assertTrue(searchResultText.getText().contains(" 0 "));

    }

    @Test
    public void verifyEmptySearchInput() {

        final String SEARCH_PRODUCT_TEXT = " ";

        WebElement searchInput = getDriver().findElement(By.id("search"));
        searchInput.sendKeys(SEARCH_PRODUCT_TEXT, Keys.ENTER);

        WebElement searchResultText = getDriver().findElement(By.cssSelector("[data-testid='total-count']"));

        System.out.println(searchResultText.getText());

        Assert.assertTrue(searchResultText.getText().contains(" 0 "));

    }

}

