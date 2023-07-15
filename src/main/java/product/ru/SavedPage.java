package product.ru;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SavedPage extends BasePage {

    public SelenideElement buttonSavedGood = $(".like_icons iblock");

    public SelenideElement icon = $$(".wrap_icon inner-table-block baskets big-padding").get(0);
    public SelenideElement iconText = icon.$(".basket-link delay with_price big  basket-count");

    public SelenideElement basketBlock = $("#basket-item-table");
    public SelenideElement basketItemPrice = basketBlock.$(".basket-items-list-item-price basket-items-list-item-price-for-one");
    public SelenideElement priceItem = basketItemPrice.$(".basket-items-list-item-price basket-items-list-item-price-for-one");
    public SelenideElement priceItemForOne = priceItem.$(".basket-item-price-current-text");
    public SelenideElement buttonSaved = $(By.xpath("//span[@class='js-basket-block']/ancestor::a"));
    public SelenideElement labelCount = $$(".basket-coupon-block-total-price-current").get(0);





}
