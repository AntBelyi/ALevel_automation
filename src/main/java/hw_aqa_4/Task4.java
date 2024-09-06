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

public class Task4 {
    public static void main(String[] args) {
        String stringToFind = "Посилка прибула на відділення";
        open("https://rozetka.com.ua/ua/");

        SelenideElement trackTheParcel = $("rz-menu-tracking");
        trackTheParcel.click();

        SelenideElement inputField = $("#searchText");
        inputField.shouldBe(Condition.visible).setValue("12455784").pressEnter();

        SelenideElement resultTextElement = $("[class='not-found-delivery ng-star-inserted']");
        resultTextElement.shouldBe(Condition.visible);

        String resultText = resultTextElement.getText();

        Assert.assertFalse(resultText.contains(stringToFind), "За номером 12455784 посилку не знайдено");
    }
}
