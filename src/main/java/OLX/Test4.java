package OLX;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Test4 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            driver.get("https://www.olx.ua");

            String whiteColor = "rgba(255, 255, 255, 1)";

            WebElement rusLanguageItem = driver.findElement(By.linkText("Рус"));
            rusLanguageItem.click();

            WebElement ukrLanguageItem = driver.findElement(By.linkText("Укр"));
            String itemColor = ukrLanguageItem.getCssValue("color");

            System.out.println("Color of the item: " + itemColor);
            System.out.println(itemColor.contains(whiteColor));

        } finally {
            driver.quit();
        }
    }
}