package StepDefinitions;

import DriverUtil.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    @Before()
    public void open(){
        Driver.initDriver();
    }

    @After
    public void close(){
        Driver.tearDown();
    }


}
