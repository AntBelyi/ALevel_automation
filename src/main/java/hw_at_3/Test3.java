package hw_at_3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .pollingEvery(Duration.ofMillis(1000))
                .withMessage("Element was not found")
                .withTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/");

        String wordToFind = "миша";
        WebElement searchField = driver.findElement(By.cssSelector("[name='search']"));
        searchField.sendKeys(wordToFind, Keys.ENTER);

        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[class='goods-tile ng-star-inserted']"), 60));

        List<WebElement> productsTitles = driver.findElements(By.cssSelector("[class='goods-tile ng-star-inserted']"));

        WebElement firstProduct = productsTitles.get(0);
        WebElement firstProductCompareButton = firstProduct.findElement(By.cssSelector("[class='compare-button']"));
        firstProductCompareButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='compare-button']")));

        WebElement fifthProduct = productsTitles.get(3);
        WebElement fifthProductCompareButton = fifthProduct.findElement(By.cssSelector("[class='compare-button']"));
        fifthProductCompareButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='header-actions__component icon-badge-color-gray']")));
        WebElement compareButton = driver.findElement(By.cssSelector("[class='header-actions__component icon-badge-color-gray']"));
        compareButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='h1 mb-4']")));
        WebElement comparePageTitle = driver.findElement(By.cssSelector("[class='h1 mb-4']"));

        String expectedText = "порівнянь";

        Assert.assertTrue(comparePageTitle.getText().toLowerCase().contains("порівнянь"), "The text does not contain worlds " + expectedText);


        driver.quit();
    }
}