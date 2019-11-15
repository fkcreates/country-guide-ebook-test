package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginModal extends BasePage{

    @FindBy (css = ".form_button")
    private WebElement loginSubmit;

    @FindBy (xpath = "//div[@class='form-container']/form/input[@class='form_input' and @type='text']")
    private WebElement usernameField;

    @FindBy (xpath = "//div[@class='form-container']/form/input[@class='form_input' and @type='password']")
    private WebElement passwordField;

    @FindBy (xpath = "//div[@id='content-auth']/div[@class='form-container']/form/div[@class='errorMsg'][3]")
    private WebElement errorMessageForInvalidLogin;

    @FindBy (xpath = "//div[@id='content-auth']/div[@class='form-container']/form/div[@class='errorMsg'][1]")
    private WebElement errorMessageForEmptyUser;

    @FindBy (xpath = "//div[@id='content-auth']/div[@class='form-container']/form/div[@class='errorMsg'][2]")
    private WebElement errorMessageForEmptyPass;

    public LoginModal(){
        super();
    }

    public WebElement getErrorForEmptyUser(){
        return this.errorMessageForEmptyUser;
    }

    public WebElement getErrorForEmptyPass(){
        return this.errorMessageForEmptyPass;
    }

    public WebElement getErrorForInvalidPass(){
        return this.errorMessageForInvalidLogin;
    }

    public void setUsername(String username){
        usernameField.sendKeys(username);
    }

    public void setPassword(String password){
        passwordField.sendKeys(password);
    }

    public void clickOnLoginSumbit(){
        loginSubmit.click();
    }

    public void doLogin(String username, String password){
        this.setUsername(username);
        this.setPassword(password);
        this.clickOnLoginSumbit();
    }

    public boolean isErrorDisplayed(WebElement errormessage){
        wait.until(ExpectedConditions.visibilityOf(errormessage));
        return errormessage.isDisplayed();
    }
}
