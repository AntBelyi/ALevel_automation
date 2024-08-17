package OLX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static java.lang.Thread.sleep;

public class Test3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            final Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5)).withMessage("Element was not found");
            ;

            driver.get("https://www.olx.ua");

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='css-cbwxzx']")));

            WebElement gardenItem = driver.findElement(By.cssSelector("[class='css-cbwxzx']"));
            gardenItem.click();

            WebElement gardenSubItem = driver.findElement(By.cssSelector("[href*='posuda-kuhonnaya-utvar']"));
            gardenSubItem.click();

            Thread.sleep(5000);

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='css-1wxaaza']")));
            WebElement searchResultText = driver.findElement(By.cssSelector("[data-testid='total-count']"));
            System.out.println(searchResultText.getText());

            List<WebElement> searchResult = driver.findElements(By.cssSelector("[class='css-1wxaaza']"));

            for (WebElement element: searchResult)
            {
                System.out.println("---------------");
                System.out.println(element.getText());
            }

            System.out.println("Count of products: " + searchResult.size());

        } finally {
            driver.quit();
        }
    }
}
