package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final By Featured = By.cssSelector("div.row div.product-layout"); //карточки товаров на главной странице
    private final By leftMenu = By.cssSelector("div.list-group"); //левое меню на главной странице
    private final By title2 = By.cssSelector("h2"); //название раздела
    private final By refineSearch = By.cssSelector("h3~div>div.col-sm-3"); //вкладки
    private final By listView = By.id("list-view"); //список
    private final By gridView = By.id("grid-view"); //таблица
    private final By product = By.cssSelector("div.product-layout");//карточки товаров
    private final By sort = By.id("input-sort"); //сортировака
    private final By limit = By.id("input-limit"); //количество товаров на странице









}
