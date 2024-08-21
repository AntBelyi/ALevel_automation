package hw_at_18_rozetka_page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    private WebDriver driver;
    private WebDriverWait wait;

    protected WebDriver getDriver() {
        return driver;
    }
    protected WebDriverWait getWait() {
        return wait;
    }

    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    protected void waitForElement(By elementToWait){
        getWait().until(ExpectedConditions.visibilityOfElementLocated(elementToWait));
    }

    protected void waitFor60ProductAppear(By elementToWait){
        getWait().until(ExpectedConditions.numberOfElementsToBeMoreThan(elementToWait, 59));
    }
}
