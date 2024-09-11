package hw_a3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

import java.time.Duration;

public class Test4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://makeup.com.ua/ua/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement hairButton = driver.findElement(By.cssSelector("a.menu-list__link[href='/ua/categorys/20272/']"));
        hairButton.click();

        WebElement hairSection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1.page-header_category ")));

        Assert.assertTrue("Title should be displayed", hairSection.getText().contains("Косметика для волосся"));

        driver.quit();
    }
}