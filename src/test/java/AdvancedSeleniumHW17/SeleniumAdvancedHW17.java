package AdvancedSeleniumHW17;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class SeleniumAdvancedHW17 {


    @Test
    public void testGetListElementIndex() {
        WebDriverManager.chromedriver().setup();

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://the-internet.herokuapp.com/tables");
        webDriver.manage().window().maximize();

        List<WebElement> headersElements = webDriver.findElements(By.cssSelector("#table1 tr th"));

        List<String> headers = headersElements.stream().map(WebElement::getText).collect(Collectors.toList());
        // Answering the question how to get index of list item without using For
        int lastNameIndex = headers.indexOf("Last Name");
        System.out.println("The index of last name column is: " + lastNameIndex);

        String lastNameXpath = String.format("//table[1]/tbody/tr/td[%s]", lastNameIndex + 1);

        List<WebElement> lastNamesElements = webDriver.findElements(By.xpath(lastNameXpath));
        List<String> lastNamesList = lastNamesElements.stream().map(WebElement::getText).collect(Collectors.toList());

        lastNamesList.forEach(System.out::println);

        webDriver.close();
    }

    @Test
    public void testA() {
        WebDriverManager.chromedriver().setup();

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://demoqa.com/frames");
        webDriver.manage().window().maximize();

        webDriver.switchTo().frame(webDriver.findElement(By.id("frame1")));

        WebElement frameBodyFirst = webDriver.findElement(By.cssSelector("#sampleHeading"));
        System.out.println("The first Frame text is " + frameBodyFirst.getText());

        webDriver.switchTo().defaultContent();

        webDriver.switchTo().frame(webDriver.findElement(By.id("frame2")));

        WebElement frameBodySecond = webDriver.findElement(By.cssSelector("#sampleHeading"));
        System.out.println("The second Frame text is " + frameBodySecond.getText());

        webDriver.close();

    }

    @Test
    public void testB() {
        WebDriverManager.chromedriver().setup();

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://demoqa.com/automation-practice-form");
        webDriver.manage().window().maximize();

        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        webDriver.findElement(By.id("firstName")).sendKeys("Oksana");
        webDriver.findElement(By.id("lastName")).sendKeys("Khalilova");
        webDriver.findElement(By.id("userEmail")).sendKeys("oksanakhalilova@gmail.com");
        webDriver.findElement(By.cssSelector("label[for=\"gender-radio-2\"]")).click();
        webDriver.findElement(By.id("userNumber")).sendKeys("0955728476");


        webDriver.findElement(By.id("dateOfBirthInput")).click();

        WebElement birthdayYear = webDriver.findElement(By.cssSelector(".react-datepicker__year-select"));
        Select dropdownYear = new Select(birthdayYear);
        dropdownYear.selectByVisibleText("1988");

        WebElement birthdayMonth = webDriver.findElement(By.cssSelector(".react-datepicker__month-select"));
        Select dropdownMonth = new Select(birthdayMonth);
        dropdownMonth.selectByVisibleText("December");
        // dropdownMonth.selectByIndex(11);

        // be careful with days as far as you can have two the same available days
        // and after clicking on the wrong date the month could be changed
        // it selects November instead of December when the wrong locator - .react-datepicker__day--028
        webDriver.findElement(By.cssSelector("div[aria-label*='December'][aria-label*='28']")).click();

        webDriver.findElement(By.cssSelector("label[for=\"hobbies-checkbox-1\"]")).click();

        webDriver.findElement(By.cssSelector("label[for=\"hobbies-checkbox-2\"]")).click();

        webDriver.findElement(By.cssSelector("label[for=\"hobbies-checkbox-3\"]")).click();

        webDriver.findElement(By.id("currentAddress")).sendKeys("Kharkiv");

        WebElement inputState = webDriver.findElement(By.id("react-select-3-input"));
        inputState.sendKeys("NCR", Keys.ENTER);

        WebElement inputCity = webDriver.findElement(By.id("react-select-4-input"));
        inputCity.sendKeys("Noida", Keys.ENTER);

        webDriver.findElement(By.id("submit")).click();

        webDriver.close();
    }

    @Test
    public void testC() {
        WebDriverManager.chromedriver().setup();

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://demoqa.com/text-box");
        webDriver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) webDriver;

        webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        webDriver.findElement(By.id("userName")).sendKeys("Oksana Khalilova");
        webDriver.findElement(By.id("userEmail")).sendKeys("oksanakhalilova@gmail.com");

        webDriver.findElement(By.id("currentAddress")).sendKeys("Kharkiv");

        webDriver.findElement(By.id("permanentAddress")).sendKeys("Kherson");


        js.executeScript("window.scrollBy(0,350)", "");
        webDriver.findElement(By.id("submit")).click();

        webDriver.close();
    }

    @Test
    public void testD() {
        WebDriverManager.chromedriver().setup();

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://way2automation.com/way2auto_jquery/dropdown.php#load_box");
        webDriver.manage().window().maximize();

        webDriver.switchTo().frame(webDriver.findElement(By.cssSelector(".demo-frame")));

        WebElement dropdownSelectCountry = webDriver.findElement(By.cssSelector("select"));
        Select selectCountry = new Select(dropdownSelectCountry);
        selectCountry.selectByVisibleText("Austria");
        selectCountry.selectByIndex(25);
        selectCountry.selectByValue("SriLanka");

        webDriver.close();
    }

}
