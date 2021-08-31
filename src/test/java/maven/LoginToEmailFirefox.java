package maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginToEmailFirefox {

    @Test
    public void loginToEmailViaFireFox() {

        WebDriverManager.firefoxdriver().setup();

        WebDriver webDriver = new FirefoxDriver();
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
