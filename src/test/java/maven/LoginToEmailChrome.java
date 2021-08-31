package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginToEmailChrome {

    @Test
    public void loginToEmailViaChrome() {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://passport.i.ua/login/");

        WebElement emailField = webDriver.findElement(By.cssSelector("input[name='login']"));
        emailField.sendKeys("oksanakhalilova@gmail.com");

        WebElement passwdField = webDriver.findElement(By.cssSelector("input[name='pass']"));
        passwdField.sendKeys("1992Fkbr1969");

        WebElement nextButton = webDriver.findElement(By.cssSelector("input[type='submit']"));
        nextButton.click();

        webDriver.close();

    }
}
