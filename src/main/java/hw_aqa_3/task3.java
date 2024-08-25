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

public class task3 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/ua/");

        WebElement searchField = driver.findElement(By.name("search"));
        searchField.sendKeys("смартфон", Keys.ENTER);

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[title='До наступної сторінки']")));

        WebElement nextPageButton = driver.findElement(By.cssSelector("[title='До наступної сторінки']"));
        nextPageButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='goods-tile__inner']")));

        WebElement newProducts = driver.findElement(By.cssSelector("[class='goods-tile__inner']"));

        Assert.assertTrue(newProducts.isDisplayed());

        driver.quit();

    }
}
