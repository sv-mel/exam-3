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
  //  @DisplayName("�������� �����")
    public void shouldOpenCatalog() {

        savedPage = new SavedPage();

        step("������� �������", () -> {
        open("/catalog/kosmetika/antiseptiki-dezsredstva/");
        });

        step("�������� ����� �� ��������", () -> {
        $$(".wish_item_button").get(0).click();
        });

        savedPage.buttonSaved.shouldBe(visible);

        step("�������� ����� �� ��������", () -> {
        savedPage.buttonSaved.click();
        });

        step("��������� title ��� ������ ����������", () -> {
        String title = savedPage.buttonSaved.getAttribute("title");
        });

        step("���������, ��� ��������� �������� �������", () -> {
        savedPage.headerPage.shouldHave(text("�������"));
        });

        step("���������, ��� ���������� �� ����������� � �������� ��������� �������", () -> {
        $$(".basket-coupon-block-total-price-current").get(0).shouldHave(text("0 ���."));
        });

        step("���������, ��� ������� � ������ ���������� �����, ��������� ������� ���������������", () -> {
        String str = $$(".basket-item-price-current-text").get(1).getText();
        $(byText("�������� � ������?")).click();
        $$(".basket-coupon-block-total-price-current").get(0).shouldHave(text(str));
        });

    }
}
