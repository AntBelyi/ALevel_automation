package hw_16;

import com.codeborne.selenide.SelenideElement;
import dev.failsafe.internal.util.Assert;

import static com.codeborne.selenide.Selenide.*;

public class Test1 {

    public static void main(String[] args) {

        final String ERROR_MESSAGE = "Невірний формат номеру посилки. Перевірте вказані символи, а також довжину номеру, яка має бути не більше 13 символів.";

        open("https://rozetka.com.ua");
        sleep(3000);

        SelenideElement trackPackageLink = $("a[href*='tracking/']");
        trackPackageLink.click();
        sleep(3000);

        SelenideElement trackPackageInput = $("#searchText");
        SelenideElement trackPackageButton = $(".button.button--medium.button--green");

        trackPackageInput.setValue("20450938174406");
        trackPackageButton.click();
        sleep(3000);

        SelenideElement errorMessagePar = $("[class*='validation-message']");
        String errorMessage = errorMessagePar.getText();

        Assert.isTrue(errorMessage.equals(ERROR_MESSAGE), "The 'Wrong format package tracking number' is not displayed", null);
        System.out.println("Test1 is successful");

    }

}
