package practice.ShareLineRegistration;

import org.openqa.selenium.By;
import Strore.BasePage;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {

    private final By zipCodeInput = By.name("zip_code");
    private final By continueButton = By.xpath("//input[@value='Continue']");
    private final By firstNameInput = By.xpath("//input[@name='first_name']");
    private final By emailInput = By.name("email");
    private final By password1Input = By.cssSelector("input[name=password1]");
    private final By password2Input = By.cssSelector("input[name=password2]");
    private final By registerButton = By.xpath("//input[@value='Register']");

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void enterZipCode(String zip) {
        driver.findElement(zipCodeInput).sendKeys(zip);
        click(driver.findElement(continueButton));
    }
    public void fillRegistrationForm(String firstName,String email,String password) {
        wait.until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated(firstNameInput));
        driver.findElement(firstNameInput).sendKeys(firstName);
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(password1Input).sendKeys(password);
        driver.findElement(password2Input).sendKeys(password);
    }

    public void clickRegister() {
        click(driver.findElement(registerButton));
    }
}


