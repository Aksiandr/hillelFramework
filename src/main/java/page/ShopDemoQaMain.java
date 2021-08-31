package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopDemoQaMain extends BasePage {

    private By hoverTokioDress = By.cssSelector("img[alt=\"Tokyo-Talkies-Women-Black-Printed-Maxi-Dress\"]");
    private By addTokioToWishList = By.cssSelector(".add-to-wishlist-704");
    private By openPinkTShortMenu = By.cssSelector(".product_tag-t-shirt.first > div > h3 > a");

    public ShopDemoQaMain(WebDriver webDriver) {
        super(webDriver);
    }

    public void setHovertokioDress() {
        hoverWebElement(hoverTokioDress);
    }

    public void setAddTokioToWishList() {
        clickOnWebElement(addTokioToWishList);
    }

    public void setOpenPinkTShortMenu() {
        clickOnWebElement(openPinkTShortMenu);
    }

}
