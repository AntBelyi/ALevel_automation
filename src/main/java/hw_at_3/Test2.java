package hw_at_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;

import java.time.Duration;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .pollingEvery(Duration.ofMillis(1000))
                .withMessage("Element was not found")
                .withTimeout(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/");

        WebElement changeLanguageButton = driver.findElement(By.cssSelector("[class='button button--link sub-lg lang__button']"));
        changeLanguageButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='lang__menu ng-star-inserted']")));

        WebElement changeRuLanguageButton = driver.findElement(By.xpath("//button[contains(text(), 'RU')]"));;
        changeRuLanguageButton.click();

        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("[class='button button--link sub-lg lang__button']"), "RU"));

        WebElement updatedLanguageButton = driver.findElement(By.cssSelector("[class='button button--link sub-lg lang__button']"));

        Assert.assertTrue(updatedLanguageButton.getText().toLowerCase().contains("ru"), "RU language is NOT selected.");

        driver.quit();

}
}