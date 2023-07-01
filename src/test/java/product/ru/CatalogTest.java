package product.ru;

import org.junit.jupiter.api.Test;

public class CatalogTest extends BaseTest{


    @Test
    public void shouldAddToCart() {

        BaseTest.driver.get(baseUrl + "/catalog/gigiena/");

    }
}