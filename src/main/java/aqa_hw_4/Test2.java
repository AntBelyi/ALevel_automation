package aqa_hw_4;

import com.codeborne.selenide.SelenideElement;
import dev.failsafe.internal.util.Assert;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Test2 {
    public static void main(String[] args) {

        final String HELP_PAGE_TEXT = "Найактуальніше";

        open("https://rozetka.com.ua");
        getWebDriver().manage().window().maximize();

        SelenideElement helpLink = $(".main-links__help[href*='help.rozetka.com']");
        helpLink.shouldBe(visible).click();

        SelenideElement titleText = $(".info-title");
        String actualTitleText = titleText.shouldBe(visible).getText();
        System.out.println(actualTitleText);

        Assert.isTrue(titleText.getText().contains(HELP_PAGE_TEXT), "Help title text is not found");
        System.out.println("Test2 is successful");
    }
}
