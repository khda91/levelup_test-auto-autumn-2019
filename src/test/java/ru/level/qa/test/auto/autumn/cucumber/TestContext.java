package ru.level.qa.test.auto.autumn.cucumber;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;

public final class TestContext {

    private static WebDriver driver;

    private static Map<String, String> testMap = new HashMap<>();

    private TestContext() {
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        TestContext.driver = driver;
    }

    public static void setTestData(String key, String value) {
        testMap.put(key, value);
    }

    public static String getTestData(String key) {
        return testMap.get(key);
    }
}
