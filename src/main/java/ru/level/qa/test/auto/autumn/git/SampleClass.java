package ru.level.qa.test.auto.autumn.git;

public class SampleClass {

    public static void main(String[] args) {
        System.out.println("Hello git");
        GitCredentials gc = new GitCredentials("vasya", "vasya");
        System.out.println(gc);
    }
}
