package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Util {
    WebDriver driver = Driver.getInstance();

    public WebElement getClickable(By locator) {
        WebElement clickable = driver.findElement(locator);
        return clickable;
    }

    public void navigateToUrl(String url) {
        driver.get(url);
    }

    public void tearDown(){
        driver.quit();
    }
}
