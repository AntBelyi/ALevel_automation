package aqa_hw_10;

import aqa_hw_18.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class PackageTrackPage {

    private static final String PACKAGE_NUMBER_INPUT = "input.tracking__input";
    private static final String PACKAGE_TRACK_CLICK = "button[class='button button--medium button--green']";
    private static final String VALIDATION_MESSAGE = "[class*='not-found-delivery']";

    public void typePackageNumberInput(String packageNumber) {
        $(PACKAGE_NUMBER_INPUT).shouldBe(visible).setValue(packageNumber);
    }

    public void clickPackageTrackButton() {
        $(PACKAGE_TRACK_CLICK).shouldBe(enabled).click();
    }

    public String getValidationMessage() {
        return $(VALIDATION_MESSAGE).shouldBe(appear).getText();
    }
}
