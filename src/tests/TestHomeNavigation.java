package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import util.Driver;

public class TestHomeNavigation {
    WebDriver driver = Driver.getInstance();


    @Test
    public void test(){
        driver.get("http://localhost:3000");
    }
}
