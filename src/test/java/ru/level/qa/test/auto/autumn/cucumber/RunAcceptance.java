package ru.level.qa.test.auto.autumn.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Listeners;

@CucumberOptions(tags = "@test1",
plugin = {"io.qameta.allure.cucumberjvm.AllureCucumberJvm"})
@Listeners({ScreenshotListener.class})
public class RunAcceptance extends AbstractTestNGCucumberTests {

}
