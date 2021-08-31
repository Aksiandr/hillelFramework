package waitorsHW16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitsHW16upd {

    @Test
    public void TestFirst() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://shop.demoqa.com/");
        webDriver.manage().window().maximize();

        String pageTitle = webDriver.getTitle();
        int pageTitleSize = webDriver.getTitle().length();

        System.out.println("Page title is: " + pageTitle);
        System.out.println("Page title size equals: " + pageTitleSize);

        String pageUrl = webDriver.getCurrentUrl();
        if (pageUrl.equals("https://shop.demoqa.com")) {
            System.out.println("The URL is correct");
        }

        String pageSource = webDriver.getPageSource();
        int pageSourceSize = pageSource.length();

        System.out.println("Page Source length is: " + pageSourceSize);

        webDriver.close();

    }

    @Test
    public void TestSecond() {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
        webDriver.manage().window().maximize();

        // page no found/ didn't find web element 'New Window'

        webDriver.close();

    }

    @Test
    public void TestThird() {
        WebDriverManager.chromedriver().setup();

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://demoqa.com/");
        webDriver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,350)", "");
        WebElement buttonForms = webDriver.findElement(By.cssSelector(".category-cards .top-card:nth-child(2)"));
        buttonForms.click();

        webDriver.navigate().back();
        webDriver.navigate().forward();
        webDriver.navigate().to("https://demoqa.com/");
        webDriver.navigate().refresh();
        webDriver.close();

    }

    @Test
    public void TestFourth() {
        WebDriverManager.chromedriver().setup();

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://demoqa.com/progress-bar");
        webDriver.manage().window().maximize();

        WebElement buttonStartProgress = webDriver.findElement(By.id("startStopButton"));
        buttonStartProgress.click();

        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("resetButton"))));

        webDriver.findElement(By.id("resetButton")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("startStopButton"))));
        webDriver.close();
    }

    @Test
    public void TestFifth() {
        WebDriverManager.chromedriver().setup();

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://demoqa.com/dynamic-properties");

        WebDriverWait wait = new WebDriverWait(webDriver, 5);
        // wait.until(ExpectedConditions.elementToBeClickable((By.id("visibleAfter"))));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
        webDriver.close();
    }
}


