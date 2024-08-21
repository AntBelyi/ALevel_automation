package hw_at_18_rozetka_page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelpCenterPage extends BasePage{

    public HelpCenterPage (WebDriver driver){super(driver);}

    private static final By INFO_TITLE = By.cssSelector(".info-title");

    public String getSearchResultPageTitle(){
        waitForElement(INFO_TITLE);
        return getDriver().findElement(INFO_TITLE).getText();
    }
}
