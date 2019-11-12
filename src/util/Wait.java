package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Wait {
    WebDriverWait wait;

    private static Wait single_instance = null;

    // private constructor restricted to this class itself
    private Wait()
    {
        WebDriver driver = (WebDriver) Driver.getInstance();
        wait = new WebDriverWait(driver, 4);
    }

    // static method to create instance of Singleton class
    public static Wait getInstance()
    {
        if (single_instance == null)
            single_instance = new Wait();

        return single_instance;
    }
}
