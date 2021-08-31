package selectorsHW15;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Test4 {

    @Test
    public void TestFourth() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");

        Thread.sleep(3000);
        WebElement buttonManager = webDriver.findElement(By.xpath("//button[contains(@ng-click, 'manager')]"));
        buttonManager.click();

        Thread.sleep(1000);
        WebElement buttonOpenAccount = webDriver.findElement(By.xpath("//button[contains(@ng-click, 'showCust')]"));
        buttonOpenAccount.click();

        Thread.sleep(1000);
        List<WebElement> dropdownCustomers = webDriver.findElements(By.xpath("//table/tbody/tr"));

        for (int i = 0; i < dropdownCustomers.size(); i++) {
            Thread.sleep(1000);
            WebElement buttonDelete = webDriver.findElement(By.xpath("//table/tbody/tr/td/button"));
            buttonDelete.click();
        }

        webDriver.close();
    }
}

