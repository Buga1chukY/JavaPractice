package com.knu.buga1chuk;

import java.util.ArrayList;
import java.util.List;

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
