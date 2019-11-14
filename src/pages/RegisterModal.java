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

    int increment = 0;

    void setUserNameField() {
        increment++;
        userNameField.sendKeys(System.getenv("USERNAME") + increment);
    }

    void setEmailField() {
        emailField.sendKeys(increment + System.getenv("EMAIL"));
    }

    void setPasswordField() {
        passwordField.sendKeys(System.getenv("PASSWORD"));
    }

    void clickRegisterBtn(){
        registerBtn.click();
    }

    public void doRegister(){
        setUserNameField();
        setEmailField();
        setPasswordField();
        clickRegisterBtn();
    }

    void waitRegisterModalDisappear(){
        wait.until(ExpectedConditions.invisibilityOf(registerModalWindow));
    }

    public boolean registerModalDisappears(){
        return registerModalWindow.isDisplayed();
    }
}
