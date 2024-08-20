package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SearchResultPage {

    WebDriver driver;
    WebDriverWait wait;

    public SearchResultPage (WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private static final By SEARCH_RESULT_TITLE = By.cssSelector("h1[class*='catalog-heading']");
    private static final By PRODUCT_ITEMS = By.cssSelector("span.goods-tile__title");

    public String getSearchResultPageTitle(){
        waitForElement(SEARCH_RESULT_TITLE);
        return driver.findElement(SEARCH_RESULT_TITLE).getText();
    }

    public String getProductName(int productIndex){
        waitForProductAppear(PRODUCT_ITEMS);
        List<WebElement> productElement = driver.findElements(PRODUCT_ITEMS);
        return productElement.get(productIndex-1).getText();
    }

    public void navigateToProductPdP(int productIndex){
        waitForProductAppear(PRODUCT_ITEMS);
        List<WebElement> productElement = driver.findElements(PRODUCT_ITEMS);
        productElement.get(productIndex-1).click();
    }

    public void waitForElement(By elementToWait){
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementToWait));
    }

    public void waitForProductAppear(By elementToWait){
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(elementToWait, 59));
    }
}
