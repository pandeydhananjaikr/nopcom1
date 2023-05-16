package StepDefinitions;
import Utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static Utils.DriverManager.driver;

public class Hooks {

    @Before()
    public void open() {
        Driver.initDriver();

    }

    @AfterStep
    public void captureScreenshot(Scenario scenario){

        if (scenario.isFailed()){
            final byte [] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png", "screenshot" );
        }
    }

    @After
    public void close() {
        Driver.tearDown();
    }


}
