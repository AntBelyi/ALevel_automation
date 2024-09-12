package aqa_hw_10;

import aqa_hw_18.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    private static final By WAIT_IMAGE = By.cssSelector("img.picture-container__picture");
    private static final By PRODUCT_NAME = By.cssSelector("h1.ng-star-inserted");
    private static final By CART_BUTTON = By.tagName("rz-product-buy-btn");

    public String getPageTitle() {
        waitForElement(WAIT_IMAGE);
        return getDriver().findElement(PRODUCT_NAME).getText();
    }

    public void addProductToCart() {
        waitForElement(CART_BUTTON);
        getDriver().findElement(CART_BUTTON).click();
    }
}