package aqa_hw_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PackageTrackPage extends BasePage {

    public PackageTrackPage(WebDriver driver) {
        super(driver);
    }

    private static final By PACKAGE_NUMBER_INPUT = By.id("searchText");
    private static final By PACKAGE_TRACK_CLICK = By.cssSelector("button[class='button button--medium button--green']");
    private static final By VALIDATION_MESSAGE = By.cssSelector("[class*='not-found-delivery']");

    public void typePackageNumberInput(String packageNumber) {
        waitForElement(PACKAGE_NUMBER_INPUT);
        getDriver().findElement(PACKAGE_NUMBER_INPUT).sendKeys(packageNumber);
    }

    public void clickPackageTrackButton() {
        waitForElement(PACKAGE_TRACK_CLICK);
        getDriver().findElement(PACKAGE_TRACK_CLICK).click();
    }

    public String getValidationMessage() {
        waitForElement(VALIDATION_MESSAGE);
        return getDriver().findElement(VALIDATION_MESSAGE).getText();
    }
}
