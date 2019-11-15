package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.Driver;
import util.Util;
import util.Wait;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    private Util util = new Util();

    public BasePage(){
        driver = Driver.getInstance();
        wait = Wait.getInstance();
        PageFactory.initElements(driver, this);
    }

    public WebElement getClickable(By locator){
        return util.getClickable(locator);
    }
}
