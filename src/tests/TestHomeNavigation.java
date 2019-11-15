package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.LoginModal;
import util.Util;

public class TestHomeNavigation {
    String homeUrl = "http://localhost:3000";
    String username;
    String password;
    HomePage home;
    LoginModal loginModal;
    Util util = new Util();

    @BeforeEach
    public void setUp(){
        home = new HomePage();
        loginModal = new LoginModal();
        util.navigateToUrl(homeUrl);
    }

    @Test
    public void successfulLogin(){
        username = System.getenv("USERNAME");
        password = System.getenv("PASSWORD");
        home.clickOnLogin();
        loginModal.doLogin(username, password);
        home.waitForLoginModalToDisappear();
        Assertions.assertTrue(home.logoutBtnAppears());
        home.clickOnLogout();
    }

    @Test
    public void invalidCredentials(){
        home.clickOnLogin();
        loginModal.doLogin("cool", "canvas");
        WebElement error = loginModal.getErrorForInvalidPass();
        Assertions.assertTrue(loginModal.isErrorDisplayed(error), "Error message for invalid credentials is not displayed");
    }

    @Test
    public void emptyCredentials(){
        home.clickOnLogin();
        loginModal.doLogin("", "");
        WebElement errorUser = loginModal.getErrorForEmptyUser();
        WebElement errorPass = loginModal.getErrorForEmptyPass();
        Assertions.assertTrue(loginModal.isErrorDisplayed(errorUser), "Empty user error message is not displayed");
        Assertions.assertTrue(loginModal.isErrorDisplayed(errorPass), "Empty pass error message is not displayed");

    }
}
