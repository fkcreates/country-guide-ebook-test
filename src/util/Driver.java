package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    static WebDriver driver;

    public static WebDriver getInstance() {
        if (driver == null)
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        return driver;
    }

    public void navigateToUrl(String url) {
        driver.get(url);
    }

    public void tearDown(){
        driver.quit();
    }
}
