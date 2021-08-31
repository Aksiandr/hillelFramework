package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopDemoQaCart extends BasePage {

    private By productLink = By.cssSelector("td.product-name > a");

    public ShopDemoQaCart(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isProductExistsInCart(String text) {
        return isWebElementContainsText(productLink, text);
    }
}
