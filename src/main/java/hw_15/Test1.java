package hw_15;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        final String SEARCH_ERROR_MESSAGE = "Невірний формат номеру посилки. Перевірте вказані символи, а також довжину номеру, яка має бути не більше 13 символів.";

        driver.get("https://rozetka.com.ua");

        WebElement trackPackageLink = driver.findElement(By.cssSelector("a[href*='tracking/']"));
        trackPackageLink.click();

        WebElement trackPackageInput = driver.findElement(By.id("searchText"));
        WebElement trackPackageButton = driver.findElement(By.cssSelector("button[class='button button--medium button--green']"));

        trackPackageInput.sendKeys("20450938174406");
        trackPackageButton.click();

        WebElement errorValidationMessage = driver.findElement(By.cssSelector("[class*='validation-message']"));

        Assert.isTrue(errorValidationMessage.getText().equals(SEARCH_ERROR_MESSAGE), "The 'Wrong format package tracking number' is not displayed");
        System.out.println("Test1 is successful");

        driver.quit();

    }
}
