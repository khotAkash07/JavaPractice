package org.jan26.core;

import java.util.Scanner;

public class Java_17_Demo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nameAndAge = """
                            Akash
                            Anil
                            Khot
                            2tf4
                            """;
        System.out.println(nameAndAge);
        //System.out.println(nameAndAge.repeat(4));

        System.out.println("Enter your choice:");
        int choice =  input.nextInt();
        String str = switch (choice){
            case 1 -> "Akash";
            case 2, 4 -> "Khot";
            case 3 -> "Anil";
            default -> null;
        };
        System.out.println(str);


    }

    static{
        int a = 10;
        System.out.println(a);
    }
}