package org.jan26.java8;

import java.util.LinkedHashMap;

public class MapDemo {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(101, "A");
        map.put(102, "B");
        map.put(103, "C");
        map.put(104, "D");
        map.put(105, "E");

        map.entrySet().forEach(System.out::println);

    }
}
