package page_objects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductDetailsPage {

    private WebDriver driver;

    public ProductDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    private static final By PRODUCT_NAME = By.cssSelector("h1.title__main");

    @Step("Get product name")
    public String getProductName() {
        waitForElement(PRODUCT_NAME);
        return driver.findElement(PRODUCT_NAME).getText();
    }

    private void waitForElement(By elementToWait) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementToWait));
    }

}
