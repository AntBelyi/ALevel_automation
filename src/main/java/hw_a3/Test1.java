package hw_a3;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Test1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://makeup.com.ua/ua/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.search-button")));
        searchButton.click();

        WebElement searchField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#search-input")));
        searchField.sendKeys("lipstick");

        WebElement searchActivateButton = driver.findElement(By.cssSelector("button.search-button"));
        searchActivateButton.click();

        WebElement resultsContainer = driver.findElement(By.cssSelector("a[href='/ua/search/?q=lipstick']"));
        Assert.assertTrue("Results container should be displayed", resultsContainer.isDisplayed());

        driver.quit();
    }
}