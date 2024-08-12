package hw_16;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Test1 {

    public static void main(String[] args) {

        final String ERROR_MESSAGE = "Невірний формат номеру посилки. Перевірте вказані символи, а також довжину номеру, яка має бути не більше 13 символів.";

        open("https://rozetka.com.ua");

        SelenideElement trackPackageLink = $("a[href*='tracking/']");
        trackPackageLink.click();

        SelenideElement trackPackageInput = $("#searchText");
        SelenideElement trackPackageButton = $(".button.button--medium.button--green");

        trackPackageInput.setValue("20450938174406");
        trackPackageButton.click();

        SelenideElement errorMessagePar = $("[class*='validation-message']");
        String errorMessage = errorMessagePar.getText();

        Assertions.assertEquals(ERROR_MESSAGE, errorMessage, "The 'Wrong format package tracking number' is not displayed");

        System.out.println("Test1 is successful");

    }

}
