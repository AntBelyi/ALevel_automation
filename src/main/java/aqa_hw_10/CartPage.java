package aqa_hw_10;

import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CartPage{

    private static final By CART_HEAD_TEXT = By.cssSelector(".cart-dummy__heading");
    private static final By CART_IMAGE = By.cssSelector("img[class=cart-dummy__illustration]");
    private static final By CART_LIST = By.cssSelector("ul.cart-list");
    private static final By CART_PRODUCT_TITLE = By.cssSelector(".cart-product__title");

    public String getPageTitle() {
        return $(CART_HEAD_TEXT).shouldBe(visible, Duration.ofSeconds(20)).getText();
    }

    public boolean imageIsPresent() {
        return $(CART_IMAGE).shouldBe(visible).isDisplayed();
    }
}
