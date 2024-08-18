package hw_qaa_16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SearchResultPageTests extends BaseTest {

    @Test
    public void verifyPositiveSearchInput() {

        final String SEARCH_PRODUCT_TEXT = "порцеляна";
        final String SEARCH_PRODUCT_TEXT_ADD1 = "порцеляні";
        final String SEARCH_PRODUCT_TEXT_ADD2 = "порцеляни";
        final String SEARCH_PRODUCT_TEXT_ADD3 = "посуд";

        WebElement searchInput = getDriver().findElement(By.id("search"));
        searchInput.sendKeys(SEARCH_PRODUCT_TEXT, Keys.ENTER);

        WebElement searchResultText = getDriver().findElement(By.cssSelector("[data-testid='total-count']"));

        List<WebElement> searchResult = getDriver().findElements(By.cssSelector("[class='css-1wxaaza']"));

        for (WebElement element : searchResult) {
            Assert.assertTrue(element.getText().toLowerCase().contains(SEARCH_PRODUCT_TEXT) ||
                    element.getText().toLowerCase().contains(SEARCH_PRODUCT_TEXT_ADD1) ||
                    element.getText().toLowerCase().contains(SEARCH_PRODUCT_TEXT_ADD2) ||
                    element.getText().toLowerCase().contains(SEARCH_PRODUCT_TEXT_ADD3));
        }

        Assert.assertTrue(searchResultText.isDisplayed());

    }

    @Test
    public void verifyNegativeSearchInput() {

        final String SEARCH_PRODUCT_TEXT = "nnnnnnn";

        WebElement searchInput = getDriver().findElement(By.id("search"));
        searchInput.sendKeys(SEARCH_PRODUCT_TEXT, Keys.ENTER);

        WebElement searchResultText = getDriver().findElement(By.cssSelector("[data-testid='total-count']"));

        Assert.assertTrue(searchResultText.getText().contains(" 0 "));

    }
}

