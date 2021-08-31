package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopDemoQaHeader extends BasePage {

    private By cart = By.cssSelector(".icon_bag_alt");
    private By wishList = By.cssSelector(".pull-right.noo-topbar-right > li:nth-child(1)");
    // private By dismiss = By.cssSelector(".woocommerce-store-notice__dismiss-link");

    public ShopDemoQaHeader(WebDriver webDriver) {
        super(webDriver);
    }

    public void setWishList() {
        clickOnWebElement(wishList);
    }


    public void goToCartMenu() {
        clickOnWebElement(cart);
    }
}
