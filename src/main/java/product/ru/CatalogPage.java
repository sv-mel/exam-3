package product.ru;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CatalogPage extends BasePage {

//    public By categoryPanel = new By.ByClassName(".menu-row middle-block bglight .dropdown-toggle");

  //  public SelenideElement categoryItem = $$(".catalog_item main_item_wrapper item_wrap").first();
 //   public SelenideElement categoryItemFirst = categoryItem.$(".image_wrapper_block");
    public SelenideElement categoryItemImage = $("#bx_3966226736_112619_pict");

    public SelenideElement findGood = $$(".catalog_item main_item_wrapper item_wrap ").get(0);


    public SelenideElement categoryItem = $$(".dropdown-toggle").get(3);

    public SelenideElement categoryItemChild = $("#bx_1847241719_511");
    public SelenideElement categoryItemChildLink = categoryItemChild.$(".dark_link");

    public SelenideElement breadcrumbCategoryItem = $("#bx_breadcrumb_2");
    public SelenideElement breadcrumbCategoryItemChild = $$(".bx-breadcrumb-item--mobile").get(3);

    public SelenideElement leftMenuCategoryItem = $(".menu dropdown");
    public SelenideElement leftMenuCategoryItemName = leftMenuCategoryItem.$$(".icons_fa parent").get(3);








//    public SelenideElement categoryItem = $(".catalog_item main_item_wrapper item_wrap");


//
//    public By categoryMakeupLink = new By.ByCssSelector("[href=\"/catalog/kosmetika/\"]");
//
//    public By categoryListElement = new By.ByCssSelector("href=\"/catalog/kosmetika/geli-dlya-dusha/\"");



    //отложенные

  //  public By savedProducts = By.className("basket-link delay with_price big ");

//    wrap_icon inner-table-block baskets big-padding"

}
