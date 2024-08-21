package hw_at_18_rozetka_page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver){
        super(driver);
    }

    private static final By SEARCH_INPUT = By.cssSelector("input[class*='search-form__input']");
    private static final By SEARCH_BUTTON = By.cssSelector("button[class*='search-form__submit']");
    private static final By TRACK_PACKAGE = By.cssSelector("a[href*='tracking/']");
    private static final By HELP_CENTER = By.cssSelector(".main-links__help[href*='help.rozetka.com']");
    private static final By CART = By.cssSelector(".header-actions .header-cart__button");

    public void typeSearchInput(String textToFind){
        waitForElement(SEARCH_INPUT);
        getDriver().findElement(SEARCH_INPUT).sendKeys(textToFind);
    }

    public void clickSearchButton(){
        getDriver().findElement(SEARCH_BUTTON).click();
    }

    public void clickPackageTrackLink(){
        waitForElement(TRACK_PACKAGE);
        getDriver().findElement(TRACK_PACKAGE).click();
    }

    public void clickHelpCenterLink(){
        waitForElement(HELP_CENTER);
        getDriver().findElement(HELP_CENTER).click();
    }

    public void clickCartIcon(){
        waitForElement(CART);
        getDriver().findElement(CART).click();
    }

}
