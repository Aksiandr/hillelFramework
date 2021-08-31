package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopDemoQaIsharmPageFactory {

    private  WebDriver webDriver;

    @FindBy(css = "a[title=\"The New Marc Jacobs Gotham Saddle Bag\"]")
    WebElement readMore;

    public ShopDemoQaIsharmPageFactory(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void goToReadMore() {
        readMore.click();
    }
}
