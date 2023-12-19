package com.knu.buga1chuk.others;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    private static final Logger LOG = LoggerFactory.getLogger(ArrayListDemo.class);

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        StringBuilder output = new StringBuilder();

        stringList.add("Hello");
        stringList.add("World!");

        for (String str : stringList) {
            output.append(str).append(" ");
        }
        LOG.info(String.valueOf(output));
    }
}
