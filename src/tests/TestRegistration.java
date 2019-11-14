package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.RegisterModal;
import util.Util;

public class TestRegistration {
    Util util = new Util();
    String url = "http://localhost:3000/";

    @Test
    void testRegistration(){
        HomePage homePage = new HomePage();
        homePage.openRegisterModal(url);
        RegisterModal registerModal = new RegisterModal();
        registerModal.doRegister();

    }

    @AfterEach
    void teardown(){
        util.tearDown();
    }
}
