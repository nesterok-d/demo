package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static constants.Constants.TimeoutVariable.IMPLICIT_WAIT;

public class CommonAction {


    //описание запуска браузера
    public class CommonActions {
        public static WebDriver createDriver() {
            WebDriver driver = null;

            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            return driver;
        }
    }
}
