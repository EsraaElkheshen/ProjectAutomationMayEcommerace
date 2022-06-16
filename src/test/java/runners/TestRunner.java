package runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;


@CucumberOptions(
            features = "src/main/resources/features",
            glue = {"stepDefinations","Hooks"},
            //,dryRun = true,
             monochrome = true,
            tags = "@RunSmoke",
            plugin = {"pretty",
                    "html:target/cucumber.html",
                    "html:target/cucumber-report/cucumber.html",
                    "json:target/cucumber-report/cucumber.json",
                    "json:target/cucumber.json",
                    "junit:target/cukes.xml",
                    "rerun:target/rerun.txt",
                    "rerun:target/failed_scenarios.txt"}

    )


    public class TestRunner extends AbstractTestNGCucumberTests {
        public static WebDriver driver;
    }


