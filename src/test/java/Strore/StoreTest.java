package Strore;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StoreTest extends BaseTest{
    @Test
    public void testAddProductToCart() {
        String productName = "Смартфон Apple iPhone 17 256GB White (MG6K4HN/A)";
        main.searchForProduct(productName);

        String actualTitle = main.getFirstProductName();
        Assert.assertTrue(actualTitle.contains(productName),
                "Ожидали найти: " + productName +", а нашли: " + actualTitle);

        main.addFirstProductToCart();

        main.goToCart();
    }
}
