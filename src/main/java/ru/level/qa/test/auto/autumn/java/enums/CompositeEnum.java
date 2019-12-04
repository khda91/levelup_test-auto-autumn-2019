package ru.level.qa.test.auto.autumn.java.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum CompositeEnum {

    VASYA("Vasily", "Vasilev",
            new ArrayList<String>(Arrays.asList("", "", ""))),
    PETYA("Peter", "Petrov",
            new ArrayList<String>(Arrays.asList("", "", ""))),
    SEMA("Semen", "Semenov",
            new ArrayList<String>(Arrays.asList("", "", "")));

    private String firstName;
    private String lastName;
    private List<String> list;

    CompositeEnum(String firstName, String lastName, List<String> list) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.list = list;
    }
}
