package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features= {"C:\\Users\\DivyashSinghHura\\IdeaProjects\\BDD_Framework\\src" +
                        "\\test\\java\\Feature\\Login.feature"},
                glue= {"StepDefinition"},
                //dryRun = true,
                monochrome = true,
                strict = true,
                plugin = {"pretty","json:Report/Cucumber.json",
                        "junit:Report/CucumberXML.xml",
                        "html:Report/CucumberHtml"
                }
        )
public class TestRunner {

}
