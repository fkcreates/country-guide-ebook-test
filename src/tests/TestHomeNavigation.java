package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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
        Assertions.assertTrue(home.logoutBtnAppears());
        home.clickOnLogout();
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
