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
}
