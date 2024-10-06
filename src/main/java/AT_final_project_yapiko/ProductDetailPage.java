package AT_final_project_yapiko;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ProductDetailPage {

    private static final String PDP_TITLE = "[data-ui-id='page-title-wrapper']";
    private static final String ADD_TO_CART_BUTTON = "[id='product-addtocart-button']";


    @Step("Get product title on PDP")
    public String getProductTitle() {
        SelenideElement pdpTitle = $(PDP_TITLE).shouldBe(visible, Duration.ofSeconds(5));
        return pdpTitle.getText().toLowerCase();
    }

    @Step("Add product to cart")
    public void addToCart() {
        SelenideElement addToCartButton = $(ADD_TO_CART_BUTTON).shouldBe(visible, Duration.ofSeconds(10));
        addToCartButton.click();
    }
}
