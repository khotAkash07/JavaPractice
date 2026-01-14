package org.jan26.core;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysClassDemo {
    public static void main(String[] args) {
        int [] arr = {100, 120, 320, 40, 50,6,70,80,9,10};

        //toString
        System.out.println("\n------------- Original Array -------------");
        System.out.println(Arrays.toString(arr));

        //Sort
        Arrays.sort(arr);
        String str =  Arrays.toString(arr);
        System.out.println(str);
        System.out.println();
        int [] sortedArr = Arrays
                .stream(arr)
                .boxed()
                .sorted((a,b)->b-a)
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(Arrays.toString(sortedArr));
        System.out.println("\n------------- After Ascending Sorting -------------");
        System.out.println(Arrays.toString(arr));

        //Binary Search
        System.out.println("\n------------- Binary Search -------------");
        int value = Arrays.binarySearch(arr, 100);
        System.out.println(value);

    }
}
