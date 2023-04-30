package DriverUtil;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    public static WebDriver wd;
    public static void initDriver(){
        WebDriverManager.firefoxdriver().setup();
        wd = new FirefoxDriver();
        DriverManager.setDriver(wd);
    }

    public static void tearDown(){
        DriverManager.getDriver().quit();
    }
}
