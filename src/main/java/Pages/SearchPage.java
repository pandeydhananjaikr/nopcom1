package Pages;

import Utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage {

    WebDriver driver = DriverManager.getDriver();
    By productTitles = By.xpath("//h2[@class = \"product-title\"]/a");

    public int getProductTitles(String item){
        List <WebElement> titles = driver.findElements(productTitles);
        int count=0;
        for (WebElement element:titles) {
            if (element.getText().toLowerCase().contains(item)){
                count++;
            }
        }
        return count;

    }

}
