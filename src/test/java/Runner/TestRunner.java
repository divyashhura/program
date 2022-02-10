package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions
        (       features = {"C:\\Users\\DivyashSinghHura\\IdeaProjects\\BDD_Framework(POM)" +
                        "\\src\\test\\java\\Feature"},
                glue = {"StepDefinition"},
                dryRun = false,
                monochrome = true,
//              strict = true,
                plugin = {"pretty","json:Report/Cucumber.json","junit:Report/XMLReport.xml",
                        "html:Report/cucumberReport"}

        )
public class TestRunner {

}
