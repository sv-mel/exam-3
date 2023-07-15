package product.ru;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

public class CatalogTest extends BaseTest {


    @BeforeEach
    public void setDriverAndUrl() {
        Configuration.baseUrl = "https://aptekaeconom.com";
        open("/");
        WebDriverRunner.getWebDriver().manage().addCookie(new Cookie("current_region", "103006"));
    }

    @Test
    public void shouldCheckWork() throws InterruptedException {

        catalogPage = new CatalogPage();

        open("/basket/");


        step("���������, ��� ��������� ������������", () -> {
            $(catalogPage.headerPage).shouldBe(Condition.visible);
        assertThat($(catalogPage.headerPage).isDisplayed()).isTrue();

            step("��������� �� �����", () -> {
        });
        });

    }


    @Test
    @DisplayName("�������� ��������")
    public void shouldOpenCatalog(){
        catalogPage = new CatalogPage();

        sleep(5000);
        String categoryName = catalogPage.categoryItem.getText();

        step("�������� �������� �������� �������� � ������� �������", () -> {
            catalogPage.categoryItem.click();
        });

        sleep(5000);
        String categoryNameChild =catalogPage.categoryItemChild.getText();

        step("�������� �������� ������������ �������� � ������� ������������", () -> {
            catalogPage.categoryItemChildLink.click();
        });

        step("�������� ���������� � ��������� ��������� � ������������ ��������", () -> {
        catalogPage.breadcrumbCategoryItem.shouldHave(text(categoryName));
        catalogPage.breadcrumbCategoryItemChild.shouldHave(text(categoryNameChild));
        });

        step("�������� ��������� �������� � ��������� ������������", () -> {
            catalogPage.headerPage.shouldHave(text(categoryNameChild));
        });

        step("����������� �������� ���� �� � 1 ������� � ������ ������� ���������", () -> {
        catalogPage.findGood.exists();
        });

    }

    @Test
    public void shouldOpenItem(){
        catalogPage = new CatalogPage();
        open("/catalog/lekarstva-i-bady/antibakterialnye-preparaty/");

        catalogPage.categoryItemImage.click();

        catalogPage.headerPage.shouldHave(text("����������� �� �/� 500�� �3"));
    }
}