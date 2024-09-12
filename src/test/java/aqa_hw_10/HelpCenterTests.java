package aqa_hw_10;

import aqa_hw_18.HelpCenterPage;
import aqa_hw_18.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HelpCenterTests extends BaseTest {

    @Test
    public void verifyHelpCenterTitle() {

        final String HELP_PAGE_TEXT = "Найактуальніше";

        HomePage homePage = new HomePage(getDriver());

        homePage.clickHelpCenterLink();

        HelpCenterPage helpCenterPage = new HelpCenterPage(getDriver());

        Assert.assertEquals(HELP_PAGE_TEXT, helpCenterPage.getSearchResultPageTitle());
    }
}
