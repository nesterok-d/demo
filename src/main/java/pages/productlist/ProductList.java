package pages.productlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class ProductList extends BasePage {
    public ProductList(WebDriver driver) {
        super(driver);
    }

    private final By leftMenu = By.cssSelector("div.list-group"); //левое меню на странице раздела
    private final By title2 = By.cssSelector("h2"); //название раздела
    private final By refineSearch = By.cssSelector("h3~div>div.col-sm-3"); //вкладки
    private final By listView = By.id("list-view"); //список
    private final By gridView = By.id("grid-view"); //таблица
    private final By product = By.cssSelector("div.product-layout");//карточки товаров
    private final By sort = By.id("input-sort"); //сортировака
    private final By limit = By.id("input-limit"); //количество товаров на странице
    private final By breadcrumb = By.cssSelector("ul.breadcrumb"); //хлкбные крошки
}
