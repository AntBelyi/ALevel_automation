package hw_16;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.Condition;
import dev.failsafe.internal.util.Assert;

import static com.codeborne.selenide.Selenide.*;

public class Test4 {
    public static void main(String[] args) {

        open("https://rozetka.com.ua");
        webdriver().driver().getWebDriver().manage().window().maximize();

        SelenideElement searchInput = $x("//input[contains(@class, 'search-form__input')]");
        searchInput.setValue("4820227283217").pressEnter();

        SelenideElement elementProduct = $("[class='product-button__buy-group']")
                .shouldBe(Condition.visible);
        elementProduct.click();

        SelenideElement elementCartPlus = $("[data-testid='cart-counter-increment-button']")
                .shouldBe(Condition.visible);
        elementCartPlus.click();

        String valueCount = $("[data-testid='cart-counter-input']")
                .shouldBe(Condition.visible).getAttribute("value");

        System.out.println("Value: " + valueCount);

        Assert.isTrue(valueCount.contains("2"), "Count of products is not correct");
        System.out.println("Test4 is successful");

    }
}
