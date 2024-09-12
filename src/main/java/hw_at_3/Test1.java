package hw_at_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Test1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/");

        WebElement bucketButton = driver.findElement(By.cssSelector("[class='header-cart__button']"));
        bucketButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='cart-dummy__illustration']")));

        WebElement cartIcon = driver.findElement(By.cssSelector("[class='cart-dummy__illustration']"));

        Assert.assertTrue(cartIcon.isDisplayed(), "The picture with the basket is NOT visible in the pop-up.");

        WebElement closeBucketPopUpButton = driver.findElement(By.cssSelector("[class='btn button button--link']"));
        closeBucketPopUpButton.click();

        driver.quit();
    }
}
