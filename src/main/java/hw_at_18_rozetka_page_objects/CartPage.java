package hw_at_18_rozetka_page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    private static final By CART_HEAD_TEXT = By.cssSelector(".cart-dummy__heading");
    private static final By CART_IMAGE = By.cssSelector("img[class=cart-dummy__illustration]");

    public String getPageTitle() {
        waitForElement(CART_HEAD_TEXT);
        return getDriver().findElement(CART_HEAD_TEXT).getText();
    }

    public boolean imageIsPresent() {
        waitForElement(CART_IMAGE);
        return getDriver().findElement(CART_IMAGE).isDisplayed();
    }

}
