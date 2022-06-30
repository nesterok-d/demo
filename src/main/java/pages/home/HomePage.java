package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final By Featured = By.cssSelector("div.row div.product-layout"); //карточки товаров на главной странице










}
