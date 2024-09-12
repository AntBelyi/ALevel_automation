package hw_A4;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Test1 {
    public static void main(String[] args) {
        Configuration.browser = "chrome";
        open("https://makeup.com.ua/ua/");
        getWebDriver().manage().window().maximize();

        $("div.search-button").shouldBe(Condition.visible).click();

        $("#search-input").shouldBe(Condition.visible).setValue("lipstick");

        $("button.search-button").shouldBe(Condition.visible).click();

        $("a[href='/ua/search/?q=lipstick']").shouldBe(Condition.visible);

        closeWebDriver();
    }
}