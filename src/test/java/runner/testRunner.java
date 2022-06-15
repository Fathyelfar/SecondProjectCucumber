package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
          features = "src/main/resources/features",
          glue = {"stepDefinition"}, plugin = { "pretty" , "html:target/cucumber.html",
          "json:target/cucumber.html","junit:target/cukes.xml",
           "rerun:target/rerun.txt"},tags = "@smoke"



        )

public class testRunner extends AbstractTestNGCucumberTests {
}
