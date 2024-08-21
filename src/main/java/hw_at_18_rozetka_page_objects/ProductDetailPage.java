package hw_at_18_rozetka_page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {

    public ProductDetailPage(WebDriver driver){
        super(driver);
    }

    private static final By WAIT_IMAGE = By.cssSelector("img.picture-container__picture");
    private static final By PRODUCT_NAME = By.cssSelector("h1.ng-star-inserted");

    public String GetPageTitle(){
        waitForElement(WAIT_IMAGE);
        return getDriver().findElement(PRODUCT_NAME).getText();
    }
}