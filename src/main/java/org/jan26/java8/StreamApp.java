package org.jan26.java8;

import java.util.Arrays;
import java.util.List;

public class StreamApp {
    public static void main(String[] args) {
        System.out.println("This is stream demo");

        String [] names = {"AkashKhot", "Akash02Shivpuri", "Akash03","Akash04"};

        List<String> namesList = Arrays.asList(names);

        System.out.println(namesList.stream().filter(name -> name.length() > 8).toList());
    }
}
