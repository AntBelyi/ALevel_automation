package hw_A4;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selenide.*;

public class Test4 {
    public static void main(String[] args) {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";

        open("https://makeup.com.ua/ua/");

        $("a.menu-list__link[href='/ua/categorys/20272/']").click();

        $("h1.page-header_category").shouldBe(Condition.visible)
                .shouldHave(Condition.text("Косметика для волосся"));

        closeWebDriver();
    }
}