package ru.level.qa.test.auto.autumn.test.framework.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class CalculatorMultiply1Test extends AbstractBaseTest {

    @Test
    public void simpleMultiplyTest() {
        System.out.println(this.getClass().getName());
        double actual = calculator.multiply(2, 2);
        assertEquals(actual, 4.0);
    }

    @DataProvider
    public Object[][] multiplyPositiveTestDataProvider() {
        return new Object[][]{
                {2, 2, 4.0},
                {4, 5, 20.0},
                {5, 0, 0.0}
        };
    }

    @DataProvider(name = "Negative Multiply Test Data")
    public Object[][] multiplyNegativeTestDataProvider() {
        return new Object[][]{
                {2, 2, 5.0},
                {4, 5, 10.0},
                {5, 0, 2.0}
        };
    }

    @Test(dataProvider = "multiplyPositiveTestDataProvider")
    public void positiveDataProviderMultiplyTest(int a, int b, double expected) {
        System.out.println(this.getClass().getName());
        double actual = calculator.multiply(a, b);
        assertEquals(actual, expected);
    }

    @Test(dataProvider = "Negative Multiply Test Data")
    public void negativeDataProviderMultiplyTest(int a, int b, double expected) {
        System.out.println(this.getClass().getName());
        double actual = calculator.multiply(a, b);
        assertNotEquals(actual, expected);
    }

    @Test
    public void assertDeltaTest() {
        assertEquals(3.41 - 1.40, 2);
    }
}
