package com.Library.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(

           plugin = {
                   "html:target/cucumber-report.html",
                   "json:target/cucumber.json",
                   // telling which line is failed
                   "rerun:target/rerun.txt"

            },

            features = "src/test/resources/features",
            glue = "com/Library/step_defenitions",
            dryRun = true,
            tags = "wip"

    )

    public class CukesRunner{


}
