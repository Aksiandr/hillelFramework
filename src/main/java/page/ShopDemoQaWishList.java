package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopDemoQaWishList extends BasePage{

    private By productName = By.cssSelector("td.product-name > a");

    public ShopDemoQaWishList(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isProductName(String text) {
        return isWebElementContainsText(productName, text);
    }
}
