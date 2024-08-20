package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    private static final By SEARCH_INPUT = By.cssSelector("input[class*='search-form__input']");
    private static final By SEARCH_BUTTON = By.cssSelector("button[class*='search-form__submit']");

    public void typeSearchInput(String textToFind){
        driver.findElement(SEARCH_INPUT).sendKeys(textToFind);
    }

    public void clickSearchButton(){
        driver.findElement(SEARCH_BUTTON).click();
    }
}
