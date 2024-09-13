package aqa_hw_10;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class HomePage{

    private static final String HELP_CENTER = ".main-links__help[href*='help.rozetka.com']";
    private static final String CART = ".header-actions .header-cart__button";
    private static final String TRACK_PACKAGE = "a[href*='tracking/']";

    public void openHomePage(){
        Selenide.open("https://rozetka.com.ua/");
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    public void clickHelpCenterLink() {
        $(HELP_CENTER).shouldBe(visible).click();
    }

    public void clickCartIcon() {
        $(CART).shouldBe(visible).click();
    }

    public void clickPackageTrackLink() {
        $(TRACK_PACKAGE).shouldBe(visible).click();
    }
}
