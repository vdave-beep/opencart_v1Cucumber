package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                //features = {".//features/"},
               features= {".//features/Login.feature", ".//features/AccountRegistration.feature"},
                //features= {".//features/LoginDDT.feature"},


                //features="@target/rerun.txt",  // Runs only failures
                glue="stepDefinitions",
                plugin= {"pretty",
                        //"html:reports/myreport.html",
                        "html:reports/myreport.html",
                        "json:reports/myreport.json",
                        "rerun:target/rerun.txt",    //Mandatory to capture failures
                },
                dryRun=false,
                monochrome=true

                //tags="@sanity" //scenarios tagged with sanity
                //tags="@sanity and @regression"// scenarios tagged both sanity and regression
                //tags="@sanity or @regression" // scenarios tagged sanity or regression
                //tags="@regression"//scenarios tagged with regression
                //tags="@sanity and not @regression"//scenarios tagged with sanity but not regression

        )





public class Testrun {
}
