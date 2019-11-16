package ru.level.qa.test.auto.autumn.java.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {

    public static void main(String[] args) {
        System.out.println("HashSet");
        hashSetStringExample();
        System.out.println("LinkedSet");
//        linkedSetStringExample();
        System.out.println("TreeSet");
//        treeSetStringExample();
    }

    static void hashSetStringExample() {
        Set<String> set = new HashSet<>();
        set.add("mama");
        set.add("papa");
        set.add("baba");
        set.add("dada");
        set.add("lala");
        set.add("oppo");
        set.add("lolo");
        set.add("lili");
        set.add("jjjj");
        set.add("wwww");
        set.add("qqqq");
        set.add("mmmm");

        System.out.println("===============");
        System.out.println("проход по сету");
        for (String e : set) {
            System.out.println(e);
        }
        System.out.println("===============");

        set.add("deadline");
        set.add("papa");
        set.add("lala");

        System.out.println("===============");
        System.out.println("проход по сету уникальность");
        for (String e : set) {
            System.out.println(e);
        }
        System.out.println("===============");
    }

    static void linkedSetStringExample() {
        Set<String> set = new LinkedHashSet<>();
        set.add("mama");
        set.add("papa");
        set.add("baba");
        set.add("dada");
        set.add("lala");
        set.add("oppo");
        set.add("lolo");
        set.add("lili");
        set.add("jjjj");
        set.add("wwww");
        set.add("qqqq");
        set.add("mmmm");

        System.out.println("===============");
        System.out.println("проход по сету");
        for (String e : set) {
            System.out.println(e);
        }
        System.out.println("===============");
    }

    static void treeSetStringExample() {
        Set<String> set = new TreeSet<>();
        set.add("mama");
        set.add("papa");
        set.add("baba");
        set.add("dada");
        set.add("lala");
        set.add("oppo");
        set.add("lolo");
        set.add("lili");
        set.add("jjjj");
        set.add("wwww");
        set.add("qqqq");
        set.add("mmmm");

        System.out.println("===============");
        System.out.println("проход по сету");
        for (String e : set) {
            System.out.println(e);
        }
        System.out.println("===============");
    }
}
