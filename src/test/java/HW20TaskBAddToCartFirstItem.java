import Base.BaseTest;
import org.testng.annotations.Test;
import page.ShopDemoQaCartPageFactory;
import page.ShopDemoQaHeaderPageFactory;
import page.ShopDemoQaMainPageFactory;
import page.ShopDemoQaProductOrderFormPageFactory;

import java.util.concurrent.TimeUnit;

public class HW20TaskBAddToCartFirstItem extends BaseTest {

    @Test
    public void testB() throws InterruptedException {

        getWebDriver().get("https://shop.demoqa.com/");
        ShopDemoQaMainPageFactory main = new ShopDemoQaMainPageFactory(getWebDriver());
        ShopDemoQaProductOrderFormPageFactory orderForm = new ShopDemoQaProductOrderFormPageFactory(getWebDriver());
        ShopDemoQaCartPageFactory cart = new ShopDemoQaCartPageFactory(getWebDriver());
        ShopDemoQaHeaderPageFactory header = new ShopDemoQaHeaderPageFactory(getWebDriver());

        main.clickSearch();
        main.setInputSearch("blue");
        main.setDropdownSize("37");
        main.isFirstItemIsDisplayed();
        main.clickOnFirstItem();

        orderForm.setDropdownColor("Blue");
        orderForm.setDropdownSize("37");
//        orderForm.actionClick();
        orderForm.addToCart();

        header.goToCartMenu();
        cart.isProductExistsInCart("BLUE SINNER RIPPED KNEE HIGH WAIST SKINNY JEANS - BLUE");

    }

}
