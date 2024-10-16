package AT_final_project_yapiko;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class HomePage {

    private static final String CALL_BACK_FORM_BUTTON = "[class='icon icon-phone']";
    private static final String CALL_BACK_FORM_POP_UP = "[class='modals-wrapper']";
    private static final String CALL_BACK_POP_UP_TITLE = "[id='modal-title-20']";
    private static final String CALL_BACK_POP_UP_CLOSE_BUTTON = "[data-role='closeBtn']";
    private static final String INPUT_NAME_FIELD_CALL_BACK_FORM = "[id='contact-call-back_name']";
    private static final String CALL_BACK_FORM_SUBMIT_BUTTON = "//button[contains(text(), 'Надіслати')]";
    private static final String CALL_BACK_FORM_SUBMIT_ERROR = "[id='contact-call-back_name-error']";
    private static final String SWITCHER_LANGUAGE_BUTTON = "[id='switcher-language-trigger']";
    private static final String CHANGE_LANGUAGE_POPUP = "[class='switcher-content header-dropdown-wrapper']";
    private static final String LANGUAGE_SWITCHER = "[class='view-en switcher-option']";
    private static final String UPDATED_SWITCHER_LANGUAGE_BUTTON = "[id='switcher-language-trigger']";
    private static final String SWITCHER_CITY_BUTTON = "[class='current-city']";
    private static final String CHANGE_CITY_POPUP = "[class='region-select-another-wrapper select-region-show']";
    private static final String CITY_ITEMS = "[class='select-another-city-items']";
    private static final String UPDATED_CITY_BUTTON = "[class='current-city']";
    private static final String COMPLAIN_BUTTON = "[class='complain-button']";
    private static final String MODAL_POPUP_COMPLAIN = "[class='modal-inner-wrap']";
    private static final String MODAL_POPUP_COMPLAIN_TITLE = "[id='modal-title-22']";
    private static final String MODAL_POPUP_CLOSE_BUTTON = ".modal-header .action-close";
    private static final String ACCOUNT_BUTTON = "[class='link authorization-link']";
    private static final String ACCOUNT_POPUP = "[class='modal-inner-wrap']";
    private static final String ACCOUNT_POPUP_TITLE = "[class='block-title']";
    private static final String ACCOUNT_POPUP_CLOSE_BUTTON = "[class='action-close']";
    private static final String INPUT_TELEPHONE_FIELD = "[id='telephone']";
    private static final String SUBMIT_BUTTON = "[id='send2']";
    private static final String CAPTCHA_ERROR_MESSAGE = "[class='modal-content']";
    private static final String SEARCH_BUTTON = "[class='form-toggle']";
    private static final String SEARCH_FIELD = "[id='search']";
    private static final String ADD_TO_CART_BUTTON = "[class='action tocart icon-block']";
    private static final String MINI_CART_BLOCK = "[class='minicart-block grid-extend']";
    private static final String GO_TO_CART_BUTTON = "[id='top-cart-btn-checkout']";
    private static final String PRODUCT_BLOCK = "[class='product-image-block']";
    private static final String MENU_BUTTON = "[class='level0 nav-1 level-top parent first']";
    private static final String SUBMENU_BUTTON = "[class='advancedmenu-link level1']";


    @Step("Click on the call back form button")
    public void clickOnCallBackFormButton() {
        $(CALL_BACK_FORM_BUTTON).click();
    }

    @Step("Wait the call back form pop up will be visible")
    public void waitCallBackFormPopUpVisible() {
        $(CALL_BACK_FORM_POP_UP).shouldBe(visible, Duration.ofSeconds(5));
    }

    @Step("Checked the title of call back form pop up will be visible")
    public boolean checkCallBackFormPopUpTitle() {
        return $(CALL_BACK_POP_UP_TITLE).shouldBe(visible, Duration.ofSeconds(5)).isDisplayed();
    }

    @Step("Click on the call back pop up close button")
    public void clickOnCallBackFormCloseButton() {
        $(CALL_BACK_POP_UP_CLOSE_BUTTON).shouldBe(visible, Duration.ofSeconds(10)).click();
    }

    @Step("Click on the field input name call back form")
    public void clickOnFieldNameCallBackForm() {
        $(INPUT_NAME_FIELD_CALL_BACK_FORM).shouldBe(visible, Duration.ofSeconds(10)).click();
    }

    @Step("Click on the call back form submit button")
    public void clickOnCallbackFormSubmitButton() {
        $(By.xpath(CALL_BACK_FORM_SUBMIT_BUTTON)).shouldBe(clickable, Duration.ofSeconds(10)).click();
    }

    @Step("Check the error when call back form send empty")
    public boolean checkCallbackFormSubmitError() {
        return $(CALL_BACK_FORM_SUBMIT_ERROR).shouldBe(visible, Duration.ofSeconds(15)).isDisplayed();
    }

    @Step("Click on the switcher language button")
    public void clickOnSwitcherLanguageButton() {
        $(SWITCHER_LANGUAGE_BUTTON).click();
    }

    @Step("An element for the language change popup")
    private SelenideElement getChangeLanguagePopUp() {
        return $$(CHANGE_LANGUAGE_POPUP).find(Condition.visible);
    }

    @Step("An element for the language switch")
    private SelenideElement getLanguageSwitcher() {
        return $$(LANGUAGE_SWITCHER).find(Condition.visible);
    }

    @Step("Open the language change pop-up")
    public void openChangeLanguagePopUp() {
        SelenideElement changeLanguagePopUp = getChangeLanguagePopUp();
        changeLanguagePopUp.shouldBe(visible, Duration.ofSeconds(10));
        changeLanguagePopUp.click();
    }

    @Step("Switch the language")
    public void switchLanguage() {
        SelenideElement languageSwitcher = getLanguageSwitcher();
        languageSwitcher.shouldBe(visible, Duration.ofSeconds(10)).click();
    }

    @Step("An element for the Updated language switch")
    public SelenideElement getUpdatedSwitcherLanguageButton() {
        return $(UPDATED_SWITCHER_LANGUAGE_BUTTON).shouldBe(visible, Duration.ofSeconds(10));
    }

    @Step("Click on the switcher city button")
    public void clickOnSwitcherCityButton() {
        $(SWITCHER_CITY_BUTTON).click();
    }

    @Step("Wait for the city change pop-up to appear")
    public void waitForCityPopUp() {
        $(CHANGE_CITY_POPUP).shouldBe(visible, Duration.ofSeconds(15));
        $(CITY_ITEMS).shouldBe(visible, Duration.ofSeconds(5));
    }

    @Step("Select your city")
    public void selectCity(String cityName) {
        SelenideElement chooseYourCity = $x(String.format("//*[contains(@class, 'region-item') and .//text()[normalize-space() = '%s']]", cityName));
        chooseYourCity.shouldBe(visible, Duration.ofSeconds(5)).click();
    }

    @Step("Verify that the selected city is displayed")
    public boolean isCitySelected(String cityName) {
        SelenideElement updatedCityButton = $(UPDATED_CITY_BUTTON).shouldHave(text(cityName), Duration.ofSeconds(10));
        return updatedCityButton.getText().contains(cityName);
    }

    @Step("Click on the complain button")
    public void clickOnComplainButton() {
        SelenideElement complainButton = $$(COMPLAIN_BUTTON).find(Condition.visible);
        complainButton.shouldBe(visible, Duration.ofSeconds(5)).scrollTo();

        Actions actions = new Actions(WebDriverRunner.getWebDriver());
        for (int i = 0; i < 10; i++) {
            actions.sendKeys(Keys.PAGE_UP).perform();
            sleep(100);
            if (complainButton.isDisplayed()) {
                break;
            }
        }
        complainButton.shouldBe(visible, Duration.ofSeconds(5)).click();
    }

    @Step("Check if the complain pop-up contains the title")
    public boolean isComplainPopUpTitleCorrect(String title) {
        SelenideElement modalPopUpComplain = $$(MODAL_POPUP_COMPLAIN).get(1);
        modalPopUpComplain.shouldBe(visible);

        SelenideElement modalPopUpComplainTitle = $(MODAL_POPUP_COMPLAIN_TITLE).shouldBe(visible, Duration.ofSeconds(5));
        return modalPopUpComplainTitle.getText().toLowerCase().contains(title.toLowerCase());
    }

    @Step("Close the complain pop-up")
    public void closeComplainPopUp() {
        SelenideElement modalPopUpCloseComplainButton = $$(MODAL_POPUP_CLOSE_BUTTON).get(1);
        modalPopUpCloseComplainButton.click();
    }

    @Step("Verify that the complain pop-up is closed")
    public boolean isComplainPopUpVisible() {
        SelenideElement modalPopUpComplain = $$(MODAL_POPUP_COMPLAIN).get(1);
        modalPopUpComplain.shouldBe(Condition.hidden, Duration.ofSeconds(5));
        return modalPopUpComplain.isDisplayed();
    }

    @Step("Click on the account button")
    public void clickOnAccountButton() {
        $(ACCOUNT_BUTTON).click();
    }

    @Step("Check if the account pop-up title contains the title")
    public boolean isAccountPopUpTitleCorrect(String title) {
        SelenideElement accountPopUpTitle = $(ACCOUNT_POPUP_TITLE).shouldBe(visible, Duration.ofSeconds(10));
        return accountPopUpTitle.getText().toLowerCase().contains(title.toLowerCase());
    }

    @Step("Close the account pop-up")
    public void closeAccountPopUp() {
        SelenideElement modalAccountPopUpButtonClose = $$(ACCOUNT_POPUP_CLOSE_BUTTON).get(5);
        modalAccountPopUpButtonClose.click();
    }

    @Step("Check if the account pop-up is visible")
    public boolean isAccountPopUpVisible() {
        SelenideElement modalAccountPopUp = $$(ACCOUNT_POPUP).get(3);
        return modalAccountPopUp.shouldBe(Condition.hidden, Duration.ofSeconds(5)).isDisplayed();
    }
    @Step("Click on the account button")
    public void clickOnAccountButtonAndOpenPopup() {
        $(ACCOUNT_BUTTON).click();
        $$(ACCOUNT_POPUP).get(3).shouldBe(visible, Duration.ofSeconds(10));
    }

    @Step("Enter the telephone number")
    public void enterTelephoneNumber(String number) {
        SelenideElement inputTelephoneNumberField = $(INPUT_TELEPHONE_FIELD).shouldBe(visible, Duration.ofSeconds(5));
        inputTelephoneNumberField.click();
        inputTelephoneNumberField.sendKeys(number);
    }

    @Step("Submit the registration form")
    public void submitRegistrationForm() {
        SelenideElement submitButton = $(SUBMIT_BUTTON).shouldBe(clickable, Duration.ofSeconds(15));
        submitButton.click();
        $$(ACCOUNT_POPUP).get(4).shouldBe(visible, Duration.ofSeconds(10));
    }

    @Step("Check that the captcha error message is displayed")
    public boolean isCaptchaErrorMessageDisplayed(String expectedErrorText) {
        SelenideElement captchaErrorMessage = $$(CAPTCHA_ERROR_MESSAGE).get(4).shouldBe(visible, Duration.ofSeconds(5));
        return captchaErrorMessage.getText().toLowerCase().contains(expectedErrorText.toLowerCase());
    }

    @Step("Search on the Home page for the word")
    public void searchForWord(String word) {
        SelenideElement searchButton = $(SEARCH_BUTTON);
        searchButton.click();
        SelenideElement searchField = $(SEARCH_FIELD);
        searchField.setValue(word).pressEnter();
    }

    @Step("Add product to cart with index")
    public void addToCart(int index) {
        $$(ADD_TO_CART_BUTTON).get(index).shouldBe(visible, Duration.ofSeconds(5)).click();
    }

    @Step("Go to the cart")
    public void goToCart () {
        SelenideElement miniCartBlock = $(MINI_CART_BLOCK).shouldBe(visible, Duration.ofSeconds(15));
        miniCartBlock.hover().click();
        $(GO_TO_CART_BUTTON).shouldBe(clickable, Duration.ofSeconds(15)).click();
    }

    @Step("Go to product detail page with index")
    public String goToProductDetailPage(int index) {
        SelenideElement productBlock = $$(PRODUCT_BLOCK).get(index);
        SelenideElement imgElement = productBlock.$("img");
        String productAltText = imgElement.getAttribute("alt").toLowerCase();
        imgElement.click();
        $("[id='maincontent']").shouldBe(visible, Duration.ofSeconds(5));
        return productAltText;
    }

    @Step("Go to submenu with index")
    public String goToSubmenu(int index) {
        SelenideElement menuButton = $(MENU_BUTTON);
        menuButton.hover();

        SelenideElement submenuButton = $$(SUBMENU_BUTTON).get(index).shouldBe(clickable);
        String submenuButtonText = submenuButton.getText().toLowerCase();
        submenuButton.click();

        return submenuButtonText;
    }

}

