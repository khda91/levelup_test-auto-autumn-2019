package ru.level.qa.test.auto.autumn.design.patterns;

import design.patterns.EnumSingleton;
import design.patterns.Singleton;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EnumSingletonTest {

    @BeforeClass
    public void setUp() {
        EnumSingleton.INSTANCE.setValue("set up");
    }

    @Test
    public void singletonTest1() {
        System.out.println("Singleton value for test 1 ->" + EnumSingleton.INSTANCE.getValue());
    }

    @Test
    public void singletonTest2() {
        System.out.println("Singleton value for test 2 ->" + EnumSingleton.INSTANCE.getValue());
        EnumSingleton.INSTANCE.setValue("Test 3");
    }

    @Test
    public void singletonTest3() {
        System.out.println("Singleton value for test 3 ->" + EnumSingleton.INSTANCE.getValue());
    }
}
