package pages.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    private final By currency = By.cssSelector("button.dropdown-toggle span.hidden-xs"); //валюта
    private final By phone = By.xpath("//i[@class='fa fa-phone']"); //телефон
    private final By account = By.cssSelector("a[title ='My Account']");//аккаунт
    private final By wishlist = By.id("wishlist-total"); //избранное
    private final By cart = By.cssSelector("a[title='Shopping Cart']");//корзина
    private final By checkout = By.cssSelector("a[title='Checkout']");//checkout
    private final By title = By.cssSelector("h1");//название магазина
    private final By cerch = By.cssSelector("input[type='text']"); //поисковая строка
    private final By cerchButton = By.cssSelector("span.input-group-btn");//кнопка поиска
    private final By cartButton = By.id("cart");
    private final By manu = By.cssSelector("ul.navbar-nav>li");//меню








}


