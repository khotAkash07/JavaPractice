package org.jan26.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


record Employee(int id, String name, double salary,String dept) {}
public class RemoveDuplicateAndSort {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 1, 9, 10,2, 8, 13, 3, 4, 5, 6, 7, 4, 8, 9, 10);
        System.out.println(list.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
        int result =  list.stream().filter(x -> list.indexOf(x) == list.lastIndexOf(x)).findFirst().orElse(0);
        System.out.println(result);

       Stream.of(
                new Employee(1,"Akash",90000,"IT"),
                new Employee(2,"Abhi",190000,"Chemical"),
                new Employee(3,"Nilesh",70000,"IT"),
                new Employee(4,"Digvijay",50000,"IT"),
                new Employee(5,"Sonya",60000,"Chemical")
       ).collect(Collectors.groupingBy(Employee::dept)).entrySet().forEach(System.out::println);

       int secHigh = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
       System.out.println(secHigh);
    }
}
