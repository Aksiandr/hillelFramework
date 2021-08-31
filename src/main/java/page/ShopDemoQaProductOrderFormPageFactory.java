package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShopDemoQaProductOrderFormPageFactory{

    private WebDriver webDriver;

    @FindBy(id = "pa_color")
    WebElement dropdownColor;

    @FindBy(id = "pa_size")
    WebElement dropdownSize;

    @FindBy(css = ".form-horizontal button[type=\"submit\"]")
    WebElement buttonAddToCart;


    public ShopDemoQaProductOrderFormPageFactory(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void setDropdownColor(String text) {
        Select color = new Select(dropdownColor);
        color.selectByVisibleText(text);
    }

    public void setDropdownSize(String text) {
        Select size = new Select(dropdownSize);
        size.selectByVisibleText(text);
    }

    public void addToCart() {
        buttonAddToCart.click();
    }

    public void actionClick() {
//        Actions actionProvider = new Actions(webDriver);
//        actionProvider.doubleClick(findWebElement(locator)).build().perform();

        JavascriptExecutor executor = (JavascriptExecutor)webDriver;
        executor.executeScript("arguments[0].click();", buttonAddToCart);
        // (JavascriptExecutor(webDriver)).executeScript("document.getElementsByClassName('form-horizontal')[0].click();");
    }
}
