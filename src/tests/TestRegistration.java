package tests;

import org.junit.jupiter.api.Test;
import pages.HomePage;

public class TestRegistration {

    String url = "http://localhost:3000/";

    @Test
    void testRegistration(){
        HomePage homePage = new HomePage();
        homePage.openRegisterModal(url);


    }
}
