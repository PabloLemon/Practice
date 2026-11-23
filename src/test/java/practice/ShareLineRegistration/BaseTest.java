package practice.ShareLineRegistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;
    protected RegisterPage registerPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        registerPage = new RegisterPage(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        if(driver !=null){
            driver.quit();
        }
    }
}
