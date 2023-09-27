package com.liblar_bibliothek.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt" ,
                "junit:target/junit/junit-report.xml",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber.json"
        },
        features = "src/test/resources/features",
        glue = "com/liblar_bibliothek/steps",
        dryRun =false,
        tags = "@wip"
)
public class CukesRunner {

}
