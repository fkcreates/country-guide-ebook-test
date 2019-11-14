package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginModal;
import util.Driver;

public class TestHomeNavigation {
    WebDriver driver = Driver.getInstance();
    String username;
    String password;
    HomePage home;
    LoginModal loginModal;

    @BeforeEach
    public void setUp(){
        home = new HomePage();
        loginModal = new LoginModal();
        driver.get("http://localhost:3000");
    }

    @Test
    public void successfulLogin(){
        username = System.getenv("USERNAME");
        password = System.getenv("PASSWORD");
        home.clickOnLogin();
        loginModal.doLogin(username, password);
    }

    @Test
    public void invalidCredentials(){
        home.clickOnLogin();
        loginModal.doLogin("cool", "canvas");
    }

    @Test
    public void emptyCredentials(){
        home.clickOnLogin();
        loginModal.doLogin("", "");
    }
}
