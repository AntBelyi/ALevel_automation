package page_objects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SearchResultPage {

    private WebDriver driver;

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    private static final By SEARCH_RESULT_PAGE_TITLE = By.cssSelector("div.search__title");
    private static final By PRODUCT_ELEMENTS = By.cssSelector("div.list-item");

    @Step("Get search result page title")
    public String getSearchResultPageTitle() {
        waitForElement(SEARCH_RESULT_PAGE_TITLE);
        return driver.findElement(SEARCH_RESULT_PAGE_TITLE).getText();
    }

    @Step("Remember product name of the {0} product")
    public String getProductName(int productIndex) {
        waitForProductsAppear(PRODUCT_ELEMENTS);
        List<WebElement> productElements = driver.findElements(PRODUCT_ELEMENTS);
        return productElements.get(productIndex - 1).findElement(By.cssSelector("[class='list-item__title-container m_b-5']")).getText();
    }

    @Step("Navigate to product PDP of the {0} product")
    public void navigateToProductPdp(int productIndex) {
        waitForProductsAppear(PRODUCT_ELEMENTS);
        List<WebElement> productElements = driver.findElements(PRODUCT_ELEMENTS);
        productElements.get(productIndex - 1).findElement(By.cssSelector(".list-item__photo")).click();
    }

    private void waitForElement(By elementToWait) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementToWait));
    }

    private void waitForProductsAppear(By elementToWait) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(elementToWait, 19));
    }

}
