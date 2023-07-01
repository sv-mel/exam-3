package product.ru;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class BaseTest extends GeneralBaseTest {

    @BeforeEach
    public void setDriverAndUrl() throws IOException {
        BaseTest.driver = new ChromeDriver();
        baseUrl = "https://aptekaeconom.com";
        wait = new WebDriverWait(BaseTest.driver, Duration.of(7, ChronoUnit.SECONDS));
    }
}
