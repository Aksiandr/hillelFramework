package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopDemoQaReadMorePageFactory {

    private  WebDriver webDriver;

    @FindBy(id = "author")
    WebElement authorInput;

    @FindBy(id = "email")
    WebElement emailInput;

    @FindBy(id = "comment")
    WebElement commentInput;

    @FindBy(css = ".comment-form-cookies-consent label")
    WebElement acceptCheckBox;

    @FindBy(id = "submit")
    WebElement addCommentButton;

    public ShopDemoQaReadMorePageFactory(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void setAuthorInput(String text) {
        authorInput.sendKeys(text);
    }

    public void setEmailInput(String text) {
        emailInput.sendKeys(text);
    }

    public void setCommentInput(String text) {
        commentInput.sendKeys(text);
    }

    public void clickOnAcceptCheckButton() {
        acceptCheckBox.click();
    }

    public void clickOnAddCommentButton() {
        addCommentButton.click();
    }


}
