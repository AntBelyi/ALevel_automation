package search_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    private WebDriver driver;

    @BeforeMethod
    public void driverInitialization() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotline.ua/");
    }

    @AfterMethod
    public void driverClose() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

}
