package page_objects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private static final By SEARCH_FIELD_ELEMENT = By.cssSelector("[type='text']");
    private static final By SEARCH_BUTTON_ELEMENT = By.cssSelector("[title='Поиск']");

    @Step("User types <{0}> text into search field")
    public void typeTextIntoSearchField(String textToFind) {
        driver.findElement(SEARCH_FIELD_ELEMENT).sendKeys(textToFind);
    }

    @Step("User clicks on search button")
    public void clickOnSearchButton() {
        driver.findElement(SEARCH_BUTTON_ELEMENT).click();
    }

}
