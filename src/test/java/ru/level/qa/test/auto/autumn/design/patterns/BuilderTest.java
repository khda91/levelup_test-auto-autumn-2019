package ru.level.qa.test.auto.autumn.design.patterns;

import design.patterns.User;
import org.testng.annotations.Test;

public class BuilderTest {

    @Test
    public void BuilderTest() {
        User user = User.builder().setFirstName("User")
                .setLastName("Builder")
                .setAge(1)
                .build();
        System.out.println(user);
    }
}
