package ru.level.qa.test.auto.autumn.test.framework.tests.junit5;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
//@SelectClasses({Junit5SimpleTest.class, Junit5SimpleTest1.class})
@SelectPackages("ru.level.qa.test.auto.autumn.test.framework.tests.junit5")
public class RunTest {
}
