package aqa_hw_4;

import com.codeborne.selenide.SelenideElement;
import dev.failsafe.internal.util.Assert;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Test4 {
    public static void main(String[] args) {

        open("https://rozetka.com.ua");
        getWebDriver().manage().window().maximize();

        SelenideElement searchInput = $x("//input[contains(@class, 'search-form__input')]");
        searchInput.shouldBe(visible).setValue("4820227283217").pressEnter();

        SelenideElement addToBasketButton = $("[class='product-button__buy-group']").shouldBe(visible);
        addToBasketButton.click();

        SelenideElement increaseProductQuantityButton = $("[data-testid='cart-counter-increment-button']").shouldBe(visible);
        increaseProductQuantityButton.click();

        String valueCount = $("[data-testid='cart-counter-input']").shouldBe(visible).getAttribute("value");

        System.out.println("Value: " + valueCount);
        Assert.isTrue(valueCount.equals("2"), "Count of products is not correct");
        System.out.println("Test4 is successful");

    }
}
