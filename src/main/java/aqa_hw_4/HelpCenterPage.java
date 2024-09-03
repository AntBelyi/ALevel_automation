package aqa_hw_4;

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
