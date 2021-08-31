package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {


    private WebDriver webDriver;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebElement findWebElement(By locator) {
        return webDriver.findElement(locator);
    }

    public void sendKeysToWebElement (By locator, String keys) {
        findWebElement(locator).sendKeys(keys);
    }

    public void clickOnWebElement (By locator) {
        findWebElement(locator).click();
    }

    public void clearInput (By locator) {
        findWebElement(locator).clear();
    }

    public void waitTextToBePresentInWebElement (By locator, String text) {
        WebDriverWait wait = new WebDriverWait(webDriver, 3);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
    }

    public void waitElementToBeClickable (By locator) {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(findWebElement(locator))).click();
    }

    public boolean isWebElementDisplayed(By locator) {
        return webDriver.findElement(locator).isDisplayed();
    }

    public boolean isWebElementEnabled(By locator) {
        return webDriver.findElement(locator).isEnabled();
    }


    public void hoverWebElement(By locator) {
        Actions action = new Actions(webDriver);
        action.moveToElement(findWebElement(locator));
    }

    public void setDropdownByText(By locator, String text) {
        Select dropdown = new Select(findWebElement(locator));
        dropdown.selectByVisibleText(text);
    }

    public boolean isWebElementContainsText(By locator, String text) {
        return findWebElement(locator).getText().equals(text);
    }

//    public void actionClick(By locator) {
////        Actions actionProvider = new Actions(webDriver);
////        actionProvider.doubleClick(findWebElement(locator)).build().perform();
//        JavascriptExecutor executor = (JavascriptExecutor) webDriver;
//        executor.executeScript("arguments[0].scrollIntoView(true);", findWebElement(locator));
//        findWebElement(locator).click();
//    }

}


