package tests.base;

import common.CommonAction;
import org.junit.After;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import pages.base.BasePage;
import pages.home.HomePage;
import pages.main.MainPage;
import pages.productlist.ProductList;

import static common.Config.Browser_Close;
import static common.Config.Clear_Cookies_And_Storage;

public class BaseTest {
    public WebDriver driver = CommonAction.CommonActions.createDriver(); // создание драйвера
    public BasePage basePage = new BasePage(driver);//запуск страниц, далее наследники смогут работать с методами страницы
    public MainPage mainPage = new MainPage(driver);
    public HomePage homePage = new HomePage(driver);
    public ProductList productList = new ProductList(driver);

    @After
    public void clearCookiesAndStorage(){
        if(Clear_Cookies_And_Storage){
            JavascriptExecutor javascriptExecutor  = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }
    @AfterSuite(alwaysRun = true)
    public void browserClose(){
        if(Browser_Close){
            driver.quit();
        }
    }

}
