package aqa_hw_2;

import com.codeborne.selenide.SelenideElement;
import dev.failsafe.internal.util.Assert;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Test3 {
    public static void main(String[] args) {
        final String EMPTY_CART_TEXT = "Кошик порожній";

        open("https://rozetka.com.ua");
        getWebDriver().manage().window().maximize();

        SelenideElement cartItem = $(".header-actions .header-cart__button");
        cartItem.shouldBe(visible).click();

        SelenideElement elementEmptyCart = $(".cart-dummy__heading").shouldBe(visible);
        SelenideElement cartImage = $("img.cart-dummy__illustration");

        Assert.isTrue(elementEmptyCart.getText().contains(EMPTY_CART_TEXT) && cartImage.isDisplayed(), "The cart is not empty");
        System.out.println("Test3 is successful");
    }
}
