package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Util {
    WebDriver driver = (WebDriver) Driver.getInstance();

    public WebElement getClickable(By locator) {
        WebElement clickable = driver.findElement(locator);
        return clickable;
    }
}
