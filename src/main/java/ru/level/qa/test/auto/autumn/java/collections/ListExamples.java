package ru.level.qa.test.auto.autumn.java.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExamples {

    public static void main(String[] args) {
//        arrayListExample();
//        linkedListExample();
        listExample();
    }

    public static void arrayListExample() {
        ArrayList<String> list = new ArrayList<>();
        list.add("mama");
        list.add("papa");
        list.add("baba");
        list.add("dada");
        list.add("lala");
        list.add("oppo");
        list.add("lolo");
        list.add("lili");
        list.add("jjjj");
        list.add("wwww");
        list.add("qqqq");
        list.add("mmmm");

        System.out.println("===============");
        System.out.println("проход по списку");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("===============");

        for (String e : list) {
            System.out.println(e);
        }
        System.out.println("===============");
        System.out.println(list);
        System.out.println("===============");
        System.out.println("добавление элемента в спискок");
        list.add("last"); // добавится в конец
        System.out.println(list);
        list.add(5, "fifths");
        System.out.println(list);
        list.set(list.size() - 2, "qack");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }

    public static void linkedListExample() {
        LinkedList<String> list = new LinkedList<>();
        list.add("mama");
        list.add("papa");
        list.add("baba");
        list.add("dada");
        list.add("lala");
        list.add("oppo");
        list.add("lolo");
        list.add("lili");
        list.add("jjjj");
        list.add("wwww");
        list.add("qqqq");
        list.add("mmmm");

        System.out.println("===============");
        System.out.println("проход по списку");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("===============");

        for (String e : list) {
            System.out.println(e);
        }
        System.out.println("===============");
        System.out.println(list);
        System.out.println("===============");
        System.out.println("добавление элемента в спискок");
        list.add("last"); // добавится в конец
        System.out.println(list);
        list.add(5, "fifths");
        System.out.println(list);
        list.set(list.size() - 2, "qack");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }

    public static void listExample() {
//        List<String> list = new LinkedList<>();
        List<String> list = new ArrayList<>();

        list.add("mama");
        list.add("papa");
        list.add("baba");
        list.add("dada");
        list.add("lala");
        list.add("oppo");
        list.add("lolo");
        list.add("lili");
        list.add("jjjj");
        list.add("wwww");
        list.add("qqqq");
        list.add("mmmm");

        System.out.println("===============");
        System.out.println("проход по списку");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("===============");

        for (String e : list) {
            System.out.println(e);
        }
        System.out.println("===============");
        System.out.println(list);
        System.out.println("===============");
        System.out.println("добавление элемента в спискок");
        list.add("last"); // добавится в конец
        System.out.println(list);
        list.add(5, "fifths");
        System.out.println(list);
        list.set(list.size() - 2, "qack");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }

    public static List<String> getList(int number) {
        LinkedList<String> lst = new LinkedList<>();

        return lst;
    }
}
