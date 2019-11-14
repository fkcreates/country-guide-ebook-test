package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterModal extends BasePage {

    @FindBy(xpath = "//input[@name='userName']")
    private WebElement userNameField;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@value='Register']")
    private WebElement registerBtn;

    @FindBy(xpath = "//div[@id='basic-navbar-nav']/div/div/a")
    private WebElement logoutBtn;

    private void setUserNameField(String username) {
        userNameField.sendKeys(username);
    }

    private void setEmailField(String mail) {
        emailField.sendKeys(mail);
    }

    private void setPasswordField(String pwd) {
        passwordField.sendKeys(pwd);
    }

    private void clickRegisterBtn(){
        registerBtn.click();
    }

    public void doRegister(String username, String mail, String pwd){
        setUserNameField(username);
        setEmailField(mail);
        setPasswordField(pwd);
        clickRegisterBtn();
    }
}
