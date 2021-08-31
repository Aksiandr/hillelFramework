package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopDemoQaCartPageFactory {

    private  WebDriver webDriver;

    @FindBy(css = "td.product-name > a")
    WebElement productLink;

    public ShopDemoQaCartPageFactory(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public boolean isProductExistsInCart(String text) {
        return productLink.getText().equals(text);
    }
}
