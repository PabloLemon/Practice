package SauceDemo2.RegistrationForm;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class SignUpTest extends BaseTest{

   @Test
   public void testUserRegistration() {

      driver.findElement(By.xpath("//a[@id= 'customer_register_link']")).click();
      String testEmail = "testuser" + System.currentTimeMillis() + "@example.com";

      registerPage.RegistrationForm(
              "Pablo",
              "NonEscobar",
              testEmail,
              "Password12345"
      );
      registerPage.clickCreate();

   }



}
