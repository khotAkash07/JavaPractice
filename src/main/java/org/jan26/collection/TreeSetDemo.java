package org.jan26.collection;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>((a,b)->b-a);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(15);
        treeSet.add(12);
        treeSet.add(143);
        treeSet.add(1000);

        for(Integer i: treeSet){
            System.out.println(i+" ");
        }
    }
}
