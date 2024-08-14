package hw_17;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Test3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://makeup.com.ua/ua/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        WebElement makeupClubButton = driver.findElement(By.cssSelector("a.header-top-list__link.bc-about-link"));
        makeupClubButton.click();

        WebElement videoButton = driver.findElement(By.cssSelector("a.bc-1y2bmtx-item"));
        videoButton.click();
        Assert.assertTrue(videoButton.isDisplayed());

        driver.quit();
    }
}