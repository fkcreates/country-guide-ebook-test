package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{

    @FindBy (xpath = "//div[@class='login-btn']")
    private WebElement loginButton;

    @FindBy (xpath = "//div[@id='basic-navbar-nav']/div[@class='ml-auto navbar-nav']/div/a[@class='nav-link']")
    private WebElement logoutButton;

    @FindBy(xpath = "//div[@class='register-btn']/a")
    private WebElement registerBtn;

    public void clickElement(By locator){
        getClickable(locator).click();
    }

    public void clickOnLogin() {
        wait.until(ExpectedConditions.visibilityOf(this.loginButton));
        this.loginButton.click();
    }

    public void openRegisterModal(){
        this.registerBtn.click();
    }

    public boolean logoutBtnAppears(){
        wait.until(ExpectedConditions.visibilityOf(this.logoutButton));
        return this.logoutButton.isDisplayed();
    }

    public void clickOnLogout() {
        WebElement logout = driver.findElement(By.xpath("//div[@id='basic-navbar-nav']/div[@class='ml-auto navbar-nav']/div/a[@class='nav-link']"));
        wait.until(ExpectedConditions.visibilityOf(logout));
        logout.click();
    }

    public void waitForLoginModalToDisappear(){
        WebElement loginModal = driver.findElement(By.xpath("//div[@id='content-auth']"));
        wait.until(ExpectedConditions.invisibilityOf(loginModal));
    }
}
