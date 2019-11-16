package ru.level.qa.test.auto.autumn.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetObjectExamples {

    public static void main(String[] args) {
        Horse h1 = new Horse("Вафелька", "Гнядая", 10);
        Horse h2 = new Horse("Сахарок", "Верховая", 10);
        Horse h3 = new Horse("Печенька", "Мустанг", 20);
        Horse h4 = new Horse("Карамелька", "Степная", 20);
        Horse h5 = new Horse("Компот", "Гнядая", 11);
        Horse h6 = new Horse("Коржик", "Верховая", 12);
        Horse h7 = new Horse("Эклерчик", "Пони", 13);
        Horse h8 = new Horse("Зефирка", "Сопртивная", 15);

        Set<Horse> horses = new HashSet<>();
        horses.addAll(Arrays.asList(h1, h2, h3, h4, h5, h6, h7, h8));
        prtint(horses);

        Horse h9 = new Horse("Вафелька", "Гнядая", 10);
        horses.add(h9);
        System.out.println();
        prtint(horses);

//        TreeSet<Horse> horseTree = new TreeSet<>();
        TreeSet<Horse> horseTree = new TreeSet<>(new Comparator<Horse>() {
            @Override
            public int compare(Horse o1, Horse o2) {
                if (o1.getMaxSpeed() > o2.getMaxSpeed()) {
                    return 1;
                }
                if (o1.getMaxSpeed() < o2.getMaxSpeed()) {
                    return -1;
                }
                return 0;
            }
        });
        horseTree.addAll(horses);
        prtint(horseTree);
    }

    static void prtint(Set<Horse> horses) {
        System.out.println("========");
        for (Horse horse : horses) {
            System.out.println(horse);
        }
        System.out.println("========");
    }
}
