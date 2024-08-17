package hw_16;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.Condition;
import dev.failsafe.internal.util.Assert;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class Test3 {
    public static void main(String[] args) {
        final String EMPTY_CART_TEXT = "Кошик порожній";

        open("https://rozetka.com.ua");
        webdriver().driver().getWebDriver().manage().window().maximize();

        SelenideElement cartItem = $(".header-actions .header-cart__button");
        cartItem.shouldBe(visible).click();

        SelenideElement elementEmptyCart = $(".cart-dummy__heading").shouldBe(visible);
        SelenideElement cartImage = $("img.cart-dummy__illustration");

        Assert.isTrue(elementEmptyCart.getText().contains(EMPTY_CART_TEXT) && cartImage.isDisplayed(), "The cart is not empty");
        System.out.println("Test3 is successful");
    }
}
