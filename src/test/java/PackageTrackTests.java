import PageObjects.HomePage;
import PageObjects.PackageTrackPage;
import junit.framework.Assert;
import org.testng.annotations.Test;

public class PackageTrackTests extends BaseTest
{
    @Test
    public void verifyInputWrongPackageNumber() {

        final String SEARCH_ERROR_MESSAGE = "За номером %s посилку не знайдено. Можливо, вона ще не передана для відправлення або номер некоректний.";
        String packageNumber = "nnnnnnn";

        HomePage homePage = new HomePage(getDriver());
        homePage.clickPackageTrackLink();

        PackageTrackPage packageTrackPage = new PackageTrackPage(getDriver());

        packageTrackPage.typePackageNumberInput(packageNumber);
        packageTrackPage.clickPackageTrackButton();

        Assert.assertTrue(packageTrackPage.getValidationMessage().equals(String.format(SEARCH_ERROR_MESSAGE, packageNumber)));
    }
}
