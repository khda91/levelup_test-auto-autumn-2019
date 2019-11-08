package ru.level.qa.test.auto.autumn.java;

public class Loops {

    public static void main(String[] args) {

//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        for (int i = 0; i < array.length -1; i++) {
//            System.out.println(array[i]);
//            array[i +1] += 10;
//        }
//
//        System.out.println();
//        System.out.println();
//
//        for (int val : array) {
//            val += 10;
//            System.out.println(val);
//        }

        // Infinity loop
//        for ( ; ; ) {
//
//        }

        int numAs = 0;
        String str = "Mama mamba papa baba";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a') {
                continue;
            }
            numAs++;
            System.out.println("i: " + i);
        }
        System.out.println(numAs);
    }
}
