package ru.level.qa.test.auto.autumn.cucumber;

import io.qameta.allure.Attachment;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScreenshotListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("===============");
        makeScreenshot();
    }

    @Attachment(value = "screenshot.png", type = "image/png")
    private byte[] makeScreenshot() {
        TakesScreenshot screenshot = (TakesScreenshot) TestContext.getDriver();
        byte[] screenshotFile = screenshot.getScreenshotAs(OutputType.BYTES);
        return screenshotFile;
    }
}
