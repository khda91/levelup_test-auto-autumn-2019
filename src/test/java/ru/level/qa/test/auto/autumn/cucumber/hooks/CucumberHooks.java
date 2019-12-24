package ru.level.qa.test.auto.autumn.cucumber.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.level.qa.test.auto.autumn.cucumber.TestContext;

public final class CucumberHooks {

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        TestContext.setDriver(new ChromeDriver());
        TestContext.getDriver().manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        TestContext.getDriver().get("http://users.bugred.ru/");
    }

    @After
    public void tearDown() {
        TestContext.getDriver().quit();
    }
}
