package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegisterModal extends BasePage {

    @FindBy(xpath = "//input[@name='userName']")
    private WebElement userNameField;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@value='Register']")
    private WebElement registerBtn;

    @FindBy(id = "container")
    private WebElement registerModalWindow;

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

    public void waitRegisterModalDisappear(){
        wait.until(ExpectedConditions.invisibilityOf(registerModalWindow));
    }

    public boolean registerModalDisappears(){
        return registerModalWindow.isDisplayed();
    }
}
