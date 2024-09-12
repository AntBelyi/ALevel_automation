package hw_at_3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Test4 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/");

        String wordToFind = "Ноутбуки";
        WebElement searchField = driver.findElement(By.cssSelector("[name='search']"));
        searchField.sendKeys(wordToFind, Keys.ENTER);

        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[class='goods-tile ng-star-inserted']"), 60));

        WebElement sortingGoodsButton = driver.findElement(By.cssSelector("[class='select-css ng-untouched ng-pristine ng-valid ng-star-inserted']"));
        sortingGoodsButton.click();

        WebElement sortByAscendingPrice = driver.findElement(By.cssSelector("[value='1: cheap']"));
        sortByAscendingPrice.click();

        wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.cssSelector("[class='goods-tile ng-star-inserted']"))));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[value='1: cheap']")));

        List<WebElement> productPricesElements = driver.findElements(By.cssSelector("[class='goods-tile__price-value']"));

        List<Integer> productPrices = new ArrayList<>();

        for (WebElement priceElement : productPricesElements) {
            String priceText = priceElement.getText().replaceAll("[^\\d]", "");
            int price = Integer.parseInt(priceText);
            productPrices.add(price);
       }

        for (int i = 0; i < productPrices.size() - 1; i++) {
            assert productPrices.get(i) <= productPrices.get(i + 1) : "Prices are not sorted in ascending order";
        }

        driver.quit();
    }
}