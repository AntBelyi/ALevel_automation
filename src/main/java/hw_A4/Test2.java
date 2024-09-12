package hw_A4;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selenide.*;

public class Test2 {
    public static void main(String[] args) {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        open("https://makeup.com.ua/ua/");

        $("a[href='/ua/actions/']").click();

        $("h1.page-header").shouldBe(Condition.visible);

        closeWebDriver();
    }
}