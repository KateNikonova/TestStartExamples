package web;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( features = {"classpath:features/web"},
        plugin = {
                "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"
        })
public class RunCucumberScenario extends AbstractTestNGCucumberTests {
}
