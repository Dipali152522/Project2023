import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","json:target/cucumber.json","html:target/cucumber.html"}
        , features = "C:\\Projects\\Project2023\\HomePractice\\src\\test\\java\\features"
        , glue = {"browserControl","stepDefinitions"}
        , tags = ("@smokeTest")
)

public class TestRunner {
}
