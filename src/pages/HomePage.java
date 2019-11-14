package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import util.Util;

public class HomePage extends BasePage{
    private Util util = new Util();

    @FindBy (xpath = "//div[@class='login-btn']")
    private WebElement loginButton;

    @FindBy (xpath = "//[@id='basic-navbar-nav']/div[@class='ml-auto-navbar']/div")
    private WebElement logoutButton;

    @FindBy(xpath = "//div[@class='register-btn']/a")
    private WebElement registerbtn;

    public void clickElement(By locator){
        getClickable(locator).click();
    }

    public void clickOnLogin() {
        wait.until(ExpectedConditions.visibilityOf(this.loginButton));
        this.loginButton.click();
    }

    public void openRegisterModal(String url){
        util.navigateToUrl(url);
        registerbtn.click();
    }
}
