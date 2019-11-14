package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginModal extends BasePage{

    @FindBy (css = ".form_button")
    private WebElement loginSubmit;

    @FindBy (xpath = "//div[@class='form-container']/form/input[@class='form_input' and @type='text']")
    private WebElement usernameField;

    @FindBy (xpath = "//div[@class='form-container']/form/input[@class='form_input' and @type='password']")
    private WebElement passwordField;

    @FindBy (xpath = "//[@id='content-auth']/form[@class='container']/div[@class='errorMsg']")
    private WebElement errorMessage;

    public LoginModal(){
        super();
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
}
