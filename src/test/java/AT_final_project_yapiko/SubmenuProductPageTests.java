package AT_final_project_yapiko;

import AT_final_project_yapiko.listeners.MyCustomListener;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.Set;

@Listeners(MyCustomListener.class)
public class SubmenuProductPageTests extends BaseTest {
    @Test
    @Description("Verify that the user can enter the menu, submenu and all products in the submenu contain the name of the submenu in the title.")
    @Feature("Submenu Product Page")
    public void verifySubmenuProductPageOpenedCorrectly() {
        HomePage homePage = new HomePage();
        SubmenuProductPage submenuProductPage = new SubmenuProductPage();

        String submenuButtonText = homePage.goToSubmenu(0);

        String submenuPageTitleText = submenuProductPage.getSubmenuPageTitle();
        Assert.assertTrue(submenuPageTitleText.contains(submenuButtonText), "The text does not contain the word " + submenuButtonText);

        Set<String> productNames = submenuProductPage.collectAllProductNames();
        for (String productName : productNames) {
            Assert.assertTrue(productName.contains(submenuButtonText), "The product name does not contain the word " + submenuButtonText);
        }
    }
}
