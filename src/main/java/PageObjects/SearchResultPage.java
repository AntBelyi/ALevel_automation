package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SearchResultPage extends BasePage{

    public SearchResultPage (WebDriver driver){
        super(driver);
    }

    private static final By SEARCH_RESULT_TITLE = By.cssSelector("h1[class*='catalog-heading']");
    private static final By PRODUCT_ITEMS = By.cssSelector("span.goods-tile__title");

    public String getSearchResultPageTitle(){
        waitForElement(SEARCH_RESULT_TITLE);
        return getDriver().findElement(SEARCH_RESULT_TITLE).getText();
    }

    public String getProductName(int productIndex){
        waitFo60rProductAppear(PRODUCT_ITEMS);
        List<WebElement> productElement = getDriver().findElements(PRODUCT_ITEMS);
        return productElement.get(productIndex-1).getText();
    }

    public void navigateToProductPdP(int productIndex){
        waitFor60ProductAppear(PRODUCT_ITEMS);
        List<WebElement> productElement = getDriver().findElements(PRODUCT_ITEMS);
        productElement.get(productIndex-1).click();
    }
}
