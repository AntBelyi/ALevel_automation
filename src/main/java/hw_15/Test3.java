package hw_15;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test3 {
    public static void main(String[] args) {

        WebDriver driver = null;

        final String EMPTY_CART_TEXT = "Кошик порожній";

        try {
            driver = new ChromeDriver();
            WebDriverWait waiter = new WebDriverWait(driver, Duration.ofMillis(3000));
            driver.get("https://rozetka.com.ua");

            WebElement cartItem = driver.findElement(By.cssSelector(".header-actions .header-cart__button"));

            cartItem.click();

            WebElement elementEmptyCart = waiter.until(
                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".cart-dummy__heading"))
            );

            WebElement cartImage = driver.findElement(By.cssSelector("img[class=cart-dummy__illustration]"));

            Boolean checkTest = ((cartImage != null) && cartImage.isDisplayed());

            Assert.isTrue(elementEmptyCart.getText().contains(EMPTY_CART_TEXT) && checkTest, "The cart is broken");
            System.out.println("Test3 is successful");
            
        }
        finally {
            if (driver != null)
                driver.quit();
        }
    }
}
