package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Wait extends WebDriverWait {
    static WebDriver driver = (WebDriver) Driver.getInstance();
    private static Wait single_instance = null;

    private Wait(WebDriver driver, long timeOutInSeconds) {
        super(driver, timeOutInSeconds);
    }

    public static Wait getInstance()
    {
        if (single_instance == null)
            single_instance = new Wait(driver, 5);

        return single_instance;
    }
}
