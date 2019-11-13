package tests;

import org.junit.jupiter.api.Test;
import pages.HomePage;

public class TestRegistration {

    @Test
    void testRegistration(){
        HomePage homePage = new HomePage();
        homePage.openRegisterModal();

    }
}
