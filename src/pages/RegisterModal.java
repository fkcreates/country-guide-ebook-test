package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterModal extends BasePage {

    @FindBy(xpath = "//input[@name='userName']")
    private WebElement userNameField;

}
