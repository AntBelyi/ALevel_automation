package hw_at_18_rozetka_page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    private static final By CART_HEAD_TEXT = By.cssSelector(".cart-dummy__heading");
    private static final By CART_IMAGE = By.cssSelector("img[class=cart-dummy__illustration]");
    private static final By CART_LIST = By.cssSelector("ul.cart-list");
    private static final By CART_PRODUCT_TITLE = By.cssSelector(".cart-product__title");

    public String getPageTitle() {
        waitForElement(CART_HEAD_TEXT);
        return getDriver().findElement(CART_HEAD_TEXT).getText();
    }

    public boolean imageIsPresent() {
        waitForElement(CART_IMAGE);
        return getDriver().findElement(CART_IMAGE).isDisplayed();
    }

    public boolean cartIsOpened() {
        waitForElement(CART_LIST);
        return getDriver().findElement(CART_LIST).isDisplayed();
    }

    public String getProductTitle() {
        waitForElement(CART_PRODUCT_TITLE);
        return getDriver().findElement(CART_PRODUCT_TITLE).getText();
    }
}
