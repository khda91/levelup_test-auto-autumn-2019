package ru.level.qa.test.auto.autumn.test.framework.tests.junit5;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class Junit5SimpleTest1 {

    @Test
    public void test1() {
        System.out.println("Junit5SimpleTest1.test1");
        assertThat(2 - 2, equalTo(0));
    }
}
