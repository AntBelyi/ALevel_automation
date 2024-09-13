package aqa_hw_10;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class HelpCenterPage {

    private static final String INFO_TITLE = ".info-title";

    public boolean isOnHelpCenterPage() {
        return $(INFO_TITLE).isDisplayed();
    }

    public String getPageTitle() {
        return $(INFO_TITLE).getText();
    }
}
