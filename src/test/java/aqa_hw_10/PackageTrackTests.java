package aqa_hw_10;

import aqa_hw_18.HomePage;
import aqa_hw_18.PackageTrackPage;
import aqa_hw_18.data_provider.RozetkaDP;
import org.testng.Assert;
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

        Assert.assertEquals(String.format(SEARCH_ERROR_MESSAGE, packageNumber), packageTrackPage.getValidationMessage());
    }
}
