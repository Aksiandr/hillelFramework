package selectorsHW15;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {

    @Test
    public void TestSecond() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");

        Thread.sleep(3000);
        WebElement buttonManager = webDriver.findElement(By.xpath("//button[contains(@ng-click, 'manager')]"));
        buttonManager.click();

        Thread.sleep(1000);
        WebElement buttonAddCustomer = webDriver.findElement(By.xpath("//button[contains(@ng-click, 'addCust')]"));
        buttonAddCustomer.click();

        Thread.sleep(1000);
        WebElement fieldFirstName = webDriver.findElement(By.xpath("//input[contains(@ng-model, 'fName')]"));
        fieldFirstName.sendKeys("Oks");

        WebElement fieldLastName = webDriver.findElement(By.xpath("//input[contains(@ng-model, 'lName')]"));
        fieldLastName.sendKeys("Kha");

        WebElement fieldPostalCode = webDriver.findElement(By.xpath("//input[contains(@ng-model, 'postCd')]"));
        fieldPostalCode.sendKeys("61000");

        WebElement buttonSubmitAddCustomer = webDriver.findElement(By.xpath("//button[@type='submit']"));
        buttonSubmitAddCustomer.click();

        webDriver.switchTo().alert().accept();
        webDriver.switchTo().defaultContent();

        Thread.sleep(1000);
        WebElement buttonOpenAccount = webDriver.findElement(By.xpath("//button[contains(@ng-click, 'openAccount')]"));
        buttonOpenAccount.click();

        webDriver.close();
    }
}

