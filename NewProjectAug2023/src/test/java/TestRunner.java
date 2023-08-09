import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"}
                , features = "C:\\Projects\\Project2023\\NewProjectAug2023\\src\\test\\java\\features"
        , glue = {"browserControl", "stepDefinitions"}
        , tags = ("@smokeTest")
)

public class TestRunner {
}
