package OLX;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class Test1 {
    public static void main(String[] args) {

        String searchProductText = "порцеляна";

        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

            driver.get("https://www.olx.ua");

            WebElement searchInput = driver.findElement(By.id("search"));
            searchInput.sendKeys(searchProductText, Keys.ENTER);

            WebElement searchResultText = driver.findElement(By.cssSelector("[data-testid='total-count']"));
            System.out.println(searchResultText.getText());

            List<WebElement> searchResult = driver.findElements(By.cssSelector("[class='css-1wxaaza']"));

            for (WebElement element: searchResult)
            {
                System.out.println("---------------");
                System.out.println(element.getText());
                System.out.println(element.getText().toLowerCase().contains(searchProductText));
            }

            System.out.println("Count of products: " + searchResult.size());

        } finally {
            driver.quit();
        }
    }
}
