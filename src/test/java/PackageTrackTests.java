import data_provider.RozetkaDP;
import hw_at_18_rozetka_page_objects.HomePage;
import hw_at_18_rozetka_page_objects.PackageTrackPage;
import junit.framework.Assert;
import org.testng.annotations.Test;

public class PackageTrackTests extends BaseTest
{
    @Test(dataProvider = "getPackageTrack", dataProviderClass = RozetkaDP.class)
    public void verifyInputWrongPackageNumber(String packageNumber) {

        final String SEARCH_ERROR_MESSAGE = "За номером %s посилку не знайдено. Можливо, вона ще не передана для відправлення або номер некоректний.";

        HomePage homePage = new HomePage(getDriver());
        homePage.clickPackageTrackLink();

        PackageTrackPage packageTrackPage = new PackageTrackPage(getDriver());

        packageTrackPage.typePackageNumberInput(packageNumber);
        packageTrackPage.clickPackageTrackButton();

        Assert.assertTrue(packageTrackPage.getValidationMessage().equals(String.format(SEARCH_ERROR_MESSAGE, packageNumber)));
    }
}
