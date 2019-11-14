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

    @FindBy(xpath = "//input[@value='register']")
    private WebElement registerBtn;

    void setUserNameField() {
        userNameField.sendKeys(System.getenv("USERNAME"));
    }

    void setEmailField() {
        emailField.sendKeys(System.getenv("EMAIL"));
    }

    void setPasswordField() {
        passwordField.sendKeys(System.getenv("PASSWORD"));
    }

    void clickRegisterBtn(){
        registerBtn.click();
    }
}
