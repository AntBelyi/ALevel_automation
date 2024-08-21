import hw_at_18_rozetka_page_objects.CartPage;
import hw_at_18_rozetka_page_objects.HelpCenterPage;
import hw_at_18_rozetka_page_objects.HomePage;
import junit.framework.Assert;
import org.testng.annotations.Test;

public class CartTests extends BaseTest {

    @Test
    public void verifyEmptyCart() {

        final String EMPTY_CART_TEXT = "Кошик порожній";

        HomePage homePage = new HomePage(getDriver());

        homePage.clickCartIcon();

        CartPage cartPage = new CartPage(getDriver());

        Assert.assertTrue(cartPage.getPageTitle().contains(EMPTY_CART_TEXT) && cartPage.imageIsPresent());

    }



}
