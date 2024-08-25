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

public class task4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/ua/");

        WebElement trackTheParcel = driver.findElement(By.cssSelector("rz-menu-tracking"));
        trackTheParcel.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#searchText")));

        WebElement inputField = driver.findElement(By.cssSelector("#searchText"));
        inputField.sendKeys("12455784", Keys.ENTER);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='not-found-delivery ng-star-inserted']")));

        WebElement resultTextElement = driver.findElement(By.cssSelector("[class='not-found-delivery ng-star-inserted']"));

        String resultText = resultTextElement.getText();

        Assert.assertFalse(resultText.contains("resultTextElement"));

        driver.quit();

    }
}
