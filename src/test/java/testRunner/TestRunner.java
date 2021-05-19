package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C://Users//User//IdeaProjects//OrangeHrmCucumber//features//OhrmLogin.feature",
        glue = "stepDefinition",
        tags = "@Sanity",
        plugin = {"pretty","html:KavitReport/report/cucumber.html"}
)
public class TestRunner {
}
