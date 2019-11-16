package ru.level.qa.test.auto.autumn.java.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples {

    public static void main(String[] args) {
        System.out.println("Hash map");
        mapStringExamples();
        System.out.println("Linked map");
        linkedMapStringExamples();
        System.out.println("Tree map");
        treeMapStringExamples();
    }

    static void mapStringExamples() {
        Map<String, String> map = new HashMap<>();
        map.put("mama", "Lena");
        map.put("papa", "Vova");
        map.put("baba", "Nadya");
        map.put("dada", "Vitya");
        map.put("lala", "Olya");
        map.put("oppo", "Polina");
        map.put("lolo", "Alina");
        map.put("lili", "Katya");
        map.put("jjjj", "Vasya");
        map.put("wwww", "Petya");
        map.put("qqqq", "Kolya");
        map.put("mmmm", "Doma");

        System.out.println("==============");
        System.out.println(map);
        System.out.println("==============");

        map.put("dyaday", "Stepta");
        System.out.println(map);
        map.put("wwww", "Petya");
        map.put("qqqq", "Los");
        System.out.println(map);
        map.remove("baba");
        System.out.println(map);
    }

    static void linkedMapStringExamples() {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("mama", "Lena");
        map.put("papa", "Vova");
        map.put("baba", "Nadya");
        map.put("dada", "Vitya");
        map.put("lala", "Olya");
        map.put("oppo", "Polina");
        map.put("lolo", "Alina");
        map.put("lili", "Katya");
        map.put("jjjj", "Vasya");
        map.put("wwww", "Petya");
        map.put("qqqq", "Kolya");
        map.put("mmmm", "Doma");

        System.out.println("==============");
        System.out.println(map);
        System.out.println("==============");

        map.put("dyaday", "Stepta");
        System.out.println(map);
        map.put("wwww", "Petya");
        map.put("qqqq", "Los");
        System.out.println(map);
        map.remove("baba");
        System.out.println(map);
    }

    static void treeMapStringExamples() {
        Map<String, String> map = new TreeMap<>();
        map.put("mama", "Lena");
        map.put("papa", "Vova");
        map.put("baba", "Nadya");
        map.put("dada", "Vitya");
        map.put("lala", "Olya");
        map.put("oppo", "Polina");
        map.put("lolo", "Alina");
        map.put("lili", "Katya");
        map.put("jjjj", "Vasya");
        map.put("wwww", "Petya");
        map.put("qqqq", "Kolya");
        map.put("mmmm", "Doma");

        System.out.println("==============");
        System.out.println(map);
        System.out.println("==============");

        map.put("dyaday", "Stepta");
        System.out.println(map);
        map.put("wwww", "Petya");
        map.put("qqqq", "Los");
        System.out.println(map);
        map.remove("baba");
        System.out.println(map);
    }


    static void printMapByKeySet(Map<String, String> map) {
        System.out.println("========");
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
        System.out.println("========");
    }

    static void printMapByEntrySet(Map<String, String> map) {
        System.out.println("========");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println("========");
    }
}
