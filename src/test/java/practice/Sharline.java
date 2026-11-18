package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

public class Sharline {

    private WebDriver driver;

    @Test
    public void testZip() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");

        WebElement zipPole = driver.findElement(By.name("zip_code"));
        zipPole.sendKeys("12345");

        WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
        continueButton.click();

            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='first_name']")));

            WebElement firstName = driver.findElement(By.xpath("//input[@name='first_name']"));
        firstName.sendKeys("Pablo");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("dfgh@gmail.com");

        WebElement password1 = driver.findElement(By.cssSelector("input[name=password1]"));
        password1.sendKeys("Pablo123");

        WebElement password2 = driver.findElement(By.cssSelector("input[name=password2]"));
        password2.sendKeys("Pablo123");

        WebElement registerButton = driver.findElement(By.xpath("//input[@value='Register']"));
        registerButton.click();
            driver.quit();

        }

    }

