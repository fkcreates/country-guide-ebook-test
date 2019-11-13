package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginModal extends BasePage{

    @FindBy (css = ".form_button")
    private WebElement loginSubmit;

    @FindBy (xpath = "//div[@class='form-container']/form/input[@class='form_input' and @type='text']")
    private WebElement usernameField;

    @FindBy (xpath = "//div[@class='form-container']/form/input[@class='form_input' and @type='password']")
    private WebElement passwordField;

    public LoginModal(){
        super();
    }

    public void setUsername(){
        String username = System.getenv("USERNAME");
        System.out.println(username);
        usernameField.sendKeys(username);
    }

    public void setPassword(){
        String password = System.getenv("PASSWORD");
        System.out.println(password);
        passwordField.sendKeys(password);
    }

    public void clickOnLoginSumbit(){
        loginSubmit.click();
    }
}
