package ru.level.qa.test.auto.autumn.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(tags = "@test1",
        plugin = {"io.qameta.allure.cucumberjvm.AllureCucumberJvm"})
public class RunAcceptance extends AbstractTestNGCucumberTests {

}
