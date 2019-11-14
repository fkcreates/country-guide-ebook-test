package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.RegisterModal;
import util.Driver;
import util.Util;

import java.util.Random;

public class TestRegistration {
    private Util util = new Util();
    private WebDriver driver = Driver.getInstance();

    private String url = "http://localhost:3000/";

    private RegisterModal registerModal;
    private HomePage homePage;

    private Random random = new Random();
    private int increment = random.nextInt(10000);

    private String usrnm = System.getenv("USERNAME") + increment;
    private String mail = increment + System.getenv("EMAIL");
    private String pwd = System.getenv("PASSWORD");


    @BeforeEach
    public void setUp(){
        homePage = new HomePage();
        registerModal = new RegisterModal();
        driver.get(url);
    }

    @Test
    void testRegistration(){
        homePage.openRegisterModal();
        registerModal.doRegister(usrnm, mail, pwd);
        Assertions.assertFalse(registerModal.registerModalDisappears());
    }

    @AfterEach
    void teardown(){
        util.tearDown();
    }
}
