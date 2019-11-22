package ru.level.qa.test.auto.autumn.test.framework.tests.junit;

import java.util.stream.Stream;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import ru.level.qa.test.auto.autumn.test.framework.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SimpleTest {

    @Test
    public void sumTest() {
        Calculator calculator = new Calculator();
        double actual = calculator.sum(2, 2);
        assertEquals(4.0, actual);
    }

    @ParameterizedTest
    @EnumSource(TimeUnit.class)
    public void enumTest(TimeUnit timeUnit) {
        System.out.println(timeUnit);
        assertNotNull(timeUnit);
    }

    @ParameterizedTest
    @MethodSource("positiveValues")
    @Tag("positive")
    public void sumPositiveTest(int a, int b, int expected) {
        Calculator calculator = new Calculator();
        double actual = calculator.sum(a, b);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("negativeValues")
    @Tag("negative")
    public void sumNegativeTest(int a, int b, int expected) {
        Calculator calculator = new Calculator();
        double actual = calculator.sum(a, b);
        assertNotEquals(expected, actual);
    }

    static Stream<Arguments> positiveValues() {
        return Stream.of(
                Arguments.arguments(1, 2, 3),
                Arguments.arguments(4, 5, 9)
        );
    }

    static Stream<Arguments> negativeValues() {
        return Stream.of(
                Arguments.arguments(1, 2, 4),
                Arguments.arguments(4, 5, 10)
        );
    }
}
