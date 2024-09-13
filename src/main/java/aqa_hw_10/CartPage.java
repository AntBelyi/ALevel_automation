package aqa_hw_10;

import aqa_hw_18.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CartPage{

    private static final By CART_HEAD_TEXT = By.cssSelector(".cart-dummy__heading");
    private static final By CART_IMAGE = By.cssSelector("img[class=cart-dummy__illustration]");
    private static final By CART_LIST = By.cssSelector("ul.cart-list");
    private static final By CART_PRODUCT_TITLE = By.cssSelector(".cart-product__title");

    public String getPageTitle() {
        return $(CART_HEAD_TEXT).shouldBe(visible).getText();
    }

    public boolean imageIsPresent() {
        return $(CART_IMAGE).shouldBe(visible).isDisplayed();
    }

    public boolean cartIsOpened() {
        return $(CART_LIST).shouldBe(visible).isDisplayed();
    }

    public String getProductTitle() {
        return $(CART_PRODUCT_TITLE).getText();
    }
}
