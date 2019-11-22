package ru.level.qa.test.auto.autumn.test.framework.tests.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class CalculatorSumTest extends AbstractBaseTest {

    @Test
    public void simpleSumTest() {
        System.out.println(this.getClass().getName());
        double actual = calculator.sum(2, 2);
        assertEquals(actual, 4.0);
    }

    @DataProvider
    public Object[][] sumPositiveTestDataProvider() {
        return new Object[][]{
                {2, 2, 4.0},
                {4, 5, 9.0},
                {5, 0, 5.0}
        };
    }

    @DataProvider(name = "Negative Sum Test Data")
    public Object[][] sumNegativeTestDataProvider() {
        return new Object[][]{
                {2, 2, 5.0},
                {4, 5, 10.0},
                {5, 0, 2.0}
        };
    }

    @Test(dataProvider = "sumPositiveTestDataProvider")
    public void positiveDataProviderSumTest(int a, int b, double expected) {
        System.out.println(this.getClass().getName());
        double actual = calculator.sum(a, b);
        assertEquals(actual, expected);
    }

    @Test(dataProvider = "Negative Sum Test Data")
    public void negativeDataProviderSumTest(int a, int b, double expected) {
        System.out.println(this.getClass().getName());
        double actual = calculator.sum(a, b);
        assertNotEquals(actual, expected);
    }
}
