package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopDemoQaErrorPageFactory {

    private  WebDriver webDriver;

    @FindBy(css = "#error-page div.wp-die-message")
    WebElement errorMessage;

    public ShopDemoQaErrorPageFactory(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public String readErrorMessage() {
        return errorMessage.getText();
    }

}
