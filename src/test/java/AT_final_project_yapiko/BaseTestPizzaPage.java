package AT_final_project_yapiko;

import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.*;

public class BaseTestPizzaPage {
    @BeforeMethod
    public void initializeDriver() {
        open("https://yapiko.com.ua/ua/harkiv/pizza-italiani/");
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @AfterMethod
    public void clearCartAndCookies() {
        clearBrowserCookies();
        clearBrowserLocalStorage();
    }

}
