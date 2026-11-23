package Strore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Store5Element {

   private WebDriver driver;

   @Test
    public void scoreElement() {

       WebDriver driver = new ChromeDriver();

       driver.get("https://5element.by/");

       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='inp inp--lg digi-instant-search jc-ignore']")));

       WebElement instantSearch = driver.findElement(By.xpath("//input[@class='inp inp--lg digi-instant-search jc-ignore']"));
       instantSearch.click();

       instantSearch.sendKeys("Смартфон Apple iPhone 17 256GB White (MG6K4HN/A)");

       WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
       wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn']")));

       WebElement search = driver.findElement(By.xpath("//button[@class='btn']"));
       search.click();

       WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
       wait2.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//a[@class='digi-product__label']"),"iPhone"));

       WebElement firstProduct = driver.findElement(By.xpath("//a[@class='digi-product__label']"));
       String actualTitle = firstProduct.getText();

      Assert.assertTrue(actualTitle.contains("Смартфон Apple iPhone 17 256GB White (MG6K4HN/A"), "Ожидали iPhone 17,а нашли: " + actualTitle);
      WebElement cart = driver.findElement(By.xpath("//button[@class='digi-product__button']"));
      cart.click();

      WebDriverWait shopCart = new WebDriverWait(driver,Duration.ofSeconds(10));
      shopCart.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Корзина']")));

      WebElement shoppingCart = driver.findElement(By.xpath("//div[text()='Корзина']"));
      shoppingCart.click();

      driver.quit();
   }
}
