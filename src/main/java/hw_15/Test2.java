package hw_15;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test2 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        final String HELP_PAGE_TEXT = "Найактуальніше";

        driver.get("https://rozetka.com.ua");

        WebElement helpLink = driver.findElement(By.cssSelector(".main-links__help[href*='help.rozetka.com']"));
        helpLink.click();

        WebElement titleText = driver.findElement(By.cssSelector(".info-title"));

        System.out.println(titleText.getText());
        Assert.isTrue(titleText.getText().contains(HELP_PAGE_TEXT), "Help title text is not found");
        System.out.println("Test2 is successful");

        driver.quit();

    }
}
