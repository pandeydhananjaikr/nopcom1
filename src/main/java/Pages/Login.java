package Pages;

import DriverUtil.DriverManager;
import org.openqa.selenium.By;
public class Login {
    By loginBtn = By.linkText("Log in");
    public void clkLogin(){
        DriverManager.getDriver().findElement(loginBtn).click();
    }

}
