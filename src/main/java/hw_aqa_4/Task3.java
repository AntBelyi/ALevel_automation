package hw_aqa_4;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Task3 {
    public static void main(String[] args) {
        open("https://rozetka.com.ua/ua/");

        SelenideElement searchField = $("[name = 'search']");
        searchField.shouldBe(Condition.clickable).setValue("смартфон").pressEnter();

        SelenideElement nextPageButton = $("[title='До наступної сторінки']");
        nextPageButton.shouldBe(Condition.visible).click();

        SelenideElement newProducts = $("[class='goods-tile__inner']");
        newProducts.shouldBe(Condition.visible);


        Assert.assertTrue(newProducts.isDisplayed());

    }
}
