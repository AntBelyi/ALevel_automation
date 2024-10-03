package AT_final_project_yapiko;

import AT_final_project_yapiko.listeners.MyCustomListener;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyCustomListener.class)
public class HomePageTests extends BaseTest {
    @Test
    @Description("Verify that the call back form is opened when user click on call back button and closed when user click on close pop up button.")
    @Feature("Home Page")
    public void verifyCallBackFormCanBeOpenedAndClosed() {

        HomePage homePage = new HomePage();
        homePage.clickOnCallBackFormButton();
        homePage.waitCallBackFormPopUpVisible();

        Assert.assertTrue(homePage.checkCallBackFormPopUpTitle(), "The title call back is NOT visible in the pop-up.");

        homePage.clickOnCallBackFormCloseButton();
    }

    @Test
    @Description("Negative Test: Verify that the empty Call back Form is not send and the error message is displayed.")
    @Feature("Home Page")
    public void verifyEmptyCallBackFormCanNotBeSend() {
        HomePage homePage = new HomePage();

        homePage.clickOnCallBackFormButton();
        homePage.waitCallBackFormPopUpVisible();

        homePage.clickOnFieldNameCallBackForm();
        homePage.clickOnCallbackFormSubmitButton();

        Assert.assertTrue(homePage.checkCallbackFormSubmitError(), "The submit error message is not visible.");

        homePage.clickOnCallBackFormCloseButton();
    }

    @Test
    @Description("Verify that the user can switch the language.")
    @Feature("Home Page")
    public void verifyLanguageCanBeChanged() {
        String languageToChange = "en";
        HomePage homePage = new HomePage();

        homePage.clickOnSwitcherLanguageButton();

        homePage.openChangeLanguagePopUp();
        homePage.switchLanguage();

        SelenideElement updatedSwitcherLanguageButton = homePage.getUpdatedSwitcherLanguageButton();
        String actualLanguageText = updatedSwitcherLanguageButton.getText().toLowerCase();

        Assert.assertTrue(actualLanguageText.contains(languageToChange),"The language " + languageToChange + " is NOT selected.");
    }

    @Test
    @Description("Verify that the user can select the city.")
    @Feature("Home Page")
    public void verifyCityCanBeSwitched() {
        String cityToChoose = "Полтава";
        HomePage homePage = new HomePage();

        homePage.clickOnSwitcherCityButton();

        homePage.waitForCityPopUp();

        homePage.selectCity(cityToChoose);

        Assert.assertTrue(homePage.isCitySelected(cityToChoose), "City " + cityToChoose + " is NOT selected.");
    }

    @Test
    @Description("Verify that the complain pop up is opened when user click on the complain button and closed after click on the pop up complain button close.")
    @Feature("Home Page")
    public void verifyComplainPopUpCanBeOpenedAndClosed() {
        String popUpComplainTitle = "поскаржитись";
        HomePage homePage = new HomePage();

        homePage.clickOnComplainButton();

        Assert.assertTrue(homePage.isComplainPopUpTitleCorrect(popUpComplainTitle), "The title " + popUpComplainTitle + " is NOT visible.");

        homePage.closeComplainPopUp();

        Assert.assertFalse(homePage.isComplainPopUpVisible(), "The modal pop-up complain is still displayed.");
    }

    @Test
    @Description("Verify that the account pop up is opened when user click on the account button and closed after click on the pop up close button.")
    @Feature("Home Page")
    public void verifyAccountPopUpCanBeOpenedAndClosed() {
        String titleText = "авторизація";
        HomePage homePage = new HomePage();

        homePage.clickOnAccountButton();

        Assert.assertTrue(homePage.isAccountPopUpTitleCorrect(titleText), "The title " + titleText + " is NOT displayed.");

        homePage.closeAccountPopUp();

        Assert.assertFalse(homePage.isAccountPopUpVisible(), "The modal account pop-up is still displayed.");
    }

    @Test
    @Description("Negative Test: Verify that the user cannot register if not all fields of the registration form are filled out and user see the mistake message.")
    @Feature("Home Page")
    public void verifyRegistrationFormCanBeFilledOut() {
        String numberToEnter = "999998888";
        String mistakeText = "something went wrong with recaptcha";
        HomePage homePage = new HomePage();

        homePage.clickOnAccountButtonAndOpenPopup();

        homePage.enterTelephoneNumber(numberToEnter);

        homePage.submitRegistrationForm();

        Assert.assertTrue(homePage.isCaptchaErrorMessageDisplayed(mistakeText), "Captcha error message is NOT displayed.");
    }

}
