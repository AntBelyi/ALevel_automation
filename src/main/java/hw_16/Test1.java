package hw_16;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import dev.failsafe.internal.util.Assert;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class Test1 {

    public static void main(String[] args) {

        final String ERROR_MESSAGE = "Невірний формат номеру посилки. Перевірте вказані символи, а також довжину номеру, яка має бути не більше 13 символів.";

        open("https://rozetka.com.ua");
        webdriver().driver().getWebDriver().manage().window().maximize();

        SelenideElement trackPackageLink = $("a[href*='tracking/']");
        trackPackageLink.shouldBe(visible).click();

        SelenideElement trackPackageInput = $("#searchText");
        SelenideElement trackPackageButton = $(".button.button--medium.button--green");

        trackPackageInput.shouldBe(visible).setValue("20450938174406");
        trackPackageButton.shouldBe(visible).click();

        SelenideElement errorValidationMessage = $("[class*='validation-message']");
        String errorMessage = errorValidationMessage.shouldBe(visible).getText();

        Assert.isTrue(errorValidationMessage.equals(ERROR_MESSAGE), "The 'Wrong format package tracking number' is not displayed");
        System.out.println("MessageParest test is successful");

    }
}
