package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "/Users/bhanufs/cucumber-selenium-tests/src/main/java/features",
    glue = "stepDefinitions",
    dryRun = false,
    plugin = {"pretty", "json:testResult"}
)
public class TestRunner {
}
