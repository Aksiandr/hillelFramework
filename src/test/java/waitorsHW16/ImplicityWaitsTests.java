package waitorsHW16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicityWaitsTests {

    @Test
    public void TestA() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        webDriver.get("https://demoqa.com/login");
        webDriver.manage().window().maximize();


        WebElement inputLoginName = webDriver.findElement(By.id("userName"));
        inputLoginName.sendKeys("khaloksa");

        WebElement inputPasswordLogin = webDriver.findElement(By.id("password"));
        inputPasswordLogin.sendKeys("1992Fkbr1969!");

        WebElement buttonLogin = webDriver.findElement(By.id("login"));
        buttonLogin.click();

//        List<WebElement> listItems = webDriver.findElements(By.xpath("//*[@id=\"item-2\"]"));


//        for (int i = 0; i < listItems.size(); i++) {
//            if (listItems.get(i).getText().equals("Book Store")) {
////                listItems.get(i).getLocation();
//                js.executeScript("window.scrollBy(0,400)", "");
//                listItems.get(i).click();
//            }
//        }

        WebElement bookStore = webDriver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[6]/div/ul/li[2]/span"));
        js.executeScript("window.scrollBy(0,400)", "");
        bookStore.click();

        WebElement linkGitPoket = webDriver.findElement(By.cssSelector("#see-book-Git\\ Pocket\\ Guide > a"));
        linkGitPoket.click();

        js.executeScript("window.scrollBy(0,350)", "");
        WebElement buttonAddToCollection = webDriver.findElement(By.cssSelector(".text-right #addNewRecordButton"));
        buttonAddToCollection.click();

        webDriver.switchTo().alert().accept();
        webDriver.switchTo().defaultContent();

        js.executeScript("window.scrollBy(0,450)", "");
        WebElement buttonBackToStore = webDriver.findElement(By.cssSelector(".text-left #addNewRecordButton"));
        buttonBackToStore.click();

        js.executeScript("window.scrollBy(0,450)", "");
        WebElement linkYouDontKnowJs = webDriver.findElement(By.cssSelector("#see-book-You\\ Don\\'t\\ Know\\ JS > a"));
        linkYouDontKnowJs.click();

        js.executeScript("window.scrollBy(0,450)", "");
        buttonAddToCollection.click();

        webDriver.switchTo().alert().accept();
        webDriver.switchTo().defaultContent();

        webDriver.switchTo().alert().accept();
        webDriver.switchTo().defaultContent();

        WebElement buttonDeleteAllBooks = webDriver.findElement(By.cssSelector(".text-right #submit"));
        js.executeScript("window.scrollBy(0,450)", "");
        buttonDeleteAllBooks.click();

        webDriver.close();

    }

    @Test
    public void TestB() {
        WebDriverManager.chromedriver().setup();

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.saucedemo.com/");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement inputLoginName = webDriver.findElement(By.id("user-name"));
        inputLoginName.sendKeys("standard_user");

        WebElement inputPasswordLogin = webDriver.findElement(By.id("password"));
        inputPasswordLogin.sendKeys("secret_sauce");

        WebElement buttonLogin = webDriver.findElement(By.id("login-button"));
        buttonLogin.click();

        webDriver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        webDriver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        webDriver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
        webDriver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();

        webDriver.findElement(By.cssSelector(".shopping_cart_link")).click();

        webDriver.findElement(By.id("checkout")).click();

        webDriver.findElement(By.id("first-name")).sendKeys("Oks");
        webDriver.findElement(By.id("last-name")).sendKeys("Kha");
        webDriver.findElement(By.id("postal-code")).sendKeys("61000");

        webDriver.findElement(By.id("continue")).click();

        webDriver.findElement(By.id("finish")).click();

        webDriver.findElement(By.id("back-to-products")).click();

        webDriver.close();

    }

    @Test
    public void TestC() {
        WebDriverManager.chromedriver().setup();

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://webdriveruniversity.com/To-Do-List/index.html");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement inputAddNewToDo = webDriver.findElement(By.cssSelector("input"));
        inputAddNewToDo.sendKeys("MAKE HOMEWORK", Keys.ENTER);

        inputAddNewToDo.sendKeys("Practice Automation", Keys.ENTER);

        webDriver.findElement(By.cssSelector("li:nth-child(3)")).click();

        Actions action = new Actions(webDriver);

        action.moveToElement(webDriver.findElement(By.cssSelector("li:nth-child(3)")))
                .click(webDriver.findElement(By.cssSelector("li:nth-child(3) span")));

        webDriver.close();

    }

    @Test
    public void TestD() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.amazon.com/");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        webDriver.findElement(By.cssSelector("#nav-xshop > a:nth-child(2)")).click();

        webDriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div/" +
                "div/div/div[1]/div/div[2]/div/div/div[8]/div/span/span/span/a")).click();

        webDriver.findElement(By.xpath("//*[@id=\"octopus-dlp-asin-stream\"]/ul/li[1]/span/div/div[1]/a"))
                .click();

        webDriver.findElement(By.id("add-to-cart-button")).click();

        webDriver.findElement(By.cssSelector("#attach-sidesheet-checkout-button > span > input")).click();

        webDriver.close();

    }
}
