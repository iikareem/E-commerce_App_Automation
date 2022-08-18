package RUNNERS;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ="src\\main\\resources\\features",
        glue ="Step_definition",
        plugin = { "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"},
        tags="@smoke"

)

public class TRUN extends AbstractTestNGCucumberTests {
}
