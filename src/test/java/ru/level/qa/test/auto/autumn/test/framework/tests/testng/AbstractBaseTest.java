package ru.level.qa.test.auto.autumn.test.framework.tests.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import ru.level.qa.test.auto.autumn.test.framework.Calculator;

public abstract class AbstractBaseTest {

    protected Calculator calculator;

    @BeforeSuite
    public void setUpSuite() {
        System.out.println("===== Before Suite =====");
    }

    @BeforeTest
    public void setUpTest() {
        System.out.println("===== Before Test =====");
    }

    @BeforeClass
    public void setUpClass() {
        System.out.println("===== Before Class =====");
    }

    @BeforeMethod
    public void setUp() {
        System.out.println("===== Before Method =====");
        calculator = new Calculator();
    }

    @AfterMethod
    public void tearDown() {
        calculator = null;
        System.out.println("===== After Method =====");
    }

    @AfterClass
    public void tearDownClass() {
        System.out.println("===== After Class =====");
    }

    @AfterTest
    public void tearDownTest() {
        System.out.println("===== After Test =====");
    }

    @AfterSuite
    public void tearDownSuite() {
        System.out.println("===== After Suite =====");
    }
}
