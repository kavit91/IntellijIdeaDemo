package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C://Users//User//IdeaProjects//OrangeHrmCucumber//features//OrangeHRMLoginDemo.feature",
        glue = "stepDefs",
        tags = "@Smoke"
)
public class OrangeHrmTestRunner {
}
