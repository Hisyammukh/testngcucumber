package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    plugin = {
      "pretty",
      "html:target/cucumber-reports/cucumber.html",
      "json:target/cucumber-reports/cucumber.json",
      "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
    },
    features = {"src/test/resources/features/test.feature"},
    glue = {"steps"},
    tags = "@smoke")
public class TestRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
