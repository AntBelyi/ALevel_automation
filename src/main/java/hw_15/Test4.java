package hw_15;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test4 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        WebDriverWait waiter = new WebDriverWait(driver, Duration.ofMillis(3000));
        driver.get("https://rozetka.com.ua");

        WebElement searchInput = driver.findElement(By.xpath("//input[contains(@class, 'search-form__input')]"));

        searchInput.sendKeys("4820227283217", Keys.ENTER);

        WebElement elementProduct = waiter.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='product-button__buy-group']")));
        elementProduct.click();

        WebElement elementCartPlus = waiter.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-testid='cart-counter-increment-button']")));
        elementCartPlus.click();

        String valueCount = driver.findElement(By.cssSelector("[data-testid='cart-counter-input']")).getAttribute("value");

        System.out.println("Value: " + valueCount);

        Assert.isTrue(valueCount.contains("2"), "Count of products is not correct");

        System.out.println("Test4 is successful");
        driver.quit();

    }
}
