package hw_aqa_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Task1 {
    public static void main(String[] args)  {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua");

        WebElement accountButton = driver.findElement(By.cssSelector("[href='#icon-user-simple']"));
        accountButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[title='Apple']")));

        WebElement appleButton = driver.findElement(By.cssSelector("[title='Apple']"));
        appleButton.click();

        Assert.assertTrue(appleButton.isDisplayed());

        driver.quit();
    }
}
