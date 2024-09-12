package hw_at_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static junit.framework.Assert.assertTrue;

public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/");

        WebElement headerMenuButton = driver.findElement(By.cssSelector("[class='header-menu']"));
        headerMenuButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='side-menu__close']")));

        WebElement sideMenuPopUpCloseButton = driver.findElement(By.cssSelector("[class='side-menu__close']"));
        sideMenuPopUpCloseButton.click();

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("[data-testid='drawer']")));

         assertTrue(headerMenuButton.isDisplayed());

        driver.quit();
    }
}
