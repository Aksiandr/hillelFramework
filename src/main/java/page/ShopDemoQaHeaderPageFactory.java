package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopDemoQaHeaderPageFactory {

    private  WebDriver webDriver;

    @FindBy(css = ".icon_bag_alt")
    WebElement cart;

    public ShopDemoQaHeaderPageFactory(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void goToCartMenu() {
        cart.click();
    }
}
