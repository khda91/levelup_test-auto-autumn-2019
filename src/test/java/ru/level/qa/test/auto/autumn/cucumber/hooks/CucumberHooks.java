package ru.level.qa.test.auto.autumn.cucumber.hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Attachment;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
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

    @After(order = 2)
    public void makeScreenshotTesFailure(Scenario scenario) {
        if (scenario.isFailed()) {
            System.out.println("make screenshot");
            makeScreenshot();
        }
    }

    @After(order = 1)
    public void tearDown() {
        System.out.println("tear down");
        TestContext.getDriver().quit();
    }

    @Attachment(value = "screenshot.png", type = "image/png")
    private byte[] makeScreenshot() {
        byte[] array = {1};
        try {
            return ((TakesScreenshot) TestContext.getDriver()).getScreenshotAs(OutputType.BYTES);
        } catch (WebDriverException e) {
            e.printStackTrace();
        }
        return array;
    }
}
