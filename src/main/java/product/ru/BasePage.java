package product.ru;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public abstract class BasePage {

   public SelenideElement headerPage = $("#pagetitle");
   public SelenideElement cookiesPopup = $(".top_mobile_region");

}
