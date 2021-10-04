package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/retotest.feature"},
        glue = {"stepdefinition"},
        plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:output/report.html"}
)

public class TestRunner {
}
