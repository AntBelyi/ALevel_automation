package hw_15;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

            final String ERROR_MESSAHE = "Невірний формат номеру посилки. Перевірте вказані символи, а також довжину номеру, яка має бути не більше 13 символів.";

            driver.get("https://rozetka.com.ua");

            WebElement trackPackageLink = driver.findElement(By.cssSelector("a[href*='tracking/']"));
            trackPackageLink.click();

            WebElement trackPackageInput = driver.findElement(By.id("searchText"));
            WebElement trackPackageButton = driver.findElement(By.cssSelector("button[class='button button--medium button--green']"));
            String errorMessage = "";

            if (trackPackageInput != null && trackPackageButton != null && trackPackageInput.isDisplayed()) {

                trackPackageInput.sendKeys("20450938174406");
                trackPackageButton.click();

                WebElement errorMessagePar = driver.findElement(By.cssSelector("[class*='validation-message']"));

                if (errorMessagePar != null) {
                    errorMessage = errorMessagePar.getText();
                }
            }

            Assert.isTrue(errorMessage.equals(ERROR_MESSAHE), "The 'Wrong format package tracking number' is not displayed", null);
            System.out.println("Test1 is successful");

        } finally {
            driver.quit();
        }
    }
}
