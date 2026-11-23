package Strore;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class Main extends BasePage {

    private final By searchInput = By.xpath("//input[contains(@class,  'digi-instant-search')]");
    private final By searchButton = By.xpath("//button[contains(@class, 'btn')]");
    private final By firstProductLabel = By.xpath("//a[@class='digi-product__label']");
    private final By addToCartButton = By.xpath("//button[@class='digi-product__button']");
    private final By goToCartButton = By.xpath("//div[text()='Корзина']");

    public Main (WebDriver driver) {
        super(driver);
    }
    public void searchForProduct(String productName) {
        WebElement searchField = wait.until(ExpectedConditions.visibilityOfElementLocated(searchInput));
        searchField.sendKeys(productName);
        searchField.sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.urlContains("search"));
//        driver.findElement(searchInput).sendKeys(productName);
//        click(driver.findElement(searchButton));
    }
    public String getFirstProductName() {
        wait.until(ExpectedConditions.textToBePresentInElementLocated(firstProductLabel,"iPhone"));
        return driver.findElement(firstProductLabel).getText();
    }

    public void addFirstProductToCart() {
        click(driver.findElement(addToCartButton));
    }

    public void goToCart() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(goToCartButton));
        click(driver.findElement(goToCartButton));
    }
}
