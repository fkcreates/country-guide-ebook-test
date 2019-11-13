package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.Util;

public class HomePage extends BasePage{

    @FindBy(xpath = "//div[@class='register-btn']/a")
    private WebElement registerbtn;

    public void clickElement(By locator){
        getClickable(locator).click();
    }

    public void openRegisterModal(){
        registerbtn.click();
    }
}
