package OLX;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Test2 {
    public static void main(String[] args) {

        String searchProductText = "nnnnnnn";

        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

            driver.get("https://www.olx.ua");

            WebElement searchInput = driver.findElement(By.id("search"));
            searchInput.sendKeys(searchProductText, Keys.ENTER);

            WebElement searchResultText = driver.findElement(By.cssSelector("[data-testid='total-count']"));

            System.out.println(searchResultText.getText().contains(" 0 "));

        } finally {
            driver.quit();
        }
    }

}
