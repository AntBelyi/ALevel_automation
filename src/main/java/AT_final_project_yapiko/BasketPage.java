package AT_final_project_yapiko;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.*;

public class BasketPage {

    private static final String ORDER_AMOUNT = "[class='price']";
    private static final String PICKUP_DISCOUNT_BUTTON = "[id='s_method_selfget_selfget']";
    private static final String DELETE_PRODUCT_BUTTON = "[class='icon icon-remove']";
    private static final String PRODUCT_IN_CART = "[class='product-item-name']";


    @Step("Get the initial order amount")
    public int getOrderAmount() {
        SelenideElement orderAmount = $$(ORDER_AMOUNT).get(11).shouldBe(visible, Duration.ofSeconds(5));
        String priceText = orderAmount.getText().replaceAll("[^\\d]", "");
        return Integer.parseInt(priceText);
    }

    @Step("Select pick-up discount")
    public void selectPickUpDiscount() {
        SelenideElement pickupDiscountButton = $(PICKUP_DISCOUNT_BUTTON).shouldBe(visible, Duration.ofSeconds(10));
        pickupDiscountButton.click();
    }

    @Step("Get the updated order amount with discount")
    public int getUpdatedOrderAmount() {
        SelenideElement updatedOrderAmount = $$(ORDER_AMOUNT).get(13).shouldBe(visible, Duration.ofSeconds(15));
        String updatedPriceText = updatedOrderAmount.getText().replaceAll("[^\\d]", "");
        return Integer.parseInt(updatedPriceText);
    }

    @Step("Get order amount for element with index")
    public int getOrderAmount(int index) {
        SelenideElement orderAmount = $$(ORDER_AMOUNT).get(index).shouldHave(visible, Duration.ofSeconds(15));
        String priceText = orderAmount.getText().replaceAll("[^\\d.]", "");
        if (priceText.contains(".")) {
            priceText = priceText.split("\\.")[0];
        }
        return Integer.parseInt(priceText);
    }

    @Step("Get product price for element with index")
    public int getProductPrice(int index) {
        SelenideElement productPrice = $$(ORDER_AMOUNT).get(index).shouldBe(visible, Duration.ofSeconds(10));
        String priceText = productPrice.getText().replaceAll("[^\\d]", "");
        return Integer.parseInt(priceText);
    }

    @Step("Delete product from basket with index: {index}")
    public void deleteProductFromBasket(int index) {
        SelenideElement deleteProductButton = $$(DELETE_PRODUCT_BUTTON).get(index).shouldBe(visible, Duration.ofSeconds(10));
        deleteProductButton.click();
        sleep(3000);
    }

    @Step("Get updated order amount for element with index")
    public int getUpdatedOrderAmount(int index) {
        SelenideElement updatedOrderAmount = $$(ORDER_AMOUNT).get(index).shouldBe(visible, Duration.ofSeconds(15));
        String updatedPriceText = updatedOrderAmount.getText().replaceAll("[^\\d.]", "");
        if (updatedPriceText.contains(".")) {
            updatedPriceText = updatedPriceText.split("\\.")[0];
        }
        return Integer.parseInt(updatedPriceText);
    }

    @Step("Get product name in cart")
    public String getProductNameInCart() {
        SelenideElement productInCart = $(PRODUCT_IN_CART).shouldBe(visible, Duration.ofSeconds(15));
        return productInCart.getText().toLowerCase();
    }

}
