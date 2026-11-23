package practice.ShareLineRegistration;

import org.testng.annotations.Test;

public class ShareLineTest extends BaseTest {

    @Test
    public void testUserRegistration() {
        registerPage.enterZipCode("12345");

        registerPage.fillRegistrationForm("Pablo","dfghj@gmail.com","Pablo123");

        registerPage.clickRegister();
    }
}
