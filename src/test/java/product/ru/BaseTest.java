package product.ru;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    CatalogPage catalogPage;
    SavedPage savedPage;

    @BeforeAll
    public static void setProperty() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
    }

    @AfterEach
    public void closeAfterEach() {

        WebDriverRunner.closeWebDriver();
    }
}
