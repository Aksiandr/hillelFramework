package selectorsHW15;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {

    @Test
    public void TestFirrst() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");

        Thread.sleep(3000);
        WebElement buttonCustomer = webDriver.findElement(By.xpath("//button[contains(@ng-click, 'customer')]"));
        buttonCustomer.click();

        Thread.sleep(2000);
        WebElement dropdownName = webDriver.findElement(By.id("userSelect"));
        dropdownName.sendKeys("Harry Potter");

        WebElement buttonLogin = webDriver.findElement(By.xpath("//button[@type='submit']"));
        buttonLogin.click();

        Thread.sleep(1000);
        WebElement buttonDeposit = webDriver.findElement(By.xpath("//button[contains(@ng-click, 'deposit')]"));
        buttonDeposit.click();

        Thread.sleep(1000);
        WebElement fieldAmountDeposit = webDriver.findElement(By.xpath("//input[contains(@ng-model, 'amount')]"));
        fieldAmountDeposit.sendKeys("1000");

        WebElement buttonSubmitDeposit = webDriver.findElement(By.xpath("//button[@type='submit']"));
        buttonSubmitDeposit.click();

        WebElement buttonWithdrawl = webDriver.findElement(By.xpath("//button[contains(@ng-click, 'withdrawl')]"));
        buttonWithdrawl.click();

        Thread.sleep(1000);
        WebElement fieldAmountWithdrawl = webDriver.findElement(By.xpath("//input[contains(@ng-model, 'amount')]"));
        fieldAmountWithdrawl.sendKeys("900");

        WebElement buttonSubmitWithdrawl = webDriver.findElement(By.xpath("//button[@type='submit']"));
        buttonSubmitWithdrawl.click();

        WebElement buttonTransactions = webDriver.findElement(By.xpath("//button[contains(@ng-click, 'transactions')]"));
        buttonTransactions.click();

        Thread.sleep(1000);
        WebElement buttonReset = webDriver.findElement(By.xpath("//button[contains(@ng-click, 'reset')]"));
        buttonReset.click();

        webDriver.close();
    }
}
