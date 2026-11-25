package SauceDemo2.RegistrationForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

   // private final By signUp = By.xpath("//a[@id='customer_register_link']");
    private final By registerFirstName = By.xpath("//input[@name= 'customer[first_name]']");
    private final By registerLastName = By.xpath("//input[@id= 'last_name']");
    private final By registerEmail = By.xpath("//input[@name= 'customer[email]']");
    private final By registerPassword = By.xpath("//input[@name= 'customer[password]']");
    private final By buttonCreate = By.xpath("//input[@value= 'Create']");

    public void RegistrationForm(String firstName,String lastName,String email,String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(registerFirstName));
        driver.findElement(registerFirstName).sendKeys(firstName);
        driver.findElement(registerLastName).sendKeys(lastName);
        driver.findElement(registerEmail).sendKeys(email);
        driver.findElement(registerPassword);
    }

    public void clickCreate() {
        click(driver.findElement(buttonCreate));
    }
}
