package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    WebDriver driver;
    private static Driver single_instance = null;

    // private constructor restricted to this class itself
    private Driver()
    {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    // static method to create instance of Singleton class
    public static Driver getInstance()
    {
        if (single_instance == null)
            single_instance = new Driver();

        return single_instance;
    }

    public void navigateToUrl(String url) {
        driver.get(url);
    }

    public void tearDown(){
        driver.quit();
    }
}
