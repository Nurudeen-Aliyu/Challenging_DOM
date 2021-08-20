package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/src/test/resources/features", //Path to the Features file
        glue = {"stepDefinitions"} //
)
public class RunCukeTest {
}
