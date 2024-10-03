package AT_final_project_yapiko;

import java.time.Duration;
import java.util.HashSet;
import java.util.Set;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SubmenuProductPage {

    private static final String SUBMENU_PAGE_TITLE = "[class='base']";
    private static final String PRODUCT_BLOCKS = "[class='product-image-block']";


    @Step("Get submenu page title")
    public String getSubmenuPageTitle() {
        SelenideElement submenuPageTitleHeading = $(SUBMENU_PAGE_TITLE).shouldBe(visible, Duration.ofSeconds(10));
        return submenuPageTitleHeading.getText().toLowerCase();
    }

    @Step("Collect all product names")
    public Set<String> collectAllProductNames() {
        Set<String> collectedProducts = new HashSet<>();
        boolean loadMoreProducts = true;
        int prevProductCount = 0;

        while (loadMoreProducts) {
            ElementsCollection productBlocks = $$(PRODUCT_BLOCKS);

            int currentProductCount = productBlocks.size();
            if (currentProductCount > prevProductCount) {
                prevProductCount = currentProductCount;

                for (SelenideElement productBlock : productBlocks) {
                    SelenideElement imgElement = productBlock.$("img");
                    String productAltText = imgElement.getAttribute("alt").toLowerCase();
                    collectedProducts.add(productAltText);
                }

                productBlocks.last().scrollTo();
                sleep(2000);
            } else {
                loadMoreProducts = false;
            }
        }

        return collectedProducts;
    }
}
