package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.Driver;
import util.Util;
import util.Wait;

public class BasePage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Util util = new Util();

    public BasePage(){
        driver = (WebDriver) Driver.getInstance();
        wait = Wait.getInstance();
    }

    public WebElement getClickable(By locator){
        return util.getClickable(locator);
    }
}
