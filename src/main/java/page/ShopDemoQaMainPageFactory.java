package page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShopDemoQaMainPageFactory {


    private WebDriver webDriver;

    @FindBy(css = ".noo-search")
    WebElement search;

    @FindBy(css = "input[type=\"search\"]")
    WebElement inputSearch;

    @FindBy(css = ".noo_woocommerce-catalog > form:nth-child(3) > select")
    WebElement dropdownSize;

    @FindBy(xpath = "//div[contains(@class, 'post-1406')]//div[@class='owl-item active']//img[@class='product-one-thumb']")
    WebElement firstItem;


    public ShopDemoQaMainPageFactory(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void clickSearch() {
        search.click();
    }

    public void setInputSearch (String text) {
        inputSearch.sendKeys(text, Keys.ENTER);
    }

    public void setDropdownSize(String text) {
        Select size = new Select(dropdownSize);
        size.selectByVisibleText(text);
    }

    public void clickOnFirstItem() {
        firstItem.click();
    }

    public boolean isFirstItemIsDisplayed() {
        return firstItem.isDisplayed();
    }

}
