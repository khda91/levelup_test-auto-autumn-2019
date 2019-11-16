package ru.level.qa.test.auto.autumn.java.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionsExample {

    public static void main(String[] args) {
//        String str = null;
//        System.out.println(str.substring(0, 10));
        BufferedReader br =null;
        try {
//            br = new BufferedReader(new FileReader(
//                    ExceptionsExample.class.getClassLoader()
//                            .getResource("file.txt").getPath()));
            System.out.println("try");
            br = new BufferedReader(new FileReader("/Users/dmitry_khodakovsky/projects/LevelUp/test-auto-autumn-2019/src/main/resources/file1.txt"));
            System.out.println(br.readLine());
//        } catch (FileNotFoundException e) {
//            System.out.println("catch FNFE");
//            e.printStackTrace();
//        } catch (IOException e) {
//            System.out.println("catch IOE");
//            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception main");
            e.printStackTrace();
        } finally {
            System.out.println("finally");
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
