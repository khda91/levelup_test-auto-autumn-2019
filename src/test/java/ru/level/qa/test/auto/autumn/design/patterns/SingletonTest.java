package ru.level.qa.test.auto.autumn.design.patterns;

import design.patterns.Singleton;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SingletonTest {

    @BeforeClass
    public void setUp() {
        Singleton.getInstance().setValue("set up");
    }

    @Test
    public void singletonTest1() {
        System.out.println("Singleton value for test 1 ->" + Singleton.getInstance().getValue());
    }

    @Test
    public void singletonTest2() {
        System.out.println("Singleton value for test 2 ->" + Singleton.getInstance().getValue());
        Singleton.getInstance().setValue("Test 3");
    }

    @Test
    public void singletonTest3() {
        System.out.println("Singleton value for test 3 ->" + Singleton.getInstance().getValue());
    }
}
