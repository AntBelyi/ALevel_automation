package hw_aqa_4;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Task1 {
    public static void main(String[] args) {
        open("https://rozetka.com.ua");

        SelenideElement accountButton = $("[href='#icon-user-simple']");
        accountButton.click();

        SelenideElement appleButton = $("[title='Apple']");
        appleButton.shouldBe(Condition.visible).click();

        Assert.assertTrue(appleButton.isDisplayed());
    }
}


