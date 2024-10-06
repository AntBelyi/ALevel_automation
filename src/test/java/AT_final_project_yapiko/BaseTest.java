package AT_final_project_yapiko;

import AT_final_project_yapiko.listeners.MyCustomListener;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import static com.codeborne.selenide.Selenide.open;

import static com.codeborne.selenide.Selenide.*;

import org.testng.annotations.Listeners;

@Listeners(MyCustomListener.class)
public class BaseTest {

    @BeforeMethod
    public void initializeDriver() {
        open("https://yapiko.com.ua/");
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @AfterMethod
    public void clearCartAndCookies() {
        clearBrowserCookies();
        clearBrowserLocalStorage();
    }

}