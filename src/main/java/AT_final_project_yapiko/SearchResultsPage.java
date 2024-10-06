package AT_final_project_yapiko;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.util.HashSet;
import java.util.Set;
import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class SearchResultsPage {

    private static final String SEARCH_RESULT_PAGE_TITLE = "[class='base']";
    private static final String PRODUCT_BLOCKS = "[class='product-image-block']";
    private static final String MISTAKE_MESSAGE = "[class='message notice']";

    @Step("Check if the search result page title contains expectedWord")
    public boolean isSearchResultPageTitleCorrect(String expectedWord) {
        SelenideElement searchResultPageTitle = $(SEARCH_RESULT_PAGE_TITLE).shouldBe(visible);
        String titleText = searchResultPageTitle.getText().toLowerCase();
        return titleText.contains(expectedWord.toLowerCase());
    }

    @Step("Check if all products contain the search word - wordToFind")
    public boolean areAllProductsContainSearchWord(String wordToFind) {
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
                    String productTitleText = imgElement.getAttribute("title").toLowerCase();

                    collectedProducts.add(productTitleText);
                }

                productBlocks.last().scrollTo();
                sleep(2000);
            } else {
                loadMoreProducts = false;
            }
        }

        for (String productName : collectedProducts) {
            if (!productName.contains(wordToFind.toLowerCase())) {
                return false;
            }
        }
        return true;
    }

    @Step("Check if the mistake message is displayed")
    public boolean isMistakeMessageDisplayed(String expectedMessageText) {
        SelenideElement mistakeMessage = $(MISTAKE_MESSAGE).shouldBe(visible, Duration.ofSeconds(5));
        String actualMessageText = mistakeMessage.getText();
        return actualMessageText.equals(expectedMessageText);
    }
}