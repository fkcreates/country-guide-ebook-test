package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.Driver;
import util.Util;

public class HomePage extends BasePage{

    @FindBy(xpath = "//div[@class='register-btn']/a")
    private WebElement registerbtn;

    private Util util = new Util();
    public void clickElement(By locator){
        getClickable(locator).click();
    }

    public void openRegisterModal(String url){
        util.navigateToUrl(url);
        registerbtn.click();
    }
}
