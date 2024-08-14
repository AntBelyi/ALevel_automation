package hw_17;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;
import org.junit.Assert;
import java.util.function.Function;

public class Test2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://makeup.com.ua/ua/");

        Wait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofMillis(500));

        WebElement promotionsButton = driver.findElement(By.cssSelector("a[href='/ua/actions/']"));
        promotionsButton.click();

        WebElement promotionsHeader = fluentWait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1.page-header")));
        Assert.assertTrue("Promotions header should be displayed", promotionsHeader.isDisplayed());

        driver.quit();
    }
}