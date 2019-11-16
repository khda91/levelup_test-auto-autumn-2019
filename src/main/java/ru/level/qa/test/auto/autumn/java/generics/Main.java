package ru.level.qa.test.auto.autumn.java.generics;

import ru.level.qa.test.auto.autumn.java.collections.Horse;

public class Main {

    public static void main(String[] args) {
//        Pair<String, Integer> a = new Pair<>("Vasya", 10);
//        Pair<String, String> b = new Pair<>("mama", "Lena");
        Pair<Horse, Horse> c = new Pair<>(new Horse("Сахарок", "Степная", 10),
                new Horse("Печенька", "Беговая", 20));
        Pair<RunningHorse, Integer> d = new Pair<>();

//        System.out.println(a);
//        System.out.println(b);
        System.out.println(c);

//        c.setSecond("uwehiewpejvdvkabs,dhvbd.sjvlk");
    }
}
