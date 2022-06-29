package pages.base;

import org.openqa.selenium.WebDriver;

public class BasePage {

    public WebDriver driver; //создаем переменную driver доступную всем наследникам класса


    public BasePage(WebDriver driver) { //передача драйвера
        this.driver = driver;
    }

    public void open(String url){ //передача ссылки н астраницу
        driver.get(url);
    }
}
