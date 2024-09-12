package aqa_hw_10;

import aqa_hw_18.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelpCenterPage extends BasePage {

    public HelpCenterPage(WebDriver driver) {
        super(driver);
    }

    private static final By INFO_TITLE = By.cssSelector(".info-title");

    public String getSearchResultPageTitle() {
        waitForElement(INFO_TITLE);
        return getDriver().findElement(INFO_TITLE).getText();
    }
}
