package hw_aqa_3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class task2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/ua/");

        WebElement searchField = driver.findElement(By.name("search"));
        searchField.sendKeys("смартфон", Keys.ENTER);

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='goods-tile__title']")));

        WebElement firstPhone = driver.findElement(By.cssSelector("[class='goods-tile__title']"));
        firstPhone.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class*='_buy ng-star-inserted']")));

        WebElement buyButton = driver.findElement(By.cssSelector("[class*='_buy ng-star-inserted']"));
        buyButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='cart-product__body']")));

        WebElement busketItem = driver.findElement(By.cssSelector("[class='cart-product__body']"));

        Assert.assertTrue(busketItem.isDisplayed());

        driver.quit();
    }

}
