package hw_A4;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selenide.*;

public class Test3 {
    public static void main(String[] args) {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";

        open("https://makeup.com.ua/ua/");

        $("a.header-top-list__link.bc-about-link").click();

        $("a.bc-1y2bmtx-item").click();

        $("a.bc-1y2bmtx-item").shouldBe(Condition.visible);

        closeWebDriver();
    }
}