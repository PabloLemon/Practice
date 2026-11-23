package Strore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    protected Main main;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://5element.by/");
        main = new Main(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null){
            driver.quit();
        }
    }
}
