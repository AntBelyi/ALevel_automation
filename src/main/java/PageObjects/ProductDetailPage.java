package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class ProductDetailPage {

    private WebDriver driver;
    WebDriverWait wait;

    public ProductDetailPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private static final By WAIT_IMAGE = By.cssSelector("img.picture-container__picture");
    private static final By PRODUCT_NAME = By.cssSelector("h1.ng-star-inserted");

    public String GetPageTitle(){

        waitForElement(WAIT_IMAGE);
        return driver.findElement(PRODUCT_NAME).getText();
    }

    public void waitForElement(By elementToWait){
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementToWait));
    }
}