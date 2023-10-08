package main.java;

import java.util.List;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("Hello");
        stringList.add("World!");

        for (String str : stringList) {
            System.out.println(str);
        }
    }
}
