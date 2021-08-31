import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.ShopDemoQaCart;
import page.ShopDemoQaHeader;
import page.ShopDemoQaMain;
import page.ShopDemoQaProductOrderForm;

public class TaskCAddToCartHW19 extends BaseTest {

    @Test(groups = "Regression")
    public void addProductToCart() {

        getWebDriver().get("https://shop.demoqa.com/");

        ShopDemoQaHeader header = new ShopDemoQaHeader(getWebDriver());
        ShopDemoQaMain main = new ShopDemoQaMain(getWebDriver());
        ShopDemoQaProductOrderForm orderForm = new ShopDemoQaProductOrderForm(getWebDriver());
        ShopDemoQaCart cart = new ShopDemoQaCart(getWebDriver());

        main.setOpenPinkTShortMenu();
        orderForm.setDropdownColor("Pink");
        orderForm.setDropdownSize("37");
        orderForm.setQuantity("3");
        // Totally I didn't understand
        orderForm.AddToCart();
        header.goToCartMenu();
        Assert.assertTrue(cart.isProductExistsInCart("PINK DROP SHOULDER OVERSIZED T SHIRT - PINK"));

    }


}
