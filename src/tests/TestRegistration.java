package tests;

import org.junit.jupiter.api.Test;
import pages.HomePage;

public class TestRegistration {

    String url = "";

    @Test
    void testRegistration(){
        HomePage homePage = new HomePage();
        homePage.openRegisterModal();

    }
}
