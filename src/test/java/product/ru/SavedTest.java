package product.ru;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class SavedTest extends BaseTest {

    @BeforeEach
    public void setDriverAndUrl() {
        Configuration.baseUrl = "https://aptekaeconom.com";
        open("/");
        WebDriverRunner.getWebDriver().manage().addCookie(new Cookie("current_region", "103006"));
    }

    @Test
  //  @DisplayName("Отложить товар")
    public void shouldOpenCatalog() {

        savedPage = new SavedPage();

        step("Открыть каталог", () -> {
        open("/catalog/kosmetika/antiseptiki-dezsredstva/");
        });

        step("Отложить товар из каталога", () -> {
        $$(".wish_item_button").get(0).click();
        });

        savedPage.buttonSaved.shouldBe(visible);

        step("Отложить товар из каталога", () -> {
        savedPage.buttonSaved.click();
        });

        step("Проверить title для кнопки Отложенные", () -> {
        String title = savedPage.buttonSaved.getAttribute("title");
        });

        step("Проверить, что заголовок страницы Корзина", () -> {
        savedPage.headerPage.shouldHave(text("Корзина"));
        });

        step("Проверить, что отложенные не учитываются в подсчете стоимости корзины", () -> {
        $$(".basket-coupon-block-total-price-current").get(0).shouldHave(text("0 руб."));
        });

        step("Проверить, что добавив к заказу отложенный товар, стоимость корзины пересчитывается", () -> {
        String str = $$(".basket-item-price-current-text").get(1).getText();
        $(byText("Добавить к заказу?")).click();
        $$(".basket-coupon-block-total-price-current").get(0).shouldHave(text(str));
        });

    }
}
