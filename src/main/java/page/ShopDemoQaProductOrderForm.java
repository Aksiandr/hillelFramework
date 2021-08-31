package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopDemoQaProductOrderForm extends BasePage {

    private By dropdownColor = By.id("pa_color");
    private By dropdownSize = By.id("pa_size");
    private By inputQuantity = By.cssSelector("input[name=\"quantity\"]");
    private By buttonAddToCart = By.cssSelector(".form-horizontal button[type=\"submit\"]");

    public ShopDemoQaProductOrderForm(WebDriver webDriver) {
        super(webDriver);
    }

    public void setDropdownColor(String color) {
        setDropdownByText(dropdownColor, color);
    }

    public void setDropdownSize(String size) {
        setDropdownByText(dropdownSize, size);
    }

    public void setQuantity(String quantityNumber) {
        clearInput(inputQuantity);
        sendKeysToWebElement(inputQuantity, quantityNumber);
    }

    public void AddToCart() {
        // waitElementToBeClickable(buttonAddToCart);
        clickOnWebElement(buttonAddToCart);
    }
}
