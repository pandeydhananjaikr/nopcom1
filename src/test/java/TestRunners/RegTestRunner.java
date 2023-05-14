package TestRunners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
            features ="src/test/resources/Features/",
            glue ={"StepDefinitions"},
            tags = "@data",
            plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
            monochrome = true,
            publish = true
)
//public class RegTestRunner extends AbstractTestNGCucumberTests {

public class RegTestRunner  {

}
